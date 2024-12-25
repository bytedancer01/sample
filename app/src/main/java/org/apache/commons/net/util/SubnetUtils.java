package org.apache.commons.net.util;

import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/util/SubnetUtils.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/util/SubnetUtils.class */
public class SubnetUtils {
    private static final int NBITS = 32;
    private static final String IP_ADDRESS = "(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})";
    private static final Pattern addressPattern = Pattern.compile(IP_ADDRESS);
    private static final String SLASH_FORMAT = "(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})/(\\d{1,3})";
    private static final Pattern cidrPattern = Pattern.compile(SLASH_FORMAT);
    private int netmask = 0;
    private int address = 0;
    private int network = 0;
    private int broadcast = 0;
    private boolean inclusiveHostCount = false;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/apache/commons/net/util/SubnetUtils$SubnetInfo.class
     */
    /* loaded from: combined.jar:classes2.jar:org/apache/commons/net/util/SubnetUtils$SubnetInfo.class */
    public final class SubnetInfo {
        private static final long UNSIGNED_INT_MASK = 4294967295L;
        public final SubnetUtils this$0;

        private SubnetInfo(SubnetUtils subnetUtils) {
            this.this$0 = subnetUtils;
        }

        private int address() {
            return this.this$0.address;
        }

        private int broadcast() {
            return this.this$0.broadcast;
        }

        private long broadcastLong() {
            return this.this$0.broadcast & UNSIGNED_INT_MASK;
        }

        private int high() {
            return this.this$0.isInclusiveHostCount() ? broadcast() : broadcastLong() - networkLong() > 1 ? broadcast() - 1 : 0;
        }

        private int low() {
            return this.this$0.isInclusiveHostCount() ? network() : broadcastLong() - networkLong() > 1 ? network() + 1 : 0;
        }

        private int netmask() {
            return this.this$0.netmask;
        }

        private int network() {
            return this.this$0.network;
        }

        private long networkLong() {
            return this.this$0.network & UNSIGNED_INT_MASK;
        }

        public int asInteger(String str) {
            return this.this$0.toInteger(str);
        }

        public String getAddress() {
            SubnetUtils subnetUtils = this.this$0;
            return subnetUtils.format(subnetUtils.toArray(address()));
        }

        @Deprecated
        public int getAddressCount() {
            long addressCountLong = getAddressCountLong();
            if (addressCountLong <= 2147483647L) {
                return (int) addressCountLong;
            }
            throw new RuntimeException("Count is larger than an integer: " + addressCountLong);
        }

        public long getAddressCountLong() {
            long broadcastLong = (broadcastLong() - networkLong()) + (this.this$0.isInclusiveHostCount() ? 1 : -1);
            long j10 = broadcastLong;
            if (broadcastLong < 0) {
                j10 = 0;
            }
            return j10;
        }

        public String[] getAllAddresses() {
            int addressCount = getAddressCount();
            String[] strArr = new String[addressCount];
            if (addressCount == 0) {
                return strArr;
            }
            int low = low();
            int i10 = 0;
            while (low <= high()) {
                SubnetUtils subnetUtils = this.this$0;
                strArr[i10] = subnetUtils.format(subnetUtils.toArray(low));
                low++;
                i10++;
            }
            return strArr;
        }

        public String getBroadcastAddress() {
            SubnetUtils subnetUtils = this.this$0;
            return subnetUtils.format(subnetUtils.toArray(broadcast()));
        }

        public String getCidrSignature() {
            SubnetUtils subnetUtils = this.this$0;
            String format = subnetUtils.format(subnetUtils.toArray(address()));
            SubnetUtils subnetUtils2 = this.this$0;
            return subnetUtils.toCidrNotation(format, subnetUtils2.format(subnetUtils2.toArray(netmask())));
        }

        public String getHighAddress() {
            SubnetUtils subnetUtils = this.this$0;
            return subnetUtils.format(subnetUtils.toArray(high()));
        }

        public String getLowAddress() {
            SubnetUtils subnetUtils = this.this$0;
            return subnetUtils.format(subnetUtils.toArray(low()));
        }

        public String getNetmask() {
            SubnetUtils subnetUtils = this.this$0;
            return subnetUtils.format(subnetUtils.toArray(netmask()));
        }

        public String getNetworkAddress() {
            SubnetUtils subnetUtils = this.this$0;
            return subnetUtils.format(subnetUtils.toArray(network()));
        }

        public boolean isInRange(int i10) {
            long j10 = i10 & UNSIGNED_INT_MASK;
            return j10 >= (((long) low()) & UNSIGNED_INT_MASK) && j10 <= (UNSIGNED_INT_MASK & ((long) high()));
        }

        public boolean isInRange(String str) {
            return isInRange(this.this$0.toInteger(str));
        }

        public String toString() {
            return "CIDR Signature:\t[" + getCidrSignature() + "] Netmask: [" + getNetmask() + "]\nNetwork:\t[" + getNetworkAddress() + "]\nBroadcast:\t[" + getBroadcastAddress() + "]\nFirst Address:\t[" + getLowAddress() + "]\nLast Address:\t[" + getHighAddress() + "]\n# Addresses:\t[" + getAddressCount() + "]\n";
        }
    }

    public SubnetUtils(String str) {
        calculate(str);
    }

    public SubnetUtils(String str, String str2) {
        calculate(toCidrNotation(str, str2));
    }

    private void calculate(String str) {
        Matcher matcher = cidrPattern.matcher(str);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("Could not parse [" + str + "]");
        }
        this.address = matchAddress(matcher);
        int rangeCheck = rangeCheck(Integer.parseInt(matcher.group(5)), 0, 32);
        for (int i10 = 0; i10 < rangeCheck; i10++) {
            this.netmask |= 1 << (31 - i10);
        }
        int i11 = this.address;
        int i12 = this.netmask;
        int i13 = i11 & i12;
        this.network = i13;
        this.broadcast = i13 | (i12 ^ (-1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String format(int[] iArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            sb2.append(iArr[i10]);
            if (i10 != iArr.length - 1) {
                sb2.append(InstructionFileId.DOT);
            }
        }
        return sb2.toString();
    }

    private int matchAddress(Matcher matcher) {
        int i10 = 0;
        for (int i11 = 1; i11 <= 4; i11++) {
            i10 |= (rangeCheck(Integer.parseInt(matcher.group(i11)), 0, 255) & 255) << ((4 - i11) * 8);
        }
        return i10;
    }

    private int rangeCheck(int i10, int i11, int i12) {
        if (i10 >= i11 && i10 <= i12) {
            return i10;
        }
        throw new IllegalArgumentException("Value [" + i10 + "] not in range [" + i11 + "," + i12 + "]");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] toArray(int i10) {
        int[] iArr = new int[4];
        for (int i11 = 3; i11 >= 0; i11--) {
            iArr[i11] = iArr[i11] | ((i10 >>> ((3 - i11) * 8)) & 255);
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String toCidrNotation(String str, String str2) {
        return str + "/" + pop(toInteger(str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int toInteger(String str) {
        Matcher matcher = addressPattern.matcher(str);
        if (matcher.matches()) {
            return matchAddress(matcher);
        }
        throw new IllegalArgumentException("Could not parse [" + str + "]");
    }

    public final SubnetInfo getInfo() {
        return new SubnetInfo();
    }

    public boolean isInclusiveHostCount() {
        return this.inclusiveHostCount;
    }

    public int pop(int i10) {
        int i11 = i10 - ((i10 >>> 1) & 1431655765);
        int i12 = (i11 & 858993459) + ((i11 >>> 2) & 858993459);
        int i13 = 252645135 & (i12 + (i12 >>> 4));
        int i14 = i13 + (i13 >>> 8);
        return (i14 + (i14 >>> 16)) & 63;
    }

    public void setInclusiveHostCount(boolean z10) {
        this.inclusiveHostCount = z10;
    }
}

package org.pcap4j.util;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import org.apache.commons.net.ftp.FTPReply;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/util/ByteArrays.class */
public final class ByteArrays {
    public static final int BYTE_SIZE_IN_BITS = 8;
    public static final int BYTE_SIZE_IN_BYTES = 1;
    public static final int INET4_ADDRESS_SIZE_IN_BYTES = 4;
    public static final int INET6_ADDRESS_SIZE_IN_BYTES = 16;
    public static final int INT_SIZE_IN_BYTES = 4;
    public static final int LONG_SIZE_IN_BYTES = 8;
    public static final int SHORT_SIZE_IN_BYTES = 2;
    private static final Pattern NO_SEPARATOR_HEX_STRING_PATTERN = Pattern.compile("\\A([0-9a-fA-F][0-9a-fA-F])+\\z");
    private static final char[] HEX_CHARS = "0123456789abcdef".toCharArray();
    private static final int[] CRC32C_TABLE = $d2j$hex$a8b09974$decode_I("0000000003836bf2f7703be1f4f350131f979ac71c14f135e8e7a126eb64cad4cf58d98accdbb2783828e26b3bab8999d0cf434dd34c28bf27bf78ac243c135e6fc75e106c4435e298b765f19b340e037050c4d773d3af258720ff3684a394c4a09f879aa31cec6857efbc7b546cd789bf081d5dbc8b76af487826bc4bfb4d4ede8ebd20dd0dd6d229fe86c12a7ded33c11927e7c29a4c1536691c0635ea77f411d664aa12550f58e6a65f4be52534b90e41fe6d0dc2959ff931c58cfab2ae7eb149e330b2ca88c24639d8d145bab323aede79f7ad5d120559ae42165a2d29e47e113aba7d9251488961015b8ae26aa96186a07d6205cb8f96f69b9c9575f06ebc1d7b41bf9e10b34b6d40a048ee2b52a38ae186a0098a7454fada675779b1957345a2cb70c6c9398435992a87b6f2d86cd2380c6f5153fe9ba203ed9821681fd3da2551d0594ea324aa1eb027297542cc4dbf96cfced4643b3d847738beef851c82fcdb1f019729ebf2c73ae871acc80315661c00960deef4655dfdf7e6360f6293c6616110ad9395e3fd80966096727d045ca67e8737548a74674789f70cb5adcb1febae4874195abb240a59384ff8b25c852cb1dfeede452cbecd46afd53f0d5498710ed7f383fa24a390f9a7c86212c302b611406944e5b33957e63052a5c20c41fbc18f2a09357c7a1a36ff11e8dd9bdb3cde18b0ce2aebe0dd29688b2f783bf6827bb89d708f4bcd638cc8a69167ac6c45642f07b790dc57a4935f3c56b7632f08b4e044fa401314e943907f1ba8f4b5cfab77de3d5f848e2e5c07e5dc17fca892147fc360e08c9373e30ff881086b32550be859a7ff1b09b4fc986246d8a47118db271aea2fd44af92c57210bc733ebdfc4b0802d3043d03e33c0bbcca6b54ba2a536205051c5704352461bb1b922d165baa1ba974e52ea844dd1817669ed92286a6ef9da9e9da9c99d1ec23b767a08ef75f9631d810a330e828958fcc97215b2caf17e403e022e533d8145a1d6e58f75d566e4872195b4942216df66062acc3805a9a7caf15af7d9f2d99c2b19bd56ff1a3e3d0deecd6d1eed4e06ecc4268dc3c7a5e6313356b62230d5ddd0dbb11704d8327cf62cc12ce52f4247170b7e544908fd3fbbfc0e6fa8ff8d045a14e9ce8e176aa57ce399f56fe01a9e9dabe1d3d3a862b8215c91e8325f1283c0b4764914b7f522e6430672f54085190764b90a59673a61ab93c931b8904a5a4a7b2e909e78adfb6c8c5eab7f8fddc08d1aa830e3192b5b11edd80b02ee5b60f0053faa2406bcc1d6f24f91c5f1ccfa37d5f0e969d673829b2280d2882103b97aca6773aec9e4185c3d17484f3e9423bd756f6ef376ec0501821f5512819c3ee06af8f434697b9fc69d88cfd59e0ba427ba37b779b9b4dc8b4d478c984ec4e76aa5a02dbea623464c52d0165f51537dad");

    private ByteArrays() {
        throw new AssertionError();
    }

    public static int calcAdler32Checksum(byte[] bArr) {
        Adler32 adler32 = new Adler32();
        adler32.update(bArr);
        return (int) adler32.getValue();
    }

    public static short calcChecksum(byte[] bArr) {
        long j10 = 0;
        for (int i10 = 1; i10 < bArr.length; i10 += 2) {
            j10 += getShort(bArr, i10 - 1) & 65535;
        }
        long j11 = j10;
        if (bArr.length % 2 != 0) {
            j11 = j10 + ((bArr[bArr.length - 1] << 8) & 65535);
        }
        while ((j11 >> 16) != 0) {
            j11 = (j11 >>> 16) + (j11 & 65535);
        }
        return (short) (j11 ^ (-1));
    }

    public static int calcCrc32Checksum(byte[] bArr) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        return (int) crc32.getValue();
    }

    public static int calcCrc32cChecksum(byte[] bArr) {
        int i10 = -1;
        for (byte b10 : bArr) {
            i10 = ((i10 >>> 8) ^ CRC32C_TABLE[(b10 ^ i10) & 255]) == true ? 1 : 0;
        }
        return i10 ^ (-1);
    }

    public static byte[] clone(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static byte[] concatenate(List<byte[]> list) {
        int i10;
        Iterator<byte[]> it = list.iterator();
        int i11 = 0;
        while (true) {
            i10 = i11;
            if (!it.hasNext()) {
                break;
            }
            i11 = i10 + it.next().length;
        }
        byte[] bArr = new byte[i10];
        Iterator<byte[]> it2 = list.iterator();
        int i12 = 0;
        while (true) {
            int i13 = i12;
            if (!it2.hasNext()) {
                return bArr;
            }
            byte[] next = it2.next();
            System.arraycopy(next, 0, bArr, i13, next.length);
            i12 = i13 + next.length;
        }
    }

    public static byte[] concatenate(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static byte getByte(byte[] bArr, int i10) {
        validateBounds(bArr, i10, 1);
        return bArr[i10];
    }

    public static Inet4Address getInet4Address(byte[] bArr, int i10) {
        return getInet4Address(bArr, i10, ByteOrder.BIG_ENDIAN);
    }

    public static Inet4Address getInet4Address(byte[] bArr, int i10, ByteOrder byteOrder) {
        validateBounds(bArr, i10, 4);
        if (byteOrder != null) {
            try {
                return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? (Inet4Address) InetAddress.getByAddress(reverse(getSubArray(bArr, i10, 4))) : (Inet4Address) InetAddress.getByAddress(getSubArray(bArr, i10, 4));
            } catch (UnknownHostException e10) {
                throw new AssertionError(e10);
            }
        }
        throw new NullPointerException(" bo: " + byteOrder);
    }

    public static Inet6Address getInet6Address(byte[] bArr, int i10) {
        return getInet6Address(bArr, i10, ByteOrder.BIG_ENDIAN);
    }

    public static Inet6Address getInet6Address(byte[] bArr, int i10, ByteOrder byteOrder) {
        validateBounds(bArr, i10, 16);
        if (byteOrder != null) {
            try {
                return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? Inet6Address.getByAddress((String) null, reverse(getSubArray(bArr, i10, 16)), -1) : Inet6Address.getByAddress((String) null, getSubArray(bArr, i10, 16), -1);
            } catch (UnknownHostException e10) {
                throw new AssertionError(e10);
            }
        }
        throw new NullPointerException(" bo: " + byteOrder);
    }

    public static int getInt(byte[] bArr, int i10) {
        return getInt(bArr, i10, ByteOrder.BIG_ENDIAN);
    }

    public static int getInt(byte[] bArr, int i10, int i11) {
        return getInt(bArr, i10, i11, ByteOrder.BIG_ENDIAN);
    }

    public static int getInt(byte[] bArr, int i10, int i11, ByteOrder byteOrder) {
        int i12;
        validateBounds(bArr, i10, i11);
        if (i11 > 4) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("length must be equal or less than ");
            sb2.append(4);
            sb2.append(", but is: ");
            sb2.append(i11);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (byteOrder == null) {
            throw new NullPointerException(" bo: " + byteOrder);
        }
        int i13 = 0;
        if (!byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
            int i14 = i10;
            while (true) {
                i12 = i13;
                if (i14 >= i10 + i11) {
                    break;
                }
                i13 = (i13 << 8) | (bArr[i14] & 255);
                i14++;
            }
        } else {
            int i15 = (i11 + i10) - 1;
            int i16 = 0;
            while (true) {
                i12 = i16;
                if (i15 < i10) {
                    break;
                }
                i16 = (bArr[i15] & 255) | (i16 << 8);
                i15--;
            }
        }
        return i12;
    }

    public static int getInt(byte[] bArr, int i10, ByteOrder byteOrder) {
        int i11;
        byte b10;
        validateBounds(bArr, i10, 4);
        if (byteOrder == null) {
            throw new NullPointerException(" bo: " + byteOrder);
        }
        if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
            i11 = (bArr[i10 + 3] << 24) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 1] & 255) << 8);
            b10 = bArr[i10];
        } else {
            i11 = (bArr[i10] << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
            b10 = bArr[i10 + 3];
        }
        return (b10 & 255) | i11;
    }

    public static LinkLayerAddress getLinkLayerAddress(byte[] bArr, int i10, int i11) {
        return getLinkLayerAddress(bArr, i10, i11, ByteOrder.BIG_ENDIAN);
    }

    public static LinkLayerAddress getLinkLayerAddress(byte[] bArr, int i10, int i11, ByteOrder byteOrder) {
        validateBounds(bArr, i10, i11);
        if (byteOrder != null) {
            boolean equals = byteOrder.equals(ByteOrder.LITTLE_ENDIAN);
            byte[] subArray = getSubArray(bArr, i10, i11);
            return equals ? LinkLayerAddress.getByAddress(reverse(subArray)) : LinkLayerAddress.getByAddress(subArray);
        }
        throw new NullPointerException(" bo: " + byteOrder);
    }

    public static long getLong(byte[] bArr, int i10) {
        return getLong(bArr, i10, ByteOrder.BIG_ENDIAN);
    }

    public static long getLong(byte[] bArr, int i10, ByteOrder byteOrder) {
        long j10;
        byte b10;
        validateBounds(bArr, i10, 8);
        if (byteOrder == null) {
            throw new NullPointerException(" bo: " + byteOrder);
        }
        if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
            j10 = ((bArr[i10 + 6] & 255) << 48) | (bArr[i10 + 7] << 56) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 1] & 255) << 8);
            b10 = bArr[i10];
        } else {
            j10 = ((bArr[i10 + 1] & 255) << 48) | (bArr[i10] << 56) | ((bArr[i10 + 2] & 255) << 40) | ((bArr[i10 + 3] & 255) << 32) | ((bArr[i10 + 4] & 255) << 24) | ((bArr[i10 + 5] & 255) << 16) | ((bArr[i10 + 6] & 255) << 8);
            b10 = bArr[i10 + 7];
        }
        return (b10 & 255) | j10;
    }

    public static MacAddress getMacAddress(byte[] bArr, int i10) {
        return getMacAddress(bArr, i10, ByteOrder.BIG_ENDIAN);
    }

    public static MacAddress getMacAddress(byte[] bArr, int i10, ByteOrder byteOrder) {
        validateBounds(bArr, i10, 6);
        if (byteOrder != null) {
            boolean equals = byteOrder.equals(ByteOrder.LITTLE_ENDIAN);
            byte[] subArray = getSubArray(bArr, i10, 6);
            return equals ? MacAddress.getByAddress(reverse(subArray)) : MacAddress.getByAddress(subArray);
        }
        throw new NullPointerException(" bo: " + byteOrder);
    }

    public static short getShort(byte[] bArr, int i10) {
        return getShort(bArr, i10, ByteOrder.BIG_ENDIAN);
    }

    public static short getShort(byte[] bArr, int i10, ByteOrder byteOrder) {
        byte b10;
        int i11;
        validateBounds(bArr, i10, 2);
        if (byteOrder == null) {
            throw new NullPointerException(" bo: " + byteOrder);
        }
        if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
            int i12 = bArr[i10 + 1] << 8;
            byte b11 = bArr[i10];
            i11 = i12;
            b10 = b11;
        } else {
            int i13 = bArr[i10] << 8;
            b10 = bArr[i10 + 1];
            i11 = i13;
        }
        return (short) ((b10 & 255) | i11);
    }

    public static byte[] getSubArray(byte[] bArr, int i10) {
        return getSubArray(bArr, i10, bArr.length - i10);
    }

    public static byte[] getSubArray(byte[] bArr, int i10, int i11) {
        validateBounds(bArr, i10, i11);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return bArr2;
    }

    public static byte[] parseByteArray(String str, String str2) {
        if (str == null || str2 == null) {
            throw new NullPointerException("hexString: " + str + " separator: " + str2);
        }
        String str3 = str;
        if (str.startsWith("0x")) {
            str3 = str.substring(2);
        }
        if (str2.length() == 0) {
            Pattern pattern = NO_SEPARATOR_HEX_STRING_PATTERN;
            if (!pattern.matcher(str3).matches()) {
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append("invalid hex string(");
                sb2.append(str3);
                sb2.append("), not match pattern(");
                sb2.append(pattern.pattern());
                sb2.append(")");
                throw new IllegalArgumentException(sb2.toString());
            }
        } else {
            StringBuilder sb3 = new StringBuilder(60);
            sb3.append("\\A[0-9a-fA-F][0-9a-fA-F](");
            sb3.append(Pattern.quote(str2));
            sb3.append("[0-9a-fA-F][0-9a-fA-F])*\\z");
            String sb4 = sb3.toString();
            if (!Pattern.compile(sb4).matcher(str3).matches()) {
                StringBuilder sb5 = new StringBuilder(FTPReply.FILE_STATUS_OK);
                sb5.append("invalid hex string(");
                sb5.append(str3);
                sb5.append("), not match pattern(");
                sb5.append(sb4);
                sb5.append(")");
                throw new IllegalArgumentException(sb5.toString());
            }
            str3 = str3.replaceAll(Pattern.quote(str2), "");
        }
        int length = str3.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) Integer.parseInt(str3.substring(i11, i11 + 2), 16);
        }
        return bArr;
    }

    public static byte[] parseInet4Address(String str) {
        String[] split = str.split("\\.", 4);
        if (split.length != 4) {
            throw new IllegalArgumentException("Couldn't get an Inet4Address from " + str);
        }
        byte[] bArr = new byte[4];
        for (int i10 = 0; i10 < 4; i10++) {
            try {
                int parseInt = Integer.parseInt(split[i10]);
                if (parseInt < 0 || parseInt > 255) {
                    throw new IllegalArgumentException("Couldn't get an Inet4Address from " + str);
                }
                bArr[i10] = (byte) parseInt;
            } catch (NumberFormatException e10) {
                throw new IllegalArgumentException("Couldn't get an Inet4Address from " + str);
            }
        }
        return bArr;
    }

    public static byte[] reverse(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr2[i10] = bArr[(bArr.length - i10) - 1];
        }
        return bArr2;
    }

    public static byte[] toByteArray(byte b10) {
        return new byte[]{b10};
    }

    public static byte[] toByteArray(int i10) {
        return toByteArray(i10, ByteOrder.BIG_ENDIAN);
    }

    public static byte[] toByteArray(int i10, int i11) {
        return toByteArray(i10, i11, ByteOrder.BIG_ENDIAN);
    }

    public static byte[] toByteArray(int i10, int i11, ByteOrder byteOrder) {
        if (i11 > 4) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("length must be equal or less than ");
            sb2.append(4);
            sb2.append(", but is: ");
            sb2.append(i11);
            throw new IllegalArgumentException(sb2.toString());
        }
        byte[] bArr = new byte[i11];
        if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
            for (int i12 = 0; i12 < i11; i12++) {
                bArr[(i11 - i12) - 1] = (byte) (i10 >> (i12 * 8));
            }
        } else {
            for (int i13 = 0; i13 < i11; i13++) {
                bArr[i13] = (byte) (i10 >> (i13 * 8));
            }
        }
        return bArr;
    }

    public static byte[] toByteArray(int i10, ByteOrder byteOrder) {
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? new byte[]{(byte) i10, (byte) (i10 >> 8), (byte) (i10 >> 16), (byte) (i10 >> 24)} : new byte[]{(byte) (i10 >> 24), (byte) (i10 >> 16), (byte) (i10 >> 8), (byte) i10};
    }

    public static byte[] toByteArray(long j10) {
        return toByteArray(j10, ByteOrder.BIG_ENDIAN);
    }

    public static byte[] toByteArray(long j10, ByteOrder byteOrder) {
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? new byte[]{(byte) j10, (byte) (j10 >> 8), (byte) (j10 >> 16), (byte) (j10 >> 24), (byte) (j10 >> 32), (byte) (j10 >> 40), (byte) (j10 >> 48), (byte) (j10 >> 56)} : new byte[]{(byte) (j10 >> 56), (byte) (j10 >> 48), (byte) (j10 >> 40), (byte) (j10 >> 32), (byte) (j10 >> 24), (byte) (j10 >> 16), (byte) (j10 >> 8), (byte) j10};
    }

    public static byte[] toByteArray(InetAddress inetAddress) {
        return toByteArray(inetAddress, ByteOrder.BIG_ENDIAN);
    }

    public static byte[] toByteArray(InetAddress inetAddress, ByteOrder byteOrder) {
        boolean equals = byteOrder.equals(ByteOrder.LITTLE_ENDIAN);
        byte[] address = inetAddress.getAddress();
        byte[] bArr = address;
        if (equals) {
            bArr = reverse(address);
        }
        return bArr;
    }

    public static byte[] toByteArray(LinkLayerAddress linkLayerAddress) {
        return toByteArray(linkLayerAddress, ByteOrder.BIG_ENDIAN);
    }

    public static byte[] toByteArray(LinkLayerAddress linkLayerAddress, ByteOrder byteOrder) {
        boolean equals = byteOrder.equals(ByteOrder.LITTLE_ENDIAN);
        byte[] address = linkLayerAddress.getAddress();
        byte[] bArr = address;
        if (equals) {
            bArr = reverse(address);
        }
        return bArr;
    }

    public static byte[] toByteArray(MacAddress macAddress) {
        return toByteArray(macAddress, ByteOrder.BIG_ENDIAN);
    }

    public static byte[] toByteArray(MacAddress macAddress, ByteOrder byteOrder) {
        boolean equals = byteOrder.equals(ByteOrder.LITTLE_ENDIAN);
        byte[] address = macAddress.getAddress();
        byte[] bArr = address;
        if (equals) {
            bArr = reverse(address);
        }
        return bArr;
    }

    public static byte[] toByteArray(short s10) {
        return toByteArray(s10, ByteOrder.BIG_ENDIAN);
    }

    public static byte[] toByteArray(short s10, ByteOrder byteOrder) {
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? new byte[]{(byte) s10, (byte) (s10 >> 8)} : new byte[]{(byte) (s10 >> 8), (byte) s10};
    }

    public static String toHexString(byte b10, String str) {
        return toHexString(toByteArray(b10), str);
    }

    public static String toHexString(int i10, String str) {
        return toHexString(i10, str, ByteOrder.BIG_ENDIAN);
    }

    public static String toHexString(int i10, String str, ByteOrder byteOrder) {
        return toHexString(toByteArray(i10, byteOrder), str);
    }

    public static String toHexString(long j10, String str) {
        return toHexString(j10, str, ByteOrder.BIG_ENDIAN);
    }

    public static String toHexString(long j10, String str, ByteOrder byteOrder) {
        return toHexString(toByteArray(j10, byteOrder), str);
    }

    public static String toHexString(short s10, String str) {
        return toHexString(s10, str, ByteOrder.BIG_ENDIAN);
    }

    public static String toHexString(short s10, String str, ByteOrder byteOrder) {
        return toHexString(toByteArray(s10, byteOrder), str);
    }

    public static String toHexString(byte[] bArr, String str) {
        return toHexString(bArr, str, 0, bArr.length);
    }

    public static String toHexString(byte[] bArr, String str, int i10, int i11) {
        char[] cArr;
        validateBounds(bArr, i10, i11);
        int i12 = 0;
        if (str.length() == 0) {
            char[] cArr2 = new char[i11 * 2];
            int i13 = 0;
            while (true) {
                cArr = cArr2;
                if (i12 >= i11) {
                    break;
                }
                int i14 = bArr[i10 + i12] & 255;
                char[] cArr3 = HEX_CHARS;
                cArr2[i13] = cArr3[i14 >>> 4];
                int i15 = i13 + 1;
                cArr2[i15] = cArr3[i14 & 15];
                i13 = i15 + 1;
                i12++;
            }
        } else {
            char[] charArray = str.toCharArray();
            int length = charArray.length;
            int i16 = i11 - 1;
            cArr = new char[(i11 * 2) + (length * i16)];
            int i17 = 0;
            int i18 = 0;
            while (i17 < i16) {
                int i19 = bArr[i10 + i17] & 255;
                char[] cArr4 = HEX_CHARS;
                cArr[i18] = cArr4[i19 >>> 4];
                int i20 = i18 + 1;
                cArr[i20] = cArr4[i19 & 15];
                i18 = i20 + 1;
                for (char c10 : charArray) {
                    cArr[i18] = c10;
                    i18++;
                }
                i17++;
            }
            int i21 = bArr[i10 + i17] & 255;
            char[] cArr5 = HEX_CHARS;
            cArr[i18] = cArr5[i21 >>> 4];
            cArr[i18 + 1] = cArr5[i21 & 15];
        }
        return new String(cArr);
    }

    public static void validateBounds(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            throw new NullPointerException("arr must not be null.");
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("arr is empty.");
        }
        if (i11 == 0) {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append("length is zero. offset: ");
            sb2.append(i10);
            sb2.append(", arr: ");
            sb2.append(toHexString(bArr, ""));
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i10 < 0 || i11 < 0 || i10 + i11 > bArr.length) {
            StringBuilder sb3 = new StringBuilder(100);
            sb3.append("arr.length: ");
            sb3.append(bArr.length);
            sb3.append(", offset: ");
            sb3.append(i10);
            sb3.append(", len: ");
            sb3.append(i11);
            sb3.append(", arr: ");
            sb3.append(toHexString(bArr, ""));
            throw new ArrayIndexOutOfBoundsException(sb3.toString());
        }
    }

    public static byte[] xor(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("arr1 must not be null.");
        }
        if (bArr2 == null) {
            throw new NullPointerException("arr2 must not be null.");
        }
        if (bArr.length != bArr2.length) {
            throw new IllegalArgumentException("arr1.length must equal to arr2.length.");
        }
        byte[] bArr3 = new byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr3[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
        return bArr3;
    }

    private static long[] $d2j$hex$a8b09974$decode_J(String src) {
        byte[] d10 = $d2j$hex$a8b09974$decode_B(src);
        ByteBuffer b10 = ByteBuffer.wrap(d10);
        b10.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s10 = b10.asLongBuffer();
        long[] data = new long[d10.length / 8];
        s10.get(data);
        return data;
    }

    private static int[] $d2j$hex$a8b09974$decode_I(String src) {
        byte[] d10 = $d2j$hex$a8b09974$decode_B(src);
        ByteBuffer b10 = ByteBuffer.wrap(d10);
        b10.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s10 = b10.asIntBuffer();
        int[] data = new int[d10.length / 4];
        s10.get(data);
        return data;
    }

    private static short[] $d2j$hex$a8b09974$decode_S(String src) {
        byte[] d10 = $d2j$hex$a8b09974$decode_B(src);
        ByteBuffer b10 = ByteBuffer.wrap(d10);
        b10.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s10 = b10.asShortBuffer();
        short[] data = new short[d10.length / 2];
        s10.get(data);
        return data;
    }

    private static byte[] $d2j$hex$a8b09974$decode_B(String src) {
        int hh2;
        int i10;
        char[] d10 = src.toCharArray();
        byte[] ret = new byte[src.length() / 2];
        for (int i11 = 0; i11 < ret.length; i11++) {
            char h10 = d10[2 * i11];
            char l10 = d10[(2 * i11) + 1];
            if (h10 >= '0' && h10 <= '9') {
                hh2 = h10 - '0';
            } else if (h10 >= 'a' && h10 <= 'f') {
                hh2 = (h10 - 'a') + 10;
            } else if (h10 >= 'A' && h10 <= 'F') {
                hh2 = (h10 - 'A') + 10;
            } else {
                throw new RuntimeException();
            }
            if (l10 >= '0' && l10 <= '9') {
                i10 = l10 - '0';
            } else if (l10 >= 'a' && l10 <= 'f') {
                i10 = (l10 - 'a') + 10;
            } else if (l10 >= 'A' && l10 <= 'F') {
                i10 = (l10 - 'A') + 10;
            } else {
                throw new RuntimeException();
            }
            int ll = i10;
            ret[i11] = (byte) ((hh2 << 4) | ll);
        }
        return ret;
    }
}

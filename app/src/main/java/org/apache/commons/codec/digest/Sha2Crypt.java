package org.apache.commons.codec.digest;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.codec.Charsets;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/digest/Sha2Crypt.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/digest/Sha2Crypt.class */
public class Sha2Crypt {
    private static final int ROUNDS_DEFAULT = 5000;
    private static final int ROUNDS_MAX = 999999999;
    private static final int ROUNDS_MIN = 1000;
    private static final String ROUNDS_PREFIX = "rounds=";
    private static final Pattern SALT_PATTERN = Pattern.compile("^\\$([56])\\$(rounds=(\\d+)\\$)?([\\.\\/a-zA-Z0-9]{1,16}).*");
    private static final int SHA256_BLOCKSIZE = 32;
    public static final String SHA256_PREFIX = "$5$";
    private static final int SHA512_BLOCKSIZE = 64;
    public static final String SHA512_PREFIX = "$6$";

    public static String sha256Crypt(byte[] bArr) {
        return sha256Crypt(bArr, null);
    }

    public static String sha256Crypt(byte[] bArr, String str) {
        String str2 = str;
        if (str == null) {
            str2 = SHA256_PREFIX + B64.getRandomSalt(8);
        }
        return sha2Crypt(bArr, str2, SHA256_PREFIX, 32, MessageDigestAlgorithms.SHA_256);
    }

    private static String sha2Crypt(byte[] bArr, String str, String str2, int i10, String str3) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int length = bArr.length;
        if (str == null) {
            throw new IllegalArgumentException("Salt must not be null");
        }
        Matcher matcher = SALT_PATTERN.matcher(str);
        if (matcher == null || !matcher.find()) {
            throw new IllegalArgumentException("Invalid salt value: " + str);
        }
        if (matcher.group(3) != null) {
            i11 = Math.max(1000, Math.min(ROUNDS_MAX, Integer.parseInt(matcher.group(3))));
            z10 = true;
        } else {
            i11 = 5000;
            z10 = false;
        }
        String group = matcher.group(4);
        byte[] bytes = group.getBytes(Charsets.UTF_8);
        int length2 = bytes.length;
        MessageDigest digest = DigestUtils.getDigest(str3);
        digest.update(bArr);
        digest.update(bytes);
        MessageDigest digest2 = DigestUtils.getDigest(str3);
        digest2.update(bArr);
        digest2.update(bytes);
        digest2.update(bArr);
        byte[] digest3 = digest2.digest();
        int length3 = bArr.length;
        while (true) {
            i12 = length3;
            if (i12 <= i10) {
                break;
            }
            digest.update(digest3, 0, i10);
            length3 = i12 - i10;
        }
        digest.update(digest3, 0, i12);
        int length4 = bArr.length;
        while (true) {
            int i15 = length4;
            if (i15 <= 0) {
                break;
            }
            if ((i15 & 1) != 0) {
                digest.update(digest3, 0, i10);
            } else {
                digest.update(bArr);
            }
            length4 = i15 >> 1;
        }
        byte[] digest4 = digest.digest();
        MessageDigest digest5 = DigestUtils.getDigest(str3);
        for (int i16 = 1; i16 <= length; i16++) {
            digest5.update(bArr);
        }
        byte[] digest6 = digest5.digest();
        byte[] bArr2 = new byte[length];
        int i17 = 0;
        while (true) {
            i13 = i17;
            if (i13 >= length - i10) {
                break;
            }
            System.arraycopy(digest6, 0, bArr2, i13, i10);
            i17 = i13 + i10;
        }
        System.arraycopy(digest6, 0, bArr2, i13, length - i13);
        MessageDigest digest7 = DigestUtils.getDigest(str3);
        for (int i18 = 1; i18 <= (digest4[0] & 255) + 16; i18++) {
            digest7.update(bytes);
        }
        byte[] digest8 = digest7.digest();
        byte[] bArr3 = new byte[length2];
        int i19 = 0;
        while (true) {
            i14 = i19;
            if (i14 >= length2 - i10) {
                break;
            }
            System.arraycopy(digest8, 0, bArr3, i14, i10);
            i19 = i14 + i10;
        }
        System.arraycopy(digest8, 0, bArr3, i14, length2 - i14);
        for (int i20 = 0; i20 <= i11 - 1; i20++) {
            digest = DigestUtils.getDigest(str3);
            int i21 = i20 & 1;
            if (i21 != 0) {
                digest.update(bArr2, 0, length);
            } else {
                digest.update(digest4, 0, i10);
            }
            if (i20 % 3 != 0) {
                digest.update(bArr3, 0, length2);
            }
            if (i20 % 7 != 0) {
                digest.update(bArr2, 0, length);
            }
            if (i21 != 0) {
                digest.update(digest4, 0, i10);
            } else {
                digest.update(bArr2, 0, length);
            }
            digest4 = digest.digest();
        }
        StringBuilder sb2 = new StringBuilder(str2);
        if (z10) {
            sb2.append(ROUNDS_PREFIX);
            sb2.append(i11);
            sb2.append("$");
        }
        sb2.append(group);
        sb2.append("$");
        if (i10 == 32) {
            B64.b64from24bit(digest4[0], digest4[10], digest4[20], 4, sb2);
            B64.b64from24bit(digest4[21], digest4[1], digest4[11], 4, sb2);
            B64.b64from24bit(digest4[12], digest4[22], digest4[2], 4, sb2);
            B64.b64from24bit(digest4[3], digest4[13], digest4[23], 4, sb2);
            B64.b64from24bit(digest4[24], digest4[4], digest4[14], 4, sb2);
            B64.b64from24bit(digest4[15], digest4[25], digest4[5], 4, sb2);
            B64.b64from24bit(digest4[6], digest4[16], digest4[26], 4, sb2);
            B64.b64from24bit(digest4[27], digest4[7], digest4[17], 4, sb2);
            B64.b64from24bit(digest4[18], digest4[28], digest4[8], 4, sb2);
            B64.b64from24bit(digest4[9], digest4[19], digest4[29], 4, sb2);
            B64.b64from24bit((byte) 0, digest4[31], digest4[30], 3, sb2);
        } else {
            B64.b64from24bit(digest4[0], digest4[21], digest4[42], 4, sb2);
            B64.b64from24bit(digest4[22], digest4[43], digest4[1], 4, sb2);
            B64.b64from24bit(digest4[44], digest4[2], digest4[23], 4, sb2);
            B64.b64from24bit(digest4[3], digest4[24], digest4[45], 4, sb2);
            B64.b64from24bit(digest4[25], digest4[46], digest4[4], 4, sb2);
            B64.b64from24bit(digest4[47], digest4[5], digest4[26], 4, sb2);
            B64.b64from24bit(digest4[6], digest4[27], digest4[48], 4, sb2);
            B64.b64from24bit(digest4[28], digest4[49], digest4[7], 4, sb2);
            B64.b64from24bit(digest4[50], digest4[8], digest4[29], 4, sb2);
            B64.b64from24bit(digest4[9], digest4[30], digest4[51], 4, sb2);
            B64.b64from24bit(digest4[31], digest4[52], digest4[10], 4, sb2);
            B64.b64from24bit(digest4[53], digest4[11], digest4[32], 4, sb2);
            B64.b64from24bit(digest4[12], digest4[33], digest4[54], 4, sb2);
            B64.b64from24bit(digest4[34], digest4[55], digest4[13], 4, sb2);
            B64.b64from24bit(digest4[56], digest4[14], digest4[35], 4, sb2);
            B64.b64from24bit(digest4[15], digest4[36], digest4[57], 4, sb2);
            B64.b64from24bit(digest4[37], digest4[58], digest4[16], 4, sb2);
            B64.b64from24bit(digest4[59], digest4[17], digest4[38], 4, sb2);
            B64.b64from24bit(digest4[18], digest4[39], digest4[60], 4, sb2);
            B64.b64from24bit(digest4[40], digest4[61], digest4[19], 4, sb2);
            B64.b64from24bit(digest4[62], digest4[20], digest4[41], 4, sb2);
            B64.b64from24bit((byte) 0, (byte) 0, digest4[63], 2, sb2);
        }
        Arrays.fill(digest8, (byte) 0);
        Arrays.fill(bArr2, (byte) 0);
        Arrays.fill(bArr3, (byte) 0);
        digest.reset();
        digest7.reset();
        Arrays.fill(bArr, (byte) 0);
        Arrays.fill(bytes, (byte) 0);
        return sb2.toString();
    }

    public static String sha512Crypt(byte[] bArr) {
        return sha512Crypt(bArr, null);
    }

    public static String sha512Crypt(byte[] bArr, String str) {
        String str2 = str;
        if (str == null) {
            str2 = SHA512_PREFIX + B64.getRandomSalt(8);
        }
        return sha2Crypt(bArr, str2, SHA512_PREFIX, 64, MessageDigestAlgorithms.SHA_512);
    }
}

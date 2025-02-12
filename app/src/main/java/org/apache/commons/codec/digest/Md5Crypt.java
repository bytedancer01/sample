package org.apache.commons.codec.digest;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.codec.Charsets;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/digest/Md5Crypt.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/digest/Md5Crypt.class */
public class Md5Crypt {
    public static final String APR1_PREFIX = "$apr1$";
    private static final int BLOCKSIZE = 16;
    public static final String MD5_PREFIX = "$1$";
    private static final int ROUNDS = 1000;

    public static String apr1Crypt(String str) {
        return apr1Crypt(str.getBytes(Charsets.UTF_8));
    }

    public static String apr1Crypt(String str, String str2) {
        return apr1Crypt(str.getBytes(Charsets.UTF_8), str2);
    }

    public static String apr1Crypt(byte[] bArr) {
        return apr1Crypt(bArr, APR1_PREFIX + B64.getRandomSalt(8));
    }

    public static String apr1Crypt(byte[] bArr, String str) {
        String str2 = str;
        if (str != null) {
            str2 = str;
            if (!str.startsWith(APR1_PREFIX)) {
                str2 = APR1_PREFIX + str;
            }
        }
        return md5Crypt(bArr, str2, APR1_PREFIX);
    }

    public static String md5Crypt(byte[] bArr) {
        return md5Crypt(bArr, MD5_PREFIX + B64.getRandomSalt(8));
    }

    public static String md5Crypt(byte[] bArr, String str) {
        return md5Crypt(bArr, str, MD5_PREFIX);
    }

    public static String md5Crypt(byte[] bArr, String str, String str2) {
        String group;
        int length = bArr.length;
        if (str == null) {
            group = B64.getRandomSalt(8);
        } else {
            Matcher matcher = Pattern.compile("^" + str2.replace("$", "\\$") + "([\\.\\/a-zA-Z0-9]{1,8}).*").matcher(str);
            if (matcher == null || !matcher.find()) {
                throw new IllegalArgumentException("Invalid salt value: " + str);
            }
            group = matcher.group(1);
        }
        Charset charset = Charsets.UTF_8;
        byte[] bytes = group.getBytes(charset);
        MessageDigest md5Digest = DigestUtils.getMd5Digest();
        md5Digest.update(bArr);
        md5Digest.update(str2.getBytes(charset));
        md5Digest.update(bytes);
        MessageDigest md5Digest2 = DigestUtils.getMd5Digest();
        md5Digest2.update(bArr);
        md5Digest2.update(bytes);
        md5Digest2.update(bArr);
        byte[] digest = md5Digest2.digest();
        int i10 = length;
        while (true) {
            int i11 = 16;
            if (i10 <= 0) {
                break;
            }
            if (i10 <= 16) {
                i11 = i10;
            }
            md5Digest.update(digest, 0, i11);
            i10 -= 16;
        }
        Arrays.fill(digest, (byte) 0);
        while (length > 0) {
            md5Digest.update((length & 1) == 1 ? digest[0] : bArr[0]);
            length >>= 1;
        }
        StringBuilder sb2 = new StringBuilder(str2 + group + "$");
        byte[] digest2 = md5Digest.digest();
        MessageDigest messageDigest = md5Digest2;
        for (int i12 = 0; i12 < 1000; i12++) {
            messageDigest = DigestUtils.getMd5Digest();
            int i13 = i12 & 1;
            if (i13 != 0) {
                messageDigest.update(bArr);
            } else {
                messageDigest.update(digest2, 0, 16);
            }
            if (i12 % 3 != 0) {
                messageDigest.update(bytes);
            }
            if (i12 % 7 != 0) {
                messageDigest.update(bArr);
            }
            if (i13 != 0) {
                messageDigest.update(digest2, 0, 16);
            } else {
                messageDigest.update(bArr);
            }
            digest2 = messageDigest.digest();
        }
        B64.b64from24bit(digest2[0], digest2[6], digest2[12], 4, sb2);
        B64.b64from24bit(digest2[1], digest2[7], digest2[13], 4, sb2);
        B64.b64from24bit(digest2[2], digest2[8], digest2[14], 4, sb2);
        B64.b64from24bit(digest2[3], digest2[9], digest2[15], 4, sb2);
        B64.b64from24bit(digest2[4], digest2[10], digest2[5], 4, sb2);
        B64.b64from24bit((byte) 0, (byte) 0, digest2[11], 2, sb2);
        md5Digest.reset();
        messageDigest.reset();
        Arrays.fill(bArr, (byte) 0);
        Arrays.fill(bytes, (byte) 0);
        Arrays.fill(digest2, (byte) 0);
        return sb2.toString();
    }
}

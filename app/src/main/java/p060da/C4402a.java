package p060da;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p097fa.C4794e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:da/a.class
 */
/* renamed from: da.a */
/* loaded from: combined.jar:classes2.jar:da/a.class */
public class C4402a {
    @Deprecated
    /* renamed from: a */
    public static byte[] m22425a(Context context, String str) {
        MessageDigest m22426b;
        PackageInfo m24247e = C4794e.m24250a(context).m24247e(str, 64);
        Signature[] signatureArr = m24247e.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (m22426b = m22426b("SHA1")) == null) {
            return null;
        }
        return m22426b.digest(m24247e.signatures[0].toByteArray());
    }

    /* renamed from: b */
    public static MessageDigest m22426b(String str) {
        MessageDigest messageDigest;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                messageDigest = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException e10) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }
}

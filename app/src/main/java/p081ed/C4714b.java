package p081ed;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import mc.C6553c;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ed/b.class
 */
/* renamed from: ed.b */
/* loaded from: combined.jar:classes2.jar:ed/b.class */
public class C4714b {

    /* renamed from: c */
    public static final String[] f27751c = {Marker.ANY_MARKER, "FCM", "GCM", ""};

    /* renamed from: a */
    public final SharedPreferences f27752a;

    /* renamed from: b */
    public final String f27753b;

    public C4714b(C6553c c6553c) {
        this.f27752a = c6553c.m30238g().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f27753b = m23707b(c6553c);
    }

    /* renamed from: b */
    public static String m23707b(C6553c c6553c) {
        String m30260d = c6553c.m30240j().m30260d();
        if (m30260d != null) {
            return m30260d;
        }
        String m30259c = c6553c.m30240j().m30259c();
        if (!m30259c.startsWith("1:") && !m30259c.startsWith("2:")) {
            return m30259c;
        }
        String[] split = m30259c.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: c */
    public static String m23708c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException e10) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* renamed from: a */
    public final String m23709a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    /* renamed from: d */
    public final String m23710d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException e10) {
            return null;
        }
    }

    /* renamed from: e */
    public final PublicKey m23711e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e10) {
            Log.w("ContentValues", "Invalid key stored " + e10);
            return null;
        }
    }

    /* renamed from: f */
    public String m23712f() {
        synchronized (this.f27752a) {
            String m23713g = m23713g();
            if (m23713g != null) {
                return m23713g;
            }
            return m23714h();
        }
    }

    /* renamed from: g */
    public final String m23713g() {
        String string;
        synchronized (this.f27752a) {
            string = this.f27752a.getString("|S|id", null);
        }
        return string;
    }

    /* renamed from: h */
    public final String m23714h() {
        synchronized (this.f27752a) {
            String string = this.f27752a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            PublicKey m23711e = m23711e(string);
            if (m23711e == null) {
                return null;
            }
            return m23708c(m23711e);
        }
    }

    /* renamed from: i */
    public String m23715i() {
        synchronized (this.f27752a) {
            for (String str : f27751c) {
                String string = this.f27752a.getString(m23709a(this.f27753b, str), null);
                if (string != null && !string.isEmpty()) {
                    String str2 = string;
                    if (string.startsWith("{")) {
                        str2 = m23710d(string);
                    }
                    return str2;
                }
            }
            return null;
        }
    }
}

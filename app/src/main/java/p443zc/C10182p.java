package p443zc;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import bd.InterfaceC0891b;
import cd.AbstractC1072l;
import cd.InterfaceC1067g;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import mc.C6553c;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import p169jd.InterfaceC5364i;
import p335t9.C8652d;
import p425yc.InterfaceC9979f;
import za.AbstractC10144i;
import za.C10148l;
import za.InterfaceC10128a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:zc/p.class
 */
/* renamed from: zc.p */
/* loaded from: combined.jar:classes2.jar:zc/p.class */
public class C10182p {

    /* renamed from: a */
    public final C6553c f46639a;

    /* renamed from: b */
    public final C10185s f46640b;

    /* renamed from: c */
    public final C8652d f46641c;

    /* renamed from: d */
    public final InterfaceC0891b<InterfaceC5364i> f46642d;

    /* renamed from: e */
    public final InterfaceC0891b<InterfaceC9979f> f46643e;

    /* renamed from: f */
    public final InterfaceC1067g f46644f;

    public C10182p(C6553c c6553c, C10185s c10185s, InterfaceC0891b<InterfaceC5364i> interfaceC0891b, InterfaceC0891b<InterfaceC9979f> interfaceC0891b2, InterfaceC1067g interfaceC1067g) {
        this(c6553c, c10185s, new C8652d(c6553c.m30238g()), interfaceC0891b, interfaceC0891b2, interfaceC1067g);
    }

    public C10182p(C6553c c6553c, C10185s c10185s, C8652d c8652d, InterfaceC0891b<InterfaceC5364i> interfaceC0891b, InterfaceC0891b<InterfaceC9979f> interfaceC0891b2, InterfaceC1067g interfaceC1067g) {
        this.f46639a = c6553c;
        this.f46640b = c10185s;
        this.f46641c = c8652d;
        this.f46642d = interfaceC0891b;
        this.f46643e = interfaceC0891b2;
        this.f46644f = interfaceC1067g;
    }

    /* renamed from: a */
    public static String m42624a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: f */
    public static boolean m42625f(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    /* renamed from: b */
    public final AbstractC10144i<String> m42626b(AbstractC10144i<Bundle> abstractC10144i) {
        return abstractC10144i.mo42559h(C10174h.m42622a(), new InterfaceC10128a(this) { // from class: zc.o

            /* renamed from: a */
            public final C10182p f46638a;

            {
                this.f46638a = this;
            }

            @Override // za.InterfaceC10128a
            /* renamed from: a */
            public Object mo26105a(AbstractC10144i abstractC10144i2) {
                return this.f46638a.m42630g(abstractC10144i2);
            }
        });
    }

    /* renamed from: c */
    public final String m42627c() {
        try {
            return m42624a(MessageDigest.getInstance(MessageDigestAlgorithms.SHA_1).digest(this.f46639a.m30239i().getBytes()));
        } catch (NoSuchAlgorithmException e10) {
            return "[HASH-ERROR]";
        }
    }

    /* renamed from: d */
    public AbstractC10144i<String> m42628d(String str, String str2, String str3) {
        return m42626b(m42632i(str, str2, str3, new Bundle()));
    }

    /* renamed from: e */
    public final String m42629e(Bundle bundle) {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        String valueOf = String.valueOf(bundle);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 21);
        sb2.append("Unexpected response: ");
        sb2.append(valueOf);
        Log.w("FirebaseInstanceId", sb2.toString(), new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* renamed from: g */
    public final /* synthetic */ String m42630g(AbstractC10144i abstractC10144i) {
        return m42629e((Bundle) abstractC10144i.mo42564m(IOException.class));
    }

    /* renamed from: h */
    public final Bundle m42631h(String str, String str2, String str3, Bundle bundle) {
        InterfaceC9979f.a mo41921a;
        bundle.putString(ClientConstants.DOMAIN_QUERY_PARAM_SCOPES, str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f46639a.m30240j().m30259c());
        bundle.putString("gmsv", Integer.toString(this.f46640b.m42638d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f46640b.m42636a());
        bundle.putString("app_ver_name", this.f46640b.m42637b());
        bundle.putString("firebase-app-name-hash", m42627c());
        try {
            String mo6268b = ((AbstractC1072l) C10148l.m42583a(this.f46644f.mo6285a(false))).mo6268b();
            if (TextUtils.isEmpty(mo6268b)) {
                Log.w("FirebaseInstanceId", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", mo6268b);
            }
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e10);
        }
        bundle.putString("cliv", "fiid-21.0.1");
        InterfaceC9979f interfaceC9979f = this.f46643e.get();
        InterfaceC5364i interfaceC5364i = this.f46642d.get();
        if (interfaceC9979f != null && interfaceC5364i != null && (mo41921a = interfaceC9979f.mo41921a("fire-iid")) != InterfaceC9979f.a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(mo41921a.getCode()));
            bundle.putString("Firebase-Client", interfaceC5364i.mo26658a());
        }
        return bundle;
    }

    /* renamed from: i */
    public final AbstractC10144i<Bundle> m42632i(String str, String str2, String str3, Bundle bundle) {
        m42631h(str, str2, str3, bundle);
        return this.f46641c.m37138a(bundle);
    }

    /* renamed from: j */
    public AbstractC10144i<?> m42633j(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        String valueOf2 = String.valueOf(str3);
        return m42626b(m42632i(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle));
    }

    /* renamed from: k */
    public AbstractC10144i<?> m42634k(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        bundle.putString("delete", "1");
        String valueOf2 = String.valueOf(str3);
        return m42626b(m42632i(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle));
    }
}

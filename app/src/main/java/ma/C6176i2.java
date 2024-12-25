package ma;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.io.IOException;
import java.util.Locale;
import java.util.UUID;
import org.checkerframework.dataflow.qual.Pure;
import p007a6.C0073a;
import p036c6.C1009t;
import p200l9.C5747b0;
import p216m9.C5947e;
import p216m9.C5991t;
import p304r9.C8028h0;
import p383w9.AbstractC9515r;
import p383w9.InterfaceC9502o;
import p422y9.C9935o;
import p437z5.AbstractC10055c;
import p437z5.C10054b;
import p437z5.InterfaceC10057e;
import p437z5.InterfaceC10058f;
import za.C10146j;
import za.InterfaceC10138f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/i2.class
 */
/* renamed from: ma.i2 */
/* loaded from: combined.jar:classes2.jar:ma/i2.class */
public final class C6176i2 {

    /* renamed from: a */
    public final Context f33807a;

    /* renamed from: b */
    public final C8028h0 f33808b;

    /* renamed from: c */
    public final C5991t f33809c;

    /* renamed from: d */
    public final C6216k0 f33810d;

    /* renamed from: e */
    public final BinderC6110f f33811e;

    /* renamed from: g */
    public InterfaceC10058f f33813g;

    /* renamed from: h */
    public int f33814h = 1;

    /* renamed from: f */
    public final String f33812f = UUID.randomUUID().toString();

    public C6176i2(Context context, C8028h0 c8028h0, C5991t c5991t, C6216k0 c6216k0, BinderC6110f binderC6110f) {
        this.f33807a = context;
        this.f33808b = c8028h0;
        this.f33809c = c5991t;
        this.f33810d = c6216k0;
        this.f33811e = binderC6110f;
    }

    /* renamed from: a */
    public static C6176i2 m29667a(Context context, C8028h0 c8028h0, C5991t c5991t, C6216k0 c6216k0, BinderC6110f binderC6110f) {
        return new C6176i2(context, c8028h0, c5991t, c6216k0, binderC6110f);
    }

    /* renamed from: b */
    public final /* synthetic */ void m29668b(String str, SharedPreferences sharedPreferences, Bundle bundle) {
        C9935o.m41850j(this.f33809c);
        C5991t c5991t = this.f33809c;
        C6216k0 c6216k0 = this.f33810d;
        C6286n7 c6286n7 = new C6286n7(sharedPreferences, this, bundle, str);
        this.f33811e.m29581y0(c6286n7.m29889c());
        c5991t.m29356a(new C6242l5(c6286n7), C5947e.class);
        if (c6216k0 != null) {
            c6216k0.m29803m(new C6264m6(c6286n7));
        }
    }

    /* renamed from: c */
    public final void m29669c(Bundle bundle) {
        boolean z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED");
        boolean z11 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED");
        if (z10 || z11) {
            final String packageName = this.f33807a.getPackageName();
            int i10 = 2;
            String format = String.format(Locale.ROOT, "%s.%s", packageName, "client_cast_analytics_data");
            if (bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0) {
                i10 = 1;
            }
            this.f33814h = i10;
            C1009t.m5972f(this.f33807a);
            this.f33813g = C1009t.m5970c().m5975g(C0073a.f231g).mo5963a("CAST_SENDER_SDK", C6142ga.class, C10054b.m42268b("proto"), new InterfaceC10057e() { // from class: ma.t1
                @Override // p437z5.InterfaceC10057e
                public final Object apply(Object obj) {
                    C6142ga c6142ga = (C6142ga) obj;
                    try {
                        int mo29916r = c6142ga.mo29916r();
                        byte[] bArr = new byte[mo29916r];
                        AbstractC6022ag m29400A = AbstractC6022ag.m29400A(bArr, 0, mo29916r);
                        c6142ga.mo29909g(m29400A);
                        m29400A.m29408a();
                        return bArr;
                    } catch (IOException e10) {
                        throw new RuntimeException("Serializing " + c6142ga.getClass().getName() + " to a byte array threw an IOException (should never happen).", e10);
                    }
                }
            });
            final SharedPreferences sharedPreferences = this.f33807a.getApplicationContext().getSharedPreferences(format, 0);
            if (z10) {
                final C8028h0 c8028h0 = this.f33808b;
                final String[] strArr = {"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"};
                c8028h0.doRead(AbstractC9515r.m40018a().m40024b(new InterfaceC9502o(c8028h0, strArr) { // from class: r9.a0

                    /* renamed from: a */
                    public final C8028h0 f38796a;

                    /* renamed from: b */
                    public final String[] f38797b;

                    {
                        this.f38796a = c8028h0;
                        this.f38797b = strArr;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // p383w9.InterfaceC9502o
                    public final void accept(Object obj, Object obj2) {
                        C8028h0 c8028h02 = this.f38796a;
                        String[] strArr2 = this.f38797b;
                        ((C8035l) ((C8030i0) obj).getService()).m34910E1(new BinderC8024f0(c8028h02, (C10146j) obj2), strArr2);
                    }
                }).m40026d(C5747b0.f32191g).m40025c(false).m40027e(8426).m40023a()).mo42558g(new InterfaceC10138f(this, packageName, sharedPreferences) { // from class: ma.m1

                    /* renamed from: a */
                    public final C6176i2 f33882a;

                    /* renamed from: b */
                    public final String f33883b;

                    /* renamed from: c */
                    public final SharedPreferences f33884c;

                    {
                        this.f33882a = this;
                        this.f33883b = packageName;
                        this.f33884c = sharedPreferences;
                    }

                    @Override // za.InterfaceC10138f
                    public final void onSuccess(Object obj) {
                        this.f33882a.m29668b(this.f33883b, this.f33884c, (Bundle) obj);
                    }
                });
            }
            if (z11) {
                C9935o.m41850j(sharedPreferences);
                C6126ff.m29600a(sharedPreferences, this, packageName).m29605e();
                C6126ff.m29603d(EnumC6057c9.CAST_CONTEXT);
            }
            C6396sc.m30011g(this, packageName);
        }
    }

    @Pure
    /* renamed from: d */
    public final void m29670d(C6142ga c6142ga, int i10) {
        C6121fa m29622A = C6142ga.m29622A(c6142ga);
        m29622A.m29589D(this.f33812f);
        m29622A.m29596u(this.f33812f);
        C6142ga c6142ga2 = (C6142ga) m29622A.m29837d();
        int i11 = this.f33814h;
        int i12 = i11 - 1;
        AbstractC10055c abstractC10055c = null;
        if (i11 == 0) {
            throw null;
        }
        if (i12 == 0) {
            abstractC10055c = AbstractC10055c.m42271e(i10 - 1, c6142ga2);
        } else if (i12 == 1) {
            abstractC10055c = AbstractC10055c.m42270d(i10 - 1, c6142ga2);
        }
        C9935o.m41850j(abstractC10055c);
        InterfaceC10058f interfaceC10058f = this.f33813g;
        if (interfaceC10058f != null) {
            interfaceC10058f.mo5967a(abstractC10055c);
        }
    }
}

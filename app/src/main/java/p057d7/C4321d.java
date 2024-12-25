package p057d7;

import android.net.Uri;
import com.google.android.exoplayer2.ext.flac.C2338g;
import com.google.android.exoplayer2.ext.flac.C2339h;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p059d9.C4374m;
import p059d9.C4384r;
import p076e7.C4647b;
import p094f7.C4775c;
import p113g7.C4964c;
import p125h7.C5037a;
import p145i7.C5197e;
import p163j7.C5310f;
import p182k7.C5516g;
import p182k7.C5520k;
import p198l7.C5733d;
import p228n7.C6661a0;
import p228n7.C6662b;
import p228n7.C6668e;
import p228n7.C6674h;
import p228n7.C6675h0;
import p242o7.C6915b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d7/d.class
 */
/* renamed from: d7.d */
/* loaded from: combined.jar:classes2.jar:d7/d.class */
public final class C4321d implements InterfaceC4329l {

    /* renamed from: m */
    public static final int[] f26469m = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};

    /* renamed from: n */
    public static final Constructor<? extends InterfaceC4323f> f26470n;

    /* renamed from: b */
    public boolean f26471b;

    /* renamed from: c */
    public int f26472c;

    /* renamed from: d */
    public int f26473d;

    /* renamed from: e */
    public int f26474e;

    /* renamed from: f */
    public int f26475f;

    /* renamed from: g */
    public int f26476g;

    /* renamed from: h */
    public int f26477h;

    /* renamed from: i */
    public int f26478i;

    /* renamed from: k */
    public int f26480k;

    /* renamed from: j */
    public int f26479j = 1;

    /* renamed from: l */
    public int f26481l = 112800;

    static {
        Constructor<? extends InterfaceC4323f> constructor;
        try {
            Boolean bool = Boolean.TRUE;
            C4384r c4384r = C2339h.f13748a;
            constructor = null;
            if (bool.equals(C2339h.class.getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                InterfaceC4329l interfaceC4329l = C2338g.f13735k;
                constructor = C2338g.class.asSubclass(InterfaceC4323f.class).getConstructor(Integer.TYPE);
            }
        } catch (ClassNotFoundException e10) {
            constructor = null;
        } catch (Exception e11) {
            throw new RuntimeException("Error instantiating FLAC extension", e11);
        }
        f26470n = constructor;
    }

    @Override // p057d7.InterfaceC4329l
    /* renamed from: a */
    public InterfaceC4323f[] mo12020a(Uri uri, Map<String, List<String>> map) {
        InterfaceC4323f[] interfaceC4323fArr;
        synchronized (this) {
            ArrayList arrayList = new ArrayList(14);
            int m22150b = C4374m.m22150b(map);
            if (m22150b != -1) {
                m21818c(m22150b, arrayList);
            }
            int m22151c = C4374m.m22151c(uri);
            if (m22151c != -1 && m22151c != m22150b) {
                m21818c(m22151c, arrayList);
            }
            for (int i10 : f26469m) {
                if (i10 != m22150b && i10 != m22151c) {
                    m21818c(i10, arrayList);
                }
            }
            interfaceC4323fArr = (InterfaceC4323f[]) arrayList.toArray(new InterfaceC4323f[arrayList.size()]);
        }
        return interfaceC4323fArr;
    }

    @Override // p057d7.InterfaceC4329l
    /* renamed from: b */
    public InterfaceC4323f[] mo12021b() {
        InterfaceC4323f[] mo12020a;
        synchronized (this) {
            mo12020a = mo12020a(Uri.EMPTY, new HashMap());
        }
        return mo12020a;
    }

    /* renamed from: c */
    public final void m21818c(int i10, List<InterfaceC4323f> list) {
        InterfaceC4323f c6662b;
        switch (i10) {
            case 0:
                c6662b = new C6662b();
                break;
            case 1:
                c6662b = new C6668e();
                break;
            case 2:
                c6662b = new C6674h(this.f26472c | (this.f26471b ? 1 : 0));
                break;
            case 3:
                c6662b = new C4647b(this.f26473d | (this.f26471b ? 1 : 0));
                break;
            case 4:
                Constructor<? extends InterfaceC4323f> constructor = f26470n;
                if (constructor == null) {
                    c6662b = new C4775c(this.f26474e);
                    break;
                } else {
                    try {
                        list.add(constructor.newInstance(Integer.valueOf(this.f26474e)));
                        return;
                    } catch (Exception e10) {
                        throw new IllegalStateException("Unexpected error creating FLAC extractor", e10);
                    }
                }
            case 5:
                c6662b = new C4964c();
                break;
            case 6:
                c6662b = new C5197e(this.f26475f);
                break;
            case 7:
                c6662b = new C5310f(this.f26478i | (this.f26471b ? 1 : 0));
                break;
            case 8:
                list.add(new C5516g(this.f26477h));
                c6662b = new C5520k(this.f26476g);
                break;
            case 9:
                c6662b = new C5733d();
                break;
            case 10:
                c6662b = new C6661a0();
                break;
            case 11:
                c6662b = new C6675h0(this.f26479j, this.f26480k, this.f26481l);
                break;
            case 12:
                c6662b = new C6915b();
                break;
            case 13:
            default:
                return;
            case 14:
                c6662b = new C5037a();
                break;
        }
        list.add(c6662b);
    }
}

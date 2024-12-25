package p365v6;

import android.os.Looper;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import p267p6.C7629w0;
import p365v6.InterfaceC9277p;
import p365v6.InterfaceC9290x;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v6/z.class
 */
/* renamed from: v6.z */
/* loaded from: combined.jar:classes2.jar:v6/z.class */
public interface InterfaceC9292z {

    /* renamed from: a */
    public static final InterfaceC9292z f42396a;

    /* renamed from: b */
    @Deprecated
    public static final InterfaceC9292z f42397b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v6/z$a.class
     */
    /* renamed from: v6.z$a */
    /* loaded from: combined.jar:classes2.jar:v6/z$a.class */
    public class a implements InterfaceC9292z {
        @Override // p365v6.InterfaceC9292z
        /* renamed from: a */
        public Class<C9284s0> mo39088a(C7629w0 c7629w0) {
            return c7629w0.f37089p != null ? C9284s0.class : null;
        }

        @Override // p365v6.InterfaceC9292z
        /* renamed from: b */
        public /* synthetic */ b mo39089b(Looper looper, InterfaceC9290x.a aVar, C7629w0 c7629w0) {
            return C9291y.m39182a(this, looper, aVar, c7629w0);
        }

        @Override // p365v6.InterfaceC9292z
        /* renamed from: c */
        public InterfaceC9277p mo39090c(Looper looper, InterfaceC9290x.a aVar, C7629w0 c7629w0) {
            if (c7629w0.f37089p == null) {
                return null;
            }
            return new C9258f0(new InterfaceC9277p.a(new C9282r0(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
        }

        @Override // p365v6.InterfaceC9292z
        public /* synthetic */ void prepare() {
            C9291y.m39183b(this);
        }

        @Override // p365v6.InterfaceC9292z
        public /* synthetic */ void release() {
            C9291y.m39184c(this);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v6/z$b.class
     */
    /* renamed from: v6.z$b */
    /* loaded from: combined.jar:classes2.jar:v6/z$b.class */
    public interface b {

        /* renamed from: a */
        public static final b f42398a = new b() { // from class: v6.a0
            @Override // p365v6.InterfaceC9292z.b
            public final void release() {
                C9250b0.m39005a();
            }
        };

        void release();
    }

    static {
        a aVar = new a();
        f42396a = aVar;
        f42397b = aVar;
    }

    /* renamed from: a */
    Class<? extends ExoMediaCrypto> mo39088a(C7629w0 c7629w0);

    /* renamed from: b */
    b mo39089b(Looper looper, InterfaceC9290x.a aVar, C7629w0 c7629w0);

    /* renamed from: c */
    InterfaceC9277p mo39090c(Looper looper, InterfaceC9290x.a aVar, C7629w0 c7629w0);

    void prepare();

    void release();
}

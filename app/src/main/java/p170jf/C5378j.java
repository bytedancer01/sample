package p170jf;

import android.content.Context;
import com.maxdigitall.maxdigitaliptvbox.model.callback.VodInfoCallback;
import com.maxdigitall.maxdigitaliptvbox.model.webrequest.RetrofitPost;
import dj.C4554u;
import dj.C4555v;
import dj.InterfaceC4535b;
import dj.InterfaceC4537d;
import p151if.C5255e;
import p324sf.InterfaceC8574m;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:jf/j.class
 */
/* renamed from: jf.j */
/* loaded from: combined.jar:classes2.jar:jf/j.class */
public class C5378j {

    /* renamed from: a */
    public InterfaceC8574m f30748a;

    /* renamed from: b */
    public Context f30749b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:jf/j$a.class
     */
    /* renamed from: jf.j$a */
    /* loaded from: combined.jar:classes2.jar:jf/j$a.class */
    public class a implements InterfaceC4537d<VodInfoCallback> {

        /* renamed from: a */
        public final C5378j f30750a;

        public a(C5378j c5378j) {
            this.f30750a = c5378j;
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: a */
        public void mo14532a(InterfaceC4535b<VodInfoCallback> interfaceC4535b, C4554u<VodInfoCallback> c4554u) {
            this.f30750a.f30748a.mo15997b();
            if (c4554u.m22954d()) {
                this.f30750a.f30748a.mo16817K(c4554u.m22952a());
            } else if (c4554u.m22952a() == null) {
                this.f30750a.f30748a.mo15998c("Invalid Request");
            }
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: b */
        public void mo14533b(InterfaceC4535b<VodInfoCallback> interfaceC4535b, Throwable th2) {
            this.f30750a.f30748a.mo15997b();
            this.f30750a.f30748a.mo15998c(th2.getMessage());
            this.f30750a.f30748a.mo16825V(th2.getMessage());
        }
    }

    public C5378j(InterfaceC8574m interfaceC8574m, Context context) {
        this.f30748a = interfaceC8574m;
        this.f30749b = context;
    }

    /* renamed from: b */
    public void m26729b(String str, String str2, int i10) {
        this.f30748a.mo15996a();
        C4555v m26223Z = C5255e.m26223Z(this.f30749b);
        if (m26223Z != null) {
            ((RetrofitPost) m26223Z.m22958b(RetrofitPost.class)).m15546r("application/x-www-form-urlencoded", str, str2, "get_vod_info", i10).mo22862f(new a(this));
        }
    }
}

package p170jf;

import android.content.Context;
import com.maxdigitall.maxdigitaliptvbox.model.webrequest.RetrofitPost;
import dj.C4554u;
import dj.C4555v;
import dj.InterfaceC4535b;
import dj.InterfaceC4537d;
import p151if.C5255e;
import p188kd.AbstractC5557j;
import p324sf.InterfaceC8572k;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:jf/g.class
 */
/* renamed from: jf.g */
/* loaded from: combined.jar:classes2.jar:jf/g.class */
public class C5375g {

    /* renamed from: a */
    public Context f30734a;

    /* renamed from: b */
    public InterfaceC8572k f30735b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:jf/g$a.class
     */
    /* renamed from: jf.g$a */
    /* loaded from: combined.jar:classes2.jar:jf/g$a.class */
    public class a implements InterfaceC4537d<AbstractC5557j> {

        /* renamed from: a */
        public final C5375g f30736a;

        public a(C5375g c5375g) {
            this.f30736a = c5375g;
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: a */
        public void mo14532a(InterfaceC4535b<AbstractC5557j> interfaceC4535b, C4554u<AbstractC5557j> c4554u) {
            if (c4554u.m22952a() != null) {
                this.f30736a.f30735b.mo16611a0(c4554u.m22952a());
            }
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: b */
        public void mo14533b(InterfaceC4535b<AbstractC5557j> interfaceC4535b, Throwable th2) {
            this.f30736a.f30735b.mo15997b();
            this.f30736a.f30735b.mo15998c(th2.getMessage());
            this.f30736a.f30735b.mo16593C(th2.getMessage());
        }
    }

    public C5375g(Context context, InterfaceC8572k interfaceC8572k) {
        this.f30734a = context;
        this.f30735b = interfaceC8572k;
    }

    /* renamed from: b */
    public void m26725b(String str, String str2, String str3) {
        C4555v m26223Z = C5255e.m26223Z(this.f30734a);
        if (m26223Z != null) {
            ((RetrofitPost) m26223Z.m22958b(RetrofitPost.class)).m15549u("application/x-www-form-urlencoded", str, str2, "get_series_info", str3).mo22862f(new a(this));
        }
    }
}

package p170jf;

import android.content.Context;
import android.util.Log;
import com.maxdigitall.maxdigitaliptvbox.model.callback.BillingLoginClientCallback;
import com.maxdigitall.maxdigitaliptvbox.model.webrequest.RetrofitPost;
import dj.C4554u;
import dj.C4555v;
import dj.InterfaceC4535b;
import dj.InterfaceC4537d;
import p151if.C5255e;
import p324sf.InterfaceC8565d;
import p407xe.C9740b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:jf/b.class
 */
/* renamed from: jf.b */
/* loaded from: combined.jar:classes2.jar:jf/b.class */
public class C5370b {

    /* renamed from: a */
    public Context f30698a;

    /* renamed from: b */
    public InterfaceC8565d f30699b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:jf/b$a.class
     */
    /* renamed from: jf.b$a */
    /* loaded from: combined.jar:classes2.jar:jf/b$a.class */
    public class a implements InterfaceC4537d<BillingLoginClientCallback> {

        /* renamed from: a */
        public final C5370b f30700a;

        public a(C5370b c5370b) {
            this.f30700a = c5370b;
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: a */
        public void mo14532a(InterfaceC4535b<BillingLoginClientCallback> interfaceC4535b, C4554u<BillingLoginClientCallback> c4554u) {
            if (c4554u.m22952a() == null || !c4554u.m22954d()) {
                this.f30700a.f30699b.m36833c(this.f30700a.f30698a.getResources().getString(2132018606));
            } else {
                this.f30700a.f30699b.mo16107F(c4554u.m22952a());
            }
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: b */
        public void mo14533b(InterfaceC4535b<BillingLoginClientCallback> interfaceC4535b, Throwable th2) {
            Log.e("honey", "onFailure: ");
            this.f30700a.f30699b.m36833c(this.f30700a.f30698a.getResources().getString(2132018606));
        }
    }

    public C5370b(Context context, InterfaceC8565d interfaceC8565d) {
        this.f30698a = context;
        this.f30699b = interfaceC8565d;
    }

    /* renamed from: c */
    public void m26696c(String str, String str2, String str3, String str4, String str5) {
        this.f30699b.m36831a();
        C4555v m26225a0 = C5255e.m26225a0(this.f30698a);
        if (m26225a0 != null) {
            ((RetrofitPost) m26225a0.m22958b(RetrofitPost.class)).m15533e("Vu6HilnbLo63", str, str5, "T6Vk3rLFQBeu3n6s", C9740b.f44454b, str4, str2, "login", str3).mo22862f(new a(this));
        }
    }
}

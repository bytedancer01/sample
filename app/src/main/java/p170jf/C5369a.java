package p170jf;

import android.content.Context;
import android.util.Log;
import com.maxdigitall.maxdigitaliptvbox.model.callback.ActivationCallBack;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.webrequest.RetrofitPost;
import dj.C4554u;
import dj.C4555v;
import dj.InterfaceC4535b;
import dj.InterfaceC4537d;
import p151if.C5255e;
import p188kd.C5560m;
import p324sf.InterfaceC8562a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:jf/a.class
 */
/* renamed from: jf.a */
/* loaded from: combined.jar:classes2.jar:jf/a.class */
public class C5369a {

    /* renamed from: a */
    public Context f30695a;

    /* renamed from: b */
    public InterfaceC8562a f30696b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:jf/a$a.class
     */
    /* renamed from: jf.a$a */
    /* loaded from: combined.jar:classes2.jar:jf/a$a.class */
    public class a implements InterfaceC4537d<ActivationCallBack> {

        /* renamed from: a */
        public final C5369a f30697a;

        public a(C5369a c5369a) {
            this.f30697a = c5369a;
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: a */
        public void mo14532a(InterfaceC4535b<ActivationCallBack> interfaceC4535b, C4554u<ActivationCallBack> c4554u) {
            if (!c4554u.m22954d() || c4554u.m22952a() == null) {
                C5369a c5369a = this.f30697a;
                c5369a.f30696b.mo16004w(c5369a.f30695a.getResources().getString(2132018606));
                return;
            }
            if (c4554u.m22952a().m14924c() != null && c4554u.m22952a().m14924c().equalsIgnoreCase("success")) {
                if (c4554u.m22952a().m14922a() != null) {
                    SharepreferenceDBHandler.m15380i0(c4554u.m22952a().m14922a().m14925a(), this.f30697a.f30695a);
                    SharepreferenceDBHandler.m15378h0(c4554u.m22952a().m14922a().m14926b(), this.f30697a.f30695a);
                    this.f30697a.f30696b.mo16005y(c4554u.m22952a(), "validateLogin");
                    Log.e("ActivationPresenter", "Respone is successfull");
                } else if (c4554u.m22952a().m14923b() != null) {
                    C5255e.m26241k0(this.f30697a.f30695a, c4554u.m22952a().m14923b());
                }
            }
            if (c4554u.m22952a().m14924c().equalsIgnoreCase("error")) {
                this.f30697a.f30696b.mo16004w(c4554u.m22952a().m14923b());
                Log.e("ActivationPresenter", "Response is not sucessfull");
            }
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: b */
        public void mo14533b(InterfaceC4535b<ActivationCallBack> interfaceC4535b, Throwable th2) {
            C5369a c5369a = this.f30697a;
            c5369a.f30696b.mo16004w(c5369a.f30695a.getResources().getString(2132018606));
        }
    }

    public C5369a(InterfaceC8562a interfaceC8562a, Context context) {
        this.f30695a = context;
        this.f30696b = interfaceC8562a;
    }

    /* renamed from: a */
    public void m26693a(String str) {
        C4555v m26248o = C5255e.m26248o(this.f30695a);
        if (m26248o != null) {
            RetrofitPost retrofitPost = (RetrofitPost) m26248o.m22958b(RetrofitPost.class);
            C5560m c5560m = new C5560m();
            c5560m.m27586y("api_username", "EJzcbx8B4J2mBEa");
            c5560m.m27586y("api_password", "CutwKMP2fF3er29");
            c5560m.m27586y("activation_code", str);
            c5560m.m27586y("mac_address", C5255e.m26254u(this.f30695a));
            retrofitPost.m15529a(c5560m).mo22862f(new a(this));
        }
    }
}

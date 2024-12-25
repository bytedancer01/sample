package p170jf;

import android.content.Context;
import com.maxdigitall.maxdigitaliptvbox.model.callback.LiveStreamsEpgCallback;
import com.maxdigitall.maxdigitaliptvbox.model.webrequest.RetrofitPost;
import dj.C4554u;
import dj.C4555v;
import dj.InterfaceC4535b;
import dj.InterfaceC4537d;
import p151if.C5255e;
import p324sf.InterfaceC8566e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:jf/h.class
 */
/* renamed from: jf.h */
/* loaded from: combined.jar:classes2.jar:jf/h.class */
public class C5376h {

    /* renamed from: a */
    public InterfaceC8566e f30737a;

    /* renamed from: b */
    public Context f30738b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:jf/h$a.class
     */
    /* renamed from: jf.h$a */
    /* loaded from: combined.jar:classes2.jar:jf/h$a.class */
    public class a implements InterfaceC4537d<LiveStreamsEpgCallback> {

        /* renamed from: a */
        public final String f30739a;

        /* renamed from: b */
        public final String f30740b;

        /* renamed from: c */
        public final String f30741c;

        /* renamed from: d */
        public final String f30742d;

        /* renamed from: e */
        public final String f30743e;

        /* renamed from: f */
        public final String f30744f;

        /* renamed from: g */
        public final C5376h f30745g;

        public a(C5376h c5376h, String str, String str2, String str3, String str4, String str5, String str6) {
            this.f30745g = c5376h;
            this.f30739a = str;
            this.f30740b = str2;
            this.f30741c = str3;
            this.f30742d = str4;
            this.f30743e = str5;
            this.f30744f = str6;
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: a */
        public void mo14532a(InterfaceC4535b<LiveStreamsEpgCallback> interfaceC4535b, C4554u<LiveStreamsEpgCallback> c4554u) {
            this.f30745g.f30737a.mo15997b();
            if (c4554u.m22954d()) {
                this.f30745g.f30737a.mo16717v(c4554u.m22952a(), this.f30739a, this.f30740b, this.f30741c, this.f30742d, this.f30743e, this.f30744f);
            } else if (c4554u.m22952a() == null) {
                this.f30745g.f30737a.mo15998c("Invalid Request");
            }
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: b */
        public void mo14533b(InterfaceC4535b<LiveStreamsEpgCallback> interfaceC4535b, Throwable th2) {
            this.f30745g.f30737a.mo15997b();
            this.f30745g.f30737a.mo15998c(th2.getMessage());
        }
    }

    public C5376h(InterfaceC8566e interfaceC8566e, Context context) {
        this.f30737a = interfaceC8566e;
        this.f30738b = context;
    }

    /* renamed from: b */
    public void m26727b(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f30737a.mo15996a();
        C4555v m26223Z = C5255e.m26223Z(this.f30738b);
        if (m26223Z != null) {
            ((RetrofitPost) m26223Z.m22958b(RetrofitPost.class)).m15531c("application/x-www-form-urlencoded", str, str2, "get_simple_data_table", i10).mo22862f(new a(this, str3, str4, str5, str6, str7, str8));
        }
    }
}

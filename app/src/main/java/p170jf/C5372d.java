package p170jf;

import android.content.Context;
import com.maxdigitall.maxdigitaliptvbox.model.callback.GetSeriesStreamCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.GetSeriesStreamCategoriesCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.LiveStreamCategoriesCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.LiveStreamsCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.VodCategoriesCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.VodStreamsCallback;
import com.maxdigitall.maxdigitaliptvbox.model.webrequest.RetrofitPost;
import dj.C4554u;
import dj.C4555v;
import dj.InterfaceC4535b;
import dj.InterfaceC4537d;
import java.util.List;
import p151if.C5255e;
import p324sf.InterfaceC8569h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:jf/d.class
 */
/* renamed from: jf.d */
/* loaded from: combined.jar:classes2.jar:jf/d.class */
public class C5372d {

    /* renamed from: a */
    public Context f30712a;

    /* renamed from: b */
    public InterfaceC8569h f30713b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:jf/d$a.class
     */
    /* renamed from: jf.d$a */
    /* loaded from: combined.jar:classes2.jar:jf/d$a.class */
    public class a implements InterfaceC4537d<List<LiveStreamCategoriesCallback>> {

        /* renamed from: a */
        public final C5372d f30714a;

        public a(C5372d c5372d) {
            this.f30714a = c5372d;
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: a */
        public void mo14532a(InterfaceC4535b<List<LiveStreamCategoriesCallback>> interfaceC4535b, C4554u<List<LiveStreamCategoriesCallback>> c4554u) {
            if (c4554u.m22952a() != null && c4554u.m22954d()) {
                this.f30714a.f30713b.mo16125h(c4554u.m22952a());
            } else if (c4554u.m22952a() == null) {
                this.f30714a.f30713b.mo16134p("Failed");
                this.f30714a.f30713b.m36832b();
            }
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: b */
        public void mo14533b(InterfaceC4535b<List<LiveStreamCategoriesCallback>> interfaceC4535b, Throwable th2) {
            this.f30714a.f30713b.mo16134p("Failed");
            this.f30714a.f30713b.m36832b();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:jf/d$b.class
     */
    /* renamed from: jf.d$b */
    /* loaded from: combined.jar:classes2.jar:jf/d$b.class */
    public class b implements InterfaceC4537d<List<VodCategoriesCallback>> {

        /* renamed from: a */
        public final C5372d f30715a;

        public b(C5372d c5372d) {
            this.f30715a = c5372d;
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: a */
        public void mo14532a(InterfaceC4535b<List<VodCategoriesCallback>> interfaceC4535b, C4554u<List<VodCategoriesCallback>> c4554u) {
            if (c4554u.m22952a() != null && c4554u.m22954d()) {
                this.f30715a.f30713b.mo16109M(c4554u.m22952a());
            } else if (c4554u.m22952a() == null) {
                this.f30715a.f30713b.mo16122f("Failed");
                this.f30715a.f30713b.m36832b();
            }
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: b */
        public void mo14533b(InterfaceC4535b<List<VodCategoriesCallback>> interfaceC4535b, Throwable th2) {
            this.f30715a.f30713b.mo16122f("Failed");
            this.f30715a.f30713b.m36832b();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:jf/d$c.class
     */
    /* renamed from: jf.d$c */
    /* loaded from: combined.jar:classes2.jar:jf/d$c.class */
    public class c implements InterfaceC4537d<List<GetSeriesStreamCategoriesCallback>> {

        /* renamed from: a */
        public final C5372d f30716a;

        public c(C5372d c5372d) {
            this.f30716a = c5372d;
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: a */
        public void mo14532a(InterfaceC4535b<List<GetSeriesStreamCategoriesCallback>> interfaceC4535b, C4554u<List<GetSeriesStreamCategoriesCallback>> c4554u) {
            if (c4554u.m22952a() != null && c4554u.m22954d()) {
                this.f30716a.f30713b.mo16115X(c4554u.m22952a());
            } else if (c4554u.m22952a() == null) {
                this.f30716a.f30713b.mo16106B("Failed");
                this.f30716a.f30713b.m36832b();
            }
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: b */
        public void mo14533b(InterfaceC4535b<List<GetSeriesStreamCategoriesCallback>> interfaceC4535b, Throwable th2) {
            this.f30716a.f30713b.mo16106B("Failed");
            this.f30716a.f30713b.m36832b();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:jf/d$d.class
     */
    /* renamed from: jf.d$d */
    /* loaded from: combined.jar:classes2.jar:jf/d$d.class */
    public class d implements InterfaceC4537d<List<LiveStreamsCallback>> {

        /* renamed from: a */
        public final C5372d f30717a;

        public d(C5372d c5372d) {
            this.f30717a = c5372d;
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: a */
        public void mo14532a(InterfaceC4535b<List<LiveStreamsCallback>> interfaceC4535b, C4554u<List<LiveStreamsCallback>> c4554u) {
            if (c4554u.m22952a() != null && c4554u.m22954d()) {
                this.f30717a.f30713b.mo16144u(c4554u.m22952a());
            } else if (c4554u.m22952a() == null) {
                this.f30717a.f30713b.mo16110N("Failed");
                this.f30717a.f30713b.m36832b();
            }
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: b */
        public void mo14533b(InterfaceC4535b<List<LiveStreamsCallback>> interfaceC4535b, Throwable th2) {
            this.f30717a.f30713b.mo16110N("Failed");
            this.f30717a.f30713b.m36832b();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:jf/d$e.class
     */
    /* renamed from: jf.d$e */
    /* loaded from: combined.jar:classes2.jar:jf/d$e.class */
    public class e implements InterfaceC4537d<List<VodStreamsCallback>> {

        /* renamed from: a */
        public final C5372d f30718a;

        public e(C5372d c5372d) {
            this.f30718a = c5372d;
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: a */
        public void mo14532a(InterfaceC4535b<List<VodStreamsCallback>> interfaceC4535b, C4554u<List<VodStreamsCallback>> c4554u) {
            if (c4554u.m22952a() != null && c4554u.m22954d()) {
                this.f30718a.f30713b.mo16148x(c4554u.m22952a());
            } else if (c4554u.m22952a() == null) {
                this.f30718a.f30713b.mo16108I("Failed");
                this.f30718a.f30713b.m36832b();
            }
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: b */
        public void mo14533b(InterfaceC4535b<List<VodStreamsCallback>> interfaceC4535b, Throwable th2) {
            this.f30718a.f30713b.mo16108I("Failed");
            this.f30718a.f30713b.m36832b();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:jf/d$f.class
     */
    /* renamed from: jf.d$f */
    /* loaded from: combined.jar:classes2.jar:jf/d$f.class */
    public class f implements InterfaceC4537d<List<GetSeriesStreamCallback>> {

        /* renamed from: a */
        public final C5372d f30719a;

        public f(C5372d c5372d) {
            this.f30719a = c5372d;
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: a */
        public void mo14532a(InterfaceC4535b<List<GetSeriesStreamCallback>> interfaceC4535b, C4554u<List<GetSeriesStreamCallback>> c4554u) {
            if (c4554u.m22952a() != null && c4554u.m22954d()) {
                this.f30719a.f30713b.mo16136q(c4554u.m22952a());
            } else if (c4554u.m22952a() == null) {
                this.f30719a.f30713b.mo16112U("Failed");
                this.f30719a.f30713b.m36832b();
            }
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: b */
        public void mo14533b(InterfaceC4535b<List<GetSeriesStreamCallback>> interfaceC4535b, Throwable th2) {
            this.f30719a.f30713b.mo16112U("Failed");
            this.f30719a.f30713b.m36832b();
        }
    }

    public C5372d(Context context, InterfaceC8569h interfaceC8569h) {
        this.f30712a = context;
        this.f30713b = interfaceC8569h;
    }

    /* renamed from: b */
    public void m26706b(String str, String str2) {
        C4555v m26223Z = C5255e.m26223Z(this.f30712a);
        if (m26223Z != null) {
            ((RetrofitPost) m26223Z.m22958b(RetrofitPost.class)).m15538j("application/x-www-form-urlencoded", str, str2, "get_live_categories").mo22862f(new a(this));
        }
    }

    /* renamed from: c */
    public void m26707c(String str, String str2) {
        C4555v m26223Z = C5255e.m26223Z(this.f30712a);
        if (m26223Z != null) {
            ((RetrofitPost) m26223Z.m22958b(RetrofitPost.class)).m15543o("application/x-www-form-urlencoded", str, str2, "get_live_streams").mo22862f(new d(this));
        }
    }

    /* renamed from: d */
    public void m26708d(String str, String str2) {
        C4555v m26223Z = C5255e.m26223Z(this.f30712a);
        if (m26223Z != null) {
            ((RetrofitPost) m26223Z.m22958b(RetrofitPost.class)).m15547s("application/x-www-form-urlencoded", str, str2, "get_series").mo22862f(new f(this));
        }
    }

    /* renamed from: e */
    public void m26709e(String str, String str2) {
        C4555v m26223Z = C5255e.m26223Z(this.f30712a);
        if (m26223Z != null) {
            ((RetrofitPost) m26223Z.m22958b(RetrofitPost.class)).m15540l("application/x-www-form-urlencoded", str, str2, "get_series_categories").mo22862f(new c(this));
        }
    }

    /* renamed from: f */
    public void m26710f(String str, String str2) {
        C4555v m26223Z = C5255e.m26223Z(this.f30712a);
        if (m26223Z != null) {
            ((RetrofitPost) m26223Z.m22958b(RetrofitPost.class)).m15545q("application/x-www-form-urlencoded", str, str2, "get_vod_categories").mo22862f(new b(this));
        }
    }

    /* renamed from: g */
    public void m26711g(String str, String str2) {
        C4555v m26223Z = C5255e.m26223Z(this.f30712a);
        if (m26223Z != null) {
            ((RetrofitPost) m26223Z.m22958b(RetrofitPost.class)).m15548t("application/x-www-form-urlencoded", str, str2, "get_vod_streams").mo22862f(new e(this));
        }
    }
}

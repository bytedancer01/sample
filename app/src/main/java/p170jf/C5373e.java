package p170jf;

import android.content.Context;
import com.maxdigitall.maxdigitaliptvbox.model.callback.SearchTMDBMoviesCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBCastsCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBGenreCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBPersonInfoCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBTrailerCallback;
import com.maxdigitall.maxdigitaliptvbox.model.webrequest.RetrofitPost;
import dj.C4554u;
import dj.C4555v;
import dj.InterfaceC4535b;
import dj.InterfaceC4537d;
import p151if.C5255e;
import p324sf.InterfaceC8570i;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:jf/e.class
 */
/* renamed from: jf.e */
/* loaded from: combined.jar:classes2.jar:jf/e.class */
public class C5373e {

    /* renamed from: a */
    public InterfaceC8570i f30720a;

    /* renamed from: b */
    public Context f30721b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:jf/e$a.class
     */
    /* renamed from: jf.e$a */
    /* loaded from: combined.jar:classes2.jar:jf/e$a.class */
    public class a implements InterfaceC4537d<SearchTMDBMoviesCallback> {

        /* renamed from: a */
        public final C5373e f30722a;

        public a(C5373e c5373e) {
            this.f30722a = c5373e;
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: a */
        public void mo14532a(InterfaceC4535b<SearchTMDBMoviesCallback> interfaceC4535b, C4554u<SearchTMDBMoviesCallback> c4554u) {
            this.f30722a.f30720a.mo15997b();
            if (c4554u.m22954d()) {
                this.f30722a.f30720a.mo16828e(c4554u.m22952a());
            } else if (c4554u.m22952a() == null) {
                this.f30722a.f30720a.mo15998c("Invalid Request");
            }
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: b */
        public void mo14533b(InterfaceC4535b<SearchTMDBMoviesCallback> interfaceC4535b, Throwable th2) {
            this.f30722a.f30720a.mo15997b();
            this.f30722a.f30720a.mo15998c(th2.getMessage());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:jf/e$b.class
     */
    /* renamed from: jf.e$b */
    /* loaded from: combined.jar:classes2.jar:jf/e$b.class */
    public class b implements InterfaceC4537d<TMDBCastsCallback> {

        /* renamed from: a */
        public final C5373e f30723a;

        public b(C5373e c5373e) {
            this.f30723a = c5373e;
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: a */
        public void mo14532a(InterfaceC4535b<TMDBCastsCallback> interfaceC4535b, C4554u<TMDBCastsCallback> c4554u) {
            this.f30723a.f30720a.mo15997b();
            if (c4554u.m22954d()) {
                this.f30723a.f30720a.mo16827b0(c4554u.m22952a());
            } else if (c4554u.m22952a() == null) {
                this.f30723a.f30720a.mo15998c("Invalid Request");
            }
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: b */
        public void mo14533b(InterfaceC4535b<TMDBCastsCallback> interfaceC4535b, Throwable th2) {
            this.f30723a.f30720a.mo15997b();
            this.f30723a.f30720a.mo15998c(th2.getMessage());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:jf/e$c.class
     */
    /* renamed from: jf.e$c */
    /* loaded from: combined.jar:classes2.jar:jf/e$c.class */
    public class c implements InterfaceC4537d<TMDBCastsCallback> {

        /* renamed from: a */
        public final C5373e f30724a;

        public c(C5373e c5373e) {
            this.f30724a = c5373e;
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: a */
        public void mo14532a(InterfaceC4535b<TMDBCastsCallback> interfaceC4535b, C4554u<TMDBCastsCallback> c4554u) {
            this.f30724a.f30720a.mo15997b();
            if (c4554u.m22954d()) {
                this.f30724a.f30720a.mo16826W(c4554u.m22952a());
            } else if (c4554u.m22952a() == null) {
                this.f30724a.f30720a.mo15998c("Invalid Request");
            }
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: b */
        public void mo14533b(InterfaceC4535b<TMDBCastsCallback> interfaceC4535b, Throwable th2) {
            this.f30724a.f30720a.mo15997b();
            this.f30724a.f30720a.mo15998c(th2.getMessage());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:jf/e$d.class
     */
    /* renamed from: jf.e$d */
    /* loaded from: combined.jar:classes2.jar:jf/e$d.class */
    public class d implements InterfaceC4537d<TMDBGenreCallback> {

        /* renamed from: a */
        public final C5373e f30725a;

        public d(C5373e c5373e) {
            this.f30725a = c5373e;
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: a */
        public void mo14532a(InterfaceC4535b<TMDBGenreCallback> interfaceC4535b, C4554u<TMDBGenreCallback> c4554u) {
            this.f30725a.f30720a.mo15997b();
            if (c4554u.m22954d()) {
                this.f30725a.f30720a.mo16819L(c4554u.m22952a());
            } else if (c4554u.m22952a() == null) {
                this.f30725a.f30720a.mo15998c("Invalid Request");
            }
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: b */
        public void mo14533b(InterfaceC4535b<TMDBGenreCallback> interfaceC4535b, Throwable th2) {
            this.f30725a.f30720a.mo15997b();
            this.f30725a.f30720a.mo15998c(th2.getMessage());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:jf/e$e.class
     */
    /* renamed from: jf.e$e */
    /* loaded from: combined.jar:classes2.jar:jf/e$e.class */
    public class e implements InterfaceC4537d<TMDBTrailerCallback> {

        /* renamed from: a */
        public final C5373e f30726a;

        public e(C5373e c5373e) {
            this.f30726a = c5373e;
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: a */
        public void mo14532a(InterfaceC4535b<TMDBTrailerCallback> interfaceC4535b, C4554u<TMDBTrailerCallback> c4554u) {
            this.f30726a.f30720a.mo15997b();
            if (c4554u.m22954d()) {
                this.f30726a.f30720a.mo16829o(c4554u.m22952a());
            } else if (c4554u.m22952a() == null) {
                this.f30726a.f30720a.mo15998c("Invalid Request");
            }
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: b */
        public void mo14533b(InterfaceC4535b<TMDBTrailerCallback> interfaceC4535b, Throwable th2) {
            this.f30726a.f30720a.mo15997b();
            this.f30726a.f30720a.mo15998c(th2.getMessage());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:jf/e$f.class
     */
    /* renamed from: jf.e$f */
    /* loaded from: combined.jar:classes2.jar:jf/e$f.class */
    public class f implements InterfaceC4537d<TMDBPersonInfoCallback> {

        /* renamed from: a */
        public final C5373e f30727a;

        public f(C5373e c5373e) {
            this.f30727a = c5373e;
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: a */
        public void mo14532a(InterfaceC4535b<TMDBPersonInfoCallback> interfaceC4535b, C4554u<TMDBPersonInfoCallback> c4554u) {
            this.f30727a.f30720a.mo15997b();
            if (c4554u.m22954d()) {
                this.f30727a.f30720a.mo16824R(c4554u.m22952a());
            } else if (c4554u.m22952a() == null) {
                this.f30727a.f30720a.mo15998c("Invalid Request");
            }
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: b */
        public void mo14533b(InterfaceC4535b<TMDBPersonInfoCallback> interfaceC4535b, Throwable th2) {
            this.f30727a.f30720a.mo15997b();
            this.f30727a.f30720a.mo15998c(th2.getMessage());
        }
    }

    public C5373e(InterfaceC8570i interfaceC8570i, Context context) {
        this.f30720a = interfaceC8570i;
        this.f30721b = context;
    }

    /* renamed from: b */
    public void m26713b(int i10) {
        this.f30720a.mo15996a();
        C4555v m26227b0 = C5255e.m26227b0(this.f30721b);
        if (m26227b0 != null) {
            ((RetrofitPost) m26227b0.m22958b(RetrofitPost.class)).m15535g(i10, "f584f73e8848d9ace559deee1e5a849f").mo22862f(new b(this));
        }
    }

    /* renamed from: c */
    public void m26714c(int i10) {
        this.f30720a.mo15996a();
        C4555v m26227b0 = C5255e.m26227b0(this.f30721b);
        if (m26227b0 != null) {
            ((RetrofitPost) m26227b0.m22958b(RetrofitPost.class)).m15535g(i10, "f584f73e8848d9ace559deee1e5a849f").mo22862f(new c(this));
        }
    }

    /* renamed from: d */
    public void m26715d(int i10) {
        this.f30720a.mo15996a();
        C4555v m26227b0 = C5255e.m26227b0(this.f30721b);
        if (m26227b0 != null) {
            ((RetrofitPost) m26227b0.m22958b(RetrofitPost.class)).m15542n(i10, "f584f73e8848d9ace559deee1e5a849f").mo22862f(new d(this));
        }
    }

    /* renamed from: e */
    public void m26716e(String str) {
        this.f30720a.mo15996a();
        C4555v m26227b0 = C5255e.m26227b0(this.f30721b);
        if (m26227b0 != null) {
            ((RetrofitPost) m26227b0.m22958b(RetrofitPost.class)).m15530b("f584f73e8848d9ace559deee1e5a849f", str).mo22862f(new a(this));
        }
    }

    /* renamed from: f */
    public void m26717f(String str) {
        this.f30720a.mo15996a();
        C4555v m26227b0 = C5255e.m26227b0(this.f30721b);
        if (m26227b0 != null) {
            ((RetrofitPost) m26227b0.m22958b(RetrofitPost.class)).m15539k(str, "f584f73e8848d9ace559deee1e5a849f", "images").mo22862f(new f(this));
        }
    }

    /* renamed from: g */
    public void m26718g(int i10) {
        this.f30720a.mo15996a();
        C4555v m26227b0 = C5255e.m26227b0(this.f30721b);
        if (m26227b0 != null) {
            ((RetrofitPost) m26227b0.m22958b(RetrofitPost.class)).m15544p(i10, "f584f73e8848d9ace559deee1e5a849f").mo22862f(new e(this));
        }
    }
}

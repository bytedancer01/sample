package p170jf;

import android.content.Context;
import com.maxdigitall.maxdigitaliptvbox.model.callback.SearchTMDBTVShowsCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBCastsCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBTVShowsInfoCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBTrailerCallback;
import com.maxdigitall.maxdigitaliptvbox.model.webrequest.RetrofitPost;
import dj.C4554u;
import dj.C4555v;
import dj.InterfaceC4535b;
import dj.InterfaceC4537d;
import p151if.C5255e;
import p324sf.InterfaceC8571j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:jf/f.class
 */
/* renamed from: jf.f */
/* loaded from: combined.jar:classes2.jar:jf/f.class */
public class C5374f {

    /* renamed from: a */
    public InterfaceC8571j f30728a;

    /* renamed from: b */
    public Context f30729b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:jf/f$a.class
     */
    /* renamed from: jf.f$a */
    /* loaded from: combined.jar:classes2.jar:jf/f$a.class */
    public class a implements InterfaceC4537d<SearchTMDBTVShowsCallback> {

        /* renamed from: a */
        public final C5374f f30730a;

        public a(C5374f c5374f) {
            this.f30730a = c5374f;
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: a */
        public void mo14532a(InterfaceC4535b<SearchTMDBTVShowsCallback> interfaceC4535b, C4554u<SearchTMDBTVShowsCallback> c4554u) {
            this.f30730a.f30728a.mo15997b();
            if (c4554u.m22954d()) {
                this.f30730a.f30728a.mo16615z(c4554u.m22952a());
            } else if (c4554u.m22952a() == null) {
                this.f30730a.f30728a.mo15998c("Invalid Request");
            }
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: b */
        public void mo14533b(InterfaceC4535b<SearchTMDBTVShowsCallback> interfaceC4535b, Throwable th2) {
            this.f30730a.f30728a.mo15997b();
            this.f30730a.f30728a.mo15998c(th2.getMessage());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:jf/f$b.class
     */
    /* renamed from: jf.f$b */
    /* loaded from: combined.jar:classes2.jar:jf/f$b.class */
    public class b implements InterfaceC4537d<TMDBTVShowsInfoCallback> {

        /* renamed from: a */
        public final C5374f f30731a;

        public b(C5374f c5374f) {
            this.f30731a = c5374f;
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: a */
        public void mo14532a(InterfaceC4535b<TMDBTVShowsInfoCallback> interfaceC4535b, C4554u<TMDBTVShowsInfoCallback> c4554u) {
            this.f30731a.f30728a.mo15997b();
            if (c4554u.m22954d()) {
                this.f30731a.f30728a.mo16612c0(c4554u.m22952a());
            } else if (c4554u.m22952a() == null) {
                this.f30731a.f30728a.mo15998c("Invalid Request");
            }
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: b */
        public void mo14533b(InterfaceC4535b<TMDBTVShowsInfoCallback> interfaceC4535b, Throwable th2) {
            this.f30731a.f30728a.mo15997b();
            this.f30731a.f30728a.mo15998c(th2.getMessage());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:jf/f$c.class
     */
    /* renamed from: jf.f$c */
    /* loaded from: combined.jar:classes2.jar:jf/f$c.class */
    public class c implements InterfaceC4537d<TMDBTrailerCallback> {

        /* renamed from: a */
        public final C5374f f30732a;

        public c(C5374f c5374f) {
            this.f30732a = c5374f;
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: a */
        public void mo14532a(InterfaceC4535b<TMDBTrailerCallback> interfaceC4535b, C4554u<TMDBTrailerCallback> c4554u) {
            this.f30732a.f30728a.mo15997b();
            if (c4554u.m22954d()) {
                this.f30732a.f30728a.mo16613k(c4554u.m22952a());
            } else if (c4554u.m22952a() == null) {
                this.f30732a.f30728a.mo15998c("Invalid Request");
            }
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: b */
        public void mo14533b(InterfaceC4535b<TMDBTrailerCallback> interfaceC4535b, Throwable th2) {
            this.f30732a.f30728a.mo15997b();
            this.f30732a.f30728a.mo15998c(th2.getMessage());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:jf/f$d.class
     */
    /* renamed from: jf.f$d */
    /* loaded from: combined.jar:classes2.jar:jf/f$d.class */
    public class d implements InterfaceC4537d<TMDBCastsCallback> {

        /* renamed from: a */
        public final C5374f f30733a;

        public d(C5374f c5374f) {
            this.f30733a = c5374f;
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: a */
        public void mo14532a(InterfaceC4535b<TMDBCastsCallback> interfaceC4535b, C4554u<TMDBCastsCallback> c4554u) {
            this.f30733a.f30728a.mo15997b();
            if (c4554u.m22954d()) {
                this.f30733a.f30728a.mo16614r(c4554u.m22952a());
            } else if (c4554u.m22952a() == null) {
                this.f30733a.f30728a.mo15998c("Invalid Request");
            }
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: b */
        public void mo14533b(InterfaceC4535b<TMDBCastsCallback> interfaceC4535b, Throwable th2) {
            this.f30733a.f30728a.mo15997b();
            this.f30733a.f30728a.mo15998c(th2.getMessage());
        }
    }

    public C5374f(InterfaceC8571j interfaceC8571j, Context context) {
        this.f30728a = interfaceC8571j;
        this.f30729b = context;
    }

    /* renamed from: b */
    public void m26720b(int i10) {
        this.f30728a.mo15996a();
        C4555v m26227b0 = C5255e.m26227b0(this.f30729b);
        if (m26227b0 != null) {
            ((RetrofitPost) m26227b0.m22958b(RetrofitPost.class)).m15537i(i10, "f584f73e8848d9ace559deee1e5a849f").mo22862f(new d(this));
        }
    }

    /* renamed from: c */
    public void m26721c(int i10) {
        this.f30728a.mo15996a();
        C4555v m26227b0 = C5255e.m26227b0(this.f30729b);
        if (m26227b0 != null) {
            ((RetrofitPost) m26227b0.m22958b(RetrofitPost.class)).m15532d(i10, "f584f73e8848d9ace559deee1e5a849f").mo22862f(new b(this));
        }
    }

    /* renamed from: d */
    public void m26722d(String str) {
        this.f30728a.mo15996a();
        C4555v m26227b0 = C5255e.m26227b0(this.f30729b);
        if (m26227b0 != null) {
            try {
                ((RetrofitPost) m26227b0.m22958b(RetrofitPost.class)).m15541m("f584f73e8848d9ace559deee1e5a849f", str).mo22862f(new a(this));
            } catch (Exception e10) {
            }
        }
    }

    /* renamed from: e */
    public void m26723e(int i10) {
        this.f30728a.mo15996a();
        C4555v m26227b0 = C5255e.m26227b0(this.f30729b);
        if (m26227b0 != null) {
            ((RetrofitPost) m26227b0.m22958b(RetrofitPost.class)).m15536h(i10, "f584f73e8848d9ace559deee1e5a849f").mo22862f(new c(this));
        }
    }
}

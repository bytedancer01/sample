package p295r0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:r0/d.class
 */
/* renamed from: r0.d */
/* loaded from: combined.jar:classes1.jar:r0/d.class */
public final class C7941d {

    /* renamed from: a */
    public final c f38206a;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:r0/d$a.class
     */
    /* renamed from: r0.d$a */
    /* loaded from: combined.jar:classes1.jar:r0/d$a.class */
    public static final class a implements c {

        /* renamed from: a */
        public final InputContentInfo f38207a;

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f38207a = new InputContentInfo(uri, clipDescription, uri2);
        }

        public a(Object obj) {
            this.f38207a = (InputContentInfo) obj;
        }

        @Override // p295r0.C7941d.c
        /* renamed from: a */
        public Object mo34474a() {
            return this.f38207a;
        }

        @Override // p295r0.C7941d.c
        /* renamed from: b */
        public Uri mo34475b() {
            return this.f38207a.getContentUri();
        }

        @Override // p295r0.C7941d.c
        /* renamed from: c */
        public void mo34476c() {
            this.f38207a.requestPermission();
        }

        @Override // p295r0.C7941d.c
        /* renamed from: d */
        public Uri mo34477d() {
            return this.f38207a.getLinkUri();
        }

        @Override // p295r0.C7941d.c
        public ClipDescription getDescription() {
            return this.f38207a.getDescription();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:r0/d$b.class
     */
    /* renamed from: r0.d$b */
    /* loaded from: combined.jar:classes1.jar:r0/d$b.class */
    public static final class b implements c {

        /* renamed from: a */
        public final Uri f38208a;

        /* renamed from: b */
        public final ClipDescription f38209b;

        /* renamed from: c */
        public final Uri f38210c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f38208a = uri;
            this.f38209b = clipDescription;
            this.f38210c = uri2;
        }

        @Override // p295r0.C7941d.c
        /* renamed from: a */
        public Object mo34474a() {
            return null;
        }

        @Override // p295r0.C7941d.c
        /* renamed from: b */
        public Uri mo34475b() {
            return this.f38208a;
        }

        @Override // p295r0.C7941d.c
        /* renamed from: c */
        public void mo34476c() {
        }

        @Override // p295r0.C7941d.c
        /* renamed from: d */
        public Uri mo34477d() {
            return this.f38210c;
        }

        @Override // p295r0.C7941d.c
        public ClipDescription getDescription() {
            return this.f38209b;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:r0/d$c.class
     */
    /* renamed from: r0.d$c */
    /* loaded from: combined.jar:classes1.jar:r0/d$c.class */
    public interface c {
        /* renamed from: a */
        Object mo34474a();

        /* renamed from: b */
        Uri mo34475b();

        /* renamed from: c */
        void mo34476c();

        /* renamed from: d */
        Uri mo34477d();

        ClipDescription getDescription();
    }

    public C7941d(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f38206a = Build.VERSION.SDK_INT >= 25 ? new a(uri, clipDescription, uri2) : new b(uri, clipDescription, uri2);
    }

    public C7941d(c cVar) {
        this.f38206a = cVar;
    }

    /* renamed from: f */
    public static C7941d m34468f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new C7941d(new a(obj));
        }
        return null;
    }

    /* renamed from: a */
    public Uri m34469a() {
        return this.f38206a.mo34475b();
    }

    /* renamed from: b */
    public ClipDescription m34470b() {
        return this.f38206a.getDescription();
    }

    /* renamed from: c */
    public Uri m34471c() {
        return this.f38206a.mo34477d();
    }

    /* renamed from: d */
    public void m34472d() {
        this.f38206a.mo34476c();
    }

    /* renamed from: e */
    public Object m34473e() {
        return this.f38206a.mo34474a();
    }
}

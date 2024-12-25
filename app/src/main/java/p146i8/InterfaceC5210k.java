package p146i8;

import android.net.Uri;
import java.io.IOException;
import p009a8.InterfaceC0090d0;
import p027b9.InterfaceC0837d0;
import p114g8.InterfaceC4974g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:i8/k.class
 */
/* renamed from: i8.k */
/* loaded from: combined.jar:classes2.jar:i8/k.class */
public interface InterfaceC5210k {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:i8/k$a.class
     */
    /* renamed from: i8.k$a */
    /* loaded from: combined.jar:classes2.jar:i8/k$a.class */
    public interface a {
        /* renamed from: a */
        InterfaceC5210k mo25958a(InterfaceC4974g interfaceC4974g, InterfaceC0837d0 interfaceC0837d0, InterfaceC5209j interfaceC5209j);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:i8/k$b.class
     */
    /* renamed from: i8.k$b */
    /* loaded from: combined.jar:classes2.jar:i8/k$b.class */
    public interface b {
        /* renamed from: e */
        void mo25075e();

        /* renamed from: o */
        boolean mo25076o(Uri uri, InterfaceC0837d0.c cVar, boolean z10);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:i8/k$c.class
     */
    /* renamed from: i8.k$c */
    /* loaded from: combined.jar:classes2.jar:i8/k$c.class */
    public static final class c extends IOException {

        /* renamed from: b */
        public final Uri f29891b;

        public c(Uri uri) {
            this.f29891b = uri;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:i8/k$d.class
     */
    /* renamed from: i8.k$d */
    /* loaded from: combined.jar:classes2.jar:i8/k$d.class */
    public static final class d extends IOException {

        /* renamed from: b */
        public final Uri f29892b;

        public d(Uri uri) {
            this.f29892b = uri;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:i8/k$e.class
     */
    /* renamed from: i8.k$e */
    /* loaded from: combined.jar:classes2.jar:i8/k$e.class */
    public interface e {
        /* renamed from: b */
        void mo12256b(C5206g c5206g);
    }

    /* renamed from: a */
    void mo25988a(b bVar);

    /* renamed from: b */
    void mo25989b(Uri uri);

    /* renamed from: c */
    long mo25990c();

    /* renamed from: d */
    C5205f mo25991d();

    /* renamed from: e */
    void mo25992e(Uri uri);

    /* renamed from: f */
    void mo25993f(Uri uri, InterfaceC0090d0.a aVar, e eVar);

    /* renamed from: g */
    boolean mo25994g(Uri uri);

    /* renamed from: h */
    boolean mo25995h();

    /* renamed from: i */
    boolean mo25996i(Uri uri, long j10);

    /* renamed from: j */
    void mo25997j();

    /* renamed from: l */
    void mo25998l(b bVar);

    /* renamed from: m */
    C5206g mo25999m(Uri uri, boolean z10);

    void stop();
}

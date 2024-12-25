package p088f1;

import android.os.Bundle;
import androidx.lifecycle.InterfaceC0569e0;
import androidx.lifecycle.InterfaceC0579m;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p107g1.C4931c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:f1/a.class
 */
/* renamed from: f1.a */
/* loaded from: combined.jar:classes1.jar:f1/a.class */
public abstract class AbstractC4749a {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:f1/a$a.class
     */
    /* renamed from: f1.a$a */
    /* loaded from: combined.jar:classes1.jar:f1/a$a.class */
    public interface a<D> {
        /* renamed from: a */
        void mo24049a(C4931c<D> c4931c, D d10);

        /* renamed from: b */
        void mo24050b(C4931c<D> c4931c);

        /* renamed from: c */
        C4931c<D> mo24051c(int i10, Bundle bundle);
    }

    /* renamed from: b */
    public static <T extends InterfaceC0579m & InterfaceC0569e0> AbstractC4749a m24045b(T t10) {
        return new C4750b(t10, t10.getViewModelStore());
    }

    @Deprecated
    /* renamed from: a */
    public abstract void mo24046a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: c */
    public abstract <D> C4931c<D> mo24047c(int i10, Bundle bundle, a<D> aVar);

    /* renamed from: d */
    public abstract void mo24048d();
}

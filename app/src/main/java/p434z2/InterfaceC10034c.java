package p434z2;

import p004a3.C0053g;
import p004a3.InterfaceC0050d;
import p109g3.C4935a;
import p109g3.C4936b;
import p109g3.C4937c;
import p109g3.C4938d;
import p109g3.C4939e;
import p173ji.C5410f0;
import p298r3.InterfaceC7951a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:z2/c.class
 */
/* renamed from: z2.c */
/* loaded from: combined.jar:classes1.jar:z2/c.class */
public interface InterfaceC10034c<T> extends InterfaceC7951a {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:z2/c$a.class
     */
    /* renamed from: z2.c$a */
    /* loaded from: combined.jar:classes1.jar:z2/c$a.class */
    public static abstract class a<T> {
        public void onCanceledError(C4935a c4935a) {
            onFailure(c4935a);
        }

        public abstract void onFailure(C4936b c4936b);

        public void onHttpError(C4937c c4937c) {
            onFailure(c4937c);
            C5410f0 m24932b = c4937c.m24932b();
            if (m24932b != null) {
                m24932b.close();
            }
        }

        public void onNetworkError(C4938d c4938d) {
            onFailure(c4938d);
        }

        public void onParseError(C4939e c4939e) {
            onFailure(c4939e);
        }

        public abstract void onResponse(C0053g<T> c0053g);

        public void onStatusEvent(b bVar) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:z2/c$b.class
     */
    /* renamed from: z2.c$b */
    /* loaded from: combined.jar:classes1.jar:z2/c$b.class */
    public enum b {
        SCHEDULED,
        FETCH_CACHE,
        FETCH_NETWORK,
        COMPLETED
    }

    InterfaceC0050d operation();
}

package p278q2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p237o2.ExecutorC6876i;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:q2/b.class
 */
/* renamed from: q2.b */
/* loaded from: combined.jar:classes1.jar:q2/b.class */
public class C7749b implements InterfaceC7748a {

    /* renamed from: a */
    public final ExecutorC6876i f37609a;

    /* renamed from: b */
    public final Handler f37610b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final Executor f37611c = new a(this);

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:q2/b$a.class
     */
    /* renamed from: q2.b$a */
    /* loaded from: combined.jar:classes1.jar:q2/b$a.class */
    public class a implements Executor {

        /* renamed from: b */
        public final C7749b f37612b;

        public a(C7749b c7749b) {
            this.f37612b = c7749b;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f37612b.m33904d(runnable);
        }
    }

    public C7749b(Executor executor) {
        this.f37609a = new ExecutorC6876i(executor);
    }

    @Override // p278q2.InterfaceC7748a
    /* renamed from: a */
    public Executor mo33901a() {
        return this.f37611c;
    }

    @Override // p278q2.InterfaceC7748a
    /* renamed from: b */
    public void mo33902b(Runnable runnable) {
        this.f37609a.execute(runnable);
    }

    @Override // p278q2.InterfaceC7748a
    /* renamed from: c */
    public ExecutorC6876i mo33903c() {
        return this.f37609a;
    }

    /* renamed from: d */
    public void m33904d(Runnable runnable) {
        this.f37610b.post(runnable);
    }
}

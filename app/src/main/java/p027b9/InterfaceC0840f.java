package p027b9;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p027b9.InterfaceC0840f;
import p059d9.C4349a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:b9/f.class
 */
/* renamed from: b9.f */
/* loaded from: combined.jar:classes2.jar:b9/f.class */
public interface InterfaceC0840f {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:b9/f$a.class
     */
    /* renamed from: b9.f$a */
    /* loaded from: combined.jar:classes2.jar:b9/f$a.class */
    public interface a {

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:b9/f$a$a.class
         */
        /* renamed from: b9.f$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes2.jar:b9/f$a$a.class */
        public static final class C10254a {

            /* renamed from: a */
            public final CopyOnWriteArrayList<C10255a> f5788a = new CopyOnWriteArrayList<>();

            /* JADX WARN: Classes with same name are omitted:
              classes2.jar:b9/f$a$a$a.class
             */
            /* renamed from: b9.f$a$a$a, reason: collision with other inner class name */
            /* loaded from: combined.jar:classes2.jar:b9/f$a$a$a.class */
            public static final class C10255a {

                /* renamed from: a */
                public final Handler f5789a;

                /* renamed from: b */
                public final a f5790b;

                /* renamed from: c */
                public boolean f5791c;

                public C10255a(Handler handler, a aVar) {
                    this.f5789a = handler;
                    this.f5790b = aVar;
                }

                /* renamed from: d */
                public void m5352d() {
                    this.f5791c = true;
                }
            }

            /* renamed from: d */
            public static /* synthetic */ void m5345d(C10255a c10255a, int i10, long j10, long j11) {
                c10255a.f5790b.mo5343o(i10, j10, j11);
            }

            /* renamed from: b */
            public void m5346b(Handler handler, a aVar) {
                C4349a.m21882e(handler);
                C4349a.m21882e(aVar);
                m5348e(aVar);
                this.f5788a.add(new C10255a(handler, aVar));
            }

            /* renamed from: c */
            public void m5347c(final int i10, final long j10, final long j11) {
                Iterator<C10255a> it = this.f5788a.iterator();
                while (it.hasNext()) {
                    final C10255a next = it.next();
                    if (!next.f5791c) {
                        next.f5789a.post(new Runnable(next, i10, j10, j11) { // from class: b9.e

                            /* renamed from: b */
                            public final InterfaceC0840f.a.C10254a.C10255a f5764b;

                            /* renamed from: c */
                            public final int f5765c;

                            /* renamed from: d */
                            public final long f5766d;

                            /* renamed from: e */
                            public final long f5767e;

                            {
                                this.f5764b = next;
                                this.f5765c = i10;
                                this.f5766d = j10;
                                this.f5767e = j11;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                InterfaceC0840f.a.C10254a.m5345d(this.f5764b, this.f5765c, this.f5766d, this.f5767e);
                            }
                        });
                    }
                }
            }

            /* renamed from: e */
            public void m5348e(a aVar) {
                Iterator<C10255a> it = this.f5788a.iterator();
                while (it.hasNext()) {
                    C10255a next = it.next();
                    if (next.f5790b == aVar) {
                        next.m5352d();
                        this.f5788a.remove(next);
                    }
                }
            }
        }

        /* renamed from: o */
        void mo5343o(int i10, long j10, long j11);
    }

    /* renamed from: a */
    void mo5338a(a aVar);

    /* renamed from: b */
    long mo5339b();

    /* renamed from: c */
    void mo5340c(Handler handler, a aVar);

    /* renamed from: d */
    InterfaceC0853l0 mo5341d();

    /* renamed from: e */
    long mo5342e();
}

package p071e2;

import android.annotation.SuppressLint;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e2/n.class
 */
/* renamed from: e2.n */
/* loaded from: combined.jar:classes1.jar:e2/n.class */
public interface InterfaceC4585n {

    /* renamed from: a */
    @SuppressLint({"SyntheticAccessor"})
    public static final b.c f27225a = new b.c();

    /* renamed from: b */
    @SuppressLint({"SyntheticAccessor"})
    public static final b.C10287b f27226b = new b.C10287b();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:e2/n$b.class
     */
    /* renamed from: e2.n$b */
    /* loaded from: combined.jar:classes1.jar:e2/n$b.class */
    public static abstract class b {

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:e2/n$b$a.class
         */
        /* renamed from: e2.n$b$a */
        /* loaded from: combined.jar:classes1.jar:e2/n$b$a.class */
        public static final class a extends b {

            /* renamed from: a */
            public final Throwable f27227a;

            public a(Throwable th2) {
                this.f27227a = th2;
            }

            /* renamed from: a */
            public Throwable m23139a() {
                return this.f27227a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", this.f27227a.getMessage());
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:e2/n$b$b.class
         */
        /* renamed from: e2.n$b$b, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes1.jar:e2/n$b$b.class */
        public static final class C10287b extends b {
            public C10287b() {
            }

            public String toString() {
                return "IN_PROGRESS";
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:e2/n$b$c.class
         */
        /* renamed from: e2.n$b$c */
        /* loaded from: combined.jar:classes1.jar:e2/n$b$c.class */
        public static final class c extends b {
            public c() {
            }

            public String toString() {
                return "SUCCESS";
            }
        }
    }
}

package p207m0;

import java.util.Locale;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:m0/f.class
 */
/* renamed from: m0.f */
/* loaded from: combined.jar:classes1.jar:m0/f.class */
public final class C5890f {

    /* renamed from: a */
    public static final InterfaceC5889e f32992a = new e(null, false);

    /* renamed from: b */
    public static final InterfaceC5889e f32993b = new e(null, true);

    /* renamed from: c */
    public static final InterfaceC5889e f32994c;

    /* renamed from: d */
    public static final InterfaceC5889e f32995d;

    /* renamed from: e */
    public static final InterfaceC5889e f32996e;

    /* renamed from: f */
    public static final InterfaceC5889e f32997f;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m0/f$a.class
     */
    /* renamed from: m0.f$a */
    /* loaded from: combined.jar:classes1.jar:m0/f$a.class */
    public static class a implements c {

        /* renamed from: b */
        public static final a f32998b = new a(true);

        /* renamed from: a */
        public final boolean f32999a;

        public a(boolean z10) {
            this.f32999a = z10;
        }

        @Override // p207m0.C5890f.c
        /* renamed from: a */
        public int mo28731a(CharSequence charSequence, int i10, int i11) {
            boolean z10 = false;
            int i12 = i10;
            while (i12 < i11 + i10) {
                int m28729a = C5890f.m28729a(Character.getDirectionality(charSequence.charAt(i12)));
                if (m28729a != 0) {
                    if (m28729a != 1) {
                        continue;
                        i12++;
                        z10 = z10;
                    } else if (!this.f32999a) {
                        return 1;
                    }
                } else if (this.f32999a) {
                    return 0;
                }
                z10 = true;
                i12++;
                z10 = z10;
            }
            if (z10) {
                return this.f32999a ? 1 : 0;
            }
            return 2;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m0/f$b.class
     */
    /* renamed from: m0.f$b */
    /* loaded from: combined.jar:classes1.jar:m0/f$b.class */
    public static class b implements c {

        /* renamed from: a */
        public static final b f33000a = new b();

        @Override // p207m0.C5890f.c
        /* renamed from: a */
        public int mo28731a(CharSequence charSequence, int i10, int i11) {
            int i12 = 2;
            for (int i13 = i10; i13 < i11 + i10 && i12 == 2; i13++) {
                i12 = C5890f.m28730b(Character.getDirectionality(charSequence.charAt(i13)));
            }
            return i12;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m0/f$c.class
     */
    /* renamed from: m0.f$c */
    /* loaded from: combined.jar:classes1.jar:m0/f$c.class */
    public interface c {
        /* renamed from: a */
        int mo28731a(CharSequence charSequence, int i10, int i11);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m0/f$d.class
     */
    /* renamed from: m0.f$d */
    /* loaded from: combined.jar:classes1.jar:m0/f$d.class */
    public static abstract class d implements InterfaceC5889e {

        /* renamed from: a */
        public final c f33001a;

        public d(c cVar) {
            this.f33001a = cVar;
        }

        /* renamed from: a */
        public abstract boolean mo28732a();

        /* renamed from: b */
        public final boolean m28733b(CharSequence charSequence, int i10, int i11) {
            int mo28731a = this.f33001a.mo28731a(charSequence, i10, i11);
            if (mo28731a == 0) {
                return true;
            }
            if (mo28731a != 1) {
                return mo28732a();
            }
            return false;
        }

        @Override // p207m0.InterfaceC5889e
        public boolean isRtl(CharSequence charSequence, int i10, int i11) {
            if (charSequence == null || i10 < 0 || i11 < 0 || charSequence.length() - i11 < i10) {
                throw new IllegalArgumentException();
            }
            return this.f33001a == null ? mo28732a() : m28733b(charSequence, i10, i11);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m0/f$e.class
     */
    /* renamed from: m0.f$e */
    /* loaded from: combined.jar:classes1.jar:m0/f$e.class */
    public static class e extends d {

        /* renamed from: b */
        public final boolean f33002b;

        public e(c cVar, boolean z10) {
            super(cVar);
            this.f33002b = z10;
        }

        @Override // p207m0.C5890f.d
        /* renamed from: a */
        public boolean mo28732a() {
            return this.f33002b;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m0/f$f.class
     */
    /* renamed from: m0.f$f */
    /* loaded from: combined.jar:classes1.jar:m0/f$f.class */
    public static class f extends d {

        /* renamed from: b */
        public static final f f33003b = new f();

        public f() {
            super(null);
        }

        @Override // p207m0.C5890f.d
        /* renamed from: a */
        public boolean mo28732a() {
            boolean z10 = true;
            if (C5891g.m28734a(Locale.getDefault()) != 1) {
                z10 = false;
            }
            return z10;
        }
    }

    static {
        b bVar = b.f33000a;
        f32994c = new e(bVar, false);
        f32995d = new e(bVar, true);
        f32996e = new e(a.f32998b, false);
        f32997f = f.f33003b;
    }

    /* renamed from: a */
    public static int m28729a(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    public static int m28730b(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1 || i10 == 2) {
            return 0;
        }
        switch (i10) {
            case 14:
            case 15:
                return 1;
            case 16:
            case 17:
                return 0;
            default:
                return 2;
        }
    }
}

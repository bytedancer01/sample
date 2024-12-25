package p164j8;

import java.util.Comparator;
import java.util.TreeSet;
import org.jsoup.parser.CharacterReader;
import p164j8.C5321g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:j8/g.class
 */
/* renamed from: j8.g */
/* loaded from: combined.jar:classes2.jar:j8/g.class */
public final class C5321g {

    /* renamed from: a */
    public final TreeSet<a> f30573a = new TreeSet<>(new Comparator() { // from class: j8.f
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m26570d;
            m26570d = C5321g.m26570d((C5321g.a) obj, (C5321g.a) obj2);
            return m26570d;
        }
    });

    /* renamed from: b */
    public int f30574b;

    /* renamed from: c */
    public int f30575c;

    /* renamed from: d */
    public boolean f30576d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:j8/g$a.class
     */
    /* renamed from: j8.g$a */
    /* loaded from: combined.jar:classes2.jar:j8/g$a.class */
    public static final class a {

        /* renamed from: a */
        public final C5319e f30577a;

        /* renamed from: b */
        public final long f30578b;

        public a(C5319e c5319e, long j10) {
            this.f30577a = c5319e;
            this.f30578b = j10;
        }
    }

    public C5321g() {
        m26576i();
    }

    /* renamed from: c */
    public static int m26569c(int i10, int i11) {
        int min;
        int i12 = i10 - i11;
        if (Math.abs(i12) <= 1000 || (min = (Math.min(i10, i11) - Math.max(i10, i11)) + CharacterReader.EOF) >= 1000) {
            return i12;
        }
        return i10 < i11 ? min : -min;
    }

    /* renamed from: d */
    public static /* synthetic */ int m26570d(a aVar, a aVar2) {
        return m26569c(aVar.f30577a.f30560g, aVar2.f30577a.f30560g);
    }

    /* renamed from: e */
    public static int m26571e(int i10) {
        return (i10 + 1) % CharacterReader.EOF;
    }

    /* renamed from: h */
    public static int m26572h(int i10) {
        return i10 == 0 ? 65534 : (i10 - 1) % CharacterReader.EOF;
    }

    /* renamed from: b */
    public final void m26573b(a aVar) {
        synchronized (this) {
            this.f30574b = aVar.f30577a.f30560g;
            this.f30573a.add(aVar);
        }
    }

    /* renamed from: f */
    public boolean m26574f(C5319e c5319e, long j10) {
        synchronized (this) {
            if (this.f30573a.size() >= 5000) {
                throw new IllegalStateException("Queue size limit of 5000 reached.");
            }
            int i10 = c5319e.f30560g;
            if (!this.f30576d) {
                m26576i();
                this.f30575c = m26572h(i10);
                this.f30576d = true;
                m26573b(new a(c5319e, j10));
                return true;
            }
            if (Math.abs(m26569c(i10, m26571e(this.f30574b))) < 1000) {
                if (m26569c(i10, this.f30575c) <= 0) {
                    return false;
                }
                m26573b(new a(c5319e, j10));
                return true;
            }
            this.f30575c = m26572h(i10);
            this.f30573a.clear();
            m26573b(new a(c5319e, j10));
            return true;
        }
    }

    /* renamed from: g */
    public C5319e m26575g(long j10) {
        synchronized (this) {
            if (this.f30573a.isEmpty()) {
                return null;
            }
            a first = this.f30573a.first();
            int i10 = first.f30577a.f30560g;
            if (i10 != m26571e(this.f30575c) && j10 < first.f30578b) {
                return null;
            }
            this.f30573a.pollFirst();
            this.f30575c = i10;
            return first.f30577a;
        }
    }

    /* renamed from: i */
    public void m26576i() {
        synchronized (this) {
            this.f30573a.clear();
            this.f30576d = false;
            this.f30575c = -1;
            this.f30574b = -1;
        }
    }
}

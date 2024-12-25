package p135hh;

import java.math.BigInteger;
import java.net.Inet6Address;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hh/l.class
 */
/* renamed from: hh.l */
/* loaded from: combined.jar:classes2.jar:hh/l.class */
public class C5104l {

    /* renamed from: a */
    public TreeSet<a> f29296a = new TreeSet<>();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hh/l$a.class
     */
    /* renamed from: hh.l$a */
    /* loaded from: combined.jar:classes2.jar:hh/l$a.class */
    public static class a implements Comparable<a> {

        /* renamed from: b */
        public BigInteger f29297b;

        /* renamed from: c */
        public int f29298c;

        /* renamed from: d */
        public boolean f29299d;

        /* renamed from: e */
        public boolean f29300e;

        /* renamed from: f */
        public BigInteger f29301f;

        /* renamed from: g */
        public BigInteger f29302g;

        public a(C5088a c5088a, boolean z10) {
            this.f29299d = z10;
            this.f29297b = BigInteger.valueOf(c5088a.m25396b());
            this.f29298c = c5088a.f29211b;
            this.f29300e = true;
        }

        public a(BigInteger bigInteger, int i10, boolean z10, boolean z11) {
            this.f29297b = bigInteger;
            this.f29298c = i10;
            this.f29299d = z10;
            this.f29300e = z11;
        }

        public a(Inet6Address inet6Address, int i10, boolean z10) {
            this.f29298c = i10;
            this.f29299d = z10;
            this.f29297b = BigInteger.ZERO;
            int length = inet6Address.getAddress().length;
            int i11 = 128;
            for (int i12 = 0; i12 < length; i12++) {
                i11 -= 8;
                this.f29297b = this.f29297b.add(BigInteger.valueOf(r0[i12] & 255).shiftLeft(i11));
            }
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            int compareTo = m25542d().compareTo(aVar.m25542d());
            if (compareTo != 0) {
                return compareTo;
            }
            int i10 = this.f29298c;
            int i11 = aVar.f29298c;
            if (i10 > i11) {
                return -1;
            }
            return i11 == i10 ? 0 : 1;
        }

        /* renamed from: c */
        public boolean m25541c(a aVar) {
            BigInteger m25542d = m25542d();
            BigInteger m25545g = m25545g();
            BigInteger m25542d2 = aVar.m25542d();
            BigInteger m25545g2 = aVar.m25545g();
            boolean z10 = m25542d.compareTo(m25542d2) != 1;
            boolean z11 = m25545g.compareTo(m25545g2) != -1;
            boolean z12 = false;
            if (z10) {
                z12 = false;
                if (z11) {
                    z12 = true;
                }
            }
            return z12;
        }

        /* renamed from: d */
        public BigInteger m25542d() {
            if (this.f29301f == null) {
                this.f29301f = m25546h(false);
            }
            return this.f29301f;
        }

        /* renamed from: e */
        public String m25543e() {
            long longValue = this.f29297b.longValue();
            return String.format(Locale.US, "%d.%d.%d.%d", Long.valueOf((longValue >> 24) % 256), Long.valueOf((longValue >> 16) % 256), Long.valueOf((longValue >> 8) % 256), Long.valueOf(longValue % 256));
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            return this.f29298c == aVar.f29298c && aVar.m25542d().equals(m25542d());
        }

        /* renamed from: f */
        public String m25544f() {
            String format;
            BigInteger bigInteger = this.f29297b;
            String str = null;
            boolean z10 = true;
            while (bigInteger.compareTo(BigInteger.ZERO) == 1) {
                long longValue = bigInteger.mod(BigInteger.valueOf(65536L)).longValue();
                if (str == null) {
                    format = str;
                    if (longValue == 0) {
                        bigInteger = bigInteger.shiftRight(16);
                        z10 = false;
                        str = format;
                    }
                }
                String str2 = str;
                if (str == null) {
                    str2 = str;
                    if (!z10) {
                        str2 = ":";
                    }
                }
                format = z10 ? String.format(Locale.US, "%x", Long.valueOf(longValue), str2) : String.format(Locale.US, "%x:%s", Long.valueOf(longValue), str2);
                bigInteger = bigInteger.shiftRight(16);
                z10 = false;
                str = format;
            }
            return str == null ? "::" : str;
        }

        /* renamed from: g */
        public BigInteger m25545g() {
            if (this.f29302g == null) {
                this.f29302g = m25546h(true);
            }
            return this.f29302g;
        }

        /* renamed from: h */
        public final BigInteger m25546h(boolean z10) {
            BigInteger bigInteger = this.f29297b;
            int i10 = this.f29300e ? 32 - this.f29298c : 128 - this.f29298c;
            for (int i11 = 0; i11 < i10; i11++) {
                bigInteger = z10 ? bigInteger.setBit(i11) : bigInteger.clearBit(i11);
            }
            return bigInteger;
        }

        /* renamed from: i */
        public a[] m25547i() {
            a aVar = new a(m25542d(), this.f29298c + 1, this.f29299d, this.f29300e);
            return new a[]{aVar, new a(aVar.m25545g().add(BigInteger.ONE), this.f29298c + 1, this.f29299d, this.f29300e)};
        }

        public String toString() {
            return this.f29300e ? String.format(Locale.US, "%s/%d", m25543e(), Integer.valueOf(this.f29298c)) : String.format(Locale.US, "%s/%d", m25544f(), Integer.valueOf(this.f29298c));
        }
    }

    /* renamed from: a */
    public void m25533a(C5088a c5088a, boolean z10) {
        this.f29296a.add(new a(c5088a, z10));
    }

    /* renamed from: b */
    public void m25534b(Inet6Address inet6Address, int i10, boolean z10) {
        this.f29296a.add(new a(inet6Address, i10, z10));
    }

    /* renamed from: c */
    public void m25535c() {
        this.f29296a.clear();
    }

    /* renamed from: d */
    public TreeSet<a> m25536d() {
        PriorityQueue priorityQueue = new PriorityQueue((SortedSet) this.f29296a);
        TreeSet<a> treeSet = new TreeSet<>();
        a aVar = (a) priorityQueue.poll();
        a aVar2 = aVar;
        if (aVar == null) {
            return treeSet;
        }
        while (aVar2 != null) {
            a aVar3 = (a) priorityQueue.poll();
            if (aVar3 == null || aVar2.m25545g().compareTo(aVar3.m25542d()) == -1) {
                treeSet.add(aVar2);
            } else if (!aVar2.m25542d().equals(aVar3.m25542d()) || aVar2.f29298c < aVar3.f29298c) {
                if (aVar2.f29299d != aVar3.f29299d) {
                    a[] m25547i = aVar2.m25547i();
                    a aVar4 = m25547i[1];
                    if (aVar4.f29298c != aVar3.f29298c) {
                        priorityQueue.add(aVar4);
                    }
                    priorityQueue.add(aVar3);
                    aVar2 = m25547i[0];
                }
            } else if (aVar2.f29299d != aVar3.f29299d) {
                a[] m25547i2 = aVar3.m25547i();
                if (!priorityQueue.contains(m25547i2[1])) {
                    priorityQueue.add(m25547i2[1]);
                }
                if (!m25547i2[0].m25545g().equals(aVar2.m25545g()) && !priorityQueue.contains(m25547i2[0])) {
                    priorityQueue.add(m25547i2[0]);
                }
            }
            aVar2 = aVar3;
        }
        return treeSet;
    }

    /* renamed from: e */
    public Collection<a> m25537e(boolean z10) {
        Vector vector = new Vector();
        Iterator<a> it = this.f29296a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.f29299d == z10) {
                vector.add(next);
            }
        }
        return vector;
    }

    /* renamed from: f */
    public Collection<a> m25538f() {
        TreeSet<a> m25536d = m25536d();
        Vector vector = new Vector();
        Iterator<a> it = m25536d.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.f29299d) {
                vector.add(next);
            }
        }
        return vector;
    }
}

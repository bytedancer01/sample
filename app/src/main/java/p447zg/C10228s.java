package p447zg;

import com.sun.jna.Native;
import com.sun.jna.Pointer;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:zg/s.class
 */
/* renamed from: zg.s */
/* loaded from: combined.jar:classes2.jar:zg/s.class */
public class C10228s implements CharSequence, Comparable {

    /* renamed from: b */
    public Pointer f46814b;

    /* renamed from: c */
    public String f46815c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:zg/s$a.class
     */
    /* renamed from: zg.s$a */
    /* loaded from: combined.jar:classes2.jar:zg/s$a.class */
    public class a extends C10222m {

        /* renamed from: f */
        public final C10228s f46816f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C10228s c10228s, long j10) {
            super(j10);
            this.f46816f = c10228s;
        }

        @Override // p447zg.C10222m, com.sun.jna.Pointer
        public String toString() {
            return this.f46816f.toString();
        }
    }

    public C10228s(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("String must not be null");
        }
        this.f46815c = str2;
        if ("--WIDE-STRING--".equals(str2)) {
            a aVar = new a(this, (str.length() + 1) * Native.f26129n);
            this.f46814b = aVar;
            aVar.mo21403P(0L, str);
        } else {
            byte[] m21365g = Native.m21365g(str, str2);
            a aVar2 = new a(this, m21365g.length + 1);
            this.f46814b = aVar2;
            aVar2.mo21406S(0L, m21365g, 0, m21365g.length);
            this.f46814b.mo21393F(m21365g.length, (byte) 0);
        }
    }

    public C10228s(String str, boolean z10) {
        this(str, z10 ? "--WIDE-STRING--" : Native.m21369k());
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return toString().charAt(i10);
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj == null) {
            return 1;
        }
        return toString().compareTo(obj.toString());
    }

    /* renamed from: d */
    public Pointer m42794d() {
        return this.f46814b;
    }

    public boolean equals(Object obj) {
        boolean z10 = false;
        if (obj instanceof CharSequence) {
            z10 = false;
            if (compareTo(obj) == 0) {
                z10 = true;
            }
        }
        return z10;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    @Override // java.lang.CharSequence
    public int length() {
        return toString().length();
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return toString().subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return "--WIDE-STRING--".equals(this.f46815c) ? this.f46814b.mo21434t(0L) : this.f46814b.mo21430p(0L, this.f46815c);
    }
}

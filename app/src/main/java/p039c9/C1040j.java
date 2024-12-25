package p039c9;

import java.io.File;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:c9/j.class
 */
/* renamed from: c9.j */
/* loaded from: combined.jar:classes2.jar:c9/j.class */
public class C1040j implements Comparable<C1040j> {

    /* renamed from: b */
    public final String f6975b;

    /* renamed from: c */
    public final long f6976c;

    /* renamed from: d */
    public final long f6977d;

    /* renamed from: e */
    public final boolean f6978e;

    /* renamed from: f */
    public final File f6979f;

    /* renamed from: g */
    public final long f6980g;

    public C1040j(String str, long j10, long j11, long j12, File file) {
        this.f6975b = str;
        this.f6976c = j10;
        this.f6977d = j11;
        this.f6978e = file != null;
        this.f6979f = file;
        this.f6980g = j12;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C1040j c1040j) {
        if (!this.f6975b.equals(c1040j.f6975b)) {
            return this.f6975b.compareTo(c1040j.f6975b);
        }
        long j10 = this.f6976c - c1040j.f6976c;
        return j10 == 0 ? 0 : j10 < 0 ? -1 : 1;
    }

    /* renamed from: d */
    public boolean m6112d() {
        return !this.f6978e;
    }

    /* renamed from: e */
    public boolean m6113e() {
        return this.f6977d == -1;
    }

    public String toString() {
        return "[" + this.f6976c + ", " + this.f6977d + "]";
    }
}

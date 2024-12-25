package p072e3;

import p033c3.C0986f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e3/b.class
 */
/* renamed from: e3.b */
/* loaded from: combined.jar:classes1.jar:e3/b.class */
public final class C4596b {

    /* renamed from: b */
    public static final C4596b f27245b = new C4596b("");

    /* renamed from: a */
    public final String f27246a;

    public C4596b(String str) {
        this.f27246a = str;
    }

    /* renamed from: a */
    public static C4596b m23180a(String str) {
        return new C4596b((String) C0986f.m5892c(str, "key == null"));
    }

    /* renamed from: b */
    public String m23181b() {
        return this.f27246a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4596b) {
            return this.f27246a.equals(((C4596b) obj).f27246a);
        }
        return false;
    }

    public int hashCode() {
        return this.f27246a.hashCode();
    }

    public String toString() {
        return this.f27246a;
    }
}

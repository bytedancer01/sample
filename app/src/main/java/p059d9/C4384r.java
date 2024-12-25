package p059d9;

import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/r.class
 */
/* renamed from: d9.r */
/* loaded from: combined.jar:classes2.jar:d9/r.class */
public final class C4384r {

    /* renamed from: a */
    public String[] f26637a;

    /* renamed from: b */
    public boolean f26638b;

    /* renamed from: c */
    public boolean f26639c;

    public C4384r(String... strArr) {
        this.f26637a = strArr;
    }

    /* renamed from: a */
    public boolean m22218a() {
        synchronized (this) {
            if (this.f26638b) {
                return this.f26639c;
            }
            this.f26638b = true;
            try {
                for (String str : this.f26637a) {
                    System.loadLibrary(str);
                }
                this.f26639c = true;
            } catch (UnsatisfiedLinkError e10) {
                C4392v.m22275i("LibraryLoader", "Failed to load " + Arrays.toString(this.f26637a));
            }
            return this.f26639c;
        }
    }
}

package p055d5;

import p055d5.C4304b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:d5/a.class
 */
/* renamed from: d5.a */
/* loaded from: combined.jar:classes1.jar:d5/a.class */
public class C4303a extends C4304b.c {

    /* renamed from: f */
    public static final String f26426f;

    /* renamed from: g */
    public static final C4303a f26427g;

    /* renamed from: c */
    public final char[] f26428c;

    /* renamed from: d */
    public final int f26429d;

    /* renamed from: e */
    public final String f26430e;

    static {
        String str;
        try {
            str = System.getProperty("line.separator");
        } catch (Throwable th2) {
            str = "\n";
        }
        f26426f = str;
        f26427g = new C4303a("  ", str);
    }

    public C4303a(String str, String str2) {
        this.f26429d = str.length();
        this.f26428c = new char[str.length() * 16];
        int i10 = 0;
        for (int i11 = 0; i11 < 16; i11++) {
            str.getChars(0, str.length(), this.f26428c, i10);
            i10 += str.length();
        }
        this.f26430e = str2;
    }
}

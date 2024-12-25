package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/fragment/app/d0.class
 */
/* renamed from: androidx.fragment.app.d0 */
/* loaded from: combined.jar:classes1.jar:androidx/fragment/app/d0.class */
public final class C0415d0 extends Writer {

    /* renamed from: b */
    public final String f2856b;

    /* renamed from: c */
    public StringBuilder f2857c = new StringBuilder(128);

    public C0415d0(String str) {
        this.f2856b = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m2033f();
    }

    /* renamed from: f */
    public final void m2033f() {
        if (this.f2857c.length() > 0) {
            Log.d(this.f2856b, this.f2857c.toString());
            StringBuilder sb2 = this.f2857c;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m2033f();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                m2033f();
            } else {
                this.f2857c.append(c10);
            }
        }
    }
}

package p139i1;

import android.text.TextUtils;
import p221n0.C6611c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:i1/e.class
 */
/* renamed from: i1.e */
/* loaded from: combined.jar:classes1.jar:i1/e.class */
public class C5151e implements InterfaceC5149c {

    /* renamed from: a */
    public String f29515a;

    /* renamed from: b */
    public int f29516b;

    /* renamed from: c */
    public int f29517c;

    public C5151e(String str, int i10, int i11) {
        this.f29515a = str;
        this.f29516b = i10;
        this.f29517c = i11;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5151e)) {
            return false;
        }
        C5151e c5151e = (C5151e) obj;
        if (this.f29516b < 0 || c5151e.f29516b < 0) {
            return TextUtils.equals(this.f29515a, c5151e.f29515a) && this.f29517c == c5151e.f29517c;
        }
        if (!TextUtils.equals(this.f29515a, c5151e.f29515a) || this.f29516b != c5151e.f29516b || this.f29517c != c5151e.f29517c) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        return C6611c.m30517b(this.f29515a, Integer.valueOf(this.f29517c));
    }
}

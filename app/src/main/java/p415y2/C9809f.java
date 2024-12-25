package p415y2;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import p395x2.C9628g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:y2/f.class
 */
/* renamed from: y2.f */
/* loaded from: combined.jar:classes1.jar:y2/f.class */
public final class C9809f {

    /* renamed from: a */
    public final int f45127a;

    /* renamed from: b */
    public final List<C9628g> f45128b;

    /* renamed from: c */
    public final int f45129c;

    /* renamed from: d */
    public final InputStream f45130d;

    public C9809f(int i10, List<C9628g> list) {
        this(i10, list, -1, null);
    }

    public C9809f(int i10, List<C9628g> list, int i11, InputStream inputStream) {
        this.f45127a = i10;
        this.f45128b = list;
        this.f45129c = i11;
        this.f45130d = inputStream;
    }

    /* renamed from: a */
    public final InputStream m41326a() {
        return this.f45130d;
    }

    /* renamed from: b */
    public final int m41327b() {
        return this.f45129c;
    }

    /* renamed from: c */
    public final List<C9628g> m41328c() {
        return Collections.unmodifiableList(this.f45128b);
    }

    /* renamed from: d */
    public final int m41329d() {
        return this.f45127a;
    }
}

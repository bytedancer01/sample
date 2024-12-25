package dj;

import java.util.Objects;

/* renamed from: dj.j */
/* loaded from: combined.jar:classes3.jar:dj/j.class */
public class C4543j extends RuntimeException {

    /* renamed from: b */
    public final int f26988b;

    /* renamed from: c */
    public final String f26989c;

    /* renamed from: d */
    public final transient C4554u<?> f26990d;

    public C4543j(C4554u<?> c4554u) {
        super(m22878a(c4554u));
        this.f26988b = c4554u.m22953b();
        this.f26989c = c4554u.m22955e();
        this.f26990d = c4554u;
    }

    /* renamed from: a */
    public static String m22878a(C4554u<?> c4554u) {
        Objects.requireNonNull(c4554u, "response == null");
        return "HTTP " + c4554u.m22953b() + " " + c4554u.m22955e();
    }
}

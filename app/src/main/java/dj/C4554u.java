package dj;

import java.util.Objects;
import p173ji.AbstractC5412g0;
import p173ji.C5410f0;

/* renamed from: dj.u */
/* loaded from: combined.jar:classes3.jar:dj/u.class */
public final class C4554u<T> {

    /* renamed from: a */
    public final C5410f0 f27129a;

    /* renamed from: b */
    public final T f27130b;

    /* renamed from: c */
    public final AbstractC5412g0 f27131c;

    public C4554u(C5410f0 c5410f0, T t10, AbstractC5412g0 abstractC5412g0) {
        this.f27129a = c5410f0;
        this.f27130b = t10;
        this.f27131c = abstractC5412g0;
    }

    /* renamed from: c */
    public static <T> C4554u<T> m22950c(AbstractC5412g0 abstractC5412g0, C5410f0 c5410f0) {
        Objects.requireNonNull(abstractC5412g0, "body == null");
        Objects.requireNonNull(c5410f0, "rawResponse == null");
        if (c5410f0.m26926q0()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new C4554u<>(c5410f0, null, abstractC5412g0);
    }

    /* renamed from: g */
    public static <T> C4554u<T> m22951g(T t10, C5410f0 c5410f0) {
        Objects.requireNonNull(c5410f0, "rawResponse == null");
        if (c5410f0.m26926q0()) {
            return new C4554u<>(c5410f0, t10, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    /* renamed from: a */
    public T m22952a() {
        return this.f27130b;
    }

    /* renamed from: b */
    public int m22953b() {
        return this.f27129a.m26925q();
    }

    /* renamed from: d */
    public boolean m22954d() {
        return this.f27129a.m26926q0();
    }

    /* renamed from: e */
    public String m22955e() {
        return this.f27129a.m26929v0();
    }

    /* renamed from: f */
    public C5410f0 m22956f() {
        return this.f27129a;
    }

    public String toString() {
        return this.f27129a.toString();
    }
}

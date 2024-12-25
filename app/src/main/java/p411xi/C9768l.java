package p411xi;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xi/l.class
 */
/* renamed from: xi.l */
/* loaded from: combined.jar:classes2.jar:xi/l.class */
public class C9768l extends C9758c0 {

    /* renamed from: f */
    @NotNull
    public C9758c0 f44540f;

    public C9768l(@NotNull C9758c0 c9758c0) {
        C9367f.m39526e(c9758c0, "delegate");
        this.f44540f = c9758c0;
    }

    @Override // p411xi.C9758c0
    @NotNull
    /* renamed from: a */
    public C9758c0 mo41086a() {
        return this.f44540f.mo41086a();
    }

    @Override // p411xi.C9758c0
    @NotNull
    /* renamed from: b */
    public C9758c0 mo41087b() {
        return this.f44540f.mo41087b();
    }

    @Override // p411xi.C9758c0
    /* renamed from: c */
    public long mo41088c() {
        return this.f44540f.mo41088c();
    }

    @Override // p411xi.C9758c0
    @NotNull
    /* renamed from: d */
    public C9758c0 mo41089d(long j10) {
        return this.f44540f.mo41089d(j10);
    }

    @Override // p411xi.C9758c0
    /* renamed from: e */
    public boolean mo41090e() {
        return this.f44540f.mo41090e();
    }

    @Override // p411xi.C9758c0
    /* renamed from: f */
    public void mo41091f() {
        this.f44540f.mo41091f();
    }

    @Override // p411xi.C9758c0
    @NotNull
    /* renamed from: g */
    public C9758c0 mo41092g(long j10, @NotNull TimeUnit timeUnit) {
        C9367f.m39526e(timeUnit, "unit");
        return this.f44540f.mo41092g(j10, timeUnit);
    }

    @Override // p411xi.C9758c0
    /* renamed from: h */
    public long mo41093h() {
        return this.f44540f.mo41093h();
    }

    @NotNull
    /* renamed from: i */
    public final C9758c0 m41218i() {
        return this.f44540f;
    }

    @NotNull
    /* renamed from: j */
    public final C9768l m41219j(@NotNull C9758c0 c9758c0) {
        C9367f.m39526e(c9758c0, "delegate");
        this.f44540f = c9758c0;
        return this;
    }
}

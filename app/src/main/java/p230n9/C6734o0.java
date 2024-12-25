package p230n9;

import android.os.Handler;
import java.util.HashSet;
import java.util.Set;
import p230n9.C6721i;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n9/o0.class
 */
/* renamed from: n9.o0 */
/* loaded from: combined.jar:classes2.jar:n9/o0.class */
public final class C6734o0 {

    /* renamed from: a */
    public final Set f35195a = new HashSet();

    /* renamed from: b */
    public final long f35196b;

    /* renamed from: c */
    public final Runnable f35197c;

    /* renamed from: d */
    public boolean f35198d;

    /* renamed from: e */
    public final C6721i f35199e;

    public C6734o0(C6721i c6721i, long j10) {
        this.f35199e = c6721i;
        this.f35196b = j10;
        this.f35197c = new C6732n0(this, c6721i);
    }

    /* renamed from: b */
    public final long m31065b() {
        return this.f35196b;
    }

    /* renamed from: d */
    public final void m31066d(C6721i.e eVar) {
        this.f35195a.add(eVar);
    }

    /* renamed from: e */
    public final void m31067e(C6721i.e eVar) {
        this.f35195a.remove(eVar);
    }

    /* renamed from: f */
    public final void m31068f() {
        Handler handler;
        Handler handler2;
        handler = this.f35199e.f35162b;
        handler.removeCallbacks(this.f35197c);
        this.f35198d = true;
        handler2 = this.f35199e.f35162b;
        handler2.postDelayed(this.f35197c, this.f35196b);
    }

    /* renamed from: g */
    public final void m31069g() {
        Handler handler;
        handler = this.f35199e.f35162b;
        handler.removeCallbacks(this.f35197c);
        this.f35198d = false;
    }

    /* renamed from: h */
    public final boolean m31070h() {
        return !this.f35195a.isEmpty();
    }

    /* renamed from: i */
    public final boolean m31071i() {
        return this.f35198d;
    }
}

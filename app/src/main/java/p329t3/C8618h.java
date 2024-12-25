package p329t3;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import p005a4.C0067d;
import p005a4.InterfaceC0065b;
import p022b4.C0796f;
import p022b4.C0797g;
import p022b4.C0799i;
import p022b4.InterfaceC0791a;
import p022b4.InterfaceC0798h;
import p034c4.C0987a;
import p396x3.EnumC9644a;
import p435z3.C10039c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:t3/h.class
 */
/* renamed from: t3.h */
/* loaded from: combined.jar:classes1.jar:t3/h.class */
public class C8618h {

    /* renamed from: a */
    public final Context f40253a;

    /* renamed from: b */
    public C10039c f40254b;

    /* renamed from: c */
    public InterfaceC0065b f40255c;

    /* renamed from: d */
    public InterfaceC0798h f40256d;

    /* renamed from: e */
    public ExecutorService f40257e;

    /* renamed from: f */
    public ExecutorService f40258f;

    /* renamed from: g */
    public EnumC9644a f40259g;

    /* renamed from: h */
    public InterfaceC0791a.a f40260h;

    public C8618h(Context context) {
        this.f40253a = context.getApplicationContext();
    }

    /* renamed from: a */
    public C8617g m37019a() {
        if (this.f40257e == null) {
            this.f40257e = new C0987a(Math.max(1, Runtime.getRuntime().availableProcessors()));
        }
        if (this.f40258f == null) {
            this.f40258f = new C0987a(1);
        }
        C0799i c0799i = new C0799i(this.f40253a);
        if (this.f40255c == null) {
            this.f40255c = new C0067d(c0799i.m5112a());
        }
        if (this.f40256d == null) {
            this.f40256d = new C0797g(c0799i.m5113c());
        }
        if (this.f40260h == null) {
            this.f40260h = new C0796f(this.f40253a);
        }
        if (this.f40254b == null) {
            this.f40254b = new C10039c(this.f40256d, this.f40260h, this.f40258f, this.f40257e);
        }
        if (this.f40259g == null) {
            this.f40259g = EnumC9644a.DEFAULT;
        }
        return new C8617g(this.f40254b, this.f40256d, this.f40255c, this.f40253a, this.f40259g);
    }
}

package p084ei;

import android.os.Handler;
import android.os.Looper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p172jh.C5398q;
import p233nh.InterfaceC6792g;
import p372vh.C9365d;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ei/a.class
 */
/* renamed from: ei.a */
/* loaded from: combined.jar:classes2.jar:ei/a.class */
public final class C4727a extends AbstractC4728b {

    @Nullable
    private volatile C4727a _immediate;

    /* renamed from: c */
    @NotNull
    public final Handler f27872c;

    /* renamed from: d */
    @Nullable
    public final String f27873d;

    /* renamed from: e */
    public final boolean f27874e;

    /* renamed from: f */
    @NotNull
    public final C4727a f27875f;

    public C4727a(@NotNull Handler handler, @Nullable String str) {
        this(handler, str, false);
    }

    public /* synthetic */ C4727a(Handler handler, String str, int i10, C9365d c9365d) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4727a(Handler handler, String str, boolean z10) {
        super(null);
        C4727a c4727a = null;
        this.f27872c = handler;
        this.f27873d = str;
        this.f27874e = z10;
        this._immediate = z10 ? this : c4727a;
        C4727a c4727a2 = this._immediate;
        C4727a c4727a3 = c4727a2;
        if (c4727a2 == null) {
            c4727a3 = new C4727a(handler, str, true);
            this._immediate = c4727a3;
            C5398q c5398q = C5398q.f30770a;
        }
        this.f27875f = c4727a3;
    }

    @Override // p067di.AbstractC4462b0
    /* renamed from: A0 */
    public void mo22632A0(@NotNull InterfaceC6792g interfaceC6792g, @NotNull Runnable runnable) {
        this.f27872c.post(runnable);
    }

    @Override // p067di.AbstractC4462b0
    /* renamed from: B0 */
    public boolean mo22633B0(@NotNull InterfaceC6792g interfaceC6792g) {
        return (this.f27874e && C9367f.m39522a(Looper.myLooper(), this.f27872c.getLooper())) ? false : true;
    }

    @Override // p067di.AbstractC4496m1
    @NotNull
    /* renamed from: E0, reason: merged with bridge method [inline-methods] */
    public C4727a mo22788C0() {
        return this.f27875f;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof C4727a) && ((C4727a) obj).f27872c == this.f27872c;
    }

    public int hashCode() {
        return System.identityHashCode(this.f27872c);
    }

    @Override // p067di.AbstractC4496m1, p067di.AbstractC4462b0
    @NotNull
    public String toString() {
        String m22789D0 = m22789D0();
        String str = m22789D0;
        if (m22789D0 == null) {
            String str2 = this.f27873d;
            String str3 = str2;
            if (str2 == null) {
                str3 = this.f27872c.toString();
            }
            str = str3;
            if (this.f27874e) {
                str = C9367f.m39532k(str3, ".immediate");
            }
        }
        return str;
    }
}

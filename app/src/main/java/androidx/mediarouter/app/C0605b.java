package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0414d;
import p208m1.C5900i;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/mediarouter/app/b.class
 */
/* renamed from: androidx.mediarouter.app.b */
/* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/b.class */
public class C0605b extends DialogInterfaceOnCancelListenerC0414d {

    /* renamed from: r */
    public boolean f3901r = false;

    /* renamed from: s */
    public Dialog f3902s;

    /* renamed from: t */
    public C5900i f3903t;

    public C0605b() {
        m2020F(true);
    }

    /* renamed from: N */
    public final void m3283N() {
        if (this.f3903t == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.f3903t = C5900i.m28852d(arguments.getBundle("selector"));
            }
            if (this.f3903t == null) {
                this.f3903t = C5900i.f33081c;
            }
        }
    }

    /* renamed from: O */
    public C5900i m3284O() {
        m3283N();
        return this.f3903t;
    }

    /* renamed from: S */
    public DialogC0604a mo3285S(Context context, Bundle bundle) {
        return new DialogC0604a(context);
    }

    /* renamed from: T */
    public DialogC0610g m3286T(Context context) {
        return new DialogC0610g(context);
    }

    /* renamed from: U */
    public void m3287U(C5900i c5900i) {
        if (c5900i == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        m3283N();
        if (this.f3903t.equals(c5900i)) {
            return;
        }
        this.f3903t = c5900i;
        Bundle arguments = getArguments();
        Bundle bundle = arguments;
        if (arguments == null) {
            bundle = new Bundle();
        }
        bundle.putBundle("selector", c5900i.m28853a());
        setArguments(bundle);
        Dialog dialog = this.f3902s;
        if (dialog != null) {
            if (this.f3901r) {
                ((DialogC0610g) dialog).m3350i(c5900i);
            } else {
                ((DialogC0604a) dialog).mo3277i(c5900i);
            }
        }
    }

    /* renamed from: X */
    public void m3288X(boolean z10) {
        if (this.f3902s != null) {
            throw new IllegalStateException("This must be called before creating dialog");
        }
        this.f3901r = z10;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.f3902s;
        if (dialog == null) {
            return;
        }
        if (this.f3901r) {
            ((DialogC0610g) dialog).m3351j();
        } else {
            ((DialogC0604a) dialog).m3278j();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0414d
    /* renamed from: x */
    public Dialog mo2029x(Bundle bundle) {
        if (this.f3901r) {
            DialogC0610g m3286T = m3286T(getContext());
            this.f3902s = m3286T;
            m3286T.m3350i(m3284O());
        } else {
            DialogC0604a mo3285S = mo3285S(getContext(), bundle);
            this.f3902s = mo3285S;
            mo3285S.mo3277i(m3284O());
        }
        return this.f3902s;
    }
}

package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0414d;
import p208m1.C5900i;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/mediarouter/app/d.class
 */
/* renamed from: androidx.mediarouter.app.d */
/* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/d.class */
public class C0607d extends DialogInterfaceOnCancelListenerC0414d {

    /* renamed from: r */
    public boolean f4003r = false;

    /* renamed from: s */
    public Dialog f4004s;

    /* renamed from: t */
    public C5900i f4005t;

    public C0607d() {
        m2020F(true);
    }

    /* renamed from: N */
    public final void m3330N() {
        if (this.f4005t == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.f4005t = C5900i.m28852d(arguments.getBundle("selector"));
            }
            if (this.f4005t == null) {
                this.f4005t = C5900i.f33081c;
            }
        }
    }

    /* renamed from: O */
    public DialogC0606c m3331O(Context context, Bundle bundle) {
        return new DialogC0606c(context);
    }

    /* renamed from: S */
    public DialogC0611h m3332S(Context context) {
        return new DialogC0611h(context);
    }

    /* renamed from: T */
    public void m3333T(C5900i c5900i) {
        if (c5900i == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        m3330N();
        if (this.f4005t.equals(c5900i)) {
            return;
        }
        this.f4005t = c5900i;
        Bundle arguments = getArguments();
        Bundle bundle = arguments;
        if (arguments == null) {
            bundle = new Bundle();
        }
        bundle.putBundle("selector", c5900i.m28853a());
        setArguments(bundle);
        Dialog dialog = this.f4004s;
        if (dialog == null || !this.f4003r) {
            return;
        }
        ((DialogC0611h) dialog).m3371o(c5900i);
    }

    /* renamed from: U */
    public void m3334U(boolean z10) {
        if (this.f4004s != null) {
            throw new IllegalStateException("This must be called before creating dialog");
        }
        this.f4003r = z10;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.f4004s;
        if (dialog != null) {
            if (this.f4003r) {
                ((DialogC0611h) dialog).m3373q();
            } else {
                ((DialogC0606c) dialog).m3302L();
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0414d, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.f4004s;
        if (dialog == null || this.f4003r) {
            return;
        }
        ((DialogC0606c) dialog).m3313m(false);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0414d
    /* renamed from: x */
    public Dialog mo2029x(Bundle bundle) {
        if (this.f4003r) {
            DialogC0611h m3332S = m3332S(getContext());
            this.f4004s = m3332S;
            m3332S.m3371o(this.f4005t);
        } else {
            this.f4004s = m3331O(getContext(), bundle);
        }
        return this.f4004s;
    }
}

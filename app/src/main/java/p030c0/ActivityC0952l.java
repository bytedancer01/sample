package p030c0;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.AbstractC0572g;
import androidx.lifecycle.C0580n;
import androidx.lifecycle.FragmentC0589w;
import androidx.lifecycle.InterfaceC0579m;
import p235o0.C6823g;
import p294r.C7936i;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c0/l.class
 */
/* renamed from: c0.l */
/* loaded from: combined.jar:classes1.jar:c0/l.class */
public class ActivityC0952l extends Activity implements InterfaceC0579m, C6823g.a {
    private C7936i<Class<? extends a>, a> mExtraDataMap = new C7936i<>();
    private C0580n mLifecycleRegistry = new C0580n(this);

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c0/l$a.class
     */
    @Deprecated
    /* renamed from: c0.l$a */
    /* loaded from: combined.jar:classes1.jar:c0/l$a.class */
    public static class a {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C6823g.m31466d(decorView, keyEvent)) {
            return C6823g.m31467e(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C6823g.m31466d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Deprecated
    public <T extends a> T getExtraData(Class<T> cls) {
        return (T) this.mExtraDataMap.get(cls);
    }

    public AbstractC0572g getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentC0589w.m3193g(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.mLifecycleRegistry.m3168j(AbstractC0572g.c.CREATED);
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public void putExtraData(a aVar) {
        this.mExtraDataMap.put(aVar.getClass(), aVar);
    }

    @Override // p235o0.C6823g.a
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}

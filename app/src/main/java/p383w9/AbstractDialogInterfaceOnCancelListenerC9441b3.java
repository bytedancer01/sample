package p383w9;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;
import la.HandlerC5836j;
import p350u9.C8804b;
import p350u9.C8812f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/b3.class
 */
/* renamed from: w9.b3 */
/* loaded from: combined.jar:classes2.jar:w9/b3.class */
public abstract class AbstractDialogInterfaceOnCancelListenerC9441b3 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: c */
    public volatile boolean f43212c;

    /* renamed from: d */
    public final AtomicReference<C9542x2> f43213d;

    /* renamed from: e */
    public final Handler f43214e;

    /* renamed from: f */
    public final C8812f f43215f;

    public AbstractDialogInterfaceOnCancelListenerC9441b3(InterfaceC9467h interfaceC9467h, C8812f c8812f) {
        super(interfaceC9467h);
        this.f43213d = new AtomicReference<>(null);
        this.f43214e = new HandlerC5836j(Looper.getMainLooper());
        this.f43215f = c8812f;
    }

    /* renamed from: p */
    public static final int m39801p(C9542x2 c9542x2) {
        if (c9542x2 == null) {
            return -1;
        }
        return c9542x2.m40077a();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: e */
    public final void mo13157e(int i10, int i11, Intent intent) {
        C9542x2 c9542x2 = this.f43213d.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int mo37680i = this.f43215f.mo37680i(m13156b());
                if (mo37680i == 0) {
                    m39807o();
                    return;
                } else {
                    if (c9542x2 == null) {
                        return;
                    }
                    if (c9542x2.m40078b().m37659P() == 18 && mo37680i == 18) {
                        return;
                    }
                }
            }
        } else {
            if (i11 == -1) {
                m39807o();
                return;
            }
            if (i11 == 0) {
                if (c9542x2 == null) {
                    return;
                }
                int i12 = 13;
                if (intent != null) {
                    i12 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                m39804l(new C8804b(i12, null, c9542x2.m40078b().toString()), m39801p(c9542x2));
                return;
            }
        }
        if (c9542x2 != null) {
            m39804l(c9542x2.m40078b(), c9542x2.m40077a());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: f */
    public final void mo13158f(Bundle bundle) {
        super.mo13158f(bundle);
        if (bundle != null) {
            this.f43213d.set(bundle.getBoolean("resolving_error", false) ? new C9542x2(new C8804b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: i */
    public final void mo13161i(Bundle bundle) {
        super.mo13161i(bundle);
        C9542x2 c9542x2 = this.f43213d.get();
        if (c9542x2 == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", c9542x2.m40077a());
        bundle.putInt("failed_status", c9542x2.m40078b().m37659P());
        bundle.putParcelable("failed_resolution", c9542x2.m40078b().m37661R());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: j */
    public void mo13162j() {
        super.mo13162j();
        this.f43212c = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: k */
    public void mo13163k() {
        super.mo13163k();
        this.f43212c = false;
    }

    /* renamed from: l */
    public final void m39804l(C8804b c8804b, int i10) {
        this.f43213d.set(null);
        mo39805m(c8804b, i10);
    }

    /* renamed from: m */
    public abstract void mo39805m(C8804b c8804b, int i10);

    /* renamed from: n */
    public abstract void mo39806n();

    /* renamed from: o */
    public final void m39807o() {
        this.f43213d.set(null);
        mo39806n();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        m39804l(new C8804b(13, null), m39801p(this.f43213d.get()));
    }

    /* renamed from: s */
    public final void m39808s(C8804b c8804b, int i10) {
        C9542x2 c9542x2 = new C9542x2(c8804b, i10);
        if (C9436a3.m39798a(this.f43213d, null, c9542x2)) {
            this.f43214e.post(new RunnableC9550z2(this, c9542x2));
        }
    }
}

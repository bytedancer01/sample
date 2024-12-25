package p244o9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import p200l9.C5794p;
import p216m9.C5991t;
import p230n9.C6719h;
import p230n9.C6721i;
import p304r9.C8015b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:o9/s.class
 */
/* renamed from: o9.s */
/* loaded from: combined.jar:classes2.jar:o9/s.class */
public final class C6949s extends MediaSessionCompat.Callback {

    /* renamed from: a */
    public final C6952v f35903a;

    public C6949s(C6952v c6952v) {
        this.f35903a = c6952v;
    }

    /* renamed from: a */
    public final void m31916a(long j10) {
        C6721i c6721i;
        c6721i = this.f35903a.f35919n;
        if (c6721i == null) {
            return;
        }
        m31917b(Math.min(c6721i.m31018o(), Math.max(0L, c6721i.m31006g() + j10)));
    }

    /* renamed from: b */
    public final void m31917b(long j10) {
        C6721i c6721i;
        c6721i = this.f35903a.f35919n;
        if (c6721i == null) {
            return;
        }
        C5794p.a aVar = new C5794p.a();
        aVar.m28301d(j10);
        c6721i.m30992S(aVar.m28298a());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        C8015b c8015b;
        boolean z10;
        C6719h c6719h;
        C6719h c6719h2;
        C5991t c5991t;
        C5991t c5991t2;
        C5991t c5991t3;
        C5991t c5991t4;
        ComponentName componentName;
        Context context;
        c8015b = C6952v.f35905w;
        c8015b.m34873a("onCustomAction with action = %s", str);
        switch (str.hashCode()) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    z10 = true;
                    break;
                }
                z10 = -1;
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    z10 = 2;
                    break;
                }
                z10 = -1;
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    z10 = 3;
                    break;
                }
                z10 = -1;
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    z10 = false;
                    break;
                }
                z10 = -1;
                break;
            default:
                z10 = -1;
                break;
        }
        if (!z10) {
            c6719h = this.f35903a.f35910e;
            m31916a(c6719h.m30939d0());
            return;
        }
        if (z10) {
            c6719h2 = this.f35903a.f35910e;
            m31916a(-c6719h2.m30939d0());
            return;
        }
        if (z10 == 2) {
            C6952v c6952v = this.f35903a;
            c5991t = c6952v.f35909d;
            if (c5991t != null) {
                c5991t2 = c6952v.f35909d;
                c5991t2.m29357b(true);
                return;
            }
            return;
        }
        if (z10 != 3) {
            Intent intent = new Intent(str);
            componentName = this.f35903a.f35912g;
            intent.setComponent(componentName);
            context = this.f35903a.f35906a;
            context.sendBroadcast(intent);
            return;
        }
        C6952v c6952v2 = this.f35903a;
        c5991t3 = c6952v2.f35909d;
        if (c5991t3 != null) {
            c5991t4 = c6952v2.f35909d;
            c5991t4.m29357b(false);
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        C8015b c8015b;
        C6721i c6721i;
        C6721i c6721i2;
        c8015b = C6952v.f35905w;
        c8015b.m34873a("onMediaButtonEvent", new Object[0]);
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null) {
            return true;
        }
        if (keyEvent.getKeyCode() != 127 && keyEvent.getKeyCode() != 126) {
            return true;
        }
        C6952v c6952v = this.f35903a;
        c6721i = c6952v.f35919n;
        if (c6721i == null) {
            return true;
        }
        c6721i2 = c6952v.f35919n;
        c6721i2.m30995V();
        return true;
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPause() {
        C8015b c8015b;
        C6721i c6721i;
        C6721i c6721i2;
        c8015b = C6952v.f35905w;
        c8015b.m34873a("onPause", new Object[0]);
        C6952v c6952v = this.f35903a;
        c6721i = c6952v.f35919n;
        if (c6721i != null) {
            c6721i2 = c6952v.f35919n;
            c6721i2.m30995V();
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPlay() {
        C8015b c8015b;
        C6721i c6721i;
        C6721i c6721i2;
        c8015b = C6952v.f35905w;
        c8015b.m34873a("onPlay", new Object[0]);
        C6952v c6952v = this.f35903a;
        c6721i = c6952v.f35919n;
        if (c6721i != null) {
            c6721i2 = c6952v.f35919n;
            c6721i2.m30995V();
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSeekTo(long j10) {
        C8015b c8015b;
        c8015b = C6952v.f35905w;
        c8015b.m34873a("onSeekTo %d", Long.valueOf(j10));
        m31917b(j10);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSkipToNext() {
        C8015b c8015b;
        C6721i c6721i;
        C6721i c6721i2;
        c8015b = C6952v.f35905w;
        c8015b.m34873a("onSkipToNext", new Object[0]);
        C6952v c6952v = this.f35903a;
        c6721i = c6952v.f35919n;
        if (c6721i != null) {
            c6721i2 = c6952v.f35919n;
            c6721i2.m30982I(null);
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSkipToPrevious() {
        C8015b c8015b;
        C6721i c6721i;
        C6721i c6721i2;
        c8015b = C6952v.f35905w;
        c8015b.m34873a("onSkipToPrevious", new Object[0]);
        C6952v c6952v = this.f35903a;
        c6721i = c6952v.f35919n;
        if (c6721i != null) {
            c6721i2 = c6952v.f35919n;
            c6721i2.m30983J(null);
        }
    }
}

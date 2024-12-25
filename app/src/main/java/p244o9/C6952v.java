package p244o9;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import java.util.Iterator;
import java.util.List;
import ma.BinderC6069d0;
import ma.C6364r1;
import ma.HandlerC6385s1;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p060da.C4414m;
import p200l9.C5782l;
import p200l9.C5791o;
import p216m9.C5938b;
import p216m9.C5941c;
import p216m9.C5980p;
import p216m9.C5991t;
import p230n9.C6698a;
import p230n9.C6704c;
import p230n9.C6713f;
import p230n9.C6719h;
import p230n9.C6721i;
import p230n9.InterfaceC6752x0;
import p304r9.C8015b;
import p402x9.C9691a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:o9/v.class
 */
/* renamed from: o9.v */
/* loaded from: combined.jar:classes2.jar:o9/v.class */
public final class C6952v {

    /* renamed from: w */
    public static final C8015b f35905w = new C8015b("MediaSessionManager");

    /* renamed from: a */
    public final Context f35906a;

    /* renamed from: b */
    public final C5941c f35907b;

    /* renamed from: c */
    public final BinderC6069d0 f35908c;

    /* renamed from: d */
    public final C5991t f35909d;

    /* renamed from: e */
    public final C6719h f35910e;

    /* renamed from: f */
    public final ComponentName f35911f;

    /* renamed from: g */
    public final ComponentName f35912g;

    /* renamed from: h */
    public final C6932b f35913h;

    /* renamed from: i */
    public final C6932b f35914i;

    /* renamed from: j */
    public final C6945o f35915j;

    /* renamed from: k */
    public final Handler f35916k;

    /* renamed from: l */
    public final Runnable f35917l;

    /* renamed from: m */
    public final C6721i.a f35918m;

    /* renamed from: n */
    public C6721i f35919n;

    /* renamed from: o */
    public CastDevice f35920o;

    /* renamed from: p */
    public MediaSessionCompat f35921p;

    /* renamed from: q */
    public MediaSessionCompat.Callback f35922q;

    /* renamed from: r */
    public boolean f35923r;

    /* renamed from: s */
    public PlaybackStateCompat.CustomAction f35924s;

    /* renamed from: t */
    public PlaybackStateCompat.CustomAction f35925t;

    /* renamed from: u */
    public PlaybackStateCompat.CustomAction f35926u;

    /* renamed from: v */
    public PlaybackStateCompat.CustomAction f35927v;

    public C6952v(Context context, C5941c c5941c, BinderC6069d0 binderC6069d0) {
        this.f35906a = context;
        this.f35907b = c5941c;
        this.f35908c = binderC6069d0;
        C5938b m29234d = C5938b.m29234d();
        this.f35909d = m29234d != null ? m29234d.m29243c() : null;
        C6698a m29251P = c5941c.m29251P();
        this.f35910e = m29251P == null ? null : m29251P.m30860T();
        this.f35918m = new C6951u(this, null);
        String m30856P = m29251P == null ? null : m29251P.m30856P();
        this.f35911f = !TextUtils.isEmpty(m30856P) ? new ComponentName(context, m30856P) : null;
        String m30858R = m29251P == null ? null : m29251P.m30858R();
        this.f35912g = !TextUtils.isEmpty(m30858R) ? new ComponentName(context, m30858R) : null;
        C6932b c6932b = new C6932b(context);
        this.f35913h = c6932b;
        c6932b.m31902c(new C6947q(this));
        C6932b c6932b2 = new C6932b(context);
        this.f35914i = c6932b2;
        c6932b2.m31902c(new C6948r(this));
        this.f35916k = new HandlerC6385s1(Looper.getMainLooper());
        this.f35915j = C6945o.m31911e(c5941c) ? new C6945o(context) : null;
        this.f35917l = new Runnable(this) { // from class: o9.p

            /* renamed from: b */
            public final C6952v f35900b;

            {
                this.f35900b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f35900b.m31928j();
            }
        };
    }

    /* renamed from: v */
    public static final boolean m31925v(String str) {
        return TextUtils.equals(str, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_PREV) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_NEXT);
    }

    /* renamed from: h */
    public final void m31926h(C6721i c6721i, CastDevice castDevice) {
        AudioManager audioManager;
        C5941c c5941c = this.f35907b;
        C6698a m29251P = c5941c == null ? null : c5941c.m29251P();
        if (this.f35923r || this.f35907b == null || m29251P == null || this.f35910e == null || c6721i == null || castDevice == null || this.f35912g == null) {
            f35905w.m34873a("skip attaching media session", new Object[0]);
            return;
        }
        this.f35919n = c6721i;
        c6721i.m30986M(this.f35918m);
        this.f35920o = castDevice;
        if (!C4414m.m22455f() && (audioManager = (AudioManager) this.f35906a.getSystemService("audio")) != null) {
            audioManager.requestAudioFocus(null, 3, 3);
        }
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(this.f35912g);
        PendingIntent broadcast = PendingIntent.getBroadcast(this.f35906a, 0, intent, C6364r1.f33992a);
        if (m29251P.m30859S()) {
            MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(this.f35906a, "CastMediaSession", this.f35912g, broadcast);
            this.f35921p = mediaSessionCompat;
            m31939u(0, null);
            CastDevice castDevice2 = this.f35920o;
            if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.m13041R())) {
                mediaSessionCompat.setMetadata(new MediaMetadataCompat.Builder().putString(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, this.f35906a.getResources().getString(C5980p.f33550b, this.f35920o.m13041R())).build());
            }
            C6949s c6949s = new C6949s(this);
            this.f35922q = c6949s;
            mediaSessionCompat.setCallback(c6949s);
            mediaSessionCompat.setActive(true);
            this.f35908c.m29519D1(mediaSessionCompat);
        }
        this.f35923r = true;
        m31930l(false);
    }

    /* renamed from: i */
    public final void m31927i(int i10) {
        AudioManager audioManager;
        if (this.f35923r) {
            this.f35923r = false;
            C6721i c6721i = this.f35919n;
            if (c6721i != null) {
                c6721i.m30996W(this.f35918m);
            }
            if (!C4414m.m22455f() && (audioManager = (AudioManager) this.f35906a.getSystemService("audio")) != null) {
                audioManager.abandonAudioFocus(null);
            }
            this.f35908c.m29519D1(null);
            C6932b c6932b = this.f35913h;
            if (c6932b != null) {
                c6932b.m31900a();
            }
            C6932b c6932b2 = this.f35914i;
            if (c6932b2 != null) {
                c6932b2.m31900a();
            }
            MediaSessionCompat mediaSessionCompat = this.f35921p;
            if (mediaSessionCompat != null) {
                mediaSessionCompat.setCallback(null);
                this.f35921p.setMetadata(new MediaMetadataCompat.Builder().build());
                m31939u(0, null);
            }
            MediaSessionCompat mediaSessionCompat2 = this.f35921p;
            if (mediaSessionCompat2 != null) {
                mediaSessionCompat2.setActive(false);
                this.f35921p.release();
                this.f35921p = null;
            }
            this.f35919n = null;
            this.f35920o = null;
            this.f35922q = null;
            m31937s();
            if (i10 == 0) {
                m31938t();
            }
        }
    }

    /* renamed from: j */
    public final /* synthetic */ void m31928j() {
        m31936r(false);
    }

    /* renamed from: k */
    public final void m31929k(CastDevice castDevice) {
        f35905w.m34877e("update Cast device to %s", castDevice);
        this.f35920o = castDevice;
        m31930l(false);
    }

    /* renamed from: l */
    public final void m31930l(boolean z10) {
        C6721i c6721i = this.f35919n;
        if (c6721i == null) {
            return;
        }
        int m30997X = c6721i.m30997X();
        MediaInfo m31009j = c6721i.m31009j();
        MediaInfo mediaInfo = m31009j;
        if (c6721i.m31026s()) {
            C5791o m31008i = c6721i.m31008i();
            mediaInfo = m31009j;
            if (m31008i != null) {
                mediaInfo = m31009j;
                if (m31008i.m28283T() != null) {
                    mediaInfo = m31008i.m28283T();
                }
            }
        }
        m31939u(m30997X, mediaInfo);
        if (!c6721i.m31020p()) {
            m31937s();
            m31938t();
        } else if (m30997X != 0) {
            C6945o c6945o = this.f35915j;
            if (c6945o != null) {
                f35905w.m34873a("Update media notification.", new Object[0]);
                c6945o.m31913d(this.f35920o, this.f35919n, this.f35921p, z10);
            }
            if (c6721i.m31026s()) {
                return;
            }
            m31936r(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public final long m31931m(String str, int i10, Bundle bundle) {
        boolean z10;
        String str2;
        int hashCode = str.hashCode();
        if (hashCode == -945151566) {
            if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                z10 = 2;
            }
            z10 = -1;
        } else if (hashCode != -945080078) {
            if (hashCode == 235550565 && str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                z10 = false;
            }
            z10 = -1;
        } else {
            if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                z10 = true;
            }
            z10 = -1;
        }
        long j10 = 0;
        if (!z10) {
            if (i10 == 3) {
                j10 = 514;
                i10 = 3;
            } else {
                j10 = 512;
            }
            if (i10 == 2) {
                return 516L;
            }
        } else if (z10) {
            C6721i c6721i = this.f35919n;
            if (c6721i == null || !c6721i.m31019o0()) {
                str2 = "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS";
                bundle.putBoolean(str2, true);
                return 0L;
            }
            j10 = 16;
        } else if (z10 == 2) {
            C6721i c6721i2 = this.f35919n;
            if (c6721i2 == null || !c6721i2.m31017n0()) {
                str2 = "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT";
                bundle.putBoolean(str2, true);
                return 0L;
            }
            j10 = 32;
        }
        return j10;
    }

    /* renamed from: n */
    public final Uri m31932n(C5782l c5782l, int i10) {
        C6698a m29251P = this.f35907b.m29251P();
        C6704c m30857Q = m29251P == null ? null : m29251P.m30857Q();
        C9691a m30872a = m30857Q != null ? m30857Q.m30872a(c5782l, i10) : c5782l.m28248U() ? c5782l.m28244Q().get(0) : null;
        if (m30872a == null) {
            return null;
        }
        return m30872a.m40801P();
    }

    /* renamed from: o */
    public final MediaMetadataCompat.Builder m31933o() {
        MediaSessionCompat mediaSessionCompat = this.f35921p;
        MediaMetadataCompat metadata = mediaSessionCompat == null ? null : mediaSessionCompat.getController().getMetadata();
        return metadata == null ? new MediaMetadataCompat.Builder() : new MediaMetadataCompat.Builder(metadata);
    }

    /* renamed from: p */
    public final void m31934p(Bitmap bitmap, int i10) {
        MediaSessionCompat mediaSessionCompat = this.f35921p;
        if (mediaSessionCompat == null) {
            return;
        }
        Bitmap bitmap2 = bitmap;
        if (bitmap == null) {
            bitmap2 = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            bitmap2.eraseColor(0);
        }
        mediaSessionCompat.setMetadata(m31933o().putBitmap(i10 == 0 ? MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON : MediaMetadataCompat.METADATA_KEY_ALBUM_ART, bitmap2).build());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public final void m31935q(PlaybackStateCompat.Builder builder, String str, C6713f c6713f) {
        boolean z10;
        PlaybackStateCompat.CustomAction customAction;
        C6719h c6719h;
        C6719h c6719h2;
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
            if (this.f35924s == null && (c6719h = this.f35910e) != null) {
                long m30939d0 = c6719h.m30939d0();
                this.f35924s = new PlaybackStateCompat.CustomAction.Builder(MediaIntentReceiver.ACTION_FORWARD, this.f35906a.getResources().getString(C6953w.m31941b(this.f35910e, m30939d0)), C6953w.m31940a(this.f35910e, m30939d0)).build();
            }
            customAction = this.f35924s;
        } else if (z10) {
            if (this.f35925t == null && (c6719h2 = this.f35910e) != null) {
                long m30939d02 = c6719h2.m30939d0();
                this.f35925t = new PlaybackStateCompat.CustomAction.Builder(MediaIntentReceiver.ACTION_REWIND, this.f35906a.getResources().getString(C6953w.m31943d(this.f35910e, m30939d02)), C6953w.m31942c(this.f35910e, m30939d02)).build();
            }
            customAction = this.f35925t;
        } else if (z10 == 2) {
            if (this.f35926u == null && this.f35910e != null) {
                this.f35926u = new PlaybackStateCompat.CustomAction.Builder(MediaIntentReceiver.ACTION_STOP_CASTING, this.f35906a.getResources().getString(this.f35910e.m30944i0()), this.f35910e.m30928S()).build();
            }
            customAction = this.f35926u;
        } else if (z10 != 3) {
            customAction = c6713f != null ? new PlaybackStateCompat.CustomAction.Builder(str, c6713f.m30913Q(), c6713f.m30914R()).build() : null;
        } else {
            if (this.f35927v == null && this.f35910e != null) {
                this.f35927v = new PlaybackStateCompat.CustomAction.Builder(MediaIntentReceiver.ACTION_DISCONNECT, this.f35906a.getResources().getString(this.f35910e.m30944i0()), this.f35910e.m30928S()).build();
            }
            customAction = this.f35927v;
        }
        if (customAction != null) {
            builder.addCustomAction(customAction);
        }
    }

    @RequiresNonNull({"appContext", "handler", "options"})
    /* renamed from: r */
    public final void m31936r(boolean z10) {
        if (this.f35907b.m29252Q()) {
            Runnable runnable = this.f35917l;
            if (runnable != null) {
                this.f35916k.removeCallbacks(runnable);
            }
            Intent intent = new Intent(this.f35906a, (Class<?>) ReconnectionService.class);
            intent.setPackage(this.f35906a.getPackageName());
            try {
                this.f35906a.startService(intent);
            } catch (IllegalStateException e10) {
                if (z10) {
                    this.f35916k.postDelayed(this.f35917l, 1000L);
                }
            }
        }
    }

    /* renamed from: s */
    public final void m31937s() {
        C6945o c6945o = this.f35915j;
        if (c6945o != null) {
            f35905w.m34873a("Stopping media notification.", new Object[0]);
            c6945o.m31912c();
        }
    }

    /* renamed from: t */
    public final void m31938t() {
        if (this.f35907b.m29252Q()) {
            this.f35916k.removeCallbacks(this.f35917l);
            Intent intent = new Intent(this.f35906a, (Class<?>) ReconnectionService.class);
            intent.setPackage(this.f35906a.getPackageName());
            this.f35906a.stopService(intent);
        }
    }

    /* renamed from: u */
    public final void m31939u(int i10, MediaInfo mediaInfo) {
        MediaSessionCompat mediaSessionCompat;
        C5782l m13065Y;
        PendingIntent activity;
        long j10;
        MediaSessionCompat mediaSessionCompat2 = this.f35921p;
        if (mediaSessionCompat2 == null) {
            return;
        }
        Bundle bundle = new Bundle();
        PlaybackStateCompat.Builder builder = new PlaybackStateCompat.Builder();
        C6721i c6721i = this.f35919n;
        PlaybackStateCompat.Builder builder2 = builder;
        if (c6721i != null) {
            if (this.f35915j == null) {
                builder2 = builder;
            } else {
                builder.setState(i10, (c6721i.m30997X() == 0 || c6721i.m31024r()) ? 0L : c6721i.m31006g(), 1.0f);
                if (i10 == 0) {
                    builder2 = builder;
                } else {
                    C6719h c6719h = this.f35910e;
                    InterfaceC6752x0 m30956u0 = c6719h != null ? c6719h.m30956u0() : null;
                    C6721i c6721i2 = this.f35919n;
                    long j11 = (c6721i2 == null || c6721i2.m31024r() || this.f35919n.m31030v()) ? 0L : 256L;
                    if (m30956u0 != null) {
                        List m31945f = C6953w.m31945f(m30956u0);
                        j10 = j11;
                        if (m31945f != null) {
                            Iterator it = m31945f.iterator();
                            while (true) {
                                j10 = j11;
                                if (!it.hasNext()) {
                                    break;
                                }
                                C6713f c6713f = (C6713f) it.next();
                                String m30912P = c6713f.m30912P();
                                if (m31925v(m30912P)) {
                                    j11 |= m31931m(m30912P, i10, bundle);
                                } else {
                                    m31935q(builder, m30912P, c6713f);
                                }
                            }
                        }
                    } else {
                        C6719h c6719h2 = this.f35910e;
                        j10 = j11;
                        if (c6719h2 != null) {
                            Iterator<String> it2 = c6719h2.m30925P().iterator();
                            while (true) {
                                j10 = j11;
                                if (!it2.hasNext()) {
                                    break;
                                }
                                String next = it2.next();
                                if (m31925v(next)) {
                                    j11 |= m31931m(next, i10, bundle);
                                } else {
                                    m31935q(builder, next, null);
                                }
                            }
                        }
                    }
                    builder2 = builder.setActions(j10);
                }
            }
        }
        mediaSessionCompat2.setPlaybackState(builder2.build());
        C6719h c6719h3 = this.f35910e;
        if (c6719h3 != null && c6719h3.m30958x0()) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        }
        C6719h c6719h4 = this.f35910e;
        if (c6719h4 != null && c6719h4.m30957w0()) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        }
        if (bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
            mediaSessionCompat2.setExtras(bundle);
        }
        if (i10 == 0) {
            mediaSessionCompat2.setMetadata(new MediaMetadataCompat.Builder().build());
            return;
        }
        if (this.f35919n != null) {
            if (this.f35911f == null) {
                activity = null;
            } else {
                Intent intent = new Intent();
                intent.setComponent(this.f35911f);
                activity = PendingIntent.getActivity(this.f35906a, 0, intent, C6364r1.f33992a | 134217728);
            }
            if (activity != null) {
                mediaSessionCompat2.setSessionActivity(activity);
            }
        }
        if (this.f35919n == null || (mediaSessionCompat = this.f35921p) == null || mediaInfo == null || (m13065Y = mediaInfo.m13065Y()) == null) {
            return;
        }
        C6721i c6721i3 = this.f35919n;
        long m13067a0 = (c6721i3 == null || !c6721i3.m31024r()) ? mediaInfo.m13067a0() : 0L;
        String m28246S = m13065Y.m28246S("com.google.android.gms.cast.metadata.TITLE");
        String m28246S2 = m13065Y.m28246S("com.google.android.gms.cast.metadata.SUBTITLE");
        MediaMetadataCompat.Builder putLong = m31933o().putLong(MediaMetadataCompat.METADATA_KEY_DURATION, m13067a0);
        if (m28246S != null) {
            putLong.putString(MediaMetadataCompat.METADATA_KEY_TITLE, m28246S);
            putLong.putString(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE, m28246S);
        }
        if (m28246S2 != null) {
            putLong.putString(MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, m28246S2);
        }
        mediaSessionCompat.setMetadata(putLong.build());
        Uri m31932n = m31932n(m13065Y, 0);
        if (m31932n != null) {
            this.f35913h.m31903d(m31932n);
        } else {
            m31934p(null, 0);
        }
        Uri m31932n2 = m31932n(m13065Y, 3);
        if (m31932n2 != null) {
            this.f35914i.m31903d(m31932n2);
        } else {
            m31934p(null, 3);
        }
    }
}

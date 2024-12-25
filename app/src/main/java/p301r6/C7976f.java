package p301r6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.provider.Settings;
import java.util.Arrays;
import p059d9.C4401z0;
import p099fc.AbstractC4834t;
import p168jc.C5354c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r6/f.class
 */
/* renamed from: r6.f */
/* loaded from: combined.jar:classes2.jar:r6/f.class */
public final class C7976f {

    /* renamed from: c */
    public static final C7976f f38512c = new C7976f(new int[]{2}, 8);

    /* renamed from: d */
    public static final C7976f f38513d = new C7976f(new int[]{2, 5, 6}, 8);

    /* renamed from: e */
    public static final int[] f38514e = {5, 6, 18, 17, 14, 7, 8};

    /* renamed from: a */
    public final int[] f38515a;

    /* renamed from: b */
    public final int f38516b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:r6/f$a.class
     */
    /* renamed from: r6.f$a */
    /* loaded from: combined.jar:classes2.jar:r6/f$a.class */
    public static final class a {
        /* renamed from: a */
        public static int[] m34586a() {
            boolean isDirectPlaybackSupported;
            AbstractC4834t.a m24548x = AbstractC4834t.m24548x();
            for (int i10 : C7976f.f38514e) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(i10).setSampleRate(48000).build(), new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build());
                if (isDirectPlaybackSupported) {
                    m24548x.m24554d(Integer.valueOf(i10));
                }
            }
            m24548x.m24554d(2);
            return C5354c.m26644j(m24548x.m24555e());
        }
    }

    public C7976f(int[] iArr, int i10) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f38515a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f38515a = new int[0];
        }
        this.f38516b = i10;
    }

    /* renamed from: b */
    public static boolean m34581b() {
        boolean z10;
        if (C4401z0.f26679a >= 17) {
            String str = C4401z0.f26681c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                z10 = true;
                return z10;
            }
        }
        z10 = false;
        return z10;
    }

    /* renamed from: c */
    public static C7976f m34582c(Context context) {
        return m34583d(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: d */
    public static C7976f m34583d(Context context, Intent intent) {
        return (m34581b() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) ? f38513d : (C4401z0.f26679a < 29 || !C4401z0.m22418w0(context)) ? (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? f38512c : new C7976f(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8)) : new C7976f(a.m34586a(), 8);
    }

    /* renamed from: e */
    public int m34584e() {
        return this.f38516b;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7976f)) {
            return false;
        }
        C7976f c7976f = (C7976f) obj;
        if (!Arrays.equals(this.f38515a, c7976f.f38515a) || this.f38516b != c7976f.f38516b) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: f */
    public boolean m34585f(int i10) {
        return Arrays.binarySearch(this.f38515a, i10) >= 0;
    }

    public int hashCode() {
        return this.f38516b + (Arrays.hashCode(this.f38515a) * 31);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f38516b + ", supportedEncodings=" + Arrays.toString(this.f38515a) + "]";
    }
}

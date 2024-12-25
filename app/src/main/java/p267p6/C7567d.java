package p267p6;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import p059d9.C4349a;
import p059d9.C4392v;
import p059d9.C4401z0;
import p267p6.C7567d;
import p301r6.C7972d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p6/d.class
 */
/* renamed from: p6.d */
/* loaded from: combined.jar:classes2.jar:p6/d.class */
public final class C7567d {

    /* renamed from: a */
    public final AudioManager f36666a;

    /* renamed from: b */
    public final a f36667b;

    /* renamed from: c */
    public b f36668c;

    /* renamed from: d */
    public C7972d f36669d;

    /* renamed from: f */
    public int f36671f;

    /* renamed from: h */
    public AudioFocusRequest f36673h;

    /* renamed from: i */
    public boolean f36674i;

    /* renamed from: g */
    public float f36672g = 1.0f;

    /* renamed from: e */
    public int f36670e = 0;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/d$a.class
     */
    /* renamed from: p6.d$a */
    /* loaded from: combined.jar:classes2.jar:p6/d$a.class */
    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a */
        public final Handler f36675a;

        /* renamed from: b */
        public final C7567d f36676b;

        public a(C7567d c7567d, Handler handler) {
            this.f36676b = c7567d;
            this.f36675a = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m32609b(int i10) {
            this.f36676b.m32598h(i10);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i10) {
            this.f36675a.post(new Runnable(this, i10) { // from class: p6.c

                /* renamed from: b */
                public final C7567d.a f36593b;

                /* renamed from: c */
                public final int f36594c;

                {
                    this.f36593b = this;
                    this.f36594c = i10;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f36593b.m32609b(this.f36594c);
                }
            });
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/d$b.class
     */
    /* renamed from: p6.d$b */
    /* loaded from: combined.jar:classes2.jar:p6/d$b.class */
    public interface b {
        /* renamed from: I */
        void mo32514I(float f10);

        /* renamed from: J */
        void mo32515J(int i10);
    }

    public C7567d(Context context, Handler handler, b bVar) {
        this.f36666a = (AudioManager) C4349a.m21882e((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f36668c = bVar;
        this.f36667b = new a(this, handler);
    }

    /* renamed from: e */
    public static int m32592e(C7972d c7972d) {
        if (c7972d == null) {
            return 0;
        }
        switch (c7972d.f38505c) {
            case 0:
                C4392v.m22275i("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                break;
            case 1:
            case 14:
                break;
            case 2:
            case 4:
                break;
            case 3:
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                break;
            case 11:
                if (c7972d.f38503a == 1) {
                }
                break;
            case 15:
            default:
                C4392v.m22275i("AudioFocusManager", "Unidentified audio usage: " + c7972d.f38505c);
                break;
            case 16:
                if (C4401z0.f26679a >= 19) {
                }
                break;
        }
        return 0;
    }

    /* renamed from: a */
    public final void m32593a() {
        this.f36666a.abandonAudioFocus(this.f36667b);
    }

    /* renamed from: b */
    public final void m32594b() {
        if (this.f36670e == 0) {
            return;
        }
        if (C4401z0.f26679a >= 26) {
            m32595c();
        } else {
            m32593a();
        }
        m32604n(0);
    }

    /* renamed from: c */
    public final void m32595c() {
        AudioFocusRequest audioFocusRequest = this.f36673h;
        if (audioFocusRequest != null) {
            this.f36666a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    /* renamed from: f */
    public final void m32596f(int i10) {
        b bVar = this.f36668c;
        if (bVar != null) {
            bVar.mo32515J(i10);
        }
    }

    /* renamed from: g */
    public float m32597g() {
        return this.f36672g;
    }

    /* renamed from: h */
    public final void m32598h(int i10) {
        int i11;
        if (i10 == -3 || i10 == -2) {
            if (i10 == -2 || m32607q()) {
                m32596f(0);
                i11 = 2;
            } else {
                i11 = 3;
            }
            m32604n(i11);
            return;
        }
        if (i10 == -1) {
            m32596f(-1);
            m32594b();
        } else if (i10 == 1) {
            m32604n(1);
            m32596f(1);
        } else {
            C4392v.m22275i("AudioFocusManager", "Unknown focus change type: " + i10);
        }
    }

    /* renamed from: i */
    public void m32599i() {
        this.f36668c = null;
        m32594b();
    }

    /* renamed from: j */
    public final int m32600j() {
        if (this.f36670e == 1) {
            return 1;
        }
        if ((C4401z0.f26679a >= 26 ? m32602l() : m32601k()) == 1) {
            m32604n(1);
            return 1;
        }
        m32604n(0);
        return -1;
    }

    /* renamed from: k */
    public final int m32601k() {
        return this.f36666a.requestAudioFocus(this.f36667b, C4401z0.m22381f0(((C7972d) C4349a.m21882e(this.f36669d)).f38505c), this.f36671f);
    }

    /* renamed from: l */
    public final int m32602l() {
        int requestAudioFocus;
        AudioFocusRequest audioFocusRequest = this.f36673h;
        if (audioFocusRequest == null || this.f36674i) {
            this.f36673h = (audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f36671f) : new AudioFocusRequest.Builder(this.f36673h)).setAudioAttributes(((C7972d) C4349a.m21882e(this.f36669d)).m34575a()).setWillPauseWhenDucked(m32607q()).setOnAudioFocusChangeListener(this.f36667b).build();
            this.f36674i = false;
        }
        requestAudioFocus = this.f36666a.requestAudioFocus(this.f36673h);
        return requestAudioFocus;
    }

    /* renamed from: m */
    public void m32603m(C7972d c7972d) {
        if (C4401z0.m22371c(this.f36669d, c7972d)) {
            return;
        }
        this.f36669d = c7972d;
        int m32592e = m32592e(c7972d);
        this.f36671f = m32592e;
        boolean z10 = true;
        if (m32592e != 1) {
            z10 = m32592e == 0;
        }
        C4349a.m21879b(z10, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    /* renamed from: n */
    public final void m32604n(int i10) {
        if (this.f36670e == i10) {
            return;
        }
        this.f36670e = i10;
        float f10 = i10 == 3 ? 0.2f : 1.0f;
        if (this.f36672g == f10) {
            return;
        }
        this.f36672g = f10;
        b bVar = this.f36668c;
        if (bVar != null) {
            bVar.mo32514I(f10);
        }
    }

    /* renamed from: o */
    public final boolean m32605o(int i10) {
        boolean z10 = true;
        if (i10 != 1) {
            z10 = this.f36671f != 1;
        }
        return z10;
    }

    /* renamed from: p */
    public int m32606p(boolean z10, int i10) {
        boolean m32605o = m32605o(i10);
        int i11 = -1;
        if (!m32605o) {
            if (z10) {
                i11 = m32600j();
            }
            return i11;
        }
        m32594b();
        if (z10) {
            i11 = 1;
        }
        return i11;
    }

    /* renamed from: q */
    public final boolean m32607q() {
        C7972d c7972d = this.f36669d;
        boolean z10 = true;
        if (c7972d == null || c7972d.f38503a != 1) {
            z10 = false;
        }
        return z10;
    }
}

package com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.appcompat.app.DialogC0242a;
import com.amazonaws.mobileconnectors.p044s3.transferutility.TransferTable;
import com.maxdigitall.maxdigitaliptvbox.model.callback.VodInfoCallback;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity;
import com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import nf.C6783a;
import org.achartengine.renderer.DefaultRenderer;
import org.apache.commons.net.tftp.TFTP;
import org.apache.http.protocol.HttpRequestExecutor;
import p050d0.C4290b;
import p151if.C5251a;
import p151if.C5255e;
import p170jf.C5378j;
import p250of.ServiceC6971a;
import p290qf.C7920a;
import p324sf.InterfaceC8574m;
import p440z8.C10105q;
import pf.C7705a;
import pf.C7709e;
import pf.InterfaceC7706b;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkTimedText;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;
import tv.danmaku.ijk.media.player.misc.ITrackInfo;
import tv.danmaku.ijk.media.player.misc.IjkMediaFormat;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv.class */
public class NSTIJKPlayerSkyTv extends FrameLayout implements MediaController.MediaPlayerControl, InterfaceC8574m {

    /* renamed from: U1 */
    public static LiveStreamDBHandler f24439U1;

    /* renamed from: V1 */
    public static final int[] f24440V1 = {0, 1, 2, 3, 4, 5};

    /* renamed from: A */
    public long f24441A;

    /* renamed from: A0 */
    public boolean f24442A0;

    /* renamed from: A1 */
    public LinearLayout f24443A1;

    /* renamed from: B */
    public boolean f24444B;

    /* renamed from: B0 */
    public boolean f24445B0;

    /* renamed from: B1 */
    public LinearLayout f24446B1;

    /* renamed from: C */
    public boolean f24447C;

    /* renamed from: C0 */
    public SharedPreferences f24448C0;

    /* renamed from: C1 */
    public LinearLayout f24449C1;

    /* renamed from: D */
    public int f24450D;

    /* renamed from: D0 */
    public SharedPreferences f24451D0;

    /* renamed from: D1 */
    public final SeekBar.OnSeekBarChangeListener f24452D1;

    /* renamed from: E */
    public Handler f24453E;

    /* renamed from: E0 */
    public SharedPreferences f24454E0;

    /* renamed from: E1 */
    public final SeekBar.OnSeekBarChangeListener f24455E1;

    /* renamed from: F */
    public Handler f24456F;

    /* renamed from: F0 */
    public SharedPreferences f24457F0;

    /* renamed from: F1 */
    public IMediaPlayer.OnVideoSizeChangedListener f24458F1;

    /* renamed from: G */
    public int f24459G;

    /* renamed from: G0 */
    public SharedPreferences.Editor f24460G0;

    /* renamed from: G1 */
    public IMediaPlayer.OnPreparedListener f24461G1;

    /* renamed from: H */
    public boolean f24462H;

    /* renamed from: H0 */
    public SharedPreferences.Editor f24463H0;

    /* renamed from: H1 */
    public IMediaPlayer.OnCompletionListener f24464H1;

    /* renamed from: I */
    public int f24465I;

    /* renamed from: I0 */
    public SharedPreferences.Editor f24466I0;

    /* renamed from: I1 */
    public IMediaPlayer.OnInfoListener f24467I1;

    /* renamed from: J */
    public int f24468J;

    /* renamed from: J0 */
    public boolean f24469J0;

    /* renamed from: J1 */
    public IMediaPlayer.OnErrorListener f24470J1;

    /* renamed from: K */
    public boolean f24471K;

    /* renamed from: K0 */
    public boolean f24472K0;

    /* renamed from: K1 */
    public IMediaPlayer.OnBufferingUpdateListener f24473K1;

    /* renamed from: L */
    public SharedPreferences f24474L;

    /* renamed from: L0 */
    public SharedPreferences f24475L0;

    /* renamed from: L1 */
    public IMediaPlayer.OnSeekCompleteListener f24476L1;

    /* renamed from: M */
    public SharedPreferences.Editor f24477M;

    /* renamed from: M0 */
    public C5378j f24478M0;

    /* renamed from: M1 */
    public IMediaPlayer.OnTimedTextListener f24479M1;

    /* renamed from: N */
    public SharedPreferences f24480N;

    /* renamed from: N0 */
    public boolean f24481N0;

    /* renamed from: N1 */
    public InterfaceC4042a.a f24482N1;

    /* renamed from: O */
    public Context f24483O;

    /* renamed from: O0 */
    public TextView f24484O0;

    /* renamed from: O1 */
    public int f24485O1;

    /* renamed from: P */
    public C6783a f24486P;

    /* renamed from: P0 */
    public TextView f24487P0;

    /* renamed from: P1 */
    public int f24488P1;

    /* renamed from: Q */
    public InterfaceC4042a f24489Q;

    /* renamed from: Q0 */
    public TextView f24490Q0;

    /* renamed from: Q1 */
    public List<Integer> f24491Q1;

    /* renamed from: R */
    public int f24492R;

    /* renamed from: R0 */
    public RadioGroup f24493R0;

    /* renamed from: R1 */
    public int f24494R1;

    /* renamed from: S */
    public int f24495S;

    /* renamed from: S0 */
    public RadioGroup f24496S0;

    /* renamed from: S1 */
    public int f24497S1;

    /* renamed from: T */
    public long f24498T;

    /* renamed from: T0 */
    public RadioGroup f24499T0;

    /* renamed from: T1 */
    public boolean f24500T1;

    /* renamed from: U */
    public long f24501U;

    /* renamed from: U0 */
    public SharedPreferences.Editor f24502U0;

    /* renamed from: V */
    public long f24503V;

    /* renamed from: V0 */
    public TextView f24504V0;

    /* renamed from: W */
    public long f24505W;

    /* renamed from: W0 */
    public FrameLayout f24506W0;

    /* renamed from: X0 */
    public DialogC0242a f24507X0;

    /* renamed from: Y0 */
    public SeekBar f24508Y0;

    /* renamed from: Z0 */
    public SeekBar f24509Z0;

    /* renamed from: a1 */
    public LinearLayout f24510a1;

    /* renamed from: b */
    public String f24511b;

    /* renamed from: b1 */
    public Handler f24512b1;

    /* renamed from: c */
    public Uri f24513c;

    /* renamed from: c1 */
    public Runnable f24514c1;

    /* renamed from: d */
    public String f24515d;

    /* renamed from: d1 */
    public Animation f24516d1;

    /* renamed from: e */
    public Map<String, String> f24517e;

    /* renamed from: e1 */
    public Animation f24518e1;

    /* renamed from: f */
    public int f24519f;

    /* renamed from: f0 */
    public TextView f24520f0;

    /* renamed from: f1 */
    public LinearLayout f24521f1;

    /* renamed from: g */
    public int f24522g;

    /* renamed from: g0 */
    public String f24523g0;

    /* renamed from: g1 */
    public LinearLayout f24524g1;

    /* renamed from: h */
    public int f24525h;

    /* renamed from: h0 */
    public Activity f24526h0;

    /* renamed from: h1 */
    public int f24527h1;

    /* renamed from: i */
    public InterfaceC4042a.b f24528i;

    /* renamed from: i0 */
    public NSTIJKPlayerSkyTv f24529i0;

    /* renamed from: i1 */
    public TextView f24530i1;

    /* renamed from: j */
    public IMediaPlayer f24531j;

    /* renamed from: j0 */
    public AudioManager f24532j0;

    /* renamed from: j1 */
    public TextView f24533j1;

    /* renamed from: k */
    public int f24534k;

    /* renamed from: k0 */
    public int f24535k0;

    /* renamed from: k1 */
    public LinearLayout f24536k1;

    /* renamed from: l */
    public int f24537l;

    /* renamed from: l0 */
    public float f24538l0;

    /* renamed from: l1 */
    public Animation f24539l1;

    /* renamed from: m */
    public int f24540m;

    /* renamed from: m0 */
    public GestureDetector f24541m0;

    /* renamed from: m1 */
    public Animation f24542m1;

    /* renamed from: n */
    public int f24543n;

    /* renamed from: n0 */
    public int f24544n0;

    /* renamed from: n1 */
    public RelativeLayout f24545n1;

    /* renamed from: o */
    public int f24546o;

    /* renamed from: o0 */
    public View f24547o0;

    /* renamed from: o1 */
    public Animation f24548o1;

    /* renamed from: p */
    public InterfaceC7706b f24549p;

    /* renamed from: p0 */
    public C3998y f24550p0;

    /* renamed from: p1 */
    public Animation f24551p1;

    /* renamed from: q */
    public IMediaPlayer.OnCompletionListener f24552q;

    /* renamed from: q0 */
    public Button f24553q0;

    /* renamed from: q1 */
    public Animation f24554q1;

    /* renamed from: r */
    public IMediaPlayer.OnPreparedListener f24555r;

    /* renamed from: r0 */
    public Boolean f24556r0;

    /* renamed from: r1 */
    public Animation f24557r1;

    /* renamed from: s */
    public int f24558s;

    /* renamed from: s0 */
    public Boolean f24559s0;

    /* renamed from: s1 */
    public SharedPreferences f24560s1;

    /* renamed from: t */
    public IMediaPlayer.OnErrorListener f24561t;

    /* renamed from: t0 */
    public Boolean f24562t0;

    /* renamed from: t1 */
    public RelativeLayout f24563t1;

    /* renamed from: u */
    public IMediaPlayer.OnInfoListener f24564u;

    /* renamed from: u0 */
    public Boolean f24565u0;

    /* renamed from: u1 */
    public boolean f24566u1;

    /* renamed from: v */
    public int f24567v;

    /* renamed from: v0 */
    public Boolean f24568v0;

    /* renamed from: v1 */
    public boolean f24569v1;

    /* renamed from: w */
    public boolean f24570w;

    /* renamed from: w0 */
    public Boolean f24571w0;

    /* renamed from: w1 */
    public String f24572w1;

    /* renamed from: x */
    public boolean f24573x;

    /* renamed from: x0 */
    public boolean f24574x0;

    /* renamed from: x1 */
    public String f24575x1;

    /* renamed from: y */
    public boolean f24576y;

    /* renamed from: y0 */
    public StringBuilder f24577y0;

    /* renamed from: y1 */
    public Handler f24578y1;

    /* renamed from: z */
    public int f24579z;

    /* renamed from: z0 */
    public Formatter f24580z0;

    /* renamed from: z1 */
    public Context f24581z1;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$a.class */
    public class C3974a implements IMediaPlayer.OnErrorListener {

        /* renamed from: a */
        public final NSTIJKPlayerSkyTv f24582a;

        public C3974a(NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv) {
            this.f24582a = nSTIJKPlayerSkyTv;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i10, int i11) {
            Log.d(this.f24582a.f24511b, "Error: " + i10 + "," + i11);
            this.f24582a.f24522g = -1;
            this.f24582a.f24525h = -1;
            if (this.f24582a.f24549p != null) {
                this.f24582a.f24549p.m33655d();
            }
            this.f24582a.m19460d1(-1);
            if (this.f24582a.f24561t == null) {
                return true;
            }
            this.f24582a.f24561t.onError(this.f24582a.f24531j, i10, i11);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$b.class */
    public class C3975b implements IMediaPlayer.OnBufferingUpdateListener {

        /* renamed from: a */
        public final NSTIJKPlayerSkyTv f24583a;

        public C3975b(NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv) {
            this.f24583a = nSTIJKPlayerSkyTv;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i10) {
            this.f24583a.f24558s = i10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$c.class */
    public class C3976c implements IMediaPlayer.OnSeekCompleteListener {

        /* renamed from: a */
        public final NSTIJKPlayerSkyTv f24584a;

        public C3976c(NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv) {
            this.f24584a = nSTIJKPlayerSkyTv;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
            this.f24584a.f24505W = System.currentTimeMillis();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$d.class */
    public class C3977d implements IMediaPlayer.OnTimedTextListener {

        /* renamed from: a */
        public final NSTIJKPlayerSkyTv f24585a;

        public C3977d(NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv) {
            this.f24585a = nSTIJKPlayerSkyTv;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnTimedTextListener
        public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
            TextView textView;
            if (ijkTimedText == null) {
                this.f24585a.f24520f0.setVisibility(8);
                return;
            }
            String replace = ijkTimedText.getText().replace("{\\b1}", "").replace("{\\b0}", "").replace("{\\i1}", "").replace("{\\i0}", "").replace("{\\c}", "");
            StringBuilder sb2 = new StringBuilder();
            try {
                if (replace.contains("{")) {
                    for (String str : replace.split("\\{")) {
                        String str2 = str;
                        if (str.contains("}")) {
                            str2 = str.substring(str.lastIndexOf("}") + 1);
                        }
                        sb2.append(str2);
                    }
                }
            } catch (Exception e10) {
            }
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = this.f24585a;
            nSTIJKPlayerSkyTv.f24475L0 = nSTIJKPlayerSkyTv.f24483O.getSharedPreferences("pref.using_sub_font_size", 0);
            try {
                this.f24585a.f24520f0.setTextSize(2, Float.parseFloat(this.f24585a.f24475L0.getString("pref.using_sub_font_size", C5251a.f30039f0)));
            } catch (Exception e11) {
            }
            if (this.f24585a.getShowOrHideSubtitles().equals("visible")) {
                this.f24585a.f24520f0.setVisibility(0);
            } else {
                this.f24585a.f24520f0.setVisibility(8);
            }
            if (sb2.length() > 0) {
                textView = this.f24585a.f24520f0;
                replace = sb2.toString();
            } else {
                textView = this.f24585a.f24520f0;
            }
            textView.setText(replace);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$e.class */
    public class C3978e implements InterfaceC4042a.a {

        /* renamed from: a */
        public final NSTIJKPlayerSkyTv f24586a;

        public C3978e(NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv) {
            this.f24586a = nSTIJKPlayerSkyTv;
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.a
        /* renamed from: a */
        public void mo18794a(InterfaceC4042a.b bVar, int i10, int i11, int i12) {
            InterfaceC4042a mo19699a = bVar.mo19699a();
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = this.f24586a;
            if (mo19699a != nSTIJKPlayerSkyTv.f24489Q) {
                Log.e(nSTIJKPlayerSkyTv.f24511b, "onSurfaceChanged: unmatched render callback\n");
                return;
            }
            nSTIJKPlayerSkyTv.f24540m = i11;
            this.f24586a.f24543n = i12;
            boolean z10 = this.f24586a.f24525h == 3;
            boolean z11 = true;
            if (this.f24586a.f24489Q.mo19697d()) {
                z11 = this.f24586a.f24534k == i11 && this.f24586a.f24537l == i12;
            }
            if (this.f24586a.f24531j != null && z10 && z11) {
                if (this.f24586a.f24567v != 0) {
                    NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv2 = this.f24586a;
                    nSTIJKPlayerSkyTv2.seekTo(nSTIJKPlayerSkyTv2.f24567v);
                }
                this.f24586a.start();
            }
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.a
        /* renamed from: b */
        public void mo18795b(InterfaceC4042a.b bVar) {
            InterfaceC4042a mo19699a = bVar.mo19699a();
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = this.f24586a;
            if (mo19699a != nSTIJKPlayerSkyTv.f24489Q) {
                Log.e(nSTIJKPlayerSkyTv.f24511b, "onSurfaceDestroyed: unmatched render callback\n");
            } else {
                nSTIJKPlayerSkyTv.f24528i = null;
                this.f24586a.m19451U0();
            }
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.a
        /* renamed from: c */
        public void mo18796c(InterfaceC4042a.b bVar, int i10, int i11) {
            InterfaceC4042a mo19699a = bVar.mo19699a();
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = this.f24586a;
            if (mo19699a != nSTIJKPlayerSkyTv.f24489Q) {
                Log.e(nSTIJKPlayerSkyTv.f24511b, "onSurfaceCreated: unmatched render callback\n");
                return;
            }
            nSTIJKPlayerSkyTv.f24528i = bVar;
            if (this.f24586a.f24531j == null) {
                this.f24586a.m19449S0();
            } else {
                NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv2 = this.f24586a;
                nSTIJKPlayerSkyTv2.m19437G0(nSTIJKPlayerSkyTv2.f24531j, bVar);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$f.class */
    public class RunnableC3979f implements Runnable {

        /* renamed from: b */
        public final LinearLayout f24587b;

        /* renamed from: c */
        public final NSTIJKPlayerSkyTv f24588c;

        public RunnableC3979f(NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv, LinearLayout linearLayout) {
            this.f24588c = nSTIJKPlayerSkyTv;
            this.f24587b = linearLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f24587b.setVisibility(8);
            if (this.f24588c.f24510a1.getVisibility() != 0 || this.f24588c.f24536k1 == null) {
                return;
            }
            this.f24588c.f24536k1.setVisibility(0);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$g.class */
    public class ViewOnClickListenerC3980g implements View.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerSkyTv f24589b;

        public ViewOnClickListenerC3980g(NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv) {
            this.f24589b = nSTIJKPlayerSkyTv;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f24589b.m19464h1();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$h.class */
    public class C3981h implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: a */
        public final int f24590a;

        /* renamed from: b */
        public final NSTIJKPlayerSkyTv f24591b;

        public C3981h(NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv, int i10) {
            this.f24591b = nSTIJKPlayerSkyTv;
            this.f24590a = i10;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i10) {
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = this.f24591b;
            nSTIJKPlayerSkyTv.f24466I0 = nSTIJKPlayerSkyTv.f24457F0.edit();
            if (i10 == 111 || i10 == 11111111) {
                this.f24591b.f24466I0.putInt("currentVideoTrack", -1);
                this.f24591b.m19440J0(this.f24590a);
            } else {
                this.f24591b.f24466I0.putInt("currentVideoTrack", i10);
                this.f24591b.m19453W0(i10);
            }
            this.f24591b.f24466I0.apply();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$i.class */
    public class C3982i implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: a */
        public final int f24592a;

        /* renamed from: b */
        public final NSTIJKPlayerSkyTv f24593b;

        public C3982i(NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv, int i10) {
            this.f24593b = nSTIJKPlayerSkyTv;
            this.f24592a = i10;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i10) {
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = this.f24593b;
            nSTIJKPlayerSkyTv.f24463H0 = nSTIJKPlayerSkyTv.f24454E0.edit();
            if (i10 == 1111 || i10 == 1111111) {
                this.f24593b.f24463H0.putInt("currentAudioTrack", -1);
                this.f24593b.m19440J0(this.f24592a);
            } else {
                this.f24593b.f24463H0.putInt("currentAudioTrack", i10);
                int currentPosition = (int) this.f24593b.f24531j.getCurrentPosition();
                this.f24593b.m19453W0(i10);
                this.f24593b.f24531j.seekTo(Long.parseLong(String.valueOf(currentPosition)));
            }
            this.f24593b.f24463H0.apply();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$j.class */
    public class C3983j implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: a */
        public final int f24594a;

        /* renamed from: b */
        public final NSTIJKPlayerSkyTv f24595b;

        public C3983j(NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv, int i10) {
            this.f24595b = nSTIJKPlayerSkyTv;
            this.f24594a = i10;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i10) {
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = this.f24595b;
            nSTIJKPlayerSkyTv.f24460G0 = nSTIJKPlayerSkyTv.f24451D0.edit();
            if (i10 == 11111 || i10 == 111111) {
                TextView textView = this.f24595b.f24520f0;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                this.f24595b.f24460G0.putInt("currentSubtitleTrack", -1);
                this.f24595b.m19440J0(this.f24594a);
            } else {
                TextView textView2 = this.f24595b.f24520f0;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                this.f24595b.f24460G0.putInt("currentSubtitleTrack", i10);
                this.f24595b.m19453W0(i10);
            }
            this.f24595b.f24460G0.apply();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$k.class */
    public class C3984k implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: b */
        public final NSTIJKPlayerSkyTv f24596b;

        public C3984k(NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv) {
            this.f24596b = nSTIJKPlayerSkyTv;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            TextView textView;
            Resources resources;
            int i11;
            this.f24596b.f24538l0 = i10;
            int i12 = (int) ((this.f24596b.f24538l0 / 255.0f) * 100.0f);
            if (i12 < 20) {
                textView = this.f24596b.f24530i1;
                resources = this.f24596b.getResources();
                i11 = 2131231123;
            } else if (i12 < 30) {
                textView = this.f24596b.f24530i1;
                resources = this.f24596b.getResources();
                i11 = 2131231124;
            } else if (i12 < 40) {
                textView = this.f24596b.f24530i1;
                resources = this.f24596b.getResources();
                i11 = 2131231125;
            } else if (i12 < 50) {
                textView = this.f24596b.f24530i1;
                resources = this.f24596b.getResources();
                i11 = 2131231126;
            } else if (i12 < 60) {
                textView = this.f24596b.f24530i1;
                resources = this.f24596b.getResources();
                i11 = 2131231127;
            } else if (i12 < 70) {
                textView = this.f24596b.f24530i1;
                resources = this.f24596b.getResources();
                i11 = 2131231128;
            } else {
                textView = this.f24596b.f24530i1;
                resources = this.f24596b.getResources();
                i11 = 2131231129;
            }
            textView.setBackground(resources.getDrawable(i11));
            WindowManager.LayoutParams attributes = this.f24596b.f24526h0.getWindow().getAttributes();
            attributes.screenBrightness = this.f24596b.f24538l0 / 255.0f;
            this.f24596b.f24486P.m31256O((int) this.f24596b.f24538l0);
            this.f24596b.f24526h0.getWindow().setAttributes(attributes);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            this.f24596b.m19462f1();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            this.f24596b.m19462f1();
            this.f24596b.m19436F0(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$l.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv$l */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$l.class */
    public class DialogInterfaceOnClickListenerC3985l implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerSkyTv f24597b;

        public DialogInterfaceOnClickListenerC3985l(NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv) {
            this.f24597b = nSTIJKPlayerSkyTv;
        }

        @Override // android.content.DialogInterface.OnClickListener
        @SuppressLint({"SetTextI18n"})
        public void onClick(DialogInterface dialogInterface, int i10) {
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv;
            String str;
            switch (i10) {
                case 0:
                    nSTIJKPlayerSkyTv = this.f24597b;
                    str = "10";
                    break;
                case 1:
                    nSTIJKPlayerSkyTv = this.f24597b;
                    str = "12";
                    break;
                case 2:
                    nSTIJKPlayerSkyTv = this.f24597b;
                    str = "14";
                    break;
                case 3:
                    nSTIJKPlayerSkyTv = this.f24597b;
                    str = "16";
                    break;
                case 4:
                    nSTIJKPlayerSkyTv = this.f24597b;
                    str = "18";
                    break;
                case 5:
                    nSTIJKPlayerSkyTv = this.f24597b;
                    str = "20";
                    break;
                case 6:
                    nSTIJKPlayerSkyTv = this.f24597b;
                    str = "22";
                    break;
                case 7:
                    nSTIJKPlayerSkyTv = this.f24597b;
                    str = "24";
                    break;
                case 8:
                    nSTIJKPlayerSkyTv = this.f24597b;
                    str = "26";
                    break;
                case 9:
                    nSTIJKPlayerSkyTv = this.f24597b;
                    str = "28";
                    break;
                case 10:
                    nSTIJKPlayerSkyTv = this.f24597b;
                    str = "30";
                    break;
                case 11:
                    nSTIJKPlayerSkyTv = this.f24597b;
                    str = "32";
                    break;
                case 12:
                    nSTIJKPlayerSkyTv = this.f24597b;
                    str = "34";
                    break;
                case 13:
                    nSTIJKPlayerSkyTv = this.f24597b;
                    str = "36";
                    break;
                case 14:
                    nSTIJKPlayerSkyTv = this.f24597b;
                    str = "38";
                    break;
                case 15:
                    nSTIJKPlayerSkyTv = this.f24597b;
                    str = "40";
                    break;
                default:
                    return;
            }
            nSTIJKPlayerSkyTv.m19465i1(str);
            this.f24597b.f24504V0.setText(str);
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$m.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv$m */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$m.class */
    public class DialogInterfaceOnDismissListenerC3986m implements DialogInterface.OnDismissListener {

        /* renamed from: b */
        public final NSTIJKPlayerSkyTv f24598b;

        public DialogInterfaceOnDismissListenerC3986m(NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv) {
            this.f24598b = nSTIJKPlayerSkyTv;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$n.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv$n */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$n.class */
    public class C3987n implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: b */
        public final NSTIJKPlayerSkyTv f24599b;

        public C3987n(NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv) {
            this.f24599b = nSTIJKPlayerSkyTv;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            TextView textView;
            Drawable drawable;
            Resources resources;
            if (this.f24599b.f24532j0 != null) {
                try {
                    this.f24599b.f24532j0.setStreamVolume(3, i10, 0);
                    int streamVolume = (int) ((this.f24599b.f24532j0.getStreamVolume(3) / this.f24599b.f24535k0) * 100.0f);
                    if (streamVolume == 0 || streamVolume < 0) {
                        textView = this.f24599b.f24533j1;
                        drawable = this.f24599b.getResources().getDrawable(2131231157);
                    } else if (streamVolume < 40) {
                        textView = this.f24599b.f24533j1;
                        drawable = this.f24599b.getResources().getDrawable(2131231154);
                    } else if (streamVolume < 80) {
                        textView = this.f24599b.f24533j1;
                        drawable = this.f24599b.getResources().getDrawable(2131231155);
                    } else {
                        if (streamVolume < 100) {
                            textView = this.f24599b.f24533j1;
                            resources = this.f24599b.getResources();
                        } else {
                            textView = this.f24599b.f24533j1;
                            resources = this.f24599b.getResources();
                        }
                        drawable = resources.getDrawable(2131231156);
                    }
                    textView.setBackground(drawable);
                } catch (Exception e10) {
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            this.f24599b.m19462f1();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            this.f24599b.m19462f1();
            this.f24599b.m19436F0(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$o.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv$o */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$o.class */
    public class ViewOnTouchListenerC3988o implements View.OnTouchListener {

        /* renamed from: b */
        public final NSTIJKPlayerSkyTv f24600b;

        public ViewOnTouchListenerC3988o(NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv) {
            this.f24600b = nSTIJKPlayerSkyTv;
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return (((LinearLayout) this.f24600b.f24526h0.findViewById(2131428429)).getVisibility() == 0 || motionEvent == null || !this.f24600b.f24541m0.onTouchEvent(motionEvent)) ? false : true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$p.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv$p */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$p.class */
    public class RunnableC3989p implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerSkyTv f24601b;

        public RunnableC3989p(NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv) {
            this.f24601b = nSTIJKPlayerSkyTv;
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = this.f24601b;
            nSTIJKPlayerSkyTv.f24465I++;
            C5255e.m26241k0(nSTIJKPlayerSkyTv.f24526h0, this.f24601b.f24526h0.getResources().getString(2132018322) + " (" + this.f24601b.f24465I + "/" + this.f24601b.f24468J + ")");
            this.f24601b.m19449S0();
            this.f24601b.start();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$q.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv$q */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$q.class */
    public class RunnableC3990q implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerSkyTv f24602b;

        public RunnableC3990q(NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv) {
            this.f24602b = nSTIJKPlayerSkyTv;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f24602b.m19443M0();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$r.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv$r */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$r.class */
    public class C3991r implements IMediaPlayer.OnVideoSizeChangedListener {

        /* renamed from: a */
        public final NSTIJKPlayerSkyTv f24603a;

        public C3991r(NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv) {
            this.f24603a = nSTIJKPlayerSkyTv;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i10, int i11, int i12, int i13) {
            this.f24603a.f24534k = iMediaPlayer.getVideoWidth();
            this.f24603a.f24537l = iMediaPlayer.getVideoHeight();
            this.f24603a.f24492R = iMediaPlayer.getVideoSarNum();
            this.f24603a.f24495S = iMediaPlayer.getVideoSarDen();
            if (this.f24603a.f24534k == 0 || this.f24603a.f24537l == 0) {
                return;
            }
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = this.f24603a;
            InterfaceC4042a interfaceC4042a = nSTIJKPlayerSkyTv.f24489Q;
            if (interfaceC4042a != null) {
                interfaceC4042a.mo19696c(nSTIJKPlayerSkyTv.f24534k, this.f24603a.f24537l);
                NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv2 = this.f24603a;
                nSTIJKPlayerSkyTv2.f24489Q.mo19694a(nSTIJKPlayerSkyTv2.f24492R, this.f24603a.f24495S);
            }
            this.f24603a.requestLayout();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$s.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv$s */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$s.class */
    public class C3992s implements IMediaPlayer.OnPreparedListener {

        /* renamed from: a */
        public final NSTIJKPlayerSkyTv f24604a;

        public C3992s(NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv) {
            this.f24604a = nSTIJKPlayerSkyTv;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            this.f24604a.f24501U = System.currentTimeMillis();
            this.f24604a.f24522g = 2;
            if (this.f24604a.f24555r != null) {
                this.f24604a.f24555r.onPrepared(this.f24604a.f24531j);
            }
            if (this.f24604a.f24549p != null) {
                this.f24604a.f24549p.setEnabled(true);
            }
            this.f24604a.f24534k = iMediaPlayer.getVideoWidth();
            this.f24604a.f24537l = iMediaPlayer.getVideoHeight();
            int i10 = this.f24604a.f24567v;
            if (i10 != 0) {
                this.f24604a.seekTo(i10);
            }
            if (this.f24604a.f24534k == 0 || this.f24604a.f24537l == 0) {
                if (this.f24604a.f24525h == 3) {
                    this.f24604a.start();
                    return;
                }
                return;
            }
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = this.f24604a;
            InterfaceC4042a interfaceC4042a = nSTIJKPlayerSkyTv.f24489Q;
            if (interfaceC4042a != null) {
                interfaceC4042a.mo19696c(nSTIJKPlayerSkyTv.f24534k, this.f24604a.f24537l);
                NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv2 = this.f24604a;
                nSTIJKPlayerSkyTv2.f24489Q.mo19694a(nSTIJKPlayerSkyTv2.f24492R, this.f24604a.f24495S);
                if (!this.f24604a.f24489Q.mo19697d() || (this.f24604a.f24540m == this.f24604a.f24534k && this.f24604a.f24543n == this.f24604a.f24537l)) {
                    if (this.f24604a.f24525h == 3) {
                        this.f24604a.start();
                        if (this.f24604a.f24549p != null) {
                            this.f24604a.f24549p.show();
                            return;
                        }
                        return;
                    }
                    if (this.f24604a.isPlaying()) {
                        return;
                    }
                    if ((i10 != 0 || this.f24604a.getCurrentPosition() > 0) && this.f24604a.f24549p != null) {
                        this.f24604a.f24549p.show(0);
                    }
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$t.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv$t */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$t.class */
    public class C3993t implements IMediaPlayer.OnCompletionListener {

        /* renamed from: a */
        public final NSTIJKPlayerSkyTv f24605a;

        public C3993t(NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv) {
            this.f24605a = nSTIJKPlayerSkyTv;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            this.f24605a.f24522g = 5;
            this.f24605a.f24525h = 5;
            if (this.f24605a.f24549p != null) {
                this.f24605a.f24549p.m33655d();
            }
            this.f24605a.m19462f1();
            this.f24605a.m19457a1();
            this.f24605a.m19436F0(TFTP.DEFAULT_TIMEOUT);
            if (this.f24605a.f24552q != null) {
                this.f24605a.f24552q.onCompletion(this.f24605a.f24531j);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$u.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv$u */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$u.class */
    public class C3994u implements IMediaPlayer.OnInfoListener {

        /* renamed from: a */
        public final NSTIJKPlayerSkyTv f24606a;

        public C3994u(NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv) {
            this.f24606a = nSTIJKPlayerSkyTv;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i10, int i11) {
            String str;
            String str2;
            if (this.f24606a.f24564u != null) {
                this.f24606a.f24564u.onInfo(iMediaPlayer, i10, i11);
            }
            if (i10 == 3) {
                this.f24606a.m19460d1(2);
                str = this.f24606a.f24511b;
                str2 = "MEDIA_INFO_VIDEO_RENDERING_START:";
            } else if (i10 == 10005) {
                this.f24606a.m19460d1(1);
                str = this.f24606a.f24511b;
                str2 = "MEDIA_INFO_OPEN_INPUT:";
            } else if (i10 == 901) {
                str = this.f24606a.f24511b;
                str2 = "MEDIA_INFO_UNSUPPORTED_SUBTITLE:";
            } else if (i10 == 902) {
                str = this.f24606a.f24511b;
                str2 = "MEDIA_INFO_SUBTITLE_TIMED_OUT:";
            } else {
                if (i10 == 10001) {
                    this.f24606a.f24546o = i11;
                    Log.d(this.f24606a.f24511b, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i11);
                    InterfaceC4042a interfaceC4042a = this.f24606a.f24489Q;
                    if (interfaceC4042a == null) {
                        return true;
                    }
                    interfaceC4042a.setVideoRotation(i11);
                    return true;
                }
                if (i10 != 10002) {
                    switch (i10) {
                        case 700:
                            str = this.f24606a.f24511b;
                            str2 = "MEDIA_INFO_VIDEO_TRACK_LAGGING:";
                            break;
                        case IMediaPlayer.MEDIA_INFO_BUFFERING_START /* 701 */:
                            this.f24606a.m19460d1(1);
                            str = this.f24606a.f24511b;
                            str2 = "MEDIA_INFO_BUFFERING_START:";
                            break;
                        case IMediaPlayer.MEDIA_INFO_BUFFERING_END /* 702 */:
                            this.f24606a.m19460d1(6);
                            str = this.f24606a.f24511b;
                            str2 = "MEDIA_INFO_BUFFERING_END:";
                            break;
                        case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH /* 703 */:
                            str = this.f24606a.f24511b;
                            str2 = "MEDIA_INFO_NETWORK_BANDWIDTH: " + i11;
                            break;
                        default:
                            switch (i10) {
                                case 800:
                                    str = this.f24606a.f24511b;
                                    str2 = "MEDIA_INFO_BAD_INTERLEAVING:";
                                    break;
                                case IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE /* 801 */:
                                    str = this.f24606a.f24511b;
                                    str2 = "MEDIA_INFO_NOT_SEEKABLE:";
                                    break;
                                case IMediaPlayer.MEDIA_INFO_METADATA_UPDATE /* 802 */:
                                    str = this.f24606a.f24511b;
                                    str2 = "MEDIA_INFO_METADATA_UPDATE:";
                                    break;
                                default:
                                    return true;
                            }
                    }
                } else {
                    str = this.f24606a.f24511b;
                    str2 = "MEDIA_INFO_AUDIO_RENDERING_START:";
                }
            }
            Log.d(str, str2);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$v.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv$v */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$v.class */
    public static abstract class AbstractC3995v {
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$w.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv$w */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$w.class */
    public class ViewOnFocusChangeListenerC3996w implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f24607b;

        /* renamed from: c */
        public final NSTIJKPlayerSkyTv f24608c;

        public ViewOnFocusChangeListenerC3996w(NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv, View view) {
            this.f24608c = nSTIJKPlayerSkyTv;
            this.f24607b = view;
        }

        /* renamed from: a */
        public final void m19471a(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f24607b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: b */
        public final void m19472b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f24607b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            float f10 = 1.0f;
            if (!z10) {
                if (z10) {
                    return;
                }
                View view2 = this.f24607b;
                if (view2 != null && view2.getTag() != null && this.f24607b.getTag().equals("1") && this.f24608c.f24553q0 != null) {
                    this.f24608c.f24553q0.setBackgroundResource(2131230845);
                }
                m19471a(1.0f);
                m19472b(1.0f);
                return;
            }
            View view3 = this.f24607b;
            if (view3 != null && view3.getTag() != null && this.f24607b.getTag().equals("2")) {
                view.setBackground(this.f24608c.getResources().getDrawable(2131231814));
                return;
            }
            if (z10) {
                f10 = 1.12f;
            }
            m19471a(f10);
            m19472b(f10);
            View view4 = this.f24607b;
            if (view4 == null || view4.getTag() == null || !this.f24607b.getTag().equals("1") || this.f24608c.f24553q0 == null) {
                return;
            }
            this.f24608c.f24553q0.setBackgroundResource(2131230828);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$x.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv$x */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$x.class */
    public class C3997x extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: b */
        public boolean f24609b;

        /* renamed from: c */
        public final NSTIJKPlayerSkyTv f24610c;

        public C3997x(NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv) {
            this.f24610c = nSTIJKPlayerSkyTv;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            this.f24609b = true;
            return super.onDown(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            this.f24610c.m19467k1();
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$y.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv$y */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$y.class */
    public class C3998y {

        /* renamed from: a */
        public final Activity f24611a;

        /* renamed from: b */
        public View f24612b;

        /* renamed from: c */
        public final NSTIJKPlayerSkyTv f24613c;

        public C3998y(NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv, Activity activity) {
            this.f24613c = nSTIJKPlayerSkyTv;
            this.f24611a = activity;
        }

        /* renamed from: a */
        public C3998y m19473a() {
            View view = this.f24612b;
            if (view != null) {
                view.setVisibility(8);
            }
            return this;
        }

        /* renamed from: b */
        public C3998y m19474b(int i10) {
            this.f24612b = this.f24611a.findViewById(i10);
            return this;
        }

        /* renamed from: c */
        public C3998y m19475c() {
            View view = this.f24612b;
            if (view != null) {
                view.requestFocus();
            }
            return this;
        }

        /* renamed from: d */
        public C3998y m19476d(CharSequence charSequence) {
            View view = this.f24612b;
            if (view != null && (view instanceof TextView)) {
                ((TextView) view).setText(charSequence);
            }
            return this;
        }

        /* renamed from: e */
        public C3998y m19477e() {
            View view = this.f24612b;
            if (view != null) {
                view.setVisibility(0);
            }
            return this;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$z.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv$z */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSkyTv$z.class */
    public static class AsyncTaskC3999z extends AsyncTask<String, Void, Boolean> {

        /* renamed from: a */
        public final Context f24614a;

        public AsyncTaskC3999z(Context context) {
            this.f24614a = context;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                LiveStreamDBHandler liveStreamDBHandler = NSTIJKPlayerSkyTv.f24439U1;
                if (liveStreamDBHandler != null) {
                    liveStreamDBHandler.m15194U0(C7920a.m34301l().m34309m());
                    NSTIJKPlayerSkyTv.f24439U1.m15237o0(C7920a.m34301l().m34309m());
                    NSTIJKPlayerSkyTv.f24439U1.m15184P0();
                }
                return Boolean.TRUE;
            } catch (Exception e10) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            try {
                if (bool.booleanValue()) {
                    Context context = this.f24614a;
                    if (context instanceof NSTIJKPlayerSkyTvActivity) {
                        ((NSTIJKPlayerSkyTvActivity) context).m18549C2(2);
                    }
                }
            } catch (Exception e10) {
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public NSTIJKPlayerSkyTv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24511b = "NSTIJKPlayerSkyTv";
        this.f24519f = 0;
        this.f24522g = 0;
        this.f24525h = 0;
        this.f24528i = null;
        this.f24531j = null;
        this.f24570w = true;
        this.f24573x = true;
        this.f24576y = true;
        this.f24579z = -1;
        this.f24441A = -1L;
        this.f24444B = true;
        this.f24447C = false;
        this.f24450D = 7000;
        this.f24459G = 0;
        this.f24465I = 0;
        this.f24468J = 5;
        this.f24471K = false;
        this.f24498T = 0L;
        this.f24501U = 0L;
        this.f24503V = 0L;
        this.f24505W = 0L;
        this.f24523g0 = "visible";
        this.f24538l0 = -1.0f;
        Boolean bool = Boolean.FALSE;
        this.f24556r0 = bool;
        this.f24559s0 = bool;
        this.f24562t0 = bool;
        this.f24565u0 = bool;
        this.f24568v0 = bool;
        this.f24571w0 = bool;
        this.f24574x0 = false;
        this.f24442A0 = false;
        this.f24445B0 = false;
        this.f24469J0 = false;
        this.f24472K0 = false;
        this.f24481N0 = false;
        this.f24527h1 = 0;
        this.f24569v1 = false;
        this.f24452D1 = new C3984k(this);
        this.f24455E1 = new C3987n(this);
        this.f24458F1 = new C3991r(this);
        this.f24461G1 = new C3992s(this);
        this.f24464H1 = new C3993t(this);
        this.f24467I1 = new C3994u(this);
        this.f24470J1 = new C3974a(this);
        this.f24473K1 = new C3975b(this);
        this.f24476L1 = new C3976c(this);
        this.f24479M1 = new C3977d(this);
        this.f24482N1 = new C3978e(this);
        this.f24485O1 = 4;
        this.f24488P1 = f24440V1[0];
        this.f24491Q1 = new ArrayList();
        this.f24494R1 = 0;
        this.f24497S1 = 0;
        this.f24500T1 = false;
        m19446P0(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [android.view.View] */
    /* renamed from: E0 */
    public final void m19435E0() {
        InterfaceC7706b interfaceC7706b;
        if (this.f24531j == null || (interfaceC7706b = this.f24549p) == null) {
            return;
        }
        interfaceC7706b.m33654c(this);
        this.f24549p.m33653b(getParent() instanceof View ? (View) getParent() : this);
        this.f24549p.setEnabled(m19448R0());
    }

    /* renamed from: F0 */
    public void m19436F0(int i10) {
        RunnableC3990q runnableC3990q = new RunnableC3990q(this);
        this.f24514c1 = runnableC3990q;
        this.f24512b1.postDelayed(runnableC3990q, i10);
    }

    /* renamed from: G0 */
    public final void m19437G0(IMediaPlayer iMediaPlayer, InterfaceC4042a.b bVar) {
        if (iMediaPlayer == null) {
            return;
        }
        if (bVar == null) {
            iMediaPlayer.setDisplay(null);
        } else {
            bVar.mo19700b(iMediaPlayer);
        }
    }

    /* renamed from: H0 */
    public final String m19438H0(String str) {
        String str2 = str;
        if (TextUtils.isEmpty(str)) {
            str2 = "und";
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    /* renamed from: I0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tv.danmaku.ijk.media.player.IMediaPlayer m19439I0(int r7) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv.m19439I0(int):tv.danmaku.ijk.media.player.IMediaPlayer");
    }

    /* renamed from: J0 */
    public void m19440J0(int i10) {
        C7709e.m33681b(this.f24531j, i10);
    }

    @Override // p324sf.InterfaceC8574m
    /* renamed from: K */
    public void mo16817K(VodInfoCallback vodInfoCallback) {
    }

    /* renamed from: K0 */
    public void m19441K0() {
        ServiceC6971a.m31982d(this.f24531j);
    }

    /* renamed from: L0 */
    public void m19442L0(Boolean bool) {
        this.f24462H = bool.booleanValue();
    }

    /* renamed from: M0 */
    public void m19443M0() {
        if (this.f24510a1.getVisibility() == 0) {
            this.f24510a1.startAnimation(this.f24518e1);
            this.f24443A1.startAnimation(this.f24518e1);
            this.f24446B1.startAnimation(this.f24518e1);
            this.f24449C1.startAnimation(this.f24518e1);
            if (this.f24521f1.getVisibility() == 0) {
                this.f24521f1.startAnimation(this.f24518e1);
            }
            if (this.f24536k1.getVisibility() == 0) {
                this.f24536k1.startAnimation(this.f24518e1);
            }
            if (this.f24524g1.getVisibility() == 0) {
                this.f24524g1.startAnimation(this.f24518e1);
            }
            this.f24510a1.setVisibility(8);
            if (this.f24521f1.getVisibility() == 0) {
                this.f24521f1.setVisibility(8);
            }
            if (this.f24536k1.getVisibility() == 0) {
                this.f24536k1.setVisibility(8);
            }
            if (this.f24524g1.getVisibility() == 0) {
                this.f24524g1.setVisibility(8);
            }
            this.f24443A1.setVisibility(8);
            this.f24446B1.setVisibility(8);
            this.f24449C1.setVisibility(8);
        }
    }

    /* renamed from: N0 */
    public final void m19444N0() {
        boolean m31278p = this.f24486P.m31278p();
        this.f24500T1 = m31278p;
        if (m31278p) {
            ServiceC6971a.m31980b(getContext());
            this.f24531j = ServiceC6971a.m31979a();
        }
    }

    /* renamed from: O0 */
    public final void m19445O0() {
        this.f24491Q1.clear();
        if (this.f24486P.m31281s()) {
            this.f24491Q1.add(1);
        }
        if (this.f24486P.m31282t()) {
            this.f24491Q1.add(2);
        }
        if (this.f24486P.m31280r()) {
            this.f24491Q1.add(0);
        }
        if (this.f24491Q1.isEmpty()) {
            this.f24491Q1.add(1);
        }
        int intValue = this.f24491Q1.get(this.f24494R1).intValue();
        this.f24497S1 = intValue;
        setRender(intValue);
    }

    /* renamed from: P0 */
    public final void m19446P0(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f24483O = applicationContext;
        this.f24486P = new C6783a(applicationContext);
        this.f24478M0 = new C5378j(this, this.f24483O);
        m19444N0();
        m19445O0();
        this.f24534k = 0;
        this.f24537l = 0;
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f24522g = 0;
        this.f24525h = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences("pref.using_sub_font_size", 0);
        this.f24475L0 = sharedPreferences;
        String string = sharedPreferences.getString("pref.using_sub_font_size", C5251a.f30039f0);
        TextView textView = new TextView(context);
        this.f24520f0 = textView;
        try {
            textView.setTextSize(2, Float.parseFloat(string));
        } catch (Exception e10) {
        }
        this.f24520f0.setTextColor(context.getResources().getColor(2131100158));
        this.f24520f0.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        layoutParams.setMargins(0, 0, 0, 40);
        addView(this.f24520f0, layoutParams);
    }

    /* renamed from: Q0 */
    public boolean m19447Q0() {
        return this.f24500T1;
    }

    /* renamed from: R0 */
    public final boolean m19448R0() {
        int i10;
        boolean z10 = true;
        if (this.f24531j == null || (i10 = this.f24522g) == -1 || i10 == 0 || i10 == 1) {
            z10 = false;
        }
        return z10;
    }

    @TargetApi(23)
    /* renamed from: S0 */
    public void m19449S0() {
        IMediaPlayer.OnErrorListener onErrorListener;
        IMediaPlayer iMediaPlayer;
        if (this.f24513c == null || this.f24528i == null) {
            return;
        }
        m19450T0(false);
        try {
            ((AudioManager) this.f24483O.getSystemService("audio")).requestAudioFocus(null, 3, 1);
        } catch (Exception e10) {
        }
        try {
            try {
                this.f24531j = m19439I0(this.f24486P.m31285w());
                getContext();
                this.f24531j.setOnPreparedListener(this.f24461G1);
                this.f24531j.setOnVideoSizeChangedListener(this.f24458F1);
                this.f24531j.setOnCompletionListener(this.f24464H1);
                this.f24531j.setOnErrorListener(this.f24470J1);
                this.f24531j.setOnInfoListener(this.f24467I1);
                this.f24531j.setOnBufferingUpdateListener(this.f24473K1);
                this.f24531j.setOnSeekCompleteListener(this.f24476L1);
                this.f24531j.setOnTimedTextListener(this.f24479M1);
                this.f24558s = 0;
                String scheme = this.f24513c.getScheme();
                if (Build.VERSION.SDK_INT >= 23 && this.f24486P.m31246E() && (TextUtils.isEmpty(scheme) || scheme.equalsIgnoreCase(TransferTable.COLUMN_FILE))) {
                    this.f24531j.setDataSource(new C7705a(new File(this.f24513c.toString())));
                } else {
                    this.f24531j.setDataSource(this.f24483O, this.f24513c, this.f24517e);
                }
                m19437G0(this.f24531j, this.f24528i);
                this.f24531j.setAudioStreamType(3);
                this.f24531j.setScreenOnWhilePlaying(true);
                this.f24498T = System.currentTimeMillis();
                this.f24531j.prepareAsync();
                this.f24544n0 = this.f24526h0.getResources().getDisplayMetrics().widthPixels;
                AudioManager audioManager = (AudioManager) this.f24526h0.getSystemService("audio");
                this.f24532j0 = audioManager;
                this.f24535k0 = audioManager.getStreamMaxVolume(3);
                int streamVolume = this.f24532j0.getStreamVolume(3);
                this.f24509Z0.setMax(this.f24532j0.getStreamMaxVolume(3));
                this.f24509Z0.setProgress(streamVolume);
                this.f24541m0 = new GestureDetector(this.f24526h0, new C3997x(this));
                m19469m1();
                this.f24577y0 = new StringBuilder();
                this.f24580z0 = new Formatter(this.f24577y0, Locale.getDefault());
                this.f24522g = 1;
            } catch (IOException e11) {
                Log.w(this.f24511b, "Unable to open content: " + this.f24513c, e11);
                this.f24522g = -1;
                this.f24525h = -1;
                onErrorListener = this.f24470J1;
                iMediaPlayer = this.f24531j;
                onErrorListener.onError(iMediaPlayer, 1, 0);
            } catch (IllegalArgumentException e12) {
                Log.w(this.f24511b, "Unable to open content: " + this.f24513c, e12);
                this.f24522g = -1;
                this.f24525h = -1;
                onErrorListener = this.f24470J1;
                iMediaPlayer = this.f24531j;
                onErrorListener.onError(iMediaPlayer, 1, 0);
            }
        } catch (NullPointerException e13) {
            Log.w(this.f24511b, "Unable to open content: " + this.f24513c, e13);
            this.f24522g = -1;
            this.f24525h = -1;
            onErrorListener = this.f24470J1;
            iMediaPlayer = this.f24531j;
            onErrorListener.onError(iMediaPlayer, 1, 0);
        } catch (Exception e14) {
            Log.w(this.f24511b, "Unable to open content: " + this.f24513c, e14);
            this.f24522g = -1;
            this.f24525h = -1;
            onErrorListener = this.f24470J1;
            iMediaPlayer = this.f24531j;
            onErrorListener.onError(iMediaPlayer, 1, 0);
        }
    }

    /* renamed from: T0 */
    public void m19450T0(boolean z10) {
        IMediaPlayer iMediaPlayer = this.f24531j;
        if (iMediaPlayer != null) {
            iMediaPlayer.reset();
            this.f24531j.release();
            this.f24531j = null;
            this.f24522g = 0;
            if (z10) {
                this.f24525h = 0;
            }
            ((AudioManager) this.f24483O.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    /* renamed from: U0 */
    public void m19451U0() {
        IMediaPlayer iMediaPlayer = this.f24531j;
        if (iMediaPlayer != null) {
            iMediaPlayer.setDisplay(null);
        }
    }

    @Override // p324sf.InterfaceC8574m
    /* renamed from: V */
    public void mo16825V(String str) {
    }

    /* renamed from: V0 */
    public void m19452V0() {
        Handler handler = this.f24453E;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: W0 */
    public void m19453W0(int i10) {
        C7709e.m33684e(this.f24531j, i10);
    }

    /* renamed from: X0 */
    public void m19454X0(Activity activity, NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv, RadioGroup radioGroup, RadioGroup radioGroup2, RadioGroup radioGroup3, TextView textView, TextView textView2, TextView textView3, TextView textView4, SeekBar seekBar, SeekBar seekBar2, LinearLayout linearLayout, Animation animation, Animation animation2, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView5, LinearLayout linearLayout4, Animation animation3, Animation animation4, TextView textView6, RelativeLayout relativeLayout, Animation animation5, Animation animation6, Animation animation7, RelativeLayout relativeLayout2, Animation animation8, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, FrameLayout frameLayout) {
        this.f24526h0 = activity;
        this.f24529i0 = nSTIJKPlayerSkyTv;
        this.f24453E = new Handler();
        this.f24456F = new Handler();
        this.f24493R0 = radioGroup;
        this.f24496S0 = radioGroup2;
        this.f24499T0 = radioGroup3;
        this.f24490Q0 = textView;
        this.f24487P0 = textView2;
        this.f24484O0 = textView3;
        this.f24504V0 = textView4;
        this.f24508Y0 = seekBar;
        this.f24509Z0 = seekBar2;
        this.f24510a1 = linearLayout;
        this.f24512b1 = new Handler();
        this.f24516d1 = animation;
        this.f24518e1 = animation2;
        this.f24521f1 = linearLayout2;
        this.f24524g1 = linearLayout3;
        this.f24508Y0.setOnSeekBarChangeListener(this.f24452D1);
        this.f24509Z0.setOnSeekBarChangeListener(this.f24455E1);
        this.f24530i1 = textView5;
        seekBar.setKeyProgressIncrement(1);
        float f10 = this.f24526h0.getWindow().getAttributes().screenBrightness;
        this.f24538l0 = f10;
        if (f10 == -1.0f) {
            this.f24538l0 = this.f24486P != null ? r0.m31277o() : C5251a.f30063r0;
        }
        seekBar.setProgress((int) this.f24538l0);
        this.f24536k1 = linearLayout4;
        this.f24539l1 = animation3;
        this.f24542m1 = animation4;
        this.f24533j1 = textView6;
        this.f24545n1 = relativeLayout;
        this.f24548o1 = animation5;
        this.f24551p1 = animation6;
        this.f24554q1 = animation7;
        this.f24563t1 = relativeLayout2;
        this.f24557r1 = animation8;
        this.f24449C1 = linearLayout7;
        this.f24446B1 = linearLayout6;
        this.f24443A1 = linearLayout5;
        this.f24550p0 = new C3998y(this, activity);
        this.f24506W0 = frameLayout;
    }

    /* renamed from: Y0 */
    public final void m19455Y0(Uri uri, Map<String, String> map, boolean z10, String str) {
        this.f24513c = uri;
        this.f24515d = str;
        this.f24517e = map;
        this.f24567v = 0;
        this.f24462H = z10;
        this.f24459G = this.f24459G;
        m19463g1();
        m19449S0();
        requestLayout();
        invalidate();
    }

    /* renamed from: Z0 */
    public void m19456Z0(Uri uri, boolean z10, String str) {
        m19455Y0(uri, null, z10, str);
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: a */
    public void mo15996a() {
    }

    /* renamed from: a1 */
    public void m19457a1() {
        if (NSTIJKPlayerSkyTvActivity.f23027p3 && this.f24510a1.getVisibility() == 8) {
            this.f24510a1.startAnimation(this.f24516d1);
            this.f24510a1.setVisibility(0);
            if (this.f24521f1.getVisibility() == 8) {
                this.f24521f1.startAnimation(this.f24516d1);
                this.f24521f1.setVisibility(0);
            }
            if (this.f24536k1.getVisibility() == 8 && !NSTIJKPlayerSkyTvActivity.m18504V1()) {
                this.f24536k1.startAnimation(this.f24516d1);
                this.f24536k1.setVisibility(0);
            }
            if (this.f24524g1.getVisibility() == 8) {
                this.f24524g1.startAnimation(this.f24516d1);
                this.f24524g1.setVisibility(0);
            }
            this.f24443A1.startAnimation(this.f24516d1);
            this.f24443A1.setVisibility(0);
            this.f24446B1.startAnimation(this.f24516d1);
            this.f24446B1.setVisibility(0);
            this.f24449C1.startAnimation(this.f24516d1);
            this.f24449C1.setVisibility(0);
        }
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: b */
    public void mo15997b() {
    }

    /* renamed from: b1 */
    public final void m19458b1(String str) {
        try {
            this.f24550p0.m19474b(2131429674).m19473a();
            this.f24550p0.m19474b(2131427519).m19477e();
            this.f24550p0.m19474b(2131427523).m19476d(str);
        } catch (Exception e10) {
        }
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: c */
    public void mo15998c(String str) {
    }

    @SuppressLint({"SetTextI18n", "ResourceType"})
    /* renamed from: c1 */
    public void m19459c1(RadioGroup radioGroup, RadioGroup radioGroup2, RadioGroup radioGroup3, TextView textView, TextView textView2, TextView textView3, TextView textView4, FrameLayout frameLayout) {
        if (this.f24531j == null) {
            return;
        }
        radioGroup.removeAllViews();
        radioGroup2.removeAllViews();
        radioGroup3.removeAllViews();
        try {
            SharedPreferences sharedPreferences = this.f24526h0.getSharedPreferences("pref.using_sub_font_size", 0);
            this.f24475L0 = sharedPreferences;
            textView4.setText(sharedPreferences.getString("pref.using_sub_font_size", C5251a.f30039f0));
            frameLayout.setOnClickListener(new ViewOnClickListenerC3980g(this));
        } catch (Exception e10) {
        }
        Boolean bool = Boolean.FALSE;
        this.f24571w0 = bool;
        this.f24568v0 = bool;
        this.f24565u0 = bool;
        this.f24559s0 = bool;
        this.f24556r0 = bool;
        this.f24562t0 = bool;
        int m33683d = C7709e.m33683d(this.f24531j, 1);
        int m33683d2 = C7709e.m33683d(this.f24531j, 2);
        int m33683d3 = C7709e.m33683d(this.f24531j, 3);
        ITrackInfo[] trackInfo = this.f24531j.getTrackInfo();
        if (trackInfo == null || trackInfo.length <= 0) {
            textView.setVisibility(0);
            textView2.setVisibility(0);
        } else {
            int i10 = -1;
            for (ITrackInfo iTrackInfo : trackInfo) {
                i10++;
                int trackType = iTrackInfo.getTrackType();
                IMediaFormat format = iTrackInfo.getFormat();
                if (format != null && (format instanceof IjkMediaFormat)) {
                    if (trackType == 1) {
                        Boolean bool2 = Boolean.TRUE;
                        this.f24565u0 = bool2;
                        if (!this.f24556r0.booleanValue()) {
                            this.f24556r0 = bool2;
                            RadioButton radioButton = new RadioButton(this.f24526h0);
                            radioButton.setText("Disable");
                            radioButton.setTextColor(getResources().getColor(2131100158));
                            radioButton.setTextSize(13.0f);
                            radioButton.setId(11111111);
                            radioButton.setButtonTintList(ColorStateList.valueOf(C4290b.m21724c(this.f24483O, 2131100158)));
                            radioButton.setPadding(0, 0, 16, 0);
                            radioButton.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3996w(this, radioButton));
                            if (m33683d == -1) {
                                radioButton.setChecked(true);
                                radioGroup.setOnCheckedChangeListener(null);
                            }
                            radioButton.setTag("2");
                            radioGroup.addView(radioButton);
                        }
                        RadioButton radioButton2 = new RadioButton(this.f24526h0);
                        iTrackInfo.getInfoInline();
                        radioButton2.setText(i10 + ", " + iTrackInfo.getInfoInline());
                        if (i10 == -1) {
                            radioButton2.setId(111);
                        } else {
                            radioButton2.setId(i10);
                        }
                        radioButton2.setTextColor(getResources().getColor(2131100158));
                        radioButton2.setTextSize(13.0f);
                        radioButton2.setButtonTintList(ColorStateList.valueOf(C4290b.m21724c(this.f24483O, 2131100158)));
                        radioButton2.setPadding(0, 0, 16, 0);
                        radioButton2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3996w(this, radioButton2));
                        if (i10 == m33683d) {
                            radioButton2.setChecked(true);
                            radioGroup.setOnCheckedChangeListener(null);
                        }
                        radioButton2.setTag("2");
                        radioGroup.addView(radioButton2);
                        radioGroup.setOnCheckedChangeListener(new C3981h(this, m33683d));
                    } else if (trackType == 2) {
                        Boolean bool3 = Boolean.TRUE;
                        this.f24568v0 = bool3;
                        if (!this.f24559s0.booleanValue()) {
                            this.f24559s0 = bool3;
                            RadioButton radioButton3 = new RadioButton(this.f24526h0);
                            radioButton3.setText("Disable");
                            radioButton3.setTextColor(getResources().getColor(2131100158));
                            radioButton3.setTextSize(13.0f);
                            radioButton3.setButtonTintList(ColorStateList.valueOf(C4290b.m21724c(this.f24483O, 2131100158)));
                            radioButton3.setId(1111111);
                            radioButton3.setPadding(0, 0, 16, 0);
                            radioButton3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3996w(this, radioButton3));
                            if (m33683d2 == -1) {
                                radioButton3.setChecked(true);
                                radioGroup2.setOnCheckedChangeListener(null);
                            }
                            radioButton3.setTag("2");
                            radioGroup2.addView(radioButton3);
                        }
                        RadioButton radioButton4 = new RadioButton(this.f24526h0);
                        radioButton4.setText(i10 + ", " + iTrackInfo.getInfoInline() + ", " + m19438H0(iTrackInfo.getLanguage()));
                        radioButton4.setTextColor(getResources().getColor(2131100158));
                        radioButton4.setTextSize(13.0f);
                        radioButton4.setButtonTintList(ColorStateList.valueOf(C4290b.m21724c(this.f24483O, 2131100158)));
                        if (i10 == -1) {
                            radioButton4.setId(1111);
                        } else {
                            radioButton4.setId(i10);
                        }
                        radioButton4.setPadding(0, 0, 16, 0);
                        radioButton4.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3996w(this, radioButton4));
                        if (i10 == m33683d2) {
                            radioButton4.setChecked(true);
                            radioGroup2.setOnCheckedChangeListener(null);
                        }
                        radioButton4.setTag("2");
                        radioGroup2.addView(radioButton4);
                        radioGroup2.setOnCheckedChangeListener(new C3982i(this, m33683d2));
                    } else if (trackType == 3) {
                        Boolean bool4 = Boolean.TRUE;
                        this.f24571w0 = bool4;
                        if (!this.f24562t0.booleanValue()) {
                            this.f24562t0 = bool4;
                            RadioButton radioButton5 = new RadioButton(this.f24526h0);
                            radioButton5.setText("Disable");
                            radioButton5.setTextColor(getResources().getColor(2131100158));
                            radioButton5.setTextSize(13.0f);
                            radioButton5.setButtonTintList(ColorStateList.valueOf(C4290b.m21724c(this.f24483O, 2131100158)));
                            radioButton5.setId(111111);
                            radioButton5.setPadding(0, 0, 16, 0);
                            radioButton5.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3996w(this, radioButton5));
                            if (m33683d3 == -1) {
                                radioButton5.setChecked(true);
                                radioGroup3.setOnCheckedChangeListener(null);
                            }
                            radioButton5.setTag("2");
                            radioGroup3.addView(radioButton5);
                        }
                        RadioButton radioButton6 = new RadioButton(this.f24526h0);
                        radioButton6.setText(i10 + ", " + iTrackInfo.getInfoInline());
                        radioButton6.setTextColor(getResources().getColor(2131100158));
                        radioButton6.setTextSize(13.0f);
                        radioButton6.setButtonTintList(ColorStateList.valueOf(C4290b.m21724c(this.f24483O, 2131100158)));
                        if (i10 == -1) {
                            radioButton6.setId(11111);
                        } else {
                            radioButton6.setId(i10);
                        }
                        radioButton6.setPadding(0, 0, 16, 0);
                        radioButton6.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3996w(this, radioButton6));
                        if (i10 == m33683d3) {
                            radioButton6.setChecked(true);
                            radioGroup3.setOnCheckedChangeListener(null);
                        }
                        radioButton6.setTag("2");
                        radioGroup3.addView(radioButton6);
                        radioGroup3.setOnCheckedChangeListener(new C3983j(this, m33683d3));
                    }
                }
            }
            if (this.f24565u0.booleanValue()) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
            if (this.f24568v0.booleanValue()) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
            if (this.f24571w0.booleanValue()) {
                textView3.setVisibility(8);
                return;
            }
        }
        textView3.setVisibility(0);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return this.f24570w;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.f24573x;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.f24576y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0217, code lost:
    
        if (r0 == (-1)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0240, code lost:
    
        m19453W0(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0229, code lost:
    
        m19440J0(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0226, code lost:
    
        if (r0 != (-1)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x023a, code lost:
    
        if (r0 == (-1)) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02d8  */
    /* renamed from: d1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m19460d1(int r11) {
        /*
            Method dump skipped, instructions count: 862
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv.m19460d1(int):void");
    }

    /* renamed from: e1 */
    public void m19461e1() {
        ServiceC6971a.m31982d(null);
    }

    /* renamed from: f1 */
    public void m19462f1() {
        Handler handler = this.f24512b1;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: g1 */
    public void m19463g1() {
        IMediaPlayer iMediaPlayer = this.f24531j;
        if (iMediaPlayer != null) {
            iMediaPlayer.stop();
            this.f24531j.release();
            this.f24531j = null;
            this.f24522g = 0;
            this.f24525h = 0;
            ((AudioManager) this.f24483O.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f24531j != null) {
            return this.f24558s;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (m19448R0()) {
            return (int) this.f24531j.getCurrentPosition();
        }
        return 0;
    }

    public int getCurrentWindowIndex() {
        return this.f24459G;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (m19448R0()) {
            return (int) this.f24531j.getDuration();
        }
        return -1;
    }

    public Boolean getFullScreenValue() {
        return Boolean.valueOf(this.f24462H);
    }

    public int getNewSeekPosition() {
        return (int) this.f24441A;
    }

    public boolean getPlayerIsPrepared() {
        return this.f24481N0;
    }

    public String getShowOrHideSubtitles() {
        return this.f24523g0;
    }

    public ITrackInfo[] getTrackInfo() {
        IMediaPlayer iMediaPlayer = this.f24531j;
        if (iMediaPlayer == null) {
            return null;
        }
        return iMediaPlayer.getTrackInfo();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: h1 */
    public final void m19464h1() {
        int i10;
        DialogC0242a.a aVar = new DialogC0242a.a(this.f24581z1);
        aVar.setTitle(getResources().getString(2132018666));
        String string = this.f24475L0.getString("pref.using_sub_font_size", C5251a.f30039f0);
        string.hashCode();
        boolean z10 = -1;
        switch (string.hashCode()) {
            case 1567:
                if (string.equals("10")) {
                    z10 = false;
                    break;
                }
                break;
            case 1569:
                if (string.equals("12")) {
                    z10 = true;
                    break;
                }
                break;
            case 1571:
                if (string.equals("14")) {
                    z10 = 2;
                    break;
                }
                break;
            case 1573:
                if (string.equals("16")) {
                    z10 = 3;
                    break;
                }
                break;
            case 1575:
                if (string.equals("18")) {
                    z10 = 4;
                    break;
                }
                break;
            case 1598:
                if (string.equals("20")) {
                    z10 = 5;
                    break;
                }
                break;
            case 1600:
                if (string.equals("22")) {
                    z10 = 6;
                    break;
                }
                break;
            case 1602:
                if (string.equals("24")) {
                    z10 = 7;
                    break;
                }
                break;
            case 1604:
                if (string.equals("26")) {
                    z10 = 8;
                    break;
                }
                break;
            case 1606:
                if (string.equals("28")) {
                    z10 = 9;
                    break;
                }
                break;
            case 1629:
                if (string.equals("30")) {
                    z10 = 10;
                    break;
                }
                break;
            case 1631:
                if (string.equals("32")) {
                    z10 = 11;
                    break;
                }
                break;
            case 1633:
                if (string.equals("34")) {
                    z10 = 12;
                    break;
                }
                break;
            case 1635:
                if (string.equals("36")) {
                    z10 = 13;
                    break;
                }
                break;
            case 1637:
                if (string.equals("38")) {
                    z10 = 14;
                    break;
                }
                break;
            case 1660:
                if (string.equals("40")) {
                    z10 = 15;
                    break;
                }
                break;
        }
        switch (z10) {
            case false:
            default:
                i10 = 0;
                break;
            case true:
                i10 = 1;
                break;
            case true:
                i10 = 2;
                break;
            case true:
                i10 = 3;
                break;
            case true:
                i10 = 4;
                break;
            case true:
                i10 = 5;
                break;
            case true:
                i10 = 6;
                break;
            case true:
                i10 = 7;
                break;
            case true:
                i10 = 8;
                break;
            case true:
                i10 = 9;
                break;
            case true:
                i10 = 10;
                break;
            case true:
                i10 = 11;
                break;
            case true:
                i10 = 12;
                break;
            case true:
                i10 = 13;
                break;
            case true:
                i10 = 14;
                break;
            case true:
                i10 = 15;
                break;
        }
        aVar.m863k(new CharSequence[]{"10", "12", "14", "16", "18", "20", "22", "24", "26", "28", "30", "32", "34", "36", "38", "40"}, i10, new DialogInterfaceOnClickListenerC3985l(this));
        DialogC0242a create = aVar.create();
        this.f24507X0 = create;
        create.setOnDismissListener(new DialogInterfaceOnDismissListenerC3986m(this));
        this.f24507X0.show();
    }

    /* renamed from: i1 */
    public final void m19465i1(String str) {
        try {
            SharedPreferences sharedPreferences = this.f24526h0.getSharedPreferences("pref.using_sub_font_size", 0);
            this.f24475L0 = sharedPreferences;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            this.f24502U0 = edit;
            if (edit != null) {
                edit.putString("pref.using_sub_font_size", str);
                this.f24502U0.apply();
            }
        } catch (Exception e10) {
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        IMediaPlayer iMediaPlayer;
        return m19448R0() && (iMediaPlayer = this.f24531j) != null && iMediaPlayer.isPlaying();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0104  */
    /* renamed from: j1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int m19466j1() {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv.m19466j1():int");
    }

    /* renamed from: k1 */
    public void m19467k1() {
        RelativeLayout relativeLayout;
        SeekBar seekBar = this.f24509Z0;
        if (seekBar != null) {
            seekBar.setProgress(this.f24532j0.getStreamVolume(3));
        }
        m19462f1();
        if (this.f24545n1.getVisibility() == 0) {
            this.f24545n1.startAnimation(this.f24548o1);
            relativeLayout = this.f24545n1;
        } else {
            if (this.f24563t1.getVisibility() != 0) {
                if (this.f24510a1.getVisibility() == 0) {
                    m19443M0();
                    return;
                } else {
                    m19457a1();
                    m19436F0(TFTP.DEFAULT_TIMEOUT);
                    return;
                }
            }
            this.f24563t1.startAnimation(this.f24557r1);
            relativeLayout = this.f24563t1;
        }
        relativeLayout.setVisibility(8);
    }

    /* renamed from: l1 */
    public final void m19468l1() {
        if (this.f24549p.m33652a()) {
            this.f24549p.m33655d();
        } else {
            this.f24549p.show();
        }
    }

    /* renamed from: m1 */
    public final void m19469m1() {
        View findViewById = this.f24526h0.findViewById(2131427469);
        this.f24547o0 = findViewById;
        findViewById.setClickable(true);
        this.f24547o0.setOnTouchListener(new ViewOnTouchListenerC3988o(this));
    }

    /* renamed from: n1 */
    public final void m19470n1() {
        C3998y m19474b;
        try {
            IMediaPlayer iMediaPlayer = this.f24531j;
            if (iMediaPlayer == null || !iMediaPlayer.isPlaying()) {
                this.f24550p0.m19474b(2131428207).m19473a();
                m19474b = this.f24550p0.m19474b(2131428208);
            } else {
                this.f24550p0.m19474b(2131428208).m19473a();
                m19474b = this.f24550p0.m19474b(2131428207);
            }
            m19474b.m19477e();
        } catch (Exception e10) {
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10 = (i10 == 4 || i10 == 24 || i10 == 25 || i10 == 164 || i10 == 82 || i10 == 5 || i10 == 6) ? false : true;
        if (m19448R0() && z10 && this.f24549p != null) {
            if (i10 == 79 || i10 == 85) {
                IMediaPlayer iMediaPlayer = this.f24531j;
                if (iMediaPlayer == null || !iMediaPlayer.isPlaying()) {
                    start();
                    this.f24549p.m33655d();
                    return true;
                }
                pause();
                this.f24549p.show();
                return true;
            }
            if (i10 == 126) {
                IMediaPlayer iMediaPlayer2 = this.f24531j;
                if (iMediaPlayer2 == null || iMediaPlayer2.isPlaying()) {
                    return true;
                }
                start();
                this.f24549p.m33655d();
                return true;
            }
            if (i10 == 86 || i10 == 127) {
                IMediaPlayer iMediaPlayer3 = this.f24531j;
                if (iMediaPlayer3 == null || !iMediaPlayer3.isPlaying()) {
                    return true;
                }
                pause();
                this.f24549p.show();
                return true;
            }
            m19468l1();
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        IMediaPlayer iMediaPlayer;
        if (m19448R0() && (iMediaPlayer = this.f24531j) != null && iMediaPlayer.isPlaying()) {
            this.f24531j.pause();
            this.f24522g = 4;
        }
        this.f24525h = 4;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i10) {
        int i11 = i10;
        if (m19448R0()) {
            this.f24503V = System.currentTimeMillis();
            this.f24531j.seekTo(i10);
            i11 = 0;
        }
        this.f24567v = i11;
    }

    public void setAdjustViewBounds(boolean z10) {
        if (this.f24566u1 == z10) {
            return;
        }
        this.f24566u1 = z10;
        if (z10) {
            setBackground(null);
        } else {
            setBackgroundColor(DefaultRenderer.BACKGROUND_COLOR);
        }
        requestLayout();
    }

    public void setContext(Context context) {
        this.f24581z1 = context;
    }

    public void setCurrentChannelLogo(String str) {
        this.f24575x1 = str;
    }

    public void setCurrentEpgChannelID(String str) {
        this.f24572w1 = str;
    }

    public void setCurrentWindowIndex(int i10) {
        this.f24459G = i10;
    }

    public void setEPGHandler(Handler handler) {
        this.f24578y1 = handler;
    }

    public void setHudView(TableLayout tableLayout) {
    }

    public void setLiveStreamDBHandler(LiveStreamDBHandler liveStreamDBHandler) {
        f24439U1 = liveStreamDBHandler;
    }

    public void setMediaController(InterfaceC7706b interfaceC7706b) {
        InterfaceC7706b interfaceC7706b2 = this.f24549p;
        if (interfaceC7706b2 != null) {
            interfaceC7706b2.m33655d();
        }
        this.f24549p = interfaceC7706b;
        m19435E0();
    }

    public void setMovieListener(AbstractC3995v abstractC3995v) {
    }

    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        this.f24552q = onCompletionListener;
    }

    public void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        this.f24561t = onErrorListener;
    }

    public void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        this.f24564u = onInfoListener;
    }

    public void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        this.f24555r = onPreparedListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setRender(int i10) {
        C4043b c4043b;
        if (i10 == 0) {
            c4043b = null;
        } else if (i10 == 1) {
            c4043b = new C4043b(getContext());
        } else {
            if (i10 != 2) {
                Log.e(this.f24511b, String.format(Locale.getDefault(), "invalid render %d\n", Integer.valueOf(i10)));
                return;
            }
            C4044c c4044c = new C4044c(getContext());
            c4043b = c4044c;
            if (this.f24531j != null) {
                c4044c.getSurfaceHolder().mo19700b(this.f24531j);
                c4044c.mo19696c(this.f24531j.getVideoWidth(), this.f24531j.getVideoHeight());
                c4044c.mo19694a(this.f24531j.getVideoSarNum(), this.f24531j.getVideoSarDen());
                c4044c.setAspectRatio(this.f24488P1);
                c4043b = c4044c;
            }
        }
        setRenderView(c4043b);
    }

    public void setRenderView(InterfaceC4042a interfaceC4042a) {
        int i10;
        int i11;
        if (this.f24489Q != null) {
            IMediaPlayer iMediaPlayer = this.f24531j;
            if (iMediaPlayer != null) {
                iMediaPlayer.setDisplay(null);
            }
            View view = this.f24489Q.getView();
            this.f24489Q.mo19695b(this.f24482N1);
            this.f24489Q = null;
            removeView(view);
        }
        if (interfaceC4042a == null) {
            return;
        }
        this.f24489Q = interfaceC4042a;
        SharedPreferences sharedPreferences = this.f24483O.getSharedPreferences("loginPrefs", 0);
        this.f24474L = sharedPreferences;
        int i12 = sharedPreferences.getInt("aspect_ratio", 4);
        this.f24485O1 = i12;
        interfaceC4042a.setAspectRatio(i12);
        int i13 = this.f24534k;
        if (i13 > 0 && (i11 = this.f24537l) > 0) {
            interfaceC4042a.mo19696c(i13, i11);
        }
        int i14 = this.f24492R;
        if (i14 > 0 && (i10 = this.f24495S) > 0) {
            interfaceC4042a.mo19694a(i14, i10);
        }
        View view2 = this.f24489Q.getView();
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        addView(view2);
        this.f24489Q.mo19698e(this.f24482N1);
        this.f24489Q.setVideoRotation(this.f24546o);
    }

    public void setShowOrHideSubtitles(String str) {
        this.f24523g0 = str;
    }

    public void setTitle(CharSequence charSequence) {
        this.f24550p0.m19474b(C10105q.f46321V).m19476d(charSequence);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        try {
            this.f24550p0.m19474b(2131429674).m19477e();
            this.f24550p0.m19474b(2131427519).m19473a();
            this.f24550p0.m19474b(2131427523).m19476d("");
        } catch (Exception e10) {
        }
        if (m19448R0()) {
            this.f24531j.start();
            this.f24522g = 3;
        }
        this.f24525h = 3;
    }
}

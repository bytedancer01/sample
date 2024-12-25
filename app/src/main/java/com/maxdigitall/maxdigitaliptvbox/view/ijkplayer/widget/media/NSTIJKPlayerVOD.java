package com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.appcompat.app.DialogC0242a;
import androidx.appcompat.widget.AppCompatImageView;
import com.amazonaws.mobileconnectors.p044s3.transferutility.TransferTable;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.callback.VodInfoCallback;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.PlayerResumeDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.RecentWatchDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SeriesRecentWatchDatabase;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.PanelAvailableChannelsPojo;
import com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import mbanje.kurt.fabbutton.FabButton;
import nf.C6783a;
import org.joda.time.DateTimeConstants;
import p151if.C5251a;
import p151if.C5255e;
import p170jf.C5378j;
import p189kf.C5602m;
import p250of.ServiceC6971a;
import p290qf.C7920a;
import p318s4.InterfaceC8527c;
import p324sf.InterfaceC8574m;
import p329t3.C8617g;
import p330t4.AbstractC8627g;
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
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD.class */
public class NSTIJKPlayerVOD extends FrameLayout implements MediaController.MediaPlayerControl, InterfaceC8574m {

    /* renamed from: M1 */
    public static final int[] f24714M1 = {0, 1, 2, 3, 4, 5};

    /* renamed from: A */
    public long f24715A;

    /* renamed from: A0 */
    public boolean f24716A0;

    /* renamed from: A1 */
    public IMediaPlayer.OnInfoListener f24717A1;

    /* renamed from: B */
    public boolean f24718B;

    /* renamed from: B0 */
    public boolean f24719B0;

    /* renamed from: B1 */
    public IMediaPlayer.OnErrorListener f24720B1;

    /* renamed from: C */
    public boolean f24721C;

    /* renamed from: C0 */
    public TextView f24722C0;

    /* renamed from: C1 */
    public IMediaPlayer.OnBufferingUpdateListener f24723C1;

    /* renamed from: D */
    public boolean f24724D;

    /* renamed from: D0 */
    public StringBuilder f24725D0;

    /* renamed from: D1 */
    public IMediaPlayer.OnSeekCompleteListener f24726D1;

    /* renamed from: E */
    public int f24727E;

    /* renamed from: E0 */
    public Formatter f24728E0;

    /* renamed from: E1 */
    public IMediaPlayer.OnTimedTextListener f24729E1;

    /* renamed from: F */
    public Handler f24730F;

    /* renamed from: F0 */
    public SharedPreferences f24731F0;

    /* renamed from: F1 */
    public InterfaceC4042a.a f24732F1;

    /* renamed from: G */
    public Handler f24733G;

    /* renamed from: G0 */
    public SharedPreferences.Editor f24734G0;

    /* renamed from: G1 */
    public int f24735G1;

    /* renamed from: H */
    public int f24736H;

    /* renamed from: H0 */
    public RecentWatchDBHandler f24737H0;

    /* renamed from: H1 */
    public int f24738H1;

    /* renamed from: I */
    public boolean f24739I;

    /* renamed from: I0 */
    public LiveStreamDBHandler f24740I0;

    /* renamed from: I1 */
    public List<Integer> f24741I1;

    /* renamed from: J */
    public int f24742J;

    /* renamed from: J0 */
    public PlayerResumeDBHandler f24743J0;

    /* renamed from: J1 */
    public int f24744J1;

    /* renamed from: K */
    public int f24745K;

    /* renamed from: K0 */
    public boolean f24746K0;

    /* renamed from: K1 */
    public int f24747K1;

    /* renamed from: L */
    public boolean f24748L;

    /* renamed from: L0 */
    public int f24749L0;

    /* renamed from: L1 */
    public boolean f24750L1;

    /* renamed from: M */
    public SharedPreferences f24751M;

    /* renamed from: M0 */
    public int f24752M0;

    /* renamed from: N */
    public SharedPreferences.Editor f24753N;

    /* renamed from: N0 */
    public long f24754N0;

    /* renamed from: O */
    public SharedPreferences f24755O;

    /* renamed from: O0 */
    public int f24756O0;

    /* renamed from: P */
    public SharedPreferences f24757P;

    /* renamed from: P0 */
    public boolean f24758P0;

    /* renamed from: Q */
    public Context f24759Q;

    /* renamed from: Q0 */
    public String f24760Q0;

    /* renamed from: R */
    public C6783a f24761R;

    /* renamed from: R0 */
    public String f24762R0;

    /* renamed from: S */
    public InterfaceC4042a f24763S;

    /* renamed from: S0 */
    public String f24764S0;

    /* renamed from: T */
    public int f24765T;

    /* renamed from: T0 */
    public ArrayList<LiveStreamsDBModel> f24766T0;

    /* renamed from: U */
    public int f24767U;

    /* renamed from: U0 */
    public boolean f24768U0;

    /* renamed from: V */
    public long f24769V;

    /* renamed from: V0 */
    public boolean f24770V0;

    /* renamed from: W */
    public long f24771W;

    /* renamed from: W0 */
    public SharedPreferences f24772W0;

    /* renamed from: X0 */
    public SharedPreferences f24773X0;

    /* renamed from: Y0 */
    public SharedPreferences f24774Y0;

    /* renamed from: Z0 */
    public SharedPreferences f24775Z0;

    /* renamed from: a1 */
    public SharedPreferences.Editor f24776a1;

    /* renamed from: b */
    public String f24777b;

    /* renamed from: b1 */
    public SharedPreferences.Editor f24778b1;

    /* renamed from: c */
    public Uri f24779c;

    /* renamed from: c1 */
    public SharedPreferences.Editor f24780c1;

    /* renamed from: d */
    public String f24781d;

    /* renamed from: d1 */
    public int f24782d1;

    /* renamed from: e */
    public Map<String, String> f24783e;

    /* renamed from: e1 */
    public boolean f24784e1;

    /* renamed from: f */
    public int f24785f;

    /* renamed from: f0 */
    public long f24786f0;

    /* renamed from: f1 */
    public boolean f24787f1;

    /* renamed from: g */
    public int f24788g;

    /* renamed from: g0 */
    public long f24789g0;

    /* renamed from: g1 */
    public boolean f24790g1;

    /* renamed from: h */
    public int f24791h;

    /* renamed from: h0 */
    public TextView f24792h0;

    /* renamed from: h1 */
    public boolean f24793h1;

    /* renamed from: i */
    public InterfaceC4042a.b f24794i;

    /* renamed from: i0 */
    public Activity f24795i0;

    /* renamed from: i1 */
    public SeriesRecentWatchDatabase f24796i1;

    /* renamed from: j */
    public IMediaPlayer f24797j;

    /* renamed from: j0 */
    public NSTIJKPlayerVOD f24798j0;

    /* renamed from: j1 */
    public boolean f24799j1;

    /* renamed from: k */
    public int f24800k;

    /* renamed from: k0 */
    public AudioManager f24801k0;

    /* renamed from: k1 */
    public C5602m f24802k1;

    /* renamed from: l */
    public int f24803l;

    /* renamed from: l0 */
    public int f24804l0;

    /* renamed from: l1 */
    public SharedPreferences f24805l1;

    /* renamed from: m */
    public int f24806m;

    /* renamed from: m0 */
    public float f24807m0;

    /* renamed from: m1 */
    public C5378j f24808m1;

    /* renamed from: n */
    public int f24809n;

    /* renamed from: n0 */
    public GestureDetector f24810n0;

    /* renamed from: n1 */
    public RelativeLayout f24811n1;

    /* renamed from: o */
    public int f24812o;

    /* renamed from: o0 */
    public int f24813o0;

    /* renamed from: o1 */
    public FabButton f24814o1;

    /* renamed from: p */
    public InterfaceC7706b f24815p;

    /* renamed from: p0 */
    public View f24816p0;

    /* renamed from: p1 */
    public int f24817p1;

    /* renamed from: q */
    public IMediaPlayer.OnCompletionListener f24818q;

    /* renamed from: q0 */
    public C4018c0 f24819q0;

    /* renamed from: q1 */
    public Runnable f24820q1;

    /* renamed from: r */
    public IMediaPlayer.OnPreparedListener f24821r;

    /* renamed from: r0 */
    public DialogC0242a f24822r0;

    /* renamed from: r1 */
    public Handler f24823r1;

    /* renamed from: s */
    public int f24824s;

    /* renamed from: s0 */
    public Button f24825s0;

    /* renamed from: s1 */
    public PopupWindow f24826s1;

    /* renamed from: t */
    public IMediaPlayer.OnErrorListener f24827t;

    /* renamed from: t0 */
    public Boolean f24828t0;

    /* renamed from: t1 */
    public Button f24829t1;

    /* renamed from: u */
    public IMediaPlayer.OnInfoListener f24830u;

    /* renamed from: u0 */
    public Boolean f24831u0;

    /* renamed from: u1 */
    public final SeekBar.OnSeekBarChangeListener f24832u1;

    /* renamed from: v */
    public int f24833v;

    /* renamed from: v0 */
    public Boolean f24834v0;

    /* renamed from: v1 */
    public Handler f24835v1;

    /* renamed from: w */
    public boolean f24836w;

    /* renamed from: w0 */
    public Boolean f24837w0;

    /* renamed from: w1 */
    public IMediaPlayer.OnVideoSizeChangedListener f24838w1;

    /* renamed from: x */
    public boolean f24839x;

    /* renamed from: x0 */
    public Boolean f24840x0;

    /* renamed from: x1 */
    public IMediaPlayer.OnPreparedListener f24841x1;

    /* renamed from: y */
    public boolean f24842y;

    /* renamed from: y0 */
    public Boolean f24843y0;

    /* renamed from: y1 */
    public IMediaPlayer.OnCompletionListener f24844y1;

    /* renamed from: z */
    public int f24845z;

    /* renamed from: z0 */
    public SeekBar f24846z0;

    /* renamed from: z1 */
    public final View.OnClickListener f24847z1;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$a.class */
    public class ViewOnClickListenerC4013a implements View.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerVOD f24848b;

        public ViewOnClickListenerC4013a(NSTIJKPlayerVOD nSTIJKPlayerVOD) {
            this.f24848b = nSTIJKPlayerVOD;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f24848b.m19666m1();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$a0.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD$a0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$a0.class */
    public class ViewOnFocusChangeListenerC4014a0 implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f24849b;

        /* renamed from: c */
        public final NSTIJKPlayerVOD f24850c;

        public ViewOnFocusChangeListenerC4014a0(NSTIJKPlayerVOD nSTIJKPlayerVOD, View view) {
            this.f24850c = nSTIJKPlayerVOD;
            this.f24849b = view;
        }

        /* renamed from: a */
        public final void m19680a(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f24849b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: b */
        public final void m19681b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f24849b, "scaleY", f10);
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
                View view2 = this.f24849b;
                if (view2 != null && view2.getTag() != null && this.f24849b.getTag().equals("1") && this.f24850c.f24825s0 != null) {
                    this.f24850c.f24825s0.setBackgroundResource(2131230845);
                }
                m19680a(1.0f);
                m19681b(1.0f);
                return;
            }
            View view3 = this.f24849b;
            if (view3 != null && view3.getTag() != null && this.f24849b.getTag().equals("2")) {
                view.setBackground(this.f24850c.getResources().getDrawable(2131231786));
                return;
            }
            if (z10) {
                f10 = 1.12f;
            }
            m19680a(f10);
            m19681b(f10);
            View view4 = this.f24849b;
            if (view4 == null || view4.getTag() == null || !this.f24849b.getTag().equals("1") || this.f24850c.f24825s0 == null) {
                return;
            }
            this.f24850c.f24825s0.setBackgroundResource(2131230828);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$b.class */
    public class ViewOnClickListenerC4015b implements View.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerVOD f24851b;

        public ViewOnClickListenerC4015b(NSTIJKPlayerVOD nSTIJKPlayerVOD) {
            this.f24851b = nSTIJKPlayerVOD;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f24851b.m19677x1();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$b0.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD$b0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$b0.class */
    public class C4016b0 extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: b */
        public boolean f24852b;

        /* renamed from: c */
        public boolean f24853c;

        /* renamed from: d */
        public boolean f24854d;

        /* renamed from: e */
        public final NSTIJKPlayerVOD f24855e;

        public C4016b0(NSTIJKPlayerVOD nSTIJKPlayerVOD) {
            this.f24855e = nSTIJKPlayerVOD;
        }

        /* renamed from: a */
        public void m19682a(boolean z10) {
            if (z10 || this.f24855e.f24718B) {
                this.f24855e.m19639M1(false);
                this.f24855e.f24819q0.m19684b(2131427532).m19683a();
                this.f24855e.f24819q0.m19684b(2131427785).m19683a();
                this.f24855e.f24819q0.m19684b(2131427506).m19686d();
                this.f24855e.f24819q0.m19684b(2131428499).m19683a();
                this.f24855e.m19668o1();
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            this.f24852b = true;
            return super.onDown(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            if (motionEvent == null || motionEvent2 == null) {
                return Boolean.parseBoolean(null);
            }
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float y11 = motionEvent2.getY();
            motionEvent2.getX();
            if (this.f24852b) {
                this.f24854d = Math.abs(f10) >= Math.abs(f11);
                this.f24853c = x10 > ((float) this.f24855e.f24813o0) * 0.5f;
                this.f24852b = false;
            }
            if (!this.f24854d) {
                float height = (y10 - y11) / this.f24855e.f24798j0.getHeight();
                if (this.f24853c) {
                    this.f24855e.m19675v1(height);
                } else {
                    this.f24855e.m19674u1(height);
                }
            }
            return super.onScroll(motionEvent, motionEvent2, f10, f11);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (this.f24855e.f24718B) {
                m19682a(false);
                return true;
            }
            LinearLayout linearLayout = (LinearLayout) this.f24855e.f24795i0.findViewById(2131427532);
            LinearLayout linearLayout2 = (LinearLayout) this.f24855e.f24795i0.findViewById(2131427785);
            LinearLayout linearLayout3 = (LinearLayout) this.f24855e.f24795i0.findViewById(2131428499);
            if (linearLayout.getVisibility() != 0) {
                NSTIJKPlayerVOD nSTIJKPlayerVOD = this.f24855e;
                nSTIJKPlayerVOD.m19638L1(nSTIJKPlayerVOD.f24727E);
                return true;
            }
            linearLayout.setVisibility(8);
            linearLayout2.setVisibility(8);
            linearLayout3.setVisibility(8);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$c.class */
    public class ViewOnClickListenerC4017c implements View.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerVOD f24856b;

        public ViewOnClickListenerC4017c(NSTIJKPlayerVOD nSTIJKPlayerVOD) {
            this.f24856b = nSTIJKPlayerVOD;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f24856b.m19677x1();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$c0.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD$c0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$c0.class */
    public class C4018c0 {

        /* renamed from: a */
        public final Activity f24857a;

        /* renamed from: b */
        public View f24858b;

        /* renamed from: c */
        public final NSTIJKPlayerVOD f24859c;

        public C4018c0(NSTIJKPlayerVOD nSTIJKPlayerVOD, Activity activity) {
            this.f24859c = nSTIJKPlayerVOD;
            this.f24857a = activity;
        }

        /* renamed from: a */
        public C4018c0 m19683a() {
            View view = this.f24858b;
            if (view != null) {
                view.setVisibility(8);
            }
            return this;
        }

        /* renamed from: b */
        public C4018c0 m19684b(int i10) {
            this.f24858b = this.f24857a.findViewById(i10);
            return this;
        }

        /* renamed from: c */
        public C4018c0 m19685c(int i10) {
            View view = this.f24858b;
            if (view instanceof ImageView) {
                ((ImageView) view).setImageResource(i10);
            }
            return this;
        }

        /* renamed from: d */
        public C4018c0 m19686d() {
            View view = this.f24858b;
            if (view != null) {
                view.setVisibility(4);
            }
            return this;
        }

        /* renamed from: e */
        public C4018c0 m19687e() {
            View view = this.f24858b;
            if (view != null) {
                view.requestFocus();
            }
            return this;
        }

        /* renamed from: f */
        public C4018c0 m19688f(CharSequence charSequence) {
            View view = this.f24858b;
            if (view != null && (view instanceof TextView)) {
                ((TextView) view).setText(charSequence);
            }
            return this;
        }

        /* renamed from: g */
        public C4018c0 m19689g(int i10) {
            View view = this.f24858b;
            if (view != null) {
                view.setVisibility(i10);
            }
            return this;
        }

        /* renamed from: h */
        public C4018c0 m19690h() {
            View view = this.f24858b;
            if (view != null) {
                view.setVisibility(0);
            }
            return this;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$d.class */
    public class ViewOnClickListenerC4019d implements View.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerVOD f24860b;

        public ViewOnClickListenerC4019d(NSTIJKPlayerVOD nSTIJKPlayerVOD) {
            this.f24860b = nSTIJKPlayerVOD;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.getId() == 2131427997 || view.getId() == 2131428371) {
                this.f24860b.m19677x1();
            } else if (view.getId() == 2131427693) {
                this.f24860b.m19666m1();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$e.class */
    public class RunnableC4020e implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerVOD f24861b;

        public RunnableC4020e(NSTIJKPlayerVOD nSTIJKPlayerVOD) {
            this.f24861b = nSTIJKPlayerVOD;
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerVOD.m19615s0(this.f24861b, 1);
            this.f24861b.f24814o1.setProgress(this.f24861b.f24817p1);
            if (this.f24861b.f24817p1 <= 140) {
                this.f24861b.f24823r1.postDelayed(this.f24861b.f24820q1, 70L);
            }
            if (this.f24861b.f24817p1 == 120) {
                this.f24861b.m19677x1();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$f.class */
    public class C4021f implements IMediaPlayer.OnInfoListener {

        /* renamed from: a */
        public final NSTIJKPlayerVOD f24862a;

        public C4021f(NSTIJKPlayerVOD nSTIJKPlayerVOD) {
            this.f24862a = nSTIJKPlayerVOD;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i10, int i11) {
            String str;
            String str2;
            if (this.f24862a.f24830u != null) {
                this.f24862a.f24830u.onInfo(iMediaPlayer, i10, i11);
            }
            if (i10 == 3) {
                this.f24862a.m19643Q1(2);
                str = this.f24862a.f24777b;
                str2 = "MEDIA_INFO_VIDEO_RENDERING_START:";
            } else if (i10 == 10005) {
                this.f24862a.m19643Q1(1);
                str = this.f24862a.f24777b;
                str2 = "MEDIA_INFO_OPEN_INPUT:";
            } else if (i10 == 901) {
                str = this.f24862a.f24777b;
                str2 = "MEDIA_INFO_UNSUPPORTED_SUBTITLE:";
            } else if (i10 == 902) {
                str = this.f24862a.f24777b;
                str2 = "MEDIA_INFO_SUBTITLE_TIMED_OUT:";
            } else {
                if (i10 == 10001) {
                    this.f24862a.f24812o = i11;
                    Log.d(this.f24862a.f24777b, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i11);
                    if (this.f24862a.f24763S == null) {
                        return true;
                    }
                    this.f24862a.f24763S.setVideoRotation(i11);
                    return true;
                }
                if (i10 != 10002) {
                    switch (i10) {
                        case 700:
                            str = this.f24862a.f24777b;
                            str2 = "MEDIA_INFO_VIDEO_TRACK_LAGGING:";
                            break;
                        case IMediaPlayer.MEDIA_INFO_BUFFERING_START /* 701 */:
                            this.f24862a.m19643Q1(1);
                            str = this.f24862a.f24777b;
                            str2 = "MEDIA_INFO_BUFFERING_START:";
                            break;
                        case IMediaPlayer.MEDIA_INFO_BUFFERING_END /* 702 */:
                            this.f24862a.m19643Q1(6);
                            str = this.f24862a.f24777b;
                            str2 = "MEDIA_INFO_BUFFERING_END:";
                            break;
                        case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH /* 703 */:
                            str = this.f24862a.f24777b;
                            str2 = "MEDIA_INFO_NETWORK_BANDWIDTH: " + i11;
                            break;
                        default:
                            switch (i10) {
                                case 800:
                                    str = this.f24862a.f24777b;
                                    str2 = "MEDIA_INFO_BAD_INTERLEAVING:";
                                    break;
                                case IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE /* 801 */:
                                    str = this.f24862a.f24777b;
                                    str2 = "MEDIA_INFO_NOT_SEEKABLE:";
                                    break;
                                case IMediaPlayer.MEDIA_INFO_METADATA_UPDATE /* 802 */:
                                    str = this.f24862a.f24777b;
                                    str2 = "MEDIA_INFO_METADATA_UPDATE:";
                                    break;
                                default:
                                    return true;
                            }
                    }
                } else {
                    str = this.f24862a.f24777b;
                    str2 = "MEDIA_INFO_AUDIO_RENDERING_START:";
                }
            }
            Log.d(str, str2);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$g.class */
    public class C4022g implements IMediaPlayer.OnErrorListener {

        /* renamed from: a */
        public final NSTIJKPlayerVOD f24863a;

        public C4022g(NSTIJKPlayerVOD nSTIJKPlayerVOD) {
            this.f24863a = nSTIJKPlayerVOD;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i10, int i11) {
            Log.d(this.f24863a.f24777b, "Error: " + i10 + "," + i11);
            this.f24863a.f24788g = -1;
            this.f24863a.f24791h = -1;
            if (this.f24863a.f24815p != null) {
                this.f24863a.f24815p.m33655d();
            }
            this.f24863a.m19643Q1(-1);
            if (this.f24863a.f24827t == null) {
                return true;
            }
            this.f24863a.f24827t.onError(this.f24863a.f24797j, i10, i11);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$h.class */
    public class C4023h implements IMediaPlayer.OnBufferingUpdateListener {

        /* renamed from: a */
        public final NSTIJKPlayerVOD f24864a;

        public C4023h(NSTIJKPlayerVOD nSTIJKPlayerVOD) {
            this.f24864a = nSTIJKPlayerVOD;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i10) {
            this.f24864a.f24824s = i10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$i.class */
    public class C4024i implements IMediaPlayer.OnSeekCompleteListener {

        /* renamed from: a */
        public final NSTIJKPlayerVOD f24865a;

        public C4024i(NSTIJKPlayerVOD nSTIJKPlayerVOD) {
            this.f24865a = nSTIJKPlayerVOD;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
            this.f24865a.f24789g0 = System.currentTimeMillis();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$j.class */
    public class C4025j implements IMediaPlayer.OnTimedTextListener {

        /* renamed from: a */
        public final NSTIJKPlayerVOD f24866a;

        public C4025j(NSTIJKPlayerVOD nSTIJKPlayerVOD) {
            this.f24866a = nSTIJKPlayerVOD;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnTimedTextListener
        public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
            if (ijkTimedText == null) {
                this.f24866a.f24792h0.setVisibility(8);
                return;
            }
            String replace = ijkTimedText.getText().replace("{\\b1}", "").replace("{\\b0}", "").replace("{\\i1}", "").replace("{\\i0}", "").replace("{\\c}", "");
            NSTIJKPlayerVOD nSTIJKPlayerVOD = this.f24866a;
            nSTIJKPlayerVOD.f24805l1 = nSTIJKPlayerVOD.f24759Q.getSharedPreferences("pref.using_sub_font_size", 0);
            try {
                this.f24866a.f24792h0.setTextSize(2, Float.parseFloat(this.f24866a.f24805l1.getString("pref.using_sub_font_size", C5251a.f30039f0)));
            } catch (Exception e10) {
            }
            this.f24866a.f24792h0.setVisibility(0);
            this.f24866a.f24792h0.setText(replace);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$k.class */
    public class C4026k extends AbstractC8627g<Bitmap> {

        /* renamed from: d */
        public final NSTIJKPlayerVOD f24867d;

        public C4026k(NSTIJKPlayerVOD nSTIJKPlayerVOD) {
            this.f24867d = nSTIJKPlayerVOD;
        }

        @Override // p330t4.InterfaceC8630j
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo16635c(Bitmap bitmap, InterfaceC8527c interfaceC8527c) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
            RelativeLayout relativeLayout = this.f24867d.f24811n1;
            if (relativeLayout != null) {
                relativeLayout.setBackground(bitmapDrawable);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$l.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD$l */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$l.class */
    public class C4027l implements InterfaceC4042a.a {

        /* renamed from: a */
        public final NSTIJKPlayerVOD f24868a;

        public C4027l(NSTIJKPlayerVOD nSTIJKPlayerVOD) {
            this.f24868a = nSTIJKPlayerVOD;
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.a
        /* renamed from: a */
        public void mo18794a(InterfaceC4042a.b bVar, int i10, int i11, int i12) {
            if (bVar.mo19699a() != this.f24868a.f24763S) {
                Log.e(this.f24868a.f24777b, "onSurfaceChanged: unmatched render callback\n");
                return;
            }
            this.f24868a.f24806m = i11;
            this.f24868a.f24809n = i12;
            boolean z10 = this.f24868a.f24791h == 3;
            boolean z11 = true;
            if (this.f24868a.f24763S.mo19697d()) {
                z11 = this.f24868a.f24800k == i11 && this.f24868a.f24803l == i12;
            }
            if (this.f24868a.f24797j != null && z10 && z11) {
                if (this.f24868a.f24833v != 0) {
                    NSTIJKPlayerVOD nSTIJKPlayerVOD = this.f24868a;
                    nSTIJKPlayerVOD.seekTo(nSTIJKPlayerVOD.f24833v);
                }
                this.f24868a.start();
            }
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.a
        /* renamed from: b */
        public void mo18795b(InterfaceC4042a.b bVar) {
            if (bVar.mo19699a() != this.f24868a.f24763S) {
                Log.e(this.f24868a.f24777b, "onSurfaceDestroyed: unmatched render callback\n");
            } else {
                this.f24868a.f24794i = null;
                this.f24868a.m19679z1();
            }
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.a
        /* renamed from: c */
        public void mo18796c(InterfaceC4042a.b bVar, int i10, int i11) {
            if (bVar.mo19699a() != this.f24868a.f24763S) {
                Log.e(this.f24868a.f24777b, "onSurfaceCreated: unmatched render callback\n");
                return;
            }
            this.f24868a.f24794i = bVar;
            if (this.f24868a.f24797j == null) {
                this.f24868a.m19676w1();
            } else {
                NSTIJKPlayerVOD nSTIJKPlayerVOD = this.f24868a;
                nSTIJKPlayerVOD.m19653a1(nSTIJKPlayerVOD.f24797j, bVar);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$m.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD$m */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$m.class */
    public class RunnableC4028m implements Runnable {

        /* renamed from: b */
        public final LinearLayout f24869b;

        /* renamed from: c */
        public final NSTIJKPlayerVOD f24870c;

        public RunnableC4028m(NSTIJKPlayerVOD nSTIJKPlayerVOD, LinearLayout linearLayout) {
            this.f24870c = nSTIJKPlayerVOD;
            this.f24869b = linearLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f24869b.setVisibility(8);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$n.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD$n */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$n.class */
    public class C4029n implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: a */
        public final int f24871a;

        /* renamed from: b */
        public final PopupWindow f24872b;

        /* renamed from: c */
        public final NSTIJKPlayerVOD f24873c;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$n$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD$n$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$n$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final C4029n f24874b;

            public a(C4029n c4029n) {
                this.f24874b = c4029n;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f24874b.f24872b.dismiss();
            }
        }

        public C4029n(NSTIJKPlayerVOD nSTIJKPlayerVOD, int i10, PopupWindow popupWindow) {
            this.f24873c = nSTIJKPlayerVOD;
            this.f24871a = i10;
            this.f24872b = popupWindow;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i10) {
            NSTIJKPlayerVOD nSTIJKPlayerVOD = this.f24873c;
            nSTIJKPlayerVOD.f24780c1 = nSTIJKPlayerVOD.f24775Z0.edit();
            if (i10 == 111 || i10 == 11111111) {
                this.f24873c.f24780c1.putInt("currentVideoTrack", -1);
                this.f24873c.m19660g1(this.f24871a);
            } else {
                this.f24873c.f24780c1.putInt("currentVideoTrack", i10);
                this.f24873c.m19629C1(i10);
                int currentPosition = this.f24873c.f24798j0.getCurrentPosition();
                if (currentPosition != 0) {
                    NSTIJKPlayerVOD nSTIJKPlayerVOD2 = this.f24873c;
                    nSTIJKPlayerVOD2.f24731F0 = nSTIJKPlayerVOD2.f24795i0.getSharedPreferences("currentSeekTime", 0);
                    NSTIJKPlayerVOD nSTIJKPlayerVOD3 = this.f24873c;
                    nSTIJKPlayerVOD3.f24734G0 = nSTIJKPlayerVOD3.f24731F0.edit();
                    this.f24873c.f24734G0.putString("currentSeekTime", String.valueOf(currentPosition));
                    this.f24873c.f24734G0.apply();
                }
                this.f24873c.m19676w1();
                this.f24873c.start();
                this.f24873c.setCurrentPositionSeekbar(currentPosition);
                this.f24873c.setProgress(true);
            }
            this.f24873c.f24780c1.apply();
            new Handler().postDelayed(new a(this), 500L);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$o.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD$o */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$o.class */
    public class C4030o implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: a */
        public final int f24875a;

        /* renamed from: b */
        public final PopupWindow f24876b;

        /* renamed from: c */
        public final NSTIJKPlayerVOD f24877c;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$o$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD$o$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$o$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final C4030o f24878b;

            public a(C4030o c4030o) {
                this.f24878b = c4030o;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f24878b.f24876b.dismiss();
            }
        }

        public C4030o(NSTIJKPlayerVOD nSTIJKPlayerVOD, int i10, PopupWindow popupWindow) {
            this.f24877c = nSTIJKPlayerVOD;
            this.f24875a = i10;
            this.f24876b = popupWindow;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i10) {
            NSTIJKPlayerVOD nSTIJKPlayerVOD = this.f24877c;
            nSTIJKPlayerVOD.f24778b1 = nSTIJKPlayerVOD.f24774Y0.edit();
            if (i10 == 1111 || i10 == 1111111) {
                this.f24877c.f24778b1.putInt("currentAudioTrack", -1);
                this.f24877c.m19660g1(this.f24875a);
            } else {
                this.f24877c.f24778b1.putInt("currentAudioTrack", i10);
                int currentPosition = (int) this.f24877c.f24797j.getCurrentPosition();
                this.f24877c.m19629C1(i10);
                this.f24877c.f24797j.seekTo(Long.parseLong(String.valueOf(currentPosition)));
            }
            this.f24877c.f24778b1.apply();
            new Handler().postDelayed(new a(this), 500L);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$p.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD$p */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$p.class */
    public class C4031p implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: a */
        public final int f24879a;

        /* renamed from: b */
        public final PopupWindow f24880b;

        /* renamed from: c */
        public final NSTIJKPlayerVOD f24881c;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$p$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD$p$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$p$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final C4031p f24882b;

            public a(C4031p c4031p) {
                this.f24882b = c4031p;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f24882b.f24880b.dismiss();
            }
        }

        public C4031p(NSTIJKPlayerVOD nSTIJKPlayerVOD, int i10, PopupWindow popupWindow) {
            this.f24881c = nSTIJKPlayerVOD;
            this.f24879a = i10;
            this.f24880b = popupWindow;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i10) {
            NSTIJKPlayerVOD nSTIJKPlayerVOD = this.f24881c;
            nSTIJKPlayerVOD.f24776a1 = nSTIJKPlayerVOD.f24773X0.edit();
            if (i10 == 11111 || i10 == 111111) {
                this.f24881c.f24776a1.putInt("currentSubtitleTrack", -1);
                this.f24881c.m19660g1(this.f24879a);
            } else {
                this.f24881c.f24776a1.putInt("currentSubtitleTrack", i10);
                this.f24881c.m19629C1(i10);
            }
            this.f24881c.f24776a1.apply();
            new Handler().postDelayed(new a(this), 500L);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$q.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD$q */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$q.class */
    public class DialogInterfaceOnDismissListenerC4032q implements DialogInterface.OnDismissListener {

        /* renamed from: b */
        public final NSTIJKPlayerVOD f24883b;

        public DialogInterfaceOnDismissListenerC4032q(NSTIJKPlayerVOD nSTIJKPlayerVOD) {
            this.f24883b = nSTIJKPlayerVOD;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (this.f24883b.f24798j0 != null) {
                this.f24883b.f24798j0.m19667n1();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$r.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD$r */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$r.class */
    public class DialogInterfaceOnShowListenerC4033r implements DialogInterface.OnShowListener {

        /* renamed from: a */
        public final NSTIJKPlayerVOD f24884a;

        public DialogInterfaceOnShowListenerC4033r(NSTIJKPlayerVOD nSTIJKPlayerVOD) {
            this.f24884a = nSTIJKPlayerVOD;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            Button button;
            Resources resources;
            int i10;
            NSTIJKPlayerVOD nSTIJKPlayerVOD = this.f24884a;
            nSTIJKPlayerVOD.f24825s0 = nSTIJKPlayerVOD.f24822r0.m851e(-2);
            this.f24884a.f24825s0.setTag("1");
            Button button2 = this.f24884a.f24825s0;
            NSTIJKPlayerVOD nSTIJKPlayerVOD2 = this.f24884a;
            button2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC4014a0(nSTIJKPlayerVOD2, nSTIJKPlayerVOD2.f24825s0));
            this.f24884a.f24825s0.setTextColor(this.f24884a.f24795i0.getResources().getColor(2131100158));
            this.f24884a.f24825s0.setTextSize(16.0f);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f24884a.f24825s0.getLayoutParams();
            marginLayoutParams.setMargins(0, 10, 50, 10);
            if (this.f24884a.f24761R.m31288z().equals(C5251a.f30065s0)) {
                button = this.f24884a.f24825s0;
                resources = this.f24884a.f24795i0.getResources();
                i10 = 2131230845;
            } else {
                button = this.f24884a.f24825s0;
                resources = this.f24884a.f24795i0.getResources();
                i10 = 2131230828;
            }
            button.setBackground(resources.getDrawable(i10));
            marginLayoutParams.width = 240;
            marginLayoutParams.height = 135;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$s.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD$s */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$s.class */
    public class C4034s implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: b */
        public final NSTIJKPlayerVOD f24885b;

        public C4034s(NSTIJKPlayerVOD nSTIJKPlayerVOD) {
            this.f24885b = nSTIJKPlayerVOD;
        }

        /* renamed from: a */
        public final String m19692a(long j10) {
            int i10 = (int) (j10 / 1000);
            int i11 = i10 % 60;
            int i12 = (i10 / 60) % 60;
            int i13 = i10 / 3600;
            return i13 > 0 ? String.format("%02d:%02d:%02d", Integer.valueOf(i13), Integer.valueOf(i12), Integer.valueOf(i11)) : String.format("%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i11));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            if (z10 && this.f24885b.f24797j != null) {
                this.f24885b.f24819q0.m19684b(2131427519).m19683a();
                int duration = (int) (this.f24885b.f24798j0.getDuration() * ((i10 * 1.0d) / 1000.0d));
                m19692a(duration);
                NSTIJKPlayerVOD nSTIJKPlayerVOD = this.f24885b;
                if (nSTIJKPlayerVOD.f24793h1) {
                    nSTIJKPlayerVOD.f24798j0.seekTo(duration);
                }
                TextView textView = this.f24885b.f24722C0;
                StringBuilder sb2 = new StringBuilder();
                NSTIJKPlayerVOD nSTIJKPlayerVOD2 = this.f24885b;
                sb2.append(nSTIJKPlayerVOD2.m19647U1(nSTIJKPlayerVOD2.f24798j0.getCurrentPosition()));
                sb2.append("/");
                NSTIJKPlayerVOD nSTIJKPlayerVOD3 = this.f24885b;
                sb2.append(nSTIJKPlayerVOD3.m19647U1(nSTIJKPlayerVOD3.f24798j0.getDuration()));
                textView.setText(sb2.toString());
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            NSTIJKPlayerVOD nSTIJKPlayerVOD = this.f24885b;
            nSTIJKPlayerVOD.f24790g1 = true;
            nSTIJKPlayerVOD.m19638L1(DateTimeConstants.MILLIS_PER_HOUR);
            this.f24885b.f24835v1.removeMessages(1);
            NSTIJKPlayerVOD nSTIJKPlayerVOD2 = this.f24885b;
            if (nSTIJKPlayerVOD2.f24793h1) {
                nSTIJKPlayerVOD2.f24801k0.setStreamMute(3, true);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            if (this.f24885b.f24797j == null) {
                return;
            }
            NSTIJKPlayerVOD nSTIJKPlayerVOD = this.f24885b;
            if (!nSTIJKPlayerVOD.f24793h1) {
                nSTIJKPlayerVOD.f24798j0.seekTo((int) (this.f24885b.f24798j0.getDuration() * ((seekBar.getProgress() * 1.0d) / 1000.0d)));
            }
            NSTIJKPlayerVOD nSTIJKPlayerVOD2 = this.f24885b;
            nSTIJKPlayerVOD2.m19638L1(nSTIJKPlayerVOD2.f24727E);
            this.f24885b.f24835v1.removeMessages(1);
            this.f24885b.f24801k0.setStreamMute(3, false);
            NSTIJKPlayerVOD nSTIJKPlayerVOD3 = this.f24885b;
            nSTIJKPlayerVOD3.f24790g1 = false;
            nSTIJKPlayerVOD3.f24835v1.sendEmptyMessageDelayed(1, 1000L);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$t.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD$t */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$t.class */
    public class ViewOnTouchListenerC4035t implements View.OnTouchListener {

        /* renamed from: b */
        public final NSTIJKPlayerVOD f24886b;

        public ViewOnTouchListenerC4035t(NSTIJKPlayerVOD nSTIJKPlayerVOD) {
            this.f24886b = nSTIJKPlayerVOD;
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent == null) {
                return false;
            }
            if (this.f24886b.f24810n0.onTouchEvent(motionEvent)) {
                return true;
            }
            if ((motionEvent.getAction() & 255) != 1) {
                return false;
            }
            this.f24886b.m19661h1();
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$u.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD$u */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$u.class */
    public class HandlerC4036u extends Handler {

        /* renamed from: a */
        public final NSTIJKPlayerVOD f24887a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HandlerC4036u(NSTIJKPlayerVOD nSTIJKPlayerVOD, Looper looper) {
            super(looper);
            this.f24887a = nSTIJKPlayerVOD;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                this.f24887a.m19633G1();
                NSTIJKPlayerVOD nSTIJKPlayerVOD = this.f24887a;
                if (nSTIJKPlayerVOD.f24790g1 || !nSTIJKPlayerVOD.f24718B) {
                    return;
                }
                this.f24887a.f24835v1.sendMessageDelayed(this.f24887a.f24835v1.obtainMessage(1), 300L);
                this.f24887a.m19651Y1();
                return;
            }
            if (i10 == 2) {
                this.f24887a.m19664k1(false);
                return;
            }
            if (i10 == 3) {
                if (this.f24887a.f24715A >= 0) {
                    this.f24887a.f24798j0.seekTo((int) this.f24887a.f24715A);
                    this.f24887a.f24715A = -1L;
                    return;
                }
                return;
            }
            if (i10 != 4) {
                return;
            }
            this.f24887a.f24819q0.m19684b(2131427540).m19683a();
            this.f24887a.f24819q0.m19684b(2131427478).m19683a();
            this.f24887a.f24819q0.m19684b(2131427500).m19683a();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$v.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD$v */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$v.class */
    public class RunnableC4037v implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerVOD f24888b;

        public RunnableC4037v(NSTIJKPlayerVOD nSTIJKPlayerVOD) {
            this.f24888b = nSTIJKPlayerVOD;
        }

        @Override // java.lang.Runnable
        public void run() {
            Activity activity;
            StringBuilder sb2;
            Resources resources;
            int i10;
            NSTIJKPlayerVOD nSTIJKPlayerVOD = this.f24888b;
            nSTIJKPlayerVOD.f24742J++;
            nSTIJKPlayerVOD.m19665l1();
            if (this.f24888b.f24762R0.equals("dfo") || this.f24888b.f24762R0.equals("devicedata")) {
                activity = this.f24888b.f24795i0;
                sb2 = new StringBuilder();
                resources = this.f24888b.f24795i0.getResources();
                i10 = 2132017383;
            } else {
                activity = this.f24888b.f24795i0;
                sb2 = new StringBuilder();
                resources = this.f24888b.f24795i0.getResources();
                i10 = 2132018322;
            }
            sb2.append(resources.getString(i10));
            sb2.append(" (");
            sb2.append(this.f24888b.f24742J);
            sb2.append("/");
            sb2.append(this.f24888b.f24745K);
            sb2.append(")");
            C5255e.m26241k0(activity, sb2.toString());
            this.f24888b.m19676w1();
            this.f24888b.start();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$w.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD$w */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$w.class */
    public class C4038w implements IMediaPlayer.OnVideoSizeChangedListener {

        /* renamed from: a */
        public final NSTIJKPlayerVOD f24889a;

        public C4038w(NSTIJKPlayerVOD nSTIJKPlayerVOD) {
            this.f24889a = nSTIJKPlayerVOD;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i10, int i11, int i12, int i13) {
            this.f24889a.f24800k = iMediaPlayer.getVideoWidth();
            this.f24889a.f24803l = iMediaPlayer.getVideoHeight();
            this.f24889a.f24765T = iMediaPlayer.getVideoSarNum();
            this.f24889a.f24767U = iMediaPlayer.getVideoSarDen();
            if (this.f24889a.f24800k == 0 || this.f24889a.f24803l == 0) {
                return;
            }
            if (this.f24889a.f24763S != null) {
                this.f24889a.f24763S.mo19696c(this.f24889a.f24800k, this.f24889a.f24803l);
                this.f24889a.f24763S.mo19694a(this.f24889a.f24765T, this.f24889a.f24767U);
            }
            this.f24889a.requestLayout();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$x.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD$x */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$x.class */
    public class C4039x implements IMediaPlayer.OnPreparedListener {

        /* renamed from: a */
        public final NSTIJKPlayerVOD f24890a;

        public C4039x(NSTIJKPlayerVOD nSTIJKPlayerVOD) {
            this.f24890a = nSTIJKPlayerVOD;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            this.f24890a.f24771W = System.currentTimeMillis();
            this.f24890a.f24788g = 2;
            if (this.f24890a.f24821r != null) {
                this.f24890a.f24821r.onPrepared(this.f24890a.f24797j);
            }
            if (this.f24890a.f24815p != null) {
                this.f24890a.f24815p.setEnabled(true);
            }
            this.f24890a.f24800k = iMediaPlayer.getVideoWidth();
            this.f24890a.f24803l = iMediaPlayer.getVideoHeight();
            int i10 = this.f24890a.f24833v;
            if (i10 != 0) {
                this.f24890a.seekTo(i10);
            }
            if (this.f24890a.f24800k == 0 || this.f24890a.f24803l == 0) {
                if (this.f24890a.f24791h == 3) {
                    this.f24890a.start();
                    return;
                }
                return;
            }
            if (this.f24890a.f24763S != null) {
                this.f24890a.f24763S.mo19696c(this.f24890a.f24800k, this.f24890a.f24803l);
                this.f24890a.f24763S.mo19694a(this.f24890a.f24765T, this.f24890a.f24767U);
                if (!this.f24890a.f24763S.mo19697d() || (this.f24890a.f24806m == this.f24890a.f24800k && this.f24890a.f24809n == this.f24890a.f24803l)) {
                    if (this.f24890a.f24791h == 3) {
                        this.f24890a.start();
                        if (this.f24890a.f24815p != null) {
                            this.f24890a.f24815p.show();
                            return;
                        }
                        return;
                    }
                    if (this.f24890a.isPlaying()) {
                        return;
                    }
                    if ((i10 != 0 || this.f24890a.getCurrentPosition() > 0) && this.f24890a.f24815p != null) {
                        this.f24890a.f24815p.show(0);
                    }
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$y.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD$y */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$y.class */
    public class C4040y implements IMediaPlayer.OnCompletionListener {

        /* renamed from: a */
        public final NSTIJKPlayerVOD f24891a;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$y$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD$y$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$y$a.class */
        public class a extends AbstractC8627g<Bitmap> {

            /* renamed from: d */
            public final C4040y f24892d;

            public a(C4040y c4040y) {
                this.f24892d = c4040y;
            }

            @Override // p330t4.InterfaceC8630j
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public void mo16635c(Bitmap bitmap, InterfaceC8527c interfaceC8527c) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
                RelativeLayout relativeLayout = this.f24892d.f24891a.f24811n1;
                if (relativeLayout != null) {
                    relativeLayout.setBackground(bitmapDrawable);
                }
            }
        }

        public C4040y(NSTIJKPlayerVOD nSTIJKPlayerVOD) {
            this.f24891a = nSTIJKPlayerVOD;
        }

        /* JADX WARN: Code restructure failed: missing block: B:65:0x0219, code lost:
        
            if (r0.equals("catch_up") == false) goto L60;
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0251  */
        /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onCompletion(tv.danmaku.ijk.media.player.IMediaPlayer r6) {
            /*
                Method dump skipped, instructions count: 618
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD.C4040y.onCompletion(tv.danmaku.ijk.media.player.IMediaPlayer):void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$z.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD$z */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerVOD$z.class */
    public class C4041z implements PopupWindow.OnDismissListener {

        /* renamed from: b */
        public final NSTIJKPlayerVOD f24893b;

        public C4041z(NSTIJKPlayerVOD nSTIJKPlayerVOD) {
            this.f24893b = nSTIJKPlayerVOD;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (this.f24893b.f24823r1 != null && this.f24893b.f24820q1 != null) {
                this.f24893b.f24823r1.removeCallbacks(this.f24893b.f24820q1);
            }
            this.f24893b.f24829t1.performClick();
            this.f24893b.m19667n1();
        }
    }

    public NSTIJKPlayerVOD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24777b = "NSTIJKPlayerVOD";
        this.f24785f = 0;
        this.f24788g = 0;
        this.f24791h = 0;
        this.f24794i = null;
        this.f24797j = null;
        this.f24836w = true;
        this.f24839x = true;
        this.f24842y = true;
        this.f24845z = -1;
        this.f24715A = -1L;
        this.f24721C = true;
        this.f24724D = false;
        this.f24727E = 7000;
        this.f24736H = 0;
        this.f24742J = 0;
        this.f24745K = 5;
        this.f24748L = false;
        this.f24769V = 0L;
        this.f24771W = 0L;
        this.f24786f0 = 0L;
        this.f24789g0 = 0L;
        this.f24807m0 = -1.0f;
        Boolean bool = Boolean.FALSE;
        this.f24828t0 = bool;
        this.f24831u0 = bool;
        this.f24834v0 = bool;
        this.f24837w0 = bool;
        this.f24840x0 = bool;
        this.f24843y0 = bool;
        this.f24716A0 = false;
        this.f24719B0 = false;
        this.f24746K0 = false;
        this.f24758P0 = false;
        this.f24768U0 = false;
        this.f24770V0 = false;
        this.f24784e1 = false;
        this.f24787f1 = false;
        this.f24799j1 = false;
        this.f24817p1 = 0;
        this.f24832u1 = new C4034s(this);
        this.f24835v1 = new HandlerC4036u(this, Looper.getMainLooper());
        this.f24838w1 = new C4038w(this);
        this.f24841x1 = new C4039x(this);
        this.f24844y1 = new C4040y(this);
        this.f24847z1 = new ViewOnClickListenerC4019d(this);
        this.f24717A1 = new C4021f(this);
        this.f24720B1 = new C4022g(this);
        this.f24723C1 = new C4023h(this);
        this.f24726D1 = new C4024i(this);
        this.f24729E1 = new C4025j(this);
        this.f24732F1 = new C4027l(this);
        this.f24735G1 = 4;
        this.f24738H1 = f24714M1[0];
        this.f24741I1 = new ArrayList();
        this.f24744J1 = 0;
        this.f24747K1 = 0;
        this.f24750L1 = false;
        m19671r1(context);
    }

    private void getRunnable() {
        RunnableC4020e runnableC4020e = new RunnableC4020e(this);
        this.f24820q1 = runnableC4020e;
        if (new boolean[]{false}[0]) {
            return;
        }
        runnableC4020e.run();
    }

    /* renamed from: s0 */
    public static /* synthetic */ int m19615s0(NSTIJKPlayerVOD nSTIJKPlayerVOD, int i10) {
        int i11 = nSTIJKPlayerVOD.f24817p1 + i10;
        nSTIJKPlayerVOD.f24817p1 = i11;
        return i11;
    }

    /* renamed from: A1 */
    public void m19627A1(boolean z10) {
        this.f24784e1 = z10;
    }

    /* renamed from: B1 */
    public void m19628B1() {
        Handler handler = this.f24730F;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: C1 */
    public void m19629C1(int i10) {
        C7709e.m33684e(this.f24797j, i10);
    }

    /* renamed from: D1 */
    public void m19630D1(Activity activity, NSTIJKPlayerVOD nSTIJKPlayerVOD, SeekBar seekBar, TextView textView) {
        this.f24795i0 = activity;
        this.f24798j0 = nSTIJKPlayerVOD;
        this.f24730F = new Handler();
        this.f24846z0 = seekBar;
        this.f24722C0 = textView;
        this.f24733G = new Handler();
        this.f24737H0 = new RecentWatchDBHandler(activity);
        this.f24740I0 = new LiveStreamDBHandler(activity);
        this.f24819q0 = new C4018c0(this, activity);
    }

    /* renamed from: E1 */
    public void m19631E1(Context context, ArrayList<LiveStreamsDBModel> arrayList, int i10) {
        String m14805L = arrayList.get(i10).m14805L();
        String name = arrayList.get(i10).getName();
        String m14812S = arrayList.get(i10).m14812S();
        String m14811R = arrayList.get(i10).m14811R();
        String m14810Q = arrayList.get(i10).m14810Q();
        String m14798E = arrayList.get(i10).m14798E();
        String m14823d = arrayList.get(i10).m14823d();
        String m14827g = arrayList.get(i10).m14827g();
        String m14796A = arrayList.get(i10).m14796A();
        arrayList.get(i10).m14813T();
        String m14797D = arrayList.get(i10).m14797D();
        String m14814U = arrayList.get(i10).m14814U();
        String m14815V = arrayList.get(i10).m14815V();
        String m14830i = arrayList.get(i10).m14830i();
        String m14809P = arrayList.get(i10).m14809P();
        String m14802I = arrayList.get(i10).m14802I();
        String m14846x = arrayList.get(i10).m14846x();
        String m14808O = arrayList.get(i10).m14808O();
        String m14807N = arrayList.get(i10).m14807N();
        PanelAvailableChannelsPojo panelAvailableChannelsPojo = new PanelAvailableChannelsPojo();
        panelAvailableChannelsPojo.m15428H(Integer.valueOf(m14805L));
        panelAvailableChannelsPojo.m15427G(name);
        panelAvailableChannelsPojo.m15434N(m14812S);
        panelAvailableChannelsPojo.m15433M(m14811R);
        panelAvailableChannelsPojo.m15432L(m14810Q);
        panelAvailableChannelsPojo.m15423C(m14798E);
        panelAvailableChannelsPojo.m15461w(m14823d);
        panelAvailableChannelsPojo.m15462x(m14827g);
        panelAvailableChannelsPojo.m15421A(m14796A);
        panelAvailableChannelsPojo.m15435O(0);
        panelAvailableChannelsPojo.m15422B(m14797D);
        panelAvailableChannelsPojo.m15436P(m14814U);
        panelAvailableChannelsPojo.m15437Q(m14815V);
        panelAvailableChannelsPojo.m15463y(m14830i);
        panelAvailableChannelsPojo.m15431K(m14809P);
        panelAvailableChannelsPojo.m15424D(m14802I);
        panelAvailableChannelsPojo.m15464z(m14846x);
        panelAvailableChannelsPojo.m15438R(SharepreferenceDBHandler.m15337A(context));
        panelAvailableChannelsPojo.m15426F(0L);
        panelAvailableChannelsPojo.m15425E(0L);
        panelAvailableChannelsPojo.m15430J(m14808O);
        panelAvailableChannelsPojo.m15429I(m14807N);
        this.f24737H0.m15307f(panelAvailableChannelsPojo);
    }

    /* renamed from: F1 */
    public void m19632F1() {
        int m19646T1;
        Context context = getContext();
        if (C7920a.m34301l() == null || (m19646T1 = m19646T1(C7920a.m34301l().m34311o(), SharepreferenceDBHandler.m15337A(context))) > 0 || m19646T1 != 0 || this.f24762R0.equals("dfo") || this.f24762R0.equals("devicedata")) {
            return;
        }
        m19634H1(context, C7920a.m34301l().m34306c(), C7920a.m34301l().m34307j());
    }

    /* renamed from: G1 */
    public final int m19633G1() {
        int currentPosition;
        if (this.f24790g1) {
            return 0;
        }
        if (this.f24784e1) {
            m19664k1(true);
            this.f24784e1 = false;
            return 0;
        }
        if (this.f24798j0.getProgress()) {
            this.f24798j0.setProgress(false);
            currentPosition = this.f24798j0.getCurrentPositionSeekbar();
            this.f24798j0.seekTo(currentPosition);
        } else {
            currentPosition = this.f24798j0.getCurrentPosition();
        }
        int duration = this.f24798j0.getDuration();
        SeekBar seekBar = this.f24846z0;
        if (seekBar != null) {
            if (duration > 0) {
                seekBar.setProgress((int) ((currentPosition * 1000) / duration));
            }
            this.f24846z0.setSecondaryProgress(this.f24798j0.getBufferPercentage() * 10);
        }
        if (duration == 0) {
            this.f24722C0.setText("Live");
        } else {
            this.f24722C0.setText(m19647U1(currentPosition) + "/" + m19647U1(duration));
        }
        return currentPosition;
    }

    /* renamed from: H1 */
    public final void m19634H1(Context context, ArrayList<LiveStreamsDBModel> arrayList, int i10) {
        if (this.f24737H0.m15299A0(SharepreferenceDBHandler.m15337A(context)) >= 100) {
            new ArrayList();
            ArrayList<LiveStreamsDBModel> m15317w = this.f24737H0.m15317w("movie", SharepreferenceDBHandler.m15337A(context), "getOnedata");
            if (m15317w.isEmpty()) {
                this.f24737H0.m15315v(Integer.parseInt(m15317w.get(0).m14811R()), "movie");
            }
        }
        m19631E1(context, arrayList, i10);
    }

    /* renamed from: I1 */
    public void m19635I1(String str, boolean z10, String str2, long j10, int i10, String str3, ArrayList<LiveStreamsDBModel> arrayList, int i11, int i12, String str4, String str5) {
        this.f24762R0 = str5;
        m19637K1(Uri.parse(str), z10, str2, j10, i10, str3, arrayList, i11, i12, str4);
    }

    /* renamed from: J1 */
    public final void m19636J1(Uri uri, Map<String, String> map, boolean z10, String str, long j10, int i10, String str2, ArrayList<LiveStreamsDBModel> arrayList, int i11, int i12, String str3) {
        this.f24779c = uri;
        this.f24781d = str;
        this.f24783e = map;
        this.f24833v = 0;
        this.f24739I = z10;
        this.f24764S0 = str2;
        this.f24754N0 = j10;
        this.f24749L0 = i10;
        this.f24756O0 = i12;
        this.f24766T0 = arrayList;
        this.f24743J0 = new PlayerResumeDBHandler(this.f24795i0);
        this.f24737H0 = new RecentWatchDBHandler(this.f24795i0);
        this.f24796i1 = new SeriesRecentWatchDatabase(this.f24795i0);
        this.f24802k1 = new C5602m(this.f24795i0);
        this.f24740I0 = new LiveStreamDBHandler(this.f24795i0);
        this.f24752M0 = SharepreferenceDBHandler.m15337A(this.f24795i0);
        this.f24736H = i11;
        this.f24760Q0 = str3;
        m19645S1();
        m19676w1();
        requestLayout();
        invalidate();
    }

    @Override // p324sf.InterfaceC8574m
    /* renamed from: K */
    public void mo16817K(VodInfoCallback vodInfoCallback) {
        List<String> m15490a = vodInfoCallback.m15095a().m15490a();
        if (m15490a == null || m15490a.size() <= 0) {
            return;
        }
        try {
            C8617g.m37004u(this.f24759Q.getApplicationContext()).m37029q(m15490a.get(new Random().nextInt(m15490a.size()))).m36988K().m36993l(new C4026k(this));
        } catch (Exception e10) {
        }
    }

    /* renamed from: K1 */
    public void m19637K1(Uri uri, boolean z10, String str, long j10, int i10, String str2, ArrayList<LiveStreamsDBModel> arrayList, int i11, int i12, String str3) {
        m19636J1(uri, null, z10, str, j10, i10, str2, arrayList, i11, i12, str3);
    }

    /* renamed from: L1 */
    public void m19638L1(int i10) {
        if (!this.f24718B) {
            this.f24819q0.m19684b(2131427532).m19690h();
            this.f24819q0.m19684b(2131427785).m19690h();
            this.f24819q0.m19684b(2131428499).m19690h();
            m19639M1(true);
            this.f24718B = true;
        }
        m19651Y1();
        this.f24835v1.sendEmptyMessage(1);
        this.f24835v1.removeMessages(2);
        if (i10 != 0) {
            this.f24835v1.sendMessageDelayed(this.f24730F.obtainMessage(2), i10);
        }
    }

    /* renamed from: M1 */
    public void m19639M1(boolean z10) {
        this.f24819q0.m19684b(2131427490).m19689g(z10 ? 0 : 8);
        this.f24819q0.m19684b(2131427494).m19689g(z10 ? 0 : 8);
        this.f24819q0.m19684b(2131427515).m19689g(z10 ? 0 : 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0266  */
    @android.annotation.SuppressLint({"StringFormatInvalid"})
    /* renamed from: N1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m19640N1() {
        /*
            Method dump skipped, instructions count: 815
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD.m19640N1():void");
    }

    /* renamed from: O1 */
    public final void m19641O1(String str) {
        this.f24819q0.m19684b(2131429674).m19683a();
        this.f24819q0.m19684b(2131427519).m19690h();
        this.f24819q0.m19684b(2131427523).m19688f(str);
    }

    @SuppressLint({"SetTextI18n", "ResourceType"})
    /* renamed from: P1 */
    public void m19642P1(RadioGroup radioGroup, RadioGroup radioGroup2, RadioGroup radioGroup3, PopupWindow popupWindow, TextView textView, TextView textView2, TextView textView3) {
        IMediaPlayer iMediaPlayer = this.f24797j;
        if (iMediaPlayer == null) {
            return;
        }
        Boolean bool = Boolean.FALSE;
        this.f24843y0 = bool;
        this.f24840x0 = bool;
        this.f24837w0 = bool;
        this.f24831u0 = bool;
        this.f24828t0 = bool;
        this.f24834v0 = bool;
        int m33683d = C7709e.m33683d(iMediaPlayer, 1);
        int m33683d2 = C7709e.m33683d(this.f24797j, 2);
        int m33683d3 = C7709e.m33683d(this.f24797j, 3);
        ITrackInfo[] trackInfo = this.f24797j.getTrackInfo();
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
                        this.f24837w0 = bool2;
                        if (!this.f24828t0.booleanValue()) {
                            this.f24828t0 = bool2;
                            RadioButton radioButton = new RadioButton(this.f24795i0);
                            radioButton.setText("Disable");
                            radioButton.setTextColor(getResources().getColor(2131099723));
                            radioButton.setTextSize(18.0f);
                            radioButton.setId(11111111);
                            radioButton.setPadding(10, 10, 15, 10);
                            radioButton.setOnFocusChangeListener(new ViewOnFocusChangeListenerC4014a0(this, radioButton));
                            if (m33683d == -1) {
                                radioButton.setChecked(true);
                                radioGroup.setOnCheckedChangeListener(null);
                            }
                            radioButton.setTag("2");
                            radioGroup.addView(radioButton);
                        }
                        RadioButton radioButton2 = new RadioButton(this.f24795i0);
                        iTrackInfo.getInfoInline();
                        radioButton2.setText(i10 + ", " + iTrackInfo.getInfoInline());
                        if (i10 == -1) {
                            radioButton2.setId(111);
                        } else {
                            radioButton2.setId(i10);
                        }
                        radioButton2.setTextColor(getResources().getColor(2131099723));
                        radioButton2.setTextSize(18.0f);
                        radioButton2.setPadding(10, 10, 15, 10);
                        radioButton2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC4014a0(this, radioButton2));
                        if (i10 == m33683d) {
                            radioButton2.setChecked(true);
                            radioGroup.setOnCheckedChangeListener(null);
                        }
                        radioButton2.setTag("2");
                        radioGroup.addView(radioButton2);
                        radioGroup.setOnCheckedChangeListener(new C4029n(this, m33683d, popupWindow));
                    } else if (trackType == 2) {
                        Boolean bool3 = Boolean.TRUE;
                        this.f24840x0 = bool3;
                        if (!this.f24831u0.booleanValue()) {
                            this.f24831u0 = bool3;
                            RadioButton radioButton3 = new RadioButton(this.f24795i0);
                            radioButton3.setText("Disable");
                            radioButton3.setTextColor(getResources().getColor(2131099723));
                            radioButton3.setTextSize(18.0f);
                            radioButton3.setId(1111111);
                            radioButton3.setPadding(10, 10, 15, 10);
                            radioButton3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC4014a0(this, radioButton3));
                            if (m33683d2 == -1) {
                                radioButton3.setChecked(true);
                                radioGroup2.setOnCheckedChangeListener(null);
                            }
                            radioButton3.setTag("2");
                            radioGroup2.addView(radioButton3);
                        }
                        RadioButton radioButton4 = new RadioButton(this.f24795i0);
                        radioButton4.setText(i10 + ", " + iTrackInfo.getInfoInline() + ", " + m19654b1(iTrackInfo.getLanguage()));
                        radioButton4.setTextColor(getResources().getColor(2131099723));
                        radioButton4.setTextSize(18.0f);
                        if (i10 == -1) {
                            radioButton4.setId(1111);
                        } else {
                            radioButton4.setId(i10);
                        }
                        radioButton4.setPadding(10, 10, 15, 10);
                        radioButton4.setOnFocusChangeListener(new ViewOnFocusChangeListenerC4014a0(this, radioButton4));
                        if (i10 == m33683d2) {
                            radioButton4.setChecked(true);
                            radioGroup2.setOnCheckedChangeListener(null);
                        }
                        radioButton4.setTag("2");
                        radioGroup2.addView(radioButton4);
                        radioGroup2.setOnCheckedChangeListener(new C4030o(this, m33683d2, popupWindow));
                    } else if (trackType == 3) {
                        Boolean bool4 = Boolean.TRUE;
                        this.f24843y0 = bool4;
                        if (!this.f24834v0.booleanValue()) {
                            this.f24834v0 = bool4;
                            RadioButton radioButton5 = new RadioButton(this.f24795i0);
                            radioButton5.setText("Disable");
                            radioButton5.setTextColor(getResources().getColor(2131099723));
                            radioButton5.setTextSize(18.0f);
                            radioButton5.setId(111111);
                            radioButton5.setPadding(10, 10, 15, 10);
                            radioButton5.setOnFocusChangeListener(new ViewOnFocusChangeListenerC4014a0(this, radioButton5));
                            if (m33683d3 == -1) {
                                radioButton5.setChecked(true);
                                radioGroup3.setOnCheckedChangeListener(null);
                            }
                            radioButton5.setTag("2");
                            radioGroup3.addView(radioButton5);
                        }
                        RadioButton radioButton6 = new RadioButton(this.f24795i0);
                        radioButton6.setText(i10 + ", " + iTrackInfo.getInfoInline());
                        radioButton6.setTextColor(getResources().getColor(2131099723));
                        radioButton6.setTextSize(18.0f);
                        if (i10 == -1) {
                            radioButton6.setId(11111);
                        } else {
                            radioButton6.setId(i10);
                        }
                        radioButton6.setPadding(10, 10, 15, 10);
                        radioButton6.setOnFocusChangeListener(new ViewOnFocusChangeListenerC4014a0(this, radioButton6));
                        if (i10 == m33683d3) {
                            radioButton6.setChecked(true);
                            radioGroup3.setOnCheckedChangeListener(null);
                        }
                        radioButton6.setTag("2");
                        radioGroup3.addView(radioButton6);
                        radioGroup3.setOnCheckedChangeListener(new C4031p(this, m33683d3, popupWindow));
                    }
                }
            }
            if (this.f24837w0.booleanValue()) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
            if (this.f24840x0.booleanValue()) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
            if (this.f24843y0.booleanValue()) {
                textView3.setVisibility(8);
                return;
            }
        }
        textView3.setVisibility(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x01da, code lost:
    
        if (r0 == (-1)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0203, code lost:
    
        m19629C1(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01ec, code lost:
    
        m19660g1(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01e9, code lost:
    
        if (r0 != (-1)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01fd, code lost:
    
        if (r0 == (-1)) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x027d  */
    /* renamed from: Q1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m19643Q1(int r6) {
        /*
            Method dump skipped, instructions count: 797
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD.m19643Q1(int):void");
    }

    /* renamed from: R1 */
    public void m19644R1() {
        ServiceC6971a.m31982d(null);
    }

    /* renamed from: S1 */
    public void m19645S1() {
        IMediaPlayer iMediaPlayer = this.f24797j;
        if (iMediaPlayer != null) {
            iMediaPlayer.stop();
            this.f24797j.release();
            this.f24797j = null;
            this.f24788g = 0;
            this.f24791h = 0;
            ((AudioManager) this.f24759Q.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    /* renamed from: T1 */
    public final int m19646T1(int i10, int i11) {
        return this.f24737H0.m15303D0(String.valueOf(i10), i11);
    }

    /* renamed from: U1 */
    public final String m19647U1(int i10) {
        int i11 = i10 / 1000;
        int i12 = i11 % 60;
        int i13 = (i11 / 60) % 60;
        int i14 = i11 / 3600;
        this.f24725D0.setLength(0);
        return (i14 > 0 ? this.f24728E0.format("%d:%02d:%02d", Integer.valueOf(i14), Integer.valueOf(i13), Integer.valueOf(i12)) : this.f24728E0.format("%02d:%02d", Integer.valueOf(i13), Integer.valueOf(i12))).toString();
    }

    @Override // p324sf.InterfaceC8574m
    /* renamed from: V */
    public void mo16825V(String str) {
    }

    /* renamed from: V1 */
    public int m19648V1() {
        String str;
        Resources resources;
        int i10;
        this.f24735G1++;
        SharedPreferences sharedPreferences = this.f24795i0.getSharedPreferences("loginPrefs", 0);
        this.f24751M = sharedPreferences;
        this.f24753N = sharedPreferences.edit();
        int i11 = this.f24735G1;
        int[] iArr = f24714M1;
        int length = i11 % iArr.length;
        this.f24735G1 = length;
        this.f24738H1 = iArr[length];
        if (this.f24763S != null) {
            LinearLayout linearLayout = (LinearLayout) this.f24795i0.findViewById(2131428325);
            TextView textView = (TextView) this.f24795i0.findViewById(2131427466);
            this.f24763S.setAspectRatio(this.f24738H1);
            int i12 = this.f24735G1;
            if (i12 == 0) {
                resources = getResources();
                i10 = 2132017799;
            } else if (i12 == 1) {
                resources = getResources();
                i10 = 2132017798;
            } else if (i12 == 2) {
                resources = getResources();
                i10 = 2132018823;
            } else if (i12 == 3) {
                resources = getResources();
                i10 = 2132018003;
            } else {
                if (i12 == 4) {
                    str = "16:9";
                } else {
                    if (i12 == 5) {
                        str = "4:3";
                    }
                    this.f24753N.putInt("aspect_ratio", this.f24735G1);
                    this.f24753N.apply();
                    linearLayout.setVisibility(0);
                    this.f24733G.removeCallbacksAndMessages(null);
                    this.f24733G.postDelayed(new RunnableC4028m(this, linearLayout), 3000L);
                }
                textView.setText(str);
                this.f24753N.putInt("aspect_ratio", this.f24735G1);
                this.f24753N.apply();
                linearLayout.setVisibility(0);
                this.f24733G.removeCallbacksAndMessages(null);
                this.f24733G.postDelayed(new RunnableC4028m(this, linearLayout), 3000L);
            }
            str = resources.getString(i10);
            textView.setText(str);
            this.f24753N.putInt("aspect_ratio", this.f24735G1);
            this.f24753N.apply();
            linearLayout.setVisibility(0);
            this.f24733G.removeCallbacksAndMessages(null);
            this.f24733G.postDelayed(new RunnableC4028m(this, linearLayout), 3000L);
        }
        return this.f24738H1;
    }

    /* renamed from: W1 */
    public final void m19649W1() {
        if (this.f24815p.m33652a()) {
            this.f24815p.m33655d();
        } else {
            this.f24815p.show();
        }
    }

    /* renamed from: X1 */
    public final void m19650X1() {
        View findViewById = this.f24795i0.findViewById(2131427469);
        this.f24816p0 = findViewById;
        findViewById.setClickable(true);
        this.f24816p0.setOnTouchListener(new ViewOnTouchListenerC4035t(this));
    }

    /* renamed from: Y1 */
    public final void m19651Y1() {
        C4018c0 m19684b;
        IMediaPlayer iMediaPlayer = this.f24797j;
        if (iMediaPlayer == null || !iMediaPlayer.isPlaying()) {
            this.f24819q0.m19684b(C10105q.f46301B).m19683a();
            m19684b = this.f24819q0.m19684b(C10105q.f46302C);
        } else {
            this.f24819q0.m19684b(C10105q.f46302C).m19683a();
            m19684b = this.f24819q0.m19684b(C10105q.f46301B);
        }
        m19684b.m19690h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [android.view.View] */
    /* renamed from: Z0 */
    public final void m19652Z0() {
        InterfaceC7706b interfaceC7706b;
        if (this.f24797j == null || (interfaceC7706b = this.f24815p) == null) {
            return;
        }
        interfaceC7706b.m33654c(this);
        this.f24815p.m33653b(getParent() instanceof View ? (View) getParent() : this);
        this.f24815p.setEnabled(m19673t1());
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: a */
    public void mo15996a() {
    }

    /* renamed from: a1 */
    public final void m19653a1(IMediaPlayer iMediaPlayer, InterfaceC4042a.b bVar) {
        if (iMediaPlayer == null) {
            return;
        }
        if (bVar == null) {
            iMediaPlayer.setDisplay(null);
        } else {
            bVar.mo19700b(iMediaPlayer);
        }
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: b */
    public void mo15997b() {
    }

    /* renamed from: b1 */
    public final String m19654b1(String str) {
        String str2 = str;
        if (TextUtils.isEmpty(str)) {
            str2 = "und";
        }
        return str2;
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: c */
    public void mo15998c(String str) {
    }

    /* renamed from: c1 */
    public final String m19655c1(int i10, int i11, int i12, int i13) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10);
        sb2.append(" x ");
        sb2.append(i11);
        if (i12 > 1 || i13 > 1) {
            sb2.append("[");
            sb2.append(i12);
            sb2.append(":");
            sb2.append(i13);
            sb2.append("]");
        }
        return sb2.toString();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return this.f24836w;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.f24839x;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.f24842y;
    }

    @SuppressLint({"ResourceType", "InflateParams"})
    /* renamed from: d */
    public void m19656d(Context context, String str) {
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(2131624111, (ViewGroup) null);
        PopupWindow popupWindow = new PopupWindow(context);
        this.f24826s1 = popupWindow;
        popupWindow.setContentView(inflate);
        this.f24826s1.setWidth(-1);
        this.f24826s1.setHeight(-1);
        this.f24826s1.setFocusable(true);
        this.f24826s1.setOutsideTouchable(false);
        ((TextView) inflate.findViewById(2131429452)).setText(str);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(2131428371);
        linearLayout.requestFocus();
        this.f24814o1 = (FabButton) inflate.findViewById(2131427849);
        this.f24829t1 = (Button) inflate.findViewById(2131427693);
        this.f24811n1 = (RelativeLayout) inflate.findViewById(2131429020);
        this.f24823r1 = new Handler();
        this.f24814o1.m30206e(false);
        this.f24817p1 = 0;
        this.f24814o1.m30205d(true);
        this.f24814o1.setProgress(this.f24817p1);
        getRunnable();
        this.f24826s1.setOnDismissListener(new C4041z(this));
        this.f24829t1.setOnClickListener(new ViewOnClickListenerC4013a(this));
        this.f24814o1.setOnClickListener(new ViewOnClickListenerC4015b(this));
        linearLayout.setOnClickListener(new ViewOnClickListenerC4017c(this));
        this.f24826s1.showAtLocation(inflate, 1, 0, 0);
    }

    /* renamed from: d1 */
    public final String m19657d1(long j10) {
        long j11 = j10 / 1000;
        long j12 = j11 / 3600;
        long j13 = (j11 % 3600) / 60;
        long j14 = j11 % 60;
        return j10 <= 0 ? "--:--" : j12 >= 100 ? String.format(Locale.US, "%d:%02d:%02d", Long.valueOf(j12), Long.valueOf(j13), Long.valueOf(j14)) : j12 > 0 ? String.format(Locale.US, "%02d:%02d:%02d", Long.valueOf(j12), Long.valueOf(j13), Long.valueOf(j14)) : String.format(Locale.US, "%02d:%02d", Long.valueOf(j13), Long.valueOf(j14));
    }

    /* renamed from: e1 */
    public final String m19658e1(int i10) {
        return getContext().getString(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? 2132017191 : 2132017188 : 2132017189 : 2132017190 : 2132017187 : 2132017192);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e2  */
    /* renamed from: f1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tv.danmaku.ijk.media.player.IMediaPlayer m19659f1(int r7) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD.m19659f1(int):tv.danmaku.ijk.media.player.IMediaPlayer");
    }

    /* renamed from: g1 */
    public void m19660g1(int i10) {
        C7709e.m33681b(this.f24797j, i10);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f24797j != null) {
            return this.f24824s;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (m19673t1()) {
            return (int) this.f24797j.getCurrentPosition();
        }
        return 0;
    }

    public int getCurrentPositionSeekbar() {
        return this.f24782d1;
    }

    public int getCurrentWindowIndex() {
        return this.f24736H;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (m19673t1()) {
            return (int) this.f24797j.getDuration();
        }
        return -1;
    }

    public Boolean getFullScreenValue() {
        return Boolean.valueOf(this.f24739I);
    }

    public boolean getProgress() {
        return this.f24787f1;
    }

    public ITrackInfo[] getTrackInfo() {
        IMediaPlayer iMediaPlayer = this.f24797j;
        if (iMediaPlayer == null) {
            return null;
        }
        return iMediaPlayer.getTrackInfo();
    }

    /* renamed from: h1 */
    public final void m19661h1() {
        this.f24845z = -1;
        this.f24807m0 = -1.0f;
        if (this.f24715A >= 0) {
            this.f24835v1.removeMessages(3);
            this.f24835v1.sendEmptyMessage(3);
        }
        this.f24835v1.removeMessages(4);
        this.f24835v1.sendEmptyMessageDelayed(4, 500L);
    }

    /* renamed from: i1 */
    public void m19662i1() {
        ServiceC6971a.m31982d(this.f24797j);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        IMediaPlayer iMediaPlayer;
        return m19673t1() && (iMediaPlayer = this.f24797j) != null && iMediaPlayer.isPlaying();
    }

    /* renamed from: j1 */
    public void m19663j1(Boolean bool) {
        this.f24739I = bool.booleanValue();
    }

    /* renamed from: k1 */
    public void m19664k1(boolean z10) {
        if (z10 || this.f24718B) {
            this.f24835v1.removeMessages(1);
            m19639M1(false);
            this.f24819q0.m19684b(2131427532).m19683a();
            this.f24819q0.m19684b(2131427785).m19683a();
            this.f24819q0.m19684b(2131427506).m19686d();
            this.f24819q0.m19684b(2131428499).m19683a();
            this.f24718B = false;
            m19668o1();
        }
    }

    /* renamed from: l1 */
    public final void m19665l1() {
        this.f24819q0.m19684b(2131427507).m19683a();
        this.f24819q0.m19684b(2131427519).m19683a();
        m19639M1(false);
        m19668o1();
    }

    /* renamed from: m1 */
    public final void m19666m1() {
        Runnable runnable;
        Handler handler = this.f24823r1;
        if (handler != null && (runnable = this.f24820q1) != null) {
            handler.removeCallbacks(runnable);
        }
        PopupWindow popupWindow = this.f24826s1;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        m19638L1(this.f24727E);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: n1 */
    public void m19667n1() {
        this.f24798j0.setSystemUiVisibility(4871);
    }

    /* renamed from: o1 */
    public void m19668o1() {
        this.f24819q0.m19684b(2131427532).m19683a();
        this.f24819q0.m19684b(2131427785).m19683a();
        this.f24819q0.m19684b(2131428499).m19683a();
        this.f24718B = false;
        this.f24730F.removeCallbacksAndMessages(null);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10 = (i10 == 4 || i10 == 24 || i10 == 25 || i10 == 164 || i10 == 82 || i10 == 5 || i10 == 6) ? false : true;
        if (m19673t1() && z10 && this.f24815p != null) {
            if (i10 == 79 || i10 == 85) {
                IMediaPlayer iMediaPlayer = this.f24797j;
                if (iMediaPlayer == null || !iMediaPlayer.isPlaying()) {
                    start();
                    this.f24815p.m33655d();
                    return true;
                }
                pause();
                this.f24815p.show();
                return true;
            }
            if (i10 == 126) {
                IMediaPlayer iMediaPlayer2 = this.f24797j;
                if (iMediaPlayer2 == null || iMediaPlayer2.isPlaying()) {
                    return true;
                }
                start();
                this.f24815p.m33655d();
                return true;
            }
            if (i10 == 86 || i10 == 127) {
                IMediaPlayer iMediaPlayer3 = this.f24797j;
                if (iMediaPlayer3 == null || !iMediaPlayer3.isPlaying()) {
                    return true;
                }
                pause();
                this.f24815p.show();
                return true;
            }
            m19649W1();
        }
        return super.onKeyDown(i10, keyEvent);
    }

    /* renamed from: p1 */
    public final void m19669p1() {
        boolean m31278p = this.f24761R.m31278p();
        this.f24750L1 = m31278p;
        if (m31278p) {
            ServiceC6971a.m31980b(getContext());
            this.f24797j = ServiceC6971a.m31979a();
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        IMediaPlayer iMediaPlayer;
        if (m19673t1() && (iMediaPlayer = this.f24797j) != null && iMediaPlayer.isPlaying()) {
            this.f24797j.pause();
            this.f24788g = 4;
        }
        this.f24791h = 4;
    }

    /* renamed from: q1 */
    public final void m19670q1() {
        this.f24741I1.clear();
        if (this.f24761R.m31281s()) {
            this.f24741I1.add(1);
        }
        if (this.f24761R.m31282t()) {
            this.f24741I1.add(2);
        }
        if (this.f24761R.m31280r()) {
            this.f24741I1.add(0);
        }
        if (this.f24741I1.isEmpty()) {
            this.f24741I1.add(1);
        }
        int intValue = this.f24741I1.get(this.f24744J1).intValue();
        this.f24747K1 = intValue;
        setRender(intValue);
    }

    /* renamed from: r1 */
    public final void m19671r1(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f24759Q = applicationContext;
        this.f24761R = new C6783a(applicationContext);
        this.f24808m1 = new C5378j(this, this.f24759Q);
        m19669p1();
        m19670q1();
        this.f24800k = 0;
        this.f24803l = 0;
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f24788g = 0;
        this.f24791h = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences("pref.using_sub_font_size", 0);
        this.f24805l1 = sharedPreferences;
        String string = sharedPreferences.getString("pref.using_sub_font_size", C5251a.f30039f0);
        TextView textView = new TextView(context);
        this.f24792h0 = textView;
        try {
            textView.setTextSize(2, Float.parseFloat(string));
        } catch (Exception e10) {
        }
        this.f24792h0.setTextColor(context.getResources().getColor(2131100158));
        this.f24792h0.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        layoutParams.setMargins(0, 0, 0, 40);
        addView(this.f24792h0, layoutParams);
    }

    /* renamed from: s1 */
    public boolean m19672s1() {
        return this.f24750L1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i10) {
        int i11 = i10;
        if (m19673t1()) {
            this.f24786f0 = System.currentTimeMillis();
            this.f24797j.seekTo(i10);
            i11 = 0;
        }
        this.f24833v = i11;
    }

    public void setCurrentPositionSeekbar(int i10) {
        this.f24782d1 = i10;
    }

    public void setCurrentWindowIndex(int i10) {
        this.f24736H = i10;
    }

    public void setHudView(TableLayout tableLayout) {
    }

    public void setListData(String str) {
        m19656d(this.f24795i0, str);
    }

    public void setMediaController(InterfaceC7706b interfaceC7706b) {
        InterfaceC7706b interfaceC7706b2 = this.f24815p;
        if (interfaceC7706b2 != null) {
            interfaceC7706b2.m33655d();
        }
        this.f24815p = interfaceC7706b;
        m19652Z0();
    }

    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        this.f24818q = onCompletionListener;
    }

    public void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        this.f24827t = onErrorListener;
    }

    public void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        this.f24830u = onInfoListener;
    }

    public void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        this.f24821r = onPreparedListener;
    }

    public void setProgress(boolean z10) {
        this.f24787f1 = z10;
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
                Log.e(this.f24777b, String.format(Locale.getDefault(), "invalid render %d\n", Integer.valueOf(i10)));
                return;
            }
            C4044c c4044c = new C4044c(getContext());
            c4043b = c4044c;
            if (this.f24797j != null) {
                c4044c.getSurfaceHolder().mo19700b(this.f24797j);
                c4044c.mo19696c(this.f24797j.getVideoWidth(), this.f24797j.getVideoHeight());
                c4044c.mo19694a(this.f24797j.getVideoSarNum(), this.f24797j.getVideoSarDen());
                c4044c.setAspectRatio(this.f24738H1);
                c4043b = c4044c;
            }
        }
        setRenderView(c4043b);
    }

    public void setRenderView(InterfaceC4042a interfaceC4042a) {
        int i10;
        int i11;
        if (this.f24763S != null) {
            IMediaPlayer iMediaPlayer = this.f24797j;
            if (iMediaPlayer != null) {
                iMediaPlayer.setDisplay(null);
            }
            View view = this.f24763S.getView();
            this.f24763S.mo19695b(this.f24732F1);
            this.f24763S = null;
            removeView(view);
        }
        if (interfaceC4042a == null) {
            return;
        }
        this.f24763S = interfaceC4042a;
        SharedPreferences sharedPreferences = this.f24759Q.getSharedPreferences("loginPrefs", 0);
        this.f24751M = sharedPreferences;
        int i12 = sharedPreferences.getInt("aspect_ratio", 4);
        this.f24735G1 = i12;
        interfaceC4042a.setAspectRatio(i12);
        int i13 = this.f24800k;
        if (i13 > 0 && (i11 = this.f24803l) > 0) {
            interfaceC4042a.mo19696c(i13, i11);
        }
        int i14 = this.f24765T;
        if (i14 > 0 && (i10 = this.f24767U) > 0) {
            interfaceC4042a.mo19694a(i14, i10);
        }
        View view2 = this.f24763S.getView();
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        addView(view2);
        this.f24763S.mo19698e(this.f24732F1);
        this.f24763S.setVideoRotation(this.f24812o);
    }

    public void setTitle(CharSequence charSequence) {
        this.f24819q0.m19684b(2131427528).m19688f(charSequence);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (m19673t1()) {
            this.f24797j.start();
            this.f24788g = 3;
        }
        this.f24791h = 3;
    }

    /* renamed from: t1 */
    public final boolean m19673t1() {
        int i10;
        boolean z10 = true;
        if (this.f24797j == null || (i10 = this.f24788g) == -1 || i10 == 0 || i10 == 1) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: u1 */
    public final void m19674u1(float f10) {
        Activity activity = this.f24795i0;
        if (activity != null) {
            if (this.f24807m0 < 0.0f) {
                float f11 = activity.getWindow().getAttributes().screenBrightness;
                this.f24807m0 = f11;
                if (f11 <= 0.0f) {
                    this.f24807m0 = 0.5f;
                } else if (f11 < 0.01f) {
                    this.f24807m0 = 0.01f;
                }
            }
            Log.d(getClass().getSimpleName(), "brightness:" + this.f24807m0 + ",percent:" + f10);
            this.f24819q0.m19684b(2131427540).m19683a();
            this.f24819q0.m19684b(2131427478).m19690h();
            WindowManager.LayoutParams attributes = this.f24795i0.getWindow().getAttributes();
            float f12 = this.f24807m0 + f10;
            attributes.screenBrightness = f12;
            if (f12 > 1.0f) {
                attributes.screenBrightness = 1.0f;
            } else if (f12 < 0.01f) {
                attributes.screenBrightness = 0.01f;
            }
            this.f24819q0.m19684b(2131427474).m19688f(((int) (attributes.screenBrightness * 100.0f)) + "%");
            this.f24795i0.getWindow().setAttributes(attributes);
        }
    }

    /* renamed from: v1 */
    public final void m19675v1(float f10) {
        try {
            AudioManager audioManager = this.f24801k0;
            if (audioManager != null) {
                if (this.f24845z == -1) {
                    int streamVolume = audioManager.getStreamVolume(3);
                    this.f24845z = streamVolume;
                    if (streamVolume < 0) {
                        this.f24845z = 0;
                    }
                }
                m19664k1(true);
                int i10 = this.f24804l0;
                int i11 = ((int) (f10 * i10)) + this.f24845z;
                if (i11 <= i10) {
                    i10 = i11 < 0 ? 0 : i11;
                }
                this.f24801k0.setStreamVolume(3, i10, 0);
                int i12 = (int) (((i10 * 1.0d) / this.f24804l0) * 100.0d);
                String str = i12 + "%";
                if (i12 == 0) {
                    str = "off";
                }
                this.f24819q0.m19684b(2131427544).m19685c(i12 == 0 ? 2131231438 : 2131231439);
                this.f24819q0.m19684b(2131427478).m19683a();
                this.f24819q0.m19684b(2131427540).m19690h();
                this.f24819q0.m19684b(2131427536).m19688f(str).m19690h();
            }
        } catch (Exception e10) {
        }
    }

    @TargetApi(23)
    /* renamed from: w1 */
    public void m19676w1() {
        IMediaPlayer.OnErrorListener onErrorListener;
        IMediaPlayer iMediaPlayer;
        if (this.f24779c == null || this.f24794i == null) {
            return;
        }
        m19678y1(false);
        try {
            ((AudioManager) this.f24759Q.getSystemService("audio")).requestAudioFocus(null, 3, 1);
        } catch (Exception e10) {
        }
        try {
            try {
                try {
                    try {
                        this.f24797j = m19659f1(this.f24761R.m31285w());
                        getContext();
                        this.f24797j.setOnPreparedListener(this.f24841x1);
                        this.f24797j.setOnVideoSizeChangedListener(this.f24838w1);
                        this.f24797j.setOnCompletionListener(this.f24844y1);
                        this.f24797j.setOnErrorListener(this.f24720B1);
                        this.f24797j.setOnInfoListener(this.f24717A1);
                        this.f24797j.setOnBufferingUpdateListener(this.f24723C1);
                        this.f24797j.setOnSeekCompleteListener(this.f24726D1);
                        this.f24797j.setOnTimedTextListener(this.f24729E1);
                        this.f24824s = 0;
                        String scheme = this.f24779c.getScheme();
                        if (Build.VERSION.SDK_INT >= 23 && this.f24761R.m31246E() && (TextUtils.isEmpty(scheme) || scheme.equalsIgnoreCase(TransferTable.COLUMN_FILE))) {
                            this.f24797j.setDataSource(new C7705a(new File(this.f24779c.toString())));
                        } else {
                            this.f24797j.setDataSource(this.f24759Q, this.f24779c, this.f24783e);
                        }
                        m19653a1(this.f24797j, this.f24794i);
                        this.f24797j.setAudioStreamType(3);
                        this.f24797j.setScreenOnWhilePlaying(true);
                        this.f24769V = System.currentTimeMillis();
                        this.f24797j.prepareAsync();
                        this.f24813o0 = this.f24795i0.getResources().getDisplayMetrics().widthPixels;
                        AudioManager audioManager = (AudioManager) this.f24795i0.getSystemService("audio");
                        this.f24801k0 = audioManager;
                        this.f24804l0 = audioManager.getStreamMaxVolume(3);
                        this.f24810n0 = new GestureDetector(this.f24795i0, new C4016b0(this));
                        m19650X1();
                        SeekBar seekBar = this.f24846z0;
                        if (seekBar != null) {
                            seekBar.setOnSeekBarChangeListener(this.f24832u1);
                            this.f24846z0.setMax(1000);
                        }
                        this.f24725D0 = new StringBuilder();
                        this.f24728E0 = new Formatter(this.f24725D0, Locale.getDefault());
                        this.f24788g = 1;
                    } catch (IOException e11) {
                        Log.w(this.f24777b, "Unable to open content: " + this.f24779c, e11);
                        this.f24788g = -1;
                        this.f24791h = -1;
                        onErrorListener = this.f24720B1;
                        iMediaPlayer = this.f24797j;
                        onErrorListener.onError(iMediaPlayer, 1, 0);
                    }
                } catch (Exception e12) {
                    Log.w(this.f24777b, "Unable to open content: " + this.f24779c, e12);
                    this.f24788g = -1;
                    this.f24791h = -1;
                    onErrorListener = this.f24720B1;
                    iMediaPlayer = this.f24797j;
                    onErrorListener.onError(iMediaPlayer, 1, 0);
                }
            } catch (NullPointerException e13) {
                Log.w(this.f24777b, "Unable to open content: " + this.f24779c, e13);
                this.f24788g = -1;
                this.f24791h = -1;
                onErrorListener = this.f24720B1;
                iMediaPlayer = this.f24797j;
                onErrorListener.onError(iMediaPlayer, 1, 0);
            }
        } catch (IllegalArgumentException e14) {
            Log.w(this.f24777b, "Unable to open content: " + this.f24779c, e14);
            this.f24788g = -1;
            this.f24791h = -1;
            onErrorListener = this.f24720B1;
            iMediaPlayer = this.f24797j;
            onErrorListener.onError(iMediaPlayer, 1, 0);
        }
    }

    /* renamed from: x1 */
    public final void m19677x1() {
        m19666m1();
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.f24795i0.findViewById(C10105q.f46345x);
        if (appCompatImageView != null) {
            appCompatImageView.performClick();
        }
    }

    /* renamed from: y1 */
    public void m19678y1(boolean z10) {
        IMediaPlayer iMediaPlayer = this.f24797j;
        if (iMediaPlayer != null) {
            iMediaPlayer.reset();
            this.f24797j.release();
            this.f24797j = null;
            this.f24788g = 0;
            if (z10) {
                this.f24791h = 0;
            }
            ((AudioManager) this.f24759Q.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    /* renamed from: z1 */
    public void m19679z1() {
        IMediaPlayer iMediaPlayer = this.f24797j;
        if (iMediaPlayer != null) {
            iMediaPlayer.setDisplay(null);
        }
    }
}

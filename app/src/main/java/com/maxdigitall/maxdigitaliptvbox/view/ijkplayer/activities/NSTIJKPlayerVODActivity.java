package com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0243b;
import androidx.appcompat.app.DialogC0242a;
import androidx.appcompat.widget.AppCompatImageView;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import com.maxdigitall.maxdigitaliptvbox.model.EpisodesUsingSinglton;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.PlayerSelectedSinglton;
import com.maxdigitall.maxdigitaliptvbox.model.VodAllCategoriesSingleton;
import com.maxdigitall.maxdigitaliptvbox.model.callback.GetEpisdoeDetailsCallback;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.RecentWatchDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SeriesRecentWatchDatabase;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.activity.YouTubePlayerActivity;
import com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.C4043b;
import com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD;
import com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.preference.IjkListPreference;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nf.C6783a;
import org.apache.http.HttpHost;
import org.apache.http.client.config.CookieSpecs;
import org.joda.time.DateTimeConstants;
import p059d9.C4401z0;
import p151if.C5251a;
import p151if.C5255e;
import p189kf.C5602m;
import p216m9.C5974n;
import p290qf.C7920a;
import p309rf.C8470a;
import p331t5.C8632a;
import p440z8.C10105q;
import pf.C7705a;
import pf.C7707c;
import pf.C7708d;
import pf.C7709e;
import pf.C7711g;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerVODActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerVODActivity.class */
public class NSTIJKPlayerVODActivity extends ActivityC0243b implements View.OnClickListener {

    /* renamed from: k1 */
    public static String f23348k1;

    /* renamed from: l1 */
    public static boolean f23349l1 = true;

    /* renamed from: m1 */
    public static boolean f23350m1 = true;

    /* renamed from: n1 */
    public static String f23351n1;

    /* renamed from: A */
    public DateFormat f23352A;

    /* renamed from: B */
    public LiveStreamDBHandler f23354B;

    /* renamed from: B0 */
    public LinearLayout f23355B0;

    /* renamed from: C */
    public ArrayList<File> f23356C;

    /* renamed from: C0 */
    public TextView f23357C0;

    /* renamed from: D0 */
    public SharedPreferences f23359D0;

    /* renamed from: E */
    public SharedPreferences f23360E;

    /* renamed from: E0 */
    public SharedPreferences.Editor f23361E0;

    /* renamed from: F */
    public SharedPreferences f23362F;

    /* renamed from: G */
    public SharedPreferences f23364G;

    /* renamed from: G0 */
    public String f23365G0;

    /* renamed from: H */
    public SharedPreferences f23366H;

    /* renamed from: H0 */
    public String f23367H0;

    /* renamed from: I */
    public SharedPreferences f23368I;

    /* renamed from: I0 */
    public RecentWatchDBHandler f23369I0;

    /* renamed from: J */
    public SharedPreferences f23370J;

    /* renamed from: J0 */
    public String f23371J0;

    /* renamed from: K */
    public SharedPreferences f23372K;

    /* renamed from: K0 */
    public ImageView f23373K0;

    /* renamed from: L */
    public SharedPreferences f23374L;

    /* renamed from: L0 */
    public TextView f23375L0;

    /* renamed from: M */
    public SharedPreferences f23376M;

    /* renamed from: M0 */
    public Button f23377M0;

    /* renamed from: N */
    public String f23378N;

    /* renamed from: N0 */
    public Button f23379N0;

    /* renamed from: O */
    public AppCompatImageView f23380O;

    /* renamed from: O0 */
    public DialogC0242a f23381O0;

    /* renamed from: P */
    public AppCompatImageView f23382P;

    /* renamed from: Q */
    public ArrayList<LiveStreamsDBModel> f23384Q;

    /* renamed from: Q0 */
    public NSTIJKPlayerVOD f23385Q0;

    /* renamed from: R */
    public ArrayList<LiveStreamsDBModel> f23386R;

    /* renamed from: R0 */
    public SharedPreferences f23387R0;

    /* renamed from: S0 */
    public Button f23389S0;

    /* renamed from: T0 */
    public Spinner f23391T0;

    /* renamed from: U */
    public RelativeLayout f23392U;

    /* renamed from: U0 */
    public SharedPreferences f23393U0;

    /* renamed from: V */
    public int f23394V;

    /* renamed from: V0 */
    public SharedPreferences.Editor f23395V0;

    /* renamed from: W */
    public SharedPreferences.Editor f23396W;

    /* renamed from: W0 */
    public RelativeLayout f23397W0;

    /* renamed from: X */
    public SharedPreferences.Editor f23398X;

    /* renamed from: X0 */
    public List<GetEpisdoeDetailsCallback> f23399X0;

    /* renamed from: Y */
    public TextView f23400Y;

    /* renamed from: Z */
    public TextView f23402Z;

    /* renamed from: d */
    public C8632a f23407d;

    /* renamed from: e */
    public Context f23409e;

    /* renamed from: f */
    public String f23411f;

    /* renamed from: f0 */
    public TextView f23412f0;

    /* renamed from: f1 */
    public SeriesRecentWatchDatabase f23413f1;

    /* renamed from: g0 */
    public TextView f23415g0;

    /* renamed from: h */
    public View f23417h;

    /* renamed from: h0 */
    public TextView f23418h0;

    /* renamed from: h1 */
    public C6783a f23419h1;

    /* renamed from: i */
    public View f23420i;

    /* renamed from: i0 */
    public String f23421i0;

    /* renamed from: j */
    public View f23423j;

    /* renamed from: j0 */
    public Handler f23424j0;

    /* renamed from: j1 */
    public C5602m f23425j1;

    /* renamed from: k */
    public View f23426k;

    /* renamed from: k0 */
    public Handler f23427k0;

    /* renamed from: l */
    public View f23428l;

    /* renamed from: l0 */
    public PopupWindow f23429l0;

    /* renamed from: m */
    public View f23430m;

    /* renamed from: m0 */
    public SharedPreferences.Editor f23431m0;

    /* renamed from: n */
    public View f23432n;

    /* renamed from: n0 */
    public SharedPreferences.Editor f23433n0;

    /* renamed from: o */
    public View f23434o;

    /* renamed from: o0 */
    public SharedPreferences.Editor f23435o0;

    /* renamed from: p */
    public View f23436p;

    /* renamed from: p0 */
    public String f23437p0;

    /* renamed from: q */
    public View f23438q;

    /* renamed from: r */
    public View f23440r;

    /* renamed from: s */
    public SimpleDateFormat f23442s;

    /* renamed from: t */
    public LinearLayout f23444t;

    /* renamed from: t0 */
    public SharedPreferences.Editor f23445t0;

    /* renamed from: u */
    public TextView f23446u;

    /* renamed from: u0 */
    public String f23447u0;

    /* renamed from: v */
    public TextView f23448v;

    /* renamed from: w */
    public SeekBar f23450w;

    /* renamed from: w0 */
    public View f23451w0;

    /* renamed from: x */
    public Date f23452x;

    /* renamed from: x0 */
    public View f23453x0;

    /* renamed from: y */
    public LinearLayout f23454y;

    /* renamed from: y0 */
    public Handler f23455y0;

    /* renamed from: z */
    public ProgressBar f23456z;

    /* renamed from: z0 */
    public Handler f23457z0;

    /* renamed from: g */
    public boolean f23414g = false;

    /* renamed from: D */
    public ArrayList<File> f23358D = new ArrayList<>();

    /* renamed from: S */
    public boolean f23388S = false;

    /* renamed from: T */
    public boolean f23390T = false;

    /* renamed from: q0 */
    public String f23439q0 = "";

    /* renamed from: r0 */
    public String f23441r0 = "";

    /* renamed from: s0 */
    public String f23443s0 = "";

    /* renamed from: v0 */
    public int f23449v0 = 0;

    /* renamed from: A0 */
    public int f23353A0 = 0;

    /* renamed from: F0 */
    public int f23363F0 = -1;

    /* renamed from: P0 */
    public Boolean f23383P0 = Boolean.TRUE;

    /* renamed from: Y0 */
    public String f23401Y0 = "";

    /* renamed from: Z0 */
    public String f23403Z0 = "";

    /* renamed from: a1 */
    public String f23404a1 = "";

    /* renamed from: b1 */
    public String f23405b1 = "";

    /* renamed from: c1 */
    public String f23406c1 = "";

    /* renamed from: d1 */
    public String f23408d1 = "";

    /* renamed from: e1 */
    public int f23410e1 = 0;

    /* renamed from: g1 */
    public int f23416g1 = 4;

    /* renamed from: i1 */
    public String f23422i1 = "";

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerVODActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerVODActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerVODActivity$a.class */
    public class C3827a implements PopupWindow.OnDismissListener {

        /* renamed from: b */
        public final NSTIJKPlayerVODActivity f23458b;

        public C3827a(NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity) {
            this.f23458b = nSTIJKPlayerVODActivity;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            this.f23458b.m18673Z0();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerVODActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerVODActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerVODActivity$b.class */
    public class C3828b implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        public final NSTIJKPlayerVODActivity f23459b;

        public C3828b(NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity) {
            this.f23459b = nSTIJKPlayerVODActivity;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            String obj = this.f23459b.f23391T0.getItemAtPosition(i10).toString();
            NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity = this.f23459b;
            nSTIJKPlayerVODActivity.f23393U0 = nSTIJKPlayerVODActivity.getSharedPreferences("pref.using_sub_font_size", 0);
            NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity2 = this.f23459b;
            nSTIJKPlayerVODActivity2.f23395V0 = nSTIJKPlayerVODActivity2.f23393U0.edit();
            if (this.f23459b.f23395V0 != null) {
                this.f23459b.f23395V0.putString("pref.using_sub_font_size", obj);
                this.f23459b.f23395V0.apply();
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerVODActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerVODActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerVODActivity$c.class */
    public class DialogInterfaceOnDismissListenerC3829c implements DialogInterface.OnDismissListener {

        /* renamed from: b */
        public final NSTIJKPlayerVODActivity f23460b;

        public DialogInterfaceOnDismissListenerC3829c(NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity) {
            this.f23460b = nSTIJKPlayerVODActivity;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (this.f23460b.f23385Q0 != null) {
                this.f23460b.f23385Q0.m19667n1();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerVODActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerVODActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerVODActivity$d.class */
    public class ViewOnClickListenerC3830d implements View.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerVODActivity f23461b;

        public ViewOnClickListenerC3830d(NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity) {
            this.f23461b = nSTIJKPlayerVODActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f23461b.f23381O0.setCancelable(true);
            this.f23461b.onBackPressed();
            this.f23461b.onBackPressed();
            this.f23461b.f23381O0.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerVODActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerVODActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerVODActivity$e.class */
    public class ViewOnClickListenerC3831e implements View.OnClickListener {

        /* renamed from: b */
        public final ArrayList f23462b;

        /* renamed from: c */
        public final int f23463c;

        /* renamed from: d */
        public final String f23464d;

        /* renamed from: e */
        public final NSTIJKPlayerVODActivity f23465e;

        /* renamed from: f */
        public final int f23466f;

        /* renamed from: g */
        public final String f23467g;

        /* renamed from: h */
        public final String f23468h;

        /* renamed from: i */
        public final int f23469i;

        /* renamed from: j */
        public final NSTIJKPlayerVODActivity f23470j;

        public ViewOnClickListenerC3831e(NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity, ArrayList arrayList, int i10, String str, NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity2, int i11, String str2, String str3, int i12) {
            this.f23470j = nSTIJKPlayerVODActivity;
            this.f23462b = arrayList;
            this.f23463c = i10;
            this.f23464d = str;
            this.f23465e = nSTIJKPlayerVODActivity2;
            this.f23466f = i11;
            this.f23467g = str2;
            this.f23468h = str3;
            this.f23469i = i12;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String name = ((LiveStreamsDBModel) this.f23462b.get(this.f23463c)).getName();
            new LiveStreamsDBModel();
            ArrayList m18672X0 = this.f23470j.f23365G0.equals("m3u") ? this.f23470j.m18672X0(String.valueOf(Uri.parse(this.f23464d)), SharepreferenceDBHandler.m15337A(this.f23465e)) : this.f23470j.m18671W0(this.f23466f, SharepreferenceDBHandler.m15337A(this.f23465e));
            long j10 = 0;
            if (m18672X0 != null) {
                j10 = 0;
                try {
                    if (m18672X0.size() > 0) {
                        j10 = ((LiveStreamsDBModel) m18672X0.get(0)).m14804K();
                    }
                } catch (Exception e10) {
                    j10 = 0;
                }
            }
            if (this.f23470j.f23385Q0 != null && this.f23470j.f23383P0.booleanValue()) {
                this.f23470j.m18686m1();
                String valueOf = String.valueOf(Uri.parse(this.f23470j.f23411f + this.f23466f + InstructionFileId.DOT + this.f23467g));
                NSTIJKPlayerVOD nSTIJKPlayerVOD = this.f23470j.f23385Q0;
                NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity = this.f23470j;
                nSTIJKPlayerVOD.m19635I1(valueOf, nSTIJKPlayerVODActivity.f23388S, name, 0L, this.f23466f, this.f23468h, nSTIJKPlayerVODActivity.f23386R, this.f23463c, this.f23469i, this.f23470j.f23365G0, "nst");
                C7920a.m34301l().m34303B(this.f23466f);
                C7920a.m34301l().m34313r(this.f23462b);
                C7920a.m34301l().m34315u(this.f23463c);
                this.f23470j.f23385Q0.setCurrentPositionSeekbar((int) j10);
                this.f23470j.f23385Q0.setProgress(true);
                if (this.f23470j.f23385Q0 != null) {
                    this.f23470j.f23385Q0.f24742J = 0;
                    this.f23470j.f23385Q0.f24748L = false;
                    this.f23470j.f23385Q0.f24768U0 = true;
                    this.f23470j.f23385Q0.f24719B0 = false;
                    this.f23470j.f23385Q0.start();
                }
            }
            this.f23470j.f23381O0.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerVODActivity$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerVODActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerVODActivity$f.class */
    public class ViewOnClickListenerC3832f implements View.OnClickListener {

        /* renamed from: b */
        public final int f23471b;

        /* renamed from: c */
        public final String f23472c;

        /* renamed from: d */
        public final String f23473d;

        /* renamed from: e */
        public final String f23474e;

        /* renamed from: f */
        public final int f23475f;

        /* renamed from: g */
        public final int f23476g;

        /* renamed from: h */
        public final ArrayList f23477h;

        /* renamed from: i */
        public final NSTIJKPlayerVODActivity f23478i;

        public ViewOnClickListenerC3832f(NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity, int i10, String str, String str2, String str3, int i11, int i12, ArrayList arrayList) {
            this.f23478i = nSTIJKPlayerVODActivity;
            this.f23471b = i10;
            this.f23472c = str;
            this.f23473d = str2;
            this.f23474e = str3;
            this.f23475f = i11;
            this.f23476g = i12;
            this.f23477h = arrayList;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f23478i.m18686m1();
            String valueOf = String.valueOf(Uri.parse(this.f23478i.f23411f + this.f23471b + InstructionFileId.DOT + this.f23472c));
            NSTIJKPlayerVOD nSTIJKPlayerVOD = this.f23478i.f23385Q0;
            NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity = this.f23478i;
            nSTIJKPlayerVOD.m19635I1(valueOf, nSTIJKPlayerVODActivity.f23388S, this.f23473d, 0L, this.f23471b, this.f23474e, nSTIJKPlayerVODActivity.f23386R, this.f23475f, this.f23476g, this.f23478i.f23365G0, "nst");
            if (this.f23478i.f23385Q0 != null) {
                C7920a.m34301l().m34303B(this.f23471b);
                C7920a.m34301l().m34313r(this.f23477h);
                C7920a.m34301l().m34315u(this.f23475f);
                if (this.f23478i.f23385Q0 != null) {
                    this.f23478i.f23385Q0.f24758P0 = true;
                    this.f23478i.f23385Q0.f24746K0 = true;
                    this.f23478i.f23385Q0.f24754N0 = 0L;
                    this.f23478i.f23385Q0.f24768U0 = true;
                    this.f23478i.f23385Q0.f24719B0 = false;
                    this.f23478i.f23385Q0.f24742J = 0;
                    this.f23478i.f23385Q0.f24748L = false;
                    this.f23478i.f23385Q0.start();
                }
            }
            this.f23478i.f23381O0.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerVODActivity$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerVODActivity$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerVODActivity$g.class */
    public class RunnableC3833g implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerVODActivity f23479b;

        public RunnableC3833g(NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity) {
            this.f23479b = nSTIJKPlayerVODActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23479b.m18674a1();
            if (C5251a.f30048k.booleanValue()) {
                this.f23479b.findViewById(2131429693).setVisibility(0);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerVODActivity$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerVODActivity$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerVODActivity$h.class */
    public class RunnableC3834h implements Runnable {

        /* renamed from: b */
        public final int f23480b;

        /* renamed from: c */
        public final NSTIJKPlayerVODActivity f23481c;

        public RunnableC3834h(NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity, int i10) {
            this.f23481c = nSTIJKPlayerVODActivity;
            this.f23480b = i10;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0250  */
        /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x01b9  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0166  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 647
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerVODActivity.RunnableC3834h.run():void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerVODActivity$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerVODActivity$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerVODActivity$i.class */
    public class RunnableC3835i implements Runnable {

        /* renamed from: b */
        public final int f23482b;

        /* renamed from: c */
        public final NSTIJKPlayerVODActivity f23483c;

        public RunnableC3835i(NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity, int i10) {
            this.f23483c = nSTIJKPlayerVODActivity;
            this.f23482b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            String valueOf;
            NSTIJKPlayerVOD nSTIJKPlayerVOD;
            boolean z10;
            String str;
            int i10;
            String str2;
            ArrayList<LiveStreamsDBModel> arrayList;
            int i11;
            int i12;
            String str3;
            this.f23483c.m18686m1();
            if (!this.f23483c.f23365G0.equals("m3u") || this.f23483c.f23401Y0.equals("recording")) {
                if (this.f23483c.f23401Y0.equals("recording")) {
                    nSTIJKPlayerVOD = this.f23483c.f23385Q0;
                    NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity = this.f23483c;
                    valueOf = nSTIJKPlayerVODActivity.f23411f;
                    z10 = nSTIJKPlayerVODActivity.f23388S;
                    str = nSTIJKPlayerVODActivity.f23404a1;
                    i10 = 0;
                    arrayList = null;
                    i11 = 0;
                    i12 = 0;
                    str3 = nSTIJKPlayerVODActivity.f23365G0;
                    str2 = "";
                } else {
                    valueOf = String.valueOf(Uri.parse(this.f23483c.f23411f + this.f23483c.f23410e1 + InstructionFileId.DOT + this.f23483c.f23408d1));
                    nSTIJKPlayerVOD = this.f23483c.f23385Q0;
                    NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity2 = this.f23483c;
                    z10 = nSTIJKPlayerVODActivity2.f23388S;
                    str = nSTIJKPlayerVODActivity2.f23404a1;
                    i10 = nSTIJKPlayerVODActivity2.f23410e1;
                    str2 = nSTIJKPlayerVODActivity2.f23406c1;
                    arrayList = nSTIJKPlayerVODActivity2.f23386R;
                    i11 = this.f23482b;
                    i12 = this.f23483c.f23449v0;
                    str3 = this.f23483c.f23365G0;
                }
                nSTIJKPlayerVOD.m19635I1(valueOf, z10, str, 0L, i10, str2, arrayList, i11, i12, str3, "nst");
            } else {
                NSTIJKPlayerVOD nSTIJKPlayerVOD2 = this.f23483c.f23385Q0;
                String str4 = this.f23483c.f23367H0;
                NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity3 = this.f23483c;
                nSTIJKPlayerVOD2.m19635I1(str4, nSTIJKPlayerVODActivity3.f23388S, nSTIJKPlayerVODActivity3.f23404a1, 0L, 0, "", null, this.f23482b, 0, nSTIJKPlayerVODActivity3.f23365G0, "nst");
                C7920a.m34301l().m34312p("m3u");
            }
            this.f23483c.f23385Q0.f24742J = 0;
            this.f23483c.f23385Q0.f24748L = false;
            this.f23483c.f23385Q0.f24768U0 = false;
            this.f23483c.f23385Q0.setProgress(false);
            this.f23483c.f23385Q0.start();
            if (this.f23483c.f23401Y0.equals("movies")) {
                C7920a.m34301l().m34303B(C5255e.m26214Q(((LiveStreamsDBModel) this.f23483c.f23384Q.get(this.f23482b)).m14811R()));
                C7920a.m34301l().m34313r(this.f23483c.f23384Q);
            } else if (this.f23483c.f23401Y0.equals("series")) {
                C7920a.m34301l().m34316w(this.f23483c.f23422i1);
                EpisodesUsingSinglton.m14753c().m14758f(this.f23483c.f23399X0);
                C7920a.m34301l().m34303B(C5255e.m26214Q(((GetEpisdoeDetailsCallback) this.f23483c.f23399X0.get(this.f23482b)).m14958j()));
                C7920a.m34301l().m34314s(this.f23483c.f23399X0);
            }
            C7920a.m34301l().m34315u(this.f23482b);
            this.f23483c.f23385Q0.setProgress(false);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerVODActivity$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerVODActivity$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerVODActivity$j.class */
    public class RunnableC3836j implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerVODActivity f23484b;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerVODActivity$j$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerVODActivity$j$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerVODActivity$j$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final RunnableC3836j f23485b;

            public a(RunnableC3836j runnableC3836j) {
                this.f23485b = runnableC3836j;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f23485b.f23484b.f23353A0 = 0;
                this.f23485b.f23484b.f23355B0.setVisibility(8);
            }
        }

        public RunnableC3836j(NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity) {
            this.f23484b = nSTIJKPlayerVODActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23484b.f23385Q0.seekTo(this.f23484b.f23385Q0.getCurrentPosition() + this.f23484b.f23353A0);
            this.f23484b.f23455y0.removeCallbacksAndMessages(null);
            this.f23484b.f23455y0.postDelayed(new a(this), 3000L);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerVODActivity$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerVODActivity$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerVODActivity$k.class */
    public class RunnableC3837k implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerVODActivity f23486b;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerVODActivity$k$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerVODActivity$k$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerVODActivity$k$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final RunnableC3837k f23487b;

            public a(RunnableC3837k runnableC3837k) {
                this.f23487b = runnableC3837k;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f23487b.f23486b.f23353A0 = 0;
                this.f23487b.f23486b.f23355B0.setVisibility(8);
            }
        }

        public RunnableC3837k(NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity) {
            this.f23486b = nSTIJKPlayerVODActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerVOD nSTIJKPlayerVOD;
            int i10;
            if (this.f23486b.f23385Q0.getCurrentPosition() + this.f23486b.f23353A0 > 0) {
                nSTIJKPlayerVOD = this.f23486b.f23385Q0;
                i10 = this.f23486b.f23385Q0.getCurrentPosition() + this.f23486b.f23353A0;
            } else {
                nSTIJKPlayerVOD = this.f23486b.f23385Q0;
                i10 = 0;
            }
            nSTIJKPlayerVOD.seekTo(i10);
            this.f23486b.f23455y0.removeCallbacksAndMessages(null);
            this.f23486b.f23455y0.postDelayed(new a(this), 3000L);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerVODActivity$l.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerVODActivity$l */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerVODActivity$l.class */
    public class ViewOnFocusChangeListenerC3838l implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f23488b;

        /* renamed from: c */
        public final NSTIJKPlayerVODActivity f23489c;

        public ViewOnFocusChangeListenerC3838l(NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity, View view) {
            this.f23489c = nSTIJKPlayerVODActivity;
            this.f23488b = view;
        }

        /* renamed from: a */
        public final void m18694a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f23488b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m18695b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f23488b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m18696c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f23488b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            float f10 = 1.04f;
            float f11 = 1.02f;
            if (!z10) {
                if (z10) {
                    return;
                }
                if (this.f23488b.getTag().equals("15")) {
                    if (!z10) {
                        f10 = 1.0f;
                    }
                    m18695b(f10);
                    m18696c(f10);
                } else {
                    if (!z10) {
                        f11 = 1.0f;
                    }
                    m18695b(f11);
                    m18696c(f11);
                }
                m18694a(z10);
                View view2 = this.f23488b;
                if (view2 != null && view2.getTag() != null && this.f23488b.getTag().equals("1") && this.f23489c.f23389S0 != null) {
                    this.f23489c.f23389S0.setBackgroundResource(2131230845);
                }
                View view3 = this.f23488b;
                if (view3 != null && view3.getTag() != null && this.f23488b.getTag().equals("9")) {
                    this.f23489c.f23377M0.setBackgroundResource(2131230845);
                }
                View view4 = this.f23488b;
                if (view4 != null && view4.getTag() != null && this.f23488b.getTag().equals("8")) {
                    this.f23489c.f23379N0.setBackgroundResource(2131230845);
                }
                View view5 = this.f23488b;
                if (view5 == null || view5.getTag() == null || !this.f23488b.getTag().equals("15")) {
                    return;
                }
                this.f23489c.f23373K0.setImageDrawable(this.f23489c.getResources().getDrawable(2131231185));
                return;
            }
            Log.e("id is", "" + this.f23488b.getTag());
            View view6 = this.f23488b;
            if (view6 != null && view6.getTag() != null && this.f23488b.getTag().equals("2")) {
                view.setBackground(this.f23489c.getResources().getDrawable(2131231786));
                return;
            }
            View view7 = this.f23488b;
            if (view7 == null || !view7.getTag().equals("15")) {
                if (!z10) {
                    f11 = 1.0f;
                }
                m18695b(f11);
                m18696c(f11);
            } else {
                if (!z10) {
                    f10 = 1.0f;
                }
                m18695b(f10);
                m18696c(f10);
            }
            View view8 = this.f23488b;
            if (view8 != null && view8.getTag() != null && this.f23488b.getTag().equals("1") && this.f23489c.f23389S0 != null) {
                this.f23489c.f23389S0.setBackgroundResource(2131230828);
            }
            View view9 = this.f23488b;
            if (view9 != null && view9.getTag() != null && this.f23488b.getTag().equals("9")) {
                this.f23489c.f23377M0.setBackgroundResource(2131230828);
            }
            View view10 = this.f23488b;
            if (view10 != null && view10.getTag() != null && this.f23488b.getTag().equals("8")) {
                this.f23489c.f23379N0.setBackgroundResource(2131231576);
            }
            View view11 = this.f23488b;
            if (view11 == null || view11.getTag() == null || !this.f23488b.getTag().equals("15")) {
                return;
            }
            this.f23489c.f23373K0.setImageDrawable(this.f23489c.getResources().getDrawable(2131231186));
            this.f23489c.f23377M0.setBackgroundResource(2131230845);
            this.f23489c.f23379N0.setBackgroundResource(2131230845);
        }
    }

    /* renamed from: Q0 */
    public static long m18656Q0(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0L;
        }
    }

    /* renamed from: S0 */
    public static String m18657S0(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    /* renamed from: Y0 */
    public static String m18658Y0(String str) {
        Matcher matcher = Pattern.compile("(?:youtube(?:-nocookie)?\\.com\\/(?:[^\\/\\n\\s]+\\/\\S+\\/|(?:v|e(?:mbed)?)\\/|\\S*?[?&]v=)|youtu\\.be\\/)([a-zA-Z0-9_-]{11})", 2).matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    /* renamed from: P0 */
    public void m18667P0() {
        File[] m26198A = C5255e.m26198A(this.f23409e);
        for (File file : m26198A) {
            if (file.toString().endsWith(".ts")) {
                Arrays.asList(file);
            }
        }
        if (m26198A.length > 0) {
            for (File file2 : m26198A) {
                if (file2.toString().endsWith(".ts")) {
                    this.f23358D.addAll(Arrays.asList(file2));
                }
            }
            Collections.reverse(this.f23358D);
            this.f23356C = this.f23358D;
        }
    }

    /* renamed from: R0 */
    public void m18668R0() {
        TextView textView;
        this.f23385Q0.m19667n1();
        NSTIJKPlayerVOD nSTIJKPlayerVOD = this.f23385Q0;
        if (nSTIJKPlayerVOD != null && (textView = nSTIJKPlayerVOD.f24792h0) != null) {
            textView.setVisibility(0);
        }
        this.f23392U.setVisibility(8);
        this.f23385Q0.m19663j1(Boolean.valueOf(this.f23388S));
        m18689p1();
        m18687n1();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            String str = this.f23401Y0;
            if (str == null || str.equals("")) {
                return;
            }
            if (!this.f23401Y0.equals("devicedata") && !this.f23401Y0.equals("loadurl")) {
                return;
            }
        }
        m18675b1();
    }

    /* renamed from: T0 */
    public int m18669T0(ArrayList<LiveStreamsDBModel> arrayList, int i10) {
        int i11;
        int i12 = 0;
        while (true) {
            i11 = 0;
            if (i12 >= arrayList.size()) {
                break;
            }
            if (C5255e.m26215R(arrayList.get(i12).m14805L()) == i10) {
                i11 = i12;
                break;
            }
            i12++;
        }
        return i11;
    }

    /* renamed from: V0 */
    public int m18670V0(List<GetEpisdoeDetailsCallback> list, int i10) {
        int i11;
        int i12 = 0;
        while (true) {
            i11 = 0;
            if (i12 >= list.size()) {
                break;
            }
            if (C5255e.m26215R(list.get(i12).m14958j()) == i10) {
                i11 = i12;
                break;
            }
            i12++;
        }
        return i11;
    }

    /* renamed from: W0 */
    public final ArrayList<LiveStreamsDBModel> m18671W0(int i10, int i11) {
        return this.f23369I0.m15301B0(String.valueOf(i10), i11);
    }

    /* renamed from: X0 */
    public final ArrayList<LiveStreamsDBModel> m18672X0(String str, int i10) {
        return this.f23354B.m15203Y1(str, i10);
    }

    /* renamed from: Z0 */
    public final void m18673Z0() {
        try {
            NSTIJKPlayerVOD nSTIJKPlayerVOD = this.f23385Q0;
            if (nSTIJKPlayerVOD != null) {
                nSTIJKPlayerVOD.setSystemUiVisibility(4871);
            }
        } catch (Exception e10) {
        }
    }

    /* renamed from: a1 */
    public void m18674a1() {
        findViewById(2131427532).setVisibility(8);
        findViewById(2131427785).setVisibility(8);
        findViewById(2131428499).setVisibility(8);
        if (C5251a.f30048k.booleanValue()) {
            findViewById(2131429693).setVisibility(0);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: b1 */
    public final void m18675b1() {
        boolean z10;
        String str;
        StringBuilder sb2;
        boolean z11;
        String str2;
        StringBuilder sb3;
        String sb4;
        String str3;
        boolean z12;
        C8632a c8632a = new C8632a(this);
        this.f23407d = c8632a;
        this.f23385Q0 = (NSTIJKPlayerVOD) c8632a.m37067a(2131429674).m37069c();
        this.f23369I0 = new RecentWatchDBHandler(this.f23409e);
        this.f23413f1 = new SeriesRecentWatchDatabase(this.f23409e);
        this.f23425j1 = new C5602m(this.f23409e);
        this.f23419h1 = new C6783a(this.f23409e);
        this.f23360E = getSharedPreferences("loginPrefs", 0);
        this.f23362F = this.f23409e.getSharedPreferences("loginPrefs", 0);
        this.f23364G = this.f23409e.getSharedPreferences("pref.using_media_codec", 0);
        this.f23366H = this.f23409e.getSharedPreferences("allowedFormat", 0);
        SharedPreferences sharedPreferences = getSharedPreferences("currentlyPlayingVideo", 0);
        this.f23368I = sharedPreferences;
        this.f23396W = sharedPreferences.edit();
        SharedPreferences sharedPreferences2 = getSharedPreferences("currentlyPlayingVideoPosition", 0);
        this.f23370J = sharedPreferences2;
        this.f23398X = sharedPreferences2.edit();
        this.f23372K = this.f23409e.getSharedPreferences("currentSubtitleTrack", 0);
        this.f23374L = this.f23409e.getSharedPreferences("currentAudioTrack", 0);
        this.f23376M = this.f23409e.getSharedPreferences("currentVideoTrack", 0);
        this.f23433n0 = this.f23374L.edit();
        this.f23435o0 = this.f23376M.edit();
        this.f23431m0 = this.f23372K.edit();
        this.f23433n0.clear();
        this.f23433n0.apply();
        this.f23435o0.clear();
        this.f23435o0.apply();
        this.f23431m0.clear();
        this.f23431m0.apply();
        this.f23399X0 = EpisodesUsingSinglton.m14753c().m14755b();
        if (SharepreferenceDBHandler.m15373f(this.f23409e).equals("m3u")) {
            this.f23365G0 = "m3u";
        } else {
            this.f23365G0 = "api";
        }
        String string = this.f23360E.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        String string2 = this.f23360E.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        this.f23378N = this.f23366H.getString("allowedFormat", "");
        String string3 = this.f23360E.getString("serverUrl", "");
        String string4 = this.f23360E.getString("serverProtocol", "");
        String string5 = this.f23360E.getString("serverPortHttps", "");
        String string6 = this.f23360E.getString("serverPort", "");
        String string7 = this.f23360E.getString("serverPortRtmp", "");
        string4.hashCode();
        switch (string4.hashCode()) {
            case 3213448:
                if (string4.equals(HttpHost.DEFAULT_SCHEME_NAME)) {
                    z10 = false;
                    break;
                }
                z10 = -1;
                break;
            case 3504631:
                if (string4.equals("rmtp")) {
                    z10 = true;
                    break;
                }
                z10 = -1;
                break;
            case 99617003:
                if (string4.equals(ClientConstants.DOMAIN_SCHEME)) {
                    z10 = 2;
                    break;
                }
                z10 = -1;
                break;
            default:
                z10 = -1;
                break;
        }
        switch (z10) {
            case false:
                str = string3;
                if (!string3.startsWith("http://")) {
                    sb2 = new StringBuilder();
                    sb2.append("http://");
                    sb2.append(string3);
                    str = sb2.toString();
                    break;
                }
                break;
            case true:
                str = string3;
                if (!string3.startsWith("rmtp://")) {
                    str = "rmtp://" + string3;
                }
                string6 = string7;
                break;
            case true:
                str = string3;
                string6 = string5;
                if (!string3.startsWith("https://")) {
                    str = "https://" + string3;
                    string6 = string5;
                    break;
                }
                break;
            default:
                str = string3;
                if (!string3.startsWith("http://")) {
                    str = string3;
                    if (!string3.startsWith("https://")) {
                        sb2 = new StringBuilder();
                        sb2.append("http://");
                        sb2.append(string3);
                        str = sb2.toString();
                        break;
                    }
                }
                break;
        }
        String stringExtra = getIntent().getStringExtra("VIDEO_TITLE");
        int intExtra = getIntent().getIntExtra("OPENED_STREAM_ID", 0);
        this.f23363F0 = getIntent().getIntExtra("OPENED_STREAM_ID", 0);
        this.f23367H0 = getIntent().getStringExtra("VIDEO_URL");
        this.f23449v0 = getIntent().getIntExtra("VIDEO_NUM", 0);
        String stringExtra2 = getIntent().getStringExtra("STREAM_START_TIME");
        String stringExtra3 = getIntent().getStringExtra("STREAM_STOP_TIME");
        this.f23401Y0 = getIntent().getStringExtra("type");
        String str4 = this.f23403Z0;
        if (str4 == null || str4.equals("")) {
            String str5 = this.f23401Y0;
            if (str5 != null) {
                if (str5.equals("catch_up")) {
                    String str6 = this.f23378N;
                    if (str6 == null || str6.isEmpty() || this.f23378N.equals("") || !this.f23378N.equals(CookieSpecs.DEFAULT)) {
                        String str7 = this.f23378N;
                        if (str7 == null || str7.isEmpty() || this.f23378N.equals("") || !this.f23378N.equals("ts")) {
                            String str8 = this.f23378N;
                            str3 = ".ts";
                            if (str8 != null) {
                                str3 = ".ts";
                                if (!str8.isEmpty()) {
                                    str3 = ".ts";
                                    if (!this.f23378N.equals("")) {
                                        str3 = ".ts";
                                        if (this.f23378N.equals("m3u8")) {
                                            str3 = ".m3u8";
                                        }
                                    }
                                }
                            }
                        } else {
                            str3 = ".ts";
                        }
                    } else {
                        str3 = ".ts";
                    }
                    this.f23378N = str3;
                }
                SharepreferenceDBHandler.m15372e0(this.f23401Y0, this.f23409e);
                String str9 = this.f23401Y0;
                str9.hashCode();
                switch (str9.hashCode()) {
                    case -1068259517:
                        if (str9.equals("movies")) {
                            z11 = false;
                            break;
                        }
                        z11 = -1;
                        break;
                    case -905838985:
                        if (str9.equals("series")) {
                            z11 = true;
                            break;
                        }
                        z11 = -1;
                        break;
                    case 48678559:
                        if (str9.equals("catch_up")) {
                            z11 = 2;
                            break;
                        }
                        z11 = -1;
                        break;
                    case 336662217:
                        if (str9.equals("loadurl")) {
                            z11 = 3;
                            break;
                        }
                        z11 = -1;
                        break;
                    case 781644544:
                        if (str9.equals("devicedata")) {
                            z11 = 4;
                            break;
                        }
                        z11 = -1;
                        break;
                    case 993558001:
                        if (str9.equals("recording")) {
                            z11 = 5;
                            break;
                        }
                        z11 = -1;
                        break;
                    default:
                        z11 = -1;
                        break;
                }
                switch (z11) {
                    case false:
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(str);
                        sb5.append(":");
                        sb5.append(string6);
                        str2 = "/movie/";
                        sb3 = sb5;
                        sb3.append(str2);
                        sb3.append(string);
                        sb3.append("/");
                        sb3.append(string2);
                        sb3.append("/");
                        sb4 = sb3.toString();
                        this.f23439q0 = sb4;
                        break;
                    case true:
                        this.f23367H0 = getIntent().getStringExtra("VIDEO_URL");
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(str);
                        sb6.append(":");
                        sb6.append(string6);
                        str2 = "/series/";
                        sb3 = sb6;
                        sb3.append(str2);
                        sb3.append(string);
                        sb3.append("/");
                        sb3.append(string2);
                        sb3.append("/");
                        sb4 = sb3.toString();
                        this.f23439q0 = sb4;
                        break;
                    case true:
                        this.f23449v0 = getIntent().getIntExtra("VIDEO_NUM", 0);
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(str);
                        sb7.append(":");
                        sb7.append(string6);
                        sb7.append("/timeshift/");
                        sb7.append(string);
                        sb7.append("/");
                        sb7.append(string2);
                        sb7.append("/");
                        sb7.append(stringExtra3);
                        sb7.append("/");
                        sb7.append(stringExtra2);
                        sb3 = sb7;
                        sb3.append("/");
                        sb4 = sb3.toString();
                        this.f23439q0 = sb4;
                        break;
                    case true:
                    case true:
                        this.f23441r0 = getIntent().getStringExtra("VIDEO_PATH");
                        break;
                    case true:
                        sb4 = getIntent().getStringExtra("VIDEO_PATH");
                        this.f23439q0 = sb4;
                        break;
                }
            }
        } else {
            this.f23443s0 = this.f23403Z0;
        }
        this.f23411f = C5255e.m26252s(this.f23439q0);
        this.f23354B = new LiveStreamDBHandler(this);
        this.f23424j0 = new Handler();
        this.f23427k0 = new Handler();
        this.f23457z0 = new Handler();
        this.f23455y0 = new Handler();
        this.f23450w = (SeekBar) findViewById(2131429688);
        this.f23448v = (TextView) findViewById(2131429643);
        this.f23355B0 = (LinearLayout) findViewById(2131428498);
        this.f23357C0 = (TextView) findViewById(2131429599);
        NSTIJKPlayerVOD nSTIJKPlayerVOD = this.f23385Q0;
        nSTIJKPlayerVOD.m19630D1(this, nSTIJKPlayerVOD, this.f23450w, this.f23448v);
        this.f23456z = (ProgressBar) findViewById(C5974n.f33499T);
        this.f23454y = (LinearLayout) findViewById(2131428499);
        this.f23380O = (AppCompatImageView) findViewById(2131427637);
        this.f23382P = (AppCompatImageView) findViewById(2131427638);
        this.f23392U = (RelativeLayout) findViewById(2131429052);
        this.f23371J0 = C5255e.m26247n0(C7708d.m33672d());
        this.f23452x = new Date();
        this.f23400Y = (TextView) findViewById(2131427816);
        this.f23402Z = (TextView) findViewById(2131429309);
        this.f23450w = (SeekBar) findViewById(2131427515);
        this.f23444t = (LinearLayout) findViewById(2131427519);
        this.f23446u = (TextView) findViewById(2131427523);
        this.f23448v = (TextView) findViewById(2131429643);
        Locale locale = Locale.US;
        this.f23442s = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f23352A = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        findViewById(C10105q.f46345x).setOnClickListener(this);
        findViewById(C10105q.f46306G).setOnClickListener(this);
        this.f23380O.setOnClickListener(this);
        this.f23382P.setOnClickListener(this);
        View findViewById = findViewById(C10105q.f46302C);
        this.f23417h = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
        View findViewById2 = findViewById(C10105q.f46301B);
        this.f23420i = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(this);
        }
        View findViewById3 = findViewById(C10105q.f46306G);
        this.f23426k = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(this);
        }
        View findViewById4 = findViewById(C10105q.f46345x);
        this.f23423j = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(this);
        }
        View findViewById5 = findViewById(2131427650);
        this.f23428l = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(this);
        }
        View findViewById6 = findViewById(2131427631);
        this.f23430m = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(this);
        }
        View findViewById7 = findViewById(C10105q.f46316Q);
        this.f23432n = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(this);
        }
        View findViewById8 = findViewById(2131427946);
        this.f23436p = findViewById8;
        if (findViewById8 != null) {
            findViewById8.setOnClickListener(this);
        }
        View findViewById9 = findViewById(2131427945);
        this.f23438q = findViewById9;
        if (findViewById9 != null) {
            findViewById9.setOnClickListener(this);
        }
        View findViewById10 = findViewById(2131427955);
        this.f23440r = findViewById10;
        if (findViewById10 != null) {
            findViewById10.setOnClickListener(this);
        }
        View findViewById11 = findViewById(2131429689);
        this.f23434o = findViewById11;
        if (findViewById11 != null) {
            findViewById11.setOnClickListener(this);
        }
        View findViewById12 = findViewById(C10105q.f46302C);
        this.f23417h = findViewById12;
        if (findViewById12 != null) {
            findViewById12.setOnClickListener(this);
        }
        View findViewById13 = findViewById(C10105q.f46301B);
        this.f23420i = findViewById13;
        if (findViewById13 != null) {
            findViewById13.setOnClickListener(this);
        }
        View findViewById14 = findViewById(C10105q.f46306G);
        this.f23426k = findViewById14;
        if (findViewById14 != null) {
            findViewById14.setOnClickListener(this);
        }
        View findViewById15 = findViewById(C10105q.f46345x);
        this.f23423j = findViewById15;
        if (findViewById15 != null) {
            findViewById15.setOnClickListener(this);
        }
        this.f23437p0 = C5255e.m26247n0(C4043b.m19702f() + IjkListPreference.m19719R());
        View findViewById16 = findViewById(C10105q.f46338q);
        this.f23453x0 = findViewById16;
        if (findViewById16 != null) {
            findViewById16.setOnClickListener(this);
        }
        View findViewById17 = findViewById(C10105q.f46310K);
        this.f23451w0 = findViewById17;
        if (findViewById17 != null) {
            findViewById17.setOnClickListener(this);
        }
        View findViewById18 = findViewById(2131427650);
        this.f23428l = findViewById18;
        if (findViewById18 != null) {
            findViewById18.setOnClickListener(this);
        }
        View findViewById19 = findViewById(2131427631);
        this.f23430m = findViewById19;
        if (findViewById19 != null) {
            findViewById19.setOnClickListener(this);
        }
        View findViewById20 = findViewById(C10105q.f46316Q);
        this.f23432n = findViewById20;
        if (findViewById20 != null) {
            findViewById20.setOnClickListener(this);
        }
        View findViewById21 = findViewById(2131429689);
        this.f23434o = findViewById21;
        if (findViewById21 != null) {
            findViewById21.setOnClickListener(this);
        }
        this.f23447u0 = C5255e.m26247n0(C7705a.m33651a());
        f23351n1 = m18657S0(this.f23409e);
        f23348k1 = getApplicationContext().getPackageName();
        this.f23384Q = new ArrayList<>();
        this.f23386R = new ArrayList<>();
        this.f23421i0 = C5255e.m26247n0(IjkListPreference.m19720S() + IjkListPreference.m19718Q());
        this.f23384Q = VodAllCategoriesSingleton.m14909b().m14915g();
        f23349l1 = true;
        this.f23397W0 = (RelativeLayout) findViewById(2131429020);
        String str10 = this.f23403Z0;
        if (str10 == null || str10.equals("")) {
            String str11 = this.f23401Y0;
            if (str11 != null) {
                str11.hashCode();
                switch (str11.hashCode()) {
                    case -1068259517:
                        if (str11.equals("movies")) {
                            z12 = false;
                            break;
                        }
                        z12 = -1;
                        break;
                    case -905838985:
                        if (str11.equals("series")) {
                            z12 = true;
                            break;
                        }
                        z12 = -1;
                        break;
                    case 48678559:
                        if (str11.equals("catch_up")) {
                            z12 = 2;
                            break;
                        }
                        z12 = -1;
                        break;
                    case 336662217:
                        if (str11.equals("loadurl")) {
                            z12 = 3;
                            break;
                        }
                        z12 = -1;
                        break;
                    case 781644544:
                        if (str11.equals("devicedata")) {
                            z12 = 4;
                            break;
                        }
                        z12 = -1;
                        break;
                    case 993558001:
                        if (str11.equals("recording")) {
                            z12 = 5;
                            break;
                        }
                        z12 = -1;
                        break;
                    default:
                        z12 = -1;
                        break;
                }
                switch (z12) {
                    case false:
                        ArrayList<LiveStreamsDBModel> arrayList = this.f23384Q;
                        if (arrayList != null && arrayList.size() != 0) {
                            m18680g1(this.f23384Q, this.f23449v0);
                            break;
                        }
                        m18678e1();
                        break;
                    case true:
                        List<GetEpisdoeDetailsCallback> list = this.f23399X0;
                        if (list != null && list.size() != 0) {
                            m18682i1(this.f23399X0, intExtra);
                            break;
                        }
                        m18678e1();
                        break;
                    case true:
                        if (this.f23385Q0 != null) {
                            this.f23426k.setVisibility(8);
                            this.f23423j.setVisibility(8);
                            this.f23407d.m37067a(2131427528).m37068b(stringExtra);
                            m18686m1();
                            this.f23385Q0.setTitle(stringExtra);
                            this.f23385Q0.m19635I1(String.valueOf(Uri.parse(this.f23411f + intExtra + this.f23378N)), this.f23388S, "", 0L, 0, "", null, 0, 0, " ", "nst");
                            break;
                        }
                        m18678e1();
                        break;
                    case true:
                    case true:
                        if (this.f23383P0.booleanValue()) {
                            try {
                                if (!this.f23441r0.matches(".*(youtube|youtu.be).*")) {
                                    C7920a.m34301l().m34315u(this.f23449v0);
                                    String str12 = this.f23441r0;
                                    String substring = str12.substring(0, str12.lastIndexOf(InstructionFileId.DOT));
                                    String substring2 = substring.substring(substring.lastIndexOf("/") + 1);
                                    this.f23385Q0.setTitle(substring2);
                                    if (this.f23385Q0.getFullScreenValue().booleanValue()) {
                                        this.f23388S = this.f23385Q0.getFullScreenValue().booleanValue();
                                    } else {
                                        this.f23388S = false;
                                    }
                                    this.f23385Q0.m19628B1();
                                    m18686m1();
                                    this.f23385Q0.m19635I1(this.f23441r0, this.f23388S, substring2, 0L, 0, "", null, 0, 0, this.f23365G0, "devicedata");
                                    NSTIJKPlayerVOD nSTIJKPlayerVOD2 = this.f23385Q0;
                                    if (nSTIJKPlayerVOD2 != null) {
                                        nSTIJKPlayerVOD2.f24742J = 0;
                                        nSTIJKPlayerVOD2.f24748L = false;
                                        nSTIJKPlayerVOD2.f24768U0 = true;
                                        nSTIJKPlayerVOD2.f24719B0 = false;
                                        nSTIJKPlayerVOD2.start();
                                    }
                                    m18674a1();
                                    break;
                                } else {
                                    startActivity(new Intent(this, (Class<?>) YouTubePlayerActivity.class).putExtra("you_tube_trailer", m18658Y0(this.f23441r0)));
                                    finish();
                                    break;
                                }
                            } catch (Exception e10) {
                                break;
                            }
                        }
                        break;
                    case true:
                        this.f23356C = new ArrayList<>();
                        m18667P0();
                        ArrayList<File> arrayList2 = this.f23356C;
                        if (arrayList2 != null && arrayList2.size() != 0) {
                            m18681h1(this.f23356C, this.f23449v0);
                            break;
                        }
                        m18678e1();
                        break;
                }
            }
        } else {
            try {
                this.f23443s0 = this.f23403Z0;
                if (this.f23383P0.booleanValue()) {
                    C7920a.m34301l().m34315u(this.f23449v0);
                    String str13 = this.f23443s0;
                    String substring3 = str13.substring(str13.lastIndexOf("/") + 1);
                    this.f23385Q0.setTitle(substring3);
                    if (this.f23385Q0.getFullScreenValue().booleanValue()) {
                        this.f23388S = this.f23385Q0.getFullScreenValue().booleanValue();
                    } else {
                        this.f23388S = false;
                    }
                    this.f23385Q0.m19628B1();
                    m18686m1();
                    this.f23385Q0.m19635I1(this.f23443s0, true, substring3, 0L, 0, "", null, 0, 0, this.f23365G0, "dfo");
                    NSTIJKPlayerVOD nSTIJKPlayerVOD3 = this.f23385Q0;
                    if (nSTIJKPlayerVOD3 != null) {
                        nSTIJKPlayerVOD3.f24742J = 0;
                        nSTIJKPlayerVOD3.f24748L = false;
                        nSTIJKPlayerVOD3.f24768U0 = true;
                        nSTIJKPlayerVOD3.f24719B0 = false;
                        nSTIJKPlayerVOD3.start();
                    }
                }
                m18674a1();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        SharedPreferences sharedPreferences3 = this.f23409e.getSharedPreferences("currentSeekTime", 0);
        this.f23359D0 = sharedPreferences3;
        SharedPreferences.Editor edit = sharedPreferences3.edit();
        this.f23361E0 = edit;
        edit.putString("currentSeekTime", "0");
        this.f23361E0.apply();
    }

    /* renamed from: c1 */
    public void m18676c1() {
        m18689p1();
        m18688o1();
        m18687n1();
    }

    /* renamed from: d1 */
    public final void m18677d1() {
        int m34307j;
        m34307j = C7920a.m34301l().m34307j();
        String str = this.f23401Y0;
        str.hashCode();
        switch (str) {
            case "movies":
                if (m34307j == this.f23384Q.size() - 1) {
                    C7920a.m34301l().m34315u(0);
                    return;
                }
                break;
            case "series":
                if (m34307j == this.f23399X0.size() - 1) {
                    C7920a.m34301l().m34315u(0);
                    return;
                }
                break;
            case "recording":
                if (m34307j == this.f23356C.size() - 1) {
                    C7920a.m34301l().m34315u(0);
                    return;
                }
                break;
        }
        C7920a.m34301l().m34315u(m34307j + 1);
    }

    /* renamed from: e1 */
    public void m18678e1() {
        m18674a1();
        this.f23444t.setVisibility(0);
        this.f23446u.setText(getResources().getString(2132018196));
        if (C5251a.f30048k.booleanValue()) {
            findViewById(2131429693).setVisibility(8);
        }
    }

    /* renamed from: f1 */
    public final void m18679f1(NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity, int i10, String str, String str2, int i11, String str3, ArrayList<LiveStreamsDBModel> arrayList, int i12, String str4) {
        String name = arrayList.get(i12).getName();
        DialogC0242a.a aVar = new DialogC0242a.a(this, 2132082931);
        aVar.m859g(new DialogInterfaceOnDismissListenerC3829c(this));
        View inflate = LayoutInflater.from(this).inflate(2131624246, (ViewGroup) null);
        this.f23375L0 = (TextView) inflate.findViewById(2131429517);
        this.f23377M0 = (Button) inflate.findViewById(2131427617);
        ImageView imageView = (ImageView) inflate.findViewById(2131428154);
        this.f23373K0 = imageView;
        imageView.setOnClickListener(new ViewOnClickListenerC3830d(this));
        this.f23379N0 = (Button) inflate.findViewById(2131427627);
        TextView textView = this.f23375L0;
        if (textView != null) {
            textView.setText(i11 + "-" + str2);
        }
        Button button = this.f23377M0;
        if (button != null) {
            button.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3838l(this, button));
        }
        Button button2 = this.f23379N0;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3838l(this, button2));
        }
        ImageView imageView2 = this.f23373K0;
        if (imageView2 != null) {
            imageView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3838l(this, imageView2));
        }
        this.f23377M0.requestFocus();
        this.f23377M0.setOnClickListener(new ViewOnClickListenerC3831e(this, arrayList, i12, str4, nSTIJKPlayerVODActivity, i10, str, str3, i11));
        this.f23379N0.setOnClickListener(new ViewOnClickListenerC3832f(this, i10, str, name, str3, i12, i11, arrayList));
        aVar.setView(inflate);
        this.f23381O0 = aVar.create();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(this.f23381O0.getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -2;
        this.f23381O0.show();
        this.f23381O0.getWindow().setAttributes(layoutParams);
        this.f23381O0.setCancelable(false);
        this.f23381O0.show();
    }

    /* renamed from: g1 */
    public final void m18680g1(ArrayList<LiveStreamsDBModel> arrayList, int i10) {
        String valueOf;
        NSTIJKPlayerVOD nSTIJKPlayerVOD;
        boolean z10;
        ArrayList<LiveStreamsDBModel> arrayList2;
        String str;
        int i11;
        int i12;
        String str2;
        String str3;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        int m18669T0 = m18669T0(arrayList, i10);
        String name = arrayList.get(m18669T0).getName();
        String m14805L = arrayList.get(m18669T0).m14805L();
        String m26247n0 = C5255e.m26247n0(C8470a.m36394a() + C8470a.m36395b());
        String m14812S = arrayList.get(m18669T0).m14812S();
        int m26214Q = C5255e.m26214Q(arrayList.get(m18669T0).m14811R());
        String m14846x = arrayList.get(m18669T0).m14846x();
        C7920a.m34301l().m34315u(m18669T0);
        if (this.f23401Y0.equals("movies")) {
            this.f23367H0 = arrayList.get(m18669T0).m14816W();
            SharedPreferences.Editor editor = this.f23396W;
            if (editor != null) {
                editor.putString("currentlyPlayingVideo", String.valueOf(this.f23384Q.get(m18669T0).m14811R()));
                this.f23396W.apply();
            }
        }
        SharedPreferences.Editor editor2 = this.f23398X;
        if (editor2 != null) {
            editor2.putString("currentlyPlayingVideoPosition", String.valueOf(m18669T0));
            this.f23398X.apply();
        }
        SimpleDateFormat simpleDateFormat = this.f23442s;
        if (m18656Q0(simpleDateFormat, simpleDateFormat.format(new Date(C7709e.m33680a(this.f23409e))), this.f23352A.format(this.f23452x)) >= C7707c.m33667p() && (str2 = this.f23447u0) != null && this.f23371J0 != null && (!f23351n1.equals(str2) || (this.f23447u0 != null && (str3 = this.f23371J0) != null && !f23348k1.equals(str3)))) {
            this.f23383P0 = Boolean.FALSE;
            this.f23407d.m37067a(2131427519).m37070d();
            this.f23407d.m37067a(2131427523).m37068b(m26247n0 + this.f23421i0 + this.f23437p0);
        }
        this.f23394V = m26214Q;
        int m26215R = C5255e.m26215R(m14805L);
        this.f23385Q0.setTitle(m26215R + " - " + name);
        this.f23407d.m37067a(2131427528).m37068b(m26215R + " - " + name);
        if (this.f23385Q0.getFullScreenValue().booleanValue()) {
            this.f23388S = this.f23385Q0.getFullScreenValue().booleanValue();
        } else {
            this.f23388S = false;
        }
        this.f23385Q0.m19628B1();
        NSTIJKPlayerVOD nSTIJKPlayerVOD2 = this.f23385Q0;
        nSTIJKPlayerVOD2.f24742J = 0;
        nSTIJKPlayerVOD2.f24748L = false;
        nSTIJKPlayerVOD2.f24746K0 = true;
        int m18692r1 = this.f23365G0.equals("m3u") ? m18692r1(String.valueOf(Uri.parse(this.f23367H0)), SharepreferenceDBHandler.m15337A(this.f23409e)) : m18691q1(m26214Q, SharepreferenceDBHandler.m15337A(this.f23409e));
        this.f23387R0 = this.f23409e.getSharedPreferences("loginPrefs", 0);
        if (!f23349l1) {
            m18692r1 = 0;
        }
        if (m18692r1 == 0) {
            if (this.f23383P0.booleanValue()) {
                m18686m1();
                if (this.f23365G0.equals("m3u")) {
                    nSTIJKPlayerVOD = this.f23385Q0;
                    valueOf = this.f23367H0;
                    z10 = this.f23388S;
                    i11 = 0;
                    arrayList2 = null;
                    i12 = 0;
                    m26215R = 0;
                    str = this.f23365G0;
                    m14812S = "";
                } else {
                    valueOf = String.valueOf(Uri.parse(this.f23411f + m26214Q + InstructionFileId.DOT + m14846x));
                    nSTIJKPlayerVOD = this.f23385Q0;
                    z10 = this.f23388S;
                    arrayList2 = this.f23386R;
                    str = this.f23365G0;
                    i11 = m26214Q;
                    i12 = m18669T0;
                }
                nSTIJKPlayerVOD.m19635I1(valueOf, z10, name, 0L, i11, m14812S, arrayList2, i12, m26215R, str, "nst");
                C7920a.m34301l().m34303B(m26214Q);
                C7920a.m34301l().m34313r(arrayList);
                C7920a.m34301l().m34315u(m18669T0);
                NSTIJKPlayerVOD nSTIJKPlayerVOD3 = this.f23385Q0;
                if (nSTIJKPlayerVOD3 != null) {
                    nSTIJKPlayerVOD3.f24742J = 0;
                    nSTIJKPlayerVOD3.f24748L = false;
                    nSTIJKPlayerVOD3.f24768U0 = true;
                    nSTIJKPlayerVOD3.f24719B0 = false;
                    nSTIJKPlayerVOD3.start();
                }
                m18674a1();
            }
        } else if (m18692r1 > 0) {
            if (!isFinishing() && this.f23383P0.booleanValue()) {
                this.f23359D0 = getSharedPreferences("currentSeekTime", 0);
                m18674a1();
                m18679f1(this, m26214Q, m14846x, name, m26215R, m14812S, arrayList, m18669T0, this.f23367H0);
            }
            NSTIJKPlayerVOD nSTIJKPlayerVOD4 = this.f23385Q0;
            if (nSTIJKPlayerVOD4 != null) {
                nSTIJKPlayerVOD4.f24742J = 0;
                nSTIJKPlayerVOD4.f24748L = false;
                nSTIJKPlayerVOD4.f24768U0 = true;
                nSTIJKPlayerVOD4.f24719B0 = false;
                nSTIJKPlayerVOD4.start();
            }
        }
        m18674a1();
    }

    /* renamed from: h1 */
    public final void m18681h1(ArrayList<File> arrayList, int i10) {
        String str;
        String str2;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        String name = arrayList.get(i10).getName();
        String m26247n0 = C5255e.m26247n0(C7711g.m33686a() + C7711g.m33687i());
        SimpleDateFormat simpleDateFormat = this.f23442s;
        if (m18656Q0(simpleDateFormat, simpleDateFormat.format(new Date(C7709e.m33680a(this.f23409e))), this.f23352A.format(this.f23452x)) >= C7707c.m33667p() && (str = this.f23447u0) != null && this.f23371J0 != null && (!f23351n1.equals(str) || (this.f23447u0 != null && (str2 = this.f23371J0) != null && !f23348k1.equals(str2)))) {
            this.f23383P0 = Boolean.FALSE;
            this.f23407d.m37067a(2131427519).m37070d();
            this.f23407d.m37067a(2131427523).m37068b(m26247n0 + this.f23421i0 + this.f23437p0);
        }
        if (this.f23383P0.booleanValue()) {
            C7920a.m34301l().m34315u(i10);
            this.f23385Q0.setTitle(name);
            if (this.f23385Q0.getFullScreenValue().booleanValue()) {
                this.f23388S = this.f23385Q0.getFullScreenValue().booleanValue();
            } else {
                this.f23388S = false;
            }
            this.f23385Q0.m19628B1();
            m18686m1();
            this.f23385Q0.m19635I1(this.f23411f, this.f23388S, name, 0L, 0, "", null, 0, 0, this.f23365G0, "nst");
            NSTIJKPlayerVOD nSTIJKPlayerVOD = this.f23385Q0;
            if (nSTIJKPlayerVOD != null) {
                nSTIJKPlayerVOD.f24742J = 0;
                nSTIJKPlayerVOD.f24748L = false;
                nSTIJKPlayerVOD.f24768U0 = true;
                nSTIJKPlayerVOD.f24719B0 = false;
                nSTIJKPlayerVOD.start();
            }
        }
        m18674a1();
    }

    /* renamed from: i1 */
    public final void m18682i1(List<GetEpisdoeDetailsCallback> list, int i10) {
        long j10;
        String str;
        String str2;
        SharedPreferences.Editor editor;
        if (list == null || list.size() <= 0) {
            return;
        }
        int m18670V0 = m18670V0(list, i10);
        String m14969u = list.get(m18670V0).m14969u();
        String m26247n0 = C5255e.m26247n0(C7711g.m33686a() + C7711g.m33687i());
        String m14958j = list.get(m18670V0).m14958j();
        int m26214Q = C5255e.m26214Q(list.get(m18670V0).m14958j());
        String m14951c = list.get(m18670V0).m14951c();
        list.get(m18670V0).m14950b();
        this.f23422i1 = list.get(m18670V0).m14958j();
        C7920a.m34301l().m34315u(m18670V0);
        int m27657h = this.f23425j1.m27657h(this.f23422i1, SharepreferenceDBHandler.m15337A(this.f23409e));
        SharedPreferences.Editor editor2 = this.f23396W;
        if (editor2 != null) {
            editor2.putString("currentlyPlayingVideo", String.valueOf(list.get(m18670V0).m14958j()));
            this.f23396W.apply();
        }
        if (this.f23401Y0.equals("series") && (editor = this.f23396W) != null) {
            editor.putString("currentlyPlayingVideo", String.valueOf(this.f23399X0.get(m18670V0).m14958j()));
            this.f23396W.apply();
        }
        SharedPreferences.Editor editor3 = this.f23398X;
        if (editor3 != null) {
            editor3.putString("currentlyPlayingVideoPosition", String.valueOf(m18670V0));
            this.f23398X.apply();
        }
        SimpleDateFormat simpleDateFormat = this.f23442s;
        if (m18656Q0(simpleDateFormat, simpleDateFormat.format(new Date(C7709e.m33680a(this.f23409e))), this.f23352A.format(this.f23452x)) >= C7707c.m33667p() && (str = this.f23447u0) != null && this.f23371J0 != null && (!f23351n1.equals(str) || (this.f23447u0 != null && (str2 = this.f23371J0) != null && !f23348k1.equals(str2)))) {
            this.f23383P0 = Boolean.FALSE;
            this.f23407d.m37067a(2131427519).m37070d();
            this.f23407d.m37067a(2131427523).m37068b(m26247n0 + this.f23421i0 + this.f23437p0);
        }
        this.f23394V = m26214Q;
        this.f23385Q0.setTitle(m14958j + " - " + m14969u);
        if (m27657h == 0 && this.f23383P0.booleanValue()) {
            m18686m1();
            EpisodesUsingSinglton.m14753c().m14758f(list);
            if (this.f23365G0.equals("m3u")) {
                C7920a.m34301l().m34312p("m3u");
                this.f23385Q0.m19635I1(this.f23367H0, this.f23388S, m14969u, 0L, 0, "", null, m18670V0, 0, this.f23365G0, "nst");
            } else {
                this.f23385Q0.m19635I1(String.valueOf(Uri.parse(this.f23411f + m26214Q + InstructionFileId.DOT + m14951c)), this.f23388S, m14969u, 0L, m26214Q, "", this.f23386R, m18670V0, this.f23449v0, this.f23365G0, "nst");
            }
            EpisodesUsingSinglton.m14753c().m14758f(list);
            C7920a.m34301l().m34316w(this.f23422i1);
            C7920a.m34301l().m34303B(m26214Q);
            C7920a.m34301l().m34314s(list);
            NSTIJKPlayerVOD nSTIJKPlayerVOD = this.f23385Q0;
            nSTIJKPlayerVOD.f24742J = 0;
            nSTIJKPlayerVOD.f24748L = false;
            nSTIJKPlayerVOD.f24768U0 = true;
            nSTIJKPlayerVOD.f24719B0 = false;
            nSTIJKPlayerVOD.start();
        }
        if (m27657h > 0) {
            if (this.f23425j1.m27650a(this.f23422i1) > 0) {
                m18674a1();
                try {
                    j10 = new SeriesRecentWatchDatabase(this.f23409e).m15319A0(this.f23422i1).longValue();
                } catch (Exception e10) {
                    j10 = 0;
                }
                if (this.f23385Q0 != null && this.f23383P0.booleanValue()) {
                    m18686m1();
                    this.f23385Q0.m19635I1(String.valueOf(Uri.parse(this.f23411f + this.f23422i1 + InstructionFileId.DOT + m14951c)), this.f23388S, m14969u, 0L, m26214Q, "", this.f23386R, m18670V0, 0, this.f23365G0, "nst");
                    C7920a.m34301l().m34312p("api");
                    EpisodesUsingSinglton.m14753c().m14758f(list);
                    C7920a.m34301l().m34316w(this.f23422i1);
                    C7920a.m34301l().m34304C(j10);
                    this.f23385Q0.setProgress(true);
                    this.f23385Q0.setCurrentPositionSeekbar((int) j10);
                    this.f23385Q0.start();
                }
            }
            NSTIJKPlayerVOD nSTIJKPlayerVOD2 = this.f23385Q0;
            if (nSTIJKPlayerVOD2 != null) {
                nSTIJKPlayerVOD2.f24742J = 0;
                nSTIJKPlayerVOD2.f24748L = false;
                nSTIJKPlayerVOD2.f24768U0 = true;
                nSTIJKPlayerVOD2.f24719B0 = false;
                nSTIJKPlayerVOD2.start();
            }
        }
        m18674a1();
    }

    /* renamed from: j1 */
    public final void m18683j1() {
        this.f23420i.setVisibility(8);
        this.f23417h.setVisibility(0);
        if (C5251a.f30048k.booleanValue()) {
            findViewById(2131429693).setVisibility(0);
        }
    }

    /* renamed from: k1 */
    public final void m18684k1() {
        this.f23417h.setVisibility(8);
        this.f23420i.setVisibility(0);
        if (C5251a.f30048k.booleanValue()) {
            findViewById(2131429693).setVisibility(0);
        }
    }

    /* renamed from: l1 */
    public final void m18685l1() {
        int m34307j;
        m34307j = C7920a.m34301l().m34307j();
        String str = this.f23401Y0;
        str.hashCode();
        switch (str) {
            case "movies":
                if (m34307j == 0) {
                    C7920a.m34301l().m34315u(this.f23384Q.size() - 1);
                    return;
                }
                break;
            case "series":
                if (m34307j == 0) {
                    C7920a.m34301l().m34315u(this.f23399X0.size() - 1);
                    return;
                }
                break;
            case "recording":
                if (m34307j == 0) {
                    C7920a.m34301l().m34315u(this.f23356C.size() - 1);
                    return;
                }
                break;
        }
        C7920a.m34301l().m34315u(m34307j - 1);
    }

    /* renamed from: m1 */
    public final void m18686m1() {
        try {
        } catch (Exception e10) {
            return;
        }
        if (this.f23385Q0 != null) {
            this.f23359D0 = this.f23409e.getSharedPreferences("currentSeekTime", 0);
            long currentPosition = this.f23385Q0.getCurrentPosition();
            SharedPreferences sharedPreferences = this.f23409e.getSharedPreferences("currentSeekTime", 0);
            this.f23359D0 = sharedPreferences;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            this.f23361E0 = edit;
            edit.putString("currentSeekTime", String.valueOf(currentPosition));
            this.f23361E0.apply();
            NSTIJKPlayerVOD nSTIJKPlayerVOD = this.f23385Q0;
            if (nSTIJKPlayerVOD != null && currentPosition != -1 && currentPosition != 0) {
                nSTIJKPlayerVOD.setCurrentPositionSeekbar(nSTIJKPlayerVOD.getCurrentPosition());
                this.f23385Q0.setProgress(true);
                this.f23385Q0.m19627A1(true);
            }
            if (this.f23401Y0.equals("movies")) {
                if (!this.f23365G0.equals("m3u") && this.f23385Q0 != null && C7920a.m34301l().m34311o() != -1 && currentPosition != -1 && currentPosition != 0) {
                    if (C7920a.m34301l().m34310n() == C7920a.m34301l().m34311o()) {
                        m18693s1(C7920a.m34301l().m34311o(), 0L);
                        C7920a.m34301l().m34302A(0);
                    } else {
                        m18693s1(C7920a.m34301l().m34311o(), currentPosition);
                    }
                }
            } else if (this.f23401Y0.equals("series") && ((this.f23385Q0 == null || C7920a.m34301l().m34305b() == null || !this.f23365G0.equals("m3u")) && C7920a.m34301l() != null && C7920a.m34301l().m34308k() != null && currentPosition != -1 && currentPosition != 0)) {
                if (C7920a.m34301l().m34310n() == Integer.parseInt(C7920a.m34301l().m34308k())) {
                    this.f23425j1.m27659j(C7920a.m34301l().m34308k(), 0L);
                    C7920a.m34301l().m34302A(0);
                } else {
                    this.f23425j1.m27659j(C7920a.m34301l().m34308k(), currentPosition);
                }
            }
            return;
        }
        NSTIJKPlayerVOD nSTIJKPlayerVOD2 = this.f23385Q0;
        if (nSTIJKPlayerVOD2 != null) {
            if (nSTIJKPlayerVOD2.m19672s1()) {
                this.f23385Q0.m19662i1();
            } else {
                this.f23385Q0.m19645S1();
                this.f23385Q0.m19678y1(true);
                this.f23385Q0.m19644R1();
            }
            IjkMediaPlayer.native_profileEnd();
        }
    }

    /* renamed from: n1 */
    public final void m18687n1() {
        this.f23427k0.postDelayed(new RunnableC3833g(this), 7000L);
    }

    /* renamed from: o1 */
    public void m18688o1() {
        findViewById(2131427532).setVisibility(0);
        findViewById(2131427785).setVisibility(0);
        findViewById(2131428499).setVisibility(0);
        if (C5251a.f30048k.booleanValue()) {
            findViewById(2131429693).setVisibility(0);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (findViewById(2131427532).getVisibility() == 0) {
            m18674a1();
            return;
        }
        String str = this.f23403Z0;
        if (str != null && !str.equals("")) {
            this.f23385Q0.m19645S1();
            this.f23385Q0.m19678y1(true);
            this.f23385Q0.m19644R1();
        }
        super.onBackPressed();
        overridePendingTransition(2130772003, 2130772000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x09a6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x09ea  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0ad3 A[Catch: Exception -> 0x0aee, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0aee, blocks: (B:63:0x0671, B:65:0x0684, B:72:0x06c7, B:82:0x0707, B:84:0x0710, B:86:0x0718, B:88:0x0726, B:90:0x0773, B:91:0x0779, B:92:0x0930, B:94:0x096f, B:96:0x0979, B:98:0x0996, B:105:0x09b7, B:115:0x09f7, B:117:0x0a16, B:119:0x0a38, B:120:0x0aca, B:122:0x0ad3, B:126:0x0a40, B:128:0x0a61, B:129:0x0a87, B:131:0x0aa6, B:133:0x09c6, B:137:0x09d5, B:141:0x0780, B:143:0x0789, B:145:0x0793, B:147:0x07a3, B:148:0x0856, B:150:0x085f, B:152:0x0867, B:154:0x0875, B:156:0x06d6, B:160:0x06e5), top: B:62:0x0671 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0a87 A[Catch: Exception -> 0x0aee, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0aee, blocks: (B:63:0x0671, B:65:0x0684, B:72:0x06c7, B:82:0x0707, B:84:0x0710, B:86:0x0718, B:88:0x0726, B:90:0x0773, B:91:0x0779, B:92:0x0930, B:94:0x096f, B:96:0x0979, B:98:0x0996, B:105:0x09b7, B:115:0x09f7, B:117:0x0a16, B:119:0x0a38, B:120:0x0aca, B:122:0x0ad3, B:126:0x0a40, B:128:0x0a61, B:129:0x0a87, B:131:0x0aa6, B:133:0x09c6, B:137:0x09d5, B:141:0x0780, B:143:0x0789, B:145:0x0793, B:147:0x07a3, B:148:0x0856, B:150:0x085f, B:152:0x0867, B:154:0x0875, B:156:0x06d6, B:160:0x06e5), top: B:62:0x0671 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x09d5 A[Catch: Exception -> 0x0aee, TRY_ENTER, TryCatch #3 {Exception -> 0x0aee, blocks: (B:63:0x0671, B:65:0x0684, B:72:0x06c7, B:82:0x0707, B:84:0x0710, B:86:0x0718, B:88:0x0726, B:90:0x0773, B:91:0x0779, B:92:0x0930, B:94:0x096f, B:96:0x0979, B:98:0x0996, B:105:0x09b7, B:115:0x09f7, B:117:0x0a16, B:119:0x0a38, B:120:0x0aca, B:122:0x0ad3, B:126:0x0a40, B:128:0x0a61, B:129:0x0a87, B:131:0x0aa6, B:133:0x09c6, B:137:0x09d5, B:141:0x0780, B:143:0x0789, B:145:0x0793, B:147:0x07a3, B:148:0x0856, B:150:0x085f, B:152:0x0867, B:154:0x0875, B:156:0x06d6, B:160:0x06e5), top: B:62:0x0671 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0856 A[Catch: Exception -> 0x0aee, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0aee, blocks: (B:63:0x0671, B:65:0x0684, B:72:0x06c7, B:82:0x0707, B:84:0x0710, B:86:0x0718, B:88:0x0726, B:90:0x0773, B:91:0x0779, B:92:0x0930, B:94:0x096f, B:96:0x0979, B:98:0x0996, B:105:0x09b7, B:115:0x09f7, B:117:0x0a16, B:119:0x0a38, B:120:0x0aca, B:122:0x0ad3, B:126:0x0a40, B:128:0x0a61, B:129:0x0a87, B:131:0x0aa6, B:133:0x09c6, B:137:0x09d5, B:141:0x0780, B:143:0x0789, B:145:0x0793, B:147:0x07a3, B:148:0x0856, B:150:0x085f, B:152:0x0867, B:154:0x0875, B:156:0x06d6, B:160:0x06e5), top: B:62:0x0671 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x096f A[Catch: Exception -> 0x0aee, TryCatch #3 {Exception -> 0x0aee, blocks: (B:63:0x0671, B:65:0x0684, B:72:0x06c7, B:82:0x0707, B:84:0x0710, B:86:0x0718, B:88:0x0726, B:90:0x0773, B:91:0x0779, B:92:0x0930, B:94:0x096f, B:96:0x0979, B:98:0x0996, B:105:0x09b7, B:115:0x09f7, B:117:0x0a16, B:119:0x0a38, B:120:0x0aca, B:122:0x0ad3, B:126:0x0a40, B:128:0x0a61, B:129:0x0a87, B:131:0x0aa6, B:133:0x09c6, B:137:0x09d5, B:141:0x0780, B:143:0x0789, B:145:0x0793, B:147:0x07a3, B:148:0x0856, B:150:0x085f, B:152:0x0867, B:154:0x0875, B:156:0x06d6, B:160:0x06e5), top: B:62:0x0671 }] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onClick(android.view.View r6) {
        /*
            Method dump skipped, instructions count: 3622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerVODActivity.onClick(android.view.View):void");
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f23409e = getApplicationContext();
        PlayerSelectedSinglton.m14897a().m14898b("vod");
        try {
            IjkMediaPlayer.loadLibrariesOnce(null);
            IjkMediaPlayer.native_profileBegin("libijkplayer.so");
        } catch (Exception | UnsatisfiedLinkError e10) {
        }
        this.f23401Y0 = getIntent().getStringExtra("type");
        Intent intent = getIntent();
        if ("android.intent.action.VIEW".equals(intent.getAction())) {
            intent.getData();
            intent.getType();
            this.f23403Z0 = intent.getDataString();
            setContentView(2131624458);
        }
        String str = this.f23401Y0;
        if (str != null && !str.equals("") && (this.f23401Y0.equals("devicedata") || this.f23401Y0.equals("loadurl"))) {
            setRequestedOrientation(new C6783a(this.f23409e).m31288z().equals(C5251a.f30065s0) ? 0 : 4);
        }
        String str2 = this.f23401Y0;
        if (str2 != null && !str2.equals("")) {
            if (this.f23401Y0.equals("devicedata") || this.f23401Y0.equals("loadurl")) {
                setContentView(2131624458);
            } else {
                setContentView(2131624456);
            }
        }
        m18675b1();
        C5255e.m26229c0(this.f23409e);
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onDestroy() {
        Button button;
        super.onDestroy();
        try {
            NSTIJKPlayerVOD nSTIJKPlayerVOD = this.f23385Q0;
            if (nSTIJKPlayerVOD != null && (button = nSTIJKPlayerVOD.f24829t1) != null) {
                button.performClick();
            }
        } catch (Exception e10) {
            Log.e("fsgd", "fdfh", e10);
        }
        try {
            m18686m1();
        } catch (Exception e11) {
        }
    }

    @Override // androidx.appcompat.app.ActivityC0243b, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        int i11;
        keyEvent.getRepeatCount();
        keyEvent.getAction();
        RelativeLayout relativeLayout = this.f23397W0;
        if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (i10 != 19) {
            if (i10 != 20) {
                if (i10 != 89) {
                    if (i10 != 90) {
                        if (i10 != 166) {
                            if (i10 != 167) {
                                if (i10 != 274) {
                                    if (i10 != 275) {
                                        return super.onKeyDown(i10, keyEvent);
                                    }
                                }
                            }
                        }
                    }
                    m18676c1();
                    i11 = 2131427951;
                    findViewById(i11).performClick();
                    return true;
                }
                m18676c1();
                i11 = 2131427973;
                findViewById(i11).performClick();
                return true;
            }
            String str = this.f23403Z0;
            if ((str != null && !str.equals("")) || this.f23401Y0.equals("devicedata") || this.f23401Y0.equals("ofd") || this.f23401Y0.equals("loadurl") || this.f23401Y0.equals("catch_up")) {
                return false;
            }
            m18676c1();
            i11 = 2131427969;
            findViewById(i11).performClick();
            return true;
        }
        String str2 = this.f23403Z0;
        if ((str2 != null && !str2.equals("")) || this.f23401Y0.equals("devicedata") || this.f23401Y0.equals("ofd") || this.f23401Y0.equals("loadurl") || this.f23401Y0.equals("catch_up")) {
            return false;
        }
        m18676c1();
        i11 = 2131427960;
        findViewById(i11).performClick();
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        View view;
        View view2;
        boolean z10 = keyEvent.getRepeatCount() == 0;
        RelativeLayout relativeLayout = this.f23397W0;
        if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
            return super.onKeyUp(i10, keyEvent);
        }
        if (i10 != 62) {
            if (i10 != 66) {
                if (i10 != 79 && i10 != 85) {
                    if (i10 != 86) {
                        if (i10 != 89) {
                            if (i10 != 90) {
                                if (i10 == 126) {
                                    if (!z10 || this.f23385Q0.isPlaying()) {
                                        return true;
                                    }
                                    m18676c1();
                                    this.f23385Q0.start();
                                    m18684k1();
                                    this.f23420i.requestFocus();
                                    return true;
                                }
                                if (i10 != 127) {
                                    if (i10 != 274) {
                                        if (i10 != 275) {
                                            switch (i10) {
                                                case 19:
                                                    if (this.f23401Y0.equals("devicedata") || this.f23401Y0.equals("ofd") || this.f23401Y0.equals("loadurl")) {
                                                    }
                                                    if (!this.f23401Y0.equals("devicedata") || this.f23401Y0.equals("ofd") || this.f23401Y0.equals("loadurl")) {
                                                    }
                                                    m18689p1();
                                                    m18687n1();
                                                    break;
                                                case 20:
                                                    if (!this.f23401Y0.equals("devicedata")) {
                                                        break;
                                                    }
                                                    break;
                                                case 21:
                                                    m18689p1();
                                                    m18687n1();
                                                    break;
                                                case 22:
                                                    m18689p1();
                                                    m18687n1();
                                                    break;
                                            }
                                            return super.onKeyUp(i10, keyEvent);
                                        }
                                    }
                                }
                            }
                            m18676c1();
                            findViewById(C10105q.f46338q).performClick();
                            return true;
                        }
                        m18676c1();
                        findViewById(C10105q.f46310K).performClick();
                        return true;
                    }
                    if (!z10 || !this.f23385Q0.isPlaying()) {
                        return true;
                    }
                    m18676c1();
                    this.f23385Q0.pause();
                    m18683j1();
                    this.f23417h.requestFocus();
                    return true;
                }
            }
            if (findViewById(2131427532).getVisibility() == 0) {
                m18674a1();
                return true;
            }
            m18676c1();
            if (this.f23385Q0.isPlaying()) {
                this.f23385Q0.m19638L1(DateTimeConstants.MILLIS_PER_HOUR);
                view2 = this.f23420i;
            } else {
                view2 = this.f23417h;
            }
            view2.requestFocus();
            return true;
        }
        if (!z10 || this.f23385Q0.isPlaying()) {
            m18676c1();
            this.f23385Q0.pause();
            m18683j1();
            view = this.f23417h;
        } else {
            m18676c1();
            this.f23385Q0.start();
            m18684k1();
            view = this.f23420i;
        }
        view.requestFocus();
        return true;
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        NSTIJKPlayerVOD nSTIJKPlayerVOD;
        super.onPause();
        String action = getIntent().getAction();
        if (C4401z0.f26679a <= 23) {
            m18686m1();
        }
        if (!"android.intent.action.VIEW".equals(action) || (nSTIJKPlayerVOD = this.f23385Q0) == null) {
            return;
        }
        if (nSTIJKPlayerVOD.m19672s1()) {
            this.f23385Q0.m19662i1();
        } else {
            this.f23385Q0.pause();
        }
        IjkMediaPlayer.native_profileEnd();
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        C5255e.m26233f(this.f23409e);
        NSTIJKPlayerVOD nSTIJKPlayerVOD = this.f23385Q0;
        if (nSTIJKPlayerVOD != null) {
            nSTIJKPlayerVOD.m19667n1();
            if (this.f23414g) {
                f23349l1 = false;
                this.f23414g = false;
                ArrayList<LiveStreamsDBModel> arrayList = this.f23384Q;
                if (arrayList == null || arrayList.size() == 0) {
                    m18678e1();
                } else {
                    m18680g1(this.f23384Q, this.f23449v0);
                }
            }
            m18668R0();
        }
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onStop() {
        Button button;
        super.onStop();
        try {
            NSTIJKPlayerVOD nSTIJKPlayerVOD = this.f23385Q0;
            if (nSTIJKPlayerVOD != null && (button = nSTIJKPlayerVOD.f24829t1) != null) {
                button.performClick();
                this.f23414g = false;
            }
        } catch (Exception e10) {
            Log.e("fsgd", "fdfh", e10);
        }
        try {
            m18686m1();
        } catch (Exception e11) {
        }
    }

    /* renamed from: p1 */
    public final void m18689p1() {
        Handler handler = this.f23427k0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @SuppressLint({"ResourceType"})
    /* renamed from: q0 */
    public final void m18690q0(Context context) {
        if (this.f23385Q0 != null) {
            View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(2131624523, (RadioGroup) findViewById(2131429240));
            PopupWindow popupWindow = new PopupWindow(context);
            this.f23429l0 = popupWindow;
            popupWindow.setContentView(inflate);
            this.f23429l0.setWidth(-1);
            this.f23429l0.setHeight(-1);
            this.f23429l0.setFocusable(true);
            this.f23429l0.setOnDismissListener(new C3827a(this));
            RadioGroup radioGroup = (RadioGroup) inflate.findViewById(2131429240);
            RadioGroup radioGroup2 = (RadioGroup) inflate.findViewById(2131427552);
            RadioGroup radioGroup3 = (RadioGroup) inflate.findViewById(2131429668);
            this.f23412f0 = (TextView) inflate.findViewById(2131429537);
            this.f23415g0 = (TextView) inflate.findViewById(2131429542);
            this.f23418h0 = (TextView) inflate.findViewById(2131429544);
            Spinner spinner = (Spinner) inflate.findViewById(2131429239);
            this.f23391T0 = spinner;
            try {
                ArrayAdapter arrayAdapter = (ArrayAdapter) spinner.getAdapter();
                SharedPreferences sharedPreferences = context.getSharedPreferences("pref.using_sub_font_size", 0);
                this.f23393U0 = sharedPreferences;
                this.f23391T0.setSelection(arrayAdapter.getPosition(sharedPreferences.getString("pref.using_sub_font_size", C5251a.f30039f0)));
            } catch (Exception e10) {
            }
            Spinner spinner2 = this.f23391T0;
            if (spinner2 != null) {
                spinner2.setOnItemSelectedListener(new C3828b(this));
            }
            NSTIJKPlayerVOD nSTIJKPlayerVOD = this.f23385Q0;
            if (nSTIJKPlayerVOD != null) {
                nSTIJKPlayerVOD.m19642P1(radioGroup3, radioGroup2, radioGroup, this.f23429l0, this.f23418h0, this.f23412f0, this.f23415g0);
            }
            this.f23429l0.showAtLocation(inflate, 1, 0, 0);
        }
    }

    /* renamed from: q1 */
    public final int m18691q1(int i10, int i11) {
        return this.f23369I0.m15303D0(String.valueOf(i10), i11);
    }

    /* renamed from: r1 */
    public final int m18692r1(String str, int i10) {
        return this.f23354B.m15231l2(str, i10);
    }

    /* renamed from: s1 */
    public final void m18693s1(int i10, long j10) {
        RecentWatchDBHandler recentWatchDBHandler = this.f23369I0;
        if (recentWatchDBHandler != null) {
            recentWatchDBHandler.m15306G0(String.valueOf(i10), "movie", false, j10);
        }
    }

    public void toggleView(View view) {
        if (view.getVisibility() == 8) {
            view.setVisibility(0);
        } else if (view.getVisibility() == 0) {
            view.setVisibility(8);
        }
    }
}

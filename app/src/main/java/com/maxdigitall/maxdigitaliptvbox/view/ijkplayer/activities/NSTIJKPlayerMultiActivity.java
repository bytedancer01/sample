package com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0243b;
import androidx.recyclerview.widget.C0704c;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamCategoryIdDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.PasswordStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.MultiPlayerCategoriesAdapter;
import com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.C4043b;
import com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.C4044c;
import com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti1;
import com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti2;
import com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti3;
import com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti4;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import nf.C6783a;
import org.apache.http.client.config.CookieSpecs;
import p059d9.C4392v;
import p151if.C5251a;
import p151if.C5255e;
import p324sf.InterfaceC8568g;
import pf.C7705a;
import pf.C7707c;
import pf.C7708d;
import pf.C7709e;
import pf.C7711g;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerMultiActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerMultiActivity.class */
public class NSTIJKPlayerMultiActivity extends ActivityC0243b implements InterfaceC8568g, View.OnClickListener, View.OnLongClickListener {

    /* renamed from: c1 */
    public static String f22620c1;

    /* renamed from: d1 */
    public static String f22621d1;

    /* renamed from: A */
    public LiveStreamDBHandler f22622A;

    /* renamed from: B */
    public String f22624B;

    /* renamed from: B0 */
    public ArrayList<LiveStreamCategoryIdDBModel> f22625B0;

    /* renamed from: C */
    public String f22626C;

    /* renamed from: C0 */
    public ArrayList<LiveStreamCategoryIdDBModel> f22627C0;

    /* renamed from: D */
    public TextView f22628D;

    /* renamed from: D0 */
    public ArrayList<PasswordStatusDBModel> f22629D0;

    /* renamed from: E */
    public String f22630E;

    /* renamed from: E0 */
    public ArrayList<LiveStreamCategoryIdDBModel> f22631E0;

    /* renamed from: F */
    public TextView f22632F;

    /* renamed from: G */
    public DateFormat f22634G;

    /* renamed from: G0 */
    public MultiPlayerCategoriesAdapter f22635G0;

    /* renamed from: H0 */
    public GridLayoutManager f22637H0;

    /* renamed from: I0 */
    public RecyclerView f22639I0;

    /* renamed from: J0 */
    public ProgressBar f22641J0;

    /* renamed from: K0 */
    public RelativeLayout f22643K0;

    /* renamed from: M0 */
    public AppBarLayout f22647M0;

    /* renamed from: N0 */
    public TextView f22649N0;

    /* renamed from: O0 */
    public ProgressBar f22651O0;

    /* renamed from: P0 */
    public ProgressBar f22653P0;

    /* renamed from: Q0 */
    public ProgressBar f22655Q0;

    /* renamed from: R0 */
    public ProgressBar f22657R0;

    /* renamed from: S0 */
    public ImageView f22659S0;

    /* renamed from: T */
    public SimpleDateFormat f22660T;

    /* renamed from: T0 */
    public ImageView f22661T0;

    /* renamed from: U */
    public NSTIJKPlayerMulti1 f22662U;

    /* renamed from: U0 */
    public ImageView f22663U0;

    /* renamed from: V */
    public NSTIJKPlayerMulti2 f22664V;

    /* renamed from: V0 */
    public ImageView f22665V0;

    /* renamed from: W */
    public NSTIJKPlayerMulti3 f22666W;

    /* renamed from: W0 */
    public ImageView f22667W0;

    /* renamed from: X */
    public NSTIJKPlayerMulti4 f22668X;

    /* renamed from: X0 */
    public ImageView f22669X0;

    /* renamed from: Y */
    public Date f22670Y;

    /* renamed from: Y0 */
    public Runnable f22671Y0;

    /* renamed from: Z0 */
    public Handler f22673Z0;

    /* renamed from: d */
    public Context f22676d;

    /* renamed from: e */
    public String f22677e;

    /* renamed from: f */
    public LinearLayout f22678f;

    /* renamed from: f0 */
    public String f22679f0;

    /* renamed from: g */
    public LinearLayout f22680g;

    /* renamed from: g0 */
    public String f22681g0;

    /* renamed from: h */
    public LinearLayout f22682h;

    /* renamed from: h0 */
    public SharedPreferences f22683h0;

    /* renamed from: i */
    public LinearLayout f22684i;

    /* renamed from: i0 */
    public C6783a f22685i0;

    /* renamed from: j */
    public TextView f22686j;

    /* renamed from: k */
    public TextView f22688k;

    /* renamed from: l */
    public TextView f22690l;

    /* renamed from: m */
    public TextView f22692m;

    /* renamed from: n */
    public LinearLayout f22694n;

    /* renamed from: o */
    public LinearLayout f22696o;

    /* renamed from: p */
    public LinearLayout f22698p;

    /* renamed from: q */
    public LinearLayout f22700q;

    /* renamed from: s */
    public String f22704s;

    /* renamed from: t */
    public String f22706t;

    /* renamed from: u */
    public String f22708u;

    /* renamed from: v */
    public String f22710v;

    /* renamed from: w */
    public String f22712w;

    /* renamed from: w0 */
    public PopupWindow f22713w0;

    /* renamed from: x */
    public String f22714x;

    /* renamed from: x0 */
    public PopupWindow f22715x0;

    /* renamed from: y */
    public String f22716y;

    /* renamed from: y0 */
    public ArrayList<LiveStreamCategoryIdDBModel> f22717y0;

    /* renamed from: z */
    public String f22718z;

    /* renamed from: z0 */
    public ArrayList<LiveStreamCategoryIdDBModel> f22719z0;

    /* renamed from: r */
    public boolean f22702r = false;

    /* renamed from: H */
    public String f22636H = "";

    /* renamed from: I */
    public String f22638I = "";

    /* renamed from: J */
    public String f22640J = "";

    /* renamed from: K */
    public String f22642K = "";

    /* renamed from: L */
    public int f22644L = 0;

    /* renamed from: M */
    public int f22646M = 0;

    /* renamed from: N */
    public int f22648N = 0;

    /* renamed from: O */
    public int f22650O = 0;

    /* renamed from: P */
    public String f22652P = "";

    /* renamed from: Q */
    public String f22654Q = "";

    /* renamed from: R */
    public String f22656R = "";

    /* renamed from: S */
    public String f22658S = "";

    /* renamed from: Z */
    public Boolean f22672Z = Boolean.TRUE;

    /* renamed from: j0 */
    public int f22687j0 = 0;

    /* renamed from: k0 */
    public String f22689k0 = "";

    /* renamed from: l0 */
    public String f22691l0 = "";

    /* renamed from: m0 */
    public String f22693m0 = "";

    /* renamed from: n0 */
    public String f22695n0 = "";

    /* renamed from: o0 */
    public String f22697o0 = "";

    /* renamed from: p0 */
    public String f22699p0 = "";

    /* renamed from: q0 */
    public String f22701q0 = "";

    /* renamed from: r0 */
    public String f22703r0 = "";

    /* renamed from: s0 */
    public String f22705s0 = "";

    /* renamed from: t0 */
    public String f22707t0 = "";

    /* renamed from: u0 */
    public String f22709u0 = "";

    /* renamed from: v0 */
    public String f22711v0 = "";

    /* renamed from: A0 */
    public ArrayList<String> f22623A0 = new ArrayList<>();

    /* renamed from: F0 */
    public int f22633F0 = 0;

    /* renamed from: L0 */
    public AsyncTask f22645L0 = null;

    /* renamed from: a1 */
    public View f22674a1 = null;

    /* renamed from: b1 */
    public final boolean[] f22675b1 = {false};

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerMultiActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerMultiActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerMultiActivity$a.class */
    public class C3752a implements PopupWindow.OnDismissListener {

        /* renamed from: b */
        public final NSTIJKPlayerMultiActivity f22720b;

        public C3752a(NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity) {
            this.f22720b = nSTIJKPlayerMultiActivity;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerMultiActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerMultiActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerMultiActivity$b.class */
    public class RunnableC3753b implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerMultiActivity f22721b;

        public RunnableC3753b(NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity) {
            this.f22721b = nSTIJKPlayerMultiActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity = this.f22721b;
            nSTIJKPlayerMultiActivity.m18319Z0(nSTIJKPlayerMultiActivity.f22676d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerMultiActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerMultiActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerMultiActivity$c.class */
    public class RunnableC3754c implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerMultiActivity f22722b;

        public RunnableC3754c(NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity) {
            this.f22722b = nSTIJKPlayerMultiActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f22722b.f22715x0 == null) {
                NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity = this.f22722b;
                nSTIJKPlayerMultiActivity.f22675b1[0] = false;
                nSTIJKPlayerMultiActivity.f22673Z0.postDelayed(nSTIJKPlayerMultiActivity.f22671Y0, 100L);
            } else if (this.f22722b.f22715x0.isShowing()) {
                NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity2 = this.f22722b;
                nSTIJKPlayerMultiActivity2.f22675b1[0] = true;
                nSTIJKPlayerMultiActivity2.f22673Z0.removeCallbacks(nSTIJKPlayerMultiActivity2.f22671Y0);
            } else {
                NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity3 = this.f22722b;
                nSTIJKPlayerMultiActivity3.m18319Z0(nSTIJKPlayerMultiActivity3.f22676d);
            }
            NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity4 = this.f22722b;
            if (nSTIJKPlayerMultiActivity4.f22675b1[0]) {
                return;
            }
            nSTIJKPlayerMultiActivity4.f22673Z0.postDelayed(nSTIJKPlayerMultiActivity4.f22671Y0, 100L);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerMultiActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerMultiActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerMultiActivity$d.class */
    public class ViewOnClickListenerC3755d implements View.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerMultiActivity f22723b;

        public ViewOnClickListenerC3755d(NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity) {
            this.f22723b = nSTIJKPlayerMultiActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f22723b.f22681g0 = CookieSpecs.DEFAULT;
            this.f22723b.m18320a1();
            this.f22723b.f22715x0.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerMultiActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerMultiActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerMultiActivity$e.class */
    public class ViewOnClickListenerC3756e implements View.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerMultiActivity f22724b;

        public ViewOnClickListenerC3756e(NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity) {
            this.f22724b = nSTIJKPlayerMultiActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f22724b.f22681g0 = "screen1";
            this.f22724b.m18320a1();
            this.f22724b.f22715x0.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerMultiActivity$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerMultiActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerMultiActivity$f.class */
    public class ViewOnClickListenerC3757f implements View.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerMultiActivity f22725b;

        public ViewOnClickListenerC3757f(NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity) {
            this.f22725b = nSTIJKPlayerMultiActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f22725b.f22681g0 = "screen2";
            this.f22725b.m18320a1();
            this.f22725b.f22715x0.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerMultiActivity$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerMultiActivity$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerMultiActivity$g.class */
    public class ViewOnClickListenerC3758g implements View.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerMultiActivity f22726b;

        public ViewOnClickListenerC3758g(NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity) {
            this.f22726b = nSTIJKPlayerMultiActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f22726b.f22681g0 = "screen3";
            this.f22726b.m18320a1();
            this.f22726b.f22715x0.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerMultiActivity$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerMultiActivity$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerMultiActivity$h.class */
    public class ViewOnClickListenerC3759h implements View.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerMultiActivity f22727b;

        public ViewOnClickListenerC3759h(NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity) {
            this.f22727b = nSTIJKPlayerMultiActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f22727b.f22681g0 = "screen4";
            this.f22727b.m18320a1();
            this.f22727b.f22715x0.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerMultiActivity$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerMultiActivity$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerMultiActivity$i.class */
    public class ViewOnClickListenerC3760i implements View.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerMultiActivity f22728b;

        public ViewOnClickListenerC3760i(NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity) {
            this.f22728b = nSTIJKPlayerMultiActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f22728b.f22681g0 = "screen5";
            this.f22728b.m18320a1();
            this.f22728b.f22715x0.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerMultiActivity$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerMultiActivity$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerMultiActivity$j.class */
    public class C3761j implements PopupMenu.OnMenuItemClickListener {

        /* renamed from: a */
        public final int f22729a;

        /* renamed from: b */
        public final NSTIJKPlayerMultiActivity f22730b;

        public C3761j(NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity, int i10) {
            this.f22730b = nSTIJKPlayerMultiActivity;
            this.f22729a = i10;
        }

        @Override // android.widget.PopupMenu.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            int itemId = menuItem.getItemId();
            if (itemId == 2131428759) {
                NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity = this.f22730b;
                nSTIJKPlayerMultiActivity.m18303G0(nSTIJKPlayerMultiActivity.f22676d);
                return false;
            }
            if (itemId != 2131428774) {
                return false;
            }
            this.f22730b.m18316W0(this.f22729a);
            this.f22730b.m18307M0(this.f22729a);
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerMultiActivity$k.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerMultiActivity$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerMultiActivity$k.class */
    public class AsyncTaskC3762k extends AsyncTask<String, Void, Boolean> {

        /* renamed from: a */
        public final NSTIJKPlayerMultiActivity f22731a;

        public AsyncTaskC3762k(NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity) {
            this.f22731a = nSTIJKPlayerMultiActivity;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return Boolean.valueOf(this.f22731a.m18309O0());
            } catch (Exception e10) {
                return Boolean.FALSE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity;
            GridLayoutManager gridLayoutManager;
            View view;
            NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity2;
            GridLayoutManager gridLayoutManager2;
            super.onPostExecute(bool);
            int i10 = 8;
            if (SharepreferenceDBHandler.m15373f(this.f22731a.f22676d).equals("m3u")) {
                if (this.f22731a.f22717y0 == null || this.f22731a.f22633F0 == 0) {
                    ProgressBar progressBar = this.f22731a.f22641J0;
                    if (progressBar == null) {
                        return;
                    }
                    progressBar.setVisibility(8);
                    view = this.f22731a.f22643K0;
                    i10 = 0;
                } else {
                    NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity3 = this.f22731a;
                    ArrayList arrayList = this.f22731a.f22717y0;
                    NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity4 = this.f22731a;
                    Context context = nSTIJKPlayerMultiActivity4.f22676d;
                    nSTIJKPlayerMultiActivity3.f22635G0 = new MultiPlayerCategoriesAdapter(arrayList, context, (InterfaceC8568g) context, nSTIJKPlayerMultiActivity4.f22713w0, this.f22731a.f22687j0);
                    if (new C6783a(this.f22731a.f22676d).m31288z().equals(C5251a.f30065s0)) {
                        nSTIJKPlayerMultiActivity2 = this.f22731a;
                        gridLayoutManager2 = new GridLayoutManager(nSTIJKPlayerMultiActivity2.f22676d, 2);
                    } else {
                        nSTIJKPlayerMultiActivity2 = this.f22731a;
                        gridLayoutManager2 = new GridLayoutManager(nSTIJKPlayerMultiActivity2.f22676d, 2);
                    }
                    nSTIJKPlayerMultiActivity2.f22637H0 = gridLayoutManager2;
                    NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity5 = this.f22731a;
                    nSTIJKPlayerMultiActivity5.f22639I0.setLayoutManager(nSTIJKPlayerMultiActivity5.f22637H0);
                    this.f22731a.f22639I0.setItemAnimator(new C0704c());
                    NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity6 = this.f22731a;
                    nSTIJKPlayerMultiActivity6.f22639I0.setAdapter(nSTIJKPlayerMultiActivity6.f22635G0);
                    view = this.f22731a.f22641J0;
                    if (view == null) {
                        return;
                    }
                }
            } else {
                if (this.f22731a.f22717y0 == null) {
                    return;
                }
                NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity7 = this.f22731a;
                ArrayList arrayList2 = this.f22731a.f22717y0;
                NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity8 = this.f22731a;
                Context context2 = nSTIJKPlayerMultiActivity8.f22676d;
                nSTIJKPlayerMultiActivity7.f22635G0 = new MultiPlayerCategoriesAdapter(arrayList2, context2, (InterfaceC8568g) context2, nSTIJKPlayerMultiActivity8.f22713w0, this.f22731a.f22687j0);
                if (new C6783a(this.f22731a.f22676d).m31288z().equals(C5251a.f30065s0)) {
                    nSTIJKPlayerMultiActivity = this.f22731a;
                    gridLayoutManager = new GridLayoutManager(nSTIJKPlayerMultiActivity.f22676d, 2);
                } else {
                    nSTIJKPlayerMultiActivity = this.f22731a;
                    gridLayoutManager = new GridLayoutManager(nSTIJKPlayerMultiActivity.f22676d, 2);
                }
                nSTIJKPlayerMultiActivity.f22637H0 = gridLayoutManager;
                NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity9 = this.f22731a;
                nSTIJKPlayerMultiActivity9.f22639I0.setLayoutManager(nSTIJKPlayerMultiActivity9.f22637H0);
                this.f22731a.f22639I0.setItemAnimator(new C0704c());
                NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity10 = this.f22731a;
                nSTIJKPlayerMultiActivity10.f22639I0.setAdapter(nSTIJKPlayerMultiActivity10.f22635G0);
                view = this.f22731a.f22641J0;
                if (view == null) {
                    return;
                }
            }
            view.setVisibility(i10);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* renamed from: H0 */
    public static long m18291H0(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0L;
        }
    }

    /* renamed from: J0 */
    public static String m18292J0(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    /* renamed from: F0 */
    public final boolean m18302F0() {
        String str;
        String str2;
        SimpleDateFormat simpleDateFormat = this.f22660T;
        if (m18291H0(simpleDateFormat, simpleDateFormat.format(new Date(C7709e.m33680a(this.f22676d))), this.f22634G.format(this.f22670Y)) >= C7707c.m33667p() && (str = this.f22626C) != null && this.f22624B != null && (!f22620c1.equals(str) || (this.f22626C != null && (str2 = this.f22624B) != null && !f22621d1.equals(str2)))) {
            this.f22672Z = Boolean.FALSE;
        }
        return this.f22672Z.booleanValue();
    }

    @SuppressLint({"ResourceType"})
    /* renamed from: G0 */
    public final void m18303G0(Context context) {
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(2131624123, (LinearLayout) findViewById(2131428492));
        this.f22641J0 = (ProgressBar) inflate.findViewById(2131428830);
        this.f22639I0 = (RecyclerView) inflate.findViewById(2131428747);
        this.f22643K0 = (RelativeLayout) inflate.findViewById(2131429021);
        this.f22647M0 = (AppBarLayout) inflate.findViewById(2131427548);
        TextView textView = (TextView) inflate.findViewById(2131429607);
        this.f22649N0 = textView;
        textView.setText(context.getResources().getString(2132017450));
        PopupWindow popupWindow = new PopupWindow(context);
        this.f22713w0 = popupWindow;
        popupWindow.setContentView(inflate);
        this.f22713w0.setWidth(-1);
        this.f22713w0.setHeight(-1);
        this.f22713w0.setFocusable(true);
        this.f22713w0.setOnDismissListener(new C3752a(this));
        ProgressBar progressBar = this.f22641J0;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        AppBarLayout appBarLayout = this.f22647M0;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(2131100143));
        }
        this.f22645L0 = new AsyncTaskC3762k(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        this.f22713w0.showAtLocation(inflate, 1, 0, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006a, code lost:
    
        if (r10.f22662U.getVisibility() != 0) goto L11;
     */
    /* renamed from: I0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m18304I0(int r11) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerMultiActivity.m18304I0(int):void");
    }

    /* renamed from: K0 */
    public final ArrayList<String> m18305K0() {
        ArrayList<PasswordStatusDBModel> m15232m1 = this.f22622A.m15232m1(SharepreferenceDBHandler.m15337A(this.f22676d));
        this.f22629D0 = m15232m1;
        if (m15232m1 != null) {
            Iterator<PasswordStatusDBModel> it = m15232m1.iterator();
            while (it.hasNext()) {
                PasswordStatusDBModel next = it.next();
                if (next.m15290a().equals("1")) {
                    this.f22623A0.add(next.m15291b());
                }
            }
        }
        return this.f22623A0;
    }

    /* renamed from: L0 */
    public final ArrayList<LiveStreamCategoryIdDBModel> m18306L0(ArrayList<LiveStreamCategoryIdDBModel> arrayList, ArrayList<String> arrayList2) {
        boolean z10;
        ArrayList<LiveStreamCategoryIdDBModel> arrayList3;
        if (arrayList == null) {
            return null;
        }
        Iterator<LiveStreamCategoryIdDBModel> it = arrayList.iterator();
        while (it.hasNext()) {
            LiveStreamCategoryIdDBModel next = it.next();
            if (arrayList2 != null) {
                Iterator<String> it2 = arrayList2.iterator();
                while (true) {
                    z10 = false;
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (next.m14787b().equals(it2.next())) {
                        z10 = true;
                        break;
                    }
                }
                if (!z10 && (arrayList3 = this.f22627C0) != null) {
                    arrayList3.add(next);
                }
            }
        }
        return this.f22627C0;
    }

    /* renamed from: M0 */
    public final void m18307M0(int i10) {
        LinearLayout linearLayout;
        if (i10 == 1) {
            this.f22662U.setVisibility(8);
            linearLayout = this.f22678f;
        } else if (i10 == 2) {
            this.f22664V.setVisibility(8);
            linearLayout = this.f22680g;
        } else if (i10 == 3) {
            this.f22666W.setVisibility(8);
            linearLayout = this.f22682h;
        } else {
            if (i10 != 4) {
                return;
            }
            this.f22668X.setVisibility(8);
            linearLayout = this.f22684i;
        }
        linearLayout.setVisibility(8);
    }

    /* renamed from: N0 */
    public final void m18308N0() {
        this.f22717y0 = new ArrayList<>();
        this.f22719z0 = new ArrayList<>();
        this.f22625B0 = new ArrayList<>();
        this.f22627C0 = new ArrayList<>();
        this.f22629D0 = new ArrayList<>();
        this.f22631E0 = new ArrayList<>();
        this.f22683h0 = this.f22676d.getSharedPreferences("loginPrefs", 0);
        this.f22685i0 = new C6783a(this.f22676d);
        if (SharepreferenceDBHandler.m15373f(this.f22676d).equals("m3u")) {
            this.f22679f0 = "m3u";
        } else {
            this.f22679f0 = "api";
        }
        this.f22622A = new LiveStreamDBHandler(this);
        this.f22677e = C5255e.m26247n0(C4044c.m19709i() + C4044c.m19708h());
        this.f22662U = (NSTIJKPlayerMulti1) findViewById(2131429675);
        this.f22664V = (NSTIJKPlayerMulti2) findViewById(2131429676);
        this.f22666W = (NSTIJKPlayerMulti3) findViewById(2131429677);
        this.f22668X = (NSTIJKPlayerMulti4) findViewById(2131429678);
        this.f22662U.setLiveStreamDBHandler(this.f22622A);
        this.f22664V.setLiveStreamDBHandler(this.f22622A);
        this.f22666W.setLiveStreamDBHandler(this.f22622A);
        this.f22668X.setLiveStreamDBHandler(this.f22622A);
        NSTIJKPlayerMulti1 nSTIJKPlayerMulti1 = this.f22662U;
        nSTIJKPlayerMulti1.m19008W(this, nSTIJKPlayerMulti1);
        NSTIJKPlayerMulti2 nSTIJKPlayerMulti2 = this.f22664V;
        nSTIJKPlayerMulti2.m19069W(this, nSTIJKPlayerMulti2);
        NSTIJKPlayerMulti3 nSTIJKPlayerMulti3 = this.f22666W;
        nSTIJKPlayerMulti3.m19130W(this, nSTIJKPlayerMulti3);
        NSTIJKPlayerMulti4 nSTIJKPlayerMulti4 = this.f22668X;
        nSTIJKPlayerMulti4.m19191W(this, nSTIJKPlayerMulti4);
        this.f22694n = (LinearLayout) findViewById(2131427532);
        this.f22696o = (LinearLayout) findViewById(2131427533);
        this.f22698p = (LinearLayout) findViewById(2131427534);
        this.f22700q = (LinearLayout) findViewById(2131427535);
        this.f22624B = C5255e.m26247n0(C7708d.m33672d());
        this.f22670Y = new Date();
        this.f22628D = (TextView) findViewById(2131427816);
        this.f22632F = (TextView) findViewById(2131429309);
        this.f22678f = (LinearLayout) findViewById(2131427519);
        this.f22680g = (LinearLayout) findViewById(2131427520);
        this.f22682h = (LinearLayout) findViewById(2131427521);
        this.f22684i = (LinearLayout) findViewById(2131427522);
        this.f22686j = (TextView) findViewById(2131427523);
        this.f22688k = (TextView) findViewById(2131427524);
        this.f22690l = (TextView) findViewById(2131427525);
        this.f22692m = (TextView) findViewById(2131427526);
        this.f22651O0 = (ProgressBar) findViewById(2131427508);
        this.f22653P0 = (ProgressBar) findViewById(2131427509);
        this.f22655Q0 = (ProgressBar) findViewById(2131427510);
        this.f22657R0 = (ProgressBar) findViewById(2131427511);
        this.f22660T = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.US);
        try {
            IjkMediaPlayer.loadLibrariesOnce(null);
            IjkMediaPlayer.native_profileBegin("libijkplayer.so");
        } catch (Exception | UnsatisfiedLinkError e10) {
        }
        this.f22634G = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.US);
        findViewById(2131427470).setOnClickListener(this);
        findViewById(2131427470).setOnLongClickListener(this);
        findViewById(2131427471).setOnClickListener(this);
        findViewById(2131427471).setOnLongClickListener(this);
        findViewById(2131427472).setOnClickListener(this);
        findViewById(2131427472).setOnLongClickListener(this);
        findViewById(2131427473).setOnClickListener(this);
        findViewById(2131427473).setOnLongClickListener(this);
        this.f22626C = C5255e.m26247n0(C7705a.m33651a());
        f22620c1 = m18292J0(this.f22676d);
        f22621d1 = getApplicationContext().getPackageName();
        this.f22630E = C5255e.m26247n0(C4043b.m19702f() + C4043b.m19703h());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00cf, code lost:
    
        if (r11 != null) goto L20;
     */
    /* renamed from: O0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m18309O0() {
        /*
            Method dump skipped, instructions count: 999
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerMultiActivity.m18309O0():boolean");
    }

    /* renamed from: P0 */
    public void m18310P0(int i10) {
        if (i10 == 1) {
            this.f22662U.m19015d0();
            this.f22664V.m19064R();
        } else {
            if (i10 != 2) {
                if (i10 == 3) {
                    this.f22666W.m19137d0();
                    this.f22662U.m19003R();
                    this.f22664V.m19064R();
                    this.f22668X.m19186R();
                }
                if (i10 == 4) {
                    this.f22668X.m19198d0();
                    this.f22662U.m19003R();
                    this.f22664V.m19064R();
                    this.f22666W.m19125R();
                    return;
                }
                return;
            }
            this.f22664V.m19076d0();
            this.f22662U.m19003R();
        }
        this.f22666W.m19125R();
        this.f22668X.m19186R();
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: Q0 */
    public final void m18311Q0() {
        m18318Y0(1, true, true);
        if (!m18302F0()) {
            m18321b1(1);
            return;
        }
        ArrayList<LiveStreamsDBModel> m15157D1 = this.f22622A.m15157D1(this.f22652P, "live");
        if (m15157D1 != null && m15157D1.size() != 0) {
            this.f22689k0 = m15157D1.get(0).getName();
            this.f22704s = m15157D1.get(0).m14798E();
            this.f22712w = m15157D1.get(0).m14810Q();
            this.f22697o0 = m15157D1.get(0).m14827g();
            this.f22705s0 = m15157D1.get(0).m14816W();
            try {
                this.f22644L = Integer.parseInt(m15157D1.get(0).m14811R());
            } catch (NumberFormatException e10) {
                this.f22644L = -1;
            }
        }
        this.f22662U.m19007V();
        if (this.f22672Z.booleanValue()) {
            this.f22662U.m19010Y(Uri.parse(this.f22636H), true, this.f22689k0);
            NSTIJKPlayerMulti1 nSTIJKPlayerMulti1 = this.f22662U;
            nSTIJKPlayerMulti1.f23903A = 0;
            nSTIJKPlayerMulti1.f23905C = false;
            nSTIJKPlayerMulti1.start();
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: R0 */
    public void m18312R0() {
        m18318Y0(2, true, true);
        if (!m18302F0()) {
            m18321b1(2);
            return;
        }
        ArrayList<LiveStreamsDBModel> m15157D1 = this.f22622A.m15157D1(this.f22654Q, "live");
        if (m15157D1 != null && m15157D1.size() != 0) {
            this.f22691l0 = m15157D1.get(0).getName();
            this.f22706t = m15157D1.get(0).m14798E();
            this.f22714x = m15157D1.get(0).m14810Q();
            this.f22699p0 = m15157D1.get(0).m14827g();
            this.f22707t0 = m15157D1.get(0).m14816W();
            try {
                this.f22646M = Integer.parseInt(m15157D1.get(0).m14811R());
            } catch (NumberFormatException e10) {
                this.f22646M = -1;
            }
        }
        this.f22664V.m19068V();
        if (this.f22672Z.booleanValue()) {
            this.f22664V.m19071Y(Uri.parse(this.f22638I), true, this.f22691l0);
            NSTIJKPlayerMulti2 nSTIJKPlayerMulti2 = this.f22664V;
            nSTIJKPlayerMulti2.f23966A = 0;
            nSTIJKPlayerMulti2.f23968C = false;
            nSTIJKPlayerMulti2.start();
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: S0 */
    public void m18313S0() {
        m18318Y0(3, true, true);
        if (!m18302F0()) {
            m18321b1(3);
            return;
        }
        ArrayList<LiveStreamsDBModel> m15157D1 = this.f22622A.m15157D1(this.f22656R, "live");
        if (m15157D1 != null && m15157D1.size() != 0) {
            this.f22693m0 = m15157D1.get(0).getName();
            this.f22708u = m15157D1.get(0).m14798E();
            this.f22716y = m15157D1.get(0).m14810Q();
            this.f22701q0 = m15157D1.get(0).m14827g();
            this.f22709u0 = m15157D1.get(0).m14816W();
            try {
                this.f22648N = Integer.parseInt(m15157D1.get(0).m14811R());
            } catch (NumberFormatException e10) {
                this.f22648N = -1;
            }
        }
        this.f22666W.m19129V();
        if (this.f22672Z.booleanValue()) {
            this.f22666W.m19132Y(Uri.parse(this.f22640J), true, this.f22693m0);
            NSTIJKPlayerMulti3 nSTIJKPlayerMulti3 = this.f22666W;
            nSTIJKPlayerMulti3.f24029A = 0;
            nSTIJKPlayerMulti3.f24031C = false;
            nSTIJKPlayerMulti3.start();
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: T0 */
    public void m18314T0() {
        m18318Y0(4, true, true);
        if (!m18302F0()) {
            m18321b1(4);
            return;
        }
        ArrayList<LiveStreamsDBModel> m15157D1 = this.f22622A.m15157D1(this.f22658S, "live");
        if (m15157D1 != null && m15157D1.size() != 0) {
            this.f22695n0 = m15157D1.get(0).getName();
            this.f22710v = m15157D1.get(0).m14798E();
            this.f22718z = m15157D1.get(0).m14810Q();
            this.f22703r0 = m15157D1.get(0).m14827g();
            this.f22711v0 = m15157D1.get(0).m14816W();
            try {
                this.f22650O = Integer.parseInt(m15157D1.get(0).m14811R());
            } catch (NumberFormatException e10) {
                this.f22650O = -1;
            }
        }
        this.f22668X.m19190V();
        if (this.f22672Z.booleanValue()) {
            this.f22668X.m19193Y(Uri.parse(this.f22642K), true, this.f22695n0);
            NSTIJKPlayerMulti4 nSTIJKPlayerMulti4 = this.f22668X;
            nSTIJKPlayerMulti4.f24092A = 0;
            nSTIJKPlayerMulti4.f24094C = false;
            nSTIJKPlayerMulti4.start();
        }
    }

    /* renamed from: V0 */
    public final void m18315V0(int i10, View view) {
        if (this.f22676d != null) {
            this.f22687j0 = i10;
            PopupMenu popupMenu = new PopupMenu(this, view);
            popupMenu.getMenuInflater().inflate(2131689487, popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener(new C3761j(this, i10));
            popupMenu.show();
        }
    }

    /* renamed from: W0 */
    public void m18316W0(int i10) {
        NSTIJKPlayerMulti1 nSTIJKPlayerMulti1;
        NSTIJKPlayerMulti2 nSTIJKPlayerMulti2;
        NSTIJKPlayerMulti3 nSTIJKPlayerMulti3;
        NSTIJKPlayerMulti4 nSTIJKPlayerMulti4;
        NSTIJKPlayerMulti1 nSTIJKPlayerMulti12;
        NSTIJKPlayerMulti2 nSTIJKPlayerMulti22;
        NSTIJKPlayerMulti3 nSTIJKPlayerMulti32;
        NSTIJKPlayerMulti4 nSTIJKPlayerMulti42;
        Boolean bool = Boolean.FALSE;
        if (i10 == 0) {
            bool = Boolean.TRUE;
        }
        if ((bool.booleanValue() || i10 == 1) && (nSTIJKPlayerMulti1 = this.f22662U) != null) {
            nSTIJKPlayerMulti1.pause();
        }
        if ((bool.booleanValue() || i10 == 2) && (nSTIJKPlayerMulti2 = this.f22664V) != null) {
            nSTIJKPlayerMulti2.pause();
        }
        if ((bool.booleanValue() || i10 == 3) && (nSTIJKPlayerMulti3 = this.f22666W) != null) {
            nSTIJKPlayerMulti3.pause();
        }
        if ((bool.booleanValue() || i10 == 4) && (nSTIJKPlayerMulti4 = this.f22668X) != null) {
            nSTIJKPlayerMulti4.pause();
        }
        try {
            if ((bool.booleanValue() || i10 == 1) && (nSTIJKPlayerMulti12 = this.f22662U) != null) {
                if (nSTIJKPlayerMulti12.m19001P()) {
                    this.f22662U.m18995J();
                } else {
                    this.f22662U.m19014c0();
                    this.f22662U.m19005T(true);
                    this.f22662U.m19013b0();
                }
                IjkMediaPlayer.native_profileEnd();
                if (i10 == 1) {
                    this.f22636H = "";
                    this.f22662U.f23927c = null;
                    this.f22651O0.setVisibility(8);
                }
            }
            if ((bool.booleanValue() || i10 == 2) && (nSTIJKPlayerMulti22 = this.f22664V) != null) {
                if (nSTIJKPlayerMulti22.m19062P()) {
                    this.f22664V.m19056J();
                } else {
                    this.f22664V.m19075c0();
                    this.f22664V.m19066T(true);
                    this.f22664V.m19074b0();
                }
                IjkMediaPlayer.native_profileEnd();
                if (i10 == 2) {
                    this.f22638I = "";
                    this.f22664V.f23990c = null;
                    this.f22653P0.setVisibility(8);
                }
            }
            if ((bool.booleanValue() || i10 == 3) && (nSTIJKPlayerMulti32 = this.f22666W) != null) {
                if (nSTIJKPlayerMulti32.m19123P()) {
                    this.f22666W.m19117J();
                } else {
                    this.f22666W.m19136c0();
                    this.f22666W.m19127T(true);
                    this.f22666W.m19135b0();
                }
                IjkMediaPlayer.native_profileEnd();
                if (i10 == 3) {
                    this.f22640J = "";
                    this.f22666W.f24053c = null;
                    this.f22655Q0.setVisibility(8);
                }
            }
            if ((bool.booleanValue() || i10 == 4) && (nSTIJKPlayerMulti42 = this.f22668X) != null) {
                if (nSTIJKPlayerMulti42.m19184P()) {
                    this.f22668X.m19178J();
                } else {
                    this.f22668X.m19197c0();
                    this.f22668X.m19188T(true);
                    this.f22668X.m19196b0();
                }
                IjkMediaPlayer.native_profileEnd();
                if (i10 == 4) {
                    this.f22642K = "";
                    this.f22668X.f24116c = null;
                    this.f22657R0.setVisibility(8);
                }
            }
        } catch (Exception e10) {
        }
    }

    /* renamed from: X0 */
    public final void m18317X0() {
        findViewById(2131427470).setBackground(getResources().getDrawable(2131231786));
        findViewById(2131427471).setBackground(getResources().getDrawable(2131231786));
        findViewById(2131427472).setBackground(getResources().getDrawable(2131231786));
        findViewById(2131427473).setBackground(getResources().getDrawable(2131231786));
    }

    /* renamed from: Y0 */
    public final void m18318Y0(int i10, boolean z10, boolean z11) {
        View findViewById;
        View findViewById2;
        View findViewById3;
        m18317X0();
        if (i10 == 1) {
            if ((z10 && this.f22678f.getVisibility() != 0) || (z10 && z11)) {
                this.f22662U.setVisibility(0);
            }
            findViewById(2131427470).setFocusable(true);
            findViewById(2131427470).requestFocus();
            findViewById(2131427470).setBackground(getResources().getDrawable(2131231882));
            findViewById3 = findViewById(2131427471);
        } else {
            if (i10 != 2) {
                if (i10 == 3) {
                    if ((z10 && this.f22682h.getVisibility() != 0) || (z10 && z11)) {
                        this.f22666W.setVisibility(0);
                    }
                    findViewById(2131427472).setFocusable(true);
                    findViewById(2131427472).requestFocus();
                    findViewById(2131427472).setBackground(getResources().getDrawable(2131231882));
                    findViewById(2131427470).setFocusable(false);
                    findViewById2 = findViewById(2131427471);
                    findViewById2.setFocusable(false);
                    findViewById = findViewById(2131427473);
                    findViewById.setFocusable(false);
                }
                if (i10 == 4) {
                    if ((z10 && this.f22684i.getVisibility() != 0) || (z10 && z11)) {
                        this.f22668X.setVisibility(0);
                    }
                    findViewById(2131427473).setFocusable(true);
                    findViewById(2131427473).requestFocus();
                    findViewById(2131427473).setBackground(getResources().getDrawable(2131231882));
                    findViewById(2131427470).setFocusable(false);
                    findViewById(2131427471).setFocusable(false);
                    findViewById = findViewById(2131427472);
                    findViewById.setFocusable(false);
                }
                return;
            }
            if ((z10 && this.f22680g.getVisibility() != 0) || (z10 && z11)) {
                this.f22664V.setVisibility(0);
            }
            findViewById(2131427471).setFocusable(true);
            findViewById(2131427471).requestFocus();
            findViewById(2131427471).setBackground(getResources().getDrawable(2131231882));
            findViewById3 = findViewById(2131427470);
        }
        findViewById3.setFocusable(false);
        findViewById2 = findViewById(2131427472);
        findViewById2.setFocusable(false);
        findViewById = findViewById(2131427473);
        findViewById.setFocusable(false);
    }

    @SuppressLint({"ResourceType"})
    /* renamed from: Z0 */
    public final void m18319Z0(Context context) {
        try {
            LinearLayout linearLayout = (LinearLayout) findViewById(2131429110);
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
            View inflate = new C6783a(context).m31288z().equals(C5251a.f30065s0) ? layoutInflater.inflate(2131624500, linearLayout) : layoutInflater.inflate(2131624499, linearLayout);
            this.f22659S0 = (ImageView) inflate.findViewById(2131427818);
            this.f22661T0 = (ImageView) inflate.findViewById(2131429105);
            this.f22663U0 = (ImageView) inflate.findViewById(2131429106);
            this.f22665V0 = (ImageView) inflate.findViewById(2131429107);
            this.f22667W0 = (ImageView) inflate.findViewById(2131429108);
            this.f22669X0 = (ImageView) inflate.findViewById(2131429109);
            PopupWindow popupWindow = new PopupWindow(context);
            this.f22715x0 = popupWindow;
            popupWindow.setContentView(inflate);
            this.f22715x0.setWidth(-1);
            this.f22715x0.setHeight(-1);
            this.f22715x0.setFocusable(true);
            this.f22715x0.showAtLocation(inflate, 0, 0, 0);
            this.f22659S0.setOnClickListener(new ViewOnClickListenerC3755d(this));
            this.f22661T0.setOnClickListener(new ViewOnClickListenerC3756e(this));
            this.f22663U0.setOnClickListener(new ViewOnClickListenerC3757f(this));
            this.f22665V0.setOnClickListener(new ViewOnClickListenerC3758g(this));
            this.f22667W0.setOnClickListener(new ViewOnClickListenerC3759h(this));
            this.f22669X0.setOnClickListener(new ViewOnClickListenerC3760i(this));
        } catch (Exception e10) {
        }
    }

    /* renamed from: a1 */
    public final void m18320a1() {
        int i10;
        m18316W0(0);
        String str = this.f22681g0;
        str.hashCode();
        switch (str) {
            case "screen1":
                i10 = 2131624090;
                break;
            case "screen2":
                i10 = 2131624092;
                break;
            case "screen3":
                i10 = 2131624093;
                break;
            case "screen4":
                i10 = 2131624094;
                break;
            case "screen5":
                i10 = 2131624095;
                break;
            default:
                i10 = 2131624089;
                break;
        }
        setContentView(i10);
        m18308N0();
        if (this.f22652P.equals("0") || this.f22636H.equals("")) {
            m18318Y0(1, false, false);
        } else {
            m18311Q0();
        }
    }

    /* renamed from: b1 */
    public final void m18321b1(int i10) {
        TextView textView;
        StringBuilder sb2;
        String m26247n0 = C5255e.m26247n0(C7711g.m33686a() + C7711g.m33687i());
        if (i10 == 1) {
            this.f22662U.setVisibility(8);
            this.f22678f.setVisibility(0);
            textView = this.f22686j;
            sb2 = new StringBuilder();
        } else if (i10 == 2) {
            this.f22664V.setVisibility(8);
            this.f22680g.setVisibility(0);
            textView = this.f22688k;
            sb2 = new StringBuilder();
        } else if (i10 == 3) {
            this.f22666W.setVisibility(8);
            this.f22682h.setVisibility(0);
            textView = this.f22690l;
            sb2 = new StringBuilder();
        } else {
            if (i10 != 4) {
                return;
            }
            this.f22668X.setVisibility(8);
            this.f22684i.setVisibility(0);
            textView = this.f22692m;
            sb2 = new StringBuilder();
        }
        sb2.append(m26247n0);
        sb2.append(this.f22677e);
        sb2.append(this.f22630E);
        textView.setText(sb2.toString());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: c1 */
    public void m18322c1(String str) {
        View findViewById;
        View findViewById2;
        View findViewById3;
        str.hashCode();
        boolean z10 = -1;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    z10 = false;
                    break;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    z10 = true;
                    break;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    z10 = 2;
                    break;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    z10 = 3;
                    break;
                }
                break;
        }
        switch (z10) {
            case false:
            default:
                m18317X0();
                this.f22687j0 = 1;
                m18310P0(1);
                findViewById(2131427470).setFocusable(true);
                findViewById(2131427470).requestFocus();
                findViewById(2131427470).setBackground(getResources().getDrawable(2131231882));
                findViewById = findViewById(2131427471);
                findViewById.setFocusable(false);
                findViewById2 = findViewById(2131427472);
                findViewById2.setFocusable(false);
                findViewById3 = findViewById(2131427473);
                break;
            case true:
                m18317X0();
                this.f22687j0 = 2;
                m18310P0(2);
                findViewById(2131427471).setFocusable(true);
                findViewById(2131427471).requestFocus();
                findViewById(2131427471).setBackground(getResources().getDrawable(2131231882));
                findViewById = findViewById(2131427470);
                findViewById.setFocusable(false);
                findViewById2 = findViewById(2131427472);
                findViewById2.setFocusable(false);
                findViewById3 = findViewById(2131427473);
                break;
            case true:
                m18317X0();
                this.f22687j0 = 3;
                m18310P0(3);
                findViewById(2131427472).setFocusable(true);
                findViewById(2131427472).requestFocus();
                findViewById(2131427472).setBackground(getResources().getDrawable(2131231882));
                findViewById(2131427470).setFocusable(false);
                findViewById2 = findViewById(2131427471);
                findViewById2.setFocusable(false);
                findViewById3 = findViewById(2131427473);
                break;
            case true:
                m18317X0();
                this.f22687j0 = 4;
                m18310P0(4);
                findViewById(2131427473).setFocusable(true);
                findViewById(2131427473).requestFocus();
                findViewById(2131427473).setBackground(getResources().getDrawable(2131231882));
                findViewById(2131427470).setFocusable(false);
                findViewById(2131427471).setFocusable(false);
                findViewById3 = findViewById(2131427472);
                break;
        }
        findViewById3.setFocusable(false);
    }

    /* renamed from: d1 */
    public final void m18323d1() {
        try {
            this.f22673Z0 = new Handler();
            RunnableC3754c runnableC3754c = new RunnableC3754c(this);
            this.f22671Y0 = runnableC3754c;
            if (this.f22675b1[0]) {
                return;
            }
            runnableC3754c.run();
        } catch (Exception e10) {
            C4392v.m22268b("", "" + e10);
        }
    }

    @Override // androidx.appcompat.app.ActivityC0243b, p030c0.ActivityC0952l, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        boolean z10 = keyEvent.getAction() == 0;
        if (keyCode == 82) {
            try {
                return z10 ? onKeyDown(keyCode, keyEvent) : onKeyUp(keyCode, keyEvent);
            } catch (Exception e10) {
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // p324sf.InterfaceC8568g
    /* renamed from: j */
    public void mo18324j(String str, String str2) {
        int i10 = this.f22687j0;
        if (i10 == 1) {
            if (this.f22662U != null) {
                this.f22636H = str;
                this.f22652P = str2;
                findViewById(2131427470).setFocusable(true);
                m18311Q0();
                return;
            }
            return;
        }
        if (i10 == 2) {
            if (this.f22664V != null) {
                this.f22638I = str;
                this.f22654Q = str2;
                findViewById(2131427471).setFocusable(true);
                m18312R0();
                return;
            }
            return;
        }
        if (i10 == 3) {
            if (this.f22666W != null) {
                this.f22640J = str;
                this.f22656R = str2;
                findViewById(2131427472).setFocusable(true);
                m18313S0();
                return;
            }
            return;
        }
        if (i10 != 4 || this.f22668X == null) {
            return;
        }
        this.f22642K = str;
        this.f22658S = str2;
        findViewById(2131427473).setFocusable(true);
        m18314T0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(2130772003, 2130772000);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i10;
        switch (view.getId()) {
            case 2131427470:
                i10 = 1;
                break;
            case 2131427471:
                i10 = 2;
                break;
            case 2131427472:
                i10 = 3;
                break;
            case 2131427473:
                i10 = 4;
                break;
            default:
                return;
        }
        try {
            m18304I0(i10);
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f22676d = this;
        super.onCreate(bundle);
        this.f22681g0 = SharepreferenceDBHandler.m15396s(this.f22676d);
        m18320a1();
        if (SharepreferenceDBHandler.m15401x(this.f22676d)) {
            new Handler().postDelayed(new RunnableC3753b(this), 100L);
            m18323d1();
        }
        overridePendingTransition(2130772003, 2130772000);
        this.f22636H = getIntent().getStringExtra("url");
        String valueOf = String.valueOf(getIntent().getIntExtra("CHANNEL_NUM", 0));
        this.f22652P = valueOf;
        if (valueOf.equals("0") || this.f22636H.equals("")) {
            m18318Y0(1, false, false);
        } else {
            m18311Q0();
        }
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            m18316W0(0);
        } catch (Exception e10) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b0, code lost:
    
        if (r4.f22681g0.equals("screen2") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014e, code lost:
    
        if (r4.f22681g0.equals("screen2") == false) goto L64;
     */
    @Override // androidx.appcompat.app.ActivityC0243b, android.app.Activity, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            Method dump skipped, instructions count: 847
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerMultiActivity.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        switch (view.getId()) {
            case 2131427470:
                try {
                    if (!this.f22636H.equals("")) {
                        m18310P0(1);
                        m18318Y0(1, true, false);
                        m18315V0(1, view);
                        break;
                    }
                } catch (Exception e10) {
                    return true;
                }
                break;
            case 2131427471:
                try {
                    if (!this.f22638I.equals("")) {
                        m18310P0(2);
                        m18318Y0(2, true, false);
                        m18315V0(2, view);
                        break;
                    }
                } catch (Exception e11) {
                    return true;
                }
                break;
            case 2131427472:
                try {
                    if (!this.f22640J.equals("")) {
                        m18310P0(3);
                        m18318Y0(3, true, false);
                        m18315V0(3, view);
                        break;
                    }
                } catch (Exception e12) {
                    return true;
                }
                break;
            case 2131427473:
                try {
                    if (!this.f22642K.equals("")) {
                        m18310P0(4);
                        m18318Y0(4, true, false);
                        m18315V0(4, view);
                        break;
                    }
                } catch (Exception e13) {
                    return true;
                }
                break;
        }
        return true;
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        C5255e.m26233f(this.f22676d);
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onStop() {
        super.onStop();
        try {
            m18316W0(0);
        } catch (Exception e10) {
        }
    }
}

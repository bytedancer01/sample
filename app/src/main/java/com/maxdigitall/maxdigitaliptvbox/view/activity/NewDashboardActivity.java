package com.maxdigitall.maxdigitaliptvbox.view.activity;

import ag.C0164a;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0243b;
import bg.C0900a;
import butterknife.BindView;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.amazonaws.services.p045s3.internal.Constants;
import com.maxdigitall.maxdigitaliptvbox.model.EpisodesUsingSinglton;
import com.maxdigitall.maxdigitaliptvbox.model.VodAllCategoriesSingleton;
import com.maxdigitall.maxdigitaliptvbox.model.callback.BillingLoginClientCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.GetSeriesStreamCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.GetSeriesStreamCategoriesCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.LiveStreamCategoriesCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.LiveStreamsCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.LoginCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.VodCategoriesCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.VodStreamsCallback;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.ImportStatusModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.MultiUserDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.RecentWatchDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SeriesRecentWatchDatabase;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import de.blinkt.openvpn.LaunchVPN;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import nf.C6783a;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.slf4j.Marker;
import p030c0.C0936d;
import p050d0.C4290b;
import p135hh.C5095d0;
import p135hh.C5110r;
import p135hh.InterfaceC5100h;
import p151if.C5251a;
import p151if.C5255e;
import p170jf.C5370b;
import p170jf.C5371c;
import p170jf.C5372d;
import p324sf.InterfaceC8565d;
import p324sf.InterfaceC8567f;
import p324sf.InterfaceC8569h;
import p407xe.C9740b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity.class */
public class NewDashboardActivity extends ActivityC0243b implements View.OnClickListener, InterfaceC8567f, InterfaceC8569h, InterfaceC8565d {

    /* renamed from: V */
    public static PopupWindow f17740V;

    /* renamed from: A */
    public String f17741A;

    /* renamed from: B */
    public String f17742B;

    /* renamed from: G */
    public ProgressDialog f17747G;

    /* renamed from: I */
    public String f17749I;

    /* renamed from: J */
    public String f17750J;

    /* renamed from: K */
    public int f17751K;

    /* renamed from: L */
    public C5370b f17752L;

    /* renamed from: Q */
    public RecentWatchDBHandler f17757Q;

    /* renamed from: R */
    public SeriesRecentWatchDatabase f17758R;

    @BindView
    public ImageView account_info;

    @BindView
    public LinearLayout catch_up;

    @BindView
    public ImageView check_VPN_Status;

    @BindView
    public TextView date;

    /* renamed from: e */
    public SharedPreferences f17763e;

    @BindView
    public LinearLayout epg;

    @BindView
    public TextView epgTV;

    /* renamed from: f */
    public SharedPreferences.Editor f17764f;

    /* renamed from: g */
    public LiveStreamDBHandler f17765g;

    /* renamed from: h */
    public SharedPreferences f17766h;

    @BindView
    public ImageView ivSwitchUser;

    @BindView
    public ImageView iv_catch_up;

    @BindView
    public ImageView iv_download_icon_live;

    @BindView
    public ImageView iv_download_icon_movies;

    @BindView
    public ImageView iv_download_icon_series;

    @BindView
    public ImageView iv_notification;

    @BindView
    public ImageView iv_premium_or_account;

    @BindView
    public ImageView iv_radio;

    @BindView
    public LinearLayout linearLayoutLoggedinUser;

    @BindView
    public LinearLayout live_tv;

    @BindView
    public LinearLayout llMultiscreen;

    @BindView
    public LinearLayout ll_download_live;

    @BindView
    public LinearLayout ll_download_movies;

    @BindView
    public LinearLayout ll_download_series;

    @BindView
    public LinearLayout ll_last_updated_live;

    @BindView
    public LinearLayout ll_last_updated_movies;

    @BindView
    public LinearLayout ll_last_updated_series;

    @BindView
    public LinearLayout ll_purchase_add_free_version;

    @BindView
    public LinearLayout ll_search;

    /* renamed from: m */
    public SharedPreferences f17771m;

    /* renamed from: n */
    public long f17772n;

    /* renamed from: o */
    public Button f17773o;

    @BindView
    public LinearLayout on_demand;

    /* renamed from: p */
    public Button f17774p;

    @BindView
    public ProgressBar pb_downloading_live;

    @BindView
    public ProgressBar pb_downloading_movies;

    @BindView
    public ProgressBar pb_downloading_series;

    @BindView
    public ProgressBar progressLive;

    @BindView
    public ProgressBar progressMovies;

    @BindView
    public ProgressBar progressSeries;

    @BindView
    public ProgressBar progress_catchup;

    @BindView
    public ProgressBar progress_epg;

    @BindView
    public ProgressBar progress_multiscreen;

    /* renamed from: r */
    public AlertDialog f17776r;

    @BindView
    public ImageView recordingsIV;

    /* renamed from: s */
    public DatabaseHandler f17777s;

    @BindView
    public LinearLayout settings;

    @BindView
    public ImageView settingsIV;

    /* renamed from: t */
    public String f17778t;

    @BindView
    public TextView time;

    @BindView
    public TextView tvAccountinfoButton;

    @BindView
    public TextView tvExpiryDate;

    @BindView
    public TextView tvLoggedinUser;

    @BindView
    public TextView tvRecordingsButton;

    @BindView
    public TextView tvSettingsButton;

    @BindView
    public TextView tvSwitchUserButton;

    @BindView
    public TextView tv_catch_up;

    @BindView
    public TextView tv_check_vpn_button;

    @BindView
    public TextView tv_download_text_live;

    @BindView
    public TextView tv_download_text_movies;

    @BindView
    public TextView tv_download_text_series;

    @BindView
    public TextView tv_last_updated_live;

    @BindView
    public TextView tv_last_updated_movies;

    @BindView
    public TextView tv_last_updated_series;

    @BindView
    public TextView tv_notification;

    @BindView
    public TextView tv_purchase;

    @BindView
    public TextView tv_radio;

    /* renamed from: u */
    public MultiUserDBHandler f17779u;

    /* renamed from: v */
    public C5371c f17780v;

    /* renamed from: w */
    public ArrayList<C0900a> f17781w;

    /* renamed from: x */
    public C0164a f17782x;

    /* renamed from: y */
    public C6783a f17783y;

    /* renamed from: z */
    public C5372d f17784z;

    /* renamed from: d */
    public Context f17762d = this;

    /* renamed from: i */
    public String f17767i = "";

    /* renamed from: j */
    public String f17768j = "";

    /* renamed from: k */
    public String f17769k = "";

    /* renamed from: l */
    public DatabaseUpdatedStatusDBModel f17770l = new DatabaseUpdatedStatusDBModel();

    /* renamed from: q */
    public String f17775q = "";

    /* renamed from: C */
    public boolean f17743C = true;

    /* renamed from: D */
    public boolean f17744D = false;

    /* renamed from: E */
    public boolean f17745E = false;

    /* renamed from: F */
    public boolean f17746F = false;

    /* renamed from: H */
    public long f17748H = 0;

    /* renamed from: M */
    public Thread f17753M = null;

    /* renamed from: N */
    public boolean f17754N = false;

    /* renamed from: O */
    public boolean f17755O = false;

    /* renamed from: P */
    public boolean f17756P = false;

    /* renamed from: S */
    public String f17759S = "";

    /* renamed from: T */
    public String f17760T = "";

    /* renamed from: U */
    public String f17761U = "";

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$a.class */
    public class ViewOnClickListenerC2863a implements View.OnClickListener {

        /* renamed from: b */
        public final NewDashboardActivity f17785b;

        public ViewOnClickListenerC2863a(NewDashboardActivity newDashboardActivity) {
            this.f17785b = newDashboardActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + this.f17785b.getApplicationContext().getPackageName()));
                SharepreferenceDBHandler.m15360X(true, this.f17785b.f17762d);
                this.f17785b.startActivity(intent);
            } catch (Exception e10) {
                Toast.makeText(this.f17785b.f17762d, this.f17785b.getResources().getString(2132017572), 0).show();
            }
            this.f17785b.f17776r.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$b.class */
    public class ViewOnClickListenerC2864b implements View.OnClickListener {

        /* renamed from: b */
        public final NewDashboardActivity f17786b;

        public ViewOnClickListenerC2864b(NewDashboardActivity newDashboardActivity) {
            this.f17786b = newDashboardActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SharepreferenceDBHandler.m15359W(0, this.f17786b.f17762d);
            this.f17786b.f17776r.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$c.class */
    public class ViewOnClickListenerC2865c implements View.OnClickListener {

        /* renamed from: b */
        public final NewDashboardActivity f17787b;

        public ViewOnClickListenerC2865c(NewDashboardActivity newDashboardActivity) {
            this.f17787b = newDashboardActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!C5095d0.m25468k()) {
                this.f17787b.m16139r0();
                return;
            }
            this.f17787b.m16117Z0();
            NewDashboardActivity newDashboardActivity = this.f17787b;
            newDashboardActivity.check_VPN_Status.setImageDrawable(newDashboardActivity.getResources().getDrawable(2131230988));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$d.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$d.class */
    public class AsyncTaskC2866d extends AsyncTask<String, Integer, Boolean> {

        /* renamed from: a */
        public final List f17788a;

        /* renamed from: b */
        public final NewDashboardActivity f17789b;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$d$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity$d$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$d$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final AsyncTaskC2866d f17790b;

            public a(AsyncTaskC2866d asyncTaskC2866d) {
                this.f17790b = asyncTaskC2866d;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f17790b.f17789b.f17784z.m26707c(this.f17790b.f17789b.f17741A, this.f17790b.f17789b.f17742B);
            }
        }

        public AsyncTaskC2866d(NewDashboardActivity newDashboardActivity, Context context, List list) {
            this.f17789b = newDashboardActivity;
            this.f17788a = list;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            if (this.f17789b.f17765g != null) {
                this.f17789b.f17765g.m15248r2();
            }
            publishProgress(0);
            return this.f17789b.f17765g != null ? Boolean.valueOf(this.f17789b.f17765g.m15149B(this.f17788a)) : Boolean.FALSE;
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            if (this.f17789b.f17762d == null || !bool.booleanValue()) {
                this.f17789b.m16132n1();
                return;
            }
            if (this.f17789b.f17741A == null || this.f17789b.f17741A.isEmpty() || this.f17789b.f17742B == null || this.f17789b.f17742B.isEmpty()) {
                return;
            }
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f17789b.progressLive, "progress", 100, 50);
            ofInt.setDuration(500L);
            ofInt.setInterpolator(new LinearInterpolator());
            ofInt.start();
            new Handler().postDelayed(new a(this), 500L);
        }

        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$e.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$e.class */
    public class AsyncTaskC2867e extends AsyncTask<String, Integer, Boolean> {

        /* renamed from: a */
        public final List f17791a;

        /* renamed from: b */
        public final NewDashboardActivity f17792b;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$e$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity$e$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$e$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final AsyncTaskC2867e f17793b;

            public a(AsyncTaskC2867e asyncTaskC2867e) {
                this.f17793b = asyncTaskC2867e;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f17793b.f17792b.ll_download_live.isFocused()) {
                    this.f17793b.f17792b.live_tv.requestFocus();
                }
                this.f17793b.f17792b.ll_download_live.setVisibility(8);
                this.f17793b.f17792b.progressLive.setVisibility(8);
                this.f17793b.f17792b.progress_epg.setVisibility(8);
                this.f17793b.f17792b.progress_multiscreen.setVisibility(8);
                this.f17793b.f17792b.progress_catchup.setVisibility(8);
                this.f17793b.f17792b.ll_last_updated_live.setVisibility(0);
                this.f17793b.f17792b.tv_last_updated_live.setText(this.f17793b.f17792b.f17762d.getResources().getString(2132017898) + " " + C5255e.m26245m0(1000L));
                this.f17793b.f17792b.m16124g1();
                if (this.f17793b.f17792b.f17755O) {
                    this.f17793b.f17792b.f17755O = false;
                    NewDashboardActivity newDashboardActivity = this.f17793b.f17792b;
                    newDashboardActivity.m16129k1(newDashboardActivity.f17762d.getResources().getString(2132018753));
                } else if (this.f17793b.f17792b.f17756P) {
                    this.f17793b.f17792b.f17756P = false;
                    NewDashboardActivity newDashboardActivity2 = this.f17793b.f17792b;
                    newDashboardActivity2.m16130l1(newDashboardActivity2.f17762d.getResources().getString(2132018753));
                }
            }
        }

        public AsyncTaskC2867e(NewDashboardActivity newDashboardActivity, Context context, List list) {
            this.f17792b = newDashboardActivity;
            this.f17791a = list;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:55:0x0117
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.lang.Boolean doInBackground(java.lang.String... r7) {
            /*
                Method dump skipped, instructions count: 283
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity.AsyncTaskC2867e.doInBackground(java.lang.String[]):java.lang.Boolean");
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            if (this.f17792b.f17762d == null || !bool.booleanValue()) {
                this.f17792b.m16132n1();
                return;
            }
            this.f17792b.f17744D = false;
            if (this.f17792b.f17765g != null) {
                this.f17792b.f17765g.m15158D2("live", "1");
            }
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f17792b.progressLive, "progress", 50, 0);
            ofInt.setDuration(1000L);
            ofInt.setInterpolator(new LinearInterpolator());
            ofInt.start();
            new Handler(Looper.getMainLooper()).postDelayed(new a(this), 1000L);
        }

        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$f.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$f.class */
    public class AsyncTaskC2868f extends AsyncTask<String, Integer, Boolean> {

        /* renamed from: a */
        public final List f17794a;

        /* renamed from: b */
        public final NewDashboardActivity f17795b;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$f$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity$f$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$f$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final AsyncTaskC2868f f17796b;

            public a(AsyncTaskC2868f asyncTaskC2868f) {
                this.f17796b = asyncTaskC2868f;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f17796b.f17795b.ll_download_series.isFocused()) {
                    this.f17796b.f17795b.catch_up.requestFocus();
                }
                this.f17796b.f17795b.ll_download_series.setVisibility(8);
                this.f17796b.f17795b.progressSeries.setVisibility(8);
                this.f17796b.f17795b.ll_last_updated_series.setVisibility(0);
                this.f17796b.f17795b.tv_last_updated_series.setText(this.f17796b.f17795b.f17762d.getResources().getString(2132017898) + " " + C5255e.m26245m0(1000L));
                this.f17796b.f17795b.m16124g1();
            }
        }

        public AsyncTaskC2868f(NewDashboardActivity newDashboardActivity, Context context, List list) {
            this.f17795b = newDashboardActivity;
            this.f17794a = list;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:96:0x01cd
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.lang.Boolean doInBackground(java.lang.String... r7) {
            /*
                Method dump skipped, instructions count: 465
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity.AsyncTaskC2868f.doInBackground(java.lang.String[]):java.lang.Boolean");
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            if (this.f17795b.f17762d == null || !bool.booleanValue()) {
                this.f17795b.m16142s1();
                return;
            }
            this.f17795b.f17746F = false;
            if (this.f17795b.f17765g != null) {
                this.f17795b.f17765g.m15158D2("series", "1");
            }
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f17795b.progressSeries, "progress", 50, 0);
            ofInt.setDuration(1000L);
            ofInt.setInterpolator(new LinearInterpolator());
            ofInt.start();
            new Handler(Looper.getMainLooper()).postDelayed(new a(this), 1000L);
        }

        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$g.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$g.class */
    public class AsyncTaskC2869g extends AsyncTask<String, Integer, Boolean> {

        /* renamed from: a */
        public final List f17797a;

        /* renamed from: b */
        public final NewDashboardActivity f17798b;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$g$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity$g$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$g$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final AsyncTaskC2869g f17799b;

            public a(AsyncTaskC2869g asyncTaskC2869g) {
                this.f17799b = asyncTaskC2869g;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f17799b.f17798b.f17784z.m26708d(this.f17799b.f17798b.f17741A, this.f17799b.f17798b.f17742B);
            }
        }

        public AsyncTaskC2869g(NewDashboardActivity newDashboardActivity, Context context, List list) {
            this.f17798b = newDashboardActivity;
            this.f17797a = list;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            if (this.f17798b.f17765g != null) {
                this.f17798b.f17765g.m15255u2();
            }
            publishProgress(0);
            return this.f17798b.f17765g != null ? Boolean.valueOf(this.f17798b.f17765g.m15153C0((ArrayList) this.f17797a)) : Boolean.FALSE;
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            if (this.f17798b.f17762d == null || !bool.booleanValue()) {
                this.f17798b.m16142s1();
                return;
            }
            if (this.f17798b.f17741A == null || this.f17798b.f17741A.isEmpty() || this.f17798b.f17742B == null || this.f17798b.f17742B.isEmpty()) {
                return;
            }
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f17798b.progressSeries, "progress", 100, 50);
            ofInt.setDuration(500L);
            ofInt.setInterpolator(new LinearInterpolator());
            ofInt.start();
            new Handler().postDelayed(new a(this), 500L);
        }

        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$h.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$h.class */
    public class AsyncTaskC2870h extends AsyncTask<String, Integer, Boolean> {

        /* renamed from: a */
        public final List f17800a;

        /* renamed from: b */
        public final NewDashboardActivity f17801b;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$h$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity$h$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$h$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final AsyncTaskC2870h f17802b;

            public a(AsyncTaskC2870h asyncTaskC2870h) {
                this.f17802b = asyncTaskC2870h;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f17802b.f17801b.f17784z.m26711g(this.f17802b.f17801b.f17741A, this.f17802b.f17801b.f17742B);
            }
        }

        public AsyncTaskC2870h(NewDashboardActivity newDashboardActivity, Context context, List list) {
            this.f17801b = newDashboardActivity;
            this.f17800a = list;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            if (this.f17801b.f17765g != null) {
                this.f17801b.f17765g.m15253t2();
            }
            publishProgress(0);
            return this.f17801b.f17765g != null ? Boolean.valueOf(this.f17801b.f17765g.m15257v0(this.f17800a)) : Boolean.FALSE;
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            if (this.f17801b.f17762d == null || !bool.booleanValue()) {
                this.f17801b.m16138q1();
                return;
            }
            if (this.f17801b.f17741A == null || this.f17801b.f17741A.isEmpty() || this.f17801b.f17742B == null || this.f17801b.f17742B.isEmpty()) {
                return;
            }
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f17801b.progressMovies, "progress", 100, 50);
            ofInt.setDuration(500L);
            ofInt.setInterpolator(new LinearInterpolator());
            ofInt.start();
            new Handler().postDelayed(new a(this), 500L);
        }

        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$i.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$i.class */
    public class AsyncTaskC2871i extends AsyncTask<String, Integer, Boolean> {

        /* renamed from: a */
        public final List f17803a;

        /* renamed from: b */
        public final NewDashboardActivity f17804b;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$i$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity$i$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$i$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final AsyncTaskC2871i f17805b;

            public a(AsyncTaskC2871i asyncTaskC2871i) {
                this.f17805b = asyncTaskC2871i;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f17805b.f17804b.ll_download_movies.isFocused()) {
                    this.f17805b.f17804b.on_demand.requestFocus();
                }
                this.f17805b.f17804b.ll_download_movies.setVisibility(8);
                this.f17805b.f17804b.progressMovies.setVisibility(8);
                this.f17805b.f17804b.ll_last_updated_movies.setVisibility(0);
                this.f17805b.f17804b.tv_last_updated_movies.setText(this.f17805b.f17804b.f17762d.getResources().getString(2132017898) + " " + C5255e.m26245m0(1000L));
                this.f17805b.f17804b.m16124g1();
                if (this.f17805b.f17804b.f17756P) {
                    this.f17805b.f17804b.f17756P = false;
                    NewDashboardActivity newDashboardActivity = this.f17805b.f17804b;
                    newDashboardActivity.m16130l1(newDashboardActivity.f17762d.getResources().getString(2132018753));
                }
            }
        }

        public AsyncTaskC2871i(NewDashboardActivity newDashboardActivity, Context context, List list) {
            this.f17804b = newDashboardActivity;
            this.f17803a = list;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:96:0x01da
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.lang.Boolean doInBackground(java.lang.String... r7) {
            /*
                Method dump skipped, instructions count: 478
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity.AsyncTaskC2871i.doInBackground(java.lang.String[]):java.lang.Boolean");
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            if (this.f17804b.f17762d == null || !bool.booleanValue()) {
                this.f17804b.m16138q1();
                return;
            }
            this.f17804b.f17745E = false;
            if (this.f17804b.f17765g != null) {
                this.f17804b.f17765g.m15158D2("movies", "1");
            }
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f17804b.progressMovies, "progress", 50, 0);
            ofInt.setDuration(1000L);
            ofInt.setInterpolator(new LinearInterpolator());
            ofInt.start();
            new Handler(Looper.getMainLooper()).postDelayed(new a(this), 1000L);
        }

        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$j.class */
    public class RunnableC2872j implements Runnable {

        /* renamed from: b */
        public final NewDashboardActivity f17806b;

        public RunnableC2872j(NewDashboardActivity newDashboardActivity) {
            this.f17806b = newDashboardActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            ImageView imageView;
            Resources resources;
            int i10;
            if (C5095d0.m25468k()) {
                NewDashboardActivity newDashboardActivity = this.f17806b;
                imageView = newDashboardActivity.check_VPN_Status;
                resources = newDashboardActivity.getResources();
                i10 = 2131230971;
            } else {
                NewDashboardActivity newDashboardActivity2 = this.f17806b;
                imageView = newDashboardActivity2.check_VPN_Status;
                resources = newDashboardActivity2.getResources();
                i10 = 2131230988;
            }
            imageView.setImageDrawable(resources.getDrawable(i10));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$k.class */
    public class ServiceConnectionC2873k implements ServiceConnection {

        /* renamed from: b */
        public final NewDashboardActivity f17807b;

        public ServiceConnectionC2873k(NewDashboardActivity newDashboardActivity) {
            this.f17807b = newDashboardActivity;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            InterfaceC5100h m25510Z = InterfaceC5100h.a.m25510Z(iBinder);
            if (m25510Z != null) {
                try {
                    m25510Z.mo25506a(false);
                } catch (RemoteException e10) {
                    C5095d0.m25475r(e10);
                }
            }
            this.f17807b.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$l.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity$l */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$l.class */
    public class RunnableC2874l implements Runnable {

        /* renamed from: b */
        public final NewDashboardActivity f17808b;

        public RunnableC2874l(NewDashboardActivity newDashboardActivity) {
            this.f17808b = newDashboardActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f17808b.f17784z.m26708d(this.f17808b.f17741A, this.f17808b.f17742B);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$m.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity$m */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$m.class */
    public class RunnableC2875m implements Runnable {

        /* renamed from: b */
        public final NewDashboardActivity f17809b;

        public RunnableC2875m(NewDashboardActivity newDashboardActivity) {
            this.f17809b = newDashboardActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f17809b.f17784z.m26707c(this.f17809b.f17741A, this.f17809b.f17742B);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$n.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity$n */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$n.class */
    public class RunnableC2876n implements Runnable {

        /* renamed from: b */
        public final NewDashboardActivity f17810b;

        public RunnableC2876n(NewDashboardActivity newDashboardActivity) {
            this.f17810b = newDashboardActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f17810b.f17784z.m26711g(this.f17810b.f17741A, this.f17810b.f17742B);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$o.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity$o */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$o.class */
    public class RunnableC2877o implements Runnable {

        /* renamed from: b */
        public final NewDashboardActivity f17811b;

        public RunnableC2877o(NewDashboardActivity newDashboardActivity) {
            this.f17811b = newDashboardActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String date = Calendar.getInstance().getTime().toString();
                String m26199B = C5255e.m26199B(this.f17811b.f17762d);
                String m26249p = C5255e.m26249p(date);
                TextView textView = this.f17811b.time;
                if (textView != null) {
                    textView.setText(m26199B);
                }
                TextView textView2 = this.f17811b.date;
                if (textView2 != null) {
                    textView2.setText(m26249p);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$p.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity$p */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$p.class */
    public class ViewOnClickListenerC2878p implements View.OnClickListener {

        /* renamed from: b */
        public final NewDashboardActivity f17812b;

        public ViewOnClickListenerC2878p(NewDashboardActivity newDashboardActivity) {
            this.f17812b = newDashboardActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NewDashboardActivity.f17740V.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$q.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity$q */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$q.class */
    public class ViewOnClickListenerC2879q implements View.OnClickListener {

        /* renamed from: b */
        public final NewDashboardActivity f17813b;

        public ViewOnClickListenerC2879q(NewDashboardActivity newDashboardActivity) {
            this.f17813b = newDashboardActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f17813b.finish();
            C5255e.m26211N(this.f17813b.f17762d);
            this.f17813b.overridePendingTransition(2130772003, 2130772000);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$r.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity$r */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$r.class */
    public class RunnableC2880r implements Runnable {

        /* renamed from: b */
        public final NewDashboardActivity f17814b;

        public RunnableC2880r(NewDashboardActivity newDashboardActivity) {
            this.f17814b = newDashboardActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    try {
                        this.f17814b.m16118a1();
                        Thread.sleep(1000L);
                    } catch (InterruptedException e10) {
                        Thread.currentThread().interrupt();
                    } catch (Exception e11) {
                    }
                } catch (Exception e12) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$s.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity$s */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$s.class */
    public class DialogC2881s extends Dialog implements View.OnClickListener {

        /* renamed from: b */
        public Activity f17815b;

        /* renamed from: c */
        public TextView f17816c;

        /* renamed from: d */
        public TextView f17817d;

        /* renamed from: e */
        public TextView f17818e;

        /* renamed from: f */
        public TextView f17819f;

        /* renamed from: g */
        public LinearLayout f17820g;

        /* renamed from: h */
        public LinearLayout f17821h;

        /* renamed from: i */
        public final NewDashboardActivity f17822i;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$s$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity$s$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$s$a.class */
        public class a implements View.OnFocusChangeListener {

            /* renamed from: b */
            public View f17823b;

            /* renamed from: c */
            public final DialogC2881s f17824c;

            public a(DialogC2881s dialogC2881s, View view) {
                this.f17824c = dialogC2881s;
                this.f17823b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z10) {
                int i10;
                LinearLayout linearLayout;
                if (z10) {
                    View view2 = this.f17823b;
                    i10 = 2131230846;
                    if (view2 == null || view2.getTag() == null || !this.f17823b.getTag().equals("1")) {
                        View view3 = this.f17823b;
                        if (view3 == null || view3.getTag() == null || !this.f17823b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f17824c.f17821h;
                    }
                    linearLayout = this.f17824c.f17820g;
                } else {
                    View view4 = this.f17823b;
                    i10 = 2131230845;
                    if (view4 == null || view4.getTag() == null || !this.f17823b.getTag().equals("1")) {
                        View view5 = this.f17823b;
                        if (view5 == null || view5.getTag() == null || !this.f17823b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f17824c.f17821h;
                    }
                    linearLayout = this.f17824c.f17820g;
                }
                linearLayout.setBackgroundResource(i10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogC2881s(NewDashboardActivity newDashboardActivity, Activity activity) {
            super(activity);
            this.f17822i = newDashboardActivity;
            this.f17815b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id2 = view.getId();
            if (id2 == 2131427653) {
                dismiss();
            } else if (id2 == 2131427681) {
                try {
                    NewDashboardActivity newDashboardActivity = this.f17822i;
                    newDashboardActivity.m16128j1(newDashboardActivity.getResources().getString(2132017603));
                } catch (Exception e10) {
                }
            }
            dismiss();
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(this.f17822i.f17783y.m31288z().equals(C5251a.f30065s0) ? 2131624132 : 2131624131);
            this.f17816c = (TextView) findViewById(2131427681);
            this.f17817d = (TextView) findViewById(2131427653);
            this.f17820g = (LinearLayout) findViewById(2131428448);
            this.f17821h = (LinearLayout) findViewById(2131428541);
            this.f17819f = (TextView) findViewById(2131429631);
            this.f17818e = (TextView) findViewById(2131429644);
            this.f17819f.setText(this.f17822i.getResources().getString(2132017959));
            this.f17818e.setText(this.f17822i.getResources().getString(2132018174));
            this.f17816c.setOnClickListener(this);
            this.f17817d.setOnClickListener(this);
            TextView textView = this.f17816c;
            textView.setOnFocusChangeListener(new a(this, textView));
            TextView textView2 = this.f17817d;
            textView2.setOnFocusChangeListener(new a(this, textView2));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$t.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity$t */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewDashboardActivity$t.class */
    public class ViewOnFocusChangeListenerC2882t implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f17825b;

        /* renamed from: c */
        public final NewDashboardActivity f17826c;

        public ViewOnFocusChangeListenerC2882t(NewDashboardActivity newDashboardActivity, View view) {
            this.f17826c = newDashboardActivity;
            this.f17825b = view;
        }

        /* renamed from: a */
        public final void m16169a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17825b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m16170b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17825b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m16171c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17825b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:126:0x04d8  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0211  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x052d  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x0558  */
        /* JADX WARN: Removed duplicated region for block: B:144:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:145:0x04ea  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0324  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0375  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x03a0  */
        /* JADX WARN: Removed duplicated region for block: B:72:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0336  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x03c5  */
        /* JADX WARN: Type inference failed for: r0v209, types: [android.view.View] */
        /* JADX WARN: Type inference failed for: r0v322, types: [android.view.View] */
        @Override // android.view.View.OnFocusChangeListener
        @android.annotation.SuppressLint({"ResourceType"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onFocusChange(android.view.View r4, boolean r5) {
            /*
                Method dump skipped, instructions count: 1402
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity.ViewOnFocusChangeListenerC2882t.onFocusChange(android.view.View, boolean):void");
        }
    }

    /* renamed from: X0 */
    public static ProgressDialog m16098X0(Context context) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        try {
            progressDialog.show();
        } catch (Exception e10) {
        }
        progressDialog.setCancelable(false);
        progressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        progressDialog.setContentView(2131624486);
        return progressDialog;
    }

    /* renamed from: c1 */
    public static long m16099c1(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0L;
        }
    }

    @Override // p324sf.InterfaceC8569h
    /* renamed from: B */
    public void mo16106B(String str) {
        m16142s1();
    }

    @Override // p324sf.InterfaceC8567f
    /* renamed from: D */
    public void mo15980D(LoginCallback loginCallback, String str, ArrayList<String> arrayList) {
    }

    @Override // p324sf.InterfaceC8565d
    /* renamed from: F */
    public void mo16107F(BillingLoginClientCallback billingLoginClientCallback) {
        if (billingLoginClientCallback != null) {
            try {
                if (billingLoginClientCallback.m14929c() == null || !billingLoginClientCallback.m14929c().equals("success") || billingLoginClientCallback.m14930d() == null) {
                    return;
                }
                if (!billingLoginClientCallback.m14930d().equalsIgnoreCase(C5255e.m26212O("Vu6HilnbLo63*KJHGFkugu345*&^klih*" + C9740b.f44454b)) || billingLoginClientCallback.m14927a() == null || billingLoginClientCallback.m14928b() == null || !billingLoginClientCallback.m14928b().equals("Max Connection Reached")) {
                    return;
                }
                this.f17783y.m31263a();
                m16114W0();
            } catch (Exception e10) {
            }
        }
    }

    @Override // p324sf.InterfaceC8567f
    /* renamed from: H */
    public void mo15984H(ArrayList<String> arrayList, String str) {
    }

    @Override // p324sf.InterfaceC8569h
    /* renamed from: I */
    public void mo16108I(String str) {
        m16138q1();
    }

    @Override // p324sf.InterfaceC8569h
    /* renamed from: M */
    public void mo16109M(List<VodCategoriesCallback> list) {
        String str;
        String str2;
        if (list != null) {
            new AsyncTaskC2870h(this, this.f17762d, list).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
            return;
        }
        if (this.f17762d == null || (str = this.f17741A) == null || str.isEmpty() || (str2 = this.f17742B) == null || str2.isEmpty()) {
            return;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.progressMovies, "progress", 100, 50);
        ofInt.setDuration(500L);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.start();
        new Handler().postDelayed(new RunnableC2876n(this), 500L);
    }

    @Override // p324sf.InterfaceC8569h
    /* renamed from: N */
    public void mo16110N(String str) {
        m16132n1();
    }

    @Override // p324sf.InterfaceC8567f
    /* renamed from: P */
    public void mo15991P(String str) {
    }

    @Override // p324sf.InterfaceC8567f
    /* renamed from: Q */
    public void mo15993Q(ArrayList<String> arrayList, String str) {
    }

    /* renamed from: T0 */
    public final void m16111T0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    @Override // p324sf.InterfaceC8569h
    /* renamed from: U */
    public void mo16112U(String str) {
        m16142s1();
    }

    /* renamed from: V0 */
    public boolean m16113V0() {
        SharedPreferences sharedPreferences = getSharedPreferences("automation_channels", 0);
        this.f17771m = sharedPreferences;
        return sharedPreferences.getString("automation_channels", "").equals("checked");
    }

    /* renamed from: W0 */
    public final void m16114W0() {
        ImageView imageView;
        int i10;
        if (this.f17783y.m31273k() != null && this.f17783y.m31276n() != null && this.f17783y.m31274l() != 0) {
            String str = "";
            if (!this.f17783y.m31273k().equals("") && !this.f17783y.m31276n().equals("")) {
                String m31272j = this.f17783y.m31272j();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
                Date date = new Date();
                try {
                    date.setTime(Long.parseLong(m31272j));
                    str = simpleDateFormat.format(date);
                } catch (Exception e10) {
                }
                long m16099c1 = m16099c1(simpleDateFormat, str, C5255e.m26235h());
                if (this.f17783y.m31275m().booleanValue() && m16099c1 >= 7) {
                    this.f17783y.m31255N();
                    this.f17749I = C5255e.m26254u(this.f17762d);
                    this.f17750J = C5255e.m26251r();
                    m16141s0();
                    this.f17752L.m26696c(this.f17783y.m31273k(), this.f17783y.m31276n(), this.f17750J, this.f17749I, C5255e.m26212O(this.f17783y.m31273k() + Marker.ANY_MARKER + "Njh0&$@ZH098GP-Vu6HilnbLo63-" + C9740b.f44454b + "-"));
                }
                LinearLayout linearLayout = this.ll_purchase_add_free_version;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                TextView textView = this.tv_purchase;
                if (textView != null) {
                    textView.setText(getResources().getString(2132018163));
                }
                imageView = this.iv_premium_or_account;
                if (imageView != null) {
                    i10 = 2131230806;
                    imageView.setImageResource(i10);
                }
                return;
            }
        }
        LinearLayout linearLayout2 = this.ll_purchase_add_free_version;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
        TextView textView2 = this.tv_purchase;
        if (textView2 != null) {
            textView2.setText(getResources().getString(2132017381));
        }
        imageView = this.iv_premium_or_account;
        if (imageView != null) {
            i10 = 2131231189;
            imageView.setImageResource(i10);
        }
    }

    @Override // p324sf.InterfaceC8569h
    /* renamed from: X */
    public void mo16115X(List<GetSeriesStreamCategoriesCallback> list) {
        String str;
        String str2;
        if (list != null) {
            new AsyncTaskC2869g(this, this.f17762d, list).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
            return;
        }
        if (this.f17762d == null || (str = this.f17741A) == null || str.isEmpty() || (str2 = this.f17742B) == null || str2.isEmpty()) {
            return;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.progressSeries, "progress", 100, 50);
        ofInt.setDuration(500L);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.start();
        new Handler().postDelayed(new RunnableC2874l(this), 500L);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0518  */
    /* renamed from: Y0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m16116Y0(boolean r6) {
        /*
            Method dump skipped, instructions count: 1488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity.m16116Y0(boolean):void");
    }

    /* renamed from: Z0 */
    public void m16117Z0() {
        Intent intent = new Intent(this, (Class<?>) C5110r.class);
        intent.setAction("de.blinkt.openvpn.START_SERVICE");
        bindService(intent, new ServiceConnectionC2873k(this), 1);
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: a */
    public void mo15996a() {
    }

    /* renamed from: a1 */
    public void m16118a1() {
        try {
            runOnUiThread(new RunnableC2877o(this));
        } catch (Exception e10) {
        }
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: b */
    public void mo15997b() {
    }

    /* renamed from: b1 */
    public final void m16119b1(String str) {
        String str2 = this.f17741A;
        if (str2 == null || this.f17742B == null || str2.isEmpty() || this.f17742B.isEmpty() || this.f17741A.equals("") || this.f17742B.equals("")) {
            return;
        }
        this.iv_download_icon_live.setVisibility(8);
        this.pb_downloading_live.setVisibility(0);
        this.tv_download_text_live.setText(str);
        this.f17784z.m26706b(this.f17741A, this.f17742B);
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: c */
    public void mo15998c(String str) {
    }

    /* renamed from: d1 */
    public final void m16120d1() {
        Context context = this.f17762d;
        if (context != null) {
            this.f17780v = new C5371c(this, context);
            SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
            sharedPreferences.edit();
            String string = sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
            String string2 = sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
            try {
                if (this.f17780v == null || string == null || string.isEmpty() || string.equals("") || string2 == null || string2.isEmpty() || string2.equals("")) {
                    return;
                }
                this.f17780v.m26703g(string, string2);
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* renamed from: e1 */
    public final void m16121e1(String str) {
        String str2 = this.f17741A;
        if (str2 == null || this.f17742B == null || str2.isEmpty() || this.f17742B.isEmpty() || this.f17741A.equals("") || this.f17742B.equals("")) {
            return;
        }
        this.iv_download_icon_movies.setVisibility(8);
        this.pb_downloading_movies.setVisibility(0);
        this.tv_download_text_movies.setText(str);
        this.f17784z.m26710f(this.f17741A, this.f17742B);
    }

    @Override // p324sf.InterfaceC8569h
    /* renamed from: f */
    public void mo16122f(String str) {
        m16138q1();
    }

    /* renamed from: f1 */
    public final void m16123f1(String str) {
        String str2 = this.f17741A;
        if (str2 == null || this.f17742B == null || str2.isEmpty() || this.f17742B.isEmpty() || this.f17741A.equals("") || this.f17742B.equals("")) {
            return;
        }
        this.iv_download_icon_series.setVisibility(8);
        this.pb_downloading_series.setVisibility(0);
        this.tv_download_text_series.setText(str);
        this.f17784z.m26709e(this.f17741A, this.f17742B);
    }

    /* renamed from: g1 */
    public final void m16124g1() {
        if (this.f17744D || this.f17745E || this.f17746F) {
            return;
        }
        m16126h1();
    }

    @Override // p324sf.InterfaceC8569h
    /* renamed from: h */
    public void mo16125h(List<LiveStreamCategoriesCallback> list) {
        String str;
        String str2;
        if (list != null) {
            new AsyncTaskC2866d(this, this.f17762d, list).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
            return;
        }
        if (this.f17762d == null || (str = this.f17741A) == null || str.isEmpty() || (str2 = this.f17742B) == null || str2.isEmpty()) {
            return;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.progressLive, "progress", 100, 50);
        ofInt.setDuration(500L);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.start();
        new Handler().postDelayed(new RunnableC2875m(this), 500L);
    }

    /* renamed from: h1 */
    public void m16126h1() {
        try {
            ProgressDialog progressDialog = this.f17747G;
            if (progressDialog == null || !progressDialog.isShowing()) {
                return;
            }
            this.f17747G.dismiss();
        } catch (Exception e10) {
        }
    }

    @Override // p324sf.InterfaceC8567f
    /* renamed from: i */
    public void mo15999i(LoginCallback loginCallback, String str) {
        TextView textView;
        String str2;
        if (loginCallback != null) {
            try {
                if (loginCallback.m15009b() != null) {
                    int i10 = 1;
                    if (loginCallback.m15009b().m15084c().intValue() == 1 && loginCallback.m15009b().m15090i().equals("Active")) {
                        if (loginCallback.m15009b().m15086e() != null) {
                            String m15086e = loginCallback.m15009b().m15086e();
                            String m15064e = loginCallback.m15008a().m15064e();
                            SharedPreferences.Editor editor = this.f17764f;
                            if (editor != null) {
                                editor.putString("expDate", m15086e);
                                this.f17764f.putString("serverTimeZone", m15064e);
                                this.f17764f.apply();
                            }
                            if (this.tvExpiryDate == null) {
                                return;
                            }
                            if (m15086e != null && !m15086e.isEmpty()) {
                                try {
                                    i10 = Integer.parseInt(m15086e);
                                } catch (NumberFormatException e10) {
                                }
                                String format = new SimpleDateFormat("MMMM d, yyyy").format(new Date(i10 * 1000));
                                this.tvExpiryDate.setText(getResources().getString(2132017757) + " " + format);
                                return;
                            }
                            textView = this.tvExpiryDate;
                            str2 = getResources().getString(2132017757) + " " + getResources().getString(2132018736);
                        } else {
                            textView = this.tvExpiryDate;
                            if (textView == null) {
                                return;
                            }
                            str2 = getResources().getString(2132017757) + " " + getResources().getString(2132018736);
                        }
                        textView.setText(str2);
                    }
                }
            } catch (Exception e11) {
                Log.e("honey", e11.getMessage());
            }
        }
    }

    /* renamed from: i1 */
    public void m16127i1() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception e10) {
        }
    }

    /* renamed from: j1 */
    public final void m16128j1(String str) {
        ProgressDialog progressDialog = this.f17747G;
        ProgressDialog progressDialog2 = progressDialog;
        if (progressDialog == null) {
            progressDialog2 = m16098X0(this.f17762d);
            this.f17747G = progressDialog2;
        }
        progressDialog2.show();
        if (this.f17762d != null) {
            this.f17744D = true;
            LiveStreamDBHandler liveStreamDBHandler = this.f17765g;
            if (liveStreamDBHandler != null) {
                liveStreamDBHandler.m15158D2("live", "3");
            }
            m16119b1(str);
        }
    }

    /* renamed from: k1 */
    public final void m16129k1(String str) {
        ProgressDialog progressDialog = this.f17747G;
        ProgressDialog progressDialog2 = progressDialog;
        if (progressDialog == null) {
            progressDialog2 = m16098X0(this.f17762d);
            this.f17747G = progressDialog2;
        }
        progressDialog2.show();
        if (this.f17762d != null) {
            this.f17745E = true;
            LiveStreamDBHandler liveStreamDBHandler = this.f17765g;
            if (liveStreamDBHandler != null) {
                liveStreamDBHandler.m15158D2("movies", "3");
            }
            m16121e1(str);
        }
    }

    /* renamed from: l1 */
    public final void m16130l1(String str) {
        ProgressDialog progressDialog = this.f17747G;
        ProgressDialog progressDialog2 = progressDialog;
        if (progressDialog == null) {
            progressDialog2 = m16098X0(this.f17762d);
            this.f17747G = progressDialog2;
        }
        progressDialog2.show();
        if (this.f17762d != null) {
            this.f17746F = true;
            LiveStreamDBHandler liveStreamDBHandler = this.f17765g;
            if (liveStreamDBHandler != null) {
                liveStreamDBHandler.m15158D2("series", "3");
            }
            m16123f1(str);
        }
    }

    /* renamed from: m1 */
    public final void m16131m1() {
        new DialogC2881s(this, this).show();
    }

    /* renamed from: n1 */
    public final void m16132n1() {
        this.f17744D = false;
        m16124g1();
        LiveStreamDBHandler liveStreamDBHandler = this.f17765g;
        if (liveStreamDBHandler != null) {
            liveStreamDBHandler.m15158D2("live", "2");
        }
        this.progressLive.setVisibility(0);
        this.ll_download_live.setVisibility(0);
        this.iv_download_icon_live.setImageResource(2131231131);
        this.iv_download_icon_live.setVisibility(0);
        this.pb_downloading_live.setVisibility(8);
        this.tv_download_text_live.setText(this.f17762d.getResources().getString(2132018493));
        if (this.f17755O) {
            this.f17755O = false;
            m16129k1(this.f17762d.getResources().getString(2132018753));
        } else if (this.f17756P) {
            this.f17756P = false;
            m16130l1(this.f17762d.getResources().getString(2132018753));
        }
    }

    /* renamed from: o1 */
    public final void m16133o1() {
        this.live_tv.setOnClickListener(this);
        this.on_demand.setOnClickListener(this);
        this.catch_up.setOnClickListener(this);
        this.epg.setOnClickListener(this);
        this.account_info.setOnClickListener(this);
        this.settings.setOnClickListener(this);
        this.settingsIV.setOnClickListener(this);
        this.recordingsIV.setOnClickListener(this);
        this.ivSwitchUser.setOnClickListener(this);
        this.llMultiscreen.setOnClickListener(this);
        this.iv_notification.setOnClickListener(this);
        this.ll_purchase_add_free_version.setOnClickListener(this);
        this.ll_last_updated_live.setOnClickListener(this);
        this.ll_last_updated_movies.setOnClickListener(this);
        this.ll_last_updated_series.setOnClickListener(this);
        this.ll_search.setOnClickListener(this);
        this.iv_radio.setOnClickListener(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f17772n + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
            finishAffinity();
            finish();
        } else {
            try {
                Toast.makeText(getBaseContext(), getResources().getString(2132018406), 0).show();
            } catch (Exception e10) {
            }
        }
        this.f17772n = System.currentTimeMillis();
    }

    /* JADX WARN: Code restructure failed: missing block: B:243:0x0847, code lost:
    
        if (java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - java.lang.Long.parseLong(r0.m15138e())).longValue() > 60000) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0af4, code lost:
    
        if (java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - java.lang.Long.parseLong(r0.m15138e())).longValue() > 60000) goto L309;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onClick(android.view.View r7) {
        /*
            Method dump skipped, instructions count: 2838
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity.onClick(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0683  */
    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    @android.annotation.SuppressLint({"SetTextI18n"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 2050
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    /* JADX WARN: Code restructure failed: missing block: B:196:0x04cb, code lost:
    
        if (r4.on_demand.isFocusable() != false) goto L71;
     */
    @Override // androidx.appcompat.app.ActivityC0243b, android.app.Activity, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            Method dump skipped, instructions count: 1253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        C5255e.m26233f(this.f17762d);
        super.onPause();
        try {
            Thread thread = this.f17753M;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f17753M.interrupt();
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        try {
            m16127i1();
            if (C5251a.f30014M.booleanValue()) {
                m16114W0();
            }
            C5255e.m26233f(this.f17762d);
            this.f17781w = new ArrayList<>();
            if (!this.f17743C) {
                if (!this.f17744D && !this.f17745E && !this.f17746F) {
                    m16116Y0(false);
                }
                C0164a c0164a = new C0164a(this.f17762d);
                this.f17782x = c0164a;
                try {
                    this.f17781w = c0164a.m742v();
                } catch (Exception e10) {
                }
                ArrayList<C0900a> arrayList = this.f17781w;
                if (arrayList == null || arrayList.size() <= 0 || C5095d0.m25464g() == null) {
                    this.check_VPN_Status.setVisibility(8);
                } else {
                    this.check_VPN_Status.setVisibility(0);
                    m16137q0();
                }
            }
            this.f17743C = false;
            VodAllCategoriesSingleton.m14909b().m14921m(null);
            EpisodesUsingSinglton.m14753c().m14758f(null);
            overridePendingTransition(2130772003, 2130772000);
            Thread thread = this.f17753M;
            if (thread == null || !thread.isAlive()) {
                Thread thread2 = new Thread(new RunnableC2880r(this));
                this.f17753M = thread2;
                thread2.start();
            }
            SharepreferenceDBHandler.m15397t(this.f17762d).equalsIgnoreCase("Arabic");
        } catch (Exception e11) {
        }
        super.onResume();
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        m16127i1();
    }

    @Override // p324sf.InterfaceC8569h
    /* renamed from: p */
    public void mo16134p(String str) {
        m16132n1();
    }

    /* renamed from: p1 */
    public final void m16135p1() {
        if (Build.VERSION.SDK_INT < 33 || checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
            return;
        }
        C0936d.m5641r(this, C5255e.m26216S(), 1);
    }

    @Override // p324sf.InterfaceC8569h
    /* renamed from: q */
    public void mo16136q(List<GetSeriesStreamCallback> list) {
        if (list != null) {
            new AsyncTaskC2868f(this, this.f17762d, list).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        } else {
            m16142s1();
        }
    }

    /* renamed from: q0 */
    public final void m16137q0() {
        this.check_VPN_Status.setOnClickListener(new ViewOnClickListenerC2865c(this));
        new Handler().postDelayed(new RunnableC2872j(this), 100L);
    }

    /* renamed from: q1 */
    public final void m16138q1() {
        this.f17745E = false;
        m16124g1();
        LiveStreamDBHandler liveStreamDBHandler = this.f17765g;
        if (liveStreamDBHandler != null) {
            liveStreamDBHandler.m15158D2("movies", "2");
        }
        this.progressMovies.setVisibility(0);
        this.ll_download_movies.setVisibility(0);
        this.iv_download_icon_movies.setImageResource(2131231131);
        this.iv_download_icon_movies.setVisibility(0);
        this.pb_downloading_movies.setVisibility(8);
        this.tv_download_text_movies.setText(this.f17762d.getResources().getString(2132018493));
        if (this.f17756P) {
            this.f17756P = false;
            m16130l1(this.f17762d.getResources().getString(2132018753));
        }
    }

    /* renamed from: r0 */
    public final void m16139r0() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setClass(this.f17762d, LaunchVPN.class);
        intent.putExtra("de.blinkt.openvpn.shortcutProfileUUID", C5095d0.m25464g());
        intent.setFlags(268435456);
        intent.putExtra("de.blinkt.openvpn.showNoLogWindow", true);
        this.f17762d.startActivity(intent);
    }

    /* renamed from: r1 */
    public final void m16140r1() {
        startActivity(new Intent(this, (Class<?>) NewEPGCategoriesActivity.class));
        overridePendingTransition(2130772003, 2130772000);
    }

    /* renamed from: s0 */
    public void m16141s0() {
        int nextInt = new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS;
        this.f17751K = nextInt;
        C9740b.f44454b = String.valueOf(nextInt);
    }

    /* renamed from: s1 */
    public final void m16142s1() {
        this.f17746F = false;
        m16124g1();
        LiveStreamDBHandler liveStreamDBHandler = this.f17765g;
        if (liveStreamDBHandler != null) {
            liveStreamDBHandler.m15158D2("series", "2");
        }
        this.progressSeries.setVisibility(0);
        this.ll_download_series.setVisibility(0);
        this.iv_download_icon_series.setImageResource(2131231131);
        this.iv_download_icon_series.setVisibility(0);
        this.pb_downloading_series.setVisibility(8);
        this.tv_download_text_series.setText(this.f17762d.getResources().getString(2132018493));
    }

    @Override // p324sf.InterfaceC8567f
    /* renamed from: t */
    public void mo16003t(String str) {
    }

    /* renamed from: t1 */
    public void m16143t1() {
        if (this.f17762d != null) {
            View inflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(2131624152, (RelativeLayout) findViewById(2131429033));
            PopupWindow popupWindow = new PopupWindow(this);
            f17740V = popupWindow;
            popupWindow.setContentView(inflate);
            f17740V.setWidth(-1);
            f17740V.setHeight(-1);
            f17740V.setFocusable(true);
            f17740V.setBackgroundDrawable(new BitmapDrawable());
            f17740V.showAtLocation(inflate, 17, 0, 0);
            TextView textView = (TextView) inflate.findViewById(2131429550);
            TextView textView2 = (TextView) inflate.findViewById(2131429411);
            Button button = (Button) inflate.findViewById(2131427628);
            Button button2 = (Button) inflate.findViewById(2131427605);
            if (textView != null) {
                textView.setText(getResources().getString(2132017988));
            }
            if (textView2 != null) {
                textView2.setText(getResources().getString(2132017987));
            }
            if (button != null) {
                button.setOnFocusChangeListener(new C5255e.i((View) button, this));
            }
            if (button2 != null) {
                button2.setOnFocusChangeListener(new C5255e.i((View) button2, this));
            }
            button2.setOnClickListener(new ViewOnClickListenerC2878p(this));
            if (button != null) {
                button.setOnClickListener(new ViewOnClickListenerC2879q(this));
            }
        }
    }

    @Override // p324sf.InterfaceC8569h
    /* renamed from: u */
    public void mo16144u(List<LiveStreamsCallback> list) {
        if (list != null) {
            new AsyncTaskC2867e(this, this.f17762d, list).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        } else {
            m16132n1();
        }
    }

    @TargetApi(26)
    /* renamed from: u1 */
    public void m16145u1() {
        LayoutInflater from;
        int i10;
        if (this.f17762d != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this, 2132082693);
            if (this.f17783y.m31288z().equals(C5251a.f30065s0)) {
                from = LayoutInflater.from(this);
                i10 = 2131624490;
            } else {
                from = LayoutInflater.from(this);
                i10 = 2131624489;
            }
            View inflate = from.inflate(i10, (ViewGroup) null);
            Button button = (Button) inflate.findViewById(2131427664);
            Button button2 = (Button) inflate.findViewById(2131427636);
            button.setOnFocusChangeListener(new C5255e.i((View) button, this));
            button.requestFocus();
            button.setFocusableInTouchMode(true);
            button2.setOnFocusChangeListener(new C5255e.i((View) button2, this));
            button.setOnClickListener(new ViewOnClickListenerC2863a(this));
            button2.setOnClickListener(new ViewOnClickListenerC2864b(this));
            builder.setView(inflate);
            this.f17776r = builder.create();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(this.f17776r.getWindow().getAttributes());
            layoutParams.width = -1;
            layoutParams.height = -2;
            this.f17776r.show();
            this.f17776r.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            this.f17776r.getWindow().setAttributes(layoutParams);
            this.f17776r.setCancelable(false);
        }
    }

    /* renamed from: v1 */
    public void m16146v1() {
        Intent intent = new Intent(this, (Class<?>) ImportM3uActivity.class);
        intent.putExtra("M3U_LINE", this.f17778t);
        startActivity(intent);
        overridePendingTransition(2130772003, 2130772000);
    }

    /* renamed from: w1 */
    public final void m16147w1(ImportStatusModel importStatusModel, ImportStatusModel importStatusModel2, ImportStatusModel importStatusModel3) {
        long currentTimeMillis = (importStatusModel.m15138e() == null || importStatusModel.m15138e().equals("")) ? 0L : System.currentTimeMillis() - Long.parseLong(importStatusModel.m15138e());
        long currentTimeMillis2 = (importStatusModel2.m15138e() == null || importStatusModel2.m15138e().equals("")) ? 0L : System.currentTimeMillis() - Long.parseLong(importStatusModel2.m15138e());
        long currentTimeMillis3 = (importStatusModel3.m15138e() == null || importStatusModel3.m15138e().equals("")) ? 0L : System.currentTimeMillis() - Long.parseLong(importStatusModel3.m15138e());
        long j10 = currentTimeMillis;
        if (j10 == 0 || j10 <= 0 || importStatusModel.m15137d() == null || !importStatusModel.m15137d().equals("1")) {
            this.ll_last_updated_live.setVisibility(8);
        } else {
            this.ll_last_updated_live.setVisibility(0);
            this.tv_last_updated_live.setText(this.f17762d.getResources().getString(2132017898) + " " + C5255e.m26245m0(currentTimeMillis));
        }
        long j11 = currentTimeMillis2;
        if (j11 == 0 || j11 <= 0 || importStatusModel2.m15137d() == null || !importStatusModel2.m15137d().equals("1")) {
            this.ll_last_updated_movies.setVisibility(8);
        } else {
            this.ll_last_updated_movies.setVisibility(0);
            this.tv_last_updated_movies.setText(this.f17762d.getResources().getString(2132017898) + " " + C5255e.m26245m0(currentTimeMillis2));
        }
        long j12 = currentTimeMillis3;
        if (j12 == 0 || j12 <= 0 || importStatusModel3.m15137d() == null || !importStatusModel3.m15137d().equals("1")) {
            this.ll_last_updated_series.setVisibility(8);
            return;
        }
        this.ll_last_updated_series.setVisibility(0);
        this.tv_last_updated_series.setText(this.f17762d.getResources().getString(2132017898) + " " + C5255e.m26245m0(currentTimeMillis3));
    }

    @Override // p324sf.InterfaceC8569h
    /* renamed from: x */
    public void mo16148x(List<VodStreamsCallback> list) {
        if (list != null) {
            new AsyncTaskC2871i(this, this.f17762d, list).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        } else {
            m16138q1();
        }
    }
}

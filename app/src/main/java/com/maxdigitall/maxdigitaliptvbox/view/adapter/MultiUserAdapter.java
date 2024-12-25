package com.maxdigitall.maxdigitaliptvbox.view.adapter;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.C0304c1;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.amazonaws.mobileconnectors.p044s3.transferutility.TransferTable;
import com.amazonaws.services.p045s3.internal.Constants;
import com.maxdigitall.maxdigitaliptvbox.model.MultiUserDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.callback.LoginCallback;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.ImportStatusModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.MultiUserDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.RecentWatchDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SeriesRecentWatchDatabase;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.activity.ImportM3uActivity;
import com.maxdigitall.maxdigitaliptvbox.view.activity.MultiUserActivity;
import com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity;
import com.maxdigitall.maxdigitaliptvbox.view.activity.RoutingActivity;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import nf.C6783a;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.apache.http.client.methods.HttpHead;
import org.json.JSONObject;
import org.pcap4j.packet.namednumber.EtherType;
import org.slf4j.Marker;
import p030c0.C0936d;
import p151if.C5251a;
import p151if.C5255e;
import p170jf.C5371c;
import p316s2.C8522c;
import p324sf.InterfaceC8567f;
import p407xe.C9740b;
import p407xe.C9743e;
import p407xe.C9744f;
import p407xe.C9745g;
import p407xe.InterfaceC9741c;
import tf.C8724a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiUserAdapter.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiUserAdapter.class */
public class MultiUserAdapter extends RecyclerView.AbstractC0677h<MyViewHolder> implements InterfaceC8567f, InterfaceC9741c<String> {

    /* renamed from: j0 */
    public static PopupWindow f20099j0;

    /* renamed from: A */
    public SharedPreferences.Editor f20100A;

    /* renamed from: B */
    public SharedPreferences f20101B;

    /* renamed from: C */
    public SharedPreferences.Editor f20102C;

    /* renamed from: D */
    public SharedPreferences f20103D;

    /* renamed from: E */
    public SharedPreferences.Editor f20104E;

    /* renamed from: F */
    public DatabaseHandler f20105F;

    /* renamed from: G */
    public InputStream f20106G;

    /* renamed from: J */
    public String f20109J;

    /* renamed from: K */
    public Button f20110K;

    /* renamed from: L */
    public Button f20111L;

    /* renamed from: S */
    public C6783a f20118S;

    /* renamed from: T */
    public String f20119T;

    /* renamed from: U */
    public String f20120U;

    /* renamed from: V */
    public String f20121V;

    /* renamed from: W */
    public String f20122W;

    /* renamed from: X */
    public int f20123X;

    /* renamed from: Y */
    public String f20124Y;

    /* renamed from: Z */
    public SharedPreferences f20125Z;

    /* renamed from: e */
    public final MultiUserDBModel f20126e;

    /* renamed from: f */
    public final LinearLayout f20127f;

    /* renamed from: f0 */
    public SharedPreferences f20128f0;

    /* renamed from: g0 */
    public SharedPreferences.Editor f20130g0;

    /* renamed from: h */
    public Context f20131h;

    /* renamed from: h0 */
    public String f20132h0;

    /* renamed from: i */
    public List<MultiUserDBModel> f20133i;

    /* renamed from: j */
    public LinearLayout f20135j;

    /* renamed from: k */
    public TextView f20136k;

    /* renamed from: l */
    public LiveStreamDBHandler f20137l;

    /* renamed from: m */
    public MultiUserDBHandler f20138m;

    /* renamed from: n */
    public MultiUserActivity f20139n;

    /* renamed from: o */
    public String f20140o;

    /* renamed from: q */
    public C5371c f20142q;

    /* renamed from: r */
    public String f20143r;

    /* renamed from: s */
    public String f20144s;

    /* renamed from: t */
    public String f20145t;

    /* renamed from: u */
    public String f20146u;

    /* renamed from: v */
    public ProgressDialog f20147v;

    /* renamed from: w */
    public String f20148w;

    /* renamed from: x */
    public SharedPreferences.Editor f20149x;

    /* renamed from: y */
    public SharedPreferences f20150y;

    /* renamed from: z */
    public SharedPreferences f20151z;

    /* renamed from: g */
    public boolean f20129g = true;

    /* renamed from: p */
    public boolean f20141p = true;

    /* renamed from: H */
    public final C8724a f20107H = new C8724a();

    /* renamed from: I */
    public String f20108I = "";

    /* renamed from: M */
    public String f20112M = "";

    /* renamed from: N */
    public String f20113N = "";

    /* renamed from: O */
    public String f20114O = "";

    /* renamed from: P */
    public String f20115P = "";

    /* renamed from: Q */
    public long f20116Q = -1;

    /* renamed from: R */
    public boolean f20117R = false;

    /* renamed from: i0 */
    public ArrayList<String> f20134i0 = new ArrayList<>();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiUserAdapter$MyViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiUserAdapter$MyViewHolder.class */
    public static class MyViewHolder extends RecyclerView.AbstractC0674e0 {

        @BindView
        public ImageView ivUserimg;

        @BindView
        public ProgressBar pbPagingLoader;

        @BindView
        public RelativeLayout rlDelete;

        @BindView
        public RelativeLayout rlListOfCategories;

        @BindView
        public RelativeLayout rlOuter;

        @BindView
        public RelativeLayout testing;

        @BindView
        public TextView tvMovieCategoryName;

        @BindView
        public TextView tvServerName;

        @BindView
        public TextView tvUserName;

        @BindView
        public TextView tvXubCount;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.m5627b(this, view);
            m4048L(false);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiUserAdapter$MyViewHolder_ViewBinding.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiUserAdapter$MyViewHolder_ViewBinding.class */
    public class MyViewHolder_ViewBinding implements Unbinder {

        /* renamed from: b */
        public MyViewHolder f20152b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f20152b = myViewHolder;
            myViewHolder.tvMovieCategoryName = (TextView) C8522c.m36739c(view, 2131429513, "field 'tvMovieCategoryName'", TextView.class);
            myViewHolder.tvServerName = (TextView) C8522c.m36739c(view, 2131429604, "field 'tvServerName'", TextView.class);
            myViewHolder.ivUserimg = (ImageView) C8522c.m36739c(view, 2131428239, "field 'ivUserimg'", ImageView.class);
            myViewHolder.tvUserName = (TextView) C8522c.m36739c(view, 2131429634, "field 'tvUserName'", TextView.class);
            myViewHolder.pbPagingLoader = (ProgressBar) C8522c.m36739c(view, 2131428840, "field 'pbPagingLoader'", ProgressBar.class);
            myViewHolder.rlOuter = (RelativeLayout) C8522c.m36739c(view, 2131429028, "field 'rlOuter'", RelativeLayout.class);
            myViewHolder.rlListOfCategories = (RelativeLayout) C8522c.m36739c(view, 2131429008, "field 'rlListOfCategories'", RelativeLayout.class);
            myViewHolder.testing = (RelativeLayout) C8522c.m36739c(view, 2131429278, "field 'testing'", RelativeLayout.class);
            myViewHolder.rlDelete = (RelativeLayout) C8522c.m36739c(view, 2131427827, "field 'rlDelete'", RelativeLayout.class);
            myViewHolder.tvXubCount = (TextView) C8522c.m36739c(view, 2131429620, "field 'tvXubCount'", TextView.class);
        }

        @Override // butterknife.Unbinder
        /* renamed from: a */
        public void mo5629a() {
            MyViewHolder myViewHolder = this.f20152b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f20152b = null;
            myViewHolder.tvMovieCategoryName = null;
            myViewHolder.tvServerName = null;
            myViewHolder.ivUserimg = null;
            myViewHolder.tvUserName = null;
            myViewHolder.pbPagingLoader = null;
            myViewHolder.rlOuter = null;
            myViewHolder.rlListOfCategories = null;
            myViewHolder.testing = null;
            myViewHolder.rlDelete = null;
            myViewHolder.tvXubCount = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiUserAdapter$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.MultiUserAdapter$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiUserAdapter$a.class */
    public class ViewOnLongClickListenerC3436a implements View.OnLongClickListener {

        /* renamed from: b */
        public final String f20153b;

        /* renamed from: c */
        public final String f20154c;

        /* renamed from: d */
        public final String f20155d;

        /* renamed from: e */
        public final String f20156e;

        /* renamed from: f */
        public final MyViewHolder f20157f;

        /* renamed from: g */
        public final int f20158g;

        /* renamed from: h */
        public final int f20159h;

        /* renamed from: i */
        public final MultiUserAdapter f20160i;

        public ViewOnLongClickListenerC3436a(MultiUserAdapter multiUserAdapter, String str, String str2, String str3, String str4, MyViewHolder myViewHolder, int i10, int i11) {
            this.f20160i = multiUserAdapter;
            this.f20153b = str;
            this.f20154c = str2;
            this.f20155d = str3;
            this.f20156e = str4;
            this.f20157f = myViewHolder;
            this.f20158g = i10;
            this.f20159h = i11;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            MultiUserAdapter multiUserAdapter = this.f20160i;
            String str = this.f20153b;
            multiUserAdapter.f20143r = str;
            String str2 = this.f20154c;
            multiUserAdapter.f20144s = str2;
            String str3 = this.f20155d;
            multiUserAdapter.f20145t = str3;
            String str4 = this.f20156e;
            multiUserAdapter.f20146u = str4;
            multiUserAdapter.m17267L0(this.f20157f, this.f20158g, str, this.f20159h, view, str2, str3, str4);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiUserAdapter$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.MultiUserAdapter$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiUserAdapter$b.class */
    public class ViewOnClickListenerC3437b implements View.OnClickListener {

        /* renamed from: b */
        public final String f20161b;

        /* renamed from: c */
        public final String f20162c;

        /* renamed from: d */
        public final String f20163d;

        /* renamed from: e */
        public final String f20164e;

        /* renamed from: f */
        public final MultiUserDBModel f20165f;

        /* renamed from: g */
        public final int f20166g;

        /* renamed from: h */
        public final MultiUserAdapter f20167h;

        public ViewOnClickListenerC3437b(MultiUserAdapter multiUserAdapter, String str, String str2, String str3, String str4, MultiUserDBModel multiUserDBModel, int i10) {
            this.f20167h = multiUserAdapter;
            this.f20161b = str;
            this.f20162c = str2;
            this.f20163d = str3;
            this.f20164e = str4;
            this.f20165f = multiUserDBModel;
            this.f20166g = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5371c c5371c;
            String str;
            MultiUserAdapter multiUserAdapter = this.f20167h;
            multiUserAdapter.f20149x = multiUserAdapter.f20150y.edit();
            this.f20167h.mo15996a();
            this.f20167h.f20100A.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, this.f20161b);
            this.f20167h.f20100A.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, this.f20162c);
            this.f20167h.f20100A.putString(C5251a.f30066t, this.f20163d);
            this.f20167h.f20100A.putString("activationCode", "");
            this.f20167h.f20100A.putString("loginWith", "loginWithDetails");
            this.f20167h.f20100A.apply();
            MultiUserAdapter multiUserAdapter2 = this.f20167h;
            multiUserAdapter2.f20143r = this.f20164e;
            multiUserAdapter2.f20144s = this.f20161b;
            multiUserAdapter2.f20145t = this.f20162c;
            multiUserAdapter2.f20146u = this.f20163d;
            multiUserAdapter2.f20149x.putString(C5251a.f30066t, this.f20163d);
            this.f20167h.f20149x.apply();
            String m14872b = this.f20165f.m14872b();
            if ((m14872b == null || !m14872b.equals(TransferTable.COLUMN_FILE)) && (m14872b == null || !m14872b.equals("url"))) {
                this.f20167h.f20140o = "api";
            } else {
                this.f20167h.f20140o = "m3u";
            }
            if (!C5251a.f30036e.booleanValue() || !this.f20167h.f20140o.equals("m3u")) {
                SharepreferenceDBHandler.m15351O("api", this.f20167h.f20131h);
                try {
                    if (C5251a.f30030b.booleanValue()) {
                        c5371c = this.f20167h.f20142q;
                        str = this.f20161b;
                    } else if (!C5251a.f30014M.booleanValue()) {
                        new AsyncTaskC3441f(this.f20167h).execute(new Void[0]);
                        SharepreferenceDBHandler.m15376g0(this.f20166g, this.f20167h.f20131h);
                        return;
                    } else {
                        c5371c = this.f20167h.f20142q;
                        str = this.f20161b;
                    }
                    c5371c.m26703g(str, this.f20162c);
                    SharepreferenceDBHandler.m15376g0(this.f20166g, this.f20167h.f20131h);
                    return;
                } catch (Exception e10) {
                    return;
                }
            }
            SharepreferenceDBHandler.m15351O("m3u", this.f20167h.f20131h);
            SharepreferenceDBHandler.m15376g0(this.f20166g, this.f20167h.f20131h);
            if (!this.f20165f.m14872b().equals(TransferTable.COLUMN_FILE)) {
                if (this.f20165f.m14872b().equals("url")) {
                    this.f20167h.f20109J = "url";
                    new AsyncTaskC3442g(this.f20167h).execute(new Void[0]);
                    return;
                }
                return;
            }
            this.f20167h.f20109J = TransferTable.COLUMN_FILE;
            if (!new File(this.f20167h.f20146u).exists()) {
                this.f20167h.mo15997b();
                Toast.makeText(this.f20167h.f20131h, this.f20167h.f20131h.getResources().getString(2132017995), 0).show();
            } else if (C5251a.f30014M.booleanValue()) {
                new AsyncTaskC3445j(this.f20167h).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f20167h.f20146u);
            } else {
                new AsyncTaskC3441f(this.f20167h).execute(new Void[0]);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiUserAdapter$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.MultiUserAdapter$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiUserAdapter$c.class */
    public class C3438c implements C0304c1.d {

        /* renamed from: a */
        public final String f20168a;

        /* renamed from: b */
        public final String f20169b;

        /* renamed from: c */
        public final String f20170c;

        /* renamed from: d */
        public final String f20171d;

        /* renamed from: e */
        public final int f20172e;

        /* renamed from: f */
        public final int f20173f;

        /* renamed from: g */
        public final MyViewHolder f20174g;

        /* renamed from: h */
        public final MultiUserAdapter f20175h;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiUserAdapter$c$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.MultiUserAdapter$c$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiUserAdapter$c$a.class */
        public class a implements View.OnClickListener {

            /* renamed from: b */
            public final C3438c f20176b;

            public a(C3438c c3438c) {
                this.f20176b = c3438c;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MultiUserAdapter.f20099j0.dismiss();
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiUserAdapter$c$b.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.MultiUserAdapter$c$b */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiUserAdapter$c$b.class */
        public class b implements View.OnClickListener {

            /* renamed from: b */
            public final C3438c f20177b;

            public b(C3438c c3438c) {
                this.f20177b = c3438c;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (this.f20177b.f20175h.f20131h != null) {
                    SharedPreferences sharedPreferences = this.f20177b.f20175h.f20131h.getSharedPreferences("loginprefsmultiuser", 0);
                    String string = sharedPreferences.getString("name", "");
                    String string2 = sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
                    String string3 = sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
                    String string4 = sharedPreferences.getString(C5251a.f30066t, "");
                    C3438c c3438c = this.f20177b;
                    String str = c3438c.f20168a;
                    if (str != null && c3438c.f20169b != null && c3438c.f20170c != null && c3438c.f20171d != null && str.equals(string) && this.f20177b.f20171d.contains(string4) && this.f20177b.f20169b.equals(string2) && this.f20177b.f20170c.equals(string3)) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.clear();
                        edit.apply();
                        SharedPreferences.Editor edit2 = this.f20177b.f20175h.f20131h.getSharedPreferences("loginPrefs", 0).edit();
                        edit2.clear();
                        edit2.apply();
                    }
                    if (this.f20177b.f20175h.f20140o.equals("m3u")) {
                        this.f20177b.f20175h.f20137l.m15239o2(this.f20177b.f20172e);
                        LiveStreamDBHandler liveStreamDBHandler = this.f20177b.f20175h.f20137l;
                        C3438c c3438c2 = this.f20177b;
                        liveStreamDBHandler.m15196V0(c3438c2.f20172e, c3438c2.f20175h.f20140o);
                        LiveStreamDBHandler liveStreamDBHandler2 = this.f20177b.f20175h.f20137l;
                        C3438c c3438c3 = this.f20177b;
                        liveStreamDBHandler2.m15190S0(c3438c3.f20172e, c3438c3.f20175h.f20140o);
                        LiveStreamDBHandler liveStreamDBHandler3 = this.f20177b.f20175h.f20137l;
                        C3438c c3438c4 = this.f20177b;
                        liveStreamDBHandler3.m15176L0(c3438c4.f20172e, c3438c4.f20175h.f20140o);
                        this.f20177b.f20175h.f20138m.m15278t(this.f20177b.f20172e);
                        LiveStreamDBHandler liveStreamDBHandler4 = this.f20177b.f20175h.f20137l;
                        C3438c c3438c5 = this.f20177b;
                        liveStreamDBHandler4.m15242p2(c3438c5.f20172e, c3438c5.f20175h.f20140o);
                    } else {
                        new DatabaseHandler(this.f20177b.f20175h.f20131h).m15113p(this.f20177b.f20172e);
                        new RecentWatchDBHandler(this.f20177b.f20175h.f20131h).m15309o(this.f20177b.f20172e);
                        LiveStreamDBHandler liveStreamDBHandler5 = new LiveStreamDBHandler(this.f20177b.f20175h.f20131h);
                        C3438c c3438c6 = this.f20177b;
                        liveStreamDBHandler5.m15196V0(c3438c6.f20172e, c3438c6.f20175h.f20140o);
                        C3438c c3438c7 = this.f20177b;
                        liveStreamDBHandler5.m15190S0(c3438c7.f20172e, c3438c7.f20175h.f20140o);
                        C3438c c3438c8 = this.f20177b;
                        liveStreamDBHandler5.m15176L0(c3438c8.f20172e, c3438c8.f20175h.f20140o);
                        C3438c c3438c9 = this.f20177b;
                        liveStreamDBHandler5.m15242p2(c3438c9.f20172e, c3438c9.f20175h.f20140o);
                        new SeriesRecentWatchDatabase(this.f20177b.f20175h.f20131h).m15327o();
                        this.f20177b.f20175h.f20138m.m15276q(this.f20177b.f20172e);
                    }
                    this.f20177b.f20175h.f20133i.remove(this.f20177b.f20173f);
                    C3438c c3438c10 = this.f20177b;
                    c3438c10.f20175h.m4087B(c3438c10.f20173f);
                    C3438c c3438c11 = this.f20177b;
                    MultiUserAdapter multiUserAdapter = c3438c11.f20175h;
                    multiUserAdapter.m4086A(c3438c11.f20173f, multiUserAdapter.f20133i.size());
                    this.f20177b.f20175h.m4099w();
                    Toast.makeText(this.f20177b.f20175h.f20131h, this.f20177b.f20175h.f20131h.getResources().getString(2132017889) + "  " + this.f20177b.f20168a, 0).show();
                    if (this.f20177b.f20175h.f20133i.size() == 0 && this.f20177b.f20175h.f20135j != null) {
                        this.f20177b.f20175h.f20135j.setVisibility(0);
                        this.f20177b.f20175h.f20136k.setVisibility(8);
                        this.f20177b.f20175h.f20127f.setNextFocusDownId(2131428318);
                    }
                    MultiUserAdapter.f20099j0.dismiss();
                }
            }
        }

        public C3438c(MultiUserAdapter multiUserAdapter, String str, String str2, String str3, String str4, int i10, int i11, MyViewHolder myViewHolder) {
            this.f20175h = multiUserAdapter;
            this.f20168a = str;
            this.f20169b = str2;
            this.f20170c = str3;
            this.f20171d = str4;
            this.f20172e = i10;
            this.f20173f = i11;
            this.f20174g = myViewHolder;
        }

        @Override // androidx.appcompat.widget.C0304c1.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            int itemId = menuItem.getItemId();
            if (itemId != 2131427828) {
                if (itemId != 2131428554) {
                    return false;
                }
                this.f20174g.rlOuter.performClick();
                return false;
            }
            if (this.f20175h.f20131h == null) {
                return false;
            }
            View inflate = ((LayoutInflater) this.f20175h.f20139n.getSystemService("layout_inflater")).inflate(2131624152, (RelativeLayout) this.f20175h.f20139n.findViewById(2131429033));
            PopupWindow unused = MultiUserAdapter.f20099j0 = new PopupWindow(this.f20175h.f20139n);
            MultiUserAdapter.f20099j0.setContentView(inflate);
            MultiUserAdapter.f20099j0.setWidth(-1);
            MultiUserAdapter.f20099j0.setHeight(-1);
            MultiUserAdapter.f20099j0.setFocusable(true);
            MultiUserAdapter.f20099j0.showAtLocation(inflate, 17, 0, 0);
            TextView textView = (TextView) inflate.findViewById(2131429411);
            Button button = (Button) inflate.findViewById(2131427628);
            Button button2 = (Button) inflate.findViewById(2131427605);
            if (textView != null) {
                textView.setText(this.f20175h.f20131h.getResources().getString(2132017559));
            }
            if (button != null) {
                button.setOnFocusChangeListener(new C5255e.i((View) button, this.f20175h.f20139n));
            }
            if (button2 != null) {
                button2.setOnFocusChangeListener(new C5255e.i((View) button2, this.f20175h.f20139n));
            }
            button2.setOnClickListener(new a(this));
            if (button == null) {
                return false;
            }
            button.setOnClickListener(new b(this));
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiUserAdapter$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.MultiUserAdapter$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiUserAdapter$d.class */
    public class DialogC3439d extends Dialog implements View.OnClickListener {

        /* renamed from: b */
        public Activity f20178b;

        /* renamed from: c */
        public TextView f20179c;

        /* renamed from: d */
        public TextView f20180d;

        /* renamed from: e */
        public LinearLayout f20181e;

        /* renamed from: f */
        public LinearLayout f20182f;

        /* renamed from: g */
        public final MultiUserAdapter f20183g;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiUserAdapter$d$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.MultiUserAdapter$d$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiUserAdapter$d$a.class */
        public class a implements View.OnFocusChangeListener {

            /* renamed from: b */
            public View f20184b;

            /* renamed from: c */
            public final DialogC3439d f20185c;

            public a(DialogC3439d dialogC3439d, View view) {
                this.f20185c = dialogC3439d;
                this.f20184b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z10) {
                int i10;
                LinearLayout linearLayout;
                if (z10) {
                    View view2 = this.f20184b;
                    i10 = 2131230846;
                    if (view2 == null || view2.getTag() == null || !this.f20184b.getTag().equals("1")) {
                        View view3 = this.f20184b;
                        if (view3 == null || view3.getTag() == null || !this.f20184b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f20185c.f20182f;
                    }
                    linearLayout = this.f20185c.f20181e;
                } else {
                    View view4 = this.f20184b;
                    i10 = 2131230845;
                    if (view4 == null || view4.getTag() == null || !this.f20184b.getTag().equals("1")) {
                        View view5 = this.f20184b;
                        if (view5 == null || view5.getTag() == null || !this.f20184b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f20185c.f20182f;
                    }
                    linearLayout = this.f20185c.f20181e;
                }
                linearLayout.setBackgroundResource(i10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogC3439d(MultiUserAdapter multiUserAdapter, Activity activity) {
            super(activity);
            this.f20183g = multiUserAdapter;
            this.f20178b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id2 = view.getId();
            if (id2 == 2131427639 || id2 == 2131427678) {
                try {
                    dismiss();
                } catch (Exception e10) {
                }
            }
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(this.f20183g.f20118S.m31288z().equals(C5251a.f30065s0) ? 2131624141 : 2131624140);
            this.f20179c = (TextView) findViewById(2131427678);
            this.f20180d = (TextView) findViewById(2131427639);
            this.f20181e = (LinearLayout) findViewById(2131428541);
            this.f20182f = (LinearLayout) findViewById(2131428448);
            this.f20179c.setOnClickListener(this);
            this.f20180d.setOnClickListener(this);
            TextView textView = this.f20179c;
            textView.setOnFocusChangeListener(new a(this, textView));
            TextView textView2 = this.f20180d;
            textView2.setOnFocusChangeListener(new a(this, textView2));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiUserAdapter$e.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.MultiUserAdapter$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiUserAdapter$e.class */
    public class AsyncTaskC3440e extends AsyncTask<String, String, Boolean> {

        /* renamed from: a */
        public final MultiUserAdapter f20186a;

        public AsyncTaskC3440e(MultiUserAdapter multiUserAdapter) {
            this.f20186a = multiUserAdapter;
        }

        public /* synthetic */ AsyncTaskC3440e(MultiUserAdapter multiUserAdapter, ViewOnLongClickListenerC3436a viewOnLongClickListenerC3436a) {
            this(multiUserAdapter);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0125 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:29:? A[LOOP:0: B:10:0x00e1->B:29:?, LOOP_END, SYNTHETIC] */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Boolean doInBackground(java.lang.String... r5) {
            /*
                Method dump skipped, instructions count: 365
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.adapter.MultiUserAdapter.AsyncTaskC3440e.doInBackground(java.lang.String[]):java.lang.Boolean");
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            try {
                if (!bool.booleanValue()) {
                    C5255e.m26241k0(this.f20186a.f20131h, this.f20186a.f20131h.getResources().getString(2132017796));
                    this.f20186a.f20131h.startActivity(C5251a.f30032c.booleanValue() ? new Intent(this.f20186a.f20131h, (Class<?>) MultiUserActivity.class) : new Intent(this.f20186a.f20131h, (Class<?>) RoutingActivity.class));
                    this.f20186a.f20139n.finish();
                } else {
                    if (!C5251a.f30014M.booleanValue()) {
                        this.f20186a.m17271f0();
                        return;
                    }
                    new AsyncTaskC3445j(this.f20186a).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f20186a.f20131h.getFilesDir() + "/data_temp.txt");
                }
            } catch (Exception e10) {
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(String... strArr) {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiUserAdapter$f.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.MultiUserAdapter$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiUserAdapter$f.class */
    public class AsyncTaskC3441f extends AsyncTask<Void, Boolean, Boolean> {

        /* renamed from: a */
        public final MultiUserAdapter f20187a;

        public AsyncTaskC3441f(MultiUserAdapter multiUserAdapter) {
            this.f20187a = multiUserAdapter;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("http://www.google.com").openConnection();
                httpURLConnection.setRequestMethod(HttpHead.METHOD_NAME);
                httpURLConnection.setReadTimeout(EtherType.IEEE802_3_MAX_LENGTH);
                httpURLConnection.setConnectTimeout(EtherType.IEEE802_3_MAX_LENGTH);
                return Boolean.valueOf(httpURLConnection.getResponseCode() == 200);
            } catch (Exception e10) {
                Log.e("LOG_TAG", e10.toString());
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (bool.booleanValue()) {
                this.f20187a.m17271f0();
                return;
            }
            this.f20187a.mo15997b();
            MultiUserAdapter multiUserAdapter = this.f20187a;
            DialogC3439d dialogC3439d = new DialogC3439d(multiUserAdapter, (Activity) multiUserAdapter.f20131h);
            dialogC3439d.setCancelable(false);
            dialogC3439d.show();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiUserAdapter$g.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.MultiUserAdapter$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiUserAdapter$g.class */
    public class AsyncTaskC3442g extends AsyncTask<Void, Boolean, Boolean> {

        /* renamed from: a */
        public final MultiUserAdapter f20188a;

        public AsyncTaskC3442g(MultiUserAdapter multiUserAdapter) {
            this.f20188a = multiUserAdapter;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("http://www.google.com").openConnection();
                httpURLConnection.setRequestMethod(HttpHead.METHOD_NAME);
                httpURLConnection.setReadTimeout(EtherType.IEEE802_3_MAX_LENGTH);
                httpURLConnection.setConnectTimeout(EtherType.IEEE802_3_MAX_LENGTH);
                return Boolean.valueOf(httpURLConnection.getResponseCode() == 200);
            } catch (Exception e10) {
                Log.e("LOG_TAG", e10.toString());
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (bool.booleanValue()) {
                new AsyncTaskC3444i(this.f20188a).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f20188a.f20146u);
                return;
            }
            this.f20188a.mo15997b();
            MultiUserAdapter multiUserAdapter = this.f20188a;
            DialogC3439d dialogC3439d = new DialogC3439d(multiUserAdapter, (Activity) multiUserAdapter.f20131h);
            dialogC3439d.setCancelable(false);
            dialogC3439d.show();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiUserAdapter$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.MultiUserAdapter$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiUserAdapter$h.class */
    public class ViewOnFocusChangeListenerC3443h implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f20189b;

        /* renamed from: c */
        public final MultiUserAdapter f20190c;

        public ViewOnFocusChangeListenerC3443h(MultiUserAdapter multiUserAdapter, View view) {
            this.f20190c = multiUserAdapter;
            this.f20189b = view;
        }

        /* renamed from: a */
        public final void m17281a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f20189b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m17282b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f20189b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m17283c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f20189b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            float f10 = 1.09f;
            if (z10) {
                if (!z10) {
                    f10 = 1.0f;
                }
                m17282b(f10);
                m17283c(f10);
                Log.e("id is", "" + this.f20189b.getTag());
                this.f20189b.setBackgroundResource(2131231898);
                if (this.f20189b.getTag() != null && this.f20189b.getTag().equals("8")) {
                    this.f20190c.f20110K.setBackgroundResource(2131230828);
                }
                if (this.f20189b.getTag() == null || !this.f20189b.getTag().equals("9")) {
                    return;
                }
                this.f20190c.f20111L.setBackgroundResource(2131231576);
                return;
            }
            if (z10) {
                return;
            }
            if (!z10) {
                f10 = 1.0f;
            }
            m17282b(f10);
            m17283c(f10);
            m17281a(z10);
            this.f20189b.setBackgroundResource(2131231897);
            View view2 = this.f20189b;
            if (view2 != null && view2.getTag() != null && this.f20189b.getTag().equals("8")) {
                this.f20190c.f20110K.setBackgroundResource(2131230845);
            }
            View view3 = this.f20189b;
            if (view3 == null || view3.getTag() == null || !this.f20189b.getTag().equals("9")) {
                return;
            }
            this.f20190c.f20111L.setBackgroundResource(2131230845);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiUserAdapter$i.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.MultiUserAdapter$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiUserAdapter$i.class */
    public class AsyncTaskC3444i extends AsyncTask<String, Void, Boolean> {

        /* renamed from: a */
        public String f20191a = "";

        /* renamed from: b */
        public String f20192b = "";

        /* renamed from: c */
        public int f20193c = -1;

        /* renamed from: d */
        public String f20194d = "";

        /* renamed from: e */
        public String f20195e = "";

        /* renamed from: f */
        public boolean f20196f = false;

        /* renamed from: g */
        public final MultiUserAdapter f20197g;

        public AsyncTaskC3444i(MultiUserAdapter multiUserAdapter) {
            this.f20197g = multiUserAdapter;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                boolean z10 = false;
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strArr[0]).openConnection();
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setReadTimeout(30000);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200 || responseCode == 405 || responseCode == 404) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            } catch (Exception e10) {
                Log.e("Google", e10.toString());
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            if (bool.booleanValue()) {
                new AsyncTaskC3440e(this.f20197g, null).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f20197g.f20146u);
            } else {
                this.f20197g.mo15997b();
                C5255e.m26241k0(this.f20197g.f20131h, this.f20197g.f20131h.getResources().getString(2132017796));
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiUserAdapter$j.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.MultiUserAdapter$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiUserAdapter$j.class */
    public class AsyncTaskC3445j extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        public String f20198a = "";

        /* renamed from: b */
        public String f20199b = "";

        /* renamed from: c */
        public int f20200c = -1;

        /* renamed from: d */
        public String f20201d = "";

        /* renamed from: e */
        public String f20202e = "";

        /* renamed from: f */
        public boolean f20203f = false;

        /* renamed from: g */
        public final MultiUserAdapter f20204g;

        public AsyncTaskC3445j(MultiUserAdapter multiUserAdapter) {
            this.f20204g = multiUserAdapter;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(String... strArr) {
            try {
                this.f20204g.f20106G = new FileInputStream(new File(strArr[0]));
                MultiUserAdapter multiUserAdapter = this.f20204g;
                return multiUserAdapter.f20107H.m37277c(multiUserAdapter.f20106G, multiUserAdapter.f20131h);
            } catch (Exception e10) {
                return "";
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            Toast makeText;
            boolean z10;
            super.onPostExecute(str);
            if (str.equals("")) {
                if (this.f20204g.f20137l != null) {
                    this.f20204g.f20137l.m15158D2("all", "2");
                }
                MultiUserAdapter multiUserAdapter = this.f20204g;
                multiUserAdapter.f20117R = false;
                multiUserAdapter.mo15997b();
                Toast.makeText(this.f20204g.f20131h, this.f20204g.f20131h.getResources().getString(2132018730), 1).show();
                return;
            }
            try {
                this.f20204g.f20132h0 = str;
                if (C5251a.f30034d.booleanValue()) {
                    if (C5251a.f30014M.booleanValue()) {
                        this.f20204g.m17260A0();
                        return;
                    }
                    MultiUserAdapter multiUserAdapter2 = this.f20204g;
                    multiUserAdapter2.f20114O = C9744f.m41039a(multiUserAdapter2.f20131h);
                    String str2 = this.f20204g.f20114O;
                    if (str2 != null && !str2.equals("") && !this.f20204g.f20114O.isEmpty()) {
                        this.f20204g.f20134i0 = new ArrayList<>(Arrays.asList(this.f20204g.f20114O.split(",")));
                    }
                    ArrayList<String> arrayList = this.f20204g.f20134i0;
                    if (arrayList == null || arrayList.size() < 1) {
                        this.f20204g.mo15997b();
                        makeText = Toast.makeText(this.f20204g.f20131h, this.f20204g.f20131h.getResources().getString(2132018343), 0);
                    } else {
                        int i10 = 0;
                        while (true) {
                            if (i10 >= this.f20204g.f20134i0.size()) {
                                z10 = false;
                                break;
                            } else {
                                if (this.f20204g.f20132h0 != null && this.f20204g.f20132h0.contains(this.f20204g.f20134i0.get(i10))) {
                                    this.f20204g.m17260A0();
                                    z10 = true;
                                    break;
                                }
                                i10++;
                            }
                        }
                        if (z10) {
                            return;
                        }
                        this.f20204g.mo15997b();
                        makeText = Toast.makeText(this.f20204g.f20131h, this.f20204g.f20131h.getResources().getString(2132017877), 0);
                    }
                    makeText.show();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public MultiUserAdapter(MultiUserActivity multiUserActivity, List<MultiUserDBModel> list, Context context, LinearLayout linearLayout, TextView textView, String str, MultiUserDBModel multiUserDBModel, LinearLayout linearLayout2) {
        this.f20148w = "";
        this.f20119T = "false";
        this.f20126e = multiUserDBModel;
        this.f20133i = list;
        this.f20139n = multiUserActivity;
        this.f20131h = context;
        this.f20119T = str;
        this.f20136k = textView;
        this.f20135j = linearLayout;
        this.f20142q = new C5371c(this, context);
        this.f20137l = new LiveStreamDBHandler(context);
        this.f20118S = new C6783a(context);
        this.f20125Z = multiUserActivity.getSharedPreferences("loginPrefs", 0);
        SharedPreferences sharedPreferences = multiUserActivity.getSharedPreferences("sharedPreference", 0);
        this.f20128f0 = sharedPreferences;
        this.f20130g0 = sharedPreferences.edit();
        this.f20127f = linearLayout2;
        if (!C5251a.f30014M.booleanValue()) {
            m17261B0();
            m17269d0();
            m17238F0();
            m17270e0();
        }
        this.f20105F = new DatabaseHandler(context);
        this.f20138m = new MultiUserDBHandler(context);
        this.f20148w = context.getSharedPreferences("selected_language", 0).getString("selected_language", "English");
        ProgressDialog progressDialog = new ProgressDialog(context);
        this.f20147v = progressDialog;
        progressDialog.setMessage(context.getResources().getString(2132018352));
        this.f20147v.setCanceledOnTouchOutside(false);
        this.f20147v.setCancelable(false);
        this.f20147v.setProgressStyle(0);
    }

    /* renamed from: C0 */
    public static String m17236C0(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (char c10 : charArray) {
            if (z10 && Character.isLetter(c10)) {
                sb2.append(Character.toUpperCase(c10));
                z10 = false;
            } else {
                if (Character.isWhitespace(c10)) {
                    z10 = true;
                }
                sb2.append(c10);
            }
        }
        return sb2.toString();
    }

    /* renamed from: E0 */
    public static long m17237E0(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0L;
        }
    }

    /* renamed from: F0 */
    public static String m17238F0() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return m17236C0(str2);
        }
        return m17236C0(str) + " " + str2;
    }

    /* renamed from: H0 */
    public static String m17239H0(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : digest) {
                String hexString = Integer.toHexString(b10 & 255);
                while (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                sb2.append(hexString);
            }
            return sb2.toString();
        } catch (NoSuchAlgorithmException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* renamed from: A0 */
    public final void m17260A0() {
        Context context;
        try {
            SharedPreferences.Editor edit = this.f20131h.getSharedPreferences("loginPrefs", 0).edit();
            SharedPreferences.Editor edit2 = this.f20131h.getSharedPreferences("loginprefsmultiuser", 0).edit();
            edit2.putString("name", this.f20143r);
            edit2.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "playlist");
            edit2.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "playlist");
            edit2.putString(C5251a.f30066t, this.f20146u);
            edit.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "playlist");
            edit.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "playlist");
            edit.putString("serverPort", "");
            edit.putString("serverUrl", this.f20146u);
            edit.putString("serverM3UUrl", this.f20146u);
            edit.putString(C5251a.f30066t, this.f20146u);
            edit.apply();
            edit2.apply();
            SharedPreferences sharedPreferences = this.f20131h.getSharedPreferences("allowedFormat", 0);
            this.f20101B = sharedPreferences;
            this.f20102C = sharedPreferences.edit();
            SharedPreferences sharedPreferences2 = this.f20131h.getSharedPreferences("timeFormat", 0);
            this.f20103D = sharedPreferences2;
            this.f20104E = sharedPreferences2.edit();
            String string = this.f20101B.getString("allowedFormat", "");
            if (string != null && string.equals("")) {
                this.f20102C.putString("allowedFormat", "ts");
                this.f20102C.apply();
            }
            String string2 = this.f20103D.getString("timeFormat", C5251a.f30053m0);
            if (string2 != null && string2.equals("")) {
                this.f20104E.putString("timeFormat", C5251a.f30053m0);
                this.f20104E.apply();
            }
            SharedPreferences sharedPreferences3 = this.f20131h.getSharedPreferences("sharedprefremberme", 0);
            this.f20151z = sharedPreferences3;
            SharedPreferences.Editor edit3 = sharedPreferences3.edit();
            this.f20100A = edit3;
            edit3.putBoolean("savelogin", true);
            this.f20100A.apply();
            mo15997b();
            try {
                Context context2 = this.f20131h;
                Toast.makeText(context2, context2.getResources().getString(2132017976), 0).show();
            } catch (WindowManager.BadTokenException e10) {
            }
            ImportStatusModel m15222h2 = this.f20137l.m15222h2("all");
            if (m15222h2 != null) {
                if ((m15222h2.m15137d() == null || !m15222h2.m15137d().equals("0")) && (m15222h2.m15137d() == null || !m15222h2.m15137d().equals("2"))) {
                    if (m15222h2.m15137d() != null && m15222h2.m15137d().equals("1")) {
                        long m17237E0 = m17237E0(new SimpleDateFormat("dd/MM/yyyy", Locale.US), m15222h2.m15134a(), C5255e.m26235h());
                        if (!m17262D0() || m17237E0 < this.f20118S.m31269g()) {
                            this.f20131h.startActivity(new Intent(this.f20131h, (Class<?>) NewDashboardActivity.class));
                            context = this.f20131h;
                        } else {
                            this.f20131h.startActivity(new Intent(this.f20131h, (Class<?>) ImportM3uActivity.class));
                            context = this.f20131h;
                        }
                    } else {
                        if (m15222h2.m15137d() == null || !m15222h2.m15137d().equals("3")) {
                            return;
                        }
                        this.f20131h.startActivity(new Intent(this.f20131h, (Class<?>) ImportM3uActivity.class));
                        context = this.f20131h;
                    }
                } else {
                    if (this.f20131h == null) {
                        return;
                    }
                    this.f20131h.startActivity(new Intent(this.f20131h, (Class<?>) ImportM3uActivity.class));
                    context = this.f20131h;
                }
                ((Activity) context).finish();
            }
        } catch (Exception e11) {
        }
    }

    /* renamed from: B0 */
    public void m17261B0() {
        try {
            this.f20122W = this.f20139n.getPackageManager().getPackageInfo(this.f20139n.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
        }
    }

    @Override // p324sf.InterfaceC8567f
    /* renamed from: D */
    public void mo15980D(LoginCallback loginCallback, String str, ArrayList<String> arrayList) {
        Context context;
        Resources resources;
        int i10;
        if ((loginCallback == null || loginCallback.m15009b() != null) && ((loginCallback == null || loginCallback.m15008a() != null) && (loginCallback == null || loginCallback.m15009b() == null || loginCallback.m15009b().m15084c().intValue() != 1 || loginCallback.m15009b().m15090i() == null || loginCallback.m15009b().m15090i().equals("Active")))) {
            if (loginCallback == null || loginCallback.m15009b() == null) {
                mo15997b();
                mo15998c(this.f20131h.getResources().getString(2132017876));
                return;
            }
            if (loginCallback.m15009b().m15084c().intValue() == 1) {
                if (loginCallback.m15009b().m15090i().equals("Active")) {
                    String m15091j = loginCallback.m15009b().m15091j();
                    String m15089h = loginCallback.m15009b().m15089h();
                    String m15061b = loginCallback.m15008a().m15061b();
                    String m15065f = loginCallback.m15008a().m15065f();
                    String m15086e = loginCallback.m15009b().m15086e();
                    String m15087f = loginCallback.m15009b().m15087f();
                    String m15082a = loginCallback.m15009b().m15082a();
                    String m15085d = loginCallback.m15009b().m15085d();
                    String m15088g = loginCallback.m15009b().m15088g();
                    List<String> m15083b = loginCallback.m15009b().m15083b();
                    String m15063d = loginCallback.m15008a().m15063d();
                    String m15060a = loginCallback.m15008a().m15060a();
                    String m15062c = loginCallback.m15008a().m15062c();
                    String m15064e = loginCallback.m15008a().m15064e();
                    if (m15083b.size() != 0) {
                        m15083b.get(0);
                    }
                    String lowerCase = this.f20131h.getSharedPreferences("loginPrefsserverurl", 0).getString(C5251a.f30066t, "").toLowerCase();
                    SharedPreferences.Editor edit = this.f20131h.getSharedPreferences("loginPrefs", 0).edit();
                    edit.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, m15091j);
                    edit.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, m15089h);
                    edit.putString("serverPort", m15061b);
                    edit.putString("serverUrl", m15065f);
                    edit.putString("expDate", m15086e);
                    edit.putString("isTrial", m15087f);
                    edit.putString("activeCons", m15082a);
                    edit.putString("createdAt", m15085d);
                    edit.putString("maxConnections", m15088g);
                    edit.putString(C5251a.f30066t, m15065f + ":" + m15061b);
                    edit.putString("serverProtocol", m15063d);
                    edit.putString("serverPortHttps", m15060a);
                    edit.putString("serverPortRtmp", m15062c);
                    edit.putString("serverTimeZone", m15064e);
                    edit.apply();
                    new MultiUserDBHandler(this.f20131h);
                    if (C5251a.f30032c.booleanValue()) {
                        C5251a.f30013L = Boolean.TRUE;
                        SharepreferenceDBHandler.m15351O("api", this.f20131h);
                        SharedPreferences.Editor edit2 = this.f20131h.getSharedPreferences("loginprefsmultiuser", 0).edit();
                        edit2.putString("name", this.f20143r);
                        edit2.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, m15091j);
                        edit2.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, m15089h);
                        edit2.putString(C5251a.f30066t, m15065f);
                        edit2.apply();
                        new MultiUserDBHandler(this.f20131h).m15280v0(SharepreferenceDBHandler.m15337A(this.f20131h), lowerCase, m15065f);
                        mo15997b();
                        if (this.f20131h != null) {
                            this.f20131h.startActivity(new Intent(this.f20131h, (Class<?>) NewDashboardActivity.class));
                            ((Activity) this.f20131h).finish();
                            return;
                        }
                        return;
                    }
                    return;
                }
                mo15997b();
                if (C5251a.f30030b.booleanValue()) {
                    context = this.f20131h;
                    resources = context.getResources();
                    i10 = 2132017872;
                }
            } else {
                if (!str.equals("validateLogin")) {
                    return;
                }
                mo15997b();
                context = this.f20131h;
                resources = context.getResources();
                i10 = 2132017873;
            }
            Toast.makeText(context, resources.getString(i10), 0).show();
            return;
        }
        if (arrayList != null && arrayList.size() > 0) {
            try {
                this.f20149x.putString(C5251a.f30066t, arrayList.get(0).trim());
                this.f20149x.apply();
                arrayList.remove(0);
                this.f20142q.m26704h(this.f20144s, this.f20145t, arrayList);
                return;
            } catch (IOException e10) {
                e10.printStackTrace();
                return;
            }
        }
        mo15997b();
        C5255e.m26241k0(this.f20131h, "Your Account is invalid or has expired !");
    }

    /* renamed from: D0 */
    public boolean m17262D0() {
        return this.f20131h.getSharedPreferences("automation_channels", 0).getString("automation_channels", "").equals("checked");
    }

    @Override // p407xe.InterfaceC9741c
    /* renamed from: E */
    public void mo15570E(int i10) {
        if (this.f20131h != null) {
            try {
                mo15997b();
                if (SharepreferenceDBHandler.m15373f(this.f20131h).equals("m3u")) {
                    String str = this.f20109J;
                    if (str == null || !str.equals(TransferTable.COLUMN_FILE)) {
                        String str2 = this.f20109J;
                        if (str2 != null && str2.equals("url")) {
                            new AsyncTaskC3445j(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f20131h.getFilesDir() + "/data_temp.txt");
                        }
                    } else {
                        new AsyncTaskC3445j(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f20146u);
                    }
                } else {
                    this.f20142q.m26703g(this.f20144s, this.f20145t);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* renamed from: G0 */
    public boolean m17263G0() {
        int checkSelfPermission;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23) {
            Log.v("TAG", "Permission is granted");
            return true;
        }
        if (i10 >= 33) {
            return true;
        }
        checkSelfPermission = this.f20131h.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE");
        if (checkSelfPermission == 0) {
            Log.v("TAG", "Permission is granted");
            return true;
        }
        Log.v("TAG", "Permission is revoked");
        C0936d.m5641r((Activity) this.f20131h, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 1);
        return false;
    }

    @Override // p324sf.InterfaceC8567f
    /* renamed from: H */
    public void mo15984H(ArrayList<String> arrayList, String str) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    @SuppressLint({"RecyclerView"})
    /* renamed from: I0, reason: merged with bridge method [inline-methods] */
    public void mo2996G(MyViewHolder myViewHolder, int i10) {
        ImageView imageView;
        int i11;
        TextView textView;
        StringBuilder sb2;
        SharedPreferences sharedPreferences = this.f20131h.getSharedPreferences("loginprefsmultiuser", 0);
        String string = sharedPreferences.getString("name", "");
        String string2 = sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        String string3 = sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        String string4 = sharedPreferences.getString(C5251a.f30066t, "");
        List<MultiUserDBModel> list = this.f20133i;
        if (list == null || list.size() <= 0) {
            return;
        }
        MultiUserDBModel multiUserDBModel = this.f20133i.get(i10);
        myViewHolder.tvMovieCategoryName.setSelected(true);
        this.f20150y = this.f20131h.getSharedPreferences("loginPrefsserverurl", 0);
        SharedPreferences sharedPreferences2 = this.f20131h.getSharedPreferences("sharedprefremberme", 0);
        this.f20151z = sharedPreferences2;
        this.f20100A = sharedPreferences2.edit();
        String m14875e = multiUserDBModel.m14875e();
        String m14877g = multiUserDBModel.m14877g();
        String m14876f = multiUserDBModel.m14876f();
        String m14873c = multiUserDBModel.m14873c();
        String m14874d = multiUserDBModel.m14874d();
        String m14872b = multiUserDBModel.m14872b();
        if ((m14872b == null || !m14872b.equals(TransferTable.COLUMN_FILE)) && (m14872b == null || !m14872b.equals("url"))) {
            this.f20140o = "api";
        } else {
            this.f20140o = "m3u";
        }
        myViewHolder.rlDelete.setFocusable(false);
        if (m14874d == null) {
            m14874d = "";
        }
        int m15282y = this.f20138m.m15282y(m14875e, m14877g, m14876f, m14873c, this.f20140o, m14874d);
        if (m14875e != null) {
            myViewHolder.tvMovieCategoryName.setText(m14875e);
        }
        if (this.f20140o.equals("m3u")) {
            if (m14875e == null || m14877g == null || m14876f == null || m14873c == null || !m14875e.equals(string) || !m14873c.contains(string4) || !m14877g.equals(string2) || !m14876f.equals(string3)) {
                imageView = myViewHolder.ivUserimg;
                i11 = 2131231412;
            } else {
                imageView = myViewHolder.ivUserimg;
                i11 = 2131231414;
            }
            imageView.setImageResource(i11);
            if (multiUserDBModel.m14872b().equals(TransferTable.COLUMN_FILE)) {
                if (m14873c != null) {
                    this.f20108I = m14873c;
                    textView = myViewHolder.tvServerName;
                    sb2 = new StringBuilder();
                    sb2.append("File : ");
                    sb2.append(m14873c);
                    textView.setText(sb2.toString());
                    myViewHolder.tvServerName.setSelected(true);
                    myViewHolder.tvServerName.setVisibility(0);
                }
            } else if (m14873c != null) {
                textView = myViewHolder.tvServerName;
                sb2 = new StringBuilder();
                sb2.append("URL : ");
                sb2.append(m14873c);
                textView.setText(sb2.toString());
                myViewHolder.tvServerName.setSelected(true);
                myViewHolder.tvServerName.setVisibility(0);
            }
        } else {
            if ((m14875e == null || m14877g == null || m14876f == null || m14873c == null || !m14875e.equals(string) || !m14873c.contains(string4) || !m14877g.equals(string2) || !m14876f.equals(string3)) && !(m14875e != null && m14877g != null && m14876f != null && m14875e.equals(string) && m14874d.contains(string4) && m14877g.equals(string2) && m14876f.equals(string3))) {
                myViewHolder.ivUserimg.setImageResource(2131231657);
            } else {
                myViewHolder.ivUserimg.setImageResource(2131231658);
            }
            if (C5251a.f30014M.booleanValue() && m14873c != null) {
                myViewHolder.tvServerName.setText("URL : " + m14873c);
                myViewHolder.tvServerName.setSelected(true);
                myViewHolder.tvServerName.setVisibility(0);
            }
            if (this.f20133i.get(i10).m14871a().equalsIgnoreCase(C5251a.f30071v0)) {
                String m15363a = SharepreferenceDBHandler.m15363a(this.f20131h);
                myViewHolder.tvUserName.setText(this.f20131h.getResources().getString(2132017255) + " : " + m15363a);
            } else if (m14877g != null) {
                myViewHolder.tvUserName.setText(this.f20131h.getResources().getString(2132018764) + " : " + m14877g);
            }
            myViewHolder.tvUserName.setSelected(true);
        }
        myViewHolder.rlOuter.setOnLongClickListener(new ViewOnLongClickListenerC3436a(this, m14875e, m14877g, m14876f, m14873c, myViewHolder, i10, m15282y));
        myViewHolder.rlOuter.setOnClickListener(new ViewOnClickListenerC3437b(this, m14877g, m14876f, m14873c, m14875e, multiUserDBModel, m15282y));
        RelativeLayout relativeLayout = myViewHolder.rlOuter;
        relativeLayout.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3443h(this, relativeLayout));
        if (i10 == 0 && this.f20129g) {
            myViewHolder.rlOuter.requestFocus();
            this.f20129g = false;
        }
        RelativeLayout relativeLayout2 = myViewHolder.rlDelete;
        relativeLayout2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3443h(this, relativeLayout2));
        if (i10 == 0 && this.f20129g) {
            myViewHolder.rlDelete.requestFocus();
            this.f20129g = false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    @SuppressLint({"RtlHardcoded"})
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder mo2998J(ViewGroup viewGroup, int i10) {
        LayoutInflater from;
        int i11;
        if (C5251a.f30014M.booleanValue()) {
            from = LayoutInflater.from(viewGroup.getContext());
            i11 = 2131624244;
        } else {
            from = LayoutInflater.from(viewGroup.getContext());
            i11 = 2131624243;
        }
        View inflate = from.inflate(i11, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(2131429604);
        if (this.f20148w.equalsIgnoreCase("Arabic")) {
            textView.setGravity(21);
        }
        return new MyViewHolder(inflate);
    }

    @Override // p407xe.InterfaceC9741c
    /* renamed from: K0, reason: merged with bridge method [inline-methods] */
    public void mo15571Y(String str, int i10, boolean z10) {
        if (!z10) {
            mo15997b();
            Context context = this.f20131h;
            Toast.makeText(context, context.getResources().getString(2132017529), 0).show();
            return;
        }
        if (i10 == 1) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                C9740b.f44453a = jSONObject;
                if (!jSONObject.getString("status").equalsIgnoreCase("true")) {
                    mo15997b();
                    Context context2 = this.f20131h;
                    Toast.makeText(context2, context2.getResources().getString(2132018652), 0).show();
                    return;
                }
                this.f20114O = C9740b.f44453a.getString("su");
                this.f20115P = C9740b.f44453a.getString("ndd");
                this.f20116Q = System.currentTimeMillis();
                try {
                    C9744f.m41043e(this.f20139n, C9740b.f44453a.optString("su"));
                    this.f20124Y = m17239H0(C9740b.f44453a.optString("su") + Marker.ANY_MARKER + C9744f.m41042d(this.f20139n) + Marker.ANY_MARKER + C9740b.f44454b);
                    C9740b.f44453a.getString("sc").equalsIgnoreCase(this.f20124Y);
                    if (SharepreferenceDBHandler.m15373f(this.f20131h).equals("m3u")) {
                        String str2 = this.f20109J;
                        if (str2 != null && str2.equals(TransferTable.COLUMN_FILE)) {
                            new AsyncTaskC3445j(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f20146u);
                            return;
                        }
                        String str3 = this.f20109J;
                        if (str3 == null || !str3.equals("url")) {
                            return;
                        }
                        new AsyncTaskC3445j(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f20131h.getFilesDir() + "/data_temp.txt");
                        return;
                    }
                    String str4 = this.f20114O;
                    ArrayList arrayList = null;
                    if (str4 != null) {
                        arrayList = null;
                        if (!str4.equals("")) {
                            arrayList = null;
                            if (!this.f20114O.isEmpty()) {
                                this.f20114O = this.f20114O.toLowerCase();
                                arrayList = new ArrayList(Arrays.asList(this.f20114O.split(",")));
                            }
                        }
                    }
                    boolean z11 = false;
                    if (arrayList != null) {
                        z11 = false;
                        if (arrayList.size() > 0) {
                            int i11 = 0;
                            while (true) {
                                z11 = false;
                                if (i11 >= arrayList.size()) {
                                    break;
                                }
                                if (this.f20146u.contains((CharSequence) arrayList.get(i11))) {
                                    z11 = true;
                                    break;
                                }
                                i11++;
                            }
                        }
                    }
                    if (z11) {
                        this.f20142q.m26703g(this.f20144s, this.f20145t);
                    } else {
                        m17268M0(this.f20114O.toLowerCase());
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            } catch (Exception e11) {
            }
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: L0 */
    public final void m17267L0(MyViewHolder myViewHolder, int i10, String str, int i11, View view, String str2, String str3, String str4) {
        String m14872b = this.f20133i.get(i10).m14872b();
        this.f20140o = ((m14872b == null || !m14872b.equals(TransferTable.COLUMN_FILE)) && (m14872b == null || !m14872b.equals("url"))) ? "api" : "m3u";
        C0304c1 c0304c1 = new C0304c1(this.f20131h, myViewHolder.testing);
        try {
            Field declaredField = C0304c1.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(c0304c1);
            obj.getClass().getDeclaredMethod("setForceShowIcon", Boolean.TYPE).invoke(obj, Boolean.TRUE);
        } catch (Exception e10) {
        }
        c0304c1.m1276c().inflate(2131689477, c0304c1.m1275b());
        c0304c1.m1279f(new C3438c(this, str, str2, str3, str4, i11, i10, myViewHolder));
        c0304c1.m1280g();
    }

    /* renamed from: M0 */
    public final void m17268M0(String str) {
        if (str != null && !str.equals("") && !str.isEmpty()) {
            this.f20134i0 = new ArrayList<>(Arrays.asList(str.split(",")));
        }
        ArrayList<String> arrayList = this.f20134i0;
        if (arrayList == null || arrayList.size() < 1) {
            ArrayList<String> arrayList2 = this.f20134i0;
            if (arrayList2 == null || arrayList2.size() != 0) {
                return;
            }
            mo15997b();
            Toast.makeText(this.f20131h, "Your Account is invalid or has expired !", 0).show();
            return;
        }
        try {
            this.f20149x.putString(C5251a.f30066t, this.f20134i0.get(0).trim());
            this.f20149x.commit();
            this.f20134i0.remove(0);
            this.f20142q.m26704h(this.f20144s, this.f20145t, this.f20134i0);
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    @Override // p324sf.InterfaceC8567f
    /* renamed from: P */
    public void mo15991P(String str) {
        mo15997b();
        C5255e.m26241k0(this.f20131h, str);
    }

    @Override // p324sf.InterfaceC8567f
    /* renamed from: Q */
    public void mo15993Q(ArrayList<String> arrayList, String str) {
        if (arrayList == null || arrayList.size() <= 0) {
            mo15997b();
            if (!C5251a.f30030b.booleanValue()) {
                C5255e.m26241k0(this.f20131h, "Your Account is invalid or has expired !");
                return;
            } else {
                Context context = this.f20131h;
                Toast.makeText(context, context.getResources().getString(2132017872), 0).show();
                return;
            }
        }
        try {
            this.f20149x.putString(C5251a.f30066t, arrayList.get(0).trim());
            this.f20149x.apply();
            arrayList.remove(0);
            this.f20142q.m26704h(this.f20144s, this.f20145t, arrayList);
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: a */
    public void mo15996a() {
        ProgressDialog progressDialog = this.f20147v;
        if (progressDialog != null) {
            progressDialog.show();
        }
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: b */
    public void mo15997b() {
        try {
            ProgressDialog progressDialog = this.f20147v;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        } catch (Exception e10) {
        }
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: c */
    public void mo15998c(String str) {
        mo15997b();
        C5255e.m26241k0(this.f20131h, str);
    }

    /* renamed from: d0 */
    public void m17269d0() {
        this.f20121V = Build.VERSION.RELEASE + " " + Build.VERSION_CODES.class.getFields()[Build.VERSION.SDK_INT].getName();
    }

    /* renamed from: e0 */
    public void m17270e0() {
        int nextInt = new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS;
        this.f20123X = nextInt;
        C9740b.f44454b = String.valueOf(nextInt);
    }

    /* renamed from: f0 */
    public void m17271f0() {
        StringBuilder sb2;
        List<C9743e> list;
        String str = "playlist";
        if (SharepreferenceDBHandler.m15373f(this.f20131h).equals("m3u")) {
            sb2 = new StringBuilder();
            sb2.append(C9744f.m41041c(this.f20131h));
            sb2.append(Marker.ANY_MARKER);
            sb2.append(C9744f.m41042d(this.f20131h));
            sb2.append("-");
            sb2.append("playlist");
        } else {
            sb2 = new StringBuilder();
            sb2.append(C9744f.m41041c(this.f20131h));
            sb2.append(Marker.ANY_MARKER);
            sb2.append(C9744f.m41042d(this.f20131h));
            sb2.append("-");
            sb2.append(this.f20144s);
        }
        sb2.append("-");
        sb2.append(C9740b.f44454b);
        sb2.append("-");
        sb2.append(this.f20122W);
        sb2.append("-unknown-");
        sb2.append(m17238F0());
        sb2.append("-");
        sb2.append(this.f20121V);
        this.f20120U = m17239H0(sb2.toString());
        ArrayList arrayList = new ArrayList();
        C9745g.f44476b = arrayList;
        arrayList.add(C9745g.m41047a("m", "gu"));
        C9745g.f44476b.add(C9745g.m41047a("k", C9744f.m41041c(this.f20139n)));
        C9745g.f44476b.add(C9745g.m41047a("sc", this.f20120U));
        if (SharepreferenceDBHandler.m15373f(this.f20131h).equals("m3u")) {
            list = C9745g.f44476b;
        } else {
            list = C9745g.f44476b;
            str = this.f20144s;
        }
        list.add(C9745g.m41047a("u", str));
        C9745g.f44476b.add(C9745g.m41047a("pw", "no_password"));
        C9745g.f44476b.add(C9745g.m41047a("r", C9740b.f44454b));
        C9745g.f44476b.add(C9745g.m41047a("av", this.f20122W));
        C9745g.f44476b.add(C9745g.m41047a("dt", "unknown"));
        C9745g.f44476b.add(C9745g.m41047a("d", m17238F0()));
        C9745g.f44476b.add(C9745g.m41047a("do", this.f20121V));
        C9745g.f44477c.m41048b(this);
    }

    @Override // p324sf.InterfaceC8567f
    /* renamed from: i */
    public void mo15999i(LoginCallback loginCallback, String str) {
        Toast makeText;
        Intent intent;
        if (this.f20131h != null) {
            if (loginCallback == null || loginCallback.m15009b() == null) {
                mo15997b();
                mo15998c(this.f20131h.getResources().getString(2132017876));
                return;
            }
            if (loginCallback.m15009b().m15084c().intValue() == 1) {
                String m15090i = loginCallback.m15009b().m15090i();
                if (m15090i.equals("Active")) {
                    String m15091j = loginCallback.m15009b().m15091j();
                    String m15089h = loginCallback.m15009b().m15089h();
                    String m15061b = loginCallback.m15008a().m15061b();
                    String m15065f = loginCallback.m15008a().m15065f();
                    String m15086e = loginCallback.m15009b().m15086e();
                    String m15087f = loginCallback.m15009b().m15087f();
                    String m15082a = loginCallback.m15009b().m15082a();
                    String m15085d = loginCallback.m15009b().m15085d();
                    String m15088g = loginCallback.m15009b().m15088g();
                    String m15063d = loginCallback.m15008a().m15063d();
                    String m15060a = loginCallback.m15008a().m15060a();
                    String m15062c = loginCallback.m15008a().m15062c();
                    String m15064e = loginCallback.m15008a().m15064e();
                    SharedPreferences.Editor edit = this.f20131h.getSharedPreferences("loginPrefs", 0).edit();
                    SharedPreferences sharedPreferences = this.f20131h.getSharedPreferences("loginprefsmultiuser", 0);
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    String string = sharedPreferences.getString("name", "");
                    String string2 = sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
                    String string3 = sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
                    String string4 = sharedPreferences.getString(C5251a.f30066t, "");
                    edit2.putString("name", this.f20143r);
                    edit2.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, m15091j);
                    edit2.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, m15089h);
                    edit2.putString(C5251a.f30066t, m15065f);
                    new MultiUserDBHandler(this.f20131h).m15277q0(SharepreferenceDBHandler.m15337A(this.f20131h), m15065f);
                    edit.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, m15091j);
                    edit.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, m15089h);
                    edit.putString("serverPort", m15061b);
                    edit.putString("serverUrl", m15065f);
                    edit.putString("expDate", m15086e);
                    edit.putString("isTrial", m15087f);
                    edit.putString("activeCons", m15082a);
                    edit.putString("createdAt", m15085d);
                    edit.putString("maxConnections", m15088g);
                    edit.putString(C5251a.f30066t, m15065f);
                    edit.putString("serverProtocol", m15063d);
                    edit.putString("serverPortHttps", m15060a);
                    edit.putString("serverPortRtmp", m15062c);
                    edit.putString("serverTimeZone", m15064e);
                    edit.apply();
                    edit2.apply();
                    SharedPreferences sharedPreferences2 = this.f20131h.getSharedPreferences("allowedFormat", 0);
                    this.f20101B = sharedPreferences2;
                    this.f20102C = sharedPreferences2.edit();
                    SharedPreferences sharedPreferences3 = this.f20131h.getSharedPreferences("timeFormat", 0);
                    this.f20103D = sharedPreferences3;
                    this.f20104E = sharedPreferences3.edit();
                    String string5 = this.f20101B.getString("allowedFormat", "");
                    if (string5 != null && string5.equals("")) {
                        this.f20102C.putString("allowedFormat", "ts");
                        this.f20102C.apply();
                    }
                    String string6 = this.f20103D.getString("timeFormat", C5251a.f30053m0);
                    if (string6 != null && string6.equals("")) {
                        this.f20104E.putString("timeFormat", C5251a.f30053m0);
                        this.f20104E.apply();
                    }
                    SharedPreferences sharedPreferences4 = this.f20131h.getSharedPreferences("sharedprefremberme", 0);
                    this.f20151z = sharedPreferences4;
                    SharedPreferences.Editor edit3 = sharedPreferences4.edit();
                    this.f20100A = edit3;
                    edit3.putBoolean("savelogin", true);
                    this.f20100A.apply();
                    mo15997b();
                    try {
                        Context context = this.f20131h;
                        Toast.makeText(context, context.getResources().getString(2132017976), 0).show();
                    } catch (WindowManager.BadTokenException e10) {
                    }
                    if (this.f20131h != null && this.f20143r.equals(string) && this.f20144s.equals(string2) && this.f20145t.equals(string3) && m15065f.equals(string4)) {
                        intent = new Intent(this.f20131h, (Class<?>) NewDashboardActivity.class);
                    } else if (this.f20131h == null) {
                        return;
                    } else {
                        intent = new Intent(this.f20131h, (Class<?>) NewDashboardActivity.class);
                    }
                    this.f20131h.startActivity(intent);
                    ((Activity) this.f20131h).finish();
                    return;
                }
                mo15997b();
                makeText = Toast.makeText(this.f20131h, this.f20131h.getResources().getString(2132017878) + m15090i, 0);
            } else {
                mo15997b();
                Context context2 = this.f20131h;
                makeText = Toast.makeText(context2, context2.getResources().getString(2132017873), 0);
            }
            makeText.show();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        return this.f20133i.size();
    }

    @Override // p324sf.InterfaceC8567f
    /* renamed from: t */
    public void mo16003t(String str) {
    }
}

package com.maxdigitall.maxdigitaliptvbox.view.fragment;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.DialogC0242a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import cf.C1087k;
import com.google.android.exoplayer2.p048ui.PlayerView;
import com.maxdigitall.maxdigitaliptvbox.model.EpgChannelModel;
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteM3UModel;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.PasswordStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.XMLTVProgrammePojo;
import com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity;
import com.maxdigitall.maxdigitaliptvbox.view.activity.SettingsActivity;
import com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSmallEPG;
import com.maxdigitall.maxdigitaliptvbox.view.utility.epg.EPG;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import nf.C6783a;
import org.apache.commons.codec.language.p254bm.Rule;
import org.joda.time.LocalDateTime;
import p010a9.C0135a;
import p030c0.C0936d;
import p099fc.C4803d0;
import p151if.C5255e;
import p371vf.InterfaceC9344a;
import p408xf.C9746a;
import wf.C9571a;
import wf.C9572b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/NewEPGFragment.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/NewEPGFragment.class */
public class NewEPGFragment extends Fragment {

    /* renamed from: F */
    public static final int[] f22094F = {0, 1, 2, 3, 4, 5};

    /* renamed from: G */
    public static C6783a f22095G;

    /* renamed from: B */
    public SharedPreferences f22097B;

    /* renamed from: C */
    public String f22098C;

    /* renamed from: D */
    public String f22099D;

    @BindView
    public LinearLayout app_video_box;

    @BindView
    public ProgressBar app_video_loading;

    @BindView
    public LinearLayout app_video_status;

    @BindView
    public TextView app_video_status_text;

    /* renamed from: b */
    public Context f22101b;

    /* renamed from: c */
    public DatabaseHandler f22102c;

    @BindView
    public TextView currentEvent;

    @BindView
    public TextView currentEventDescription;

    @BindView
    public TextView currentEventTime;

    /* renamed from: d */
    public Unbinder f22103d;

    /* renamed from: e */
    public LiveStreamDBHandler f22104e;

    @BindView
    public EPG epg;

    @BindView
    public RelativeLayout epgFragment;

    @BindView
    public LinearLayout epgView;

    /* renamed from: h */
    public SharedPreferences f22107h;

    /* renamed from: i */
    public SharedPreferences f22108i;

    /* renamed from: j */
    public SharedPreferences f22109j;

    @BindView
    public NSTIJKPlayerSmallEPG mVideoView;

    /* renamed from: n */
    public Toolbar f22113n;

    /* renamed from: o */
    public TextView f22114o;

    /* renamed from: p */
    public TextView f22115p;

    @BindView
    public ProgressBar pbLoader;

    @BindView
    public PlayerView player_view;

    /* renamed from: q */
    public TextView f22116q;

    /* renamed from: r */
    public Handler f22117r;

    @BindView
    public RelativeLayout rl_add_channel_to_fav;

    @BindView
    public TextView tvNoRecordFound;

    @BindView
    public TextView tvNoStream;

    @BindView
    public TextView tvViewProvider;

    @BindView
    public TextView tv_cat_title;

    /* renamed from: u */
    public SharedPreferences f22120u;

    /* renamed from: y */
    public SharedPreferences f22124y;

    /* renamed from: f */
    public LiveStreamsDBModel f22105f = new LiveStreamsDBModel();

    /* renamed from: g */
    public ArrayList<EpgChannelModel> f22106g = new ArrayList<>();

    /* renamed from: k */
    public DatabaseUpdatedStatusDBModel f22110k = new DatabaseUpdatedStatusDBModel();

    /* renamed from: l */
    public DatabaseUpdatedStatusDBModel f22111l = new DatabaseUpdatedStatusDBModel();

    /* renamed from: m */
    public ArrayList<LiveStreamsDBModel> f22112m = new ArrayList<>();

    /* renamed from: s */
    public int f22118s = 0;

    /* renamed from: t */
    public boolean f22119t = false;

    /* renamed from: v */
    public String f22121v = "0";

    /* renamed from: w */
    public String f22122w = Rule.ALL;

    /* renamed from: x */
    public AsyncTask f22123x = null;

    /* renamed from: z */
    public int f22125z = 4;

    /* renamed from: A */
    public int f22096A = f22094F[0];

    /* renamed from: E */
    public C1087k f22100E = new C1087k();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/NewEPGFragment$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.NewEPGFragment$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/NewEPGFragment$a.class */
    public class ViewOnKeyListenerC3672a implements View.OnKeyListener {

        /* renamed from: b */
        public final NewEPGFragment f22126b;

        public ViewOnKeyListenerC3672a(NewEPGFragment newEPGFragment) {
            this.f22126b = newEPGFragment;
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            EPG epg;
            if (keyEvent.getAction() == 1) {
                return false;
            }
            if ((i10 == 20 || i10 == 19 || i10 == 22 || i10 == 21 || i10 == 23 || i10 == 66) && (epg = this.f22126b.epg) != null) {
                return epg.onKeyDown(i10, keyEvent);
            }
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/NewEPGFragment$b.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.NewEPGFragment$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/NewEPGFragment$b.class */
    public class AsyncTaskC3673b extends AsyncTask<Void, Integer, Boolean> {

        /* renamed from: a */
        public EPG f22127a;

        /* renamed from: b */
        public int f22128b;

        /* renamed from: d */
        public boolean f22130d;

        /* renamed from: f */
        public ArrayList<PasswordStatusDBModel> f22132f;

        /* renamed from: g */
        public ArrayList<LiveStreamsDBModel> f22133g;

        /* renamed from: h */
        public ArrayList<LiveStreamsDBModel> f22134h;

        /* renamed from: i */
        public ArrayList<LiveStreamsDBModel> f22135i;

        /* renamed from: j */
        public ArrayList<LiveStreamsDBModel> f22136j;

        /* renamed from: l */
        public final String f22138l;

        /* renamed from: m */
        public final RelativeLayout f22139m;

        /* renamed from: n */
        public final NewEPGFragment f22140n;

        /* renamed from: c */
        public int f22129c = 0;

        /* renamed from: e */
        public ArrayList<String> f22131e = new ArrayList<>();

        /* renamed from: k */
        public Map<C9571a, List<C9572b>> f22137k = C4803d0.m24364g();

        public AsyncTaskC3673b(NewEPGFragment newEPGFragment, EPG epg, int i10, String str, RelativeLayout relativeLayout) {
            this.f22140n = newEPGFragment;
            this.f22138l = str;
            this.f22139m = relativeLayout;
            this.f22128b = 0;
            this.f22128b = i10;
            this.f22127a = epg;
            epg.f24967S0 = 1;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            String string = this.f22140n.f22101b.getSharedPreferences("epgchannelupdate", 0).getString("epgchannelupdate", "");
            this.f22130d = this.f22140n.f22101b.getSharedPreferences("auto_start", 0).getBoolean("full_epg", false);
            try {
                if (string.equals("all")) {
                    m18085h(this.f22138l);
                } else {
                    m18084g(this.f22138l);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return Boolean.TRUE;
        }

        /* renamed from: b */
        public ArrayList<LiveStreamsDBModel> m18079b() {
            Context context = this.f22140n.f22101b;
            if (context == null) {
                return null;
            }
            if (SharepreferenceDBHandler.m15373f(context).equals("m3u")) {
                this.f22140n.f22104e = new LiveStreamDBHandler(this.f22140n.f22101b);
                ArrayList<FavouriteM3UModel> m15175K1 = this.f22140n.f22104e.m15175K1("live");
                ArrayList<LiveStreamsDBModel> arrayList = new ArrayList<>();
                Iterator<FavouriteM3UModel> it = m15175K1.iterator();
                while (it.hasNext()) {
                    FavouriteM3UModel next = it.next();
                    ArrayList<LiveStreamsDBModel> m15183O1 = this.f22140n.f22104e.m15183O1(next.m14775a(), next.m14777c());
                    if (m15183O1 != null && m15183O1.size() > 0) {
                        arrayList.add(m15183O1.get(0));
                    }
                }
                if (arrayList.size() != 0) {
                    return arrayList;
                }
                return null;
            }
            this.f22140n.f22102c = new DatabaseHandler(this.f22140n.f22101b);
            NewEPGFragment newEPGFragment = this.f22140n;
            ArrayList<FavouriteDBModel> m15116v = newEPGFragment.f22102c.m15116v("live", SharepreferenceDBHandler.m15337A(newEPGFragment.f22101b));
            ArrayList<LiveStreamsDBModel> arrayList2 = new ArrayList<>();
            Iterator<FavouriteDBModel> it2 = m15116v.iterator();
            while (it2.hasNext()) {
                FavouriteDBModel next2 = it2.next();
                LiveStreamsDBModel m15179M1 = new LiveStreamDBHandler(this.f22140n.f22101b).m15179M1(next2.m14760a(), String.valueOf(next2.m14764e()));
                if (m15179M1 != null) {
                    arrayList2.add(m15179M1);
                }
            }
            if (arrayList2.size() != 0) {
                return arrayList2;
            }
            return null;
        }

        /* renamed from: c */
        public final ArrayList<String> m18080c() {
            NewEPGFragment newEPGFragment = this.f22140n;
            ArrayList<PasswordStatusDBModel> m15232m1 = newEPGFragment.f22104e.m15232m1(SharepreferenceDBHandler.m15337A(newEPGFragment.f22101b));
            this.f22132f = m15232m1;
            if (m15232m1 != null) {
                Iterator<PasswordStatusDBModel> it = m15232m1.iterator();
                while (it.hasNext()) {
                    PasswordStatusDBModel next = it.next();
                    if (next.m15290a().equals("1")) {
                        this.f22131e.add(next.m15291b());
                    }
                }
            }
            return this.f22131e;
        }

        /* renamed from: d */
        public final ArrayList<LiveStreamsDBModel> m18081d(ArrayList<LiveStreamsDBModel> arrayList, ArrayList<String> arrayList2) {
            boolean z10;
            ArrayList<LiveStreamsDBModel> arrayList3;
            if (arrayList == null) {
                return null;
            }
            Iterator<LiveStreamsDBModel> it = arrayList.iterator();
            while (it.hasNext()) {
                LiveStreamsDBModel next = it.next();
                if (arrayList2 != null) {
                    Iterator<String> it2 = arrayList2.iterator();
                    while (true) {
                        z10 = false;
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (next.m14827g().equals(it2.next())) {
                            z10 = true;
                            break;
                        }
                    }
                    if (!z10 && (arrayList3 = this.f22133g) != null) {
                        arrayList3.add(next);
                    }
                }
            }
            return this.f22133g;
        }

        @Override // android.os.AsyncTask
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            Map<C9571a, List<C9572b>> map;
            EPG epg;
            if (this.f22140n.epgView == null || (map = this.f22137k) == null || map.size() <= 0 || (epg = this.f22127a) == null) {
                LinearLayout linearLayout = this.f22140n.epgView;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                    this.f22140n.tvNoRecordFound.setVisibility(0);
                    NewEPGFragment newEPGFragment = this.f22140n;
                    newEPGFragment.tvNoRecordFound.setText(newEPGFragment.getResources().getString(2132018197));
                }
            } else {
                epg.f24967S0 = 0;
                epg.m19774c0();
                this.f22140n.epgView.setVisibility(0);
                try {
                    this.f22127a.setEPGData(new C9746a(this.f22137k));
                    EPG epg2 = this.f22127a;
                    epg2.m19780i0(null, false, this.f22139m, epg2);
                } catch (Exception e10) {
                }
            }
            ProgressBar progressBar = this.f22140n.pbLoader;
            if (progressBar != null) {
                progressBar.setVisibility(4);
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
            EPG epg;
            Map<C9571a, List<C9572b>> map = this.f22137k;
            if (map == null || map.size() <= 0) {
                return;
            }
            ProgressBar progressBar = this.f22140n.pbLoader;
            if (progressBar != null) {
                progressBar.setVisibility(4);
            }
            if (this.f22140n.epgView == null || (epg = this.f22127a) == null) {
                return;
            }
            epg.m19774c0();
            this.f22140n.epgView.setVisibility(0);
            try {
                this.f22127a.setEPGData(new C9746a(this.f22137k));
                EPG epg2 = this.f22127a;
                epg2.m19780i0(null, false, this.f22139m, epg2);
            } catch (Exception e10) {
            }
        }

        /* renamed from: g */
        public final void m18084g(String str) {
            if (this.f22130d) {
                m18086i(str);
            } else {
                m18087j(str);
            }
        }

        /* renamed from: h */
        public final void m18085h(String str) {
            if (this.f22130d) {
                m18088k(str);
            } else {
                m18089l(str);
            }
        }

        /* renamed from: i */
        public final void m18086i(String str) {
            C9571a c9571a;
            C9571a c9571a2;
            C1087k c1087k;
            C9571a c9571a3;
            C9572b c9572b;
            this.f22140n.f22104e = new LiveStreamDBHandler(this.f22140n.f22101b);
            try {
                ArrayList<LiveStreamsDBModel> m18079b = str.equals("-1") ? m18079b() : new LiveStreamDBHandler(this.f22140n.f22101b).m15219g1(str, "live");
                this.f22132f = new ArrayList<>();
                this.f22133g = new ArrayList<>();
                this.f22134h = new ArrayList<>();
                this.f22135i = new ArrayList<>();
                this.f22136j = new ArrayList<>();
                NewEPGFragment newEPGFragment = this.f22140n;
                ArrayList<LiveStreamsDBModel> arrayList = m18079b;
                if (newEPGFragment.f22104e.m15189R1(SharepreferenceDBHandler.m15337A(newEPGFragment.f22101b)) > 0) {
                    arrayList = m18079b;
                    if (m18079b != null) {
                        ArrayList<String> m18080c = m18080c();
                        this.f22131e = m18080c;
                        if (m18080c != null) {
                            this.f22134h = m18081d(m18079b, m18080c);
                        }
                        arrayList = this.f22134h;
                    }
                }
                this.f22135i = arrayList;
                if (this.f22135i != null) {
                    int i10 = -1;
                    C9571a c9571a4 = null;
                    C9571a c9571a5 = null;
                    int i11 = 0;
                    c9571a2 = null;
                    int i12 = 0;
                    C9572b c9572b2 = null;
                    while (i11 < this.f22135i.size()) {
                        C1087k c1087k2 = this.f22140n.f22100E;
                        if (c1087k2 != null) {
                            c1087k2.m6480e();
                        }
                        if ((this.f22140n.f22123x != null && this.f22140n.f22123x.isCancelled()) || ((c1087k = this.f22140n.f22100E) != null && c1087k.m6477b())) {
                            break;
                        }
                        String name = this.f22135i.get(i11).getName();
                        String m14798E = this.f22135i.get(i11).m14798E();
                        String m14810Q = this.f22135i.get(i11).m14810Q();
                        String m14811R = this.f22135i.get(i11).m14811R();
                        String m14805L = this.f22135i.get(i11).m14805L();
                        String m14798E2 = this.f22135i.get(i11).m14798E();
                        String m14816W = this.f22135i.get(i11).m14816W();
                        String m14827g = this.f22135i.get(i11).m14827g();
                        if (m14798E.equals("")) {
                            c9571a3 = c9571a4;
                        } else {
                            i10++;
                            ArrayList<XMLTVProgrammePojo> m15160E1 = this.f22140n.f22104e.m15160E1(m14798E);
                            if (m15160E1 == null || m15160E1.size() == 0) {
                                c9571a3 = c9571a4;
                            } else {
                                C9571a c9571a6 = new C9571a(m14810Q, name, i12, m14811R, m14805L, m14798E2, m14827g, m14816W, str);
                                int i13 = i12 + 1;
                                C9571a c9571a7 = c9571a2;
                                if (c9571a2 == null) {
                                    c9571a7 = c9571a6;
                                }
                                if (c9571a5 != null) {
                                    c9571a6.m40166o(c9571a5);
                                    c9571a5.m40165n(c9571a6);
                                }
                                ArrayList arrayList2 = new ArrayList();
                                this.f22137k.put(c9571a6, arrayList2);
                                C9572b c9572b3 = c9572b2;
                                int i14 = 0;
                                Long l10 = null;
                                while (i14 < m15160E1.size() && (this.f22140n.f22123x == null || !this.f22140n.f22123x.isCancelled())) {
                                    String m15512j = m15160E1.get(i14).m15512j();
                                    String m15514l = m15160E1.get(i14).m15514l();
                                    String m15515m = m15160E1.get(i14).m15515m();
                                    String m15504b = m15160E1.get(i14).m15504b();
                                    Long valueOf = Long.valueOf(C5255e.m26244m(m15512j, this.f22140n.f22101b));
                                    Long valueOf2 = Long.valueOf(C5255e.m26244m(m15514l, this.f22140n.f22101b));
                                    if (l10 != null && valueOf.equals(l10)) {
                                        C9572b c9572b4 = new C9572b(c9571a6, valueOf.longValue(), valueOf2.longValue(), m15515m, m14810Q, m15504b);
                                        if (c9572b3 != null) {
                                            c9572b4.m40177k(c9572b3);
                                            c9572b3.m40176j(c9572b4);
                                        }
                                        c9571a6.m40152a(c9572b4);
                                        c9572b = c9572b4;
                                    } else if (l10 != null) {
                                        C9572b c9572b5 = new C9572b(c9571a6, l10.longValue(), valueOf.longValue(), this.f22140n.f22101b.getResources().getString(2132018208), m14810Q, "");
                                        if (c9572b3 != null) {
                                            c9572b5.m40177k(c9572b3);
                                            c9572b3.m40176j(c9572b5);
                                        }
                                        c9571a6.m40152a(c9572b5);
                                        arrayList2.add(c9572b5);
                                        c9572b = new C9572b(c9571a6, valueOf.longValue(), valueOf2.longValue(), m15515m, m14810Q, m15504b);
                                        c9572b.m40177k(c9572b5);
                                        c9572b5.m40176j(c9572b);
                                        c9571a6.m40152a(c9572b);
                                    } else {
                                        C9572b c9572b6 = new C9572b(c9571a6, valueOf.longValue(), valueOf2.longValue(), m15515m, m14810Q, m15504b);
                                        if (c9572b3 != null) {
                                            c9572b6.m40177k(c9572b3);
                                            c9572b3.m40176j(c9572b6);
                                        }
                                        c9571a6.m40152a(c9572b6);
                                        c9572b = c9572b6;
                                    }
                                    arrayList2.add(c9572b);
                                    long currentTimeMillis = System.currentTimeMillis();
                                    C9572b c9572b7 = c9572b;
                                    if (i14 == m15160E1.size() - 1) {
                                        c9572b7 = c9572b;
                                        if (valueOf2.longValue() < currentTimeMillis) {
                                            long longValue = valueOf2.longValue();
                                            c9572b7 = new C9572b(c9571a6, longValue, longValue + currentTimeMillis + Long.parseLong("7200000"), this.f22140n.f22101b.getResources().getString(2132018208), m14810Q, "");
                                            c9572b7.m40177k(c9572b);
                                            c9572b.m40176j(c9572b7);
                                            c9571a6.m40152a(c9572b7);
                                            arrayList2.add(c9572b7);
                                        }
                                    }
                                    if (i14 != 0 || valueOf.longValue() <= currentTimeMillis) {
                                        c9572b3 = c9572b7;
                                    } else {
                                        c9572b3 = new C9572b(c9571a6, currentTimeMillis - Long.parseLong("86400000"), valueOf.longValue(), this.f22140n.f22101b.getResources().getString(2132018208), m14810Q, "");
                                        c9572b3.m40177k(c9572b7);
                                        c9572b7.m40176j(c9572b3);
                                        c9571a6.m40152a(c9572b3);
                                        arrayList2.add(c9572b3);
                                    }
                                    i14++;
                                    l10 = valueOf2;
                                }
                                c9572b2 = c9572b3;
                                c9571a5 = c9571a6;
                                c9571a3 = c9571a6;
                                c9571a2 = c9571a7;
                                i12 = i13;
                            }
                        }
                        if (i10 == 10 || (i10 != 0 && i10 % 50 == 0)) {
                            publishProgress(Integer.valueOf(i10));
                        }
                        i11++;
                        c9571a4 = c9571a3;
                    }
                    c9571a = c9571a4;
                } else {
                    c9571a = null;
                    c9571a2 = null;
                }
                if (c9571a != null) {
                    c9571a.m40165n(c9571a2);
                }
                if (c9571a2 != null) {
                    c9571a2.m40166o(c9571a);
                }
            } catch (Throwable th2) {
                throw new RuntimeException(th2.getMessage(), th2);
            }
        }

        /* renamed from: j */
        public final void m18087j(String str) {
            C9571a c9571a;
            C9571a c9571a2;
            C1087k c1087k;
            ArrayList<XMLTVProgrammePojo> m15160E1;
            C9572b c9572b;
            this.f22140n.f22104e = new LiveStreamDBHandler(this.f22140n.f22101b);
            try {
                ArrayList<LiveStreamsDBModel> m18079b = str.equals("-1") ? m18079b() : new LiveStreamDBHandler(this.f22140n.f22101b).m15219g1(str, "live");
                this.f22132f = new ArrayList<>();
                this.f22133g = new ArrayList<>();
                this.f22134h = new ArrayList<>();
                this.f22135i = new ArrayList<>();
                this.f22136j = new ArrayList<>();
                NewEPGFragment newEPGFragment = this.f22140n;
                ArrayList<LiveStreamsDBModel> arrayList = m18079b;
                if (newEPGFragment.f22104e.m15189R1(SharepreferenceDBHandler.m15337A(newEPGFragment.f22101b)) > 0) {
                    arrayList = m18079b;
                    if (m18079b != null) {
                        ArrayList<String> m18080c = m18080c();
                        this.f22131e = m18080c;
                        if (m18080c != null) {
                            this.f22134h = m18081d(m18079b, m18080c);
                        }
                        arrayList = this.f22134h;
                    }
                }
                this.f22135i = arrayList;
                if (this.f22135i != null) {
                    int i10 = -1;
                    C9571a c9571a3 = null;
                    C9571a c9571a4 = null;
                    c9571a2 = null;
                    int i11 = 0;
                    C9572b c9572b2 = null;
                    for (int i12 = 0; i12 < this.f22135i.size(); i12++) {
                        C1087k c1087k2 = this.f22140n.f22100E;
                        if (c1087k2 != null) {
                            c1087k2.m6480e();
                        }
                        if ((this.f22140n.f22123x != null && this.f22140n.f22123x.isCancelled()) || ((c1087k = this.f22140n.f22100E) != null && c1087k.m6477b())) {
                            break;
                        }
                        String name = this.f22135i.get(i12).getName();
                        String m14798E = this.f22135i.get(i12).m14798E();
                        String m14810Q = this.f22135i.get(i12).m14810Q();
                        String m14811R = this.f22135i.get(i12).m14811R();
                        String m14805L = this.f22135i.get(i12).m14805L();
                        String m14798E2 = this.f22135i.get(i12).m14798E();
                        String m14816W = this.f22135i.get(i12).m14816W();
                        String m14827g = this.f22135i.get(i12).m14827g();
                        if (!m14798E.equals("") && (m15160E1 = this.f22140n.f22104e.m15160E1(m14798E)) != null && m15160E1.size() != 0) {
                            C9571a c9571a5 = new C9571a(m14810Q, name, i11, m14811R, m14805L, m14798E2, m14827g, m14816W, str);
                            int i13 = i11 + 1;
                            C9571a c9571a6 = c9571a2;
                            if (c9571a2 == null) {
                                c9571a6 = c9571a5;
                            }
                            if (c9571a4 != null) {
                                c9571a5.m40166o(c9571a4);
                                c9571a4.m40165n(c9571a5);
                            }
                            ArrayList arrayList2 = new ArrayList();
                            this.f22137k.put(c9571a5, arrayList2);
                            boolean z10 = false;
                            int i14 = 0;
                            C9571a c9571a7 = c9571a6;
                            Long l10 = null;
                            while (i14 < m15160E1.size()) {
                                String m15512j = m15160E1.get(i14).m15512j();
                                String m15514l = m15160E1.get(i14).m15514l();
                                String m15515m = m15160E1.get(i14).m15515m();
                                String m15504b = m15160E1.get(i14).m15504b();
                                Long valueOf = Long.valueOf(C5255e.m26244m(m15512j, this.f22140n.f22101b));
                                Long valueOf2 = Long.valueOf(C5255e.m26244m(m15514l, this.f22140n.f22101b));
                                if (this.f22140n.f22123x != null && this.f22140n.f22123x.isCancelled()) {
                                    break;
                                }
                                if (C5255e.m26208K(valueOf.longValue(), valueOf2.longValue(), this.f22140n.f22101b) || z10) {
                                    long millis = LocalDateTime.now().toDateTime().getMillis() + C5255e.m26200C(this.f22140n.f22101b);
                                    C9572b c9572b3 = c9572b2;
                                    if (valueOf.longValue() <= 12600000 + millis) {
                                        if (l10 != null && valueOf.equals(l10)) {
                                            c9572b3 = new C9572b(c9571a5, valueOf.longValue(), valueOf2.longValue(), m15515m, m14810Q, m15504b);
                                            if (c9572b2 != null) {
                                                c9572b3.m40177k(c9572b2);
                                                c9572b2.m40176j(c9572b3);
                                            }
                                            c9571a5.m40152a(c9572b3);
                                        } else if (l10 != null) {
                                            C9572b c9572b4 = new C9572b(c9571a5, l10.longValue(), valueOf.longValue(), this.f22140n.f22101b.getResources().getString(2132018208), m14810Q, "");
                                            if (c9572b2 != null) {
                                                c9572b4.m40177k(c9572b2);
                                                c9572b2.m40176j(c9572b4);
                                            }
                                            c9571a5.m40152a(c9572b4);
                                            arrayList2.add(c9572b4);
                                            c9572b3 = new C9572b(c9571a5, valueOf.longValue(), valueOf2.longValue(), m15515m, m14810Q, m15504b);
                                            c9572b3.m40177k(c9572b4);
                                            c9572b4.m40176j(c9572b3);
                                            c9571a5.m40152a(c9572b3);
                                            arrayList2.add(c9572b3);
                                        } else {
                                            c9572b3 = new C9572b(c9571a5, valueOf.longValue(), valueOf2.longValue(), m15515m, m14810Q, m15504b);
                                            if (c9572b2 != null) {
                                                c9572b3.m40177k(c9572b2);
                                                c9572b2.m40176j(c9572b3);
                                            }
                                            c9571a5.m40152a(c9572b3);
                                        }
                                        arrayList2.add(c9572b3);
                                    }
                                    C9572b c9572b5 = c9572b3;
                                    if (i14 == m15160E1.size() - 1) {
                                        c9572b5 = c9572b3;
                                        if (valueOf2.longValue() < millis) {
                                            long longValue = valueOf2.longValue();
                                            long parseLong = Long.parseLong("3600000") + longValue;
                                            int i15 = 0;
                                            while (true) {
                                                c9572b5 = c9572b3;
                                                if (i15 >= 3) {
                                                    break;
                                                }
                                                if (this.f22140n.f22123x != null && this.f22140n.f22123x.isCancelled()) {
                                                    c9572b5 = c9572b3;
                                                    break;
                                                }
                                                C9572b c9572b6 = new C9572b(c9571a5, longValue, parseLong, this.f22140n.f22101b.getResources().getString(2132018208), m14810Q, "");
                                                if (c9572b3 != null) {
                                                    c9572b6.m40177k(c9572b3);
                                                    c9572b3.m40176j(c9572b6);
                                                }
                                                c9571a5.m40152a(c9572b6);
                                                arrayList2.add(c9572b6);
                                                i15++;
                                                c9572b3 = c9572b6;
                                                longValue = parseLong;
                                                parseLong += Long.parseLong("3600000");
                                            }
                                        }
                                    }
                                    c9572b = c9572b5;
                                    if (i14 == 0) {
                                        c9572b = c9572b5;
                                        if (valueOf.longValue() > millis) {
                                            long longValue2 = valueOf.longValue();
                                            long j10 = millis;
                                            int i16 = 0;
                                            while (true) {
                                                c9572b = c9572b5;
                                                if (i16 >= 3) {
                                                    break;
                                                }
                                                if (this.f22140n.f22123x != null && this.f22140n.f22123x.isCancelled()) {
                                                    c9572b = c9572b5;
                                                    break;
                                                }
                                                C9572b c9572b7 = new C9572b(c9571a5, j10, longValue2, this.f22140n.f22101b.getResources().getString(2132018208), m14810Q, "");
                                                if (c9572b5 != null) {
                                                    c9572b7.m40177k(c9572b5);
                                                    c9572b5.m40176j(c9572b7);
                                                }
                                                c9571a5.m40152a(c9572b7);
                                                arrayList2.add(c9572b7);
                                                i16++;
                                                c9572b5 = c9572b7;
                                                j10 = longValue2;
                                                longValue2 = Long.parseLong("3600000") + longValue2;
                                            }
                                        }
                                    }
                                    l10 = valueOf2;
                                    z10 = true;
                                } else {
                                    c9572b = c9572b2;
                                }
                                i14++;
                                c9572b2 = c9572b;
                            }
                            i10++;
                            c9571a3 = c9571a5;
                            c9571a4 = c9571a5;
                            c9571a2 = c9571a7;
                            i11 = i13;
                        }
                        if (i10 == 10 || (i10 != 0 && i10 % 50 == 0)) {
                            publishProgress(Integer.valueOf(i10));
                        }
                    }
                    c9571a = c9571a3;
                } else {
                    c9571a = null;
                    c9571a2 = null;
                }
                if (c9571a != null) {
                    c9571a.m40165n(c9571a2);
                }
                if (c9571a2 != null) {
                    c9571a2.m40166o(c9571a);
                }
            } catch (Throwable th2) {
                throw new RuntimeException(th2.getMessage(), th2);
            }
        }

        /* renamed from: k */
        public final void m18088k(String str) {
            C9571a c9571a;
            C9571a c9571a2;
            C1087k c1087k;
            C9572b c9572b;
            C9572b c9572b2;
            this.f22140n.f22104e = new LiveStreamDBHandler(this.f22140n.f22101b);
            try {
                ArrayList<LiveStreamsDBModel> m18079b = str.equals("-1") ? m18079b() : new LiveStreamDBHandler(this.f22140n.f22101b).m15219g1(str, "live");
                this.f22132f = new ArrayList<>();
                this.f22133g = new ArrayList<>();
                this.f22134h = new ArrayList<>();
                this.f22135i = new ArrayList<>();
                this.f22136j = new ArrayList<>();
                NewEPGFragment newEPGFragment = this.f22140n;
                ArrayList<LiveStreamsDBModel> arrayList = m18079b;
                if (newEPGFragment.f22104e.m15189R1(SharepreferenceDBHandler.m15337A(newEPGFragment.f22101b)) > 0) {
                    arrayList = m18079b;
                    if (m18079b != null) {
                        ArrayList<String> m18080c = m18080c();
                        this.f22131e = m18080c;
                        if (m18080c != null) {
                            this.f22134h = m18081d(m18079b, m18080c);
                        }
                        arrayList = this.f22134h;
                    }
                }
                this.f22135i = arrayList;
                if (this.f22135i != null) {
                    c9571a2 = null;
                    C9571a c9571a3 = null;
                    int i10 = -1;
                    int i11 = 0;
                    C9571a c9571a4 = null;
                    C9572b c9572b3 = null;
                    while (i11 < this.f22135i.size()) {
                        C1087k c1087k2 = this.f22140n.f22100E;
                        if (c1087k2 != null) {
                            c1087k2.m6480e();
                        }
                        if ((this.f22140n.f22123x != null && this.f22140n.f22123x.isCancelled()) || ((c1087k = this.f22140n.f22100E) != null && c1087k.m6477b())) {
                            break;
                        }
                        String name = this.f22135i.get(i11).getName();
                        String m14798E = this.f22135i.get(i11).m14798E();
                        String m14810Q = this.f22135i.get(i11).m14810Q();
                        c9571a2 = new C9571a(m14810Q, name, i11, this.f22135i.get(i11).m14811R(), this.f22135i.get(i11).m14805L(), this.f22135i.get(i11).m14798E(), this.f22135i.get(i11).m14827g(), this.f22135i.get(i11).m14816W(), str);
                        C9571a c9571a5 = c9571a4;
                        if (c9571a4 == null) {
                            c9571a5 = c9571a2;
                        }
                        if (c9571a3 != null) {
                            c9571a2.m40166o(c9571a3);
                            c9571a3.m40165n(c9571a2);
                        }
                        ArrayList arrayList2 = new ArrayList();
                        this.f22137k.put(c9571a2, arrayList2);
                        if (m14798E.equals("")) {
                            long currentTimeMillis = System.currentTimeMillis() - Long.parseLong("86400000");
                            long parseLong = Long.parseLong("7200000") + currentTimeMillis;
                            int i12 = 0;
                            while (i12 < 50 && (this.f22140n.f22123x == null || !this.f22140n.f22123x.isCancelled())) {
                                C9572b c9572b4 = new C9572b(c9571a2, currentTimeMillis, parseLong, this.f22140n.f22101b.getResources().getString(2132018208), m14810Q, "");
                                if (c9572b3 != null) {
                                    c9572b4.m40177k(c9572b3);
                                    c9572b3.m40176j(c9572b4);
                                }
                                c9571a2.m40152a(c9572b4);
                                arrayList2.add(c9572b4);
                                i12++;
                                c9572b3 = c9572b4;
                                currentTimeMillis = parseLong;
                                parseLong += Long.parseLong("7200000");
                            }
                        } else {
                            int i13 = i10 + 1;
                            ArrayList<XMLTVProgrammePojo> m15160E1 = this.f22140n.f22104e.m15160E1(m14798E);
                            if (m15160E1 != null && m15160E1.size() != 0) {
                                int i14 = 0;
                                Long l10 = null;
                                while (true) {
                                    Long l11 = l10;
                                    c9572b = c9572b3;
                                    if (i14 < m15160E1.size()) {
                                        if (this.f22140n.f22123x != null && this.f22140n.f22123x.isCancelled()) {
                                            c9572b = c9572b3;
                                            break;
                                        }
                                        String m15512j = m15160E1.get(i14).m15512j();
                                        String m15514l = m15160E1.get(i14).m15514l();
                                        String m15515m = m15160E1.get(i14).m15515m();
                                        String m15504b = m15160E1.get(i14).m15504b();
                                        Long valueOf = Long.valueOf(C5255e.m26244m(m15512j, this.f22140n.f22101b));
                                        Long valueOf2 = Long.valueOf(C5255e.m26244m(m15514l, this.f22140n.f22101b));
                                        if (l11 != null && valueOf.equals(l11)) {
                                            C9572b c9572b5 = new C9572b(c9571a2, valueOf.longValue(), valueOf2.longValue(), m15515m, m14810Q, m15504b);
                                            if (c9572b3 != null) {
                                                c9572b5.m40177k(c9572b3);
                                                c9572b3.m40176j(c9572b5);
                                            }
                                            c9571a2.m40152a(c9572b5);
                                            c9572b2 = c9572b5;
                                        } else if (l11 != null) {
                                            C9572b c9572b6 = new C9572b(c9571a2, l11.longValue(), valueOf.longValue(), this.f22140n.f22101b.getResources().getString(2132018208), m14810Q, "");
                                            if (c9572b3 != null) {
                                                c9572b6.m40177k(c9572b3);
                                                c9572b3.m40176j(c9572b6);
                                            }
                                            c9571a2.m40152a(c9572b6);
                                            arrayList2.add(c9572b6);
                                            c9572b2 = new C9572b(c9571a2, valueOf.longValue(), valueOf2.longValue(), m15515m, m14810Q, m15504b);
                                            c9572b2.m40177k(c9572b6);
                                            c9572b6.m40176j(c9572b2);
                                            c9571a2.m40152a(c9572b2);
                                        } else {
                                            C9572b c9572b7 = new C9572b(c9571a2, valueOf.longValue(), valueOf2.longValue(), m15515m, m14810Q, m15504b);
                                            if (c9572b3 != null) {
                                                c9572b7.m40177k(c9572b3);
                                                c9572b3.m40176j(c9572b7);
                                            }
                                            c9571a2.m40152a(c9572b7);
                                            c9572b2 = c9572b7;
                                        }
                                        arrayList2.add(c9572b2);
                                        long currentTimeMillis2 = System.currentTimeMillis();
                                        C9572b c9572b8 = c9572b2;
                                        if (i14 == m15160E1.size() - 1) {
                                            c9572b8 = c9572b2;
                                            if (valueOf2.longValue() < currentTimeMillis2) {
                                                long longValue = valueOf2.longValue();
                                                c9572b8 = new C9572b(c9571a2, longValue, longValue + currentTimeMillis2 + Long.parseLong("7200000"), this.f22140n.f22101b.getResources().getString(2132018208), m14810Q, "");
                                                c9572b8.m40177k(c9572b2);
                                                c9572b2.m40176j(c9572b8);
                                                c9571a2.m40152a(c9572b8);
                                                arrayList2.add(c9572b8);
                                            }
                                        }
                                        if (i14 != 0 || valueOf.longValue() <= currentTimeMillis2) {
                                            c9572b3 = c9572b8;
                                        } else {
                                            c9572b3 = new C9572b(c9571a2, currentTimeMillis2 - Long.parseLong("86400000"), valueOf.longValue(), this.f22140n.f22101b.getResources().getString(2132018208), m14810Q, "");
                                            c9572b3.m40177k(c9572b8);
                                            c9572b8.m40176j(c9572b3);
                                            c9571a2.m40152a(c9572b3);
                                            arrayList2.add(c9572b3);
                                        }
                                        i14++;
                                        l10 = valueOf2;
                                    } else {
                                        break;
                                    }
                                }
                            } else {
                                long currentTimeMillis3 = System.currentTimeMillis() - Long.parseLong("86400000");
                                long parseLong2 = Long.parseLong("7200000") + currentTimeMillis3;
                                int i15 = 0;
                                while (i15 < 50 && (this.f22140n.f22123x == null || !this.f22140n.f22123x.isCancelled())) {
                                    C9572b c9572b9 = new C9572b(c9571a2, currentTimeMillis3, parseLong2, this.f22140n.f22101b.getResources().getString(2132018208), m14810Q, "");
                                    if (c9572b3 != null) {
                                        c9572b9.m40177k(c9572b3);
                                        c9572b3.m40176j(c9572b9);
                                    }
                                    c9571a2.m40152a(c9572b9);
                                    arrayList2.add(c9572b9);
                                    i15++;
                                    c9572b3 = c9572b9;
                                    currentTimeMillis3 = parseLong2;
                                    parseLong2 += Long.parseLong("7200000");
                                }
                                c9572b = c9572b3;
                            }
                            c9572b3 = c9572b;
                            i10 = i13;
                        }
                        if (i10 == 10 || (i10 != 0 && i10 % 50 == 0)) {
                            publishProgress(Integer.valueOf(i10));
                        }
                        i11++;
                        c9571a3 = c9571a2;
                        c9571a4 = c9571a5;
                    }
                    c9571a = c9571a4;
                } else {
                    c9571a = null;
                    c9571a2 = null;
                }
                if (c9571a2 != null) {
                    c9571a2.m40165n(c9571a);
                }
                if (c9571a != null) {
                    c9571a.m40166o(c9571a2);
                }
            } catch (Throwable th2) {
                throw new RuntimeException(th2.getMessage(), th2);
            }
        }

        /* renamed from: l */
        public final void m18089l(String str) {
            C9571a c9571a;
            C9571a c9571a2;
            C1087k c1087k;
            C9572b c9572b;
            C9572b c9572b2;
            Long l10;
            boolean z10;
            C9572b c9572b3;
            this.f22140n.f22104e = new LiveStreamDBHandler(this.f22140n.f22101b);
            try {
                ArrayList<LiveStreamsDBModel> m18079b = str.equals("-1") ? m18079b() : new LiveStreamDBHandler(this.f22140n.f22101b).m15219g1(str, "live");
                this.f22132f = new ArrayList<>();
                this.f22133g = new ArrayList<>();
                this.f22134h = new ArrayList<>();
                this.f22135i = new ArrayList<>();
                this.f22136j = new ArrayList<>();
                NewEPGFragment newEPGFragment = this.f22140n;
                ArrayList<LiveStreamsDBModel> arrayList = m18079b;
                if (newEPGFragment.f22104e.m15189R1(SharepreferenceDBHandler.m15337A(newEPGFragment.f22101b)) > 0) {
                    arrayList = m18079b;
                    if (m18079b != null) {
                        ArrayList<String> m18080c = m18080c();
                        this.f22131e = m18080c;
                        if (m18080c != null) {
                            this.f22134h = m18081d(m18079b, m18080c);
                        }
                        arrayList = this.f22134h;
                    }
                }
                this.f22135i = arrayList;
                if (this.f22135i != null) {
                    c9571a2 = null;
                    C9571a c9571a3 = null;
                    int i10 = -1;
                    int i11 = 0;
                    C9571a c9571a4 = null;
                    C9572b c9572b4 = null;
                    while (i11 < this.f22135i.size()) {
                        C1087k c1087k2 = this.f22140n.f22100E;
                        if (c1087k2 != null) {
                            c1087k2.m6480e();
                        }
                        if ((this.f22140n.f22123x != null && this.f22140n.f22123x.isCancelled()) || ((c1087k = this.f22140n.f22100E) != null && c1087k.m6477b())) {
                            break;
                        }
                        String name = this.f22135i.get(i11).getName();
                        String m14798E = this.f22135i.get(i11).m14798E();
                        String m14810Q = this.f22135i.get(i11).m14810Q();
                        C9571a c9571a5 = new C9571a(m14810Q, name, i11, this.f22135i.get(i11).m14811R(), this.f22135i.get(i11).m14805L(), this.f22135i.get(i11).m14798E(), this.f22135i.get(i11).m14827g(), this.f22135i.get(i11).m14816W(), str);
                        C9571a c9571a6 = c9571a4;
                        if (c9571a4 == null) {
                            c9571a6 = c9571a5;
                        }
                        if (c9571a3 != null) {
                            c9571a5.m40166o(c9571a3);
                            c9571a3.m40165n(c9571a5);
                        }
                        ArrayList arrayList2 = new ArrayList();
                        this.f22137k.put(c9571a5, arrayList2);
                        if (m14798E == null || m14798E.equals("")) {
                            long millis = LocalDateTime.now().toDateTime().getMillis();
                            long parseLong = Long.parseLong("3600000") + millis;
                            int i12 = 0;
                            while (i12 < 3 && (this.f22140n.f22123x == null || !this.f22140n.f22123x.isCancelled())) {
                                C9572b c9572b5 = new C9572b(c9571a5, millis, parseLong, this.f22140n.f22101b.getResources().getString(2132018208), m14810Q, "");
                                if (c9572b4 != null) {
                                    c9572b5.m40177k(c9572b4);
                                    c9572b4.m40176j(c9572b5);
                                }
                                c9571a5.m40152a(c9572b5);
                                arrayList2.add(c9572b5);
                                i12++;
                                c9572b4 = c9572b5;
                                millis = parseLong;
                                parseLong += Long.parseLong("3600000");
                            }
                        } else {
                            int i13 = i10 + 1;
                            ArrayList<XMLTVProgrammePojo> m15160E1 = this.f22140n.f22104e.m15160E1(m14798E);
                            if (m15160E1 != null && m15160E1.size() != 0) {
                                int i14 = 0;
                                boolean z11 = false;
                                Long l11 = null;
                                while (true) {
                                    Long l12 = l11;
                                    c9572b = c9572b4;
                                    if (i14 < m15160E1.size()) {
                                        if (this.f22140n.f22123x != null && this.f22140n.f22123x.isCancelled()) {
                                            c9572b = c9572b4;
                                            break;
                                        }
                                        String m15512j = m15160E1.get(i14).m15512j();
                                        String m15514l = m15160E1.get(i14).m15514l();
                                        String m15515m = m15160E1.get(i14).m15515m();
                                        String m15504b = m15160E1.get(i14).m15504b();
                                        Long valueOf = Long.valueOf(C5255e.m26244m(m15512j, this.f22140n.f22101b));
                                        Long valueOf2 = Long.valueOf(C5255e.m26244m(m15514l, this.f22140n.f22101b));
                                        if (!C5255e.m26208K(valueOf.longValue(), valueOf2.longValue(), this.f22140n.f22101b)) {
                                            c9572b2 = c9572b4;
                                            z10 = z11;
                                            l10 = l12;
                                            if (!z11) {
                                                i14++;
                                                c9572b4 = c9572b2;
                                                z11 = z10;
                                                l11 = l10;
                                            }
                                        }
                                        c9572b2 = c9572b4;
                                        l10 = l12;
                                        if (valueOf.longValue() <= LocalDateTime.now().toDateTime().getMillis() + C5255e.m26200C(this.f22140n.f22101b) + 12600000) {
                                            if (l12 != null && valueOf.equals(l12)) {
                                                C9572b c9572b6 = new C9572b(c9571a5, valueOf.longValue(), valueOf2.longValue(), m15515m, m14810Q, m15504b);
                                                if (c9572b4 != null) {
                                                    c9572b6.m40177k(c9572b4);
                                                    c9572b4.m40176j(c9572b6);
                                                }
                                                c9571a5.m40152a(c9572b6);
                                                c9572b3 = c9572b6;
                                            } else if (l12 != null) {
                                                C9572b c9572b7 = new C9572b(c9571a5, l12.longValue(), valueOf.longValue(), this.f22140n.f22101b.getResources().getString(2132018208), m14810Q, "");
                                                if (c9572b4 != null) {
                                                    c9572b7.m40177k(c9572b4);
                                                    c9572b4.m40176j(c9572b7);
                                                }
                                                c9571a5.m40152a(c9572b7);
                                                arrayList2.add(c9572b7);
                                                c9572b3 = new C9572b(c9571a5, valueOf.longValue(), valueOf2.longValue(), m15515m, m14810Q, m15504b);
                                                c9572b3.m40177k(c9572b7);
                                                c9572b7.m40176j(c9572b3);
                                                c9571a5.m40152a(c9572b3);
                                                arrayList2.add(c9572b3);
                                                l10 = valueOf2;
                                                c9572b2 = c9572b3;
                                            } else {
                                                C9572b c9572b8 = new C9572b(c9571a5, valueOf.longValue(), valueOf2.longValue(), m15515m, m14810Q, m15504b);
                                                if (c9572b4 != null) {
                                                    c9572b8.m40177k(c9572b4);
                                                    c9572b4.m40176j(c9572b8);
                                                }
                                                c9571a5.m40152a(c9572b8);
                                                c9572b3 = c9572b8;
                                            }
                                            arrayList2.add(c9572b3);
                                            l10 = valueOf2;
                                            c9572b2 = c9572b3;
                                        }
                                        z10 = true;
                                        i14++;
                                        c9572b4 = c9572b2;
                                        z11 = z10;
                                        l11 = l10;
                                    } else {
                                        break;
                                    }
                                }
                            } else {
                                long millis2 = LocalDateTime.now().toDateTime().getMillis();
                                long parseLong2 = Long.parseLong("3600000") + millis2;
                                int i15 = 0;
                                while (i15 < 3 && (this.f22140n.f22123x == null || !this.f22140n.f22123x.isCancelled())) {
                                    C9572b c9572b9 = new C9572b(c9571a5, millis2, parseLong2, this.f22140n.f22101b.getResources().getString(2132018208), m14810Q, "");
                                    if (c9572b4 != null) {
                                        c9572b9.m40177k(c9572b4);
                                        c9572b4.m40176j(c9572b9);
                                    }
                                    c9571a5.m40152a(c9572b9);
                                    arrayList2.add(c9572b9);
                                    i15++;
                                    c9572b4 = c9572b9;
                                    millis2 = parseLong2;
                                    parseLong2 += Long.parseLong("3600000");
                                }
                                c9572b = c9572b4;
                            }
                            c9572b4 = c9572b;
                            i10 = i13;
                        }
                        if (i10 == 10 || (i10 != 0 && i10 % 50 == 0)) {
                            publishProgress(Integer.valueOf(i10));
                        }
                        i11++;
                        c9571a2 = c9571a5;
                        c9571a3 = c9571a2;
                        c9571a4 = c9571a6;
                    }
                    c9571a = c9571a4;
                } else {
                    c9571a = null;
                    c9571a2 = null;
                }
                if (c9571a2 != null) {
                    c9571a2.m40165n(c9571a);
                }
                if (c9571a != null) {
                    c9571a.m40166o(c9571a2);
                }
            } catch (Throwable th2) {
                throw new RuntimeException(th2.getMessage(), th2);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/NewEPGFragment$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.NewEPGFragment$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/NewEPGFragment$c.class */
    public class C3674c implements InterfaceC9344a {

        /* renamed from: a */
        public final String f22141a;

        /* renamed from: b */
        public final NewEPGFragment f22142b;

        public C3674c(NewEPGFragment newEPGFragment, String str) {
            this.f22142b = newEPGFragment;
            this.f22141a = str;
        }

        @Override // p371vf.InterfaceC9344a
        /* renamed from: a */
        public void mo18090a(int i10, int i11, C9572b c9572b) {
            int i12;
            try {
                i12 = Integer.parseInt(c9572b.m40167a().m40163l());
            } catch (NumberFormatException e10) {
                i12 = -1;
            }
            String m40158g = c9572b.m40167a().m40158g();
            String m40160i = c9572b.m40167a().m40160i();
            String m40155d = c9572b.m40167a().m40155d();
            String m40157f = c9572b.m40167a().m40157f();
            String m40153b = c9572b.m40167a().m40153b();
            String m40161j = c9572b.m40167a().m40161j();
            String m40164m = c9572b.m40167a().m40164m();
            this.f22142b.epg.m19786o0(c9572b, true);
            EPG epg = this.f22142b.epg;
            if (epg != null) {
                epg.m19753G();
            }
            NewEPGFragment newEPGFragment = this.f22142b;
            newEPGFragment.epg.m19771a(newEPGFragment.getContext(), this.f22141a, i12, m40160i, m40158g, m40155d, m40157f, m40161j, m40164m, m40153b);
        }

        @Override // p371vf.InterfaceC9344a
        /* renamed from: b */
        public void mo18091b(int i10, C9571a c9571a) {
            int i11;
            try {
                i11 = Integer.parseInt(c9571a.m40163l());
            } catch (NumberFormatException e10) {
                i11 = -1;
            }
            String m40158g = c9571a.m40158g();
            String m40160i = c9571a.m40160i();
            String m40155d = c9571a.m40155d();
            String m40157f = c9571a.m40157f();
            String m40153b = c9571a.m40153b();
            String m40164m = c9571a.m40164m();
            String m40161j = c9571a.m40161j();
            EPG epg = this.f22142b.epg;
            if (epg != null) {
                epg.m19753G();
            }
            NewEPGFragment newEPGFragment = this.f22142b;
            newEPGFragment.epg.m19771a(newEPGFragment.getContext(), this.f22141a, i11, m40160i, m40158g, m40155d, m40157f, m40161j, m40164m, m40153b);
        }

        @Override // p371vf.InterfaceC9344a
        /* renamed from: c */
        public void mo18092c() {
            this.f22142b.epg.m19785n0();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/NewEPGFragment$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.NewEPGFragment$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/NewEPGFragment$d.class */
    public class DialogInterfaceOnClickListenerC3675d implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final NewEPGFragment f22143b;

        public DialogInterfaceOnClickListenerC3675d(NewEPGFragment newEPGFragment) {
            this.f22143b = newEPGFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/NewEPGFragment$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.NewEPGFragment$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/NewEPGFragment$e.class */
    public class DialogInterfaceOnClickListenerC3676e implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final NewEPGFragment f22144b;

        public DialogInterfaceOnClickListenerC3676e(NewEPGFragment newEPGFragment) {
            this.f22144b = newEPGFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26211N(this.f22144b.f22101b);
        }
    }

    /* renamed from: s */
    public static NewEPGFragment m18071s(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("ACTIVE_LIVE_STREAM_CATEGORY_ID", str);
        bundle.putString("ACTIVE_LIVE_STREAM_CATEGORY_NAME", str2);
        NewEPGFragment newEPGFragment = new NewEPGFragment();
        newEPGFragment.setArguments(bundle);
        return newEPGFragment;
    }

    /* renamed from: n */
    public ArrayList<FavouriteDBModel> m18072n() {
        if (this.f22101b == null) {
            return null;
        }
        DatabaseHandler databaseHandler = new DatabaseHandler(this.f22101b);
        this.f22102c = databaseHandler;
        ArrayList<FavouriteDBModel> m15116v = databaseHandler.m15116v("live", SharepreferenceDBHandler.m15337A(this.f22101b));
        if (m15116v == null || m15116v.size() == 0) {
            return null;
        }
        return m15116v;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context context = getContext();
        this.f22101b = context;
        f22095G = new C6783a(context);
        SharedPreferences sharedPreferences = this.f22101b.getSharedPreferences("loginPrefs", 0);
        this.f22097B = sharedPreferences;
        this.f22125z = sharedPreferences.getInt("aspect_ratio", this.f22125z);
        Context context2 = this.f22101b;
        if (context2 != null) {
            SharedPreferences sharedPreferences2 = context2.getSharedPreferences("openedVideo", 0);
            this.f22120u = sharedPreferences2;
            SharedPreferences.Editor edit = sharedPreferences2.edit();
            this.f22124y = this.f22101b.getSharedPreferences("epgSyncStopped", 0);
            edit.putInt("openedVideoID", 0);
            edit.putString("LOGIN_PREF_OPENED_VIDEO_URL_M3U", "");
            edit.apply();
        }
        if (getArguments() != null) {
            this.f22121v = getArguments().getString("ACTIVE_LIVE_STREAM_CATEGORY_ID");
            this.f22122w = getArguments().getString("ACTIVE_LIVE_STREAM_CATEGORY_NAME");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.f22101b == null || this.f22113n == null) {
            return;
        }
        TypedValue typedValue = new TypedValue();
        if (this.f22101b.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.f22101b.getResources().getDisplayMetrics());
        }
        for (int i10 = 0; i10 < this.f22113n.getChildCount(); i10++) {
            if (this.f22113n.getChildAt(i10) instanceof ActionMenuView) {
                ((Toolbar.C0292e) this.f22113n.getChildAt(i10).getLayoutParams()).f26228a = 16;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        if (f22095G.m31285w() == 3) {
            C0135a.m668a().m669b("epg");
            i10 = 2131624212;
        } else {
            i10 = 2131624213;
        }
        View inflate = layoutInflater.inflate(i10, viewGroup, false);
        this.f22103d = ButterKnife.m5627b(this, inflate);
        C0936d.m5638o(getActivity());
        setHasOptionsMenu(true);
        try {
            m18077x();
        } catch (Exception e10) {
        }
        m18074q();
        this.currentEvent.setSelected(true);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        EPG epg = this.epg;
        if (epg != null) {
            epg.m19753G();
            this.epg.m19754H();
            this.epg.f24976X0 = true;
        }
        AsyncTask asyncTask = this.f22123x;
        if (asyncTask != null && asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            this.f22123x.cancel(true);
        }
        EPG epg2 = this.epg;
        if (epg2 != null && epg2.f24967S0 == 1) {
            this.f22100E.m6476a();
        }
        SharedPreferences sharedPreferences = this.f22101b.getSharedPreferences("openedVideo", 0);
        this.f22120u = sharedPreferences;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.clear();
        edit.apply();
        super.onDestroyView();
        this.f22103d.mo5629a();
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        int itemId = menuItem.getItemId();
        if (itemId == 2131428761) {
            startActivity(new Intent(this.f22101b, (Class<?>) NewDashboardActivity.class));
        }
        if (itemId == 2131428776) {
            startActivity(new Intent(this.f22101b, (Class<?>) SettingsActivity.class));
        }
        if (itemId != 2131427417 || (context = this.f22101b) == null) {
            return false;
        }
        new DialogC0242a.a(context, 2132082693).setTitle(getResources().getString(2132017988)).m857e(getResources().getString(2132017987)).m861i(getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3676e(this)).m858f(getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3675d(this)).m865m();
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        EPG epg = this.epg;
        if (epg != null) {
            epg.m19753G();
            this.epg.m19754H();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        menu.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        C1087k c1087k;
        SharedPreferences sharedPreferences = this.f22101b.getSharedPreferences("openedVideo", 0);
        this.f22120u = sharedPreferences;
        int i10 = sharedPreferences.getInt("openedVideoID", 0);
        String string = this.f22120u.getString("LOGIN_PREF_OPENED_VIDEO_URL_M3U", "");
        if (i10 != 0) {
            this.f22120u.edit().apply();
            if (this.epg != null) {
                if (f22095G.m31285w() == 3) {
                    if (SharepreferenceDBHandler.m15373f(this.f22101b).equals("m3u")) {
                        this.epg.f24973V0 = Uri.parse(string);
                    } else {
                        this.epg.f24973V0 = Uri.parse(this.f22098C + i10 + this.f22099D);
                    }
                    EPG epg = this.epg;
                    epg.f24976X0 = false;
                    epg.f24941F0 = 0;
                    epg.f24947I0 = false;
                } else {
                    if (SharepreferenceDBHandler.m15373f(this.f22101b).equals("m3u")) {
                        this.mVideoView.m19533b0(Uri.parse(string), true, "");
                    } else {
                        this.mVideoView.m19533b0(Uri.parse(this.f22098C + i10 + this.f22099D), true, "");
                    }
                    NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG = this.mVideoView;
                    nSTIJKPlayerSmallEPG.f24636K = 0;
                    nSTIJKPlayerSmallEPG.f24640M = false;
                    nSTIJKPlayerSmallEPG.start();
                }
            }
        }
        EPG epg2 = this.epg;
        if (epg2 != null && epg2.f24967S0 == 1 && (c1087k = this.f22100E) != null) {
            c1087k.m6479d();
        }
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        EPG epg = this.epg;
        if (epg != null) {
            epg.m19753G();
            this.epg.m19754H();
        }
        try {
            EPG epg2 = this.epg;
            if (epg2 != null && epg2.f24967S0 == 1) {
                this.f22100E.m6478c();
            }
        } catch (Exception e10) {
        }
        super.onStop();
        this.f22117r.removeCallbacksAndMessages(null);
    }

    @OnClick
    public void onViewClicked() {
        m18075u((this.epg == null || this.epg.getSelectedEvent() == null) ? false : true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (getView() != null) {
            getView().setOnKeyListener(new ViewOnKeyListenerC3672a(this));
        }
    }

    /* renamed from: p */
    public ArrayList<FavouriteM3UModel> m18073p() {
        LiveStreamDBHandler liveStreamDBHandler;
        ArrayList<FavouriteM3UModel> m15175K1;
        if (this.f22101b == null || (liveStreamDBHandler = this.f22104e) == null || (m15175K1 = liveStreamDBHandler.m15175K1("live")) == null || m15175K1.size() == 0) {
            return null;
        }
        return m15175K1;
    }

    /* renamed from: q */
    public final void m18074q() {
        View view;
        this.f22101b = getContext();
        this.f22104e = new LiveStreamDBHandler(this.f22101b);
        if (this.f22101b != null) {
            m18075u(false);
            if (!this.f22121v.equals("-1")) {
                if ((SharepreferenceDBHandler.m15373f(this.f22101b).equals("m3u") ? this.f22104e.m15154C1(this.f22121v, "live") : this.f22104e.m15181N1(this.f22121v)) == 0 && !this.f22121v.equals("0")) {
                    ProgressBar progressBar = this.pbLoader;
                    if (progressBar != null) {
                        progressBar.setVisibility(4);
                    }
                    view = this.tvNoStream;
                    if (view == null) {
                        return;
                    }
                    view.setVisibility(0);
                    return;
                }
                m18076w(this.f22121v, this.epgFragment, 2131427898);
            }
            if (SharepreferenceDBHandler.m15373f(this.f22101b).equals("m3u")) {
                ArrayList<FavouriteM3UModel> m18073p = m18073p();
                if (m18073p == null || m18073p.size() == 0) {
                    ProgressBar progressBar2 = this.pbLoader;
                    if (progressBar2 != null) {
                        progressBar2.setVisibility(4);
                    }
                    TextView textView = this.tvNoStream;
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                    view = this.rl_add_channel_to_fav;
                    if (view == null) {
                        return;
                    }
                    view.setVisibility(0);
                    return;
                }
                m18076w(this.f22121v, this.epgFragment, 2131427898);
            }
            ArrayList<FavouriteDBModel> m18072n = m18072n();
            if (m18072n == null || m18072n.size() == 0) {
                ProgressBar progressBar3 = this.pbLoader;
                if (progressBar3 != null) {
                    progressBar3.setVisibility(4);
                }
                TextView textView2 = this.tvNoStream;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                view = this.rl_add_channel_to_fav;
                if (view == null) {
                    return;
                }
                view.setVisibility(0);
                return;
            }
            m18076w(this.f22121v, this.epgFragment, 2131427898);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01b0, code lost:
    
        if (r0.equals(org.apache.http.HttpHost.DEFAULT_SCHEME_NAME) == false) goto L33;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a9  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m18075u(boolean r13) {
        /*
            Method dump skipped, instructions count: 1155
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.fragment.NewEPGFragment.m18075u(boolean):void");
    }

    /* renamed from: w */
    public final void m18076w(String str, RelativeLayout relativeLayout, int i10) {
        this.f22123x = new AsyncTaskC3673b(this, this.epg, 0, str, relativeLayout).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
    }

    /* renamed from: x */
    public final void m18077x() {
        this.f22113n = (Toolbar) getActivity().findViewById(2131429320);
    }
}

package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.R;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0243b;
import androidx.appcompat.app.DialogC0242a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.ExternalPlayerDataBase;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.ExternalPlayerModelClass;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import nf.C6783a;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p151if.C5251a;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity.class */
public class PlayerSelectionActivity extends ActivityC0243b implements View.OnClickListener {

    @BindView
    public AppBarLayout appbarToolbar;

    @BindView
    public Button btnBackPlayerselection;

    @BindView
    public Button btn_reset_player_selection;

    /* renamed from: d */
    public Context f17936d;

    @BindView
    public TextView date;

    /* renamed from: e */
    public SharedPreferences f17937e;

    /* renamed from: f */
    public LiveStreamDBHandler f17938f;

    @BindView
    public ImageView iv_add_player;

    /* renamed from: k */
    public ExternalPlayerDataBase f17943k;

    @BindView
    public LinearLayout ll_catchup_player;

    @BindView
    public LinearLayout ll_series_player;

    @BindView
    public ImageView logo;

    @BindView
    public RelativeLayout rlSettings;

    @BindView
    public TextView separator;

    @BindView
    public TextView separatorSecond;

    @BindView
    public Spinner spCatchup;

    @BindView
    public Spinner spEpg;

    @BindView
    public Spinner spLive;

    @BindView
    public Spinner spRecordings;

    @BindView
    public Spinner spSeries;

    @BindView
    public Spinner spVod;

    @BindView
    public TextView textView;

    @BindView
    public TextView textViewSecond;

    @BindView
    public TextView time;

    @BindView
    public Toolbar toolbar;

    /* renamed from: v */
    public C6783a f17954v;

    /* renamed from: g */
    public DatabaseUpdatedStatusDBModel f17939g = new DatabaseUpdatedStatusDBModel();

    /* renamed from: h */
    public DatabaseUpdatedStatusDBModel f17940h = new DatabaseUpdatedStatusDBModel();

    /* renamed from: i */
    public String f17941i = "";

    /* renamed from: j */
    public String f17942j = "";

    /* renamed from: l */
    public ArrayList<ExternalPlayerModelClass> f17944l = new ArrayList<>();

    /* renamed from: m */
    public ArrayList<ExternalPlayerModelClass> f17945m = new ArrayList<>();

    /* renamed from: n */
    public ArrayList<ExternalPlayerModelClass> f17946n = new ArrayList<>();

    /* renamed from: o */
    public ArrayList<ExternalPlayerModelClass> f17947o = new ArrayList<>();

    /* renamed from: p */
    public int f17948p = 0;

    /* renamed from: q */
    public int f17949q = 0;

    /* renamed from: r */
    public int f17950r = 0;

    /* renamed from: s */
    public int f17951s = 0;

    /* renamed from: t */
    public int f17952t = 0;

    /* renamed from: u */
    public int f17953u = 0;

    /* renamed from: w */
    public Thread f17955w = null;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.PlayerSelectionActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity$a.class */
    public class ViewOnClickListenerC2912a implements View.OnClickListener {

        /* renamed from: b */
        public final PopupWindow f17956b;

        /* renamed from: c */
        public final PlayerSelectionActivity f17957c;

        public ViewOnClickListenerC2912a(PlayerSelectionActivity playerSelectionActivity, PopupWindow popupWindow) {
            this.f17957c = playerSelectionActivity;
            this.f17956b = popupWindow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f17957c.m16242Q0();
            PopupWindow popupWindow = this.f17956b;
            if (popupWindow == null || !popupWindow.isShowing()) {
                return;
            }
            this.f17956b.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.PlayerSelectionActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity$b.class */
    public class DialogInterfaceOnClickListenerC2913b implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final PlayerSelectionActivity f17958b;

        public DialogInterfaceOnClickListenerC2913b(PlayerSelectionActivity playerSelectionActivity) {
            this.f17958b = playerSelectionActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.PlayerSelectionActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity$c.class */
    public class DialogInterfaceOnClickListenerC2914c implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final PlayerSelectionActivity f17959b;

        public DialogInterfaceOnClickListenerC2914c(PlayerSelectionActivity playerSelectionActivity) {
            this.f17959b = playerSelectionActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26211N(this.f17959b.f17936d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.PlayerSelectionActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity$d.class */
    public class DialogInterfaceOnClickListenerC2915d implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final PlayerSelectionActivity f17960b;

        public DialogInterfaceOnClickListenerC2915d(PlayerSelectionActivity playerSelectionActivity) {
            this.f17960b = playerSelectionActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26210M(this.f17960b.f17936d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.PlayerSelectionActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity$e.class */
    public class DialogInterfaceOnClickListenerC2916e implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final PlayerSelectionActivity f17961b;

        public DialogInterfaceOnClickListenerC2916e(PlayerSelectionActivity playerSelectionActivity) {
            this.f17961b = playerSelectionActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.PlayerSelectionActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity$f.class */
    public class DialogInterfaceOnClickListenerC2917f implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final PlayerSelectionActivity f17962b;

        public DialogInterfaceOnClickListenerC2917f(PlayerSelectionActivity playerSelectionActivity) {
            this.f17962b = playerSelectionActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.PlayerSelectionActivity$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity$g.class */
    public class DialogInterfaceOnClickListenerC2918g implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final PlayerSelectionActivity f17963b;

        public DialogInterfaceOnClickListenerC2918g(PlayerSelectionActivity playerSelectionActivity) {
            this.f17963b = playerSelectionActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.PlayerSelectionActivity$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity$h.class */
    public class ViewOnClickListenerC2919h implements View.OnClickListener {

        /* renamed from: b */
        public final PlayerSelectionActivity f17964b;

        public ViewOnClickListenerC2919h(PlayerSelectionActivity playerSelectionActivity) {
            this.f17964b = playerSelectionActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f17964b.f17936d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.PlayerSelectionActivity$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity$i.class */
    public class C2920i implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        public final LinkedHashMap f17965b;

        /* renamed from: c */
        public final List f17966c;

        /* renamed from: d */
        public final PlayerSelectionActivity f17967d;

        public C2920i(PlayerSelectionActivity playerSelectionActivity, LinkedHashMap linkedHashMap, List list) {
            this.f17967d = playerSelectionActivity;
            this.f17965b = linkedHashMap;
            this.f17966c = list;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        @SuppressLint({"NewApi"})
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            new SharepreferenceDBHandler();
            if (this.f17967d.f17953u == i10) {
                String m15377h = SharepreferenceDBHandler.m15377h(this.f17967d.f17936d);
                String m15375g = SharepreferenceDBHandler.m15375g(this.f17967d.f17936d);
                if (m15377h == null || m15377h.isEmpty() || m15377h.equals("")) {
                    return;
                }
                this.f17967d.spEpg.setSelection(this.f17967d.m16237K0(this.f17966c, m15377h, m15375g, this.f17965b));
                return;
            }
            this.f17967d.f17953u = i10;
            this.f17967d.spEpg.setSelection(i10);
            if (this.f17965b.containsKey(this.f17966c.get(i10))) {
                String str = (String) this.f17965b.get(this.f17966c.get(i10));
                String str2 = (String) PlayerSelectionActivity.m16223L0(this.f17965b, str);
                if (str == null || str.isEmpty() || str.equals("") || this.f17967d.f17936d == null || str2 == null || str2.isEmpty() || str2.equals("")) {
                    return;
                }
                SharepreferenceDBHandler.m15352P(str, str2, this.f17967d.f17936d);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.PlayerSelectionActivity$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity$j.class */
    public class C2921j implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        public final LinkedHashMap f17968b;

        /* renamed from: c */
        public final List f17969c;

        /* renamed from: d */
        public final PlayerSelectionActivity f17970d;

        public C2921j(PlayerSelectionActivity playerSelectionActivity, LinkedHashMap linkedHashMap, List list) {
            this.f17970d = playerSelectionActivity;
            this.f17968b = linkedHashMap;
            this.f17969c = list;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            new SharepreferenceDBHandler();
            if (this.f17970d.f17952t == i10) {
                String m15395r = SharepreferenceDBHandler.m15395r(this.f17970d.f17936d);
                String m15394q = SharepreferenceDBHandler.m15394q(this.f17970d.f17936d);
                if (m15395r == null || m15395r.isEmpty() || m15395r.equals("")) {
                    return;
                }
                this.f17970d.spRecordings.setSelection(this.f17970d.m16237K0(this.f17969c, m15395r, m15394q, this.f17968b));
                return;
            }
            this.f17970d.f17952t = i10;
            this.f17970d.spRecordings.setSelection(i10);
            if (this.f17968b.containsKey(this.f17969c.get(i10))) {
                String str = (String) this.f17968b.get(this.f17969c.get(i10));
                String str2 = (String) PlayerSelectionActivity.m16223L0(this.f17968b, str);
                if (str == null || str.isEmpty() || str.equals("") || this.f17970d.f17936d == null || str2 == null || str2.isEmpty() || str2.equals("")) {
                    return;
                }
                SharepreferenceDBHandler.m15361Y(str, str2, this.f17970d.f17936d);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.PlayerSelectionActivity$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity$k.class */
    public class C2922k implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        public final LinkedHashMap f17971b;

        /* renamed from: c */
        public final List f17972c;

        /* renamed from: d */
        public final PlayerSelectionActivity f17973d;

        public C2922k(PlayerSelectionActivity playerSelectionActivity, LinkedHashMap linkedHashMap, List list) {
            this.f17973d = playerSelectionActivity;
            this.f17971b = linkedHashMap;
            this.f17972c = list;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        @TargetApi(19)
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            new SharepreferenceDBHandler();
            if (this.f17973d.f17951s == i10) {
                String m15371e = SharepreferenceDBHandler.m15371e(this.f17973d.f17936d);
                String m15369d = SharepreferenceDBHandler.m15369d(this.f17973d.f17936d);
                if (m15371e == null || m15371e.isEmpty() || m15371e.equals("")) {
                    return;
                }
                this.f17973d.spCatchup.setSelection(this.f17973d.m16237K0(this.f17972c, m15371e, m15369d, this.f17971b));
                return;
            }
            this.f17973d.f17951s = i10;
            this.f17973d.spCatchup.setSelection(i10);
            if (this.f17971b.containsKey(this.f17972c.get(i10))) {
                String str = (String) this.f17971b.get(this.f17972c.get(i10));
                String str2 = (String) PlayerSelectionActivity.m16223L0(this.f17971b, str);
                if (str == null || str.isEmpty() || str.equals("") || this.f17973d.f17936d == null || str2 == null || str2.isEmpty() || str2.equals("")) {
                    return;
                }
                SharepreferenceDBHandler.m15350N(str, str2, this.f17973d.f17936d);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity$l.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.PlayerSelectionActivity$l */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity$l.class */
    public class C2923l implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        public final LinkedHashMap f17974b;

        /* renamed from: c */
        public final List f17975c;

        /* renamed from: d */
        public final PlayerSelectionActivity f17976d;

        public C2923l(PlayerSelectionActivity playerSelectionActivity, LinkedHashMap linkedHashMap, List list) {
            this.f17976d = playerSelectionActivity;
            this.f17974b = linkedHashMap;
            this.f17975c = list;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            new SharepreferenceDBHandler();
            if (this.f17976d.f17950r == i10) {
                String m15399v = SharepreferenceDBHandler.m15399v(this.f17976d.f17936d);
                String m15398u = SharepreferenceDBHandler.m15398u(this.f17976d.f17936d);
                if (m15399v == null || m15399v.isEmpty() || m15399v.equals("")) {
                    return;
                }
                this.f17976d.spSeries.setSelection(this.f17976d.m16237K0(this.f17975c, m15399v, m15398u, this.f17974b));
                return;
            }
            this.f17976d.f17950r = i10;
            this.f17976d.spSeries.setSelection(i10);
            if (this.f17974b.containsKey(this.f17975c.get(i10))) {
                String str = (String) this.f17974b.get(this.f17975c.get(i10));
                String str2 = (String) PlayerSelectionActivity.m16223L0(this.f17974b, str);
                if (str == null || str.isEmpty() || str.equals("") || this.f17976d.f17936d == null || str2 == null || str2.isEmpty() || str2.equals("")) {
                    return;
                }
                SharepreferenceDBHandler.m15366b0(str, str2, this.f17976d.f17936d);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity$m.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.PlayerSelectionActivity$m */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity$m.class */
    public class C2924m implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        public final LinkedHashMap f17977b;

        /* renamed from: c */
        public final List f17978c;

        /* renamed from: d */
        public final PlayerSelectionActivity f17979d;

        public C2924m(PlayerSelectionActivity playerSelectionActivity, LinkedHashMap linkedHashMap, List list) {
            this.f17979d = playerSelectionActivity;
            this.f17977b = linkedHashMap;
            this.f17978c = list;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            new SharepreferenceDBHandler();
            if (this.f17979d.f17949q == i10) {
                String m15341E = SharepreferenceDBHandler.m15341E(this.f17979d.f17936d);
                String m15340D = SharepreferenceDBHandler.m15340D(this.f17979d.f17936d);
                if (m15341E == null || m15341E.isEmpty() || m15341E.equals("")) {
                    return;
                }
                this.f17979d.spVod.setSelection(this.f17979d.m16237K0(this.f17978c, m15341E, m15340D, this.f17977b));
                return;
            }
            this.f17979d.f17949q = i10;
            this.f17979d.spVod.setSelection(i10);
            if (this.f17977b.containsKey(this.f17978c.get(i10))) {
                String str = (String) this.f17977b.get(this.f17978c.get(i10));
                String str2 = (String) PlayerSelectionActivity.m16223L0(this.f17977b, str);
                if (str == null || str.isEmpty() || str.equals("") || this.f17979d.f17936d == null || str2 == null || str2.isEmpty() || str2.equals("")) {
                    return;
                }
                SharepreferenceDBHandler.m15382j0(str, str2, this.f17979d.f17936d);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity$n.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.PlayerSelectionActivity$n */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity$n.class */
    public class C2925n implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        public final LinkedHashMap f17980b;

        /* renamed from: c */
        public final List f17981c;

        /* renamed from: d */
        public final PlayerSelectionActivity f17982d;

        public C2925n(PlayerSelectionActivity playerSelectionActivity, LinkedHashMap linkedHashMap, List list) {
            this.f17982d = playerSelectionActivity;
            this.f17980b = linkedHashMap;
            this.f17981c = list;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            new SharepreferenceDBHandler();
            if (this.f17982d.f17948p == i10) {
                String m15385l = SharepreferenceDBHandler.m15385l(this.f17982d.f17936d);
                String m15383k = SharepreferenceDBHandler.m15383k(this.f17982d.f17936d);
                if (m15385l == null || m15385l.isEmpty() || m15385l.equals("")) {
                    return;
                }
                this.f17982d.spLive.setSelection(this.f17982d.m16237K0(this.f17981c, m15385l, m15383k, this.f17980b));
                return;
            }
            this.f17982d.f17948p = i10;
            this.f17982d.spLive.setSelection(i10);
            if (this.f17980b.containsKey(this.f17981c.get(i10))) {
                String str = (String) this.f17980b.get(this.f17981c.get(i10));
                String str2 = (String) PlayerSelectionActivity.m16223L0(this.f17980b, str);
                if (str == null || str.isEmpty() || str.equals("") || this.f17982d.f17936d == null || str2 == null || str2.isEmpty() || str2.equals("")) {
                    return;
                }
                SharepreferenceDBHandler.m15356T(str, str2, this.f17982d.f17936d);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity$o.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.PlayerSelectionActivity$o */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity$o.class */
    public class RunnableC2926o implements Runnable {

        /* renamed from: b */
        public final PlayerSelectionActivity f17983b;

        public RunnableC2926o(PlayerSelectionActivity playerSelectionActivity) {
            this.f17983b = playerSelectionActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String date = Calendar.getInstance().getTime().toString();
                String m26199B = C5255e.m26199B(this.f17983b.f17936d);
                String m26249p = C5255e.m26249p(date);
                TextView textView = this.f17983b.time;
                if (textView != null) {
                    textView.setText(m26199B);
                }
                TextView textView2 = this.f17983b.date;
                if (textView2 != null) {
                    textView2.setText(m26249p);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity$p.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.PlayerSelectionActivity$p */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity$p.class */
    public class ViewOnClickListenerC2927p implements View.OnClickListener {

        /* renamed from: b */
        public final PopupWindow f17984b;

        /* renamed from: c */
        public final PlayerSelectionActivity f17985c;

        public ViewOnClickListenerC2927p(PlayerSelectionActivity playerSelectionActivity, PopupWindow popupWindow) {
            this.f17985c = playerSelectionActivity;
            this.f17984b = popupWindow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PopupWindow popupWindow = this.f17984b;
            if (popupWindow == null || !popupWindow.isShowing()) {
                return;
            }
            this.f17984b.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity$q.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.PlayerSelectionActivity$q */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity$q.class */
    public class RunnableC2928q implements Runnable {

        /* renamed from: b */
        public final PlayerSelectionActivity f17986b;

        public RunnableC2928q(PlayerSelectionActivity playerSelectionActivity) {
            this.f17986b = playerSelectionActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    this.f17986b.m16235I0();
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                } catch (Exception e11) {
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity$r.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.PlayerSelectionActivity$r */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSelectionActivity$r.class */
    public class ViewOnFocusChangeListenerC2929r implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f17987b;

        /* renamed from: c */
        public final PlayerSelectionActivity f17988c;

        public ViewOnFocusChangeListenerC2929r(PlayerSelectionActivity playerSelectionActivity, View view) {
            this.f17988c = playerSelectionActivity;
            this.f17987b = view;
        }

        /* renamed from: a */
        public final void m16253a(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17987b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: b */
        public final void m16254b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17987b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            View view2;
            int i10;
            float f10 = 1.0f;
            if (!z10) {
                if (z10) {
                    return;
                }
                if (z10) {
                    f10 = 1.09f;
                }
                m16253a(f10);
                m16254b(f10);
                if (this.f17987b.getTag().equals("1") || this.f17987b.getTag().equals("2")) {
                    this.f17987b.setBackgroundResource(2131230845);
                    return;
                }
                return;
            }
            if (z10) {
                f10 = 1.05f;
            }
            Log.e("id is", "" + this.f17987b.getTag());
            if (this.f17987b.getTag().equals("1")) {
                m16253a(f10);
                m16254b(f10);
                view2 = this.f17987b;
                i10 = 2131230828;
            } else if (!this.f17987b.getTag().equals("2")) {
                m16253a(1.12f);
                m16254b(1.12f);
                return;
            } else {
                m16253a(f10);
                m16254b(f10);
                view2 = this.f17987b;
                i10 = 2131231576;
            }
            view2.setBackgroundResource(i10);
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: L0 */
    public static <T, E> T m16223L0(Map<T, E> map, E e10) {
        for (Map.Entry<T, E> entry : map.entrySet()) {
            if (Objects.equals(e10, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    /* renamed from: G0 */
    public final void m16233G0() {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        Iterator<ExternalPlayerModelClass> it = this.f17946n.iterator();
        while (it.hasNext()) {
            ExternalPlayerModelClass next = it.next();
            arrayList.add(next.m15415a());
            linkedHashMap.put(next.m15415a(), next.m15416b());
        }
        m16246V0(this.f17946n, linkedHashMap, arrayList);
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap<String, String> linkedHashMap2 = new LinkedHashMap<>();
        Iterator<ExternalPlayerModelClass> it2 = this.f17944l.iterator();
        while (it2.hasNext()) {
            ExternalPlayerModelClass next2 = it2.next();
            arrayList2.add(next2.m15415a());
            linkedHashMap2.put(next2.m15415a(), next2.m15416b());
        }
        m16251a1(this.f17944l, linkedHashMap2, arrayList2);
        m16250Z0(this.f17944l, linkedHashMap2, arrayList2);
        m16240O0(this.f17944l, linkedHashMap2, arrayList2);
        m16248X0(this.f17944l, linkedHashMap2, arrayList2);
        m16245T0(this.f17944l, linkedHashMap2, arrayList2);
    }

    /* renamed from: H0 */
    public final void m16234H0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: I0 */
    public void m16235I0() {
        runOnUiThread(new RunnableC2926o(this));
    }

    /* renamed from: J0 */
    public final void m16236J0() {
        Button button = this.btnBackPlayerselection;
        if (button != null) {
            button.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2929r(this, button));
        }
        Button button2 = this.btn_reset_player_selection;
        button2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2929r(this, button2));
        this.btn_reset_player_selection.requestFocus();
        this.btn_reset_player_selection.requestFocusFromTouch();
    }

    /* renamed from: K0 */
    public final int m16237K0(List<String> list, String str, String str2, LinkedHashMap<String, String> linkedHashMap) {
        Iterator<Map.Entry<String, String>> it = linkedHashMap.entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next().getValue().toString().equals(str)) {
                return i10;
            }
            i10++;
        }
        return 0;
    }

    /* renamed from: M0 */
    public final void m16238M0() {
        ArrayList<ExternalPlayerModelClass> arrayList = this.f17944l;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList<ExternalPlayerModelClass> arrayList2 = this.f17946n;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.f17936d = this;
        this.f17938f = new LiveStreamDBHandler(this.f17936d);
        if (this.f17936d != null) {
            this.f17943k = new ExternalPlayerDataBase(this.f17936d);
            ExternalPlayerModelClass externalPlayerModelClass = new ExternalPlayerModelClass();
            externalPlayerModelClass.m15417c("");
            externalPlayerModelClass.m15418d("Built-in Player (Hardware/Software Decoder)");
            externalPlayerModelClass.m15420f(CookieSpecs.DEFAULT);
            this.f17944l.add(externalPlayerModelClass);
            ArrayList<ExternalPlayerModelClass> m15132o = this.f17943k.m15132o();
            this.f17945m = m15132o;
            this.f17944l.addAll(1, m15132o);
        }
        if (this.f17936d != null) {
            this.f17943k = new ExternalPlayerDataBase(this.f17936d);
            ExternalPlayerModelClass externalPlayerModelClass2 = new ExternalPlayerModelClass();
            externalPlayerModelClass2.m15417c("");
            externalPlayerModelClass2.m15418d("Built-in Player (Native)");
            externalPlayerModelClass2.m15420f("default_native");
            this.f17946n.add(externalPlayerModelClass2);
            this.f17943k = new ExternalPlayerDataBase(this.f17936d);
            ExternalPlayerModelClass externalPlayerModelClass3 = new ExternalPlayerModelClass();
            externalPlayerModelClass3.m15417c("");
            externalPlayerModelClass3.m15418d("Built-in Player (Hardware/Software Decoder)");
            externalPlayerModelClass3.m15420f(CookieSpecs.DEFAULT);
            this.f17946n.add(externalPlayerModelClass3);
            ArrayList<ExternalPlayerModelClass> m15132o2 = this.f17943k.m15132o();
            this.f17947o = m15132o2;
            this.f17946n.addAll(2, m15132o2);
        }
        SharedPreferences sharedPreferences = getSharedPreferences("selectedPlayer", 0);
        this.f17937e = sharedPreferences;
        sharedPreferences.getString("selectedPlayer", "");
    }

    /* renamed from: N0 */
    public final void m16239N0() {
        new SharepreferenceDBHandler();
        SharepreferenceDBHandler.m15350N(CookieSpecs.DEFAULT, "Default Player", this.f17936d);
        this.spCatchup.setSelection(0);
    }

    /* renamed from: O0 */
    public final void m16240O0(ArrayList<ExternalPlayerModelClass> arrayList, LinkedHashMap<String, String> linkedHashMap, List<String> list) {
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.simple_list_item_1, list);
        arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        this.spCatchup.setAdapter((SpinnerAdapter) arrayAdapter);
        this.spCatchup.setOnItemSelectedListener(new C2922k(this, linkedHashMap, list));
    }

    /* renamed from: P0 */
    public final void m16241P0() {
        new SharepreferenceDBHandler();
        SharepreferenceDBHandler.m15356T(CookieSpecs.DEFAULT, "Default Player", this.f17936d);
        this.spLive.setSelection(0);
    }

    /* renamed from: Q0 */
    public final void m16242Q0() {
        m16241P0();
        m16243R0();
        m16249Y0();
        m16239N0();
        m16247W0();
        m16244S0();
    }

    /* renamed from: R0 */
    public final void m16243R0() {
        new SharepreferenceDBHandler();
        SharepreferenceDBHandler.m15382j0(CookieSpecs.DEFAULT, "Default Player", this.f17936d);
        this.spVod.setSelection(0);
    }

    /* renamed from: S0 */
    public final void m16244S0() {
        new SharepreferenceDBHandler();
        SharepreferenceDBHandler.m15352P(CookieSpecs.DEFAULT, "Default Player", this.f17936d);
        this.spEpg.setSelection(0);
    }

    /* renamed from: T0 */
    public final void m16245T0(ArrayList<ExternalPlayerModelClass> arrayList, LinkedHashMap<String, String> linkedHashMap, List<String> list) {
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.simple_list_item_1, list);
        arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        this.spEpg.setAdapter((SpinnerAdapter) arrayAdapter);
        this.spEpg.setOnItemSelectedListener(new C2920i(this, linkedHashMap, list));
    }

    /* renamed from: V0 */
    public final void m16246V0(ArrayList<ExternalPlayerModelClass> arrayList, LinkedHashMap<String, String> linkedHashMap, List<String> list) {
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.simple_list_item_1, list);
        arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        this.spLive.setAdapter((SpinnerAdapter) arrayAdapter);
        this.spLive.setOnItemSelectedListener(new C2925n(this, linkedHashMap, list));
    }

    /* renamed from: W0 */
    public final void m16247W0() {
        new SharepreferenceDBHandler();
        SharepreferenceDBHandler.m15361Y(CookieSpecs.DEFAULT, "Default Player", this.f17936d);
        this.spRecordings.setSelection(0);
    }

    /* renamed from: X0 */
    public final void m16248X0(ArrayList<ExternalPlayerModelClass> arrayList, LinkedHashMap<String, String> linkedHashMap, List<String> list) {
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.simple_list_item_1, list);
        arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        this.spRecordings.setAdapter((SpinnerAdapter) arrayAdapter);
        this.spRecordings.setOnItemSelectedListener(new C2921j(this, linkedHashMap, list));
    }

    /* renamed from: Y0 */
    public final void m16249Y0() {
        new SharepreferenceDBHandler();
        SharepreferenceDBHandler.m15366b0(CookieSpecs.DEFAULT, "Default Player", this.f17936d);
        this.spSeries.setSelection(0);
    }

    /* renamed from: Z0 */
    public final void m16250Z0(ArrayList<ExternalPlayerModelClass> arrayList, LinkedHashMap<String, String> linkedHashMap, List<String> list) {
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.simple_list_item_1, list);
        arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        this.spSeries.setAdapter((SpinnerAdapter) arrayAdapter);
        this.spSeries.setOnItemSelectedListener(new C2923l(this, linkedHashMap, list));
    }

    /* renamed from: a1 */
    public final void m16251a1(ArrayList<ExternalPlayerModelClass> arrayList, LinkedHashMap<String, String> linkedHashMap, List<String> list) {
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.simple_list_item_1, list);
        arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        this.spVod.setAdapter((SpinnerAdapter) arrayAdapter);
        this.spVod.setOnItemSelectedListener(new C2924m(this, linkedHashMap, list));
    }

    @SuppressLint({"RtlHardcoded"})
    /* renamed from: b1 */
    public final void m16252b1() {
        try {
            View inflate = ((LayoutInflater) this.f17936d.getSystemService("layout_inflater")).inflate(2131624468, (RelativeLayout) findViewById(2131429028));
            PopupWindow popupWindow = new PopupWindow(this.f17936d);
            popupWindow.setContentView(inflate);
            popupWindow.setWidth(-1);
            popupWindow.setHeight(-1);
            popupWindow.setFocusable(true);
            popupWindow.showAtLocation(inflate, 17, 0, 0);
            Button button = (Button) inflate.findViewById(2131427653);
            Button button2 = (Button) inflate.findViewById(2131427681);
            button2.setText(getResources().getString(2132018826));
            ((TextView) inflate.findViewById(2131429415)).setText(getResources().getString(2132017335));
            button.setOnFocusChangeListener(new C5255e.i(button, this));
            button2.setOnFocusChangeListener(new C5255e.i(button2, this));
            button.setOnClickListener(new ViewOnClickListenerC2927p(this, popupWindow));
            button2.setOnClickListener(new ViewOnClickListenerC2912a(this, popupWindow));
        } catch (NullPointerException | Exception e10) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(2130772003, 2130772000);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != 2131429468) {
            return;
        }
        startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i10;
        LinearLayout linearLayout;
        this.f17936d = this;
        super.onCreate(bundle);
        C6783a c6783a = new C6783a(this.f17936d);
        this.f17954v = c6783a;
        setContentView(c6783a.m31288z().equals(C5251a.f30065s0) ? 2131624028 : 2131624027);
        ButterKnife.m5626a(this);
        m16236J0();
        m16234H0();
        m878n0((Toolbar) findViewById(2131429320));
        getWindow().setFlags(1024, 1024);
        Thread thread = this.f17955w;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC2928q(this));
            this.f17955w = thread2;
            thread2.start();
        }
        if (SharepreferenceDBHandler.m15373f(this.f17936d).equals("m3u")) {
            linearLayout = this.ll_catchup_player;
            i10 = 8;
        } else {
            i10 = 0;
            this.ll_catchup_player.setVisibility(0);
            linearLayout = this.ll_series_player;
        }
        linearLayout.setVisibility(i10);
        this.logo.setOnClickListener(new ViewOnClickListenerC2919h(this));
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.toolbar.m1224x(2131689500);
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i10 = 0; i10 < this.toolbar.getChildCount(); i10++) {
            if (this.toolbar.getChildAt(i10) instanceof ActionMenuView) {
                ((Toolbar.C0292e) this.toolbar.getChildAt(i10).getLayoutParams()).f26228a = 16;
            }
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        int itemId = menuItem.getItemId();
        if (itemId == 2131428761) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == 2131428776) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == 2131427416 && (context = this.f17936d) != null) {
            new DialogC0242a.a(context, 2132082693).setTitle(getResources().getString(2132017988)).m857e(getResources().getString(2132017987)).m861i(getResources().getString(2132018825), new DialogInterfaceOnClickListenerC2914c(this)).m858f(getResources().getString(2132018187), new DialogInterfaceOnClickListenerC2913b(this)).m865m();
        }
        if (itemId == 2131428637) {
            DialogC0242a.a aVar = new DialogC0242a.a(this);
            aVar.setTitle(this.f17936d.getResources().getString(2132017514));
            aVar.m857e(this.f17936d.getResources().getString(2132017585));
            aVar.m855c(2131231731);
            aVar.m861i(this.f17936d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC2915d(this));
            aVar.m858f(this.f17936d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC2916e(this));
            aVar.m865m();
        }
        if (itemId == 2131428639) {
            DialogC0242a.a aVar2 = new DialogC0242a.a(this);
            aVar2.setTitle(this.f17936d.getResources().getString(2132017514));
            aVar2.m857e(this.f17936d.getResources().getString(2132017585));
            aVar2.m855c(2131231731);
            aVar2.m861i(this.f17936d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC2917f(this));
            aVar2.m858f(this.f17936d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC2918g(this));
            aVar2.m865m();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f17955w;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f17955w.interrupt();
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f17955w;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC2928q(this));
            this.f17955w = thread2;
            thread2.start();
        }
        overridePendingTransition(2130772003, 2130772000);
        m16238M0();
        m16233G0();
        C5255e.m26233f(this.f17936d);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f17937e = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f17937e.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        }
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f17948p = 0;
        this.f17949q = 0;
        this.f17950r = 0;
        this.f17951s = 0;
        this.f17952t = 0;
        this.f17953u = 0;
    }

    @OnClick
    public void onclick(View view) {
        switch (view.getId()) {
            case 2131427634:
                onBackPressed();
                break;
            case 2131427666:
            case 2131428224:
            case 2131428489:
            case 2131429592:
                m16252b1();
                break;
            case 2131428135:
            case 2131428319:
            case 2131429350:
                startActivity(new Intent(this, (Class<?>) ExternalPlayerActivity.class));
                break;
        }
    }
}

package com.maxdigitall.maxdigitaliptvbox.view.fragment;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.DialogC0242a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.C0704c;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.maxdigitall.maxdigitaliptvbox.model.EpgChannelModel;
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.callback.SeriesDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.PasswordStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity;
import com.maxdigitall.maxdigitaliptvbox.view.activity.SettingsActivity;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesStreamsAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import p030c0.C0936d;
import p151if.C5251a;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SeriesTabFragment.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SeriesTabFragment.class */
public class SeriesTabFragment extends Fragment {

    /* renamed from: A */
    public PopupWindow f22312A;

    /* renamed from: b */
    public RecyclerView.AbstractC0685p f22313b;

    /* renamed from: c */
    public SharedPreferences f22314c;

    /* renamed from: d */
    public SeriesStreamsAdapter f22315d;

    /* renamed from: f */
    public Toolbar f22317f;

    /* renamed from: g */
    public Context f22318g;

    /* renamed from: h */
    public DatabaseHandler f22319h;

    /* renamed from: i */
    public Unbinder f22320i;

    /* renamed from: j */
    public String f22321j;

    /* renamed from: k */
    public LiveStreamDBHandler f22322k;

    @BindView
    public RecyclerView myRecyclerView;

    @BindView
    public ProgressBar pbLoader;

    /* renamed from: q */
    public ArrayList<PasswordStatusDBModel> f22328q;

    /* renamed from: r */
    public ArrayList<LiveStreamsDBModel> f22329r;

    /* renamed from: s */
    public ArrayList<LiveStreamsDBModel> f22330s;

    /* renamed from: t */
    public ArrayList<SeriesDBModel> f22331t;

    @BindView
    public TextView tvNoRecordFound;

    @BindView
    public TextView tvNoStream;

    /* renamed from: u */
    public ArrayList<LiveStreamsDBModel> f22332u;

    /* renamed from: v */
    public ArrayList<LiveStreamsDBModel> f22333v;

    /* renamed from: w */
    public SharedPreferences f22334w;

    /* renamed from: x */
    public SharedPreferences.Editor f22335x;

    /* renamed from: y */
    public SharedPreferences f22336y;

    /* renamed from: z */
    public SharedPreferences.Editor f22337z;

    /* renamed from: e */
    public ArrayList<SeriesDBModel> f22316e = new ArrayList<>();

    /* renamed from: l */
    public DatabaseUpdatedStatusDBModel f22323l = new DatabaseUpdatedStatusDBModel();

    /* renamed from: m */
    public DatabaseUpdatedStatusDBModel f22324m = new DatabaseUpdatedStatusDBModel();

    /* renamed from: n */
    public LiveStreamsDBModel f22325n = new LiveStreamsDBModel();

    /* renamed from: o */
    public ArrayList<EpgChannelModel> f22326o = new ArrayList<>();

    /* renamed from: p */
    public ArrayList<String> f22327p = new ArrayList<>();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SeriesTabFragment$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.SeriesTabFragment$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SeriesTabFragment$a.class */
    public class DialogInterfaceOnClickListenerC3722a implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SeriesTabFragment f22338b;

        public DialogInterfaceOnClickListenerC3722a(SeriesTabFragment seriesTabFragment) {
            this.f22338b = seriesTabFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SeriesTabFragment$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.SeriesTabFragment$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SeriesTabFragment$b.class */
    public class DialogInterfaceOnClickListenerC3723b implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SeriesTabFragment f22339b;

        public DialogInterfaceOnClickListenerC3723b(SeriesTabFragment seriesTabFragment) {
            this.f22339b = seriesTabFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26211N(this.f22339b.f22318g);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SeriesTabFragment$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.SeriesTabFragment$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SeriesTabFragment$c.class */
    public class ViewOnClickListenerC3724c implements View.OnClickListener {

        /* renamed from: b */
        public final SeriesTabFragment f22340b;

        public ViewOnClickListenerC3724c(SeriesTabFragment seriesTabFragment) {
            this.f22340b = seriesTabFragment;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f22340b.f22312A.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SeriesTabFragment$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.SeriesTabFragment$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SeriesTabFragment$d.class */
    public class ViewOnClickListenerC3725d implements View.OnClickListener {

        /* renamed from: b */
        public final RadioGroup f22341b;

        /* renamed from: c */
        public final View f22342c;

        /* renamed from: d */
        public final SeriesTabFragment f22343d;

        public ViewOnClickListenerC3725d(SeriesTabFragment seriesTabFragment, RadioGroup radioGroup, View view) {
            this.f22343d = seriesTabFragment;
            this.f22341b = radioGroup;
            this.f22342c = view;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SharedPreferences.Editor editor;
            String str;
            RadioButton radioButton = (RadioButton) this.f22342c.findViewById(this.f22341b.getCheckedRadioButtonId());
            if (radioButton.getText().toString().equals(this.f22343d.getResources().getString(2132018611))) {
                editor = this.f22343d.f22337z;
                str = "1";
            } else if (radioButton.getText().toString().equals(this.f22343d.getResources().getString(2132018607))) {
                editor = this.f22343d.f22337z;
                str = "2";
            } else if (radioButton.getText().toString().equals(this.f22343d.getResources().getString(2132018615))) {
                editor = this.f22343d.f22337z;
                str = "3";
            } else {
                editor = this.f22343d.f22337z;
                str = "0";
            }
            editor.putString("sort", str);
            this.f22343d.f22337z.commit();
            SeriesTabFragment seriesTabFragment = this.f22343d;
            seriesTabFragment.f22334w = seriesTabFragment.getActivity().getSharedPreferences("listgridview", 0);
            SeriesTabFragment seriesTabFragment2 = this.f22343d;
            seriesTabFragment2.f22335x = seriesTabFragment2.f22334w.edit();
            int i10 = this.f22343d.f22334w.getInt("livestream", 0);
            C5251a.f30068u = i10;
            if (i10 == 1) {
                this.f22343d.m18177y();
            } else {
                this.f22343d.m18170A();
            }
            this.f22343d.f22312A.dismiss();
        }
    }

    /* renamed from: A */
    public final void m18170A() {
        this.f22318g = getContext();
        this.f22322k = new LiveStreamDBHandler(this.f22318g);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f22318g == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f22313b = linearLayoutManager;
        this.myRecyclerView.setLayoutManager(linearLayoutManager);
        this.myRecyclerView.setItemAnimator(new C0704c());
        SharedPreferences sharedPreferences = this.f22318g.getSharedPreferences("loginPrefs", 0);
        this.f22314c = sharedPreferences;
        sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        this.f22314c.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        m18172E();
    }

    /* renamed from: B */
    public final void m18171B() {
        this.f22317f = (Toolbar) getActivity().findViewById(2131429320);
    }

    /* renamed from: E */
    public final void m18172E() {
        m18174a();
        if (this.f22318g != null) {
            LiveStreamDBHandler liveStreamDBHandler = new LiveStreamDBHandler(this.f22318g);
            this.f22328q = new ArrayList<>();
            this.f22329r = new ArrayList<>();
            this.f22330s = new ArrayList<>();
            this.f22331t = new ArrayList<>();
            this.f22332u = new ArrayList<>();
            this.f22333v = new ArrayList<>();
            ArrayList<SeriesDBModel> m15258v1 = liveStreamDBHandler.m15258v1(this.f22321j);
            this.f22331t = m15258v1;
            if (m15258v1 == null || this.myRecyclerView == null || m15258v1.size() == 0) {
                m18175b();
                return;
            }
            m18175b();
            this.f22331t = m15258v1;
            SeriesStreamsAdapter seriesStreamsAdapter = new SeriesStreamsAdapter(m15258v1, getContext());
            this.f22315d = seriesStreamsAdapter;
            this.myRecyclerView.setAdapter(seriesStreamsAdapter);
            this.f22315d.m4099w();
        }
    }

    /* renamed from: F */
    public final void m18173F(Activity activity) {
        try {
            View inflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(2131624516, (RelativeLayout) activity.findViewById(2131429032));
            PopupWindow popupWindow = new PopupWindow(activity);
            this.f22312A = popupWindow;
            popupWindow.setContentView(inflate);
            this.f22312A.setWidth(-1);
            this.f22312A.setHeight(-1);
            this.f22312A.setFocusable(true);
            this.f22312A.showAtLocation(inflate, 17, 0, 0);
            Button button = (Button) inflate.findViewById(2131427623);
            Button button2 = (Button) inflate.findViewById(2131427605);
            RadioGroup radioGroup = (RadioGroup) inflate.findViewById(2131428935);
            RadioButton radioButton = (RadioButton) inflate.findViewById(2131428909);
            RadioButton radioButton2 = (RadioButton) inflate.findViewById(2131428903);
            RadioButton radioButton3 = (RadioButton) inflate.findViewById(2131428897);
            RadioButton radioButton4 = (RadioButton) inflate.findViewById(2131428916);
            String string = this.f22336y.getString("sort", "");
            radioButton2.setVisibility(8);
            if (string.equals("1")) {
                radioButton2.setChecked(true);
            } else if (string.equals("2")) {
                radioButton3.setChecked(true);
            } else if (string.equals("3")) {
                radioButton4.setChecked(true);
            } else {
                radioButton.setChecked(true);
            }
            button2.setOnClickListener(new ViewOnClickListenerC3724c(this));
            button.setOnClickListener(new ViewOnClickListenerC3725d(this, radioGroup, inflate));
        } catch (NullPointerException | Exception e10) {
        }
    }

    /* renamed from: a */
    public void m18174a() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    /* renamed from: b */
    public void m18175b() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f22321j = getArguments().getString("");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.f22318g == null || this.f22317f == null) {
            return;
        }
        TypedValue typedValue = new TypedValue();
        if (this.f22318g.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.f22318g.getResources().getDisplayMetrics());
        }
        for (int i10 = 0; i10 < this.f22317f.getChildCount(); i10++) {
            if (this.f22317f.getChildAt(i10) instanceof ActionMenuView) {
                ((Toolbar.C0292e) this.f22317f.getChildAt(i10).getLayoutParams()).f26228a = 16;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(2131624211, viewGroup, false);
        this.f22320i = ButterKnife.m5627b(this, inflate);
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("sort_series", 0);
        this.f22336y = sharedPreferences;
        this.f22337z = sharedPreferences.edit();
        if (this.f22336y.getString("sort", "").equals("")) {
            this.f22337z.putString("sort", "0");
            this.f22337z.commit();
        }
        C0936d.m5638o(getActivity());
        setHasOptionsMenu(true);
        m18171B();
        SharedPreferences sharedPreferences2 = getActivity().getSharedPreferences("listgridview", 0);
        this.f22334w = sharedPreferences2;
        this.f22335x = sharedPreferences2.edit();
        int i10 = this.f22334w.getInt("livestream", 0);
        C5251a.f30068u = i10;
        if (i10 == 1) {
            m18177y();
        } else {
            m18170A();
        }
        String str = this.f22321j;
        if (str != null && str.equals("-1")) {
            m18176x();
        }
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f22320i.mo5629a();
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        int itemId = menuItem.getItemId();
        if (itemId == 2131428761) {
            startActivity(new Intent(this.f22318g, (Class<?>) NewDashboardActivity.class));
        }
        if (itemId == 2131428776) {
            startActivity(new Intent(this.f22318g, (Class<?>) SettingsActivity.class));
        }
        if (itemId == 2131427417 && (context = this.f22318g) != null) {
            new DialogC0242a.a(context, 2132082693).setTitle(getResources().getString(2132017988)).m857e(getResources().getString(2132017987)).m861i(getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3723b(this)).m858f(getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3722a(this)).m865m();
        }
        if (itemId == 2131427425 || itemId == 2131428638 || itemId == 2131428640) {
            return true;
        }
        if (itemId == 2131428252) {
            this.f22335x.putInt("livestream", 1);
            this.f22335x.commit();
            m18177y();
        }
        if (itemId == 2131428256) {
            this.f22335x.putInt("livestream", 0);
            this.f22335x.commit();
            m18170A();
        }
        if (itemId == 2131428645) {
            m18173F(getActivity());
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        menu.clear();
    }

    /* renamed from: x */
    public void m18176x() {
        ArrayList<SeriesDBModel> arrayList;
        ArrayList<SeriesDBModel> arrayList2;
        this.f22316e.clear();
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.f22315d);
        }
        if (this.f22318g != null) {
            DatabaseHandler databaseHandler = new DatabaseHandler(this.f22318g);
            this.f22319h = databaseHandler;
            Iterator<FavouriteDBModel> it = databaseHandler.m15116v("series", SharepreferenceDBHandler.m15337A(this.f22318g)).iterator();
            while (it.hasNext()) {
                SeriesDBModel m15201X1 = this.f22322k.m15201X1(String.valueOf(it.next().m14764e()));
                if (m15201X1 != null) {
                    this.f22316e.add(m15201X1);
                }
            }
            if (this.myRecyclerView != null && (arrayList2 = this.f22316e) != null && arrayList2.size() != 0) {
                m18175b();
                SeriesStreamsAdapter seriesStreamsAdapter = new SeriesStreamsAdapter(this.f22316e, getContext());
                this.f22315d = seriesStreamsAdapter;
                this.myRecyclerView.setAdapter(seriesStreamsAdapter);
                this.f22315d.m4099w();
                this.tvNoStream.setVisibility(4);
            }
            if (this.tvNoStream == null || (arrayList = this.f22316e) == null || arrayList.size() != 0) {
                return;
            }
            m18175b();
            RecyclerView recyclerView2 = this.myRecyclerView;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(this.f22315d);
            }
            this.tvNoStream.setVisibility(0);
        }
    }

    /* renamed from: y */
    public final void m18177y() {
        this.f22318g = getContext();
        this.f22322k = new LiveStreamDBHandler(this.f22318g);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f22318g == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), C5255e.m26257x(this.f22318g) + 1);
        this.f22313b = gridLayoutManager;
        this.myRecyclerView.setLayoutManager(gridLayoutManager);
        this.myRecyclerView.setItemAnimator(new C0704c());
        SharedPreferences sharedPreferences = this.f22318g.getSharedPreferences("loginPrefs", 0);
        this.f22314c = sharedPreferences;
        sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        this.f22314c.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        m18172E();
    }
}

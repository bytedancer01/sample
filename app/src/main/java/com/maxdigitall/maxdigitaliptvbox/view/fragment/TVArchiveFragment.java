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
import androidx.appcompat.widget.SearchView;
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
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.PasswordStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity;
import com.maxdigitall.maxdigitaliptvbox.view.activity.SettingsActivity;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.TVArchiveAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import p030c0.C0936d;
import p151if.C5251a;
import p151if.C5255e;
import p235o0.C6845p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/TVArchiveFragment.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/TVArchiveFragment.class */
public class TVArchiveFragment extends Fragment {

    /* renamed from: b */
    public RecyclerView.AbstractC0685p f22361b;

    /* renamed from: c */
    public SharedPreferences f22362c;

    /* renamed from: d */
    public TVArchiveAdapter f22363d;

    /* renamed from: f */
    public Toolbar f22365f;

    /* renamed from: g */
    public SearchView f22366g;

    /* renamed from: h */
    public Context f22367h;

    /* renamed from: i */
    public Unbinder f22368i;

    /* renamed from: j */
    public String f22369j;

    /* renamed from: k */
    public LiveStreamDBHandler f22370k;

    @BindView
    public RecyclerView myRecyclerView;

    @BindView
    public ProgressBar pbLoader;

    /* renamed from: q */
    public ArrayList<PasswordStatusDBModel> f22376q;

    /* renamed from: r */
    public ArrayList<LiveStreamsDBModel> f22377r;

    /* renamed from: s */
    public ArrayList<LiveStreamsDBModel> f22378s;

    /* renamed from: t */
    public ArrayList<LiveStreamsDBModel> f22379t;

    @BindView
    public TextView tvEgpRequired;

    @BindView
    public TextView tvNoRecordFound;

    @BindView
    public TextView tvNoStream;

    /* renamed from: u */
    public ArrayList<LiveStreamsDBModel> f22380u;

    /* renamed from: v */
    public SharedPreferences f22381v;

    /* renamed from: w */
    public SharedPreferences.Editor f22382w;

    /* renamed from: x */
    public SharedPreferences f22383x;

    /* renamed from: y */
    public SharedPreferences.Editor f22384y;

    /* renamed from: z */
    public PopupWindow f22385z;

    /* renamed from: e */
    public ArrayList<LiveStreamsDBModel> f22364e = new ArrayList<>();

    /* renamed from: l */
    public DatabaseUpdatedStatusDBModel f22371l = new DatabaseUpdatedStatusDBModel();

    /* renamed from: m */
    public DatabaseUpdatedStatusDBModel f22372m = new DatabaseUpdatedStatusDBModel();

    /* renamed from: n */
    public LiveStreamsDBModel f22373n = new LiveStreamsDBModel();

    /* renamed from: o */
    public ArrayList<EpgChannelModel> f22374o = new ArrayList<>();

    /* renamed from: p */
    public ArrayList<String> f22375p = new ArrayList<>();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/TVArchiveFragment$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.TVArchiveFragment$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/TVArchiveFragment$a.class */
    public class DialogInterfaceOnClickListenerC3728a implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final TVArchiveFragment f22386b;

        public DialogInterfaceOnClickListenerC3728a(TVArchiveFragment tVArchiveFragment) {
            this.f22386b = tVArchiveFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/TVArchiveFragment$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.TVArchiveFragment$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/TVArchiveFragment$b.class */
    public class DialogInterfaceOnClickListenerC3729b implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final TVArchiveFragment f22387b;

        public DialogInterfaceOnClickListenerC3729b(TVArchiveFragment tVArchiveFragment) {
            this.f22387b = tVArchiveFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26211N(this.f22387b.f22367h);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/TVArchiveFragment$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.TVArchiveFragment$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/TVArchiveFragment$c.class */
    public class C3730c implements SearchView.InterfaceC0282l {

        /* renamed from: a */
        public final TVArchiveFragment f22388a;

        public C3730c(TVArchiveFragment tVArchiveFragment) {
            this.f22388a = tVArchiveFragment;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextChange(String str) {
            TextView textView;
            this.f22388a.tvNoRecordFound.setVisibility(8);
            if (this.f22388a.f22363d == null || (textView = this.f22388a.tvNoStream) == null || textView.getVisibility() == 0) {
                return false;
            }
            this.f22388a.f22363d.m17501j0(str, this.f22388a.tvNoRecordFound);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/TVArchiveFragment$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.TVArchiveFragment$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/TVArchiveFragment$d.class */
    public class DialogInterfaceOnClickListenerC3731d implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final TVArchiveFragment f22389b;

        public DialogInterfaceOnClickListenerC3731d(TVArchiveFragment tVArchiveFragment) {
            this.f22389b = tVArchiveFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26210M(this.f22389b.f22367h);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/TVArchiveFragment$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.TVArchiveFragment$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/TVArchiveFragment$e.class */
    public class DialogInterfaceOnClickListenerC3732e implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final TVArchiveFragment f22390b;

        public DialogInterfaceOnClickListenerC3732e(TVArchiveFragment tVArchiveFragment) {
            this.f22390b = tVArchiveFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/TVArchiveFragment$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.TVArchiveFragment$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/TVArchiveFragment$f.class */
    public class DialogInterfaceOnClickListenerC3733f implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final TVArchiveFragment f22391b;

        public DialogInterfaceOnClickListenerC3733f(TVArchiveFragment tVArchiveFragment) {
            this.f22391b = tVArchiveFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/TVArchiveFragment$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.TVArchiveFragment$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/TVArchiveFragment$g.class */
    public class DialogInterfaceOnClickListenerC3734g implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final TVArchiveFragment f22392b;

        public DialogInterfaceOnClickListenerC3734g(TVArchiveFragment tVArchiveFragment) {
            this.f22392b = tVArchiveFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/TVArchiveFragment$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.TVArchiveFragment$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/TVArchiveFragment$h.class */
    public class ViewOnClickListenerC3735h implements View.OnClickListener {

        /* renamed from: b */
        public final TVArchiveFragment f22393b;

        public ViewOnClickListenerC3735h(TVArchiveFragment tVArchiveFragment) {
            this.f22393b = tVArchiveFragment;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f22393b.f22385z.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/TVArchiveFragment$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.TVArchiveFragment$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/TVArchiveFragment$i.class */
    public class ViewOnClickListenerC3736i implements View.OnClickListener {

        /* renamed from: b */
        public final RadioGroup f22394b;

        /* renamed from: c */
        public final View f22395c;

        /* renamed from: d */
        public final TVArchiveFragment f22396d;

        public ViewOnClickListenerC3736i(TVArchiveFragment tVArchiveFragment, RadioGroup radioGroup, View view) {
            this.f22396d = tVArchiveFragment;
            this.f22394b = radioGroup;
            this.f22395c = view;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SharedPreferences.Editor editor;
            String str;
            RadioButton radioButton = (RadioButton) this.f22395c.findViewById(this.f22394b.getCheckedRadioButtonId());
            if (radioButton.getText().toString().equals(this.f22396d.getResources().getString(2132018611))) {
                editor = this.f22396d.f22384y;
                str = "1";
            } else if (radioButton.getText().toString().equals(this.f22396d.getResources().getString(2132018607))) {
                editor = this.f22396d.f22384y;
                str = "2";
            } else if (radioButton.getText().toString().equals(this.f22396d.getResources().getString(2132018615))) {
                editor = this.f22396d.f22384y;
                str = "3";
            } else {
                editor = this.f22396d.f22384y;
                str = "0";
            }
            editor.putString("sort", str);
            this.f22396d.f22384y.commit();
            TVArchiveFragment tVArchiveFragment = this.f22396d;
            tVArchiveFragment.f22381v = tVArchiveFragment.getActivity().getSharedPreferences("listgridview", 0);
            TVArchiveFragment tVArchiveFragment2 = this.f22396d;
            tVArchiveFragment2.f22382w = tVArchiveFragment2.f22381v.edit();
            int i10 = this.f22396d.f22381v.getInt("livestream", 0);
            C5251a.f30068u = i10;
            if (i10 == 1) {
                this.f22396d.m18192B();
            } else {
                this.f22396d.m18193E();
            }
            this.f22396d.f22385z.dismiss();
        }
    }

    /* renamed from: F */
    public static TVArchiveFragment m18182F(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("", str);
        TVArchiveFragment tVArchiveFragment = new TVArchiveFragment();
        tVArchiveFragment.setArguments(bundle);
        return tVArchiveFragment;
    }

    /* renamed from: A */
    public final ArrayList<LiveStreamsDBModel> m18191A(ArrayList<LiveStreamsDBModel> arrayList, ArrayList<String> arrayList2) {
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
                if (!z10 && (arrayList3 = this.f22377r) != null) {
                    arrayList3.add(next);
                }
            }
        }
        return this.f22377r;
    }

    /* renamed from: B */
    public final void m18192B() {
        this.f22367h = getContext();
        this.f22370k = new LiveStreamDBHandler(this.f22367h);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f22367h == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), C5255e.m26257x(this.f22367h) + 1);
        this.f22361b = gridLayoutManager;
        this.myRecyclerView.setLayoutManager(gridLayoutManager);
        this.myRecyclerView.setItemAnimator(new C0704c());
        SharedPreferences sharedPreferences = this.f22367h.getSharedPreferences("loginPrefs", 0);
        this.f22362c = sharedPreferences;
        sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        this.f22362c.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        m18195I();
    }

    /* renamed from: E */
    public final void m18193E() {
        this.f22367h = getContext();
        this.f22370k = new LiveStreamDBHandler(this.f22367h);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f22367h == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f22361b = linearLayoutManager;
        this.myRecyclerView.setLayoutManager(linearLayoutManager);
        this.myRecyclerView.setItemAnimator(new C0704c());
        SharedPreferences sharedPreferences = this.f22367h.getSharedPreferences("loginPrefs", 0);
        this.f22362c = sharedPreferences;
        sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        this.f22362c.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        m18195I();
    }

    /* renamed from: G */
    public final void m18194G() {
        this.f22365f = (Toolbar) getActivity().findViewById(2131429320);
    }

    /* renamed from: I */
    public final void m18195I() {
        try {
            m18197a();
            if (this.f22367h != null) {
                LiveStreamDBHandler liveStreamDBHandler = new LiveStreamDBHandler(this.f22367h);
                this.f22376q = new ArrayList<>();
                this.f22377r = new ArrayList<>();
                this.f22378s = new ArrayList<>();
                this.f22379t = new ArrayList<>();
                this.f22380u = new ArrayList<>();
                ArrayList<LiveStreamsDBModel> m15212d1 = liveStreamDBHandler.m15212d1(this.f22369j);
                if (liveStreamDBHandler.m15189R1(SharepreferenceDBHandler.m15337A(this.f22367h)) <= 0 || m15212d1 == null) {
                    this.f22379t = m15212d1;
                } else {
                    ArrayList<String> m18199y = m18199y();
                    this.f22375p = m18199y;
                    if (m18199y != null) {
                        this.f22378s = m18191A(m15212d1, m18199y);
                    }
                    this.f22379t = this.f22378s;
                }
                ArrayList<LiveStreamsDBModel> arrayList = this.f22379t;
                if (arrayList != null && this.myRecyclerView != null && arrayList.size() != 0) {
                    m18198b();
                    TVArchiveAdapter tVArchiveAdapter = new TVArchiveAdapter(this.f22379t, getContext());
                    this.f22363d = tVArchiveAdapter;
                    this.myRecyclerView.setAdapter(tVArchiveAdapter);
                    this.f22363d.m4099w();
                    return;
                }
                m18198b();
                TextView textView = this.tvNoStream;
                if (textView != null) {
                    textView.setText(getResources().getString(2132018219));
                    this.tvNoStream.setVisibility(0);
                }
                this.tvEgpRequired.setVisibility(0);
            }
        } catch (NullPointerException | Exception e10) {
        }
    }

    /* renamed from: J */
    public final void m18196J(Activity activity) {
        try {
            View inflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(2131624516, (RelativeLayout) activity.findViewById(2131429032));
            PopupWindow popupWindow = new PopupWindow(activity);
            this.f22385z = popupWindow;
            popupWindow.setContentView(inflate);
            this.f22385z.setWidth(-1);
            this.f22385z.setHeight(-1);
            this.f22385z.setFocusable(true);
            this.f22385z.showAtLocation(inflate, 17, 0, 0);
            Button button = (Button) inflate.findViewById(2131427623);
            Button button2 = (Button) inflate.findViewById(2131427605);
            RadioGroup radioGroup = (RadioGroup) inflate.findViewById(2131428935);
            RadioButton radioButton = (RadioButton) inflate.findViewById(2131428909);
            RadioButton radioButton2 = (RadioButton) inflate.findViewById(2131428903);
            RadioButton radioButton3 = (RadioButton) inflate.findViewById(2131428897);
            RadioButton radioButton4 = (RadioButton) inflate.findViewById(2131428916);
            String string = this.f22383x.getString("sort", "");
            if (string.equals("1")) {
                radioButton2.setChecked(true);
            } else if (string.equals("2")) {
                radioButton3.setChecked(true);
            } else if (string.equals("3")) {
                radioButton4.setChecked(true);
            } else {
                radioButton.setChecked(true);
            }
            button2.setOnClickListener(new ViewOnClickListenerC3735h(this));
            button.setOnClickListener(new ViewOnClickListenerC3736i(this, radioGroup, inflate));
        } catch (NullPointerException | Exception e10) {
        }
    }

    /* renamed from: a */
    public void m18197a() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    /* renamed from: b */
    public void m18198b() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f22369j = getArguments().getString("");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.f22367h == null || this.f22365f == null) {
            return;
        }
        TypedValue typedValue = new TypedValue();
        if (this.f22367h.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.f22367h.getResources().getDisplayMetrics());
        }
        for (int i10 = 0; i10 < this.f22365f.getChildCount(); i10++) {
            if (this.f22365f.getChildAt(i10) instanceof ActionMenuView) {
                ((Toolbar.C0292e) this.f22365f.getChildAt(i10).getLayoutParams()).f26228a = 16;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(2131624211, viewGroup, false);
        this.f22368i = ButterKnife.m5627b(this, inflate);
        C0936d.m5638o(getActivity());
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("sort", 0);
        this.f22383x = sharedPreferences;
        this.f22384y = sharedPreferences.edit();
        if (this.f22383x.getString("sort", "").equals("")) {
            this.f22384y.putString("sort", "0");
            this.f22384y.commit();
        }
        setHasOptionsMenu(true);
        m18194G();
        SharedPreferences sharedPreferences2 = getActivity().getSharedPreferences("listgridview", 0);
        this.f22381v = sharedPreferences2;
        this.f22382w = sharedPreferences2.edit();
        int i10 = this.f22381v.getInt("livestream", 0);
        C5251a.f30068u = i10;
        if (i10 == 1) {
            m18192B();
        } else {
            m18193E();
        }
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f22368i.mo5629a();
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        int itemId = menuItem.getItemId();
        if (itemId == 2131428761) {
            startActivity(new Intent(this.f22367h, (Class<?>) NewDashboardActivity.class));
        }
        if (itemId == 2131428776) {
            startActivity(new Intent(this.f22367h, (Class<?>) SettingsActivity.class));
        }
        if (itemId == 2131427417 && (context = this.f22367h) != null) {
            new DialogC0242a.a(context, 2132082693).setTitle(getResources().getString(2132017988)).m857e(getResources().getString(2132017987)).m861i(getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3729b(this)).m858f(getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3728a(this)).m865m();
        }
        if (itemId == 2131427425) {
            SearchView searchView = (SearchView) C6845p.m31619b(menuItem);
            this.f22366g = searchView;
            searchView.setQueryHint(getResources().getString(2132018514));
            this.f22366g.setIconifiedByDefault(false);
            this.f22366g.setOnQueryTextListener(new C3730c(this));
            return true;
        }
        if (itemId == 2131428638) {
            DialogC0242a.a aVar = new DialogC0242a.a(this.f22367h);
            aVar.setTitle(this.f22367h.getResources().getString(2132017514));
            aVar.m857e(this.f22367h.getResources().getString(2132017585));
            aVar.m855c(2131231731);
            aVar.m861i(getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3731d(this));
            aVar.m858f(getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3732e(this));
            aVar.m865m();
            return true;
        }
        if (itemId == 2131428640) {
            DialogC0242a.a aVar2 = new DialogC0242a.a(this.f22367h);
            aVar2.setTitle(this.f22367h.getResources().getString(2132017514));
            aVar2.m857e(this.f22367h.getResources().getString(2132017585));
            aVar2.m855c(2131231731);
            aVar2.m861i(this.f22367h.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3733f(this));
            aVar2.m858f(this.f22367h.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3734g(this));
            aVar2.m865m();
            return true;
        }
        if (itemId == 2131428252) {
            this.f22382w.putInt("livestream", 1);
            this.f22382w.commit();
            m18192B();
        }
        if (itemId == 2131428256) {
            this.f22382w.putInt("livestream", 0);
            this.f22382w.commit();
            m18193E();
        }
        if (itemId == 2131428645) {
            m18196J(getActivity());
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        menu.clear();
        this.f22365f.m1224x(2131689497);
        menu.findItem(2131428252);
    }

    /* renamed from: y */
    public final ArrayList<String> m18199y() {
        ArrayList<PasswordStatusDBModel> m15232m1 = this.f22370k.m15232m1(SharepreferenceDBHandler.m15337A(this.f22367h));
        this.f22376q = m15232m1;
        if (m15232m1 != null) {
            Iterator<PasswordStatusDBModel> it = m15232m1.iterator();
            while (it.hasNext()) {
                PasswordStatusDBModel next = it.next();
                if (next.m15290a().equals("1")) {
                    this.f22375p.add(next.m15291b());
                }
            }
        }
        return this.f22375p;
    }
}

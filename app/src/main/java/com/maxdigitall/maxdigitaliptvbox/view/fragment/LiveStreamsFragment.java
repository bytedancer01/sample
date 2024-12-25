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
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.PasswordStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity;
import com.maxdigitall.maxdigitaliptvbox.view.activity.SettingsActivity;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import p030c0.C0936d;
import p151if.C5251a;
import p151if.C5255e;
import p235o0.C6845p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/LiveStreamsFragment.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/LiveStreamsFragment.class */
public class LiveStreamsFragment extends Fragment {

    /* renamed from: A */
    public SharedPreferences.Editor f22055A;

    /* renamed from: B */
    public PopupWindow f22056B;

    /* renamed from: b */
    public RecyclerView.AbstractC0685p f22057b;

    /* renamed from: c */
    public SharedPreferences f22058c;

    /* renamed from: d */
    public LiveStreamsAdapter f22059d;

    /* renamed from: f */
    public Toolbar f22061f;

    /* renamed from: g */
    public SearchView f22062g;

    /* renamed from: h */
    public Context f22063h;

    /* renamed from: i */
    public DatabaseHandler f22064i;

    /* renamed from: j */
    public Unbinder f22065j;

    /* renamed from: k */
    public String f22066k;

    /* renamed from: l */
    public LiveStreamDBHandler f22067l;

    @BindView
    public RecyclerView myRecyclerView;

    @BindView
    public ProgressBar pbLoader;

    /* renamed from: r */
    public ArrayList<PasswordStatusDBModel> f22073r;

    /* renamed from: s */
    public ArrayList<LiveStreamsDBModel> f22074s;

    /* renamed from: t */
    public ArrayList<LiveStreamsDBModel> f22075t;

    @BindView
    public TextView tvNoRecordFound;

    @BindView
    public TextView tvNoStream;

    /* renamed from: u */
    public ArrayList<LiveStreamsDBModel> f22076u;

    /* renamed from: v */
    public ArrayList<LiveStreamsDBModel> f22077v;

    /* renamed from: w */
    public ArrayList<LiveStreamsDBModel> f22078w;

    /* renamed from: x */
    public SharedPreferences f22079x;

    /* renamed from: y */
    public SharedPreferences.Editor f22080y;

    /* renamed from: z */
    public SharedPreferences f22081z;

    /* renamed from: e */
    public ArrayList<LiveStreamsDBModel> f22060e = new ArrayList<>();

    /* renamed from: m */
    public DatabaseUpdatedStatusDBModel f22068m = new DatabaseUpdatedStatusDBModel();

    /* renamed from: n */
    public DatabaseUpdatedStatusDBModel f22069n = new DatabaseUpdatedStatusDBModel();

    /* renamed from: o */
    public LiveStreamsDBModel f22070o = new LiveStreamsDBModel();

    /* renamed from: p */
    public ArrayList<EpgChannelModel> f22071p = new ArrayList<>();

    /* renamed from: q */
    public ArrayList<String> f22072q = new ArrayList<>();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/LiveStreamsFragment$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.LiveStreamsFragment$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/LiveStreamsFragment$a.class */
    public class DialogInterfaceOnClickListenerC3663a implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final LiveStreamsFragment f22082b;

        public DialogInterfaceOnClickListenerC3663a(LiveStreamsFragment liveStreamsFragment) {
            this.f22082b = liveStreamsFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/LiveStreamsFragment$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.LiveStreamsFragment$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/LiveStreamsFragment$b.class */
    public class DialogInterfaceOnClickListenerC3664b implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final LiveStreamsFragment f22083b;

        public DialogInterfaceOnClickListenerC3664b(LiveStreamsFragment liveStreamsFragment) {
            this.f22083b = liveStreamsFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26211N(this.f22083b.f22063h);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/LiveStreamsFragment$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.LiveStreamsFragment$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/LiveStreamsFragment$c.class */
    public class C3665c implements SearchView.InterfaceC0282l {

        /* renamed from: a */
        public final LiveStreamsFragment f22084a;

        public C3665c(LiveStreamsFragment liveStreamsFragment) {
            this.f22084a = liveStreamsFragment;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextChange(String str) {
            TextView textView;
            this.f22084a.tvNoRecordFound.setVisibility(8);
            if (this.f22084a.f22059d == null || (textView = this.f22084a.tvNoStream) == null || textView.getVisibility() == 0) {
                return false;
            }
            this.f22084a.f22059d.m17178l0(str, this.f22084a.tvNoRecordFound);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/LiveStreamsFragment$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.LiveStreamsFragment$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/LiveStreamsFragment$d.class */
    public class DialogInterfaceOnClickListenerC3666d implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final LiveStreamsFragment f22085b;

        public DialogInterfaceOnClickListenerC3666d(LiveStreamsFragment liveStreamsFragment) {
            this.f22085b = liveStreamsFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26210M(this.f22085b.f22063h);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/LiveStreamsFragment$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.LiveStreamsFragment$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/LiveStreamsFragment$e.class */
    public class DialogInterfaceOnClickListenerC3667e implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final LiveStreamsFragment f22086b;

        public DialogInterfaceOnClickListenerC3667e(LiveStreamsFragment liveStreamsFragment) {
            this.f22086b = liveStreamsFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/LiveStreamsFragment$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.LiveStreamsFragment$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/LiveStreamsFragment$f.class */
    public class DialogInterfaceOnClickListenerC3668f implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final LiveStreamsFragment f22087b;

        public DialogInterfaceOnClickListenerC3668f(LiveStreamsFragment liveStreamsFragment) {
            this.f22087b = liveStreamsFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/LiveStreamsFragment$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.LiveStreamsFragment$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/LiveStreamsFragment$g.class */
    public class DialogInterfaceOnClickListenerC3669g implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final LiveStreamsFragment f22088b;

        public DialogInterfaceOnClickListenerC3669g(LiveStreamsFragment liveStreamsFragment) {
            this.f22088b = liveStreamsFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/LiveStreamsFragment$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.LiveStreamsFragment$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/LiveStreamsFragment$h.class */
    public class ViewOnClickListenerC3670h implements View.OnClickListener {

        /* renamed from: b */
        public final LiveStreamsFragment f22089b;

        public ViewOnClickListenerC3670h(LiveStreamsFragment liveStreamsFragment) {
            this.f22089b = liveStreamsFragment;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f22089b.f22056B.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/LiveStreamsFragment$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.LiveStreamsFragment$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/LiveStreamsFragment$i.class */
    public class ViewOnClickListenerC3671i implements View.OnClickListener {

        /* renamed from: b */
        public final RadioGroup f22090b;

        /* renamed from: c */
        public final View f22091c;

        /* renamed from: d */
        public final LiveStreamsFragment f22092d;

        public ViewOnClickListenerC3671i(LiveStreamsFragment liveStreamsFragment, RadioGroup radioGroup, View view) {
            this.f22092d = liveStreamsFragment;
            this.f22090b = radioGroup;
            this.f22091c = view;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SharedPreferences.Editor editor;
            String str;
            RadioButton radioButton = (RadioButton) this.f22091c.findViewById(this.f22090b.getCheckedRadioButtonId());
            if (radioButton.getText().toString().equals(this.f22092d.getResources().getString(2132018611))) {
                editor = this.f22092d.f22055A;
                str = "1";
            } else if (radioButton.getText().toString().equals(this.f22092d.getResources().getString(2132018607))) {
                editor = this.f22092d.f22055A;
                str = "2";
            } else if (radioButton.getText().toString().equals(this.f22092d.getResources().getString(2132018615))) {
                editor = this.f22092d.f22055A;
                str = "3";
            } else {
                editor = this.f22092d.f22055A;
                str = "0";
            }
            editor.putString("sort", str);
            this.f22092d.f22055A.commit();
            LiveStreamsFragment liveStreamsFragment = this.f22092d;
            liveStreamsFragment.f22079x = liveStreamsFragment.getActivity().getSharedPreferences("listgridview", 0);
            LiveStreamsFragment liveStreamsFragment2 = this.f22092d;
            liveStreamsFragment2.f22080y = liveStreamsFragment2.f22079x.edit();
            int i10 = this.f22092d.f22079x.getInt("livestream", 0);
            C5251a.f30068u = i10;
            if (i10 == 1) {
                this.f22092d.m18062E();
            } else {
                this.f22092d.m18063F();
            }
            this.f22092d.f22056B.dismiss();
        }
    }

    /* renamed from: A */
    public final ArrayList<String> m18060A() {
        ArrayList<PasswordStatusDBModel> m15232m1 = this.f22067l.m15232m1(SharepreferenceDBHandler.m15337A(this.f22063h));
        this.f22073r = m15232m1;
        if (m15232m1 != null) {
            Iterator<PasswordStatusDBModel> it = m15232m1.iterator();
            while (it.hasNext()) {
                PasswordStatusDBModel next = it.next();
                if (next.m15290a().equals("1")) {
                    this.f22072q.add(next.m15291b());
                }
            }
        }
        return this.f22072q;
    }

    /* renamed from: B */
    public final ArrayList<LiveStreamsDBModel> m18061B(ArrayList<LiveStreamsDBModel> arrayList, ArrayList<String> arrayList2) {
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
                if (!z10 && (arrayList3 = this.f22074s) != null) {
                    arrayList3.add(next);
                }
            }
        }
        return this.f22074s;
    }

    /* renamed from: E */
    public final void m18062E() {
        this.f22063h = getContext();
        this.f22067l = new LiveStreamDBHandler(this.f22063h);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f22063h == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), C5255e.m26257x(this.f22063h) + 1);
        this.f22057b = gridLayoutManager;
        this.myRecyclerView.setLayoutManager(gridLayoutManager);
        this.myRecyclerView.setItemAnimator(new C0704c());
        SharedPreferences sharedPreferences = this.f22063h.getSharedPreferences("loginPrefs", 0);
        this.f22058c = sharedPreferences;
        sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        this.f22058c.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        m18065I();
    }

    /* renamed from: F */
    public final void m18063F() {
        this.f22063h = getContext();
        this.f22067l = new LiveStreamDBHandler(this.f22063h);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f22063h == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f22057b = linearLayoutManager;
        this.myRecyclerView.setLayoutManager(linearLayoutManager);
        this.myRecyclerView.setItemAnimator(new C0704c());
        SharedPreferences sharedPreferences = this.f22063h.getSharedPreferences("loginPrefs", 0);
        this.f22058c = sharedPreferences;
        sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        this.f22058c.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        m18065I();
    }

    /* renamed from: G */
    public final void m18064G() {
        this.f22061f = (Toolbar) getActivity().findViewById(2131429320);
    }

    /* renamed from: I */
    public final void m18065I() {
        try {
            m18067a();
            if (this.f22063h != null) {
                LiveStreamDBHandler liveStreamDBHandler = new LiveStreamDBHandler(this.f22063h);
                this.f22073r = new ArrayList<>();
                this.f22074s = new ArrayList<>();
                this.f22075t = new ArrayList<>();
                this.f22076u = new ArrayList<>();
                this.f22077v = new ArrayList<>();
                this.f22078w = new ArrayList<>();
                ArrayList<LiveStreamsDBModel> m15217f1 = liveStreamDBHandler.m15217f1(this.f22066k, "live");
                if (liveStreamDBHandler.m15189R1(SharepreferenceDBHandler.m15337A(this.f22063h)) <= 0 || m15217f1 == null) {
                    this.f22076u = m15217f1;
                } else {
                    ArrayList<String> m18060A = m18060A();
                    this.f22072q = m18060A;
                    if (m18060A != null) {
                        this.f22075t = m18061B(m15217f1, m18060A);
                    }
                    this.f22076u = this.f22075t;
                }
                if (this.f22066k.equals("-1")) {
                    m18068b();
                    return;
                }
                ArrayList<LiveStreamsDBModel> arrayList = this.f22076u;
                if (arrayList == null || this.myRecyclerView == null || arrayList.size() == 0) {
                    m18068b();
                    TextView textView = this.tvNoStream;
                    if (textView != null) {
                        textView.setVisibility(0);
                        return;
                    }
                    return;
                }
                m18068b();
                LiveStreamsAdapter liveStreamsAdapter = new LiveStreamsAdapter(this.f22076u, getContext());
                this.f22059d = liveStreamsAdapter;
                this.myRecyclerView.setAdapter(liveStreamsAdapter);
                this.f22059d.m4099w();
            }
        } catch (NullPointerException | Exception e10) {
        }
    }

    /* renamed from: J */
    public final void m18066J(Activity activity) {
        try {
            View inflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(2131624516, (RelativeLayout) activity.findViewById(2131429032));
            PopupWindow popupWindow = new PopupWindow(activity);
            this.f22056B = popupWindow;
            popupWindow.setContentView(inflate);
            this.f22056B.setWidth(-1);
            this.f22056B.setHeight(-1);
            this.f22056B.setFocusable(true);
            this.f22056B.showAtLocation(inflate, 17, 0, 0);
            Button button = (Button) inflate.findViewById(2131427623);
            Button button2 = (Button) inflate.findViewById(2131427605);
            RadioGroup radioGroup = (RadioGroup) inflate.findViewById(2131428935);
            RadioButton radioButton = (RadioButton) inflate.findViewById(2131428909);
            RadioButton radioButton2 = (RadioButton) inflate.findViewById(2131428903);
            RadioButton radioButton3 = (RadioButton) inflate.findViewById(2131428897);
            RadioButton radioButton4 = (RadioButton) inflate.findViewById(2131428916);
            String string = this.f22081z.getString("sort", "");
            if (string.equals("1")) {
                radioButton2.setChecked(true);
            } else if (string.equals("2")) {
                radioButton3.setChecked(true);
            } else if (string.equals("3")) {
                radioButton4.setChecked(true);
            } else {
                radioButton.setChecked(true);
            }
            button2.setOnClickListener(new ViewOnClickListenerC3670h(this));
            button.setOnClickListener(new ViewOnClickListenerC3671i(this, radioGroup, inflate));
        } catch (NullPointerException | Exception e10) {
        }
    }

    /* renamed from: a */
    public void m18067a() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    /* renamed from: b */
    public void m18068b() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f22066k = getArguments().getString("");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.f22063h == null || this.f22061f == null) {
            return;
        }
        TypedValue typedValue = new TypedValue();
        if (this.f22063h.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.f22063h.getResources().getDisplayMetrics());
        }
        for (int i10 = 0; i10 < this.f22061f.getChildCount(); i10++) {
            if (this.f22061f.getChildAt(i10) instanceof ActionMenuView) {
                ((Toolbar.C0292e) this.f22061f.getChildAt(i10).getLayoutParams()).f26228a = 16;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(2131624211, viewGroup, false);
        this.f22065j = ButterKnife.m5627b(this, inflate);
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("sort", 0);
        this.f22081z = sharedPreferences;
        this.f22055A = sharedPreferences.edit();
        if (this.f22081z.getString("sort", "").equals("")) {
            this.f22055A.putString("sort", "0");
            this.f22055A.commit();
        }
        C0936d.m5638o(getActivity());
        setHasOptionsMenu(true);
        m18064G();
        SharedPreferences sharedPreferences2 = getActivity().getSharedPreferences("listgridview", 0);
        this.f22079x = sharedPreferences2;
        this.f22080y = sharedPreferences2.edit();
        int i10 = this.f22079x.getInt("livestream", 0);
        C5251a.f30068u = i10;
        if (i10 == 1) {
            m18062E();
        } else {
            m18063F();
        }
        if (this.f22066k.equals("-1")) {
            m18069y();
        }
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f22065j.mo5629a();
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        int itemId = menuItem.getItemId();
        if (itemId == 2131428761) {
            startActivity(new Intent(this.f22063h, (Class<?>) NewDashboardActivity.class));
        }
        if (itemId == 2131428776) {
            startActivity(new Intent(this.f22063h, (Class<?>) SettingsActivity.class));
        }
        if (itemId == 2131427417 && (context = this.f22063h) != null) {
            new DialogC0242a.a(context, 2132082693).setTitle(getResources().getString(2132017988)).m857e(getResources().getString(2132017987)).m861i(getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3664b(this)).m858f(getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3663a(this)).m865m();
        }
        if (itemId == 2131427425) {
            SearchView searchView = (SearchView) C6845p.m31619b(menuItem);
            this.f22062g = searchView;
            searchView.setQueryHint(getResources().getString(2132018514));
            this.f22062g.setIconifiedByDefault(false);
            this.f22062g.setOnQueryTextListener(new C3665c(this));
            return true;
        }
        if (itemId == 2131428638) {
            DialogC0242a.a aVar = new DialogC0242a.a(this.f22063h);
            aVar.setTitle(this.f22063h.getResources().getString(2132017514));
            aVar.m857e(this.f22063h.getResources().getString(2132017585));
            aVar.m855c(2131231731);
            aVar.m861i("YES", new DialogInterfaceOnClickListenerC3666d(this));
            aVar.m858f("NO", new DialogInterfaceOnClickListenerC3667e(this));
            aVar.m865m();
            return true;
        }
        if (itemId == 2131428640) {
            DialogC0242a.a aVar2 = new DialogC0242a.a(this.f22063h);
            aVar2.setTitle(this.f22063h.getResources().getString(2132017514));
            aVar2.m857e(this.f22063h.getResources().getString(2132017585));
            aVar2.m855c(2131231731);
            aVar2.m861i("YES", new DialogInterfaceOnClickListenerC3668f(this));
            aVar2.m858f("NO", new DialogInterfaceOnClickListenerC3669g(this));
            aVar2.m865m();
            return true;
        }
        if (itemId == 2131428252) {
            this.f22080y.putInt("livestream", 1);
            this.f22080y.commit();
            m18062E();
        }
        if (itemId == 2131428256) {
            this.f22080y.putInt("livestream", 0);
            this.f22080y.commit();
            m18063F();
        }
        if (itemId == 2131428645) {
            m18066J(getActivity());
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        menu.clear();
        this.f22061f.m1224x(2131689497);
        menu.findItem(2131428252);
    }

    /* renamed from: y */
    public void m18069y() {
        ArrayList<LiveStreamsDBModel> arrayList;
        ArrayList<LiveStreamsDBModel> arrayList2;
        this.f22060e.clear();
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.f22059d);
        }
        if (this.f22063h != null) {
            DatabaseHandler databaseHandler = new DatabaseHandler(this.f22063h);
            this.f22064i = databaseHandler;
            Iterator<FavouriteDBModel> it = databaseHandler.m15116v("live", SharepreferenceDBHandler.m15337A(this.f22063h)).iterator();
            while (it.hasNext()) {
                FavouriteDBModel next = it.next();
                LiveStreamsDBModel m15179M1 = new LiveStreamDBHandler(this.f22063h).m15179M1(next.m14760a(), String.valueOf(next.m14764e()));
                if (m15179M1 != null) {
                    this.f22060e.add(m15179M1);
                }
            }
            if (this.myRecyclerView != null && (arrayList2 = this.f22060e) != null && arrayList2.size() != 0) {
                m18068b();
                LiveStreamsAdapter liveStreamsAdapter = new LiveStreamsAdapter(this.f22060e, getContext());
                this.f22059d = liveStreamsAdapter;
                this.myRecyclerView.setAdapter(liveStreamsAdapter);
                this.f22059d.m4099w();
                this.tvNoStream.setVisibility(4);
            }
            if (this.tvNoStream == null || (arrayList = this.f22060e) == null || arrayList.size() != 0) {
                return;
            }
            m18068b();
            RecyclerView recyclerView2 = this.myRecyclerView;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(this.f22059d);
            }
            this.tvNoStream.setText(getResources().getString(2132018201));
            this.tvNoStream.setVisibility(0);
        }
    }
}

package com.maxdigitall.maxdigitaliptvbox.view.fragment;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
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
import cf.C1077a;
import cf.C1078b;
import cf.C1085i;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamCategoryIdDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.VODDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.callback.VodStreamsCallback;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.RecentWatchDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.SubCategoriesChildAdapter;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import p030c0.C0936d;
import p151if.C5251a;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/VodFragment.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/VodFragment.class */
public class VodFragment extends Fragment {

    /* renamed from: b */
    public RecyclerView.AbstractC0685p f22401b;

    /* renamed from: c */
    public SharedPreferences f22402c;

    /* renamed from: d */
    public VodAdapter f22403d;

    /* renamed from: e */
    public Toolbar f22404e;

    /* renamed from: f */
    public SearchView f22405f;

    /* renamed from: g */
    public DatabaseHandler f22406g;

    /* renamed from: k */
    public LiveStreamDBHandler f22410k;

    @BindView
    public RecyclerView myRecyclerView;

    /* renamed from: n */
    public Context f22413n;

    /* renamed from: o */
    public Unbinder f22414o;

    /* renamed from: p */
    public SharedPreferences f22415p;

    @BindView
    public ProgressBar pbLoader;

    /* renamed from: q */
    public SharedPreferences.Editor f22416q;

    /* renamed from: r */
    public String f22417r;

    /* renamed from: s */
    public String f22418s;

    @BindView
    public TextView tvNoRecordFound;

    @BindView
    public TextView tvNoStream;

    @BindView
    public TextView tvViewProvider;

    /* renamed from: u */
    public C1077a f22420u;

    /* renamed from: v */
    public SharedPreferences f22421v;

    /* renamed from: w */
    public SharedPreferences.Editor f22422w;

    /* renamed from: x */
    public PopupWindow f22423x;

    /* renamed from: y */
    public static ArrayList<LiveStreamCategoryIdDBModel> f22399y = new ArrayList<>();

    /* renamed from: z */
    public static ArrayList<LiveStreamCategoryIdDBModel> f22400z = new ArrayList<>();

    /* renamed from: A */
    public static ArrayList<LiveStreamCategoryIdDBModel> f22398A = new ArrayList<>();

    /* renamed from: h */
    public ArrayList<VodStreamsCallback> f22407h = new ArrayList<>();

    /* renamed from: i */
    public VODDBModel f22408i = new VODDBModel();

    /* renamed from: j */
    public ArrayList<LiveStreamsDBModel> f22409j = new ArrayList<>();

    /* renamed from: l */
    public DatabaseUpdatedStatusDBModel f22411l = new DatabaseUpdatedStatusDBModel();

    /* renamed from: m */
    public DatabaseUpdatedStatusDBModel f22412m = new DatabaseUpdatedStatusDBModel();

    /* renamed from: t */
    public boolean f22419t = false;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/VodFragment$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.VodFragment$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/VodFragment$a.class */
    public class DialogInterfaceOnClickListenerC3737a implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final VodFragment f22424b;

        public DialogInterfaceOnClickListenerC3737a(VodFragment vodFragment) {
            this.f22424b = vodFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/VodFragment$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.VodFragment$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/VodFragment$b.class */
    public class DialogInterfaceOnClickListenerC3738b implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final VodFragment f22425b;

        public DialogInterfaceOnClickListenerC3738b(VodFragment vodFragment) {
            this.f22425b = vodFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26211N(this.f22425b.f22413n);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/VodFragment$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.VodFragment$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/VodFragment$c.class */
    public class C3739c implements SearchView.InterfaceC0282l {

        /* renamed from: a */
        public final VodFragment f22426a;

        public C3739c(VodFragment vodFragment) {
            this.f22426a = vodFragment;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextChange(String str) {
            TextView textView;
            this.f22426a.tvNoRecordFound.setVisibility(8);
            if (this.f22426a.f22403d == null || (textView = this.f22426a.tvNoStream) == null || textView.getVisibility() == 0) {
                return false;
            }
            this.f22426a.f22403d.m17527s0(str, this.f22426a.tvNoRecordFound);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/VodFragment$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.VodFragment$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/VodFragment$d.class */
    public class DialogInterfaceOnClickListenerC3740d implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final VodFragment f22427b;

        public DialogInterfaceOnClickListenerC3740d(VodFragment vodFragment) {
            this.f22427b = vodFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26210M(this.f22427b.f22413n);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/VodFragment$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.VodFragment$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/VodFragment$e.class */
    public class DialogInterfaceOnClickListenerC3741e implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final VodFragment f22428b;

        public DialogInterfaceOnClickListenerC3741e(VodFragment vodFragment) {
            this.f22428b = vodFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/VodFragment$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.VodFragment$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/VodFragment$f.class */
    public class DialogInterfaceOnClickListenerC3742f implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final VodFragment f22429b;

        public DialogInterfaceOnClickListenerC3742f(VodFragment vodFragment) {
            this.f22429b = vodFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/VodFragment$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.VodFragment$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/VodFragment$g.class */
    public class DialogInterfaceOnClickListenerC3743g implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final VodFragment f22430b;

        public DialogInterfaceOnClickListenerC3743g(VodFragment vodFragment) {
            this.f22430b = vodFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/VodFragment$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.VodFragment$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/VodFragment$h.class */
    public class ViewOnClickListenerC3744h implements View.OnClickListener {

        /* renamed from: b */
        public final VodFragment f22431b;

        public ViewOnClickListenerC3744h(VodFragment vodFragment) {
            this.f22431b = vodFragment;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f22431b.f22423x.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/VodFragment$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.VodFragment$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/VodFragment$i.class */
    public class ViewOnClickListenerC3745i implements View.OnClickListener {

        /* renamed from: b */
        public final RadioGroup f22432b;

        /* renamed from: c */
        public final View f22433c;

        /* renamed from: d */
        public final Activity f22434d;

        /* renamed from: e */
        public final VodFragment f22435e;

        public ViewOnClickListenerC3745i(VodFragment vodFragment, RadioGroup radioGroup, View view, Activity activity) {
            this.f22435e = vodFragment;
            this.f22432b = radioGroup;
            this.f22433c = view;
            this.f22434d = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SharedPreferences.Editor editor;
            String str;
            RadioButton radioButton = (RadioButton) this.f22433c.findViewById(this.f22432b.getCheckedRadioButtonId());
            if (radioButton.getText().toString().equals(this.f22435e.getResources().getString(2132018611))) {
                editor = this.f22435e.f22422w;
                str = "1";
            } else if (radioButton.getText().toString().equals(this.f22435e.getResources().getString(2132018607))) {
                editor = this.f22435e.f22422w;
                str = "2";
            } else if (radioButton.getText().toString().equals(this.f22435e.getResources().getString(2132018615))) {
                editor = this.f22435e.f22422w;
                str = "3";
            } else {
                editor = this.f22435e.f22422w;
                str = "0";
            }
            editor.putString("sort", str);
            this.f22435e.f22422w.commit();
            this.f22435e.f22415p = this.f22434d.getSharedPreferences("listgridview", 0);
            VodFragment vodFragment = this.f22435e;
            vodFragment.f22416q = vodFragment.f22415p.edit();
            int i10 = this.f22435e.f22415p.getInt("vod", 0);
            C5251a.f30070v = i10;
            if (i10 == 1) {
                this.f22435e.m18211F();
            } else {
                this.f22435e.m18210E();
            }
            this.f22435e.f22423x.dismiss();
        }
    }

    /* renamed from: A */
    public void m18208A() {
        ArrayList<LiveStreamsDBModel> arrayList;
        ArrayList<LiveStreamsDBModel> arrayList2;
        this.f22409j.clear();
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.f22403d);
        }
        if (this.f22413n != null) {
            DatabaseHandler databaseHandler = new DatabaseHandler(this.f22413n);
            this.f22406g = databaseHandler;
            Iterator<FavouriteDBModel> it = databaseHandler.m15116v("vod", SharepreferenceDBHandler.m15337A(this.f22413n)).iterator();
            while (it.hasNext()) {
                FavouriteDBModel next = it.next();
                LiveStreamsDBModel m15179M1 = new LiveStreamDBHandler(this.f22413n).m15179M1(next.m14760a(), String.valueOf(next.m14764e()));
                if (m15179M1 != null) {
                    this.f22409j.add(m15179M1);
                }
            }
            m18219b();
            if (this.myRecyclerView != null && (arrayList2 = this.f22409j) != null && arrayList2.size() != 0) {
                VodAdapter vodAdapter = new VodAdapter(this.f22409j, getContext(), true);
                this.f22403d = vodAdapter;
                this.myRecyclerView.setAdapter(vodAdapter);
                this.f22403d.m4099w();
                this.tvNoStream.setVisibility(4);
            }
            if (this.tvNoStream == null || (arrayList = this.f22409j) == null || arrayList.size() != 0) {
                return;
            }
            RecyclerView recyclerView2 = this.myRecyclerView;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(this.f22403d);
            }
            this.tvNoStream.setText(getResources().getString(2132018205));
            this.tvNoStream.setVisibility(0);
        }
    }

    /* renamed from: B */
    public final void m18209B() {
        RecyclerView recyclerView;
        C0704c c0704c;
        m18218a();
        C0936d.m5638o(getActivity());
        setHasOptionsMenu(true);
        m18215M();
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("listgridview", 0);
        this.f22415p = sharedPreferences;
        this.f22416q = sharedPreferences.edit();
        int i10 = this.f22415p.getInt("vod", 0);
        C5251a.f30070v = i10;
        if (i10 == 1) {
            Context context = getContext();
            this.f22413n = context;
            RecyclerView recyclerView2 = this.myRecyclerView;
            if (recyclerView2 != null && context != null) {
                recyclerView2.setHasFixedSize(true);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
                this.f22401b = linearLayoutManager;
                this.myRecyclerView.setLayoutManager(linearLayoutManager);
                recyclerView = this.myRecyclerView;
                c0704c = new C0704c();
                recyclerView.setItemAnimator(c0704c);
            }
        } else {
            Context context2 = getContext();
            this.f22413n = context2;
            RecyclerView recyclerView3 = this.myRecyclerView;
            if (recyclerView3 != null && context2 != null) {
                recyclerView3.setHasFixedSize(true);
                GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), C5255e.m26257x(this.f22413n) + 1);
                this.f22401b = gridLayoutManager;
                this.myRecyclerView.setLayoutManager(gridLayoutManager);
                recyclerView = this.myRecyclerView;
                c0704c = new C0704c();
                recyclerView.setItemAnimator(c0704c);
            }
        }
        if (this.f22413n != null) {
            ArrayList<LiveStreamsDBModel> m15317w = new RecentWatchDBHandler(this.f22413n).m15317w("movie", SharepreferenceDBHandler.m15337A(this.f22413n), "getalldata");
            m18219b();
            if (m15317w != null && this.myRecyclerView != null && m15317w.size() != 0) {
                VodAdapter vodAdapter = new VodAdapter(m15317w, getContext(), true);
                this.f22403d = vodAdapter;
                this.myRecyclerView.setAdapter(vodAdapter);
            } else {
                TextView textView = this.tvNoStream;
                if (textView != null) {
                    textView.setVisibility(0);
                }
            }
        }
    }

    /* renamed from: E */
    public final void m18210E() {
        this.f22413n = getContext();
        this.f22410k = new LiveStreamDBHandler(this.f22413n);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f22413n == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), C5255e.m26257x(this.f22413n) + 1);
        this.f22401b = gridLayoutManager;
        this.myRecyclerView.setLayoutManager(gridLayoutManager);
        this.myRecyclerView.setItemAnimator(new C0704c());
        SharedPreferences sharedPreferences = this.f22413n.getSharedPreferences("loginPrefs", 0);
        this.f22402c = sharedPreferences;
        sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        this.f22402c.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        m18216N();
    }

    /* renamed from: F */
    public final void m18211F() {
        this.f22413n = getContext();
        this.f22410k = new LiveStreamDBHandler(this.f22413n);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f22413n == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f22401b = linearLayoutManager;
        this.myRecyclerView.setLayoutManager(linearLayoutManager);
        this.myRecyclerView.setItemAnimator(new C0704c());
        SharedPreferences sharedPreferences = this.f22413n.getSharedPreferences("loginPrefs", 0);
        this.f22402c = sharedPreferences;
        sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        this.f22402c.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        m18216N();
    }

    /* renamed from: G */
    public final void m18212G(ArrayList<LiveStreamCategoryIdDBModel> arrayList) {
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f22413n == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f22413n);
        this.myRecyclerView.setLayoutManager(new LinearLayoutManager(this.f22413n, 0, true));
        this.myRecyclerView.setLayoutManager(linearLayoutManager);
        this.myRecyclerView.setHasFixedSize(true);
        ArrayList arrayList2 = new ArrayList();
        ArrayList<LiveStreamsDBModel> m15217f1 = this.f22410k.m15217f1(this.f22417r, "movie");
        RecyclerView recyclerView2 = new RecyclerView(this.f22413n);
        SubCategoriesChildAdapter subCategoriesChildAdapter = new SubCategoriesChildAdapter(m15217f1, this.f22413n);
        recyclerView2.setAdapter(subCategoriesChildAdapter);
        arrayList2.add(new C1078b("Bill Gates"));
        ArrayList arrayList3 = new ArrayList();
        Iterator<LiveStreamCategoryIdDBModel> it = arrayList.iterator();
        while (it.hasNext()) {
            LiveStreamCategoryIdDBModel next = it.next();
            new ArrayList();
            ArrayList<LiveStreamsDBModel> m15217f12 = this.f22410k.m15217f1(next.m14787b(), "movie");
            if (m15217f12 != null && m15217f12.size() > 0) {
                arrayList3.add(new C1085i(recyclerView2, next.m14788c(), this.f22410k.m15217f1(next.m14787b(), "movie"), subCategoriesChildAdapter, arrayList2));
            }
        }
        new ArrayList();
        ArrayList<LiveStreamsDBModel> m15217f13 = this.f22410k.m15217f1(this.f22417r, "movie");
        if (m15217f13 != null && m15217f13.size() > 0) {
            arrayList3.add(new C1085i(recyclerView2, this.f22418s, this.f22410k.m15217f1(this.f22417r, "movie"), subCategoriesChildAdapter, arrayList2));
        }
        m18219b();
        C1077a c1077a = new C1077a(this.f22413n, arrayList3, m15217f1, recyclerView2);
        this.f22420u = c1077a;
        this.myRecyclerView.setAdapter(c1077a);
    }

    /* renamed from: I */
    public final void m18213I() {
        C0936d.m5638o(getActivity());
        setHasOptionsMenu(true);
        m18215M();
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("listgridview", 0);
        this.f22415p = sharedPreferences;
        this.f22416q = sharedPreferences.edit();
        int i10 = this.f22415p.getInt("vod", 0);
        C5251a.f30070v = i10;
        if (i10 == 1) {
            m18211F();
        } else {
            m18210E();
        }
    }

    /* renamed from: J */
    public final void m18214J(ArrayList<LiveStreamCategoryIdDBModel> arrayList) {
        C0936d.m5638o(getActivity());
        setHasOptionsMenu(true);
        m18215M();
        m18212G(arrayList);
    }

    /* renamed from: M */
    public final void m18215M() {
        this.f22404e = (Toolbar) getActivity().findViewById(2131429320);
    }

    /* renamed from: N */
    public final void m18216N() {
        if (this.f22413n != null) {
            LiveStreamDBHandler liveStreamDBHandler = new LiveStreamDBHandler(this.f22413n);
            if (this.f22417r.equals("-1")) {
                return;
            }
            ArrayList<LiveStreamsDBModel> m15217f1 = liveStreamDBHandler.m15217f1(this.f22417r, "movie");
            m18219b();
            if (m15217f1 != null && this.myRecyclerView != null && m15217f1.size() != 0) {
                VodAdapter vodAdapter = new VodAdapter(m15217f1, getContext(), true);
                this.f22403d = vodAdapter;
                this.myRecyclerView.setAdapter(vodAdapter);
            } else {
                TextView textView = this.tvNoStream;
                if (textView != null) {
                    textView.setVisibility(0);
                }
            }
        }
    }

    /* renamed from: O */
    public final void m18217O(Activity activity) {
        try {
            View inflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(2131624516, (RelativeLayout) activity.findViewById(2131429032));
            PopupWindow popupWindow = new PopupWindow(activity);
            this.f22423x = popupWindow;
            popupWindow.setContentView(inflate);
            this.f22423x.setWidth(-1);
            this.f22423x.setHeight(-1);
            this.f22423x.setFocusable(true);
            this.f22423x.showAtLocation(inflate, 17, 0, 0);
            Button button = (Button) inflate.findViewById(2131427623);
            Button button2 = (Button) inflate.findViewById(2131427605);
            RadioGroup radioGroup = (RadioGroup) inflate.findViewById(2131428935);
            RadioButton radioButton = (RadioButton) inflate.findViewById(2131428909);
            RadioButton radioButton2 = (RadioButton) inflate.findViewById(2131428903);
            RadioButton radioButton3 = (RadioButton) inflate.findViewById(2131428897);
            RadioButton radioButton4 = (RadioButton) inflate.findViewById(2131428916);
            String string = this.f22421v.getString("sort", "");
            if (string.equals("1")) {
                radioButton2.setChecked(true);
            } else if (string.equals("2")) {
                radioButton3.setChecked(true);
            } else if (string.equals("3")) {
                radioButton4.setChecked(true);
            } else {
                radioButton.setChecked(true);
            }
            button2.setOnClickListener(new ViewOnClickListenerC3744h(this));
            button.setOnClickListener(new ViewOnClickListenerC3745i(this, radioGroup, inflate, activity));
        } catch (NullPointerException | Exception e10) {
        }
    }

    /* renamed from: a */
    public void m18218a() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    /* renamed from: b */
    public void m18219b() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f22417r = getArguments().getString("");
        this.f22418s = getArguments().getString("cat_name");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.f22413n == null || this.f22404e == null) {
            return;
        }
        TypedValue typedValue = new TypedValue();
        if (this.f22413n.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.f22413n.getResources().getDisplayMetrics());
        }
        for (int i10 = 0; i10 < this.f22404e.getChildCount(); i10++) {
            if (this.f22404e.getChildAt(i10) instanceof ActionMenuView) {
                ((Toolbar.C0292e) this.f22404e.getChildAt(i10).getLayoutParams()).f26228a = 16;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate;
        this.f22413n = getContext();
        this.f22410k = new LiveStreamDBHandler(this.f22413n);
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("sort", 0);
        this.f22421v = sharedPreferences;
        this.f22422w = sharedPreferences.edit();
        if (this.f22421v.getString("sort", "").equals("")) {
            this.f22422w.putString("sort", "0");
            this.f22422w.commit();
        }
        String str = this.f22417r;
        str.hashCode();
        switch (str) {
            case "0":
                inflate = layoutInflater.inflate(2131624220, viewGroup, false);
                this.f22414o = ButterKnife.m5627b(this, inflate);
                m18218a();
                m18213I();
                m18220y();
                break;
            case "-1":
                inflate = layoutInflater.inflate(2131624220, viewGroup, false);
                this.f22414o = ButterKnife.m5627b(this, inflate);
                m18218a();
                m18213I();
                m18208A();
                break;
            case "-4":
                inflate = layoutInflater.inflate(2131624220, viewGroup, false);
                this.f22414o = ButterKnife.m5627b(this, inflate);
                m18218a();
                m18213I();
                m18209B();
                break;
            default:
                ArrayList<LiveStreamCategoryIdDBModel> m15223i1 = this.f22410k.m15223i1(this.f22417r);
                f22400z = m15223i1;
                if (m15223i1 != null && m15223i1.size() == 0) {
                    inflate = layoutInflater.inflate(2131624220, viewGroup, false);
                    this.f22414o = ButterKnife.m5627b(this, inflate);
                    m18218a();
                    m18213I();
                    break;
                } else {
                    inflate = layoutInflater.inflate(2131624221, viewGroup, false);
                    this.f22414o = ButterKnife.m5627b(this, inflate);
                    m18218a();
                    m18214J(f22400z);
                    break;
                }
        }
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f22414o.mo5629a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0248, code lost:
    
        if (r0.size() > 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x02bc, code lost:
    
        if (r0.size() > 0) goto L48;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onOptionsItemSelected(android.view.MenuItem r7) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.fragment.VodFragment.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        menu.clear();
        this.f22404e.m1224x(2131689497);
    }

    /* renamed from: y */
    public void m18220y() {
        RecyclerView recyclerView;
        C0704c c0704c;
        m18218a();
        C0936d.m5638o(getActivity());
        setHasOptionsMenu(true);
        m18215M();
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("listgridview", 0);
        this.f22415p = sharedPreferences;
        this.f22416q = sharedPreferences.edit();
        int i10 = this.f22415p.getInt("vod", 0);
        C5251a.f30070v = i10;
        if (i10 == 1) {
            this.f22413n = getContext();
            this.f22410k = new LiveStreamDBHandler(this.f22413n);
            RecyclerView recyclerView2 = this.myRecyclerView;
            if (recyclerView2 != null && this.f22413n != null) {
                recyclerView2.setHasFixedSize(true);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
                this.f22401b = linearLayoutManager;
                this.myRecyclerView.setLayoutManager(linearLayoutManager);
                recyclerView = this.myRecyclerView;
                c0704c = new C0704c();
                recyclerView.setItemAnimator(c0704c);
            }
        } else {
            this.f22413n = getContext();
            this.f22410k = new LiveStreamDBHandler(this.f22413n);
            RecyclerView recyclerView3 = this.myRecyclerView;
            if (recyclerView3 != null && this.f22413n != null) {
                recyclerView3.setHasFixedSize(true);
                GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), C5255e.m26257x(this.f22413n) + 1);
                this.f22401b = gridLayoutManager;
                this.myRecyclerView.setLayoutManager(gridLayoutManager);
                recyclerView = this.myRecyclerView;
                c0704c = new C0704c();
                recyclerView.setItemAnimator(c0704c);
            }
        }
        if (this.f22413n != null) {
            ArrayList<LiveStreamsDBModel> m15217f1 = new LiveStreamDBHandler(this.f22413n).m15217f1("0", "movie");
            m18219b();
            if (m15217f1 != null && this.myRecyclerView != null && m15217f1.size() != 0) {
                VodAdapter vodAdapter = new VodAdapter(m15217f1, getContext(), true);
                this.f22403d = vodAdapter;
                this.myRecyclerView.setAdapter(vodAdapter);
            } else {
                TextView textView = this.tvNoStream;
                if (textView != null) {
                    textView.setVisibility(0);
                }
            }
        }
    }
}

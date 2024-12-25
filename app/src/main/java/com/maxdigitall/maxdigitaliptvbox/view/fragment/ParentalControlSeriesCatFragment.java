package com.maxdigitall.maxdigitaliptvbox.view.fragment;

import android.R;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.DialogC0242a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamCategoryIdDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity;
import com.maxdigitall.maxdigitaliptvbox.view.activity.ParentalControlActivitity;
import com.maxdigitall.maxdigitaliptvbox.view.activity.SettingsActivity;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.ParentalControlVODCatAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p151if.C5255e;
import p235o0.C6845p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlSeriesCatFragment.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlSeriesCatFragment.class */
public class ParentalControlSeriesCatFragment extends Fragment {

    /* renamed from: b */
    public String f22215b;

    /* renamed from: c */
    public String f22216c;

    /* renamed from: d */
    public ParentalControlActivitity f22217d;

    /* renamed from: e */
    public ParentalControlVODCatAdapter f22218e;

    @BindView
    public TextView emptyView;

    /* renamed from: f */
    public RecyclerView.AbstractC0685p f22219f;

    /* renamed from: g */
    public ProgressDialog f22220g;

    /* renamed from: h */
    public Typeface f22221h;

    /* renamed from: i */
    public Toolbar f22222i;

    /* renamed from: j */
    public SearchView f22223j;

    /* renamed from: k */
    public LiveStreamDBHandler f22224k;

    @BindView
    public RecyclerView myRecyclerView;

    /* renamed from: o */
    public Context f22228o;

    /* renamed from: p */
    public Unbinder f22229p;

    @BindView
    public ProgressBar pbLoader;

    /* renamed from: q */
    public InterfaceC3701f f22230q;

    /* renamed from: l */
    public DatabaseUpdatedStatusDBModel f22225l = new DatabaseUpdatedStatusDBModel();

    /* renamed from: m */
    public DatabaseUpdatedStatusDBModel f22226m = new DatabaseUpdatedStatusDBModel();

    /* renamed from: n */
    public int f22227n = -1;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlSeriesCatFragment$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlSeriesCatFragment$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlSeriesCatFragment$a.class */
    public class C3696a implements SearchView.InterfaceC0282l {

        /* renamed from: a */
        public final ParentalControlSeriesCatFragment f22231a;

        public C3696a(ParentalControlSeriesCatFragment parentalControlSeriesCatFragment) {
            this.f22231a = parentalControlSeriesCatFragment;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextChange(String str) {
            ProgressBar progressBar = this.f22231a.pbLoader;
            if (progressBar != null) {
                progressBar.setVisibility(4);
            }
            if (this.f22231a.f22220g != null) {
                this.f22231a.f22220g.dismiss();
            }
            ParentalControlSeriesCatFragment parentalControlSeriesCatFragment = this.f22231a;
            if (parentalControlSeriesCatFragment.emptyView == null || parentalControlSeriesCatFragment.f22218e == null) {
                return true;
            }
            this.f22231a.emptyView.setVisibility(8);
            ParentalControlVODCatAdapter parentalControlVODCatAdapter = this.f22231a.f22218e;
            ParentalControlSeriesCatFragment parentalControlSeriesCatFragment2 = this.f22231a;
            parentalControlVODCatAdapter.m17310m0(str, parentalControlSeriesCatFragment2.emptyView, parentalControlSeriesCatFragment2.f22220g);
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlSeriesCatFragment$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlSeriesCatFragment$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlSeriesCatFragment$b.class */
    public class DialogInterfaceOnClickListenerC3697b implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ParentalControlSeriesCatFragment f22232b;

        public DialogInterfaceOnClickListenerC3697b(ParentalControlSeriesCatFragment parentalControlSeriesCatFragment) {
            this.f22232b = parentalControlSeriesCatFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlSeriesCatFragment$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlSeriesCatFragment$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlSeriesCatFragment$c.class */
    public class DialogInterfaceOnClickListenerC3698c implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ParentalControlSeriesCatFragment f22233b;

        public DialogInterfaceOnClickListenerC3698c(ParentalControlSeriesCatFragment parentalControlSeriesCatFragment) {
            this.f22233b = parentalControlSeriesCatFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlSeriesCatFragment$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlSeriesCatFragment$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlSeriesCatFragment$d.class */
    public class DialogInterfaceOnClickListenerC3699d implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ParentalControlSeriesCatFragment f22234b;

        public DialogInterfaceOnClickListenerC3699d(ParentalControlSeriesCatFragment parentalControlSeriesCatFragment) {
            this.f22234b = parentalControlSeriesCatFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlSeriesCatFragment$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlSeriesCatFragment$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlSeriesCatFragment$e.class */
    public class DialogInterfaceOnClickListenerC3700e implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ParentalControlSeriesCatFragment f22235b;

        public DialogInterfaceOnClickListenerC3700e(ParentalControlSeriesCatFragment parentalControlSeriesCatFragment) {
            this.f22235b = parentalControlSeriesCatFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlSeriesCatFragment$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlSeriesCatFragment$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlSeriesCatFragment$f.class */
    public interface InterfaceC3701f {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof InterfaceC3701f) {
            this.f22230q = (InterfaceC3701f) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f22215b = getArguments().getString("param1");
            this.f22216c = getArguments().getString("param2");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        if (menu != null) {
            menu.clear();
        }
        this.f22222i.m1224x(2131689495);
        TypedValue typedValue = new TypedValue();
        if (this.f22228o.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.f22228o.getResources().getDisplayMetrics());
        }
        for (int i10 = 0; i10 < this.f22222i.getChildCount(); i10++) {
            if (this.f22222i.getChildAt(i10) instanceof ActionMenuView) {
                ((Toolbar.C0292e) this.f22222i.getChildAt(i10).getLayoutParams()).f26228a = 16;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setHasOptionsMenu(false);
        View inflate = layoutInflater.inflate(2131624216, viewGroup, false);
        this.f22229p = ButterKnife.m5627b(this, inflate);
        m18107p();
        m18108q();
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f22230q = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 2131427417:
                Context context = this.f22228o;
                if (context != null) {
                    C5255e.m26211N(context);
                    break;
                }
                break;
            case 2131427425:
                SearchView searchView = (SearchView) C6845p.m31619b(menuItem);
                this.f22223j = searchView;
                searchView.setQueryHint(getResources().getString(2132018513));
                this.f22223j.setIconifiedByDefault(false);
                this.f22223j.setOnQueryTextListener(new C3696a(this));
                break;
            case 2131428638:
                DialogC0242a.a aVar = new DialogC0242a.a(this.f22228o);
                aVar.m855c(2131231731);
                aVar.m861i(this.f22228o.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3697b(this));
                aVar.m858f(this.f22228o.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3698c(this));
                aVar.m865m();
                break;
            case 2131428640:
                DialogC0242a.a aVar2 = new DialogC0242a.a(this.f22228o);
                aVar2.m855c(2131231731);
                aVar2.m861i(this.f22228o.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3699d(this));
                aVar2.m858f(this.f22228o.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3700e(this));
                aVar2.m865m();
                break;
            case 2131428761:
                startActivity(new Intent(this.f22228o, (Class<?>) NewDashboardActivity.class));
                startActivity(new Intent(this.f22228o, (Class<?>) SettingsActivity.class));
                SearchView searchView2 = (SearchView) C6845p.m31619b(menuItem);
                this.f22223j = searchView2;
                searchView2.setQueryHint(getResources().getString(2132018513));
                this.f22223j.setIconifiedByDefault(false);
                this.f22223j.setOnQueryTextListener(new C3696a(this));
                break;
            case 2131428776:
                startActivity(new Intent(this.f22228o, (Class<?>) SettingsActivity.class));
                SearchView searchView22 = (SearchView) C6845p.m31619b(menuItem);
                this.f22223j = searchView22;
                searchView22.setQueryHint(getResources().getString(2132018513));
                this.f22223j.setIconifiedByDefault(false);
                this.f22223j.setOnQueryTextListener(new C3696a(this));
                break;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
    }

    /* renamed from: p */
    public final void m18107p() {
        ArrayList<LiveStreamCategoryIdDBModel> m15247r1;
        int m15220g2;
        RecyclerView recyclerView;
        this.f22228o = getContext();
        this.f22224k = new LiveStreamDBHandler(this.f22228o);
        this.f22221h = Typeface.createFromAsset(getActivity().getAssets(), "fonts/open_sans.ttf");
        this.f22217d = (ParentalControlActivitity) this.f22228o;
        this.myRecyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f22219f = linearLayoutManager;
        this.myRecyclerView.setLayoutManager(linearLayoutManager);
        if (SharepreferenceDBHandler.m15373f(this.f22228o).equals("m3u")) {
            m15247r1 = this.f22224k.m15245q1();
            m15220g2 = this.f22224k.m15213d2("-5");
        } else {
            m15247r1 = this.f22224k.m15247r1();
            m15220g2 = this.f22224k.m15220g2("-5");
        }
        this.f22227n = m15220g2;
        LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
        int i10 = this.f22227n;
        if (i10 != 0 && i10 > 0) {
            liveStreamCategoryIdDBModel.m14792g("-5");
            liveStreamCategoryIdDBModel.m14793h(getResources().getString(2132018731));
            m15247r1.add(m15247r1.size(), liveStreamCategoryIdDBModel);
        }
        HashMap hashMap = new HashMap();
        if (m15247r1 != null) {
            Iterator<LiveStreamCategoryIdDBModel> it = m15247r1.iterator();
            while (it.hasNext()) {
                LiveStreamCategoryIdDBModel next = it.next();
                hashMap.put(next.m14787b(), next.m14788c());
            }
        }
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
        if (m15247r1 != null && m15247r1.size() > 0 && (recyclerView = this.myRecyclerView) != null && this.emptyView != null) {
            recyclerView.setVisibility(0);
            this.emptyView.setVisibility(8);
            ParentalControlVODCatAdapter parentalControlVODCatAdapter = new ParentalControlVODCatAdapter(m15247r1, getContext(), this.f22217d, this.f22221h);
            this.f22218e = parentalControlVODCatAdapter;
            this.myRecyclerView.setAdapter(parentalControlVODCatAdapter);
            return;
        }
        RecyclerView recyclerView2 = this.myRecyclerView;
        if (recyclerView2 == null || this.emptyView == null) {
            return;
        }
        recyclerView2.setVisibility(8);
        this.emptyView.setVisibility(0);
        this.emptyView.setText(getResources().getString(2132018222));
    }

    /* renamed from: q */
    public final void m18108q() {
        setHasOptionsMenu(true);
        this.f22222i = (Toolbar) getActivity().findViewById(2131429320);
    }
}

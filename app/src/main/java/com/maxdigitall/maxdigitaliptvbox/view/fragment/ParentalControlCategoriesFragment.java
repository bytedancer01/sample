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
import com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity;
import com.maxdigitall.maxdigitaliptvbox.view.activity.ParentalControlActivitity;
import com.maxdigitall.maxdigitaliptvbox.view.activity.SettingsActivity;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.ParentalControlLiveCatgoriesAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p151if.C5255e;
import p235o0.C6845p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlCategoriesFragment.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlCategoriesFragment.class */
public class ParentalControlCategoriesFragment extends Fragment {

    /* renamed from: b */
    public String f22149b;

    /* renamed from: c */
    public String f22150c;

    /* renamed from: d */
    public ParentalControlActivitity f22151d;

    /* renamed from: e */
    public ParentalControlLiveCatgoriesAdapter f22152e;

    @BindView
    public TextView emptyView;

    /* renamed from: f */
    public RecyclerView.AbstractC0685p f22153f;

    /* renamed from: g */
    public ProgressDialog f22154g;

    /* renamed from: h */
    public Typeface f22155h;

    /* renamed from: i */
    public Toolbar f22156i;

    /* renamed from: j */
    public SearchView f22157j;

    /* renamed from: k */
    public LiveStreamDBHandler f22158k;

    @BindView
    public RecyclerView myRecyclerView;

    /* renamed from: n */
    public Context f22161n;

    /* renamed from: o */
    public Unbinder f22162o;

    /* renamed from: p */
    public InterfaceC3683f f22163p;

    @BindView
    public ProgressBar pbLoader;

    /* renamed from: l */
    public DatabaseUpdatedStatusDBModel f22159l = new DatabaseUpdatedStatusDBModel();

    /* renamed from: m */
    public DatabaseUpdatedStatusDBModel f22160m = new DatabaseUpdatedStatusDBModel();

    /* renamed from: q */
    public int f22164q = -1;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlCategoriesFragment$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlCategoriesFragment$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlCategoriesFragment$a.class */
    public class C3678a implements SearchView.InterfaceC0282l {

        /* renamed from: a */
        public final ParentalControlCategoriesFragment f22165a;

        public C3678a(ParentalControlCategoriesFragment parentalControlCategoriesFragment) {
            this.f22165a = parentalControlCategoriesFragment;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextChange(String str) {
            ProgressBar progressBar = this.f22165a.pbLoader;
            if (progressBar != null) {
                progressBar.setVisibility(4);
            }
            if (this.f22165a.f22154g != null) {
                this.f22165a.f22154g.dismiss();
            }
            ParentalControlCategoriesFragment parentalControlCategoriesFragment = this.f22165a;
            if (parentalControlCategoriesFragment.emptyView == null || parentalControlCategoriesFragment.f22152e == null) {
                return true;
            }
            this.f22165a.emptyView.setVisibility(8);
            ParentalControlLiveCatgoriesAdapter parentalControlLiveCatgoriesAdapter = this.f22165a.f22152e;
            ParentalControlCategoriesFragment parentalControlCategoriesFragment2 = this.f22165a;
            parentalControlLiveCatgoriesAdapter.m17297m0(str, parentalControlCategoriesFragment2.emptyView, parentalControlCategoriesFragment2.f22154g);
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlCategoriesFragment$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlCategoriesFragment$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlCategoriesFragment$b.class */
    public class DialogInterfaceOnClickListenerC3679b implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ParentalControlCategoriesFragment f22166b;

        public DialogInterfaceOnClickListenerC3679b(ParentalControlCategoriesFragment parentalControlCategoriesFragment) {
            this.f22166b = parentalControlCategoriesFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26210M(this.f22166b.f22161n);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlCategoriesFragment$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlCategoriesFragment$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlCategoriesFragment$c.class */
    public class DialogInterfaceOnClickListenerC3680c implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ParentalControlCategoriesFragment f22167b;

        public DialogInterfaceOnClickListenerC3680c(ParentalControlCategoriesFragment parentalControlCategoriesFragment) {
            this.f22167b = parentalControlCategoriesFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlCategoriesFragment$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlCategoriesFragment$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlCategoriesFragment$d.class */
    public class DialogInterfaceOnClickListenerC3681d implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ParentalControlCategoriesFragment f22168b;

        public DialogInterfaceOnClickListenerC3681d(ParentalControlCategoriesFragment parentalControlCategoriesFragment) {
            this.f22168b = parentalControlCategoriesFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlCategoriesFragment$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlCategoriesFragment$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlCategoriesFragment$e.class */
    public class DialogInterfaceOnClickListenerC3682e implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ParentalControlCategoriesFragment f22169b;

        public DialogInterfaceOnClickListenerC3682e(ParentalControlCategoriesFragment parentalControlCategoriesFragment) {
            this.f22169b = parentalControlCategoriesFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlCategoriesFragment$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlCategoriesFragment$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlCategoriesFragment$f.class */
    public interface InterfaceC3683f {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof InterfaceC3683f) {
            this.f22163p = (InterfaceC3683f) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f22149b = getArguments().getString("param1");
            this.f22150c = getArguments().getString("param2");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        if (menu != null) {
            menu.clear();
        }
        this.f22156i.m1224x(2131689495);
        TypedValue typedValue = new TypedValue();
        if (this.f22161n.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.f22161n.getResources().getDisplayMetrics());
        }
        for (int i10 = 0; i10 < this.f22156i.getChildCount(); i10++) {
            if (this.f22156i.getChildAt(i10) instanceof ActionMenuView) {
                ((Toolbar.C0292e) this.f22156i.getChildAt(i10).getLayoutParams()).f26228a = 16;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setHasOptionsMenu(false);
        View inflate = layoutInflater.inflate(2131624214, viewGroup, false);
        this.f22162o = ButterKnife.m5627b(this, inflate);
        m18095p();
        m18096q();
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        setHasOptionsMenu(false);
        this.f22163p = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getItemId();
        switch (menuItem.getItemId()) {
            case 2131427417:
                Context context = this.f22161n;
                if (context != null) {
                    C5255e.m26211N(context);
                    break;
                }
                break;
            case 2131427425:
                SearchView searchView = (SearchView) C6845p.m31619b(menuItem);
                this.f22157j = searchView;
                searchView.setQueryHint(getResources().getString(2132018518));
                this.f22157j.setIconifiedByDefault(false);
                this.f22157j.setOnQueryTextListener(new C3678a(this));
                break;
            case 2131428638:
                DialogC0242a.a aVar = new DialogC0242a.a(this.f22161n);
                aVar.setTitle(this.f22161n.getResources().getString(2132017514));
                aVar.m857e(this.f22161n.getResources().getString(2132017585));
                aVar.m855c(2131231731);
                aVar.m861i(this.f22161n.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3679b(this));
                aVar.m858f(this.f22161n.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3680c(this));
                aVar.m865m();
                break;
            case 2131428640:
                DialogC0242a.a aVar2 = new DialogC0242a.a(this.f22161n);
                aVar2.setTitle(this.f22161n.getResources().getString(2132017514));
                aVar2.m857e(this.f22161n.getResources().getString(2132017585));
                aVar2.m855c(2131231731);
                aVar2.m861i(this.f22161n.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3681d(this));
                aVar2.m858f(this.f22161n.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3682e(this));
                aVar2.m865m();
                break;
            case 2131428761:
                startActivity(new Intent(this.f22161n, (Class<?>) NewDashboardActivity.class));
                startActivity(new Intent(this.f22161n, (Class<?>) SettingsActivity.class));
                SearchView searchView2 = (SearchView) C6845p.m31619b(menuItem);
                this.f22157j = searchView2;
                searchView2.setQueryHint(getResources().getString(2132018518));
                this.f22157j.setIconifiedByDefault(false);
                this.f22157j.setOnQueryTextListener(new C3678a(this));
                break;
            case 2131428776:
                startActivity(new Intent(this.f22161n, (Class<?>) SettingsActivity.class));
                SearchView searchView22 = (SearchView) C6845p.m31619b(menuItem);
                this.f22157j = searchView22;
                searchView22.setQueryHint(getResources().getString(2132018518));
                this.f22157j.setIconifiedByDefault(false);
                this.f22157j.setOnQueryTextListener(new C3678a(this));
                break;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
    }

    /* renamed from: p */
    public final void m18095p() {
        RecyclerView recyclerView;
        this.f22161n = getContext();
        this.f22158k = new LiveStreamDBHandler(this.f22161n);
        this.f22155h = Typeface.createFromAsset(getActivity().getAssets(), "fonts/open_sans.ttf");
        this.f22151d = (ParentalControlActivitity) this.f22161n;
        this.myRecyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f22153f = linearLayoutManager;
        this.myRecyclerView.setLayoutManager(linearLayoutManager);
        LiveStreamDBHandler liveStreamDBHandler = new LiveStreamDBHandler(this.f22161n);
        ArrayList<LiveStreamCategoryIdDBModel> m15266y1 = liveStreamDBHandler.m15266y1("live");
        this.f22164q = liveStreamDBHandler.m15211c2("-2", "live");
        LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
        int i10 = this.f22164q;
        if (i10 != 0 && i10 > 0) {
            liveStreamCategoryIdDBModel.m14792g("-2");
            liveStreamCategoryIdDBModel.m14793h(getResources().getString(2132018731));
            m15266y1.add(m15266y1.size(), liveStreamCategoryIdDBModel);
        }
        HashMap hashMap = new HashMap();
        if (m15266y1 != null) {
            Iterator<LiveStreamCategoryIdDBModel> it = m15266y1.iterator();
            while (it.hasNext()) {
                LiveStreamCategoryIdDBModel next = it.next();
                hashMap.put(next.m14787b(), next.m14788c());
            }
        }
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
        if (m15266y1 != null && m15266y1.size() > 0 && (recyclerView = this.myRecyclerView) != null && this.emptyView != null) {
            recyclerView.setVisibility(0);
            this.emptyView.setVisibility(8);
            ParentalControlLiveCatgoriesAdapter parentalControlLiveCatgoriesAdapter = new ParentalControlLiveCatgoriesAdapter(m15266y1, getContext(), this.f22151d, this.f22155h);
            this.f22152e = parentalControlLiveCatgoriesAdapter;
            this.myRecyclerView.setAdapter(parentalControlLiveCatgoriesAdapter);
            return;
        }
        RecyclerView recyclerView2 = this.myRecyclerView;
        if (recyclerView2 == null || this.emptyView == null) {
            return;
        }
        recyclerView2.setVisibility(8);
        this.emptyView.setVisibility(0);
        this.emptyView.setText(getResources().getString(2132018211));
    }

    /* renamed from: q */
    public final void m18096q() {
        setHasOptionsMenu(true);
        this.f22156i = (Toolbar) getActivity().findViewById(2131429320);
    }
}

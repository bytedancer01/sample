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
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlRadioCategoriesFragment.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlRadioCategoriesFragment.class */
public class ParentalControlRadioCategoriesFragment extends Fragment {

    /* renamed from: b */
    public String f22193b;

    /* renamed from: c */
    public String f22194c;

    /* renamed from: d */
    public ParentalControlActivitity f22195d;

    /* renamed from: e */
    public ParentalControlLiveCatgoriesAdapter f22196e;

    @BindView
    public TextView emptyView;

    /* renamed from: f */
    public RecyclerView.AbstractC0685p f22197f;

    /* renamed from: g */
    public ProgressDialog f22198g;

    /* renamed from: h */
    public Typeface f22199h;

    /* renamed from: i */
    public Toolbar f22200i;

    /* renamed from: j */
    public SearchView f22201j;

    /* renamed from: k */
    public LiveStreamDBHandler f22202k;

    @BindView
    public RecyclerView myRecyclerView;

    /* renamed from: n */
    public Context f22205n;

    /* renamed from: o */
    public Unbinder f22206o;

    /* renamed from: p */
    public InterfaceC3695f f22207p;

    @BindView
    public ProgressBar pbLoader;

    /* renamed from: l */
    public DatabaseUpdatedStatusDBModel f22203l = new DatabaseUpdatedStatusDBModel();

    /* renamed from: m */
    public DatabaseUpdatedStatusDBModel f22204m = new DatabaseUpdatedStatusDBModel();

    /* renamed from: q */
    public int f22208q = -1;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlRadioCategoriesFragment$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlRadioCategoriesFragment$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlRadioCategoriesFragment$a.class */
    public class C3690a implements SearchView.InterfaceC0282l {

        /* renamed from: a */
        public final ParentalControlRadioCategoriesFragment f22209a;

        public C3690a(ParentalControlRadioCategoriesFragment parentalControlRadioCategoriesFragment) {
            this.f22209a = parentalControlRadioCategoriesFragment;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextChange(String str) {
            ProgressBar progressBar = this.f22209a.pbLoader;
            if (progressBar != null) {
                progressBar.setVisibility(4);
            }
            if (this.f22209a.f22198g != null) {
                this.f22209a.f22198g.dismiss();
            }
            ParentalControlRadioCategoriesFragment parentalControlRadioCategoriesFragment = this.f22209a;
            if (parentalControlRadioCategoriesFragment.emptyView == null || parentalControlRadioCategoriesFragment.f22196e == null) {
                return true;
            }
            this.f22209a.emptyView.setVisibility(8);
            ParentalControlLiveCatgoriesAdapter parentalControlLiveCatgoriesAdapter = this.f22209a.f22196e;
            ParentalControlRadioCategoriesFragment parentalControlRadioCategoriesFragment2 = this.f22209a;
            parentalControlLiveCatgoriesAdapter.m17297m0(str, parentalControlRadioCategoriesFragment2.emptyView, parentalControlRadioCategoriesFragment2.f22198g);
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlRadioCategoriesFragment$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlRadioCategoriesFragment$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlRadioCategoriesFragment$b.class */
    public class DialogInterfaceOnClickListenerC3691b implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ParentalControlRadioCategoriesFragment f22210b;

        public DialogInterfaceOnClickListenerC3691b(ParentalControlRadioCategoriesFragment parentalControlRadioCategoriesFragment) {
            this.f22210b = parentalControlRadioCategoriesFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26210M(this.f22210b.f22205n);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlRadioCategoriesFragment$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlRadioCategoriesFragment$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlRadioCategoriesFragment$c.class */
    public class DialogInterfaceOnClickListenerC3692c implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ParentalControlRadioCategoriesFragment f22211b;

        public DialogInterfaceOnClickListenerC3692c(ParentalControlRadioCategoriesFragment parentalControlRadioCategoriesFragment) {
            this.f22211b = parentalControlRadioCategoriesFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlRadioCategoriesFragment$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlRadioCategoriesFragment$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlRadioCategoriesFragment$d.class */
    public class DialogInterfaceOnClickListenerC3693d implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ParentalControlRadioCategoriesFragment f22212b;

        public DialogInterfaceOnClickListenerC3693d(ParentalControlRadioCategoriesFragment parentalControlRadioCategoriesFragment) {
            this.f22212b = parentalControlRadioCategoriesFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlRadioCategoriesFragment$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlRadioCategoriesFragment$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlRadioCategoriesFragment$e.class */
    public class DialogInterfaceOnClickListenerC3694e implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ParentalControlRadioCategoriesFragment f22213b;

        public DialogInterfaceOnClickListenerC3694e(ParentalControlRadioCategoriesFragment parentalControlRadioCategoriesFragment) {
            this.f22213b = parentalControlRadioCategoriesFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlRadioCategoriesFragment$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlRadioCategoriesFragment$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlRadioCategoriesFragment$f.class */
    public interface InterfaceC3695f {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof InterfaceC3695f) {
            this.f22207p = (InterfaceC3695f) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f22193b = getArguments().getString("param1");
            this.f22194c = getArguments().getString("param2");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        if (menu != null) {
            menu.clear();
        }
        this.f22200i.m1224x(2131689495);
        TypedValue typedValue = new TypedValue();
        if (this.f22205n.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.f22205n.getResources().getDisplayMetrics());
        }
        for (int i10 = 0; i10 < this.f22200i.getChildCount(); i10++) {
            if (this.f22200i.getChildAt(i10) instanceof ActionMenuView) {
                ((Toolbar.C0292e) this.f22200i.getChildAt(i10).getLayoutParams()).f26228a = 16;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setHasOptionsMenu(false);
        View inflate = layoutInflater.inflate(2131624214, viewGroup, false);
        this.f22206o = ButterKnife.m5627b(this, inflate);
        m18103p();
        m18104q();
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        setHasOptionsMenu(false);
        this.f22207p = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getItemId();
        switch (menuItem.getItemId()) {
            case 2131427417:
                Context context = this.f22205n;
                if (context != null) {
                    C5255e.m26211N(context);
                    break;
                }
                break;
            case 2131427425:
                SearchView searchView = (SearchView) C6845p.m31619b(menuItem);
                this.f22201j = searchView;
                searchView.setQueryHint(getResources().getString(2132018518));
                this.f22201j.setIconifiedByDefault(false);
                this.f22201j.setOnQueryTextListener(new C3690a(this));
                break;
            case 2131428638:
                DialogC0242a.a aVar = new DialogC0242a.a(this.f22205n);
                aVar.setTitle(this.f22205n.getResources().getString(2132017514));
                aVar.m857e(this.f22205n.getResources().getString(2132017585));
                aVar.m855c(2131231731);
                aVar.m861i(this.f22205n.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3691b(this));
                aVar.m858f(this.f22205n.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3692c(this));
                aVar.m865m();
                break;
            case 2131428640:
                DialogC0242a.a aVar2 = new DialogC0242a.a(this.f22205n);
                aVar2.setTitle(this.f22205n.getResources().getString(2132017514));
                aVar2.m857e(this.f22205n.getResources().getString(2132017585));
                aVar2.m855c(2131231731);
                aVar2.m861i(this.f22205n.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3693d(this));
                aVar2.m858f(this.f22205n.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3694e(this));
                aVar2.m865m();
                break;
            case 2131428761:
                startActivity(new Intent(this.f22205n, (Class<?>) NewDashboardActivity.class));
                startActivity(new Intent(this.f22205n, (Class<?>) SettingsActivity.class));
                SearchView searchView2 = (SearchView) C6845p.m31619b(menuItem);
                this.f22201j = searchView2;
                searchView2.setQueryHint(getResources().getString(2132018518));
                this.f22201j.setIconifiedByDefault(false);
                this.f22201j.setOnQueryTextListener(new C3690a(this));
                break;
            case 2131428776:
                startActivity(new Intent(this.f22205n, (Class<?>) SettingsActivity.class));
                SearchView searchView22 = (SearchView) C6845p.m31619b(menuItem);
                this.f22201j = searchView22;
                searchView22.setQueryHint(getResources().getString(2132018518));
                this.f22201j.setIconifiedByDefault(false);
                this.f22201j.setOnQueryTextListener(new C3690a(this));
                break;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
    }

    /* renamed from: p */
    public final void m18103p() {
        RecyclerView recyclerView;
        this.f22205n = getContext();
        this.f22202k = new LiveStreamDBHandler(this.f22205n);
        this.f22199h = Typeface.createFromAsset(getActivity().getAssets(), "fonts/open_sans.ttf");
        this.f22195d = (ParentalControlActivitity) this.f22205n;
        this.myRecyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f22197f = linearLayoutManager;
        this.myRecyclerView.setLayoutManager(linearLayoutManager);
        ArrayList<LiveStreamCategoryIdDBModel> m15266y1 = new LiveStreamDBHandler(this.f22205n).m15266y1("radio_streams");
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
            ParentalControlLiveCatgoriesAdapter parentalControlLiveCatgoriesAdapter = new ParentalControlLiveCatgoriesAdapter(m15266y1, getContext(), this.f22195d, this.f22199h);
            this.f22196e = parentalControlLiveCatgoriesAdapter;
            this.myRecyclerView.setAdapter(parentalControlLiveCatgoriesAdapter);
            return;
        }
        RecyclerView recyclerView2 = this.myRecyclerView;
        if (recyclerView2 == null || this.emptyView == null) {
            return;
        }
        recyclerView2.setVisibility(8);
        this.emptyView.setVisibility(0);
        this.emptyView.setText(getResources().getString(2132018217));
    }

    /* renamed from: q */
    public final void m18104q() {
        setHasOptionsMenu(true);
        this.f22200i = (Toolbar) getActivity().findViewById(2131429320);
    }
}

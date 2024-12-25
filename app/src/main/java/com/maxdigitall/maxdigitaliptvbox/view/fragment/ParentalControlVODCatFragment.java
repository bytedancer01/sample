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
import com.maxdigitall.maxdigitaliptvbox.view.adapter.ParentalControlVODCatAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p151if.C5255e;
import p235o0.C6845p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlVODCatFragment.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlVODCatFragment.class */
public class ParentalControlVODCatFragment extends Fragment {

    /* renamed from: b */
    public String f22250b;

    /* renamed from: c */
    public String f22251c;

    /* renamed from: d */
    public ParentalControlActivitity f22252d;

    /* renamed from: e */
    public ParentalControlVODCatAdapter f22253e;

    @BindView
    public TextView emptyView;

    /* renamed from: f */
    public RecyclerView.AbstractC0685p f22254f;

    /* renamed from: g */
    public ProgressDialog f22255g;

    /* renamed from: h */
    public Typeface f22256h;

    /* renamed from: i */
    public Toolbar f22257i;

    /* renamed from: j */
    public SearchView f22258j;

    /* renamed from: k */
    public LiveStreamDBHandler f22259k;

    @BindView
    public RecyclerView myRecyclerView;

    /* renamed from: o */
    public Context f22263o;

    /* renamed from: p */
    public Unbinder f22264p;

    @BindView
    public ProgressBar pbLoader;

    /* renamed from: q */
    public InterfaceC3709f f22265q;

    /* renamed from: l */
    public DatabaseUpdatedStatusDBModel f22260l = new DatabaseUpdatedStatusDBModel();

    /* renamed from: m */
    public DatabaseUpdatedStatusDBModel f22261m = new DatabaseUpdatedStatusDBModel();

    /* renamed from: n */
    public int f22262n = -1;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlVODCatFragment$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlVODCatFragment$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlVODCatFragment$a.class */
    public class C3704a implements SearchView.InterfaceC0282l {

        /* renamed from: a */
        public final ParentalControlVODCatFragment f22266a;

        public C3704a(ParentalControlVODCatFragment parentalControlVODCatFragment) {
            this.f22266a = parentalControlVODCatFragment;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextChange(String str) {
            ProgressBar progressBar = this.f22266a.pbLoader;
            if (progressBar != null) {
                progressBar.setVisibility(4);
            }
            if (this.f22266a.f22255g != null) {
                this.f22266a.f22255g.dismiss();
            }
            ParentalControlVODCatFragment parentalControlVODCatFragment = this.f22266a;
            if (parentalControlVODCatFragment.emptyView == null || parentalControlVODCatFragment.f22253e == null) {
                return true;
            }
            this.f22266a.emptyView.setVisibility(8);
            ParentalControlVODCatAdapter parentalControlVODCatAdapter = this.f22266a.f22253e;
            ParentalControlVODCatFragment parentalControlVODCatFragment2 = this.f22266a;
            parentalControlVODCatAdapter.m17310m0(str, parentalControlVODCatFragment2.emptyView, parentalControlVODCatFragment2.f22255g);
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlVODCatFragment$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlVODCatFragment$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlVODCatFragment$b.class */
    public class DialogInterfaceOnClickListenerC3705b implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ParentalControlVODCatFragment f22267b;

        public DialogInterfaceOnClickListenerC3705b(ParentalControlVODCatFragment parentalControlVODCatFragment) {
            this.f22267b = parentalControlVODCatFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlVODCatFragment$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlVODCatFragment$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlVODCatFragment$c.class */
    public class DialogInterfaceOnClickListenerC3706c implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ParentalControlVODCatFragment f22268b;

        public DialogInterfaceOnClickListenerC3706c(ParentalControlVODCatFragment parentalControlVODCatFragment) {
            this.f22268b = parentalControlVODCatFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlVODCatFragment$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlVODCatFragment$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlVODCatFragment$d.class */
    public class DialogInterfaceOnClickListenerC3707d implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ParentalControlVODCatFragment f22269b;

        public DialogInterfaceOnClickListenerC3707d(ParentalControlVODCatFragment parentalControlVODCatFragment) {
            this.f22269b = parentalControlVODCatFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlVODCatFragment$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlVODCatFragment$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlVODCatFragment$e.class */
    public class DialogInterfaceOnClickListenerC3708e implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ParentalControlVODCatFragment f22270b;

        public DialogInterfaceOnClickListenerC3708e(ParentalControlVODCatFragment parentalControlVODCatFragment) {
            this.f22270b = parentalControlVODCatFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlVODCatFragment$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlVODCatFragment$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlVODCatFragment$f.class */
    public interface InterfaceC3709f {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof InterfaceC3709f) {
            this.f22265q = (InterfaceC3709f) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f22250b = getArguments().getString("param1");
            this.f22251c = getArguments().getString("param2");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        if (menu != null) {
            menu.clear();
        }
        this.f22257i.m1224x(2131689495);
        TypedValue typedValue = new TypedValue();
        if (this.f22263o.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.f22263o.getResources().getDisplayMetrics());
        }
        for (int i10 = 0; i10 < this.f22257i.getChildCount(); i10++) {
            if (this.f22257i.getChildAt(i10) instanceof ActionMenuView) {
                ((Toolbar.C0292e) this.f22257i.getChildAt(i10).getLayoutParams()).f26228a = 16;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setHasOptionsMenu(false);
        View inflate = layoutInflater.inflate(2131624216, viewGroup, false);
        this.f22264p = ButterKnife.m5627b(this, inflate);
        m18116p();
        m18117q();
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f22265q = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 2131427417:
                Context context = this.f22263o;
                if (context != null) {
                    C5255e.m26211N(context);
                    break;
                }
                break;
            case 2131427425:
                SearchView searchView = (SearchView) C6845p.m31619b(menuItem);
                this.f22258j = searchView;
                searchView.setQueryHint(getResources().getString(2132018513));
                this.f22258j.setIconifiedByDefault(false);
                this.f22258j.setOnQueryTextListener(new C3704a(this));
                break;
            case 2131428638:
                DialogC0242a.a aVar = new DialogC0242a.a(this.f22263o);
                aVar.m855c(2131231731);
                aVar.m861i(this.f22263o.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3705b(this));
                aVar.m858f(this.f22263o.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3706c(this));
                aVar.m865m();
                break;
            case 2131428640:
                DialogC0242a.a aVar2 = new DialogC0242a.a(this.f22263o);
                aVar2.m855c(2131231731);
                aVar2.m861i(this.f22263o.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3707d(this));
                aVar2.m858f(this.f22263o.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3708e(this));
                aVar2.m865m();
                break;
            case 2131428761:
                startActivity(new Intent(this.f22263o, (Class<?>) NewDashboardActivity.class));
                startActivity(new Intent(this.f22263o, (Class<?>) SettingsActivity.class));
                SearchView searchView2 = (SearchView) C6845p.m31619b(menuItem);
                this.f22258j = searchView2;
                searchView2.setQueryHint(getResources().getString(2132018513));
                this.f22258j.setIconifiedByDefault(false);
                this.f22258j.setOnQueryTextListener(new C3704a(this));
                break;
            case 2131428776:
                startActivity(new Intent(this.f22263o, (Class<?>) SettingsActivity.class));
                SearchView searchView22 = (SearchView) C6845p.m31619b(menuItem);
                this.f22258j = searchView22;
                searchView22.setQueryHint(getResources().getString(2132018513));
                this.f22258j.setIconifiedByDefault(false);
                this.f22258j.setOnQueryTextListener(new C3704a(this));
                break;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
    }

    /* renamed from: p */
    public final void m18116p() {
        RecyclerView recyclerView;
        this.f22263o = getContext();
        this.f22259k = new LiveStreamDBHandler(this.f22263o);
        this.f22256h = Typeface.createFromAsset(getActivity().getAssets(), "fonts/open_sans.ttf");
        this.f22252d = (ParentalControlActivitity) this.f22263o;
        this.myRecyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f22254f = linearLayoutManager;
        this.myRecyclerView.setLayoutManager(linearLayoutManager);
        LiveStreamDBHandler liveStreamDBHandler = new LiveStreamDBHandler(this.f22263o);
        ArrayList<LiveStreamCategoryIdDBModel> m15227k1 = liveStreamDBHandler.m15227k1();
        this.f22262n = liveStreamDBHandler.m15211c2("-3", "movie");
        LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
        int i10 = this.f22262n;
        if (i10 != 0 && i10 > 0) {
            liveStreamCategoryIdDBModel.m14792g("-3");
            liveStreamCategoryIdDBModel.m14793h(getResources().getString(2132018731));
            m15227k1.add(m15227k1.size(), liveStreamCategoryIdDBModel);
        }
        HashMap hashMap = new HashMap();
        if (m15227k1 != null) {
            Iterator<LiveStreamCategoryIdDBModel> it = m15227k1.iterator();
            while (it.hasNext()) {
                LiveStreamCategoryIdDBModel next = it.next();
                hashMap.put(next.m14787b(), next.m14788c());
            }
        }
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
        if (m15227k1 != null && m15227k1.size() > 0 && (recyclerView = this.myRecyclerView) != null && this.emptyView != null) {
            recyclerView.setVisibility(0);
            this.emptyView.setVisibility(8);
            ParentalControlVODCatAdapter parentalControlVODCatAdapter = new ParentalControlVODCatAdapter(m15227k1, getContext(), this.f22252d, this.f22256h);
            this.f22253e = parentalControlVODCatAdapter;
            this.myRecyclerView.setAdapter(parentalControlVODCatAdapter);
            return;
        }
        RecyclerView recyclerView2 = this.myRecyclerView;
        if (recyclerView2 == null || this.emptyView == null) {
            return;
        }
        recyclerView2.setVisibility(8);
        this.emptyView.setVisibility(0);
        this.emptyView.setText(getResources().getString(2132018236));
    }

    /* renamed from: q */
    public final void m18117q() {
        setHasOptionsMenu(true);
        this.f22257i = (Toolbar) getActivity().findViewById(2131429320);
    }
}

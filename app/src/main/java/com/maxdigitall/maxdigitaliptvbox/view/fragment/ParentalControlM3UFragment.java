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
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlM3UFragment.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlM3UFragment.class */
public class ParentalControlM3UFragment extends Fragment {

    /* renamed from: b */
    public String f22171b;

    /* renamed from: c */
    public String f22172c;

    /* renamed from: d */
    public ParentalControlActivitity f22173d;

    /* renamed from: e */
    public ParentalControlVODCatAdapter f22174e;

    @BindView
    public TextView emptyView;

    /* renamed from: f */
    public RecyclerView.AbstractC0685p f22175f;

    /* renamed from: g */
    public ProgressDialog f22176g;

    /* renamed from: h */
    public Typeface f22177h;

    /* renamed from: i */
    public Toolbar f22178i;

    /* renamed from: j */
    public SearchView f22179j;

    /* renamed from: k */
    public LiveStreamDBHandler f22180k;

    @BindView
    public RecyclerView myRecyclerView;

    /* renamed from: o */
    public Context f22184o;

    /* renamed from: p */
    public Unbinder f22185p;

    @BindView
    public ProgressBar pbLoader;

    /* renamed from: q */
    public InterfaceC3689f f22186q;

    /* renamed from: l */
    public DatabaseUpdatedStatusDBModel f22181l = new DatabaseUpdatedStatusDBModel();

    /* renamed from: m */
    public DatabaseUpdatedStatusDBModel f22182m = new DatabaseUpdatedStatusDBModel();

    /* renamed from: n */
    public int f22183n = -1;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlM3UFragment$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlM3UFragment$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlM3UFragment$a.class */
    public class C3684a implements SearchView.InterfaceC0282l {

        /* renamed from: a */
        public final ParentalControlM3UFragment f22187a;

        public C3684a(ParentalControlM3UFragment parentalControlM3UFragment) {
            this.f22187a = parentalControlM3UFragment;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextChange(String str) {
            ProgressBar progressBar = this.f22187a.pbLoader;
            if (progressBar != null) {
                progressBar.setVisibility(4);
            }
            if (this.f22187a.f22176g != null) {
                this.f22187a.f22176g.dismiss();
            }
            ParentalControlM3UFragment parentalControlM3UFragment = this.f22187a;
            if (parentalControlM3UFragment.emptyView == null || parentalControlM3UFragment.f22174e == null) {
                return true;
            }
            this.f22187a.emptyView.setVisibility(8);
            ParentalControlVODCatAdapter parentalControlVODCatAdapter = this.f22187a.f22174e;
            ParentalControlM3UFragment parentalControlM3UFragment2 = this.f22187a;
            parentalControlVODCatAdapter.m17310m0(str, parentalControlM3UFragment2.emptyView, parentalControlM3UFragment2.f22176g);
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlM3UFragment$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlM3UFragment$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlM3UFragment$b.class */
    public class DialogInterfaceOnClickListenerC3685b implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ParentalControlM3UFragment f22188b;

        public DialogInterfaceOnClickListenerC3685b(ParentalControlM3UFragment parentalControlM3UFragment) {
            this.f22188b = parentalControlM3UFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlM3UFragment$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlM3UFragment$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlM3UFragment$c.class */
    public class DialogInterfaceOnClickListenerC3686c implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ParentalControlM3UFragment f22189b;

        public DialogInterfaceOnClickListenerC3686c(ParentalControlM3UFragment parentalControlM3UFragment) {
            this.f22189b = parentalControlM3UFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlM3UFragment$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlM3UFragment$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlM3UFragment$d.class */
    public class DialogInterfaceOnClickListenerC3687d implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ParentalControlM3UFragment f22190b;

        public DialogInterfaceOnClickListenerC3687d(ParentalControlM3UFragment parentalControlM3UFragment) {
            this.f22190b = parentalControlM3UFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlM3UFragment$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlM3UFragment$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlM3UFragment$e.class */
    public class DialogInterfaceOnClickListenerC3688e implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ParentalControlM3UFragment f22191b;

        public DialogInterfaceOnClickListenerC3688e(ParentalControlM3UFragment parentalControlM3UFragment) {
            this.f22191b = parentalControlM3UFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlM3UFragment$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlM3UFragment$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlM3UFragment$f.class */
    public interface InterfaceC3689f {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof InterfaceC3689f) {
            this.f22186q = (InterfaceC3689f) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f22171b = getArguments().getString("param1");
            this.f22172c = getArguments().getString("param2");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        if (menu != null) {
            menu.clear();
        }
        this.f22178i.m1224x(2131689495);
        TypedValue typedValue = new TypedValue();
        if (this.f22184o.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.f22184o.getResources().getDisplayMetrics());
        }
        for (int i10 = 0; i10 < this.f22178i.getChildCount(); i10++) {
            if (this.f22178i.getChildAt(i10) instanceof ActionMenuView) {
                ((Toolbar.C0292e) this.f22178i.getChildAt(i10).getLayoutParams()).f26228a = 16;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setHasOptionsMenu(false);
        View inflate = layoutInflater.inflate(2131624216, viewGroup, false);
        this.f22185p = ButterKnife.m5627b(this, inflate);
        m18099p();
        m18100q();
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f22186q = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 2131427417:
                Context context = this.f22184o;
                if (context != null) {
                    C5255e.m26211N(context);
                    break;
                }
                break;
            case 2131427425:
                SearchView searchView = (SearchView) C6845p.m31619b(menuItem);
                this.f22179j = searchView;
                searchView.setQueryHint(getResources().getString(2132018513));
                this.f22179j.setIconifiedByDefault(false);
                this.f22179j.setOnQueryTextListener(new C3684a(this));
                break;
            case 2131428638:
                DialogC0242a.a aVar = new DialogC0242a.a(this.f22184o);
                aVar.m855c(2131231731);
                aVar.m861i(this.f22184o.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3685b(this));
                aVar.m858f(this.f22184o.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3686c(this));
                aVar.m865m();
                break;
            case 2131428640:
                DialogC0242a.a aVar2 = new DialogC0242a.a(this.f22184o);
                aVar2.m855c(2131231731);
                aVar2.m861i(this.f22184o.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3687d(this));
                aVar2.m858f(this.f22184o.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3688e(this));
                aVar2.m865m();
                break;
            case 2131428761:
                startActivity(new Intent(this.f22184o, (Class<?>) NewDashboardActivity.class));
                startActivity(new Intent(this.f22184o, (Class<?>) SettingsActivity.class));
                SearchView searchView2 = (SearchView) C6845p.m31619b(menuItem);
                this.f22179j = searchView2;
                searchView2.setQueryHint(getResources().getString(2132018513));
                this.f22179j.setIconifiedByDefault(false);
                this.f22179j.setOnQueryTextListener(new C3684a(this));
                break;
            case 2131428776:
                startActivity(new Intent(this.f22184o, (Class<?>) SettingsActivity.class));
                SearchView searchView22 = (SearchView) C6845p.m31619b(menuItem);
                this.f22179j = searchView22;
                searchView22.setQueryHint(getResources().getString(2132018513));
                this.f22179j.setIconifiedByDefault(false);
                this.f22179j.setOnQueryTextListener(new C3684a(this));
                break;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
    }

    /* renamed from: p */
    public final void m18099p() {
        RecyclerView recyclerView;
        this.f22184o = getContext();
        this.f22180k = new LiveStreamDBHandler(this.f22184o);
        this.f22177h = Typeface.createFromAsset(getActivity().getAssets(), "fonts/open_sans.ttf");
        this.f22173d = (ParentalControlActivitity) this.f22184o;
        this.myRecyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f22175f = linearLayoutManager;
        this.myRecyclerView.setLayoutManager(linearLayoutManager);
        LiveStreamDBHandler liveStreamDBHandler = new LiveStreamDBHandler(this.f22184o);
        ArrayList<LiveStreamCategoryIdDBModel> m15147A1 = liveStreamDBHandler.m15147A1();
        this.f22183n = liveStreamDBHandler.m15215e2(Boolean.FALSE);
        LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
        int i10 = this.f22183n;
        if (i10 != 0 && i10 > 0) {
            liveStreamCategoryIdDBModel.m14792g("");
            liveStreamCategoryIdDBModel.m14793h(getResources().getString(2132018731));
            m15147A1.add(m15147A1.size(), liveStreamCategoryIdDBModel);
        }
        HashMap hashMap = new HashMap();
        if (m15147A1 != null) {
            Iterator<LiveStreamCategoryIdDBModel> it = m15147A1.iterator();
            while (it.hasNext()) {
                LiveStreamCategoryIdDBModel next = it.next();
                hashMap.put(next.m14787b(), next.m14788c());
            }
        }
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
        if (m15147A1 != null && m15147A1.size() > 0 && (recyclerView = this.myRecyclerView) != null && this.emptyView != null) {
            recyclerView.setVisibility(0);
            this.emptyView.setVisibility(8);
            ParentalControlVODCatAdapter parentalControlVODCatAdapter = new ParentalControlVODCatAdapter(m15147A1, getContext(), this.f22173d, this.f22177h);
            this.f22174e = parentalControlVODCatAdapter;
            this.myRecyclerView.setAdapter(parentalControlVODCatAdapter);
            return;
        }
        RecyclerView recyclerView2 = this.myRecyclerView;
        if (recyclerView2 == null || this.emptyView == null) {
            return;
        }
        recyclerView2.setVisibility(8);
        this.emptyView.setVisibility(0);
        this.emptyView.setText(getResources().getString(2132018195));
    }

    /* renamed from: q */
    public final void m18100q() {
        setHasOptionsMenu(true);
        this.f22178i = (Toolbar) getActivity().findViewById(2131429320);
    }
}

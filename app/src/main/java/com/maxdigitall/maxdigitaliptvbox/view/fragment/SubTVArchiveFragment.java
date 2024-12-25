package com.maxdigitall.maxdigitaliptvbox.view.fragment;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.DialogC0242a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.C0704c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.maxdigitall.maxdigitaliptvbox.model.callback.LiveStreamsCallback;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.XMLTVProgrammePojo;
import com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity;
import com.maxdigitall.maxdigitaliptvbox.view.activity.SettingsActivity;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.SubTVArchiveAdapter;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import p030c0.C0936d;
import p151if.C5255e;
import p324sf.InterfaceC8563b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SubTVArchiveFragment.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SubTVArchiveFragment.class */
public class SubTVArchiveFragment extends Fragment implements InterfaceC8563b {

    /* renamed from: b */
    public RecyclerView.AbstractC0685p f22345b;

    /* renamed from: c */
    public SubTVArchiveAdapter f22346c;

    /* renamed from: d */
    public ArrayList<LiveStreamsCallback> f22347d = new ArrayList<>();

    /* renamed from: e */
    public Toolbar f22348e;

    /* renamed from: f */
    public Context f22349f;

    /* renamed from: g */
    public Unbinder f22350g;

    /* renamed from: h */
    public String f22351h;

    /* renamed from: i */
    public String f22352i;

    /* renamed from: j */
    public String f22353j;

    /* renamed from: k */
    public String f22354k;

    /* renamed from: l */
    public String f22355l;

    /* renamed from: m */
    public String f22356m;

    @BindView
    public RecyclerView myRecyclerView;

    /* renamed from: n */
    public String f22357n;

    @BindView
    public TextView tvNoRecordFound;

    @BindView
    public TextView tvNoStream;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SubTVArchiveFragment$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.SubTVArchiveFragment$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SubTVArchiveFragment$a.class */
    public class DialogInterfaceOnClickListenerC3726a implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SubTVArchiveFragment f22358b;

        public DialogInterfaceOnClickListenerC3726a(SubTVArchiveFragment subTVArchiveFragment) {
            this.f22358b = subTVArchiveFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SubTVArchiveFragment$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.SubTVArchiveFragment$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SubTVArchiveFragment$b.class */
    public class DialogInterfaceOnClickListenerC3727b implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SubTVArchiveFragment f22359b;

        public DialogInterfaceOnClickListenerC3727b(SubTVArchiveFragment subTVArchiveFragment) {
            this.f22359b = subTVArchiveFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26211N(this.f22359b.f22349f);
        }
    }

    /* renamed from: n */
    public static SubTVArchiveFragment m18178n(String str, ArrayList<XMLTVProgrammePojo> arrayList, String str2, String str3, String str4, String str5, String str6, String str7) {
        Bundle bundle = new Bundle();
        bundle.putString("ACTIVE_LIVE_STREAM_CATEGORY_ID", str);
        bundle.putString("ACTIVE_LIVE_STREAM_ID", str2);
        bundle.putString("ACTIVE_LIVE_STREAM_NUM", str3);
        bundle.putString("ACTIVE_LIVE_STREAM_NAME", str4);
        bundle.putString("ACTIVE_LIVE_STREAM_ICON", str5);
        bundle.putString("ACTIVE_LIVE_STREAM_CHANNEL_ID", str6);
        bundle.putString("ACTIVE_LIVE_STREAM_CHANNEL_DURATION", str7);
        bundle.putSerializable("LIVE_STREAMS_EPG", arrayList);
        SubTVArchiveFragment subTVArchiveFragment = new SubTVArchiveFragment();
        subTVArchiveFragment.setArguments(bundle);
        return subTVArchiveFragment;
    }

    /* renamed from: m */
    public final void m18179m(int i10) {
        Context context = getContext();
        this.f22349f = context;
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || context == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f22345b = linearLayoutManager;
        this.myRecyclerView.setLayoutManager(linearLayoutManager);
        this.myRecyclerView.mo2558v1(i10);
        this.myRecyclerView.setItemAnimator(new C0704c());
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.f22349f == null || this.f22348e == null) {
            return;
        }
        TypedValue typedValue = new TypedValue();
        if (this.f22349f.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.f22349f.getResources().getDisplayMetrics());
        }
        for (int i10 = 0; i10 < this.f22348e.getChildCount(); i10++) {
            if (this.f22348e.getChildAt(i10) instanceof ActionMenuView) {
                ((Toolbar.C0292e) this.f22348e.getChildAt(i10).getLayoutParams()).f26228a = 16;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(2131624208, viewGroup, false);
        this.f22350g = ButterKnife.m5627b(this, inflate);
        C0936d.m5638o(getActivity());
        setHasOptionsMenu(true);
        m18181q();
        m18180p();
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f22350g.mo5629a();
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        int itemId = menuItem.getItemId();
        if (itemId == 2131428761) {
            startActivity(new Intent(this.f22349f, (Class<?>) NewDashboardActivity.class));
        }
        if (itemId == 2131428776) {
            startActivity(new Intent(this.f22349f, (Class<?>) SettingsActivity.class));
        }
        if (itemId != 2131427417 || (context = this.f22349f) == null) {
            return false;
        }
        new DialogC0242a.a(context, 2132082693).setTitle(getResources().getString(2132017988)).m857e(getResources().getString(2132017987)).m861i(getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3727b(this)).m858f(getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3726a(this)).m865m();
        return false;
    }

    /* renamed from: p */
    public void m18180p() {
        String str;
        this.f22351h = getArguments().getString("ACTIVE_LIVE_STREAM_CATEGORY_ID");
        this.f22352i = getArguments().getString("ACTIVE_LIVE_STREAM_ID");
        this.f22353j = getArguments().getString("ACTIVE_LIVE_STREAM_NUM");
        this.f22354k = getArguments().getString("ACTIVE_LIVE_STREAM_NAME");
        this.f22355l = getArguments().getString("ACTIVE_LIVE_STREAM_ICON");
        this.f22356m = getArguments().getString("ACTIVE_LIVE_STREAM_CHANNEL_ID");
        this.f22357n = getArguments().getString("ACTIVE_LIVE_STREAM_CHANNEL_DURATION");
        Serializable serializable = getArguments().getSerializable("LIVE_STREAMS_EPG");
        if (this.f22351h == null || serializable == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) serializable;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            String m15512j = ((XMLTVProgrammePojo) arrayList.get(i10)).m15512j();
            String[] split = m15512j.split("\\s+");
            Long.parseLong(((XMLTVProgrammePojo) arrayList.get(i10)).m15513k());
            Long.parseLong(((XMLTVProgrammePojo) arrayList.get(i10)).m15505c());
            ((XMLTVProgrammePojo) arrayList.get(i10)).m15514l();
            m15512j.split("\\s+");
            ((XMLTVProgrammePojo) arrayList.get(i10)).m15515m();
            ((XMLTVProgrammePojo) arrayList.get(i10)).m15504b();
            try {
                str = new SimpleDateFormat("dd MMM yyyy").format(new SimpleDateFormat("yyyy-MM-dd").parse(split[0]));
            } catch (ParseException e10) {
                e10.printStackTrace();
                str = "";
            }
            if (str != null && str.equals(this.f22351h)) {
                arrayList2.add(arrayList.get(i10));
            }
        }
        SubTVArchiveAdapter subTVArchiveAdapter = new SubTVArchiveAdapter(arrayList2, 0, false, this.f22351h, this.f22352i, this.f22353j, this.f22354k, this.f22355l, this.f22356m, this.f22357n, getContext());
        this.f22346c = subTVArchiveAdapter;
        this.myRecyclerView.setAdapter(subTVArchiveAdapter);
        m18179m(1);
    }

    /* renamed from: q */
    public final void m18181q() {
        this.f22348e = (Toolbar) getActivity().findViewById(2131429320);
    }
}

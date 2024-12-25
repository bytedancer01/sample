package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.R;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0243b;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.C0704c;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamCategoryIdDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.PasswordStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapterNewFlow;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.VodSubCatAdpaterNew;
import java.util.ArrayList;
import java.util.Iterator;
import nf.C6783a;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p151if.C5251a;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSecondSubCategories.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSecondSubCategories.class */
public class VodActivityNewFlowSecondSubCategories extends ActivityC0243b implements View.OnClickListener {

    /* renamed from: H */
    public static ArrayList<LiveStreamCategoryIdDBModel> f19426H = new ArrayList<>();

    /* renamed from: I */
    public static ArrayList<LiveStreamCategoryIdDBModel> f19427I = new ArrayList<>();

    /* renamed from: J */
    public static ArrayList<LiveStreamCategoryIdDBModel> f19428J = new ArrayList<>();

    /* renamed from: K */
    public static ProgressBar f19429K;

    /* renamed from: A */
    public SharedPreferences.Editor f19430A;

    /* renamed from: B */
    public GridLayoutManager f19431B;

    /* renamed from: D */
    public ArrayList<PasswordStatusDBModel> f19433D;

    /* renamed from: E */
    public ArrayList<LiveStreamsDBModel> f19434E;

    /* renamed from: F */
    public ArrayList<LiveStreamsDBModel> f19435F;

    /* renamed from: G */
    public ArrayList<LiveStreamsDBModel> f19436G;

    @BindView
    public AppBarLayout appbarToolbar;

    /* renamed from: d */
    public Context f19437d;

    /* renamed from: e */
    public SharedPreferences f19438e;

    /* renamed from: i */
    public LiveStreamDBHandler f19442i;

    /* renamed from: k */
    public SearchView f19444k;

    /* renamed from: l */
    public ProgressDialog f19445l;

    @BindView
    public ImageView logo;

    @BindView
    public RecyclerView myRecyclerView;

    /* renamed from: p */
    public VodSubCatAdpaterNew f19449p;

    @BindView
    public ProgressBar pbLoader;

    /* renamed from: q */
    public SharedPreferences f19450q;

    /* renamed from: r */
    public SharedPreferences.Editor f19451r;

    @BindView
    public RelativeLayout rl_sub_cat;

    /* renamed from: s */
    public RecyclerView.AbstractC0685p f19452s;

    /* renamed from: t */
    public SharedPreferences f19453t;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tvNoRecordFound;

    @BindView
    public TextView tvNoStream;

    @BindView
    public TextView tvViewProvider;

    /* renamed from: u */
    public VodAdapter f19454u;

    @BindView
    public TextView vodCategoryName;

    /* renamed from: w */
    public VodAdapterNewFlow f19456w;

    /* renamed from: y */
    public PopupWindow f19458y;

    /* renamed from: z */
    public SharedPreferences f19459z;

    /* renamed from: f */
    public String f19439f = "";

    /* renamed from: g */
    public String f19440g = "";

    /* renamed from: h */
    public DatabaseUpdatedStatusDBModel f19441h = new DatabaseUpdatedStatusDBModel();

    /* renamed from: j */
    public DatabaseUpdatedStatusDBModel f19443j = new DatabaseUpdatedStatusDBModel();

    /* renamed from: m */
    public String f19446m = "";

    /* renamed from: n */
    public String f19447n = "";

    /* renamed from: o */
    public boolean f19448o = false;

    /* renamed from: v */
    public ArrayList<LiveStreamsDBModel> f19455v = new ArrayList<>();

    /* renamed from: x */
    public boolean f19457x = false;

    /* renamed from: C */
    public ArrayList<String> f19432C = new ArrayList<>();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSecondSubCategories$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSecondSubCategories$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSecondSubCategories$a.class */
    public class ViewOnClickListenerC3317a implements View.OnClickListener {

        /* renamed from: b */
        public final VodActivityNewFlowSecondSubCategories f19460b;

        public ViewOnClickListenerC3317a(VodActivityNewFlowSecondSubCategories vodActivityNewFlowSecondSubCategories) {
            this.f19460b = vodActivityNewFlowSecondSubCategories;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f19460b.f19458y.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSecondSubCategories$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSecondSubCategories$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSecondSubCategories$b.class */
    public class ViewOnClickListenerC3318b implements View.OnClickListener {

        /* renamed from: b */
        public final RadioGroup f19461b;

        /* renamed from: c */
        public final View f19462c;

        /* renamed from: d */
        public final VodActivityNewFlowSecondSubCategories f19463d;

        public ViewOnClickListenerC3318b(VodActivityNewFlowSecondSubCategories vodActivityNewFlowSecondSubCategories, RadioGroup radioGroup, View view) {
            this.f19463d = vodActivityNewFlowSecondSubCategories;
            this.f19461b = radioGroup;
            this.f19462c = view;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SharedPreferences.Editor editor;
            String str;
            RadioButton radioButton = (RadioButton) this.f19462c.findViewById(this.f19461b.getCheckedRadioButtonId());
            if (radioButton.getText().toString().equals(this.f19463d.getResources().getString(2132018611))) {
                editor = this.f19463d.f19430A;
                str = "1";
            } else if (radioButton.getText().toString().equals(this.f19463d.getResources().getString(2132018607))) {
                editor = this.f19463d.f19430A;
                str = "2";
            } else if (radioButton.getText().toString().equals(this.f19463d.getResources().getString(2132018615))) {
                editor = this.f19463d.f19430A;
                str = "3";
            } else {
                editor = this.f19463d.f19430A;
                str = "0";
            }
            editor.putString("sort", str);
            this.f19463d.f19430A.commit();
            VodActivityNewFlowSecondSubCategories vodActivityNewFlowSecondSubCategories = this.f19463d;
            vodActivityNewFlowSecondSubCategories.f19450q = vodActivityNewFlowSecondSubCategories.getSharedPreferences("listgridview", 0);
            VodActivityNewFlowSecondSubCategories vodActivityNewFlowSecondSubCategories2 = this.f19463d;
            vodActivityNewFlowSecondSubCategories2.f19451r = vodActivityNewFlowSecondSubCategories2.f19450q.edit();
            int i10 = this.f19463d.f19450q.getInt("vod", 0);
            C5251a.f30070v = i10;
            if (i10 == 1) {
                this.f19463d.m16918G0();
            } else {
                this.f19463d.m16917F0();
            }
            this.f19463d.f19458y.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSecondSubCategories$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSecondSubCategories$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSecondSubCategories$c.class */
    public class ViewOnClickListenerC3319c implements View.OnClickListener {

        /* renamed from: b */
        public final VodActivityNewFlowSecondSubCategories f19464b;

        public ViewOnClickListenerC3319c(VodActivityNewFlowSecondSubCategories vodActivityNewFlowSecondSubCategories) {
            this.f19464b = vodActivityNewFlowSecondSubCategories;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f19464b.f19437d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSecondSubCategories$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSecondSubCategories$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSecondSubCategories$d.class */
    public class DialogInterfaceOnClickListenerC3320d implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final VodActivityNewFlowSecondSubCategories f19465b;

        public DialogInterfaceOnClickListenerC3320d(VodActivityNewFlowSecondSubCategories vodActivityNewFlowSecondSubCategories) {
            this.f19465b = vodActivityNewFlowSecondSubCategories;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSecondSubCategories$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSecondSubCategories$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSecondSubCategories$e.class */
    public class DialogInterfaceOnClickListenerC3321e implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final VodActivityNewFlowSecondSubCategories f19466b;

        public DialogInterfaceOnClickListenerC3321e(VodActivityNewFlowSecondSubCategories vodActivityNewFlowSecondSubCategories) {
            this.f19466b = vodActivityNewFlowSecondSubCategories;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26211N(this.f19466b.f19437d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSecondSubCategories$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSecondSubCategories$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSecondSubCategories$f.class */
    public class C3322f implements SearchView.InterfaceC0282l {

        /* renamed from: a */
        public final VodActivityNewFlowSecondSubCategories f19467a;

        public C3322f(VodActivityNewFlowSecondSubCategories vodActivityNewFlowSecondSubCategories) {
            this.f19467a = vodActivityNewFlowSecondSubCategories;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextChange(String str) {
            TextView textView;
            this.f19467a.tvNoRecordFound.setVisibility(8);
            if (this.f19467a.f19449p == null || (textView = this.f19467a.tvNoStream) == null || textView.getVisibility() == 0) {
                return false;
            }
            this.f19467a.f19449p.m17614o0(str, this.f19467a.tvNoRecordFound);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSecondSubCategories$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSecondSubCategories$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSecondSubCategories$g.class */
    public class C3323g implements SearchView.InterfaceC0282l {

        /* renamed from: a */
        public final VodActivityNewFlowSecondSubCategories f19468a;

        public C3323g(VodActivityNewFlowSecondSubCategories vodActivityNewFlowSecondSubCategories) {
            this.f19468a = vodActivityNewFlowSecondSubCategories;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextChange(String str) {
            TextView textView;
            this.f19468a.tvNoRecordFound.setVisibility(8);
            if (this.f19468a.f19454u == null || (textView = this.f19468a.tvNoStream) == null || textView.getVisibility() == 0) {
                return false;
            }
            this.f19468a.f19454u.m17527s0(str, this.f19468a.tvNoRecordFound);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSecondSubCategories$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSecondSubCategories$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSecondSubCategories$h.class */
    public class DialogInterfaceOnClickListenerC3324h implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final VodActivityNewFlowSecondSubCategories f19469b;

        public DialogInterfaceOnClickListenerC3324h(VodActivityNewFlowSecondSubCategories vodActivityNewFlowSecondSubCategories) {
            this.f19469b = vodActivityNewFlowSecondSubCategories;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26210M(this.f19469b.f19437d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSecondSubCategories$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSecondSubCategories$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSecondSubCategories$i.class */
    public class DialogInterfaceOnClickListenerC3325i implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final VodActivityNewFlowSecondSubCategories f19470b;

        public DialogInterfaceOnClickListenerC3325i(VodActivityNewFlowSecondSubCategories vodActivityNewFlowSecondSubCategories) {
            this.f19470b = vodActivityNewFlowSecondSubCategories;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSecondSubCategories$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSecondSubCategories$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSecondSubCategories$j.class */
    public class DialogInterfaceOnClickListenerC3326j implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final VodActivityNewFlowSecondSubCategories f19471b;

        public DialogInterfaceOnClickListenerC3326j(VodActivityNewFlowSecondSubCategories vodActivityNewFlowSecondSubCategories) {
            this.f19471b = vodActivityNewFlowSecondSubCategories;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSecondSubCategories$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSecondSubCategories$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSecondSubCategories$k.class */
    public class DialogInterfaceOnClickListenerC3327k implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final VodActivityNewFlowSecondSubCategories f19472b;

        public DialogInterfaceOnClickListenerC3327k(VodActivityNewFlowSecondSubCategories vodActivityNewFlowSecondSubCategories) {
            this.f19472b = vodActivityNewFlowSecondSubCategories;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* renamed from: B0 */
    public final void m16913B0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00f0 A[Catch: NullPointerException | Exception -> 0x01f0, NullPointerException | Exception -> 0x01f0, TryCatch #0 {NullPointerException | Exception -> 0x01f0, blocks: (B:2:0x0000, B:2:0x0000, B:5:0x0031, B:5:0x0031, B:7:0x0050, B:7:0x0050, B:9:0x0057, B:9:0x0057, B:11:0x0083, B:11:0x0083, B:12:0x00e9, B:12:0x00e9, B:14:0x00f0, B:14:0x00f0, B:18:0x0159, B:18:0x0159, B:20:0x0167, B:20:0x0167, B:22:0x0172, B:22:0x0172, B:24:0x0182, B:24:0x0182, B:26:0x018e, B:26:0x018e, B:28:0x0195, B:28:0x0195, B:30:0x019c, B:30:0x019c, B:32:0x01a5, B:32:0x01a5, B:33:0x01a9, B:33:0x01a9, B:33:0x01a9, B:33:0x01a9, B:34:0x01ac, B:34:0x01ac, B:35:0x01c7, B:35:0x01c7, B:37:0x01d0, B:37:0x01d0, B:39:0x01d5, B:39:0x01d5, B:41:0x01dd, B:41:0x01dd, B:42:0x017c, B:42:0x017c, B:44:0x01e3, B:44:0x01e3, B:46:0x01eb, B:46:0x01eb, B:51:0x008a, B:51:0x008a, B:53:0x00a9, B:55:0x00b0), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01eb A[Catch: NullPointerException | Exception -> 0x01f0, NullPointerException | Exception -> 0x01f0, TRY_ENTER, TryCatch #0 {NullPointerException | Exception -> 0x01f0, blocks: (B:2:0x0000, B:2:0x0000, B:5:0x0031, B:5:0x0031, B:7:0x0050, B:7:0x0050, B:9:0x0057, B:9:0x0057, B:11:0x0083, B:11:0x0083, B:12:0x00e9, B:12:0x00e9, B:14:0x00f0, B:14:0x00f0, B:18:0x0159, B:18:0x0159, B:20:0x0167, B:20:0x0167, B:22:0x0172, B:22:0x0172, B:24:0x0182, B:24:0x0182, B:26:0x018e, B:26:0x018e, B:28:0x0195, B:28:0x0195, B:30:0x019c, B:30:0x019c, B:32:0x01a5, B:32:0x01a5, B:33:0x01a9, B:33:0x01a9, B:33:0x01a9, B:33:0x01a9, B:34:0x01ac, B:34:0x01ac, B:35:0x01c7, B:35:0x01c7, B:37:0x01d0, B:37:0x01d0, B:39:0x01d5, B:39:0x01d5, B:41:0x01dd, B:41:0x01dd, B:42:0x017c, B:42:0x017c, B:44:0x01e3, B:44:0x01e3, B:46:0x01eb, B:46:0x01eb, B:51:0x008a, B:51:0x008a, B:53:0x00a9, B:55:0x00b0), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* renamed from: C0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m16914C0() {
        /*
            Method dump skipped, instructions count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSecondSubCategories.m16914C0():void");
    }

    /* renamed from: D0 */
    public final ArrayList<String> m16915D0() {
        ArrayList<PasswordStatusDBModel> m15232m1 = this.f19442i.m15232m1(SharepreferenceDBHandler.m15337A(this.f19437d));
        this.f19433D = m15232m1;
        if (m15232m1 != null) {
            Iterator<PasswordStatusDBModel> it = m15232m1.iterator();
            while (it.hasNext()) {
                PasswordStatusDBModel next = it.next();
                if (next.m15290a().equals("1")) {
                    this.f19432C.add(next.m15291b());
                }
            }
        }
        return this.f19432C;
    }

    /* renamed from: E0 */
    public final ArrayList<LiveStreamsDBModel> m16916E0(ArrayList<LiveStreamsDBModel> arrayList, ArrayList<String> arrayList2) {
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
                if (!z10 && (arrayList3 = this.f19434E) != null) {
                    arrayList3.add(next);
                }
            }
        }
        return this.f19434E;
    }

    /* renamed from: F0 */
    public final void m16917F0() {
        this.f19437d = this;
        this.f19442i = new LiveStreamDBHandler(this.f19437d);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f19437d == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f19437d, C5255e.m26257x(this.f19437d) + 1);
        this.f19452s = gridLayoutManager;
        this.myRecyclerView.setLayoutManager(gridLayoutManager);
        this.myRecyclerView.setItemAnimator(new C0704c());
        SharedPreferences sharedPreferences = this.f19437d.getSharedPreferences("loginPrefs", 0);
        this.f19453t = sharedPreferences;
        sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        this.f19453t.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        m16921J0();
    }

    /* renamed from: G0 */
    public final void m16918G0() {
        this.f19437d = this;
        this.f19442i = new LiveStreamDBHandler(this.f19437d);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f19437d == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f19437d);
        this.f19452s = linearLayoutManager;
        this.myRecyclerView.setLayoutManager(linearLayoutManager);
        this.myRecyclerView.setItemAnimator(new C0704c());
        SharedPreferences sharedPreferences = this.f19437d.getSharedPreferences("loginPrefs", 0);
        this.f19453t = sharedPreferences;
        sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        this.f19453t.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        m16921J0();
    }

    /* renamed from: H0 */
    public final void m16919H0(ArrayList<LiveStreamCategoryIdDBModel> arrayList) {
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f19437d == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        this.f19431B = new C6783a(this.f19437d).m31288z().equals(C5251a.f30065s0) ? new GridLayoutManager(this, 2) : new GridLayoutManager(this, 2);
        this.myRecyclerView.setLayoutManager(this.f19431B);
        this.myRecyclerView.setHasFixedSize(true);
        m16924b();
        VodSubCatAdpaterNew vodSubCatAdpaterNew = new VodSubCatAdpaterNew(arrayList, this.f19437d, this.f19442i);
        this.f19449p = vodSubCatAdpaterNew;
        this.myRecyclerView.setAdapter(vodSubCatAdpaterNew);
    }

    /* renamed from: I0 */
    public final void m16920I0(ArrayList<LiveStreamCategoryIdDBModel> arrayList) {
        m16919H0(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x010c, code lost:
    
        if (r7 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x010f, code lost:
    
        r7.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x016a, code lost:
    
        if (r7 != null) goto L33;
     */
    /* renamed from: J0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m16921J0() {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSecondSubCategories.m16921J0():void");
    }

    /* renamed from: K0 */
    public final void m16922K0(Activity activity) {
        try {
            View inflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(2131624516, (RelativeLayout) activity.findViewById(2131429032));
            PopupWindow popupWindow = new PopupWindow(activity);
            this.f19458y = popupWindow;
            popupWindow.setContentView(inflate);
            this.f19458y.setWidth(-1);
            this.f19458y.setHeight(-1);
            this.f19458y.setFocusable(true);
            this.f19458y.showAtLocation(inflate, 17, 0, 0);
            Button button = (Button) inflate.findViewById(2131427623);
            Button button2 = (Button) inflate.findViewById(2131427605);
            RadioGroup radioGroup = (RadioGroup) inflate.findViewById(2131428935);
            RadioButton radioButton = (RadioButton) inflate.findViewById(2131428909);
            RadioButton radioButton2 = (RadioButton) inflate.findViewById(2131428903);
            RadioButton radioButton3 = (RadioButton) inflate.findViewById(2131428897);
            RadioButton radioButton4 = (RadioButton) inflate.findViewById(2131428916);
            String string = this.f19459z.getString("sort", "");
            if (string.equals("1")) {
                radioButton2.setChecked(true);
            } else if (string.equals("2")) {
                radioButton3.setChecked(true);
            } else if (string.equals("3")) {
                radioButton4.setChecked(true);
            } else {
                radioButton.setChecked(true);
            }
            button2.setOnClickListener(new ViewOnClickListenerC3317a(this));
            button.setOnClickListener(new ViewOnClickListenerC3318b(this, radioGroup, inflate));
        } catch (NullPointerException | Exception e10) {
        }
    }

    /* renamed from: a */
    public void m16923a() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    /* renamed from: b */
    public void m16924b() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ProgressBar progressBar;
        VodAdapterNewFlow vodAdapterNewFlow = this.f19456w;
        if (vodAdapterNewFlow != null && (progressBar = f19429K) != null) {
            vodAdapterNewFlow.m17558r0(progressBar);
        }
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView != null) {
            recyclerView.setClickable(true);
        }
        super.onBackPressed();
        overridePendingTransition(2130772003, 2130772000);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != 2131429468) {
            return;
        }
        startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("sort", 0);
        this.f19459z = sharedPreferences;
        this.f19430A = sharedPreferences.edit();
        if (this.f19459z.getString("sort", "").equals("")) {
            this.f19430A.putString("sort", "0");
            this.f19430A.commit();
        }
        Intent intent = getIntent();
        if (intent != null) {
            this.f19446m = intent.getStringExtra("category_id");
            this.f19447n = intent.getStringExtra("category_name");
        }
        this.f19437d = this;
        this.f19456w = new VodAdapterNewFlow();
        this.logo.setOnClickListener(new ViewOnClickListenerC3319c(this));
        LiveStreamDBHandler liveStreamDBHandler = new LiveStreamDBHandler(this.f19437d);
        this.f19442i = liveStreamDBHandler;
        f19427I = liveStreamDBHandler.m15223i1(this.f19446m);
        setContentView(2131624100);
        ButterKnife.m5626a(this);
        m16923a();
        this.f19457x = true;
        m16920I0(f19427I);
        overridePendingTransition(2130772003, 2130772000);
        AppBarLayout appBarLayout = this.appbarToolbar;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(2131230844));
        }
        m16913B0();
        m878n0((Toolbar) findViewById(2131429320));
        this.f19437d = this;
        if (!this.f19447n.isEmpty()) {
            this.vodCategoryName.setText(this.f19447n);
        }
        this.vodCategoryName.setSelected(true);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Toolbar toolbar;
        int i10;
        super.onCreateOptionsMenu(menu);
        if (this.f19457x) {
            toolbar = this.toolbar;
            i10 = 2131689495;
        } else {
            toolbar = this.toolbar;
            i10 = 2131689497;
        }
        toolbar.m1224x(i10);
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i11 = 0; i11 < this.toolbar.getChildCount(); i11++) {
            if (this.toolbar.getChildAt(i11) instanceof ActionMenuView) {
                ((Toolbar.C0292e) this.toolbar.getChildAt(i11).getLayoutParams()).f26228a = 16;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0287, code lost:
    
        if (r0.size() > 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x02fb, code lost:
    
        if (r0.size() > 0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0305  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onOptionsItemSelected(android.view.MenuItem r7) {
        /*
            Method dump skipped, instructions count: 784
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSecondSubCategories.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        C5255e.m26233f(this.f19437d);
        getWindow().setFlags(1024, 1024);
        this.f19456w.m17558r0(f19429K);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f19438e = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f19438e.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f19437d != null) {
            m16924b();
        }
    }
}

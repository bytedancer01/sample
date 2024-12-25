package com.maxdigitall.maxdigitaliptvbox.view.adapter;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamCategoryIdDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.PasswordStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.activity.ParentalControlActivitity;
import java.util.ArrayList;
import java.util.Iterator;
import p151if.C5255e;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ParentalControlVODCatAdapter.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ParentalControlVODCatAdapter.class */
public class ParentalControlVODCatAdapter extends RecyclerView.AbstractC0677h<ViewHolder> {

    /* renamed from: e */
    public Typeface f20228e;

    /* renamed from: f */
    public ArrayList<LiveStreamCategoryIdDBModel> f20229f;

    /* renamed from: g */
    public ArrayList<LiveStreamCategoryIdDBModel> f20230g;

    /* renamed from: h */
    public ArrayList<LiveStreamCategoryIdDBModel> f20231h;

    /* renamed from: i */
    public ParentalControlActivitity f20232i;

    /* renamed from: j */
    public ViewHolder f20233j;

    /* renamed from: k */
    public Context f20234k;

    /* renamed from: l */
    public String f20235l;

    /* renamed from: m */
    public SharedPreferences f20236m;

    /* renamed from: n */
    public LiveStreamDBHandler f20237n;

    /* renamed from: o */
    public PasswordStatusDBModel f20238o;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ParentalControlVODCatAdapter$ViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ParentalControlVODCatAdapter$ViewHolder.class */
    public class ViewHolder extends RecyclerView.AbstractC0674e0 {

        @BindView
        public TextView categoryNameTV;

        @BindView
        public RelativeLayout categoryRL;

        @BindView
        public RelativeLayout categoryRL1;

        @BindView
        public ImageView lockIV;

        /* renamed from: u */
        public final ParentalControlVODCatAdapter f20239u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ParentalControlVODCatAdapter parentalControlVODCatAdapter, View view) {
            super(view);
            this.f20239u = parentalControlVODCatAdapter;
            ButterKnife.m5627b(this, view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ParentalControlVODCatAdapter$ViewHolder_ViewBinding.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ParentalControlVODCatAdapter$ViewHolder_ViewBinding.class */
    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: b */
        public ViewHolder f20240b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f20240b = viewHolder;
            viewHolder.categoryNameTV = (TextView) C8522c.m36739c(view, 2131429382, "field 'categoryNameTV'", TextView.class);
            viewHolder.categoryRL = (RelativeLayout) C8522c.m36739c(view, 2131428964, "field 'categoryRL'", RelativeLayout.class);
            viewHolder.categoryRL1 = (RelativeLayout) C8522c.m36739c(view, 2131428965, "field 'categoryRL1'", RelativeLayout.class);
            viewHolder.lockIV = (ImageView) C8522c.m36739c(view, 2131428193, "field 'lockIV'", ImageView.class);
        }

        @Override // butterknife.Unbinder
        /* renamed from: a */
        public void mo5629a() {
            ViewHolder viewHolder = this.f20240b;
            if (viewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f20240b = null;
            viewHolder.categoryNameTV = null;
            viewHolder.categoryRL = null;
            viewHolder.categoryRL1 = null;
            viewHolder.lockIV = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ParentalControlVODCatAdapter$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.ParentalControlVODCatAdapter$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ParentalControlVODCatAdapter$a.class */
    public class ViewOnClickListenerC3449a implements View.OnClickListener {

        /* renamed from: b */
        public final String f20241b;

        /* renamed from: c */
        public final ViewHolder f20242c;

        /* renamed from: d */
        public final String f20243d;

        /* renamed from: e */
        public final ParentalControlVODCatAdapter f20244e;

        public ViewOnClickListenerC3449a(ParentalControlVODCatAdapter parentalControlVODCatAdapter, String str, ViewHolder viewHolder, String str2) {
            this.f20244e = parentalControlVODCatAdapter;
            this.f20241b = str;
            this.f20242c = viewHolder;
            this.f20243d = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i10;
            Context context;
            StringBuilder sb2;
            Context context2;
            Resources resources;
            ParentalControlVODCatAdapter parentalControlVODCatAdapter = this.f20244e;
            parentalControlVODCatAdapter.f20238o = parentalControlVODCatAdapter.f20237n.m15191S1(this.f20244e.f20235l, this.f20241b, SharepreferenceDBHandler.m15337A(this.f20244e.f20234k));
            if (this.f20244e.f20238o == null || this.f20244e.f20238o.m15290a() == null || !this.f20244e.f20238o.m15290a().equals("1")) {
                i10 = 2132017973;
                if (this.f20244e.f20238o != null && this.f20244e.f20238o.m15290a() != null && this.f20244e.f20238o.m15290a().equals("0")) {
                    this.f20242c.lockIV.setImageResource(2131231552);
                    this.f20244e.f20237n.m15167G2(this.f20244e.f20235l, this.f20241b, "1", SharepreferenceDBHandler.m15337A(this.f20244e.f20234k));
                    if (this.f20244e.f20234k == null) {
                        return;
                    }
                    context = this.f20244e.f20234k;
                    sb2 = new StringBuilder();
                } else {
                    if (this.f20244e.f20238o == null) {
                        return;
                    }
                    this.f20244e.f20238o.m15296g(this.f20241b);
                    this.f20244e.f20238o.m15297h(this.f20244e.f20235l);
                    this.f20244e.f20238o.m15295f("1");
                    this.f20244e.f20238o.m15298i(SharepreferenceDBHandler.m15337A(this.f20244e.f20234k));
                    this.f20244e.f20237n.m15150B0(this.f20244e.f20238o);
                    this.f20242c.lockIV.setImageResource(2131231552);
                    if (this.f20244e.f20234k == null) {
                        return;
                    }
                    context = this.f20244e.f20234k;
                    sb2 = new StringBuilder();
                }
                context2 = context;
                resources = this.f20244e.f20234k.getResources();
            } else {
                this.f20242c.lockIV.setImageResource(2131231554);
                this.f20244e.f20237n.m15167G2(this.f20244e.f20235l, this.f20241b, "0", SharepreferenceDBHandler.m15337A(this.f20244e.f20234k));
                if (this.f20244e.f20234k == null) {
                    return;
                }
                context2 = this.f20244e.f20234k;
                sb2 = new StringBuilder();
                resources = this.f20244e.f20234k.getResources();
                i10 = 2132018740;
            }
            sb2.append(resources.getString(i10));
            sb2.append(" ");
            sb2.append(this.f20243d);
            C5255e.m26241k0(context2, sb2.toString());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ParentalControlVODCatAdapter$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.ParentalControlVODCatAdapter$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ParentalControlVODCatAdapter$b.class */
    public class ViewOnKeyListenerC3450b implements View.OnKeyListener {

        /* renamed from: b */
        public final ViewHolder f20245b;

        /* renamed from: c */
        public final ParentalControlVODCatAdapter f20246c;

        public ViewOnKeyListenerC3450b(ParentalControlVODCatAdapter parentalControlVODCatAdapter, ViewHolder viewHolder) {
            this.f20246c = parentalControlVODCatAdapter;
            this.f20245b = viewHolder;
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            if (i10 != 23 && i10 != 66) {
                return false;
            }
            this.f20245b.categoryRL.performClick();
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ParentalControlVODCatAdapter$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.ParentalControlVODCatAdapter$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ParentalControlVODCatAdapter$c.class */
    public class RunnableC3451c implements Runnable {

        /* renamed from: b */
        public final String f20247b;

        /* renamed from: c */
        public final TextView f20248c;

        /* renamed from: d */
        public final ParentalControlVODCatAdapter f20249d;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ParentalControlVODCatAdapter$c$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.ParentalControlVODCatAdapter$c$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ParentalControlVODCatAdapter$c$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final RunnableC3451c f20250b;

            public a(RunnableC3451c runnableC3451c) {
                this.f20250b = runnableC3451c;
            }

            @Override // java.lang.Runnable
            public void run() {
                ParentalControlVODCatAdapter parentalControlVODCatAdapter;
                ArrayList arrayList;
                if (!TextUtils.isEmpty(this.f20250b.f20247b)) {
                    if (this.f20250b.f20249d.f20230g.size() == 0) {
                        ParentalControlVODCatAdapter parentalControlVODCatAdapter2 = this.f20250b.f20249d;
                        parentalControlVODCatAdapter2.f20229f = parentalControlVODCatAdapter2.f20230g;
                        this.f20250b.f20248c.setVisibility(0);
                        if (this.f20250b.f20249d.f20234k != null) {
                            RunnableC3451c runnableC3451c = this.f20250b;
                            runnableC3451c.f20248c.setText(runnableC3451c.f20249d.f20234k.getResources().getString(2132018219));
                        }
                    } else if (!this.f20250b.f20249d.f20230g.isEmpty() || this.f20250b.f20249d.f20230g.isEmpty()) {
                        parentalControlVODCatAdapter = this.f20250b.f20249d;
                        arrayList = parentalControlVODCatAdapter.f20230g;
                    }
                    this.f20250b.f20249d.m4099w();
                }
                parentalControlVODCatAdapter = this.f20250b.f20249d;
                arrayList = parentalControlVODCatAdapter.f20231h;
                parentalControlVODCatAdapter.f20229f = arrayList;
                this.f20250b.f20248c.setVisibility(4);
                this.f20250b.f20249d.m4099w();
            }
        }

        public RunnableC3451c(ParentalControlVODCatAdapter parentalControlVODCatAdapter, String str, TextView textView) {
            this.f20249d = parentalControlVODCatAdapter;
            this.f20247b = str;
            this.f20248c = textView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20249d.f20230g = new ArrayList();
            if (this.f20249d.f20230g != null) {
                this.f20249d.f20230g.clear();
            }
            if (TextUtils.isEmpty(this.f20247b)) {
                this.f20249d.f20230g.addAll(this.f20249d.f20231h);
            } else {
                Iterator it = this.f20249d.f20231h.iterator();
                while (it.hasNext()) {
                    LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = (LiveStreamCategoryIdDBModel) it.next();
                    if (liveStreamCategoryIdDBModel.m14788c().toLowerCase().contains(this.f20247b.toLowerCase())) {
                        this.f20249d.f20230g.add(liveStreamCategoryIdDBModel);
                    }
                }
            }
            ((Activity) this.f20249d.f20234k).runOnUiThread(new a(this));
        }
    }

    public ParentalControlVODCatAdapter(ArrayList<LiveStreamCategoryIdDBModel> arrayList, Context context, ParentalControlActivitity parentalControlActivitity, Typeface typeface) {
        this.f20235l = "";
        this.f20229f = arrayList;
        this.f20234k = context;
        this.f20232i = parentalControlActivitity;
        this.f20228e = typeface;
        this.f20231h = arrayList;
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("loginPrefs", 0);
            this.f20236m = sharedPreferences;
            this.f20235l = sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
            this.f20237n = new LiveStreamDBHandler(context);
            this.f20238o = new PasswordStatusDBModel();
        }
    }

    /* renamed from: m0 */
    public void m17310m0(String str, TextView textView, ProgressDialog progressDialog) {
        new Thread(new RunnableC3451c(this, str, textView)).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        return this.f20229f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public void mo2996G(ViewHolder viewHolder, int i10) {
        ArrayList<LiveStreamCategoryIdDBModel> arrayList = this.f20229f;
        if (arrayList != null) {
            LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = arrayList.get(i10);
            String m14787b = liveStreamCategoryIdDBModel.m14787b();
            String m14788c = liveStreamCategoryIdDBModel.m14788c();
            m17313p0(viewHolder, m14787b);
            viewHolder.categoryNameTV.setText(liveStreamCategoryIdDBModel.m14788c());
            viewHolder.categoryRL.setOnClickListener(new ViewOnClickListenerC3449a(this, m14787b, viewHolder, m14788c));
        }
        viewHolder.categoryRL1.setOnKeyListener(new ViewOnKeyListenerC3450b(this, viewHolder));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public ViewHolder mo2998J(ViewGroup viewGroup, int i10) {
        ViewHolder viewHolder = new ViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(2131624239, viewGroup, false));
        this.f20233j = viewHolder;
        return viewHolder;
    }

    /* renamed from: p0 */
    public final void m17313p0(ViewHolder viewHolder, String str) {
        this.f20237n.m15232m1(SharepreferenceDBHandler.m15337A(this.f20234k));
        this.f20238o = this.f20237n.m15191S1(this.f20235l, str, SharepreferenceDBHandler.m15337A(this.f20234k));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 21) {
            viewHolder.lockIV.setImageResource(2131231554);
        }
        viewHolder.lockIV.setImageDrawable(this.f20234k.getResources().getDrawable(2131231554, null));
        PasswordStatusDBModel passwordStatusDBModel = this.f20238o;
        if (passwordStatusDBModel == null || passwordStatusDBModel.m15290a() == null || !this.f20238o.m15290a().equals("1")) {
            return;
        }
        if (i10 <= 21) {
            viewHolder.lockIV.setImageResource(2131231552);
        }
        viewHolder.lockIV.setImageDrawable(this.f20234k.getResources().getDrawable(2131231552, null));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: q */
    public int mo3018q(int i10) {
        return 0;
    }
}

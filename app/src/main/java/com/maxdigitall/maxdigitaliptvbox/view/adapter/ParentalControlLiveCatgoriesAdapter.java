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
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ParentalControlLiveCatgoriesAdapter.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ParentalControlLiveCatgoriesAdapter.class */
public class ParentalControlLiveCatgoriesAdapter extends RecyclerView.AbstractC0677h<ViewHolder> {

    /* renamed from: e */
    public Typeface f20205e;

    /* renamed from: f */
    public ArrayList<LiveStreamCategoryIdDBModel> f20206f;

    /* renamed from: g */
    public ArrayList<LiveStreamCategoryIdDBModel> f20207g;

    /* renamed from: h */
    public ArrayList<LiveStreamCategoryIdDBModel> f20208h;

    /* renamed from: i */
    public ParentalControlActivitity f20209i;

    /* renamed from: j */
    public ViewHolder f20210j;

    /* renamed from: k */
    public Context f20211k;

    /* renamed from: l */
    public String f20212l;

    /* renamed from: m */
    public SharedPreferences f20213m;

    /* renamed from: n */
    public LiveStreamDBHandler f20214n;

    /* renamed from: o */
    public PasswordStatusDBModel f20215o;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ParentalControlLiveCatgoriesAdapter$ViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ParentalControlLiveCatgoriesAdapter$ViewHolder.class */
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
        public final ParentalControlLiveCatgoriesAdapter f20216u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ParentalControlLiveCatgoriesAdapter parentalControlLiveCatgoriesAdapter, View view) {
            super(view);
            this.f20216u = parentalControlLiveCatgoriesAdapter;
            ButterKnife.m5627b(this, view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ParentalControlLiveCatgoriesAdapter$ViewHolder_ViewBinding.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ParentalControlLiveCatgoriesAdapter$ViewHolder_ViewBinding.class */
    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: b */
        public ViewHolder f20217b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f20217b = viewHolder;
            viewHolder.categoryNameTV = (TextView) C8522c.m36739c(view, 2131429382, "field 'categoryNameTV'", TextView.class);
            viewHolder.categoryRL = (RelativeLayout) C8522c.m36739c(view, 2131428964, "field 'categoryRL'", RelativeLayout.class);
            viewHolder.categoryRL1 = (RelativeLayout) C8522c.m36739c(view, 2131428965, "field 'categoryRL1'", RelativeLayout.class);
            viewHolder.lockIV = (ImageView) C8522c.m36739c(view, 2131428193, "field 'lockIV'", ImageView.class);
        }

        @Override // butterknife.Unbinder
        /* renamed from: a */
        public void mo5629a() {
            ViewHolder viewHolder = this.f20217b;
            if (viewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f20217b = null;
            viewHolder.categoryNameTV = null;
            viewHolder.categoryRL = null;
            viewHolder.categoryRL1 = null;
            viewHolder.lockIV = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ParentalControlLiveCatgoriesAdapter$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.ParentalControlLiveCatgoriesAdapter$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ParentalControlLiveCatgoriesAdapter$a.class */
    public class ViewOnClickListenerC3446a implements View.OnClickListener {

        /* renamed from: b */
        public final String f20218b;

        /* renamed from: c */
        public final ViewHolder f20219c;

        /* renamed from: d */
        public final String f20220d;

        /* renamed from: e */
        public final ParentalControlLiveCatgoriesAdapter f20221e;

        public ViewOnClickListenerC3446a(ParentalControlLiveCatgoriesAdapter parentalControlLiveCatgoriesAdapter, String str, ViewHolder viewHolder, String str2) {
            this.f20221e = parentalControlLiveCatgoriesAdapter;
            this.f20218b = str;
            this.f20219c = viewHolder;
            this.f20220d = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i10;
            Context context;
            StringBuilder sb2;
            Context context2;
            Resources resources;
            ParentalControlLiveCatgoriesAdapter parentalControlLiveCatgoriesAdapter = this.f20221e;
            parentalControlLiveCatgoriesAdapter.f20215o = parentalControlLiveCatgoriesAdapter.f20214n.m15191S1(this.f20221e.f20212l, this.f20218b, SharepreferenceDBHandler.m15337A(this.f20221e.f20211k));
            if (this.f20221e.f20215o == null || this.f20221e.f20215o.m15290a() == null || !this.f20221e.f20215o.m15290a().equals("1")) {
                i10 = 2132017973;
                if (this.f20221e.f20215o != null && this.f20221e.f20215o.m15290a() != null && this.f20221e.f20215o.m15290a().equals("0")) {
                    this.f20219c.lockIV.setImageResource(2131231552);
                    this.f20221e.f20214n.m15167G2(this.f20221e.f20212l, this.f20218b, "1", SharepreferenceDBHandler.m15337A(this.f20221e.f20211k));
                    if (this.f20221e.f20211k == null) {
                        return;
                    }
                    context = this.f20221e.f20211k;
                    sb2 = new StringBuilder();
                } else {
                    if (this.f20221e.f20215o == null) {
                        return;
                    }
                    this.f20221e.f20215o.m15296g(this.f20218b);
                    this.f20221e.f20215o.m15297h(this.f20221e.f20212l);
                    this.f20221e.f20215o.m15295f("1");
                    this.f20221e.f20215o.m15298i(SharepreferenceDBHandler.m15337A(this.f20221e.f20211k));
                    this.f20221e.f20214n.m15150B0(this.f20221e.f20215o);
                    this.f20219c.lockIV.setImageResource(2131231552);
                    if (this.f20221e.f20211k == null) {
                        return;
                    }
                    context = this.f20221e.f20211k;
                    sb2 = new StringBuilder();
                }
                context2 = context;
                resources = this.f20221e.f20211k.getResources();
            } else {
                this.f20219c.lockIV.setImageResource(2131231554);
                this.f20221e.f20214n.m15167G2(this.f20221e.f20212l, this.f20218b, "0", SharepreferenceDBHandler.m15337A(this.f20221e.f20211k));
                if (this.f20221e.f20211k == null) {
                    return;
                }
                context2 = this.f20221e.f20211k;
                sb2 = new StringBuilder();
                resources = this.f20221e.f20211k.getResources();
                i10 = 2132018740;
            }
            sb2.append(resources.getString(i10));
            sb2.append(" ");
            sb2.append(this.f20220d);
            C5255e.m26241k0(context2, sb2.toString());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ParentalControlLiveCatgoriesAdapter$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.ParentalControlLiveCatgoriesAdapter$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ParentalControlLiveCatgoriesAdapter$b.class */
    public class ViewOnKeyListenerC3447b implements View.OnKeyListener {

        /* renamed from: b */
        public final ViewHolder f20222b;

        /* renamed from: c */
        public final ParentalControlLiveCatgoriesAdapter f20223c;

        public ViewOnKeyListenerC3447b(ParentalControlLiveCatgoriesAdapter parentalControlLiveCatgoriesAdapter, ViewHolder viewHolder) {
            this.f20223c = parentalControlLiveCatgoriesAdapter;
            this.f20222b = viewHolder;
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            if (i10 != 23 && i10 != 66) {
                return false;
            }
            this.f20222b.categoryRL.performClick();
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ParentalControlLiveCatgoriesAdapter$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.ParentalControlLiveCatgoriesAdapter$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ParentalControlLiveCatgoriesAdapter$c.class */
    public class RunnableC3448c implements Runnable {

        /* renamed from: b */
        public final String f20224b;

        /* renamed from: c */
        public final TextView f20225c;

        /* renamed from: d */
        public final ParentalControlLiveCatgoriesAdapter f20226d;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ParentalControlLiveCatgoriesAdapter$c$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.ParentalControlLiveCatgoriesAdapter$c$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ParentalControlLiveCatgoriesAdapter$c$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final RunnableC3448c f20227b;

            public a(RunnableC3448c runnableC3448c) {
                this.f20227b = runnableC3448c;
            }

            @Override // java.lang.Runnable
            public void run() {
                ParentalControlLiveCatgoriesAdapter parentalControlLiveCatgoriesAdapter;
                ArrayList arrayList;
                if (!TextUtils.isEmpty(this.f20227b.f20224b)) {
                    if (this.f20227b.f20226d.f20207g.size() == 0) {
                        ParentalControlLiveCatgoriesAdapter parentalControlLiveCatgoriesAdapter2 = this.f20227b.f20226d;
                        parentalControlLiveCatgoriesAdapter2.f20206f = parentalControlLiveCatgoriesAdapter2.f20207g;
                        this.f20227b.f20225c.setVisibility(0);
                        if (this.f20227b.f20226d.f20211k != null) {
                            RunnableC3448c runnableC3448c = this.f20227b;
                            runnableC3448c.f20225c.setText(runnableC3448c.f20226d.f20211k.getResources().getString(2132018219));
                        }
                    } else if (!this.f20227b.f20226d.f20207g.isEmpty() || this.f20227b.f20226d.f20207g.isEmpty()) {
                        parentalControlLiveCatgoriesAdapter = this.f20227b.f20226d;
                        arrayList = parentalControlLiveCatgoriesAdapter.f20207g;
                    }
                    this.f20227b.f20226d.m4099w();
                }
                parentalControlLiveCatgoriesAdapter = this.f20227b.f20226d;
                arrayList = parentalControlLiveCatgoriesAdapter.f20208h;
                parentalControlLiveCatgoriesAdapter.f20206f = arrayList;
                this.f20227b.f20225c.setVisibility(4);
                this.f20227b.f20226d.m4099w();
            }
        }

        public RunnableC3448c(ParentalControlLiveCatgoriesAdapter parentalControlLiveCatgoriesAdapter, String str, TextView textView) {
            this.f20226d = parentalControlLiveCatgoriesAdapter;
            this.f20224b = str;
            this.f20225c = textView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20226d.f20207g = new ArrayList();
            if (this.f20226d.f20207g != null) {
                this.f20226d.f20207g.clear();
            }
            if (TextUtils.isEmpty(this.f20224b)) {
                this.f20226d.f20207g.addAll(this.f20226d.f20208h);
            } else {
                Iterator it = this.f20226d.f20208h.iterator();
                while (it.hasNext()) {
                    LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = (LiveStreamCategoryIdDBModel) it.next();
                    if (liveStreamCategoryIdDBModel.m14788c().toLowerCase().contains(this.f20224b.toLowerCase())) {
                        this.f20226d.f20207g.add(liveStreamCategoryIdDBModel);
                    }
                }
            }
            ((Activity) this.f20226d.f20211k).runOnUiThread(new a(this));
        }
    }

    public ParentalControlLiveCatgoriesAdapter(ArrayList<LiveStreamCategoryIdDBModel> arrayList, Context context, ParentalControlActivitity parentalControlActivitity, Typeface typeface) {
        this.f20212l = "";
        this.f20206f = arrayList;
        this.f20211k = context;
        this.f20209i = parentalControlActivitity;
        this.f20205e = typeface;
        this.f20208h = arrayList;
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("loginPrefs", 0);
            this.f20213m = sharedPreferences;
            this.f20212l = sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
            this.f20214n = new LiveStreamDBHandler(context);
            this.f20215o = new PasswordStatusDBModel();
        }
    }

    /* renamed from: m0 */
    public void m17297m0(String str, TextView textView, ProgressDialog progressDialog) {
        new Thread(new RunnableC3448c(this, str, textView)).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        return this.f20206f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public void mo2996G(ViewHolder viewHolder, int i10) {
        ArrayList<LiveStreamCategoryIdDBModel> arrayList = this.f20206f;
        if (arrayList != null) {
            LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = arrayList.get(i10);
            String m14787b = liveStreamCategoryIdDBModel.m14787b();
            String m14788c = liveStreamCategoryIdDBModel.m14788c();
            m17300p0(viewHolder, m14787b);
            viewHolder.categoryNameTV.setText(liveStreamCategoryIdDBModel.m14788c());
            viewHolder.categoryRL.setOnClickListener(new ViewOnClickListenerC3446a(this, m14787b, viewHolder, m14788c));
        }
        viewHolder.categoryRL1.setOnKeyListener(new ViewOnKeyListenerC3447b(this, viewHolder));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public ViewHolder mo2998J(ViewGroup viewGroup, int i10) {
        ViewHolder viewHolder = new ViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(2131624239, viewGroup, false));
        this.f20210j = viewHolder;
        return viewHolder;
    }

    /* renamed from: p0 */
    public final void m17300p0(ViewHolder viewHolder, String str) {
        this.f20214n.m15232m1(SharepreferenceDBHandler.m15337A(this.f20211k));
        this.f20215o = this.f20214n.m15191S1(this.f20212l, str, SharepreferenceDBHandler.m15337A(this.f20211k));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 21) {
            viewHolder.lockIV.setImageResource(2131231554);
        }
        viewHolder.lockIV.setImageDrawable(this.f20211k.getResources().getDrawable(2131231554, null));
        PasswordStatusDBModel passwordStatusDBModel = this.f20215o;
        if (passwordStatusDBModel == null || passwordStatusDBModel.m15290a() == null || !this.f20215o.m15290a().equals("1")) {
            return;
        }
        if (i10 <= 21) {
            viewHolder.lockIV.setImageResource(2131231552);
        }
        viewHolder.lockIV.setImageDrawable(this.f20211k.getResources().getDrawable(2131231552, null));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: q */
    public int mo3018q(int i10) {
        return 0;
    }
}

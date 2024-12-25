package com.maxdigitall.maxdigitaliptvbox.view.adapter;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamCategoryIdDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityLayout;
import com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSecondSubCategories;
import java.util.ArrayList;
import java.util.List;
import org.achartengine.renderer.DefaultRenderer;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodSubCatAdpaterNew.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodSubCatAdpaterNew.class */
public class VodSubCatAdpaterNew extends RecyclerView.AbstractC0677h<MyViewHolder> {

    /* renamed from: e */
    public List<LiveStreamCategoryIdDBModel> f21319e;

    /* renamed from: f */
    public Context f21320f;

    /* renamed from: g */
    public LiveStreamDBHandler f21321g;

    /* renamed from: h */
    public List<LiveStreamCategoryIdDBModel> f21322h;

    /* renamed from: i */
    public List<LiveStreamCategoryIdDBModel> f21323i;

    /* renamed from: j */
    public int f21324j;

    /* renamed from: k */
    public int f21325k;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodSubCatAdpaterNew$MyViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodSubCatAdpaterNew$MyViewHolder.class */
    public static class MyViewHolder extends RecyclerView.AbstractC0674e0 {

        @BindView
        public ImageView ivForawardArrow;

        @BindView
        public ImageView ivTvIcon;

        @BindView
        public ProgressBar pbPagingLoader;

        @BindView
        public RelativeLayout rlListOfCategories;

        @BindView
        public RelativeLayout rlOuter;

        @BindView
        public TextView tvMovieCategoryName;

        @BindView
        public TextView tvXubCount;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.m5627b(this, view);
            m4048L(false);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodSubCatAdpaterNew$MyViewHolder_ViewBinding.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodSubCatAdpaterNew$MyViewHolder_ViewBinding.class */
    public class MyViewHolder_ViewBinding implements Unbinder {

        /* renamed from: b */
        public MyViewHolder f21326b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f21326b = myViewHolder;
            myViewHolder.ivTvIcon = (ImageView) C8522c.m36739c(view, 2131428237, "field 'ivTvIcon'", ImageView.class);
            myViewHolder.tvMovieCategoryName = (TextView) C8522c.m36739c(view, 2131429513, "field 'tvMovieCategoryName'", TextView.class);
            myViewHolder.ivForawardArrow = (ImageView) C8522c.m36739c(view, 2131428181, "field 'ivForawardArrow'", ImageView.class);
            myViewHolder.pbPagingLoader = (ProgressBar) C8522c.m36739c(view, 2131428840, "field 'pbPagingLoader'", ProgressBar.class);
            myViewHolder.rlListOfCategories = (RelativeLayout) C8522c.m36739c(view, 2131429008, "field 'rlListOfCategories'", RelativeLayout.class);
            myViewHolder.rlOuter = (RelativeLayout) C8522c.m36739c(view, 2131429028, "field 'rlOuter'", RelativeLayout.class);
            myViewHolder.tvXubCount = (TextView) C8522c.m36739c(view, 2131429620, "field 'tvXubCount'", TextView.class);
        }

        @Override // butterknife.Unbinder
        /* renamed from: a */
        public void mo5629a() {
            MyViewHolder myViewHolder = this.f21326b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f21326b = null;
            myViewHolder.ivTvIcon = null;
            myViewHolder.tvMovieCategoryName = null;
            myViewHolder.ivForawardArrow = null;
            myViewHolder.pbPagingLoader = null;
            myViewHolder.rlListOfCategories = null;
            myViewHolder.rlOuter = null;
            myViewHolder.tvXubCount = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodSubCatAdpaterNew$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodSubCatAdpaterNew$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodSubCatAdpaterNew$a.class */
    public class ViewOnClickListenerC3576a implements View.OnClickListener {

        /* renamed from: b */
        public final MyViewHolder f21327b;

        /* renamed from: c */
        public final String f21328c;

        /* renamed from: d */
        public final String f21329d;

        /* renamed from: e */
        public final VodSubCatAdpaterNew f21330e;

        public ViewOnClickListenerC3576a(VodSubCatAdpaterNew vodSubCatAdpaterNew, MyViewHolder myViewHolder, String str, String str2) {
            this.f21330e = vodSubCatAdpaterNew;
            this.f21327b = myViewHolder;
            this.f21328c = str;
            this.f21329d = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            new VodActivityLayout().m16879E0(this.f21327b.pbPagingLoader);
            ProgressBar progressBar = this.f21327b.pbPagingLoader;
            if (progressBar != null) {
                progressBar.getIndeterminateDrawable().setColorFilter(DefaultRenderer.BACKGROUND_COLOR, PorterDuff.Mode.SRC_IN);
                this.f21327b.pbPagingLoader.setVisibility(0);
            }
            Intent intent = this.f21330e.f21321g.m15223i1(this.f21328c).size() > 0 ? new Intent(this.f21330e.f21320f, (Class<?>) VodActivityNewFlowSecondSubCategories.class) : new Intent(this.f21330e.f21320f, (Class<?>) VodActivityLayout.class);
            intent.putExtra("category_id", this.f21328c);
            intent.putExtra("category_name", this.f21329d);
            this.f21330e.f21320f.startActivity(intent);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodSubCatAdpaterNew$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodSubCatAdpaterNew$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodSubCatAdpaterNew$b.class */
    public class RunnableC3577b implements Runnable {

        /* renamed from: b */
        public final String f21331b;

        /* renamed from: c */
        public final TextView f21332c;

        /* renamed from: d */
        public final VodSubCatAdpaterNew f21333d;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodSubCatAdpaterNew$b$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodSubCatAdpaterNew$b$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodSubCatAdpaterNew$b$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final RunnableC3577b f21334b;

            public a(RunnableC3577b runnableC3577b) {
                this.f21334b = runnableC3577b;
            }

            @Override // java.lang.Runnable
            public void run() {
                VodSubCatAdpaterNew vodSubCatAdpaterNew;
                List list;
                if (!TextUtils.isEmpty(this.f21334b.f21331b)) {
                    if (!this.f21334b.f21333d.f21322h.isEmpty() || this.f21334b.f21333d.f21322h.isEmpty()) {
                        vodSubCatAdpaterNew = this.f21334b.f21333d;
                        list = vodSubCatAdpaterNew.f21322h;
                    }
                    if (this.f21334b.f21333d.f21319e != null && this.f21334b.f21333d.f21319e.size() == 0) {
                        this.f21334b.f21332c.setVisibility(0);
                    }
                    VodSubCatAdpaterNew vodSubCatAdpaterNew2 = this.f21334b.f21333d;
                    vodSubCatAdpaterNew2.f21324j = vodSubCatAdpaterNew2.f21325k;
                    this.f21334b.f21333d.m4099w();
                }
                vodSubCatAdpaterNew = this.f21334b.f21333d;
                list = vodSubCatAdpaterNew.f21323i;
                vodSubCatAdpaterNew.f21319e = list;
                if (this.f21334b.f21333d.f21319e != null) {
                    this.f21334b.f21332c.setVisibility(0);
                }
                VodSubCatAdpaterNew vodSubCatAdpaterNew22 = this.f21334b.f21333d;
                vodSubCatAdpaterNew22.f21324j = vodSubCatAdpaterNew22.f21325k;
                this.f21334b.f21333d.m4099w();
            }
        }

        public RunnableC3577b(VodSubCatAdpaterNew vodSubCatAdpaterNew, String str, TextView textView) {
            this.f21333d = vodSubCatAdpaterNew;
            this.f21331b = str;
            this.f21332c = textView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21333d.f21322h = new ArrayList();
            this.f21333d.f21325k = this.f21331b.length();
            if (this.f21333d.f21322h != null) {
                this.f21333d.f21322h.clear();
            }
            if (TextUtils.isEmpty(this.f21331b)) {
                this.f21333d.f21322h.addAll(this.f21333d.f21323i);
            } else {
                if ((this.f21333d.f21319e != null && this.f21333d.f21319e.size() == 0) || this.f21333d.f21324j > this.f21333d.f21325k) {
                    VodSubCatAdpaterNew vodSubCatAdpaterNew = this.f21333d;
                    vodSubCatAdpaterNew.f21319e = vodSubCatAdpaterNew.f21323i;
                }
                if (this.f21333d.f21319e != null) {
                    for (LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel : this.f21333d.f21319e) {
                        if (liveStreamCategoryIdDBModel.m14788c() != null && liveStreamCategoryIdDBModel.m14788c().toLowerCase().contains(this.f21331b.toLowerCase())) {
                            this.f21333d.f21322h.add(liveStreamCategoryIdDBModel);
                        }
                    }
                }
            }
            ((Activity) this.f21333d.f21320f).runOnUiThread(new a(this));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodSubCatAdpaterNew$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodSubCatAdpaterNew$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodSubCatAdpaterNew$c.class */
    public class ViewOnFocusChangeListenerC3578c implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f21335b;

        /* renamed from: c */
        public final VodSubCatAdpaterNew f21336c;

        public ViewOnFocusChangeListenerC3578c(VodSubCatAdpaterNew vodSubCatAdpaterNew, View view) {
            this.f21336c = vodSubCatAdpaterNew;
            this.f21335b = view;
        }

        /* renamed from: a */
        public final void m17618a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f21335b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m17619b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f21335b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m17620c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f21335b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            View view2;
            int i10;
            float f10 = 1.09f;
            if (z10) {
                if (!z10) {
                    f10 = 1.0f;
                }
                m17619b(f10);
                m17620c(f10);
                Log.e("id is", "" + this.f21335b.getTag());
                view2 = this.f21335b;
                i10 = 2131231896;
            } else {
                if (z10) {
                    return;
                }
                if (!z10) {
                    f10 = 1.0f;
                }
                m17619b(f10);
                m17620c(f10);
                m17618a(z10);
                view2 = this.f21335b;
                i10 = 2131231895;
            }
            view2.setBackgroundResource(i10);
        }
    }

    public VodSubCatAdpaterNew() {
    }

    public VodSubCatAdpaterNew(List<LiveStreamCategoryIdDBModel> list, Context context, LiveStreamDBHandler liveStreamDBHandler) {
        ArrayList arrayList = new ArrayList();
        this.f21322h = arrayList;
        arrayList.addAll(list);
        this.f21323i = list;
        this.f21319e = list;
        this.f21320f = context;
        this.f21321g = liveStreamDBHandler;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        return this.f21319e.size();
    }

    /* renamed from: o0 */
    public void m17614o0(String str, TextView textView) {
        new Thread(new RunnableC3577b(this, str, textView)).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public void mo2996G(MyViewHolder myViewHolder, int i10) {
        LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = this.f21319e.get(i10);
        String m14788c = liveStreamCategoryIdDBModel.m14788c();
        String m14787b = liveStreamCategoryIdDBModel.m14787b();
        Bundle bundle = new Bundle();
        bundle.putString("category_id", m14787b);
        bundle.putString("category_name", m14788c);
        if (m14788c != null && !m14788c.equals("") && !m14788c.isEmpty()) {
            myViewHolder.tvMovieCategoryName.setText(m14788c);
        }
        int m15207a2 = this.f21321g.m15207a2(liveStreamCategoryIdDBModel.m14787b(), "movie");
        if (m15207a2 == 0 || m15207a2 == -1) {
            myViewHolder.tvXubCount.setText("");
        } else {
            myViewHolder.tvXubCount.setText(String.valueOf(m15207a2));
        }
        RelativeLayout relativeLayout = myViewHolder.rlOuter;
        relativeLayout.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3578c(this, relativeLayout));
        myViewHolder.rlOuter.setOnClickListener(new ViewOnClickListenerC3576a(this, myViewHolder, m14787b, m14788c));
        if (this.f21319e.size() != 0) {
            myViewHolder.rlOuter.setVisibility(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder mo2998J(ViewGroup viewGroup, int i10) {
        return new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(2131624250, viewGroup, false));
    }

    /* renamed from: r0 */
    public void m17617r0(ProgressBar progressBar) {
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }
}

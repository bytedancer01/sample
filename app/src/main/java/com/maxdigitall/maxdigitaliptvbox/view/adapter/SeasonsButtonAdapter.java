package com.maxdigitall.maxdigitaliptvbox.view.adapter;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailActivity;
import java.util.ArrayList;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeasonsButtonAdapter.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeasonsButtonAdapter.class */
public class SeasonsButtonAdapter extends RecyclerView.AbstractC0677h<MyViewHolder> {

    /* renamed from: e */
    public Context f20322e;

    /* renamed from: f */
    public ArrayList<Integer> f20323f;

    /* renamed from: g */
    public PopupWindow f20324g;

    /* renamed from: h */
    public int f20325h;

    /* renamed from: i */
    public MyViewHolder f20326i;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeasonsButtonAdapter$MyViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeasonsButtonAdapter$MyViewHolder.class */
    public static class MyViewHolder extends RecyclerView.AbstractC0674e0 {

        @BindView
        public TextView ButtonSeason;

        @BindView
        public LinearLayout ll_button;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.m5627b(this, view);
            m4048L(false);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeasonsButtonAdapter$MyViewHolder_ViewBinding.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeasonsButtonAdapter$MyViewHolder_ViewBinding.class */
    public class MyViewHolder_ViewBinding implements Unbinder {

        /* renamed from: b */
        public MyViewHolder f20327b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f20327b = myViewHolder;
            myViewHolder.ll_button = (LinearLayout) C8522c.m36739c(view, 2131428341, "field 'll_button'", LinearLayout.class);
            myViewHolder.ButtonSeason = (TextView) C8522c.m36739c(view, 2131429369, "field 'ButtonSeason'", TextView.class);
        }

        @Override // butterknife.Unbinder
        /* renamed from: a */
        public void mo5629a() {
            MyViewHolder myViewHolder = this.f20327b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f20327b = null;
            myViewHolder.ll_button = null;
            myViewHolder.ButtonSeason = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeasonsButtonAdapter$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeasonsButtonAdapter$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeasonsButtonAdapter$a.class */
    public class ViewOnClickListenerC3463a implements View.OnClickListener {

        /* renamed from: b */
        public final int f20328b;

        /* renamed from: c */
        public final SeasonsButtonAdapter f20329c;

        public ViewOnClickListenerC3463a(SeasonsButtonAdapter seasonsButtonAdapter, int i10) {
            this.f20329c = seasonsButtonAdapter;
            this.f20328b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f20329c.f20322e instanceof SeriesDetailActivity) {
                ((SeriesDetailActivity) this.f20329c.f20322e).m16610Y0(((Integer) this.f20329c.f20323f.get(this.f20328b)).intValue());
            }
            if (this.f20329c.f20324g != null) {
                this.f20329c.f20324g.dismiss();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeasonsButtonAdapter$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeasonsButtonAdapter$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeasonsButtonAdapter$b.class */
    public static class ViewOnFocusChangeListenerC3464b implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f20330b;

        public ViewOnFocusChangeListenerC3464b(View view) {
            this.f20330b = view;
        }

        /* renamed from: a */
        public final void m17365a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f20330b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m17366b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f20330b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m17367c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f20330b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            View view2;
            int i10;
            float f10 = 1.0f;
            if (z10) {
                if (z10) {
                    f10 = 1.1f;
                }
                Log.e("id is", "" + this.f20330b.getTag());
                if (this.f20330b.getTag() == null || !this.f20330b.getTag().equals("20")) {
                    m17366b(f10);
                    return;
                } else {
                    m17366b(f10);
                    view2 = this.f20330b;
                    i10 = 2131230828;
                }
            } else {
                if (z10) {
                    return;
                }
                if (z10) {
                    f10 = 1.09f;
                }
                m17365a(z10);
                if (this.f20330b.getTag() == null || !this.f20330b.getTag().equals("20")) {
                    m17366b(f10);
                    m17367c(f10);
                    return;
                } else {
                    m17366b(f10);
                    m17367c(f10);
                    view2 = this.f20330b;
                    i10 = 2131230845;
                }
            }
            view2.setBackgroundResource(i10);
        }
    }

    public SeasonsButtonAdapter(Context context, ArrayList<Integer> arrayList, PopupWindow popupWindow, int i10) {
        this.f20323f = arrayList;
        this.f20322e = context;
        this.f20324g = popupWindow;
        this.f20325h = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    @SuppressLint({"SetTextI18n"})
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public void mo2996G(MyViewHolder myViewHolder, int i10) {
        if (this.f20322e != null) {
            if (this.f20325h == this.f20323f.get(i10).intValue()) {
                myViewHolder.ll_button.setBackgroundResource(2131230828);
                myViewHolder.ll_button.requestFocus();
            }
            myViewHolder.ButtonSeason.setText(this.f20322e.getResources().getString(2132018529) + " - " + this.f20323f.get(i10));
            myViewHolder.ll_button.setOnClickListener(new ViewOnClickListenerC3463a(this, i10));
            LinearLayout linearLayout = myViewHolder.ll_button;
            linearLayout.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3464b(linearLayout));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder mo2998J(ViewGroup viewGroup, int i10) {
        MyViewHolder myViewHolder = new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(2131624504, viewGroup, false));
        this.f20326i = myViewHolder;
        return myViewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        return this.f20323f.size();
    }
}

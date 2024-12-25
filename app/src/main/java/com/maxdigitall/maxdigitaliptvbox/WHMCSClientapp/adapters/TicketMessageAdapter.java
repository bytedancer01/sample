package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.adapters;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.modelclassess.TickedMessageModelClass;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/adapters/TicketMessageAdapter.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/adapters/TicketMessageAdapter.class */
public class TicketMessageAdapter extends RecyclerView.AbstractC0677h<ViewHolder> {

    /* renamed from: e */
    public Context f16226e;

    /* renamed from: f */
    public List<TickedMessageModelClass.Replies.Reply> f16227f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/adapters/TicketMessageAdapter$OnFocusChangeAccountListener.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/adapters/TicketMessageAdapter$OnFocusChangeAccountListener.class */
    public class OnFocusChangeAccountListener implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f16228b;

        /* renamed from: c */
        public final TicketMessageAdapter f16229c;

        public OnFocusChangeAccountListener(TicketMessageAdapter ticketMessageAdapter, View view) {
            this.f16229c = ticketMessageAdapter;
            this.f16228b = view;
        }

        /* renamed from: a */
        public final void m14624a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16228b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m14625b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16228b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m14626c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16228b, "scaleY", f10);
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
                m14625b(1.0f);
                m14626c(1.0f);
                Log.e("id is", "" + this.f16228b.getTag());
                view2 = this.f16228b;
                i10 = 2131231882;
            } else {
                if (z10) {
                    return;
                }
                if (z10) {
                    f10 = 1.01f;
                }
                m14625b(f10);
                m14626c(f10);
                m14624a(z10);
                view2 = this.f16228b;
                i10 = 2131231940;
            }
            view2.setBackgroundResource(i10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/adapters/TicketMessageAdapter$ViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/adapters/TicketMessageAdapter$ViewHolder.class */
    public class ViewHolder extends RecyclerView.AbstractC0674e0 {

        /* renamed from: A */
        public LinearLayout f16230A;

        /* renamed from: B */
        public final TicketMessageAdapter f16231B;

        /* renamed from: u */
        public TextView f16232u;

        /* renamed from: v */
        public TextView f16233v;

        /* renamed from: w */
        public TextView f16234w;

        /* renamed from: x */
        public ImageView f16235x;

        /* renamed from: y */
        public ImageView f16236y;

        /* renamed from: z */
        public CardView f16237z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(TicketMessageAdapter ticketMessageAdapter, View view) {
            super(view);
            this.f16231B = ticketMessageAdapter;
            this.f16232u = (TextView) view.findViewById(2131429410);
            this.f16233v = (TextView) view.findViewById(2131429508);
            this.f16234w = (TextView) view.findViewById(2131429631);
            this.f16235x = (ImageView) view.findViewById(2131428137);
            this.f16236y = (ImageView) view.findViewById(2131428161);
            this.f16230A = (LinearLayout) view.findViewById(2131428459);
            this.f16237z = (CardView) view.findViewById(2131427701);
        }
    }

    public TicketMessageAdapter(Context context, List<TickedMessageModelClass.Replies.Reply> list) {
        this.f16226e = context;
        this.f16227f = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public void mo2996G(ViewHolder viewHolder, int i10) {
        LinearLayout linearLayout;
        String str;
        String m14704d = this.f16227f.get(i10).m14704d();
        if (m14704d == null || m14704d.equalsIgnoreCase("")) {
            viewHolder.f16236y.setVisibility(8);
            viewHolder.f16235x.setVisibility(0);
            viewHolder.f16234w.setText(this.f16227f.get(i10).m14701a());
            viewHolder.f16233v.setText(this.f16227f.get(i10).m14703c());
            viewHolder.f16232u.setText(this.f16227f.get(i10).m14702b());
            linearLayout = viewHolder.f16230A;
            str = "#a5b0c2";
        } else {
            viewHolder.f16236y.setVisibility(0);
            viewHolder.f16235x.setVisibility(8);
            viewHolder.f16234w.setText(m14704d);
            viewHolder.f16233v.setText(this.f16227f.get(i10).m14703c());
            viewHolder.f16232u.setText(this.f16227f.get(i10).m14702b());
            linearLayout = viewHolder.f16230A;
            str = "#eceef2";
        }
        linearLayout.setBackgroundColor(Color.parseColor(str));
        viewHolder.f16237z.setCardBackgroundColor(Color.parseColor(str));
        LinearLayout linearLayout2 = viewHolder.f16230A;
        linearLayout2.setOnFocusChangeListener(new OnFocusChangeAccountListener(this, linearLayout2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public ViewHolder mo2998J(ViewGroup viewGroup, int i10) {
        return new ViewHolder(this, LayoutInflater.from(this.f16226e).inflate(2131624546, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        return this.f16227f.size();
    }
}

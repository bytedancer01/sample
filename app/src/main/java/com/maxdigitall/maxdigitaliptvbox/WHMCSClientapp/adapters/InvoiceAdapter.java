package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.adapters;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.Clientdatabase.ClientSharepreferenceHandler;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.BuyNowActivity;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.modelclassess.InvoicesModelClass;
import java.util.List;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/adapters/InvoiceAdapter.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/adapters/InvoiceAdapter.class */
public class InvoiceAdapter extends RecyclerView.AbstractC0677h<ViewHolder> {

    /* renamed from: e */
    public Context f16193e;

    /* renamed from: f */
    public List<InvoicesModelClass.Invoices.Invoice> f16194f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/adapters/InvoiceAdapter$ViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/adapters/InvoiceAdapter$ViewHolder.class */
    public class ViewHolder extends RecyclerView.AbstractC0674e0 {

        @BindView
        public RelativeLayout invoices_l;

        @BindView
        public ImageView iv_arrow_downward;

        @BindView
        public LinearLayout layoutFocus;

        /* renamed from: u */
        public CardView f16198u;

        /* renamed from: v */
        public TextView f16199v;

        /* renamed from: w */
        public TextView f16200w;

        /* renamed from: x */
        public TextView f16201x;

        /* renamed from: y */
        public final InvoiceAdapter f16202y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(InvoiceAdapter invoiceAdapter, View view) {
            super(view);
            this.f16202y = invoiceAdapter;
            ButterKnife.m5627b(this, view);
            this.f16199v = (TextView) view.findViewById(2131429475);
            this.f16200w = (TextView) view.findViewById(2131429477);
            this.f16201x = (TextView) view.findViewById(2131429479);
            this.layoutFocus = (LinearLayout) view.findViewById(2131428249);
            this.f16198u = (CardView) view.findViewById(2131427699);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/adapters/InvoiceAdapter$ViewHolder_ViewBinding.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/adapters/InvoiceAdapter$ViewHolder_ViewBinding.class */
    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: b */
        public ViewHolder f16203b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f16203b = viewHolder;
            viewHolder.iv_arrow_downward = (ImageView) C8522c.m36739c(view, 2131428141, "field 'iv_arrow_downward'", ImageView.class);
            viewHolder.layoutFocus = (LinearLayout) C8522c.m36739c(view, 2131428249, "field 'layoutFocus'", LinearLayout.class);
            viewHolder.invoices_l = (RelativeLayout) C8522c.m36739c(view, 2131428996, "field 'invoices_l'", RelativeLayout.class);
        }

        @Override // butterknife.Unbinder
        /* renamed from: a */
        public void mo5629a() {
            ViewHolder viewHolder = this.f16203b;
            if (viewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f16203b = null;
            viewHolder.iv_arrow_downward = null;
            viewHolder.layoutFocus = null;
            viewHolder.invoices_l = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/adapters/InvoiceAdapter$focusChange.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/adapters/InvoiceAdapter$focusChange.class */
    public class focusChange implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f16204b;

        /* renamed from: c */
        public final InvoiceAdapter f16205c;

        public focusChange(InvoiceAdapter invoiceAdapter, View view) {
            this.f16205c = invoiceAdapter;
            this.f16204b = view;
        }

        /* renamed from: a */
        public final void m14605a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16204b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m14606b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16204b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m14607c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16204b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            View view2;
            int i10;
            float f10 = 1.01f;
            if (z10) {
                if (!z10) {
                    f10 = 1.0f;
                }
                m14606b(f10);
                m14607c(f10);
                Log.e("id is", "" + this.f16204b.getTag());
                view2 = this.f16204b;
                i10 = 2131231898;
            } else {
                if (z10) {
                    return;
                }
                if (!z10) {
                    f10 = 1.0f;
                }
                m14606b(f10);
                m14607c(f10);
                m14605a(z10);
                view2 = this.f16204b;
                i10 = 2131231897;
            }
            view2.setBackgroundResource(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public void mo2996G(ViewHolder viewHolder, int i10) {
        String m14668a = this.f16194f.get(i10).m14668a();
        if (m14668a == null || m14668a.equalsIgnoreCase("")) {
            viewHolder.f16199v.setText(2132017171);
        } else {
            viewHolder.f16199v.setText(m14668a);
        }
        String m14669b = this.f16194f.get(i10).m14669b();
        if (m14669b == null || m14669b.equalsIgnoreCase("")) {
            viewHolder.f16200w.setText(2132017171);
        } else {
            viewHolder.f16200w.setText(m14669b);
        }
        String m14672e = this.f16194f.get(i10).m14672e();
        if (m14672e == null || m14672e.equalsIgnoreCase("")) {
            viewHolder.f16201x.setText(2132017171);
        } else {
            viewHolder.f16201x.setText(ClientSharepreferenceHandler.m14493d(this.f16193e) + m14672e + ClientSharepreferenceHandler.m14494e(this.f16193e));
        }
        viewHolder.layoutFocus.setOnClickListener(new View.OnClickListener(this, this.f16194f.get(i10).m14670c(), this.f16194f.get(i10).m14671d()) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.adapters.InvoiceAdapter.1

            /* renamed from: b */
            public final String f16195b;

            /* renamed from: c */
            public final String f16196c;

            /* renamed from: d */
            public final InvoiceAdapter f16197d;

            {
                this.f16197d = this;
                this.f16195b = r5;
                this.f16196c = r6;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent(this.f16197d.f16193e, (Class<?>) BuyNowActivity.class);
                intent.setAction("Invoice_action");
                intent.putExtra("invoice_id", this.f16195b);
                intent.putExtra("status", this.f16196c);
                this.f16197d.f16193e.startActivity(intent);
            }
        });
        CardView cardView = viewHolder.f16198u;
        cardView.setOnFocusChangeListener(new focusChange(this, cardView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public ViewHolder mo2998J(ViewGroup viewGroup, int i10) {
        return new ViewHolder(this, LayoutInflater.from(this.f16193e).inflate(2131624460, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        return this.f16194f.size();
    }
}

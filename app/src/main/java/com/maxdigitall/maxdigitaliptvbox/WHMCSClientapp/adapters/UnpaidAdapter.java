package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.adapters;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.amplifyframework.core.model.ModelIdentifier;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.Clientdatabase.ClientSharepreferenceHandler;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.BuyNowActivity;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.modelclassess.InvoicesModelClass;
import java.util.List;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/adapters/UnpaidAdapter.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/adapters/UnpaidAdapter.class */
public class UnpaidAdapter extends RecyclerView.AbstractC0677h<ViewHolder> {

    /* renamed from: e */
    public Context f16238e;

    /* renamed from: f */
    public List<InvoicesModelClass.Invoices.Invoice> f16239f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/adapters/UnpaidAdapter$ViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/adapters/UnpaidAdapter$ViewHolder.class */
    public class ViewHolder extends RecyclerView.AbstractC0674e0 {

        /* renamed from: A */
        public TextView f16246A;

        /* renamed from: B */
        public final int f16247B;

        /* renamed from: C */
        public final UnpaidAdapter f16248C;

        @BindView
        public ImageView iv_arrow_downward;

        @BindView
        public LinearLayout layoutFocus;

        @BindView
        public LinearLayout ll_expandable;

        @BindView
        public RelativeLayout reply_ticket;

        /* renamed from: u */
        public Animation f16249u;

        /* renamed from: v */
        public Animation f16250v;

        /* renamed from: w */
        public CardView f16251w;

        /* renamed from: x */
        public TextView f16252x;

        /* renamed from: y */
        public TextView f16253y;

        /* renamed from: z */
        public TextView f16254z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(UnpaidAdapter unpaidAdapter, View view) {
            super(view);
            this.f16248C = unpaidAdapter;
            this.f16247B = 200;
            ButterKnife.m5627b(this, view);
            this.f16253y = (TextView) view.findViewById(2131429475);
            this.f16254z = (TextView) view.findViewById(2131429477);
            this.f16246A = (TextView) view.findViewById(2131429479);
            this.layoutFocus = (LinearLayout) view.findViewById(2131428249);
            this.ll_expandable = (LinearLayout) view.findViewById(2131428403);
            this.reply_ticket = (RelativeLayout) view.findViewById(2131429047);
            this.f16251w = (CardView) view.findViewById(2131427699);
            this.f16252x = (TextView) view.findViewById(2131429480);
            this.f16249u = AnimationUtils.loadAnimation(unpaidAdapter.f16238e, 2130772026);
            this.f16250v = AnimationUtils.loadAnimation(unpaidAdapter.f16238e, 2130772025);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/adapters/UnpaidAdapter$ViewHolder_ViewBinding.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/adapters/UnpaidAdapter$ViewHolder_ViewBinding.class */
    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: b */
        public ViewHolder f16255b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f16255b = viewHolder;
            viewHolder.iv_arrow_downward = (ImageView) C8522c.m36739c(view, 2131428141, "field 'iv_arrow_downward'", ImageView.class);
            viewHolder.layoutFocus = (LinearLayout) C8522c.m36739c(view, 2131428249, "field 'layoutFocus'", LinearLayout.class);
            viewHolder.reply_ticket = (RelativeLayout) C8522c.m36739c(view, 2131429047, "field 'reply_ticket'", RelativeLayout.class);
            viewHolder.ll_expandable = (LinearLayout) C8522c.m36739c(view, 2131428403, "field 'll_expandable'", LinearLayout.class);
        }

        @Override // butterknife.Unbinder
        /* renamed from: a */
        public void mo5629a() {
            ViewHolder viewHolder = this.f16255b;
            if (viewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f16255b = null;
            viewHolder.iv_arrow_downward = null;
            viewHolder.layoutFocus = null;
            viewHolder.reply_ticket = null;
            viewHolder.ll_expandable = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/adapters/UnpaidAdapter$focusChange.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/adapters/UnpaidAdapter$focusChange.class */
    public class focusChange implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f16256b;

        /* renamed from: c */
        public final UnpaidAdapter f16257c;

        public focusChange(UnpaidAdapter unpaidAdapter, View view) {
            this.f16257c = unpaidAdapter;
            this.f16256b = view;
        }

        /* renamed from: a */
        public final void m14629a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16256b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m14630b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16256b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m14631c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16256b, "scaleY", f10);
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
                m14630b(f10);
                m14631c(f10);
                Log.e("id is", "" + this.f16256b.getTag());
                view2 = this.f16256b;
                i10 = 2131231882;
            } else {
                if (z10) {
                    return;
                }
                if (!z10) {
                    f10 = 1.0f;
                }
                m14630b(f10);
                m14631c(f10);
                m14629a(z10);
                view2 = this.f16256b;
                i10 = 2131231940;
            }
            view2.setBackgroundResource(i10);
        }
    }

    public UnpaidAdapter(Context context, List<InvoicesModelClass.Invoices.Invoice> list) {
        this.f16238e = context;
        this.f16239f = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public void mo2996G(ViewHolder viewHolder, int i10) {
        List<InvoicesModelClass.Invoices.Invoice> list = this.f16239f;
        if (list != null && !list.isEmpty() && this.f16239f.size() > 0) {
            String m14668a = this.f16239f.get(i10).m14668a();
            if (m14668a == null || m14668a.isEmpty() || m14668a.equalsIgnoreCase("")) {
                viewHolder.f16254z.setText(2132017171);
            } else {
                viewHolder.f16253y.setText(m14668a);
            }
            String m14669b = this.f16239f.get(i10).m14669b();
            if (m14669b == null || m14669b.isEmpty() || m14669b.equalsIgnoreCase("")) {
                viewHolder.f16254z.setText(2132017171);
            } else {
                viewHolder.f16254z.setText(m14669b);
            }
        }
        String m14672e = this.f16239f.get(i10).m14672e();
        if (m14672e == null || m14672e.equalsIgnoreCase("") || m14672e.isEmpty()) {
            viewHolder.f16246A.setText(2132017171);
        } else {
            viewHolder.f16246A.setText(ClientSharepreferenceHandler.m14493d(this.f16238e) + m14672e + ClientSharepreferenceHandler.m14494e(this.f16238e));
        }
        String m14670c = this.f16239f.get(i10).m14670c();
        if (m14670c == null || m14670c.isEmpty() || m14670c.equalsIgnoreCase("")) {
            viewHolder.f16252x.setText(this.f16238e.getResources().getString(2132018149));
        } else {
            viewHolder.f16252x.setText(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + m14670c);
        }
        String m14670c2 = this.f16239f.get(i10).m14670c();
        String m14671d = this.f16239f.get(i10).m14671d();
        viewHolder.layoutFocus.setOnClickListener(new View.OnClickListener(this, m14670c2, m14671d) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.adapters.UnpaidAdapter.1

            /* renamed from: b */
            public final String f16240b;

            /* renamed from: c */
            public final String f16241c;

            /* renamed from: d */
            public final UnpaidAdapter f16242d;

            {
                this.f16242d = this;
                this.f16240b = m14670c2;
                this.f16241c = m14671d;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent(this.f16242d.f16238e, (Class<?>) BuyNowActivity.class);
                intent.setAction("Invoice_action");
                intent.putExtra("invoice_id", this.f16240b);
                intent.putExtra("status", this.f16241c);
                this.f16242d.f16238e.startActivity(intent);
            }
        });
        viewHolder.f16251w.setOnClickListener(new View.OnClickListener(this, m14670c2, m14671d) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.adapters.UnpaidAdapter.2

            /* renamed from: b */
            public final String f16243b;

            /* renamed from: c */
            public final String f16244c;

            /* renamed from: d */
            public final UnpaidAdapter f16245d;

            {
                this.f16245d = this;
                this.f16243b = m14670c2;
                this.f16244c = m14671d;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent(this.f16245d.f16238e, (Class<?>) BuyNowActivity.class);
                intent.setAction("Invoice_action");
                intent.putExtra("invoice_id", this.f16243b);
                intent.putExtra("status", this.f16244c);
                this.f16245d.f16238e.startActivity(intent);
            }
        });
        CardView cardView = viewHolder.f16251w;
        cardView.setOnFocusChangeListener(new focusChange(this, cardView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public ViewHolder mo2998J(ViewGroup viewGroup, int i10) {
        return new ViewHolder(this, LayoutInflater.from(this.f16238e).inflate(2131624460, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        return this.f16239f.size();
    }
}

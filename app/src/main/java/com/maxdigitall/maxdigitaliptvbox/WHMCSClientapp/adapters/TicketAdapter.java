package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.adapters;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.amplifyframework.core.model.ModelIdentifier;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.ViewTicketActivity;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.modelclassess.TicketModelClass;
import java.util.List;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/adapters/TicketAdapter.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/adapters/TicketAdapter.class */
public class TicketAdapter extends RecyclerView.AbstractC0677h<MyViewHolder> {

    /* renamed from: e */
    public List<TicketModelClass.Tickets.Ticket> f16217e;

    /* renamed from: f */
    public Context f16218f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/adapters/TicketAdapter$MyViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/adapters/TicketAdapter$MyViewHolder.class */
    public class MyViewHolder extends RecyclerView.AbstractC0674e0 {

        @BindView
        public LinearLayout llOuter;

        @BindView
        public TextView tvDepartmentName;

        @BindView
        public TextView tvLastUpdated;

        @BindView
        public TextView tvLastUpdatedValue;

        @BindView
        public TextView tvStatus;

        @BindView
        public TextView tvStatusValue;

        /* renamed from: u */
        public final TicketAdapter f16222u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MyViewHolder(TicketAdapter ticketAdapter, View view) {
            super(view);
            this.f16222u = ticketAdapter;
            ButterKnife.m5627b(this, view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/adapters/TicketAdapter$MyViewHolder_ViewBinding.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/adapters/TicketAdapter$MyViewHolder_ViewBinding.class */
    public class MyViewHolder_ViewBinding implements Unbinder {

        /* renamed from: b */
        public MyViewHolder f16223b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f16223b = myViewHolder;
            myViewHolder.tvDepartmentName = (TextView) C8522c.m36739c(view, 2131429414, "field 'tvDepartmentName'", TextView.class);
            myViewHolder.tvStatus = (TextView) C8522c.m36739c(view, 2131429616, "field 'tvStatus'", TextView.class);
            myViewHolder.tvStatusValue = (TextView) C8522c.m36739c(view, 2131429618, "field 'tvStatusValue'", TextView.class);
            myViewHolder.tvLastUpdated = (TextView) C8522c.m36739c(view, 2131429485, "field 'tvLastUpdated'", TextView.class);
            myViewHolder.tvLastUpdatedValue = (TextView) C8522c.m36739c(view, 2131429489, "field 'tvLastUpdatedValue'", TextView.class);
            myViewHolder.llOuter = (LinearLayout) C8522c.m36739c(view, 2131428459, "field 'llOuter'", LinearLayout.class);
        }

        @Override // butterknife.Unbinder
        /* renamed from: a */
        public void mo5629a() {
            MyViewHolder myViewHolder = this.f16223b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f16223b = null;
            myViewHolder.tvDepartmentName = null;
            myViewHolder.tvStatus = null;
            myViewHolder.tvStatusValue = null;
            myViewHolder.tvLastUpdated = null;
            myViewHolder.tvLastUpdatedValue = null;
            myViewHolder.llOuter = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/adapters/TicketAdapter$OnFocusChangeAccountListener.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/adapters/TicketAdapter$OnFocusChangeAccountListener.class */
    public class OnFocusChangeAccountListener implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f16224b;

        /* renamed from: c */
        public final TicketAdapter f16225c;

        public OnFocusChangeAccountListener(TicketAdapter ticketAdapter, View view) {
            this.f16225c = ticketAdapter;
            this.f16224b = view;
        }

        /* renamed from: a */
        public final void m14619a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16224b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m14620b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16224b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m14621c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16224b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            View view2;
            int i10;
            float f10 = 1.04f;
            if (z10) {
                if (!z10) {
                    f10 = 1.0f;
                }
                m14620b(f10);
                m14621c(f10);
                Log.e("id is", "" + this.f16224b.getTag());
                view2 = this.f16224b;
                i10 = 2131231898;
            } else {
                if (z10) {
                    return;
                }
                if (!z10) {
                    f10 = 1.0f;
                }
                m14620b(f10);
                m14621c(f10);
                m14619a(z10);
                view2 = this.f16224b;
                i10 = 2131231897;
            }
            view2.setBackgroundResource(i10);
        }
    }

    public TicketAdapter(List<TicketModelClass.Tickets.Ticket> list, Context context) {
        this.f16217e = list;
        this.f16218f = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public void mo2996G(MyViewHolder myViewHolder, int i10) {
        TextView textView;
        String str;
        String m14712e;
        String m14711d;
        String str2;
        String m14709b;
        List<TicketModelClass.Tickets.Ticket> list = this.f16217e;
        if (list != null && list.size() > 0) {
            String m14710c = this.f16217e.get(i10).m14710c();
            if (!m14710c.isEmpty() && m14710c.equalsIgnoreCase("open")) {
                myViewHolder.tvStatusValue.setText(m14710c);
                textView = myViewHolder.tvStatusValue;
                str = "#779500";
            } else if (!m14710c.isEmpty() && m14710c.equalsIgnoreCase("customer-reply")) {
                myViewHolder.tvStatusValue.setText(m14710c);
                textView = myViewHolder.tvStatusValue;
                str = "#ff6600";
            } else if (m14710c.isEmpty() || !m14710c.equalsIgnoreCase("closed")) {
                if (!m14710c.isEmpty() && m14710c.equalsIgnoreCase("answered")) {
                    myViewHolder.tvStatusValue.setText(m14710c);
                    textView = myViewHolder.tvStatusValue;
                    str = "#000000";
                }
                m14712e = this.f16217e.get(i10).m14712e();
                m14711d = this.f16217e.get(i10).m14711d();
                if (m14712e != null || m14712e.equalsIgnoreCase("")) {
                    str2 = (m14711d != null || m14711d.equalsIgnoreCase("")) ? "" : m14711d;
                } else {
                    str2 = m14712e;
                    if (m14711d != null) {
                        str2 = m14712e;
                        if (!m14711d.equalsIgnoreCase("")) {
                            str2 = ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + m14712e + "-" + m14711d;
                        }
                    }
                }
                if (str2 != null || str2.equalsIgnoreCase("")) {
                    myViewHolder.tvDepartmentName.setText(this.f16218f.getResources().getString(2132017171));
                } else {
                    myViewHolder.tvDepartmentName.setText(str2);
                }
                m14709b = this.f16217e.get(i10).m14709b();
                if (m14709b != null || m14709b.equalsIgnoreCase("")) {
                    myViewHolder.tvLastUpdatedValue.setVisibility(8);
                } else {
                    myViewHolder.tvLastUpdatedValue.setText(m14709b);
                }
                myViewHolder.llOuter.setOnClickListener(new View.OnClickListener(this, i10, myViewHolder) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.adapters.TicketAdapter.1

                    /* renamed from: b */
                    public final int f16219b;

                    /* renamed from: c */
                    public final MyViewHolder f16220c;

                    /* renamed from: d */
                    public final TicketAdapter f16221d;

                    {
                        this.f16221d = this;
                        this.f16219b = i10;
                        this.f16220c = myViewHolder;
                    }

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        Intent intent = new Intent(this.f16221d.f16218f, (Class<?>) ViewTicketActivity.class);
                        intent.putExtra("Title", ((TicketModelClass.Tickets.Ticket) this.f16221d.f16217e.get(this.f16219b)).m14712e() + "-" + ((TicketModelClass.Tickets.Ticket) this.f16221d.f16217e.get(this.f16219b)).m14711d());
                        intent.putExtra("ticketid", ((TicketModelClass.Tickets.Ticket) this.f16221d.f16217e.get(this.f16220c.m4064n())).m14708a());
                        this.f16221d.f16218f.startActivity(intent);
                    }
                });
            } else {
                myViewHolder.tvStatusValue.setText(m14710c);
                textView = myViewHolder.tvStatusValue;
                str = "#888888";
            }
            textView.setTextColor(Color.parseColor(str));
            m14712e = this.f16217e.get(i10).m14712e();
            m14711d = this.f16217e.get(i10).m14711d();
            if (m14712e != null) {
            }
            if (m14711d != null) {
            }
            if (str2 != null) {
            }
            myViewHolder.tvDepartmentName.setText(this.f16218f.getResources().getString(2132017171));
            m14709b = this.f16217e.get(i10).m14709b();
            if (m14709b != null) {
            }
            myViewHolder.tvLastUpdatedValue.setVisibility(8);
            myViewHolder.llOuter.setOnClickListener(new View.OnClickListener(this, i10, myViewHolder) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.adapters.TicketAdapter.1

                /* renamed from: b */
                public final int f16219b;

                /* renamed from: c */
                public final MyViewHolder f16220c;

                /* renamed from: d */
                public final TicketAdapter f16221d;

                {
                    this.f16221d = this;
                    this.f16219b = i10;
                    this.f16220c = myViewHolder;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Intent intent = new Intent(this.f16221d.f16218f, (Class<?>) ViewTicketActivity.class);
                    intent.putExtra("Title", ((TicketModelClass.Tickets.Ticket) this.f16221d.f16217e.get(this.f16219b)).m14712e() + "-" + ((TicketModelClass.Tickets.Ticket) this.f16221d.f16217e.get(this.f16219b)).m14711d());
                    intent.putExtra("ticketid", ((TicketModelClass.Tickets.Ticket) this.f16221d.f16217e.get(this.f16220c.m4064n())).m14708a());
                    this.f16221d.f16218f.startActivity(intent);
                }
            });
        }
        LinearLayout linearLayout = myViewHolder.llOuter;
        linearLayout.setOnFocusChangeListener(new OnFocusChangeAccountListener(this, linearLayout));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder mo2998J(ViewGroup viewGroup, int i10) {
        return new MyViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(2131624545, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        return this.f16217e.size();
    }
}

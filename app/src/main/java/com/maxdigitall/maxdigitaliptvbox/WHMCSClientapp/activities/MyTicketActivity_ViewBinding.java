package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.github.ybq.android.spinkit.SpinKitView;
import p204lg.C5876c;
import p316s2.AbstractViewOnClickListenerC8521b;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/MyTicketActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/MyTicketActivity_ViewBinding.class */
public class MyTicketActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public MyTicketActivity f16060b;

    /* renamed from: c */
    public View f16061c;

    public MyTicketActivity_ViewBinding(MyTicketActivity myTicketActivity, View view) {
        this.f16060b = myTicketActivity;
        myTicketActivity.recyclerView = (RecyclerView) C8522c.m36739c(view, 2131428920, "field 'recyclerView'", RecyclerView.class);
        View m36738b = C8522c.m36738b(view, 2131428178, "field 'iv_fab' and method 'onViewClicked'");
        myTicketActivity.iv_fab = (ImageView) C8522c.m36737a(m36738b, 2131428178, "field 'iv_fab'", ImageView.class);
        this.f16061c = m36738b;
        m36738b.setOnClickListener(new AbstractViewOnClickListenerC8521b(this, myTicketActivity) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.MyTicketActivity_ViewBinding.1

            /* renamed from: d */
            public final MyTicketActivity f16062d;

            /* renamed from: e */
            public final MyTicketActivity_ViewBinding f16063e;

            {
                this.f16063e = this;
                this.f16062d = myTicketActivity;
            }

            @Override // p316s2.AbstractViewOnClickListenerC8521b
            /* renamed from: b */
            public void mo14535b(View view2) {
                this.f16062d.onViewClicked();
            }
        });
        myTicketActivity.tvNoSupportTicket = (TextView) C8522c.m36739c(view, 2131429543, "field 'tvNoSupportTicket'", TextView.class);
        myTicketActivity.llRecycleview = (LinearLayout) C8522c.m36739c(view, 2131428484, "field 'llRecycleview'", LinearLayout.class);
        myTicketActivity.llFloatingButton = (LinearLayout) C8522c.m36739c(view, 2131428405, "field 'llFloatingButton'", LinearLayout.class);
        myTicketActivity.progress = (SpinKitView) C8522c.m36739c(view, C5876c.f32946j, "field 'progress'", SpinKitView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        MyTicketActivity myTicketActivity = this.f16060b;
        if (myTicketActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f16060b = null;
        myTicketActivity.recyclerView = null;
        myTicketActivity.iv_fab = null;
        myTicketActivity.tvNoSupportTicket = null;
        myTicketActivity.llRecycleview = null;
        myTicketActivity.llFloatingButton = null;
        myTicketActivity.progress = null;
        this.f16061c.setOnClickListener(null);
        this.f16061c = null;
    }
}

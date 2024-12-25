package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.github.ybq.android.spinkit.SpinKitView;
import p204lg.C5876c;
import p316s2.AbstractViewOnClickListenerC8521b;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/ViewTicketActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/ViewTicketActivity_ViewBinding.class */
public class ViewTicketActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public ViewTicketActivity f16186b;

    /* renamed from: c */
    public View f16187c;

    /* renamed from: d */
    public View f16188d;

    public ViewTicketActivity_ViewBinding(ViewTicketActivity viewTicketActivity, View view) {
        this.f16186b = viewTicketActivity;
        viewTicketActivity.time = (TextView) C8522c.m36739c(view, 2131429309, "field 'time'", TextView.class);
        viewTicketActivity.date = (TextView) C8522c.m36739c(view, 2131427816, "field 'date'", TextView.class);
        viewTicketActivity.recyclerView = (RecyclerView) C8522c.m36739c(view, 2131428920, "field 'recyclerView'", RecyclerView.class);
        viewTicketActivity.textNotFound = (TextView) C8522c.m36739c(view, 2131429299, "field 'textNotFound'", TextView.class);
        View m36738b = C8522c.m36738b(view, 2131427615, "field 'btReply' and method 'onViewClicked'");
        viewTicketActivity.btReply = (Button) C8522c.m36737a(m36738b, 2131427615, "field 'btReply'", Button.class);
        this.f16187c = m36738b;
        m36738b.setOnClickListener(new AbstractViewOnClickListenerC8521b(this, viewTicketActivity) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.ViewTicketActivity_ViewBinding.1

            /* renamed from: d */
            public final ViewTicketActivity f16189d;

            /* renamed from: e */
            public final ViewTicketActivity_ViewBinding f16190e;

            {
                this.f16190e = this;
                this.f16189d = viewTicketActivity;
            }

            @Override // p316s2.AbstractViewOnClickListenerC8521b
            /* renamed from: b */
            public void mo14535b(View view2) {
                this.f16189d.onViewClicked(view2);
            }
        });
        View m36738b2 = C8522c.m36738b(view, 2131427602, "field 'bt_cancel_reply' and method 'onViewClicked'");
        viewTicketActivity.bt_cancel_reply = (Button) C8522c.m36737a(m36738b2, 2131427602, "field 'bt_cancel_reply'", Button.class);
        this.f16188d = m36738b2;
        m36738b2.setOnClickListener(new AbstractViewOnClickListenerC8521b(this, viewTicketActivity) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.ViewTicketActivity_ViewBinding.2

            /* renamed from: d */
            public final ViewTicketActivity f16191d;

            /* renamed from: e */
            public final ViewTicketActivity_ViewBinding f16192e;

            {
                this.f16192e = this;
                this.f16191d = viewTicketActivity;
            }

            @Override // p316s2.AbstractViewOnClickListenerC8521b
            /* renamed from: b */
            public void mo14535b(View view2) {
                this.f16191d.onViewClicked(view2);
            }
        });
        viewTicketActivity.progress = (SpinKitView) C8522c.m36739c(view, C5876c.f32946j, "field 'progress'", SpinKitView.class);
        viewTicketActivity.tv_title = (TextView) C8522c.m36739c(view, 2131429631, "field 'tv_title'", TextView.class);
        viewTicketActivity.ll_replay = (LinearLayout) C8522c.m36739c(view, 2131428488, "field 'll_replay'", LinearLayout.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        ViewTicketActivity viewTicketActivity = this.f16186b;
        if (viewTicketActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f16186b = null;
        viewTicketActivity.time = null;
        viewTicketActivity.date = null;
        viewTicketActivity.recyclerView = null;
        viewTicketActivity.textNotFound = null;
        viewTicketActivity.btReply = null;
        viewTicketActivity.bt_cancel_reply = null;
        viewTicketActivity.progress = null;
        viewTicketActivity.tv_title = null;
        viewTicketActivity.ll_replay = null;
        this.f16187c.setOnClickListener(null);
        this.f16187c = null;
        this.f16188d.setOnClickListener(null);
        this.f16188d = null;
    }
}

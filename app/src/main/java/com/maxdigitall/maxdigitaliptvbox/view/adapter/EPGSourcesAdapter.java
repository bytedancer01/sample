package com.maxdigitall.maxdigitaliptvbox.view.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.maxdigitall.maxdigitaliptvbox.model.database.EPGSourcesModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.ImportStatusModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.activity.EPGSettingsActivity;
import java.util.ArrayList;
import nf.C6783a;
import p151if.C5251a;
import p151if.C5255e;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/EPGSourcesAdapter.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/EPGSourcesAdapter.class */
public class EPGSourcesAdapter extends RecyclerView.AbstractC0677h<MyViewHolder> {

    /* renamed from: e */
    public final LiveStreamDBHandler f19658e;

    /* renamed from: f */
    public Context f19659f;

    /* renamed from: g */
    public ArrayList<EPGSourcesModel> f19660g;

    /* renamed from: h */
    public MyViewHolder f19661h;

    /* renamed from: i */
    public C6783a f19662i;

    /* renamed from: j */
    public String f19663j;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/EPGSourcesAdapter$MyViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/EPGSourcesAdapter$MyViewHolder.class */
    public static class MyViewHolder extends RecyclerView.AbstractC0674e0 {

        @BindView
        public ImageView iv_checkbox;

        @BindView
        public LinearLayout ll_list_view;

        @BindView
        public LinearLayout ll_status;

        @BindView
        public LinearLayout ll_status_updating;

        @BindView
        public LinearLayout ll_updating;

        @BindView
        public TextView tv_last_updated;

        @BindView
        public TextView tv_source_name;

        @BindView
        public TextView tv_source_url;

        @BindView
        public TextView tv_status;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.m5627b(this, view);
            m4048L(false);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/EPGSourcesAdapter$MyViewHolder_ViewBinding.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/EPGSourcesAdapter$MyViewHolder_ViewBinding.class */
    public class MyViewHolder_ViewBinding implements Unbinder {

        /* renamed from: b */
        public MyViewHolder f19664b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f19664b = myViewHolder;
            myViewHolder.tv_source_name = (TextView) C8522c.m36739c(view, 2131429611, "field 'tv_source_name'", TextView.class);
            myViewHolder.tv_source_url = (TextView) C8522c.m36739c(view, 2131429612, "field 'tv_source_url'", TextView.class);
            myViewHolder.iv_checkbox = (ImageView) C8522c.m36739c(view, 2131428160, "field 'iv_checkbox'", ImageView.class);
            myViewHolder.ll_list_view = (LinearLayout) C8522c.m36739c(view, 2131428433, "field 'll_list_view'", LinearLayout.class);
            myViewHolder.ll_updating = (LinearLayout) C8522c.m36739c(view, 2131428531, "field 'll_updating'", LinearLayout.class);
            myViewHolder.ll_status = (LinearLayout) C8522c.m36739c(view, 2131428514, "field 'll_status'", LinearLayout.class);
            myViewHolder.tv_status = (TextView) C8522c.m36739c(view, 2131429616, "field 'tv_status'", TextView.class);
            myViewHolder.ll_status_updating = (LinearLayout) C8522c.m36739c(view, 2131428516, "field 'll_status_updating'", LinearLayout.class);
            myViewHolder.tv_last_updated = (TextView) C8522c.m36739c(view, 2131429485, "field 'tv_last_updated'", TextView.class);
        }

        @Override // butterknife.Unbinder
        /* renamed from: a */
        public void mo5629a() {
            MyViewHolder myViewHolder = this.f19664b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f19664b = null;
            myViewHolder.tv_source_name = null;
            myViewHolder.tv_source_url = null;
            myViewHolder.iv_checkbox = null;
            myViewHolder.ll_list_view = null;
            myViewHolder.ll_updating = null;
            myViewHolder.ll_status = null;
            myViewHolder.tv_status = null;
            myViewHolder.ll_status_updating = null;
            myViewHolder.tv_last_updated = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/EPGSourcesAdapter$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.EPGSourcesAdapter$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/EPGSourcesAdapter$a.class */
    public class ViewOnClickListenerC3370a implements View.OnClickListener {

        /* renamed from: b */
        public final int f19665b;

        /* renamed from: c */
        public final EPGSourcesAdapter f19666c;

        public ViewOnClickListenerC3370a(EPGSourcesAdapter ePGSourcesAdapter, int i10) {
            this.f19666c = ePGSourcesAdapter;
            this.f19665b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f19666c.f19659f instanceof EPGSettingsActivity) {
                ((EPGSettingsActivity) this.f19666c.f19659f).m15702H0((EPGSourcesModel) this.f19666c.f19660g.get(this.f19665b));
            }
        }
    }

    public EPGSourcesAdapter(Context context, ArrayList<EPGSourcesModel> arrayList) {
        this.f19663j = "mobile";
        ArrayList<EPGSourcesModel> arrayList2 = new ArrayList<>();
        this.f19660g = arrayList2;
        arrayList2.addAll(arrayList);
        this.f19659f = context;
        this.f19658e = new LiveStreamDBHandler(context);
        C6783a c6783a = new C6783a(context);
        this.f19662i = c6783a;
        if (c6783a.m31288z().equals(C5251a.f30065s0)) {
            this.f19663j = "tv";
        } else {
            this.f19663j = "mobile";
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    @SuppressLint({"SetTextI18n"})
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public void mo2996G(MyViewHolder myViewHolder, int i10) {
        TextView textView;
        String string;
        if (this.f19659f != null) {
            int m15121c = this.f19660g.get(i10).m15121c();
            myViewHolder.ll_list_view.setBackground(this.f19659f.getResources().getDrawable(2131231760));
            if (this.f19660g.get(i10).m15119a().equals("1")) {
                String m15122d = this.f19660g.get(i10).m15122d();
                if (this.f19660g.get(i10).m15123e().equals("panel")) {
                    if (C5251a.f30034d.booleanValue()) {
                        myViewHolder.tv_source_name.setText(m15122d + " - " + this.f19659f.getResources().getString(2132017848) + " " + this.f19659f.getResources().getString(2132017548));
                    } else {
                        myViewHolder.tv_source_name.setText(this.f19659f.getResources().getString(2132017848) + " " + this.f19659f.getResources().getString(2132017548));
                    }
                    myViewHolder.tv_source_url.setVisibility(8);
                } else {
                    myViewHolder.tv_source_name.setText(m15122d + " " + this.f19659f.getResources().getString(2132017548));
                    myViewHolder.tv_source_url.setVisibility(0);
                }
                myViewHolder.iv_checkbox.setVisibility(0);
                myViewHolder.iv_checkbox.setImageResource(2131231106);
                Context context = this.f19659f;
                if (context instanceof EPGSettingsActivity) {
                    ((EPGSettingsActivity) context).m15710P0(m15122d);
                }
            } else {
                String m15122d2 = this.f19660g.get(i10).m15122d();
                myViewHolder.iv_checkbox.setImageResource(2131230999);
                myViewHolder.iv_checkbox.setVisibility(8);
                myViewHolder.ll_updating.setVisibility(8);
                myViewHolder.ll_status.setVisibility(8);
                myViewHolder.ll_status_updating.setVisibility(8);
                myViewHolder.tv_last_updated.setVisibility(8);
                if (this.f19660g.get(i10).m15123e().equals("panel")) {
                    if (C5251a.f30034d.booleanValue()) {
                        myViewHolder.tv_source_name.setText(m15122d2 + " - " + this.f19659f.getResources().getString(2132017848));
                    } else {
                        myViewHolder.tv_source_name.setText(this.f19659f.getResources().getString(2132017848));
                    }
                    myViewHolder.tv_source_url.setVisibility(8);
                } else {
                    myViewHolder.tv_source_name.setText(m15122d2);
                    myViewHolder.tv_source_url.setVisibility(0);
                }
            }
            ImportStatusModel m15224i2 = this.f19658e.m15224i2("epg", String.valueOf(m15121c));
            if (m15224i2 != null) {
                if (m15224i2.m15137d() == null || !m15224i2.m15137d().equals("3")) {
                    if (m15224i2.m15137d() != null && m15224i2.m15137d().equals("1")) {
                        myViewHolder.ll_updating.setVisibility(8);
                        myViewHolder.ll_status.setVisibility(0);
                        myViewHolder.tv_status.setText(this.f19659f.getResources().getString(2132017601));
                        myViewHolder.tv_status.setTextColor(this.f19659f.getResources().getColor(2131099866));
                        long j10 = 0;
                        if (m15224i2.m15138e() != null) {
                            j10 = 0;
                            if (!m15224i2.m15138e().equals("")) {
                                j10 = System.currentTimeMillis() - Long.parseLong(m15224i2.m15138e());
                            }
                        }
                        myViewHolder.tv_last_updated.setText(this.f19659f.getResources().getString(2132017898) + " " + C5255e.m26245m0(j10));
                        myViewHolder.tv_last_updated.setVisibility(0);
                        myViewHolder.ll_status_updating.setVisibility(0);
                    } else if ((m15224i2.m15137d() != null && m15224i2.m15137d().equals("0")) || m15224i2.m15137d() == null || !m15224i2.m15137d().equals("2")) {
                        myViewHolder.ll_updating.setVisibility(8);
                        myViewHolder.ll_status.setVisibility(0);
                        textView = myViewHolder.tv_status;
                        string = this.f19659f.getResources().getString(2132018240);
                        textView.setText(string);
                        myViewHolder.tv_status.setTextColor(this.f19659f.getResources().getColor(2131100100));
                        myViewHolder.ll_status_updating.setVisibility(0);
                        myViewHolder.tv_last_updated.setVisibility(8);
                    }
                } else if (Long.valueOf(System.currentTimeMillis() - Long.parseLong(m15224i2.m15138e())).longValue() <= 600000) {
                    myViewHolder.ll_updating.setVisibility(0);
                    myViewHolder.ll_status.setVisibility(8);
                    myViewHolder.ll_status_updating.setVisibility(0);
                    myViewHolder.tv_last_updated.setVisibility(8);
                }
                myViewHolder.ll_updating.setVisibility(8);
                myViewHolder.ll_status.setVisibility(0);
                textView = myViewHolder.tv_status;
                string = this.f19659f.getResources().getString(2132017538);
                textView.setText(string);
                myViewHolder.tv_status.setTextColor(this.f19659f.getResources().getColor(2131100100));
                myViewHolder.ll_status_updating.setVisibility(0);
                myViewHolder.tv_last_updated.setVisibility(8);
            }
            myViewHolder.tv_source_url.setText(this.f19660g.get(i10).m15120b());
            myViewHolder.ll_list_view.setOnClickListener(new ViewOnClickListenerC3370a(this, i10));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder mo2998J(ViewGroup viewGroup, int i10) {
        LayoutInflater from;
        int i11;
        if (this.f19663j.equals(C5251a.f30065s0)) {
            from = LayoutInflater.from(viewGroup.getContext());
            i11 = 2131624191;
        } else {
            from = LayoutInflater.from(viewGroup.getContext());
            i11 = 2131624190;
        }
        MyViewHolder myViewHolder = new MyViewHolder(from.inflate(i11, viewGroup, false));
        this.f19661h = myViewHolder;
        return myViewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        return this.f19660g.size();
    }
}

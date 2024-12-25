package com.maxdigitall.maxdigitaliptvbox.view.adapter;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
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
import java.util.List;
import nf.C6783a;
import p151if.C5251a;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ExternalPlayerAdapter.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ExternalPlayerAdapter.class */
public class ExternalPlayerAdapter extends RecyclerView.AbstractC0677h<ViewHolder> {

    /* renamed from: e */
    public Context f19743e;

    /* renamed from: f */
    public List<ApplicationInfo> f19744f;

    /* renamed from: g */
    public PackageManager f19745g;

    /* renamed from: h */
    public InterfaceC3379b f19746h;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ExternalPlayerAdapter$ViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ExternalPlayerAdapter$ViewHolder.class */
    public class ViewHolder extends RecyclerView.AbstractC0674e0 {

        @BindView
        public ImageView iv_app_logo;

        @BindView
        public LinearLayout ll_outer;

        @BindView
        public TextView tv_appname;

        @BindView
        public TextView tv_packagename;

        /* renamed from: u */
        public final ExternalPlayerAdapter f19747u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ExternalPlayerAdapter externalPlayerAdapter, View view) {
            super(view);
            this.f19747u = externalPlayerAdapter;
            ButterKnife.m5627b(this, view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ExternalPlayerAdapter$ViewHolder_ViewBinding.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ExternalPlayerAdapter$ViewHolder_ViewBinding.class */
    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: b */
        public ViewHolder f19748b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f19748b = viewHolder;
            viewHolder.tv_packagename = (TextView) C8522c.m36739c(view, 2131429548, "field 'tv_packagename'", TextView.class);
            viewHolder.tv_appname = (TextView) C8522c.m36739c(view, 2131429357, "field 'tv_appname'", TextView.class);
            viewHolder.iv_app_logo = (ImageView) C8522c.m36739c(view, 2131428138, "field 'iv_app_logo'", ImageView.class);
            viewHolder.ll_outer = (LinearLayout) C8522c.m36739c(view, 2131428459, "field 'll_outer'", LinearLayout.class);
        }

        @Override // butterknife.Unbinder
        /* renamed from: a */
        public void mo5629a() {
            ViewHolder viewHolder = this.f19748b;
            if (viewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f19748b = null;
            viewHolder.tv_packagename = null;
            viewHolder.tv_appname = null;
            viewHolder.iv_app_logo = null;
            viewHolder.ll_outer = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ExternalPlayerAdapter$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.ExternalPlayerAdapter$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ExternalPlayerAdapter$a.class */
    public class ViewOnClickListenerC3378a implements View.OnClickListener {

        /* renamed from: b */
        public final int f19749b;

        /* renamed from: c */
        public final ExternalPlayerAdapter f19750c;

        public ViewOnClickListenerC3378a(ExternalPlayerAdapter externalPlayerAdapter, int i10) {
            this.f19750c = externalPlayerAdapter;
            this.f19749b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ExternalPlayerAdapter externalPlayerAdapter = this.f19750c;
            externalPlayerAdapter.f19746h.mo15758O(view, ((ApplicationInfo) externalPlayerAdapter.f19744f.get(this.f19749b)).loadLabel(this.f19750c.f19745g).toString(), ((ApplicationInfo) this.f19750c.f19744f.get(this.f19749b)).packageName);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ExternalPlayerAdapter$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.ExternalPlayerAdapter$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/ExternalPlayerAdapter$b.class */
    public interface InterfaceC3379b {
        /* renamed from: O */
        void mo15758O(View view, String str, String str2);
    }

    public ExternalPlayerAdapter(Context context, List<ApplicationInfo> list, InterfaceC3379b interfaceC3379b) {
        this.f19743e = context;
        this.f19744f = list;
        this.f19745g = context.getPackageManager();
        this.f19746h = interfaceC3379b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public void mo2996G(ViewHolder viewHolder, int i10) {
        viewHolder.tv_appname.setText(this.f19744f.get(i10).loadLabel(this.f19745g));
        viewHolder.tv_packagename.setText(this.f19744f.get(i10).packageName);
        viewHolder.iv_app_logo.setImageDrawable(this.f19744f.get(i10).loadIcon(this.f19745g));
        viewHolder.ll_outer.setOnClickListener(new ViewOnClickListenerC3378a(this, i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public ViewHolder mo2998J(ViewGroup viewGroup, int i10) {
        LayoutInflater from;
        int i11;
        if (new C6783a(this.f19743e).m31288z().equals(C5251a.f30065s0)) {
            from = LayoutInflater.from(this.f19743e);
            i11 = 2131624137;
        } else {
            from = LayoutInflater.from(this.f19743e);
            i11 = 2131624136;
        }
        return new ViewHolder(this, from.inflate(i11, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        return this.f19744f.size();
    }
}

package com.maxdigitall.maxdigitaliptvbox.view.adapter;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0304c1;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.maxdigitall.maxdigitaliptvbox.model.database.ExternalPlayerDataBase;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.ExternalPlayerModelClass;
import com.maxdigitall.maxdigitaliptvbox.view.activity.AddedExternalPlayerActivity;
import java.util.List;
import nf.C6783a;
import p151if.C5251a;
import p151if.C5255e;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/AddedExternalPlayerAdapter.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/AddedExternalPlayerAdapter.class */
public class AddedExternalPlayerAdapter extends RecyclerView.AbstractC0677h<ViewHolder> {

    /* renamed from: e */
    public Context f19623e;

    /* renamed from: f */
    public List<ExternalPlayerModelClass> f19624f;

    /* renamed from: g */
    public PackageManager f19625g;

    /* renamed from: h */
    public AddedExternalPlayerActivity f19626h;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/AddedExternalPlayerAdapter$ViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/AddedExternalPlayerAdapter$ViewHolder.class */
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
        public final AddedExternalPlayerAdapter f19627u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(AddedExternalPlayerAdapter addedExternalPlayerAdapter, View view) {
            super(view);
            this.f19627u = addedExternalPlayerAdapter;
            ButterKnife.m5627b(this, view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/AddedExternalPlayerAdapter$ViewHolder_ViewBinding.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/AddedExternalPlayerAdapter$ViewHolder_ViewBinding.class */
    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: b */
        public ViewHolder f19628b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f19628b = viewHolder;
            viewHolder.tv_packagename = (TextView) C8522c.m36739c(view, 2131429548, "field 'tv_packagename'", TextView.class);
            viewHolder.tv_appname = (TextView) C8522c.m36739c(view, 2131429357, "field 'tv_appname'", TextView.class);
            viewHolder.iv_app_logo = (ImageView) C8522c.m36739c(view, 2131428138, "field 'iv_app_logo'", ImageView.class);
            viewHolder.ll_outer = (LinearLayout) C8522c.m36739c(view, 2131428459, "field 'll_outer'", LinearLayout.class);
        }

        @Override // butterknife.Unbinder
        /* renamed from: a */
        public void mo5629a() {
            ViewHolder viewHolder = this.f19628b;
            if (viewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f19628b = null;
            viewHolder.tv_packagename = null;
            viewHolder.tv_appname = null;
            viewHolder.iv_app_logo = null;
            viewHolder.ll_outer = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/AddedExternalPlayerAdapter$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.AddedExternalPlayerAdapter$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/AddedExternalPlayerAdapter$a.class */
    public class ViewOnClickListenerC3360a implements View.OnClickListener {

        /* renamed from: b */
        public final int f19629b;

        /* renamed from: c */
        public final AddedExternalPlayerAdapter f19630c;

        public ViewOnClickListenerC3360a(AddedExternalPlayerAdapter addedExternalPlayerAdapter, int i10) {
            this.f19630c = addedExternalPlayerAdapter;
            this.f19629b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AddedExternalPlayerAdapter addedExternalPlayerAdapter = this.f19630c;
            addedExternalPlayerAdapter.m17053k0(view, ((ExternalPlayerModelClass) addedExternalPlayerAdapter.f19624f.get(this.f19629b)).m15415a(), this.f19629b);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/AddedExternalPlayerAdapter$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.AddedExternalPlayerAdapter$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/AddedExternalPlayerAdapter$b.class */
    public class ViewOnLongClickListenerC3361b implements View.OnLongClickListener {

        /* renamed from: b */
        public final int f19631b;

        /* renamed from: c */
        public final AddedExternalPlayerAdapter f19632c;

        public ViewOnLongClickListenerC3361b(AddedExternalPlayerAdapter addedExternalPlayerAdapter, int i10) {
            this.f19632c = addedExternalPlayerAdapter;
            this.f19631b = i10;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            AddedExternalPlayerAdapter addedExternalPlayerAdapter = this.f19632c;
            addedExternalPlayerAdapter.m17053k0(view, ((ExternalPlayerModelClass) addedExternalPlayerAdapter.f19624f.get(this.f19631b)).m15415a(), this.f19631b);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/AddedExternalPlayerAdapter$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.AddedExternalPlayerAdapter$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/AddedExternalPlayerAdapter$c.class */
    public class C3362c implements C0304c1.d {

        /* renamed from: a */
        public final String f19633a;

        /* renamed from: b */
        public final int f19634b;

        /* renamed from: c */
        public final C0304c1 f19635c;

        /* renamed from: d */
        public final AddedExternalPlayerAdapter f19636d;

        public C3362c(AddedExternalPlayerAdapter addedExternalPlayerAdapter, String str, int i10, C0304c1 c0304c1) {
            this.f19636d = addedExternalPlayerAdapter;
            this.f19633a = str;
            this.f19634b = i10;
            this.f19635c = c0304c1;
        }

        @Override // androidx.appcompat.widget.C0304c1.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (menuItem.getItemId() != 2131428773) {
                return false;
            }
            this.f19636d.m17054l0(this.f19633a, this.f19634b);
            this.f19635c.m1274a();
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/AddedExternalPlayerAdapter$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.AddedExternalPlayerAdapter$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/AddedExternalPlayerAdapter$d.class */
    public class ViewOnClickListenerC3363d implements View.OnClickListener {

        /* renamed from: b */
        public final PopupWindow f19637b;

        /* renamed from: c */
        public final AddedExternalPlayerAdapter f19638c;

        public ViewOnClickListenerC3363d(AddedExternalPlayerAdapter addedExternalPlayerAdapter, PopupWindow popupWindow) {
            this.f19638c = addedExternalPlayerAdapter;
            this.f19637b = popupWindow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PopupWindow popupWindow = this.f19637b;
            if (popupWindow == null || !popupWindow.isShowing()) {
                return;
            }
            this.f19637b.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/AddedExternalPlayerAdapter$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.AddedExternalPlayerAdapter$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/AddedExternalPlayerAdapter$e.class */
    public class ViewOnClickListenerC3364e implements View.OnClickListener {

        /* renamed from: b */
        public final String f19639b;

        /* renamed from: c */
        public final int f19640c;

        /* renamed from: d */
        public final PopupWindow f19641d;

        /* renamed from: e */
        public final AddedExternalPlayerAdapter f19642e;

        public ViewOnClickListenerC3364e(AddedExternalPlayerAdapter addedExternalPlayerAdapter, String str, int i10, PopupWindow popupWindow) {
            this.f19642e = addedExternalPlayerAdapter;
            this.f19639b = str;
            this.f19640c = i10;
            this.f19641d = popupWindow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Context context;
            String str;
            if (new ExternalPlayerDataBase(this.f19642e.f19623e).m15133p(this.f19639b) > 0) {
                this.f19642e.f19624f.remove(this.f19640c);
                this.f19642e.m4099w();
                this.f19642e.m4087B(this.f19640c);
                if (this.f19642e.f19624f != null && this.f19642e.f19624f.size() == 0) {
                    this.f19642e.f19626h.m15566w0();
                }
                context = this.f19642e.f19623e;
                str = this.f19642e.f19623e.getString(2132018477);
            } else {
                context = this.f19642e.f19623e;
                str = " error on Removed player";
            }
            C5255e.m26241k0(context, str);
            PopupWindow popupWindow = this.f19641d;
            if (popupWindow == null || !popupWindow.isShowing()) {
                return;
            }
            this.f19641d.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/AddedExternalPlayerAdapter$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.AddedExternalPlayerAdapter$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/AddedExternalPlayerAdapter$f.class */
    public static class ViewOnFocusChangeListenerC3365f implements View.OnFocusChangeListener {

        /* renamed from: b */
        public View f19643b;

        /* renamed from: c */
        public Activity f19644c;

        /* renamed from: d */
        public Context f19645d;

        public ViewOnFocusChangeListenerC3365f(View view, Context context) {
            this.f19643b = view;
            this.f19645d = context;
        }

        /* renamed from: a */
        public final void m17055a(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f19643b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: b */
        public final void m17056b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f19643b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            int i10;
            float f10 = 1.0f;
            if (!z10) {
                if (z10) {
                    return;
                }
                m17055a(1.0f);
                m17056b(1.0f);
                View view2 = this.f19643b;
                if (view2 != null && view2.getTag() != null && this.f19643b.getTag().equals("1")) {
                    view.setBackgroundResource(2131230845);
                }
                View view3 = this.f19643b;
                if (view3 != null && view3.getTag() != null && this.f19643b.getTag().equals("2")) {
                    view.setBackgroundResource(2131230845);
                }
                View view4 = this.f19643b;
                if (view4 == null || view4.getTag() == null || !this.f19643b.getTag().equals("3")) {
                    return;
                }
                view.setBackgroundResource(2131230845);
                return;
            }
            if (z10) {
                f10 = 1.12f;
            }
            View view5 = this.f19643b;
            if (view5 == null || view5.getTag() == null || !this.f19643b.getTag().equals("1")) {
                View view6 = this.f19643b;
                if (view6 == null || view6.getTag() == null || !this.f19643b.getTag().equals("2")) {
                    View view7 = this.f19643b;
                    if (view7 == null || view7.getTag() == null || !this.f19643b.getTag().equals("3")) {
                        view.setBackground(this.f19644c.getResources().getDrawable(2131231786));
                        return;
                    } else {
                        m17055a(f10);
                        m17056b(f10);
                        i10 = 2131230846;
                    }
                } else {
                    m17055a(f10);
                    m17056b(f10);
                    i10 = 2131231576;
                }
            } else {
                m17055a(f10);
                m17056b(f10);
                i10 = 2131230828;
            }
            view.setBackgroundResource(i10);
        }
    }

    public AddedExternalPlayerAdapter(Context context, List<ExternalPlayerModelClass> list, AddedExternalPlayerActivity addedExternalPlayerActivity) {
        this.f19623e = context;
        this.f19624f = list;
        this.f19625g = context.getPackageManager();
        this.f19626h = addedExternalPlayerActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void mo2996G(ViewHolder viewHolder, int i10) {
        viewHolder.tv_appname.setText(this.f19624f.get(i10).m15415a());
        viewHolder.tv_packagename.setText(this.f19624f.get(i10).m15416b());
        try {
            Drawable applicationIcon = this.f19623e.getPackageManager().getApplicationIcon(this.f19624f.get(i10).m15416b());
            if (applicationIcon != null) {
                viewHolder.iv_app_logo.setImageDrawable(applicationIcon);
            }
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
        }
        viewHolder.ll_outer.setOnClickListener(new ViewOnClickListenerC3360a(this, i10));
        viewHolder.ll_outer.setOnLongClickListener(new ViewOnLongClickListenerC3361b(this, i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public ViewHolder mo2998J(ViewGroup viewGroup, int i10) {
        LayoutInflater from;
        int i11;
        if (new C6783a(this.f19623e).m31288z().equals(C5251a.f30065s0)) {
            from = LayoutInflater.from(this.f19623e);
            i11 = 2131624137;
        } else {
            from = LayoutInflater.from(this.f19623e);
            i11 = 2131624136;
        }
        return new ViewHolder(this, from.inflate(i11, viewGroup, false));
    }

    /* renamed from: k0 */
    public final void m17053k0(View view, String str, int i10) {
        Context context = this.f19623e;
        if (context != null) {
            C0304c1 c0304c1 = new C0304c1(context, view);
            c0304c1.m1277d(2131689494);
            c0304c1.m1279f(new C3362c(this, str, i10, c0304c1));
            c0304c1.m1280g();
        }
    }

    @SuppressLint({"RtlHardcoded"})
    /* renamed from: l0 */
    public final void m17054l0(String str, int i10) {
        try {
            RelativeLayout relativeLayout = (RelativeLayout) ((Activity) this.f19623e).findViewById(2131429028);
            LayoutInflater layoutInflater = (LayoutInflater) this.f19623e.getSystemService("layout_inflater");
            View inflate = new C6783a(this.f19623e).m31288z().equals(C5251a.f30065s0) ? layoutInflater.inflate(2131624469, relativeLayout) : layoutInflater.inflate(2131624468, relativeLayout);
            PopupWindow popupWindow = new PopupWindow(this.f19623e);
            popupWindow.setContentView(inflate);
            popupWindow.setWidth(-1);
            popupWindow.setHeight(-1);
            popupWindow.setFocusable(true);
            popupWindow.showAtLocation(inflate, 17, 0, 0);
            Button button = (Button) inflate.findViewById(2131427653);
            Button button2 = (Button) inflate.findViewById(2131427681);
            button2.setText(this.f19623e.getResources().getString(2132018825));
            button2.setFocusable(true);
            button.setText(this.f19623e.getResources().getString(2132018187));
            button.setFocusable(true);
            ((TextView) inflate.findViewById(2131429415)).setText(this.f19623e.getResources().getString(2132017336));
            button.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3365f(button, this.f19623e));
            button2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3365f(button2, this.f19623e));
            button2.requestFocus();
            button2.requestFocusFromTouch();
            button.setOnClickListener(new ViewOnClickListenerC3363d(this, popupWindow));
            button2.setOnClickListener(new ViewOnClickListenerC3364e(this, str, i10, popupWindow));
        } catch (NullPointerException | Exception e10) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        return this.f19624f.size();
    }
}

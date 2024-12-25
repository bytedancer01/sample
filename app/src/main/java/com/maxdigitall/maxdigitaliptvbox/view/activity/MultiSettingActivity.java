package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0243b;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import nf.C6783a;
import org.apache.http.client.config.CookieSpecs;
import p151if.C5251a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MultiSettingActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MultiSettingActivity.class */
public class MultiSettingActivity extends ActivityC0243b {

    @BindView
    public Button back;

    @BindView
    public Button btn_multi;

    /* renamed from: d */
    public Context f17687d;

    /* renamed from: e */
    public ImageView f17688e;

    /* renamed from: f */
    public ImageView f17689f;

    /* renamed from: g */
    public ImageView f17690g;

    /* renamed from: h */
    public ImageView f17691h;

    /* renamed from: i */
    public ImageView f17692i;

    /* renamed from: j */
    public ImageView f17693j;

    /* renamed from: k */
    public PopupWindow f17694k;

    /* renamed from: l */
    public C6783a f17695l;

    @BindView
    public Button save;

    @BindView
    public ImageView screen_pic;

    @BindView
    public CheckBox showPopup;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MultiSettingActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.MultiSettingActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MultiSettingActivity$a.class */
    public class ViewOnClickListenerC2847a implements View.OnClickListener {

        /* renamed from: b */
        public final MultiSettingActivity f17696b;

        public ViewOnClickListenerC2847a(MultiSettingActivity multiSettingActivity) {
            this.f17696b = multiSettingActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MultiSettingActivity multiSettingActivity = this.f17696b;
            multiSettingActivity.m16063u0(multiSettingActivity.f17687d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MultiSettingActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.MultiSettingActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MultiSettingActivity$b.class */
    public class ViewOnClickListenerC2848b implements View.OnClickListener {

        /* renamed from: b */
        public final MultiSettingActivity f17697b;

        public ViewOnClickListenerC2848b(MultiSettingActivity multiSettingActivity) {
            this.f17697b = multiSettingActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f17697b.m16064v0();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MultiSettingActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.MultiSettingActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MultiSettingActivity$c.class */
    public class ViewOnClickListenerC2849c implements View.OnClickListener {

        /* renamed from: b */
        public final MultiSettingActivity f17698b;

        public ViewOnClickListenerC2849c(MultiSettingActivity multiSettingActivity) {
            this.f17698b = multiSettingActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f17698b.onBackPressed();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MultiSettingActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.MultiSettingActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MultiSettingActivity$d.class */
    public class ViewOnClickListenerC2850d implements View.OnClickListener {

        /* renamed from: b */
        public final Context f17699b;

        /* renamed from: c */
        public final MultiSettingActivity f17700c;

        public ViewOnClickListenerC2850d(MultiSettingActivity multiSettingActivity, Context context) {
            this.f17700c = multiSettingActivity;
            this.f17699b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SharepreferenceDBHandler.m15362Z(CookieSpecs.DEFAULT, this.f17699b);
            MultiSettingActivity multiSettingActivity = this.f17700c;
            multiSettingActivity.screen_pic.setImageDrawable(multiSettingActivity.getResources().getDrawable(2131230978));
            this.f17700c.f17694k.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MultiSettingActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.MultiSettingActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MultiSettingActivity$e.class */
    public class ViewOnClickListenerC2851e implements View.OnClickListener {

        /* renamed from: b */
        public final Context f17701b;

        /* renamed from: c */
        public final MultiSettingActivity f17702c;

        public ViewOnClickListenerC2851e(MultiSettingActivity multiSettingActivity, Context context) {
            this.f17702c = multiSettingActivity;
            this.f17701b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SharepreferenceDBHandler.m15362Z("screen1", this.f17701b);
            MultiSettingActivity multiSettingActivity = this.f17702c;
            multiSettingActivity.screen_pic.setImageDrawable(multiSettingActivity.getResources().getDrawable(2131231770));
            this.f17702c.f17694k.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MultiSettingActivity$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.MultiSettingActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MultiSettingActivity$f.class */
    public class ViewOnClickListenerC2852f implements View.OnClickListener {

        /* renamed from: b */
        public final Context f17703b;

        /* renamed from: c */
        public final MultiSettingActivity f17704c;

        public ViewOnClickListenerC2852f(MultiSettingActivity multiSettingActivity, Context context) {
            this.f17704c = multiSettingActivity;
            this.f17703b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SharepreferenceDBHandler.m15362Z("screen2", this.f17703b);
            MultiSettingActivity multiSettingActivity = this.f17704c;
            multiSettingActivity.screen_pic.setImageDrawable(multiSettingActivity.getResources().getDrawable(2131231771));
            this.f17704c.f17694k.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MultiSettingActivity$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.MultiSettingActivity$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MultiSettingActivity$g.class */
    public class ViewOnClickListenerC2853g implements View.OnClickListener {

        /* renamed from: b */
        public final Context f17705b;

        /* renamed from: c */
        public final MultiSettingActivity f17706c;

        public ViewOnClickListenerC2853g(MultiSettingActivity multiSettingActivity, Context context) {
            this.f17706c = multiSettingActivity;
            this.f17705b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SharepreferenceDBHandler.m15362Z("screen3", this.f17705b);
            MultiSettingActivity multiSettingActivity = this.f17706c;
            multiSettingActivity.screen_pic.setImageDrawable(multiSettingActivity.getResources().getDrawable(2131231772));
            this.f17706c.f17694k.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MultiSettingActivity$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.MultiSettingActivity$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MultiSettingActivity$h.class */
    public class ViewOnClickListenerC2854h implements View.OnClickListener {

        /* renamed from: b */
        public final Context f17707b;

        /* renamed from: c */
        public final MultiSettingActivity f17708c;

        public ViewOnClickListenerC2854h(MultiSettingActivity multiSettingActivity, Context context) {
            this.f17708c = multiSettingActivity;
            this.f17707b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SharepreferenceDBHandler.m15362Z("screen4", this.f17707b);
            MultiSettingActivity multiSettingActivity = this.f17708c;
            multiSettingActivity.screen_pic.setImageDrawable(multiSettingActivity.getResources().getDrawable(2131231773));
            this.f17708c.f17694k.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MultiSettingActivity$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.MultiSettingActivity$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MultiSettingActivity$i.class */
    public class ViewOnClickListenerC2855i implements View.OnClickListener {

        /* renamed from: b */
        public final Context f17709b;

        /* renamed from: c */
        public final MultiSettingActivity f17710c;

        public ViewOnClickListenerC2855i(MultiSettingActivity multiSettingActivity, Context context) {
            this.f17710c = multiSettingActivity;
            this.f17709b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SharepreferenceDBHandler.m15362Z("screen5", this.f17709b);
            MultiSettingActivity multiSettingActivity = this.f17710c;
            multiSettingActivity.screen_pic.setImageDrawable(multiSettingActivity.getResources().getDrawable(2131231774));
            this.f17710c.f17694k.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MultiSettingActivity$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.MultiSettingActivity$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MultiSettingActivity$j.class */
    public class ViewOnFocusChangeListenerC2856j implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f17711b;

        /* renamed from: c */
        public final MultiSettingActivity f17712c;

        public ViewOnFocusChangeListenerC2856j(MultiSettingActivity multiSettingActivity, View view) {
            this.f17712c = multiSettingActivity;
            this.f17711b = view;
        }

        /* renamed from: a */
        public final void m16065a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17711b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m16066b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17711b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m16067c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17711b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            View view2;
            int i10;
            float f10 = 1.09f;
            if (!z10) {
                if (z10) {
                    return;
                }
                if (!z10) {
                    f10 = 1.0f;
                }
                m16066b(f10);
                m16067c(f10);
                m16065a(z10);
                if ((this.f17711b.getTag() == null || !this.f17711b.getTag().equals("1")) && ((this.f17711b.getTag() == null || !this.f17711b.getTag().equals("2")) && (this.f17711b.getTag() == null || !this.f17711b.getTag().equals("3")))) {
                    return;
                }
                this.f17711b.setBackgroundResource(2131230845);
                return;
            }
            if (!z10) {
                f10 = 1.0f;
            }
            if (this.f17711b.getTag() != null && this.f17711b.getTag().equals("1")) {
                view2 = this.f17711b;
                i10 = 2131230846;
            } else if (this.f17711b.getTag() != null && this.f17711b.getTag().equals("2")) {
                view2 = this.f17711b;
                i10 = 2131230828;
            } else {
                if (this.f17711b.getTag() == null || !this.f17711b.getTag().equals("3")) {
                    return;
                }
                view2 = this.f17711b;
                i10 = 2131231576;
            }
            view2.setBackgroundResource(i10);
            m16066b(f10);
            m16067c(f10);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f17687d = this;
        super.onCreate(bundle);
        C6783a c6783a = new C6783a(this.f17687d);
        this.f17695l = c6783a;
        setContentView(c6783a.m31288z().equals(C5251a.f30065s0) ? 2131624015 : 2131624014);
        ButterKnife.m5626a(this);
        m16062t0();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00aa, code lost:
    
        if (r0.equals("screen2") == false) goto L8;
     */
    /* renamed from: t0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m16062t0() {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.MultiSettingActivity.m16062t0():void");
    }

    @SuppressLint({"ResourceType"})
    /* renamed from: u0 */
    public final void m16063u0(Context context) {
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(new C6783a(context).m31288z().equals(C5251a.f30065s0) ? 2131624500 : 2131624499, (LinearLayout) findViewById(2131429110));
        this.f17688e = (ImageView) inflate.findViewById(2131427818);
        this.f17689f = (ImageView) inflate.findViewById(2131429105);
        this.f17690g = (ImageView) inflate.findViewById(2131429106);
        this.f17691h = (ImageView) inflate.findViewById(2131429107);
        this.f17692i = (ImageView) inflate.findViewById(2131429108);
        this.f17693j = (ImageView) inflate.findViewById(2131429109);
        PopupWindow popupWindow = new PopupWindow(context);
        this.f17694k = popupWindow;
        popupWindow.setContentView(inflate);
        this.f17694k.setWidth(-1);
        this.f17694k.setHeight(-1);
        this.f17694k.setFocusable(true);
        this.f17694k.showAtLocation(inflate, 0, 0, 0);
        this.f17688e.setOnClickListener(new ViewOnClickListenerC2850d(this, context));
        this.f17689f.setOnClickListener(new ViewOnClickListenerC2851e(this, context));
        this.f17690g.setOnClickListener(new ViewOnClickListenerC2852f(this, context));
        this.f17691h.setOnClickListener(new ViewOnClickListenerC2853g(this, context));
        this.f17692i.setOnClickListener(new ViewOnClickListenerC2854h(this, context));
        this.f17693j.setOnClickListener(new ViewOnClickListenerC2855i(this, context));
    }

    /* renamed from: v0 */
    public final void m16064v0() {
        Boolean bool = this.showPopup.isChecked() ? Boolean.TRUE : Boolean.FALSE;
        SharepreferenceDBHandler.m15386l0(bool, this.f17687d);
        SharepreferenceDBHandler.m15370d0(bool, this.f17687d);
        Toast.makeText(this.f17687d, getResources().getString(2132018338), 0).show();
        onBackPressed();
    }
}

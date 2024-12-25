package p049d;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p029c.C0920a;
import p137i.AbstractC5134b;
import p235o0.C6823g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:d/g.class
 */
/* renamed from: d.g */
/* loaded from: combined.jar:classes1.jar:d/g.class */
public class DialogC4281g extends Dialog implements InterfaceC4276b {

    /* renamed from: b */
    public AbstractC4277c f26326b;

    /* renamed from: c */
    public final C6823g.a f26327c;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d/g$a.class
     */
    /* renamed from: d.g$a */
    /* loaded from: combined.jar:classes1.jar:d/g$a.class */
    public class a implements C6823g.a {

        /* renamed from: b */
        public final DialogC4281g f26328b;

        public a(DialogC4281g dialogC4281g) {
            this.f26328b = dialogC4281g;
        }

        @Override // p235o0.C6823g.a
        public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
            return this.f26328b.m21648c(keyEvent);
        }
    }

    public DialogC4281g(Context context, int i10) {
        super(context, m21646b(context, i10));
        this.f26327c = new a(this);
        AbstractC4277c m21647a = m21647a();
        m21647a.mo21543E(m21646b(context, i10));
        m21647a.mo21555q(null);
    }

    /* renamed from: b */
    public static int m21646b(Context context, int i10) {
        int i11 = i10;
        if (i10 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(C0920a.f6086A, typedValue, true);
            i11 = typedValue.resourceId;
        }
        return i11;
    }

    @Override // p049d.InterfaceC4276b
    /* renamed from: G */
    public AbstractC5134b mo866G(AbstractC5134b.a aVar) {
        return null;
    }

    /* renamed from: a */
    public AbstractC4277c m21647a() {
        if (this.f26326b == null) {
            this.f26326b = AbstractC4277c.m21535h(this, this);
        }
        return this.f26326b;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m21647a().mo21545d(view, layoutParams);
    }

    /* renamed from: c */
    boolean m21648c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: d */
    public boolean m21649d(int i10) {
        return m21647a().mo21562z(i10);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        m21647a().mo21556r();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C6823g.m31467e(this.f26327c, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i10) {
        return (T) m21647a().mo21548i(i10);
    }

    @Override // p049d.InterfaceC4276b
    /* renamed from: g */
    public void mo869g(AbstractC5134b abstractC5134b) {
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        m21647a().mo21553o();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        m21647a().mo21552n();
        super.onCreate(bundle);
        m21647a().mo21555q(bundle);
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
        m21647a().mo21561w();
    }

    @Override // p049d.InterfaceC4276b
    /* renamed from: s */
    public void mo881s(AbstractC5134b abstractC5134b) {
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        m21647a().mo21539A(i10);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        m21647a().mo21540B(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m21647a().mo21541C(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        m21647a().mo21544F(getContext().getString(i10));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m21647a().mo21544F(charSequence);
    }
}

package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import p029c.C0920a;
import p049d.DialogC4281g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/app/a.class
 */
/* renamed from: androidx.appcompat.app.a */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/app/a.class */
public class DialogC0242a extends DialogC4281g {

    /* renamed from: d */
    public final AlertController f1477d;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/app/a$a.class
     */
    /* renamed from: androidx.appcompat.app.a$a */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/app/a$a.class */
    public static class a {

        /* renamed from: a */
        public final AlertController.C0239f f1478a;

        /* renamed from: b */
        public final int f1479b;

        public a(Context context) {
            this(context, DialogC0242a.m850h(context, 0));
        }

        public a(Context context, int i10) {
            this.f1478a = new AlertController.C0239f(new ContextThemeWrapper(context, DialogC0242a.m850h(context, i10)));
            this.f1479b = i10;
        }

        /* renamed from: a */
        public a m853a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0239f c0239f = this.f1478a;
            c0239f.f1460w = listAdapter;
            c0239f.f1461x = onClickListener;
            return this;
        }

        /* renamed from: b */
        public a m854b(View view) {
            this.f1478a.f1444g = view;
            return this;
        }

        /* renamed from: c */
        public a m855c(int i10) {
            this.f1478a.f1440c = i10;
            return this;
        }

        public DialogC0242a create() {
            DialogC0242a dialogC0242a = new DialogC0242a(this.f1478a.f1438a, this.f1479b);
            this.f1478a.m847a(dialogC0242a.f1477d);
            dialogC0242a.setCancelable(this.f1478a.f1455r);
            if (this.f1478a.f1455r) {
                dialogC0242a.setCanceledOnTouchOutside(true);
            }
            dialogC0242a.setOnCancelListener(this.f1478a.f1456s);
            dialogC0242a.setOnDismissListener(this.f1478a.f1457t);
            DialogInterface.OnKeyListener onKeyListener = this.f1478a.f1458u;
            if (onKeyListener != null) {
                dialogC0242a.setOnKeyListener(onKeyListener);
            }
            return dialogC0242a;
        }

        /* renamed from: d */
        public a m856d(Drawable drawable) {
            this.f1478a.f1441d = drawable;
            return this;
        }

        /* renamed from: e */
        public a m857e(CharSequence charSequence) {
            this.f1478a.f1445h = charSequence;
            return this;
        }

        /* renamed from: f */
        public a m858f(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0239f c0239f = this.f1478a;
            c0239f.f1449l = charSequence;
            c0239f.f1451n = onClickListener;
            return this;
        }

        /* renamed from: g */
        public a m859g(DialogInterface.OnDismissListener onDismissListener) {
            this.f1478a.f1457t = onDismissListener;
            return this;
        }

        public Context getContext() {
            return this.f1478a.f1438a;
        }

        /* renamed from: h */
        public a m860h(DialogInterface.OnKeyListener onKeyListener) {
            this.f1478a.f1458u = onKeyListener;
            return this;
        }

        /* renamed from: i */
        public a m861i(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0239f c0239f = this.f1478a;
            c0239f.f1446i = charSequence;
            c0239f.f1448k = onClickListener;
            return this;
        }

        /* renamed from: j */
        public a m862j(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0239f c0239f = this.f1478a;
            c0239f.f1460w = listAdapter;
            c0239f.f1461x = onClickListener;
            c0239f.f1430I = i10;
            c0239f.f1429H = true;
            return this;
        }

        /* renamed from: k */
        public a m863k(CharSequence[] charSequenceArr, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0239f c0239f = this.f1478a;
            c0239f.f1459v = charSequenceArr;
            c0239f.f1461x = onClickListener;
            c0239f.f1430I = i10;
            c0239f.f1429H = true;
            return this;
        }

        /* renamed from: l */
        public a m864l(int i10) {
            AlertController.C0239f c0239f = this.f1478a;
            c0239f.f1443f = c0239f.f1438a.getText(i10);
            return this;
        }

        /* renamed from: m */
        public DialogC0242a m865m() {
            DialogC0242a create = create();
            create.show();
            return create;
        }

        public a setNegativeButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0239f c0239f = this.f1478a;
            c0239f.f1449l = c0239f.f1438a.getText(i10);
            this.f1478a.f1451n = onClickListener;
            return this;
        }

        public a setPositiveButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0239f c0239f = this.f1478a;
            c0239f.f1446i = c0239f.f1438a.getText(i10);
            this.f1478a.f1448k = onClickListener;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.f1478a.f1443f = charSequence;
            return this;
        }

        public a setView(View view) {
            AlertController.C0239f c0239f = this.f1478a;
            c0239f.f1463z = view;
            c0239f.f1462y = 0;
            c0239f.f1426E = false;
            return this;
        }
    }

    public DialogC0242a(Context context, int i10) {
        super(context, m850h(context, i10));
        this.f1477d = new AlertController(getContext(), this, getWindow());
    }

    /* renamed from: h */
    public static int m850h(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0920a.f6120o, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: e */
    public Button m851e(int i10) {
        return this.f1477d.m822c(i10);
    }

    /* renamed from: f */
    public ListView m852f() {
        return this.f1477d.m824e();
    }

    @Override // p049d.DialogC4281g, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1477d.m825f();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f1477d.m826h(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f1477d.m827i(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // p049d.DialogC4281g, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f1477d.m836r(charSequence);
    }
}

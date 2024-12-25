package p331t5;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:t5/a.class
 */
/* renamed from: t5.a */
/* loaded from: combined.jar:classes1.jar:t5/a.class */
public class C8632a {

    /* renamed from: a */
    public Activity f40298a;

    /* renamed from: b */
    public View f40299b;

    /* renamed from: c */
    public View f40300c;

    /* renamed from: d */
    public Context f40301d;

    /* renamed from: e */
    public SparseArray<View> f40302e = new SparseArray<>();

    public C8632a(Activity activity) {
        this.f40298a = activity;
        this.f40301d = activity.getApplicationContext();
    }

    /* renamed from: a */
    public C8632a m37067a(int i10) {
        View view = this.f40302e.get(i10);
        this.f40300c = view;
        if (view == null) {
            View view2 = this.f40299b;
            this.f40300c = view2 != null ? view2.findViewById(i10) : this.f40298a.findViewById(i10);
            this.f40302e.put(i10, this.f40300c);
        }
        return this;
    }

    /* renamed from: b */
    public C8632a m37068b(CharSequence charSequence) {
        View view = this.f40300c;
        if (view != null && (view instanceof TextView)) {
            ((TextView) view).setText(charSequence);
        }
        return this;
    }

    /* renamed from: c */
    public <T extends View> T m37069c() {
        return (T) this.f40300c;
    }

    /* renamed from: d */
    public C8632a m37070d() {
        View view = this.f40300c;
        if (view != null) {
            view.setVisibility(0);
        }
        return this;
    }
}

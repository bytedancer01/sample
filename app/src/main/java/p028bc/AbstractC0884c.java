package p028bc;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:bc/c.class
 */
/* renamed from: bc.c */
/* loaded from: combined.jar:classes2.jar:bc/c.class */
public abstract class AbstractC0884c {

    /* renamed from: a */
    public TextInputLayout f5977a;

    /* renamed from: b */
    public Context f5978b;

    /* renamed from: c */
    public CheckableImageButton f5979c;

    public AbstractC0884c(TextInputLayout textInputLayout) {
        this.f5977a = textInputLayout;
        this.f5978b = textInputLayout.getContext();
        this.f5979c = textInputLayout.getEndIconView();
    }

    /* renamed from: a */
    public abstract void mo5468a();

    /* renamed from: b */
    public boolean mo5478b(int i10) {
        return true;
    }

    /* renamed from: c */
    public void mo5479c(boolean z10) {
    }

    /* renamed from: d */
    public boolean mo5480d() {
        return false;
    }
}

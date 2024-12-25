package p117h;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:h/a.class
 */
/* renamed from: h.a */
/* loaded from: combined.jar:classes1.jar:h/a.class */
public class C5015a implements TransformationMethod {

    /* renamed from: b */
    public Locale f29048b;

    public C5015a(Context context) {
        this.f29048b = context.getResources().getConfiguration().locale;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        return charSequence != null ? charSequence.toString().toUpperCase(this.f29048b) : null;
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z10, int i10, Rect rect) {
    }
}

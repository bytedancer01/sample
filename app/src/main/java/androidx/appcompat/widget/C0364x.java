package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import p221n0.C6616h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/x.class
 */
/* renamed from: androidx.appcompat.widget.x */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/x.class */
public final class C0364x {

    /* renamed from: a */
    public TextView f2347a;

    /* renamed from: b */
    public TextClassifier f2348b;

    public C0364x(TextView textView) {
        this.f2347a = (TextView) C6616h.m30527e(textView);
    }

    /* renamed from: a */
    public TextClassifier m1678a() {
        Object systemService;
        TextClassifier textClassifier = this.f2348b;
        TextClassifier textClassifier2 = textClassifier;
        if (textClassifier == null) {
            systemService = this.f2347a.getContext().getSystemService((Class<Object>) TextClassificationManager.class);
            TextClassificationManager textClassificationManager = (TextClassificationManager) systemService;
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            textClassifier2 = TextClassifier.NO_OP;
        }
        return textClassifier2;
    }

    /* renamed from: b */
    public void m1679b(TextClassifier textClassifier) {
        this.f2348b = textClassifier;
    }
}

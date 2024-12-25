package androidx.leanback.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ReplacementSpan;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p314s0.C8513u;
import p413y0.C9791d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/c1.class
 */
/* renamed from: androidx.leanback.widget.c1 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/c1.class */
public class C0501c1 extends EditText {

    /* renamed from: g */
    public static final Pattern f3406g = Pattern.compile("\\S+");

    /* renamed from: h */
    public static final Property<C0501c1, Integer> f3407h = new a(Integer.class, "streamPosition");

    /* renamed from: b */
    public final Random f3408b;

    /* renamed from: c */
    public Bitmap f3409c;

    /* renamed from: d */
    public Bitmap f3410d;

    /* renamed from: e */
    public int f3411e;

    /* renamed from: f */
    public ObjectAnimator f3412f;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/c1$a.class
     */
    /* renamed from: androidx.leanback.widget.c1$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/c1$a.class */
    public static final class a extends Property<C0501c1, Integer> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(C0501c1 c0501c1) {
            return Integer.valueOf(c0501c1.getStreamPosition());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(C0501c1 c0501c1, Integer num) {
            c0501c1.setStreamPosition(num.intValue());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/c1$b.class
     */
    /* renamed from: androidx.leanback.widget.c1$b */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/c1$b.class */
    public class b extends ReplacementSpan {

        /* renamed from: b */
        public final int f3413b;

        /* renamed from: c */
        public final int f3414c;

        /* renamed from: d */
        public final C0501c1 f3415d;

        public b(C0501c1 c0501c1, int i10, int i11) {
            this.f3415d = c0501c1;
            this.f3413b = i10;
            this.f3414c = i11;
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
            int measureText = (int) paint.measureText(charSequence, i10, i11);
            int width = this.f3415d.f3409c.getWidth();
            int i15 = width * 2;
            int i16 = measureText / i15;
            int i17 = (measureText % i15) / 2;
            boolean m2571d = C0501c1.m2571d(this.f3415d);
            this.f3415d.f3408b.setSeed(this.f3413b);
            int alpha = paint.getAlpha();
            for (int i18 = 0; i18 < i16; i18++) {
                int i19 = this.f3414c;
                C0501c1 c0501c1 = this.f3415d;
                if (i19 + i18 >= c0501c1.f3411e) {
                    break;
                }
                float f11 = (i18 * i15) + i17 + (width / 2);
                float f12 = m2571d ? ((measureText + f10) - f11) - width : f10 + f11;
                paint.setAlpha((c0501c1.f3408b.nextInt(4) + 1) * 63);
                canvas.drawBitmap(this.f3415d.f3408b.nextBoolean() ? this.f3415d.f3410d : this.f3415d.f3409c, f12, i13 - r8.getHeight(), paint);
            }
            paint.setAlpha(alpha);
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
            return (int) paint.measureText(charSequence, i10, i11);
        }
    }

    public C0501c1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3408b = new Random();
    }

    public C0501c1(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3408b = new Random();
    }

    /* renamed from: d */
    public static boolean m2571d(View view) {
        boolean z10 = true;
        if (1 != view.getLayoutDirection()) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: a */
    public final void m2572a(SpannableStringBuilder spannableStringBuilder, String str, int i10) {
        Matcher matcher = f3406g.matcher(str);
        while (matcher.find()) {
            int start = matcher.start() + i10;
            spannableStringBuilder.setSpan(new b(this, str.charAt(matcher.start()), start), start, matcher.end() + i10, 33);
        }
    }

    /* renamed from: b */
    public final void m2573b() {
        ObjectAnimator objectAnimator = this.f3412f;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: c */
    public final Bitmap m2574c(int i10, float f10) {
        return Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), i10), (int) (r0.getWidth() * f10), (int) (r0.getHeight() * f10), false);
    }

    /* renamed from: e */
    public void mo2517e() {
        this.f3411e = -1;
        m2573b();
        setText("");
    }

    /* renamed from: f */
    public final void m2575f() {
        m2573b();
        int streamPosition = getStreamPosition();
        int length = length();
        int i10 = length - streamPosition;
        if (i10 > 0) {
            if (this.f3412f == null) {
                ObjectAnimator objectAnimator = new ObjectAnimator();
                this.f3412f = objectAnimator;
                objectAnimator.setTarget(this);
                this.f3412f.setProperty(f3407h);
            }
            this.f3412f.setIntValues(streamPosition, length);
            this.f3412f.setDuration(i10 * 50);
            this.f3412f.start();
        }
    }

    /* renamed from: g */
    public void mo2518g(String str, String str2) {
        String str3 = str;
        if (str == null) {
            str3 = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
        if (str2 != null) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str2);
            m2572a(spannableStringBuilder, str2, length);
        }
        this.f3411e = Math.max(str3.length(), this.f3411e);
        m2576h(new SpannedString(spannableStringBuilder));
        m2575f();
    }

    public int getStreamPosition() {
        return this.f3411e;
    }

    /* renamed from: h */
    public final void m2576h(CharSequence charSequence) {
        setText(charSequence);
        bringPointIntoView(length());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f3409c = m2574c(C9791d.f44963e, 1.3f);
        this.f3410d = m2574c(C9791d.f44964f, 1.3f);
        mo2517e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C0501c1.class.getCanonicalName());
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C8513u.m36725q(this, callback));
    }

    public void setFinalRecognizedText(CharSequence charSequence) {
        m2576h(charSequence);
    }

    public void setStreamPosition(int i10) {
        this.f3411e = i10;
        invalidate();
    }
}

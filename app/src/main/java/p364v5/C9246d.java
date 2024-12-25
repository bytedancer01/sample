package p364v5;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Log;
import android.util.Property;
import android.view.animation.Interpolator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import p379w5.InterpolatorC9418b;
import p398x5.AbstractC9668f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:v5/d.class
 */
/* renamed from: v5.d */
/* loaded from: combined.jar:classes1.jar:v5/d.class */
public class C9246d {

    /* renamed from: a */
    public AbstractC9668f f42240a;

    /* renamed from: b */
    public Interpolator f42241b;

    /* renamed from: c */
    public int f42242c = -1;

    /* renamed from: d */
    public long f42243d = 2000;

    /* renamed from: e */
    public int f42244e = 0;

    /* renamed from: f */
    public Map<String, b> f42245f = new HashMap();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:v5/d$a.class
     */
    /* renamed from: v5.d$a */
    /* loaded from: combined.jar:classes1.jar:v5/d$a.class */
    public class a extends b<Float> {

        /* renamed from: e */
        public final C9246d f42246e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C9246d c9246d, float[] fArr, Property property, Float[] fArr2) {
            super(c9246d, fArr, property, fArr2);
            this.f42246e = c9246d;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:v5/d$b.class
     */
    /* renamed from: v5.d$b */
    /* loaded from: combined.jar:classes1.jar:v5/d$b.class */
    public class b<T> {

        /* renamed from: a */
        public float[] f42247a;

        /* renamed from: b */
        public Property f42248b;

        /* renamed from: c */
        public T[] f42249c;

        /* renamed from: d */
        public final C9246d f42250d;

        public b(C9246d c9246d, float[] fArr, Property property, T[] tArr) {
            this.f42250d = c9246d;
            this.f42247a = fArr;
            this.f42248b = property;
            this.f42249c = tArr;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:v5/d$c.class
     */
    /* renamed from: v5.d$c */
    /* loaded from: combined.jar:classes1.jar:v5/d$c.class */
    public class c extends b<Integer> {

        /* renamed from: e */
        public final C9246d f42251e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C9246d c9246d, float[] fArr, Property property, Integer[] numArr) {
            super(c9246d, fArr, property, numArr);
            this.f42251e = c9246d;
        }
    }

    public C9246d(AbstractC9668f abstractC9668f) {
        this.f42240a = abstractC9668f;
    }

    /* renamed from: a */
    public C9246d m38985a(float[] fArr, Integer... numArr) {
        m38991g(fArr, AbstractC9668f.f44064E, numArr);
        return this;
    }

    /* renamed from: b */
    public ObjectAnimator m38986b() {
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[this.f42245f.size()];
        Iterator<Map.Entry<String, b>> it = this.f42245f.entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            b value = it.next().getValue();
            float[] fArr = value.f42247a;
            Keyframe[] keyframeArr = new Keyframe[fArr.length];
            int i11 = this.f42244e;
            float f10 = fArr[i11];
            while (true) {
                int i12 = this.f42244e;
                Object[] objArr = value.f42249c;
                if (i11 < objArr.length + i12) {
                    int i13 = i11 - i12;
                    int length = i11 % objArr.length;
                    float f11 = fArr[length] - f10;
                    float f12 = f11;
                    if (f11 < 0.0f) {
                        f12 = f11 + fArr[fArr.length - 1];
                    }
                    if (value instanceof c) {
                        keyframeArr[i13] = Keyframe.ofInt(f12, ((Integer) objArr[length]).intValue());
                    } else if (value instanceof a) {
                        keyframeArr[i13] = Keyframe.ofFloat(f12, ((Float) objArr[length]).floatValue());
                    } else {
                        keyframeArr[i13] = Keyframe.ofObject(f12, objArr[length]);
                    }
                    i11++;
                }
            }
            propertyValuesHolderArr[i10] = PropertyValuesHolder.ofKeyframe(value.f42248b, keyframeArr);
            i10++;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f42240a, propertyValuesHolderArr);
        ofPropertyValuesHolder.setDuration(this.f42243d);
        ofPropertyValuesHolder.setRepeatCount(this.f42242c);
        ofPropertyValuesHolder.setInterpolator(this.f42241b);
        return ofPropertyValuesHolder;
    }

    /* renamed from: c */
    public C9246d m38987c(long j10) {
        this.f42243d = j10;
        return this;
    }

    /* renamed from: d */
    public C9246d m38988d(float... fArr) {
        m38992h(InterpolatorC9418b.m39770a(fArr));
        return this;
    }

    /* renamed from: e */
    public final void m38989e(int i10, int i11) {
        if (i10 != i11) {
            throw new IllegalStateException(String.format(Locale.getDefault(), "The fractions.length must equal values.length, fraction.length[%d], values.length[%d]", Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }

    /* renamed from: f */
    public final void m38990f(float[] fArr, Property property, Float[] fArr2) {
        m38989e(fArr.length, fArr2.length);
        this.f42245f.put(property.getName(), new a(this, fArr, property, fArr2));
    }

    /* renamed from: g */
    public final void m38991g(float[] fArr, Property property, Integer[] numArr) {
        m38989e(fArr.length, numArr.length);
        this.f42245f.put(property.getName(), new c(this, fArr, property, numArr));
    }

    /* renamed from: h */
    public C9246d m38992h(Interpolator interpolator) {
        this.f42241b = interpolator;
        return this;
    }

    /* renamed from: i */
    public C9246d m38993i(float[] fArr, Integer... numArr) {
        m38991g(fArr, AbstractC9668f.f44067v, numArr);
        return this;
    }

    /* renamed from: j */
    public C9246d m38994j(float[] fArr, Integer... numArr) {
        m38991g(fArr, AbstractC9668f.f44066u, numArr);
        return this;
    }

    /* renamed from: k */
    public C9246d m38995k(float[] fArr, Integer... numArr) {
        m38991g(fArr, AbstractC9668f.f44068w, numArr);
        return this;
    }

    /* renamed from: l */
    public C9246d m38996l(float[] fArr, Float... fArr2) {
        m38990f(fArr, AbstractC9668f.f44063D, fArr2);
        return this;
    }

    /* renamed from: m */
    public C9246d m38997m(float[] fArr, Float... fArr2) {
        m38990f(fArr, AbstractC9668f.f44062C, fArr2);
        return this;
    }

    /* renamed from: n */
    public C9246d m38998n(int i10) {
        int i11 = i10;
        if (i10 < 0) {
            Log.w("SpriteAnimatorBuilder", "startFrame should always be non-negative");
            i11 = 0;
        }
        this.f42244e = i11;
        return this;
    }

    /* renamed from: o */
    public C9246d m38999o(float[] fArr, Float... fArr2) {
        m38990f(fArr, AbstractC9668f.f44071z, fArr2);
        return this;
    }

    /* renamed from: p */
    public C9246d m39000p(float[] fArr, Float... fArr2) {
        m38990f(fArr, AbstractC9668f.f44060A, fArr2);
        return this;
    }
}

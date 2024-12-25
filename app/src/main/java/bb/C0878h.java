package bb;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p294r.C7936i;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:bb/h.class
 */
/* renamed from: bb.h */
/* loaded from: combined.jar:classes2.jar:bb/h.class */
public class C0878h {

    /* renamed from: a */
    public final C7936i<String, C0879i> f5964a = new C7936i<>();

    /* renamed from: b */
    public final C7936i<String, PropertyValuesHolder[]> f5965b = new C7936i<>();

    /* renamed from: a */
    public static void m5449a(C0878h c0878h, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c0878h.m5456h(objectAnimator.getPropertyName(), objectAnimator.getValues());
            c0878h.m5457i(objectAnimator.getPropertyName(), C0879i.m5458b(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    /* renamed from: b */
    public static C0878h m5450b(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return m5451c(context, resourceId);
    }

    /* renamed from: c */
    public static C0878h m5451c(Context context, int i10) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (loadAnimator instanceof AnimatorSet) {
                return m5452d(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m5452d(arrayList);
        } catch (Exception e10) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i10), e10);
            return null;
        }
    }

    /* renamed from: d */
    public static C0878h m5452d(List<Animator> list) {
        C0878h c0878h = new C0878h();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            m5449a(c0878h, list.get(i10));
        }
        return c0878h;
    }

    /* renamed from: e */
    public C0879i m5453e(String str) {
        if (m5455g(str)) {
            return this.f5964a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0878h) {
            return this.f5964a.equals(((C0878h) obj).f5964a);
        }
        return false;
    }

    /* renamed from: f */
    public long m5454f() {
        int size = this.f5964a.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            C0879i m34443n = this.f5964a.m34443n(i10);
            j10 = Math.max(j10, m34443n.m5461c() + m34443n.m5462d());
        }
        return j10;
    }

    /* renamed from: g */
    public boolean m5455g(String str) {
        return this.f5964a.get(str) != null;
    }

    /* renamed from: h */
    public void m5456h(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f5965b.put(str, propertyValuesHolderArr);
    }

    public int hashCode() {
        return this.f5964a.hashCode();
    }

    /* renamed from: i */
    public void m5457i(String str, C0879i c0879i) {
        this.f5964a.put(str, c0879i);
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f5964a + "}\n";
    }
}

package bb;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:bb/i.class
 */
/* renamed from: bb.i */
/* loaded from: combined.jar:classes2.jar:bb/i.class */
public class C0879i {

    /* renamed from: a */
    public long f5966a;

    /* renamed from: b */
    public long f5967b;

    /* renamed from: c */
    public TimeInterpolator f5968c;

    /* renamed from: d */
    public int f5969d;

    /* renamed from: e */
    public int f5970e;

    public C0879i(long j10, long j11) {
        this.f5968c = null;
        this.f5969d = 0;
        this.f5970e = 1;
        this.f5966a = j10;
        this.f5967b = j11;
    }

    public C0879i(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f5969d = 0;
        this.f5970e = 1;
        this.f5966a = j10;
        this.f5967b = j11;
        this.f5968c = timeInterpolator;
    }

    /* renamed from: b */
    public static C0879i m5458b(ValueAnimator valueAnimator) {
        C0879i c0879i = new C0879i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m5459f(valueAnimator));
        c0879i.f5969d = valueAnimator.getRepeatCount();
        c0879i.f5970e = valueAnimator.getRepeatMode();
        return c0879i;
    }

    /* renamed from: f */
    public static TimeInterpolator m5459f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return C0871a.f5952b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return C0871a.f5953c;
        }
        TimeInterpolator timeInterpolator = interpolator;
        if (interpolator instanceof DecelerateInterpolator) {
            timeInterpolator = C0871a.f5954d;
        }
        return timeInterpolator;
    }

    /* renamed from: a */
    public void m5460a(Animator animator) {
        animator.setStartDelay(m5461c());
        animator.setDuration(m5462d());
        animator.setInterpolator(m5463e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(m5464g());
            valueAnimator.setRepeatMode(m5465h());
        }
    }

    /* renamed from: c */
    public long m5461c() {
        return this.f5966a;
    }

    /* renamed from: d */
    public long m5462d() {
        return this.f5967b;
    }

    /* renamed from: e */
    public TimeInterpolator m5463e() {
        TimeInterpolator timeInterpolator = this.f5968c;
        if (timeInterpolator == null) {
            timeInterpolator = C0871a.f5952b;
        }
        return timeInterpolator;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0879i)) {
            return false;
        }
        C0879i c0879i = (C0879i) obj;
        if (m5461c() == c0879i.m5461c() && m5462d() == c0879i.m5462d() && m5464g() == c0879i.m5464g() && m5465h() == c0879i.m5465h()) {
            return m5463e().getClass().equals(c0879i.m5463e().getClass());
        }
        return false;
    }

    /* renamed from: g */
    public int m5464g() {
        return this.f5969d;
    }

    /* renamed from: h */
    public int m5465h() {
        return this.f5970e;
    }

    public int hashCode() {
        return (((((((((int) (m5461c() ^ (m5461c() >>> 32))) * 31) + ((int) (m5462d() ^ (m5462d() >>> 32)))) * 31) + m5463e().getClass().hashCode()) * 31) + m5464g()) * 31) + m5465h();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + m5461c() + " duration: " + m5462d() + " interpolator: " + m5463e().getClass() + " repeatCount: " + m5464g() + " repeatMode: " + m5465h() + "}\n";
    }
}

package p262p1;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.navigation.C0631k;
import androidx.navigation.InterfaceC0617b;
import androidx.navigation.NavController;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p086f.C4736d;
import p359v0.InterfaceC9221c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:p1/a.class
 */
/* renamed from: p1.a */
/* loaded from: combined.jar:classes1.jar:p1/a.class */
public abstract class AbstractC7539a implements NavController.InterfaceC0615b {

    /* renamed from: a */
    public final Context f36371a;

    /* renamed from: b */
    public final Set<Integer> f36372b;

    /* renamed from: c */
    public final WeakReference<InterfaceC9221c> f36373c;

    /* renamed from: d */
    public C4736d f36374d;

    /* renamed from: e */
    public ValueAnimator f36375e;

    public AbstractC7539a(Context context, C7540b c7540b) {
        this.f36371a = context;
        this.f36372b = c7540b.m32270c();
        InterfaceC9221c m32269b = c7540b.m32269b();
        if (m32269b != null) {
            this.f36373c = new WeakReference<>(m32269b);
        } else {
            this.f36373c = null;
        }
    }

    @Override // androidx.navigation.NavController.InterfaceC0615b
    /* renamed from: a */
    public void mo3463a(NavController navController, C0631k c0631k, Bundle bundle) {
        if (c0631k instanceof InterfaceC0617b) {
            return;
        }
        WeakReference<InterfaceC9221c> weakReference = this.f36373c;
        InterfaceC9221c interfaceC9221c = weakReference != null ? weakReference.get() : null;
        if (this.f36373c != null && interfaceC9221c == null) {
            navController.m3460x(this);
            return;
        }
        CharSequence m3570w = c0631k.m3570w();
        boolean z10 = true;
        if (m3570w != null) {
            StringBuffer stringBuffer = new StringBuffer();
            Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(m3570w);
            while (matcher.find()) {
                String group = matcher.group(1);
                if (bundle == null || !bundle.containsKey(group)) {
                    throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill label " + ((Object) m3570w));
                }
                matcher.appendReplacement(stringBuffer, "");
                stringBuffer.append(bundle.get(group).toString());
            }
            matcher.appendTail(stringBuffer);
            mo32267d(stringBuffer);
        }
        boolean m32274b = C7541c.m32274b(c0631k, this.f36372b);
        if (interfaceC9221c == null && m32274b) {
            mo32266c(null, 0);
            return;
        }
        if (interfaceC9221c == null || !m32274b) {
            z10 = false;
        }
        m32265b(z10);
    }

    /* renamed from: b */
    public final void m32265b(boolean z10) {
        boolean z11;
        if (this.f36374d == null) {
            this.f36374d = new C4736d(this.f36371a);
            z11 = false;
        } else {
            z11 = true;
        }
        mo32266c(this.f36374d, z10 ? C7542d.f36385b : C7542d.f36384a);
        float f10 = z10 ? 0.0f : 1.0f;
        if (!z11) {
            this.f36374d.setProgress(f10);
            return;
        }
        float m23954a = this.f36374d.m23954a();
        ValueAnimator valueAnimator = this.f36375e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f36374d, "progress", m23954a, f10);
        this.f36375e = ofFloat;
        ofFloat.start();
    }

    /* renamed from: c */
    public abstract void mo32266c(Drawable drawable, int i10);

    /* renamed from: d */
    public abstract void mo32267d(CharSequence charSequence);
}

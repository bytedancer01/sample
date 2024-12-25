package p306rb;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p351ub.AbstractC9151f;
import p351ub.C9149d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:rb/h.class
 */
/* renamed from: rb.h */
/* loaded from: combined.jar:classes2.jar:rb/h.class */
public class C8456h {

    /* renamed from: c */
    public float f39537c;

    /* renamed from: f */
    public C9149d f39540f;

    /* renamed from: a */
    public final TextPaint f39535a = new TextPaint(1);

    /* renamed from: b */
    public final AbstractC9151f f39536b = new a(this);

    /* renamed from: d */
    public boolean f39538d = true;

    /* renamed from: e */
    public WeakReference<b> f39539e = new WeakReference<>(null);

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:rb/h$a.class
     */
    /* renamed from: rb.h$a */
    /* loaded from: combined.jar:classes2.jar:rb/h$a.class */
    public class a extends AbstractC9151f {

        /* renamed from: a */
        public final C8456h f39541a;

        public a(C8456h c8456h) {
            this.f39541a = c8456h;
        }

        @Override // p351ub.AbstractC9151f
        /* renamed from: a */
        public void mo13465a(int i10) {
            this.f39541a.f39538d = true;
            b bVar = (b) this.f39541a.f39539e.get();
            if (bVar != null) {
                bVar.mo13563a();
            }
        }

        @Override // p351ub.AbstractC9151f
        /* renamed from: b */
        public void mo13466b(Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            this.f39541a.f39538d = true;
            b bVar = (b) this.f39541a.f39539e.get();
            if (bVar != null) {
                bVar.mo13563a();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:rb/h$b.class
     */
    /* renamed from: rb.h$b */
    /* loaded from: combined.jar:classes2.jar:rb/h$b.class */
    public interface b {
        /* renamed from: a */
        void mo13563a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C8456h(b bVar) {
        m36327g(bVar);
    }

    /* renamed from: c */
    public final float m36323c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f39535a.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: d */
    public C9149d m36324d() {
        return this.f39540f;
    }

    /* renamed from: e */
    public TextPaint m36325e() {
        return this.f39535a;
    }

    /* renamed from: f */
    public float m36326f(String str) {
        if (!this.f39538d) {
            return this.f39537c;
        }
        float m36323c = m36323c(str);
        this.f39537c = m36323c;
        this.f39538d = false;
        return m36323c;
    }

    /* renamed from: g */
    public void m36327g(b bVar) {
        this.f39539e = new WeakReference<>(bVar);
    }

    /* renamed from: h */
    public void m36328h(C9149d c9149d, Context context) {
        if (this.f39540f != c9149d) {
            this.f39540f = c9149d;
            if (c9149d != null) {
                c9149d.m38494k(context, this.f39535a, this.f39536b);
                b bVar = this.f39539e.get();
                if (bVar != null) {
                    this.f39535a.drawableState = bVar.getState();
                }
                c9149d.m38493j(context, this.f39535a, this.f39536b);
                this.f39538d = true;
            }
            b bVar2 = this.f39539e.get();
            if (bVar2 != null) {
                bVar2.mo13563a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    /* renamed from: i */
    public void m36329i(boolean z10) {
        this.f39538d = z10;
    }

    /* renamed from: j */
    public void m36330j(Context context) {
        this.f39540f.m38493j(context, this.f39535a, this.f39536b);
    }
}

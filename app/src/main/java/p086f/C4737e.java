package p086f;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import p086f.C4734b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:f/e.class
 */
@SuppressLint({"RestrictedAPI"})
/* renamed from: f.e */
/* loaded from: combined.jar:classes1.jar:f/e.class */
public class C4737e extends C4734b {

    /* renamed from: n */
    public a f27962n;

    /* renamed from: o */
    public boolean f27963o;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:f/e$a.class
     */
    /* renamed from: f.e$a */
    /* loaded from: combined.jar:classes1.jar:f/e$a.class */
    public static class a extends C4734b.d {

        /* renamed from: J */
        public int[][] f27964J;

        /* JADX WARN: Type inference failed for: r1v3, types: [int[], int[][]] */
        public a(a aVar, C4737e c4737e, Resources resources) {
            super(aVar, c4737e, resources);
            if (aVar != null) {
                this.f27964J = aVar.f27964J;
            } else {
                this.f27964J = new int[m23932f()];
            }
        }

        /* renamed from: A */
        public int m23960A(int[] iArr) {
            int[][] iArr2 = this.f27964J;
            int m23934h = m23934h();
            for (int i10 = 0; i10 < m23934h; i10++) {
                if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C4737e(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C4737e(this, resources);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [int[], int[][], java.lang.Object] */
        @Override // p086f.C4734b.d
        /* renamed from: o */
        public void mo23941o(int i10, int i11) {
            super.mo23941o(i10, i11);
            ?? r02 = new int[i11];
            System.arraycopy(this.f27964J, 0, r02, 0, i10);
            this.f27964J = r02;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [int[], int[][]] */
        @Override // p086f.C4734b.d
        /* renamed from: r */
        public void mo23910r() {
            int[][] iArr = this.f27964J;
            ?? r02 = new int[iArr.length];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[] iArr2 = this.f27964J[length];
                r02[length] = iArr2 != null ? (int[]) iArr2.clone() : null;
            }
            this.f27964J = r02;
        }

        /* renamed from: z */
        public int m23961z(int[] iArr, Drawable drawable) {
            int m23927a = m23927a(drawable);
            this.f27964J[m23927a] = iArr;
            return m23927a;
        }
    }

    public C4737e(a aVar) {
        if (aVar != null) {
            mo23890h(aVar);
        }
    }

    public C4737e(a aVar, Resources resources) {
        mo23890h(new a(aVar, this, resources));
        onStateChange(getState());
    }

    @Override // p086f.C4734b, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // p086f.C4734b
    /* renamed from: h */
    public void mo23890h(C4734b.d dVar) {
        super.mo23890h(dVar);
        if (dVar instanceof a) {
            this.f27962n = (a) dVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p086f.C4734b
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public a mo23889b() {
        return new a(this.f27962n, this, null);
    }

    /* renamed from: k */
    public int[] m23959k(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i11;
            if (i10 >= attributeCount) {
                return StateSet.trimStateSet(iArr, i12);
            }
            int attributeNameResource = attributeSet.getAttributeNameResource(i10);
            int i13 = i12;
            if (attributeNameResource != 0) {
                i13 = i12;
                if (attributeNameResource != 16842960) {
                    i13 = i12;
                    if (attributeNameResource != 16843161) {
                        iArr[i12] = attributeSet.getAttributeBooleanValue(i10, false) ? attributeNameResource : -attributeNameResource;
                        i13 = i12 + 1;
                    }
                }
            }
            i10++;
            i11 = i13;
        }
    }

    @Override // p086f.C4734b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f27963o && super.mutate() == this) {
            this.f27962n.mo23910r();
            this.f27963o = true;
        }
        return this;
    }

    @Override // p086f.C4734b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int m23960A = this.f27962n.m23960A(iArr);
        int i10 = m23960A;
        if (m23960A < 0) {
            i10 = this.f27962n.m23960A(StateSet.WILD_CARD);
        }
        return m23920g(i10) || onStateChange;
    }
}

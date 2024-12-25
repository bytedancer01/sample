package p003a2;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p003a2.AbstractC0027l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a2/p.class
 */
/* renamed from: a2.p */
/* loaded from: combined.jar:classes1.jar:a2/p.class */
public class C0035p extends AbstractC0027l {

    /* renamed from: M */
    public int f160M;

    /* renamed from: K */
    public ArrayList<AbstractC0027l> f158K = new ArrayList<>();

    /* renamed from: L */
    public boolean f159L = true;

    /* renamed from: N */
    public boolean f161N = false;

    /* renamed from: O */
    public int f162O = 0;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a2/p$a.class
     */
    /* renamed from: a2.p$a */
    /* loaded from: combined.jar:classes1.jar:a2/p$a.class */
    public class a extends C0029m {

        /* renamed from: b */
        public final AbstractC0027l f163b;

        /* renamed from: c */
        public final C0035p f164c;

        public a(C0035p c0035p, AbstractC0027l abstractC0027l) {
            this.f164c = c0035p;
            this.f163b = abstractC0027l;
        }

        @Override // p003a2.AbstractC0027l.f
        /* renamed from: d */
        public void mo66d(AbstractC0027l abstractC0027l) {
            this.f163b.mo138Z();
            abstractC0027l.mo134V(this);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a2/p$b.class
     */
    /* renamed from: a2.p$b */
    /* loaded from: combined.jar:classes1.jar:a2/p$b.class */
    public static class b extends C0029m {

        /* renamed from: b */
        public C0035p f165b;

        public b(C0035p c0035p) {
            this.f165b = c0035p;
        }

        @Override // p003a2.C0029m, p003a2.AbstractC0027l.f
        /* renamed from: a */
        public void mo98a(AbstractC0027l abstractC0027l) {
            C0035p c0035p = this.f165b;
            if (c0035p.f161N) {
                return;
            }
            c0035p.m149g0();
            this.f165b.f161N = true;
        }

        @Override // p003a2.AbstractC0027l.f
        /* renamed from: d */
        public void mo66d(AbstractC0027l abstractC0027l) {
            C0035p c0035p = this.f165b;
            int i10 = c0035p.f160M - 1;
            c0035p.f160M = i10;
            if (i10 == 0) {
                c0035p.f161N = false;
                c0035p.m157p();
            }
            abstractC0027l.mo134V(this);
        }
    }

    @Override // p003a2.AbstractC0027l
    /* renamed from: T */
    public void mo132T(View view) {
        super.mo132T(view);
        int size = this.f158K.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f158K.get(i10).mo132T(view);
        }
    }

    @Override // p003a2.AbstractC0027l
    /* renamed from: X */
    public void mo136X(View view) {
        super.mo136X(view);
        int size = this.f158K.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f158K.get(i10).mo136X(view);
        }
    }

    @Override // p003a2.AbstractC0027l
    /* renamed from: Z */
    public void mo138Z() {
        if (this.f158K.isEmpty()) {
            m149g0();
            m157p();
            return;
        }
        m189u0();
        if (this.f159L) {
            Iterator<AbstractC0027l> it = this.f158K.iterator();
            while (it.hasNext()) {
                it.next().mo138Z();
            }
            return;
        }
        for (int i10 = 1; i10 < this.f158K.size(); i10++) {
            this.f158K.get(i10 - 1).mo139a(new a(this, this.f158K.get(i10)));
        }
        AbstractC0027l abstractC0027l = this.f158K.get(0);
        if (abstractC0027l != null) {
            abstractC0027l.mo138Z();
        }
    }

    @Override // p003a2.AbstractC0027l
    /* renamed from: b0 */
    public void mo142b0(AbstractC0027l.e eVar) {
        super.mo142b0(eVar);
        this.f162O |= 8;
        int size = this.f158K.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f158K.get(i10).mo142b0(eVar);
        }
    }

    @Override // p003a2.AbstractC0027l
    public void cancel() {
        super.cancel();
        int size = this.f158K.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f158K.get(i10).cancel();
        }
    }

    @Override // p003a2.AbstractC0027l
    /* renamed from: d0 */
    public void mo145d0(AbstractC0017g abstractC0017g) {
        super.mo145d0(abstractC0017g);
        this.f162O |= 4;
        if (this.f158K != null) {
            for (int i10 = 0; i10 < this.f158K.size(); i10++) {
                this.f158K.get(i10).mo145d0(abstractC0017g);
            }
        }
    }

    @Override // p003a2.AbstractC0027l
    /* renamed from: e0 */
    public void mo147e0(AbstractC0033o abstractC0033o) {
        super.mo147e0(abstractC0033o);
        this.f162O |= 2;
        int size = this.f158K.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f158K.get(i10).mo147e0(abstractC0033o);
        }
    }

    @Override // p003a2.AbstractC0027l
    /* renamed from: g */
    public void mo47g(C0039s c0039s) {
        if (m126M(c0039s.f170b)) {
            Iterator<AbstractC0027l> it = this.f158K.iterator();
            while (it.hasNext()) {
                AbstractC0027l next = it.next();
                if (next.m126M(c0039s.f170b)) {
                    next.mo47g(c0039s);
                    c0039s.f171c.add(next);
                }
            }
        }
    }

    @Override // p003a2.AbstractC0027l
    /* renamed from: h0 */
    public String mo151h0(String str) {
        String mo151h0 = super.mo151h0(str);
        for (int i10 = 0; i10 < this.f158K.size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(mo151h0);
            sb2.append("\n");
            sb2.append(this.f158K.get(i10).mo151h0(str + "  "));
            mo151h0 = sb2.toString();
        }
        return mo151h0;
    }

    @Override // p003a2.AbstractC0027l
    /* renamed from: i */
    public void mo152i(C0039s c0039s) {
        super.mo152i(c0039s);
        int size = this.f158K.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f158K.get(i10).mo152i(c0039s);
        }
    }

    @Override // p003a2.AbstractC0027l
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public C0035p mo139a(AbstractC0027l.f fVar) {
        return (C0035p) super.mo139a(fVar);
    }

    @Override // p003a2.AbstractC0027l
    /* renamed from: j */
    public void mo49j(C0039s c0039s) {
        if (m126M(c0039s.f170b)) {
            Iterator<AbstractC0027l> it = this.f158K.iterator();
            while (it.hasNext()) {
                AbstractC0027l next = it.next();
                if (next.m126M(c0039s.f170b)) {
                    next.mo49j(c0039s);
                    c0039s.f171c.add(next);
                }
            }
        }
    }

    @Override // p003a2.AbstractC0027l
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public C0035p mo141b(View view) {
        for (int i10 = 0; i10 < this.f158K.size(); i10++) {
            this.f158K.get(i10).mo141b(view);
        }
        return (C0035p) super.mo141b(view);
    }

    /* renamed from: k0 */
    public C0035p m179k0(AbstractC0027l abstractC0027l) {
        m180l0(abstractC0027l);
        long j10 = this.f97d;
        if (j10 >= 0) {
            abstractC0027l.mo140a0(j10);
        }
        if ((this.f162O & 1) != 0) {
            abstractC0027l.mo144c0(m160u());
        }
        if ((this.f162O & 2) != 0) {
            m118C();
            abstractC0027l.mo147e0(null);
        }
        if ((this.f162O & 4) != 0) {
            abstractC0027l.mo145d0(m117A());
        }
        if ((this.f162O & 8) != 0) {
            abstractC0027l.mo142b0(m159s());
        }
        return this;
    }

    /* renamed from: l0 */
    public final void m180l0(AbstractC0027l abstractC0027l) {
        this.f158K.add(abstractC0027l);
        abstractC0027l.f112s = this;
    }

    @Override // p003a2.AbstractC0027l
    /* renamed from: m */
    public AbstractC0027l clone() {
        C0035p c0035p = (C0035p) super.clone();
        c0035p.f158K = new ArrayList<>();
        int size = this.f158K.size();
        for (int i10 = 0; i10 < size; i10++) {
            c0035p.m180l0(this.f158K.get(i10).clone());
        }
        return c0035p;
    }

    /* renamed from: m0 */
    public AbstractC0027l m181m0(int i10) {
        if (i10 < 0 || i10 >= this.f158K.size()) {
            return null;
        }
        return this.f158K.get(i10);
    }

    /* renamed from: n0 */
    public int m182n0() {
        return this.f158K.size();
    }

    @Override // p003a2.AbstractC0027l
    /* renamed from: o */
    public void mo156o(ViewGroup viewGroup, C0040t c0040t, C0040t c0040t2, ArrayList<C0039s> arrayList, ArrayList<C0039s> arrayList2) {
        long m119E = m119E();
        int size = this.f158K.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC0027l abstractC0027l = this.f158K.get(i10);
            if (m119E > 0 && (this.f159L || i10 == 0)) {
                long m119E2 = abstractC0027l.m119E();
                if (m119E2 > 0) {
                    abstractC0027l.mo148f0(m119E2 + m119E);
                } else {
                    abstractC0027l.mo148f0(m119E);
                }
            }
            abstractC0027l.mo156o(viewGroup, c0040t, c0040t2, arrayList, arrayList2);
        }
    }

    @Override // p003a2.AbstractC0027l
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public C0035p mo134V(AbstractC0027l.f fVar) {
        return (C0035p) super.mo134V(fVar);
    }

    @Override // p003a2.AbstractC0027l
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public C0035p mo135W(View view) {
        for (int i10 = 0; i10 < this.f158K.size(); i10++) {
            this.f158K.get(i10).mo135W(view);
        }
        return (C0035p) super.mo135W(view);
    }

    @Override // p003a2.AbstractC0027l
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public C0035p mo140a0(long j10) {
        ArrayList<AbstractC0027l> arrayList;
        super.mo140a0(j10);
        if (this.f97d >= 0 && (arrayList = this.f158K) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f158K.get(i10).mo140a0(j10);
            }
        }
        return this;
    }

    @Override // p003a2.AbstractC0027l
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public C0035p mo144c0(TimeInterpolator timeInterpolator) {
        this.f162O |= 1;
        ArrayList<AbstractC0027l> arrayList = this.f158K;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f158K.get(i10).mo144c0(timeInterpolator);
            }
        }
        return (C0035p) super.mo144c0(timeInterpolator);
    }

    /* renamed from: s0 */
    public C0035p m187s0(int i10) {
        if (i10 == 0) {
            this.f159L = true;
        } else {
            if (i10 != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
            }
            this.f159L = false;
        }
        return this;
    }

    @Override // p003a2.AbstractC0027l
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public C0035p mo148f0(long j10) {
        return (C0035p) super.mo148f0(j10);
    }

    /* renamed from: u0 */
    public final void m189u0() {
        b bVar = new b(this);
        Iterator<AbstractC0027l> it = this.f158K.iterator();
        while (it.hasNext()) {
            it.next().mo139a(bVar);
        }
        this.f160M = this.f158K.size();
    }
}

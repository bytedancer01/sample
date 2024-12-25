package p052d2;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:d2/a.class
 */
/* renamed from: d2.a */
/* loaded from: combined.jar:classes1.jar:d2/a.class */
public abstract class AbstractC4300a {

    /* renamed from: a */
    public final DataSetObservable f26418a = new DataSetObservable();

    /* renamed from: b */
    public DataSetObserver f26419b;

    /* renamed from: a */
    public abstract void mo2300a(ViewGroup viewGroup, int i10, Object obj);

    /* renamed from: b */
    public abstract void mo2301b(ViewGroup viewGroup);

    /* renamed from: c */
    public abstract int mo21760c();

    /* renamed from: d */
    public int m21761d(Object obj) {
        return -1;
    }

    /* renamed from: e */
    public CharSequence mo21762e(int i10) {
        return null;
    }

    /* renamed from: f */
    public float m21763f(int i10) {
        return 1.0f;
    }

    /* renamed from: g */
    public abstract Object mo2302g(ViewGroup viewGroup, int i10);

    /* renamed from: h */
    public abstract boolean mo2303h(View view, Object obj);

    /* renamed from: i */
    public void m21764i(DataSetObserver dataSetObserver) {
        this.f26418a.registerObserver(dataSetObserver);
    }

    /* renamed from: j */
    public abstract void mo2304j(Parcelable parcelable, ClassLoader classLoader);

    /* renamed from: k */
    public abstract Parcelable mo2305k();

    /* renamed from: l */
    public abstract void mo2306l(ViewGroup viewGroup, int i10, Object obj);

    /* renamed from: m */
    public void m21765m(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f26419b = dataSetObserver;
        }
    }

    /* renamed from: n */
    public abstract void mo2307n(ViewGroup viewGroup);

    /* renamed from: o */
    public void m21766o(DataSetObserver dataSetObserver) {
        this.f26418a.unregisterObserver(dataSetObserver);
    }
}

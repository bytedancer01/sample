package ua;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/r.class
 */
/* renamed from: ua.r */
/* loaded from: combined.jar:classes2.jar:ua/r.class */
public final class C9044r extends AbstractC10125a implements Iterable<String> {
    public static final Parcelable.Creator<C9044r> CREATOR = new C9056s();

    /* renamed from: d */
    public final Bundle f41588d;

    public C9044r(Bundle bundle) {
        this.f41588d = bundle;
    }

    /* renamed from: P */
    public final Long m38207P(String str) {
        return Long.valueOf(this.f41588d.getLong("value"));
    }

    /* renamed from: Q */
    public final Double m38208Q(String str) {
        return Double.valueOf(this.f41588d.getDouble("value"));
    }

    /* renamed from: R */
    public final String m38209R(String str) {
        return this.f41588d.getString(str);
    }

    /* renamed from: S */
    public final int m38210S() {
        return this.f41588d.size();
    }

    /* renamed from: T */
    public final Bundle m38211T() {
        return new Bundle(this.f41588d);
    }

    /* renamed from: b */
    public final Object m38212b(String str) {
        return this.f41588d.get(str);
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new C9032q(this);
    }

    public final String toString() {
        return this.f41588d.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42522e(parcel, 2, m38211T(), false);
        C10127c.m42519b(parcel, m42518a);
    }
}

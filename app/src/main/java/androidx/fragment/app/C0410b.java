package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.AbstractC0439y;
import androidx.lifecycle.AbstractC0572g;
import java.util.ArrayList;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/fragment/app/b.class
 */
@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.b */
/* loaded from: combined.jar:classes1.jar:androidx/fragment/app/b.class */
public final class C0410b implements Parcelable {
    public static final Parcelable.Creator<C0410b> CREATOR = new a();

    /* renamed from: b */
    public final int[] f2762b;

    /* renamed from: c */
    public final ArrayList<String> f2763c;

    /* renamed from: d */
    public final int[] f2764d;

    /* renamed from: e */
    public final int[] f2765e;

    /* renamed from: f */
    public final int f2766f;

    /* renamed from: g */
    public final String f2767g;

    /* renamed from: h */
    public final int f2768h;

    /* renamed from: i */
    public final int f2769i;

    /* renamed from: j */
    public final CharSequence f2770j;

    /* renamed from: k */
    public final int f2771k;

    /* renamed from: l */
    public final CharSequence f2772l;

    /* renamed from: m */
    public final ArrayList<String> f2773m;

    /* renamed from: n */
    public final ArrayList<String> f2774n;

    /* renamed from: o */
    public final boolean f2775o;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/b$a.class
     */
    /* renamed from: androidx.fragment.app.b$a */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/b$a.class */
    public class a implements Parcelable.Creator<C0410b> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0410b createFromParcel(Parcel parcel) {
            return new C0410b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0410b[] newArray(int i10) {
            return new C0410b[i10];
        }
    }

    public C0410b(Parcel parcel) {
        this.f2762b = parcel.createIntArray();
        this.f2763c = parcel.createStringArrayList();
        this.f2764d = parcel.createIntArray();
        this.f2765e = parcel.createIntArray();
        this.f2766f = parcel.readInt();
        this.f2767g = parcel.readString();
        this.f2768h = parcel.readInt();
        this.f2769i = parcel.readInt();
        this.f2770j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2771k = parcel.readInt();
        this.f2772l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2773m = parcel.createStringArrayList();
        this.f2774n = parcel.createStringArrayList();
        this.f2775o = parcel.readInt() != 0;
    }

    public C0410b(C0408a c0408a) {
        int size = c0408a.f3036c.size();
        this.f2762b = new int[size * 5];
        if (!c0408a.f3042i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f2763c = new ArrayList<>(size);
        this.f2764d = new int[size];
        this.f2765e = new int[size];
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            AbstractC0439y.a aVar = c0408a.f3036c.get(i10);
            int i12 = i11 + 1;
            this.f2762b[i11] = aVar.f3053a;
            ArrayList<String> arrayList = this.f2763c;
            Fragment fragment = aVar.f3054b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f2762b;
            int i13 = i12 + 1;
            iArr[i12] = aVar.f3055c;
            int i14 = i13 + 1;
            iArr[i13] = aVar.f3056d;
            int i15 = i14 + 1;
            iArr[i14] = aVar.f3057e;
            iArr[i15] = aVar.f3058f;
            this.f2764d[i10] = aVar.f3059g.ordinal();
            this.f2765e[i10] = aVar.f3060h.ordinal();
            i10++;
            i11 = i15 + 1;
        }
        this.f2766f = c0408a.f3041h;
        this.f2767g = c0408a.f3044k;
        this.f2768h = c0408a.f2745v;
        this.f2769i = c0408a.f3045l;
        this.f2770j = c0408a.f3046m;
        this.f2771k = c0408a.f3047n;
        this.f2772l = c0408a.f3048o;
        this.f2773m = c0408a.f3049p;
        this.f2774n = c0408a.f3050q;
        this.f2775o = c0408a.f3051r;
    }

    /* renamed from: b */
    public C0408a m1976b(AbstractC0428n abstractC0428n) {
        C0408a c0408a = new C0408a(abstractC0428n);
        int i10 = 0;
        int i11 = 0;
        while (i10 < this.f2762b.length) {
            AbstractC0439y.a aVar = new AbstractC0439y.a();
            int i12 = i10 + 1;
            aVar.f3053a = this.f2762b[i10];
            if (AbstractC0428n.m2129G0(2)) {
                Log.v("FragmentManager", "Instantiate " + c0408a + " op #" + i11 + " base fragment #" + this.f2762b[i12]);
            }
            String str = this.f2763c.get(i11);
            aVar.f3054b = str != null ? abstractC0428n.m2200g0(str) : null;
            aVar.f3059g = AbstractC0572g.c.values()[this.f2764d[i11]];
            aVar.f3060h = AbstractC0572g.c.values()[this.f2765e[i11]];
            int[] iArr = this.f2762b;
            int i13 = i12 + 1;
            int i14 = iArr[i12];
            aVar.f3055c = i14;
            int i15 = i13 + 1;
            int i16 = iArr[i13];
            aVar.f3056d = i16;
            int i17 = i15 + 1;
            int i18 = iArr[i15];
            aVar.f3057e = i18;
            int i19 = iArr[i17];
            aVar.f3058f = i19;
            c0408a.f3037d = i14;
            c0408a.f3038e = i16;
            c0408a.f3039f = i18;
            c0408a.f3040g = i19;
            c0408a.m2365f(aVar);
            i11++;
            i10 = i17 + 1;
        }
        c0408a.f3041h = this.f2766f;
        c0408a.f3044k = this.f2767g;
        c0408a.f2745v = this.f2768h;
        c0408a.f3042i = true;
        c0408a.f3045l = this.f2769i;
        c0408a.f3046m = this.f2770j;
        c0408a.f3047n = this.f2771k;
        c0408a.f3048o = this.f2772l;
        c0408a.f3049p = this.f2773m;
        c0408a.f3050q = this.f2774n;
        c0408a.f3051r = this.f2775o;
        c0408a.m1973y(1);
        return c0408a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f2762b);
        parcel.writeStringList(this.f2763c);
        parcel.writeIntArray(this.f2764d);
        parcel.writeIntArray(this.f2765e);
        parcel.writeInt(this.f2766f);
        parcel.writeString(this.f2767g);
        parcel.writeInt(this.f2768h);
        parcel.writeInt(this.f2769i);
        TextUtils.writeToParcel(this.f2770j, parcel, 0);
        parcel.writeInt(this.f2771k);
        TextUtils.writeToParcel(this.f2772l, parcel, 0);
        parcel.writeStringList(this.f2773m);
        parcel.writeStringList(this.f2774n);
        parcel.writeInt(this.f2775o ? 1 : 0);
    }
}

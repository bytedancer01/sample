package pl.droidsonroids.gif;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: pl.droidsonroids.gif.b */
/* loaded from: combined.jar:classes3.jar:pl/droidsonroids/gif/b.class */
public class C7736b extends View.BaseSavedState {
    public static final Parcelable.Creator<C7736b> CREATOR = new a();

    /* renamed from: b */
    public final long[][] f37543b;

    /* renamed from: pl.droidsonroids.gif.b$a */
    /* loaded from: combined.jar:classes3.jar:pl/droidsonroids/gif/b$a.class */
    public class a implements Parcelable.Creator<C7736b> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C7736b createFromParcel(Parcel parcel) {
            return new C7736b(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C7736b[] newArray(int i10) {
            return new C7736b[i10];
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [long[], long[][]] */
    public C7736b(Parcel parcel) {
        super(parcel);
        this.f37543b = new long[parcel.readInt()];
        int i10 = 0;
        while (true) {
            long[][] jArr = this.f37543b;
            if (i10 >= jArr.length) {
                return;
            }
            jArr[i10] = parcel.createLongArray();
            i10++;
        }
    }

    public /* synthetic */ C7736b(Parcel parcel, a aVar) {
        this(parcel);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [long[], long[][]] */
    public C7736b(Parcelable parcelable, Drawable... drawableArr) {
        super(parcelable);
        this.f37543b = new long[drawableArr.length];
        for (int i10 = 0; i10 < drawableArr.length; i10++) {
            Drawable drawable = drawableArr[i10];
            if (drawable instanceof C7735a) {
                this.f37543b[i10] = ((C7735a) drawable).f37527h.m33777j();
            } else {
                this.f37543b[i10] = null;
            }
        }
    }

    /* renamed from: b */
    public void m33805b(Drawable drawable, int i10) {
        if (this.f37543b[i10] == null || !(drawable instanceof C7735a)) {
            return;
        }
        ((C7735a) drawable).m33802j(r0.f37527h.m33785s(r0, r0.f37526g));
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f37543b.length);
        for (long[] jArr : this.f37543b) {
            parcel.writeLongArray(jArr);
        }
    }
}

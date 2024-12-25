package p032c2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import p294r.C7928a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c2/c.class
 */
/* renamed from: c2.c */
/* loaded from: combined.jar:classes1.jar:c2/c.class */
public class C0979c extends AbstractC0978b {

    /* renamed from: d */
    public final SparseIntArray f6730d;

    /* renamed from: e */
    public final Parcel f6731e;

    /* renamed from: f */
    public final int f6732f;

    /* renamed from: g */
    public final int f6733g;

    /* renamed from: h */
    public final String f6734h;

    /* renamed from: i */
    public int f6735i;

    /* renamed from: j */
    public int f6736j;

    /* renamed from: k */
    public int f6737k;

    public C0979c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C7928a(), new C7928a(), new C7928a());
    }

    public C0979c(Parcel parcel, int i10, int i11, String str, C7928a<String, Method> c7928a, C7928a<String, Method> c7928a2, C7928a<String, Class> c7928a3) {
        super(c7928a, c7928a2, c7928a3);
        this.f6730d = new SparseIntArray();
        this.f6735i = -1;
        this.f6737k = -1;
        this.f6731e = parcel;
        this.f6732f = i10;
        this.f6733g = i11;
        this.f6736j = i10;
        this.f6734h = str;
    }

    @Override // p032c2.AbstractC0978b
    /* renamed from: A */
    public void mo5838A(byte[] bArr) {
        if (bArr == null) {
            this.f6731e.writeInt(-1);
        } else {
            this.f6731e.writeInt(bArr.length);
            this.f6731e.writeByteArray(bArr);
        }
    }

    @Override // p032c2.AbstractC0978b
    /* renamed from: C */
    public void mo5840C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f6731e, 0);
    }

    @Override // p032c2.AbstractC0978b
    /* renamed from: E */
    public void mo5842E(int i10) {
        this.f6731e.writeInt(i10);
    }

    @Override // p032c2.AbstractC0978b
    /* renamed from: G */
    public void mo5844G(Parcelable parcelable) {
        this.f6731e.writeParcelable(parcelable, 0);
    }

    @Override // p032c2.AbstractC0978b
    /* renamed from: I */
    public void mo5846I(String str) {
        this.f6731e.writeString(str);
    }

    @Override // p032c2.AbstractC0978b
    /* renamed from: a */
    public void mo5852a() {
        int i10 = this.f6735i;
        if (i10 >= 0) {
            int i11 = this.f6730d.get(i10);
            int dataPosition = this.f6731e.dataPosition();
            this.f6731e.setDataPosition(i11);
            this.f6731e.writeInt(dataPosition - i11);
            this.f6731e.setDataPosition(dataPosition);
        }
    }

    @Override // p032c2.AbstractC0978b
    /* renamed from: b */
    public AbstractC0978b mo5853b() {
        Parcel parcel = this.f6731e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f6736j;
        int i11 = i10;
        if (i10 == this.f6732f) {
            i11 = this.f6733g;
        }
        return new C0979c(parcel, dataPosition, i11, this.f6734h + "  ", this.f6727a, this.f6728b, this.f6729c);
    }

    @Override // p032c2.AbstractC0978b
    /* renamed from: g */
    public boolean mo5858g() {
        return this.f6731e.readInt() != 0;
    }

    @Override // p032c2.AbstractC0978b
    /* renamed from: i */
    public byte[] mo5860i() {
        int readInt = this.f6731e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f6731e.readByteArray(bArr);
        return bArr;
    }

    @Override // p032c2.AbstractC0978b
    /* renamed from: k */
    public CharSequence mo5862k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f6731e);
    }

    @Override // p032c2.AbstractC0978b
    /* renamed from: m */
    public boolean mo5864m(int i10) {
        while (true) {
            boolean z10 = true;
            if (this.f6736j >= this.f6733g) {
                if (this.f6737k != i10) {
                    z10 = false;
                }
                return z10;
            }
            int i11 = this.f6737k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f6731e.setDataPosition(this.f6736j);
            int readInt = this.f6731e.readInt();
            this.f6737k = this.f6731e.readInt();
            this.f6736j += readInt;
        }
    }

    @Override // p032c2.AbstractC0978b
    /* renamed from: o */
    public int mo5866o() {
        return this.f6731e.readInt();
    }

    @Override // p032c2.AbstractC0978b
    /* renamed from: q */
    public <T extends Parcelable> T mo5868q() {
        return (T) this.f6731e.readParcelable(getClass().getClassLoader());
    }

    @Override // p032c2.AbstractC0978b
    /* renamed from: s */
    public String mo5870s() {
        return this.f6731e.readString();
    }

    @Override // p032c2.AbstractC0978b
    /* renamed from: w */
    public void mo5874w(int i10) {
        mo5852a();
        this.f6735i = i10;
        this.f6730d.put(i10, this.f6731e.dataPosition());
        mo5842E(0);
        mo5842E(i10);
    }

    @Override // p032c2.AbstractC0978b
    /* renamed from: y */
    public void mo5876y(boolean z10) {
        this.f6731e.writeInt(z10 ? 1 : 0);
    }
}

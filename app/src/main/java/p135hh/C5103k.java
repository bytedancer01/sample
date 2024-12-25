package p135hh;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.FormatFlagsConversionMismatchException;
import java.util.Locale;
import java.util.UnknownFormatConversionException;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import p135hh.C5095d0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hh/k.class
 */
/* renamed from: hh.k */
/* loaded from: combined.jar:classes2.jar:hh/k.class */
public class C5103k implements Parcelable {
    public static final Parcelable.Creator<C5103k> CREATOR = new a();

    /* renamed from: b */
    public Object[] f29290b;

    /* renamed from: c */
    public String f29291c;

    /* renamed from: d */
    public int f29292d;

    /* renamed from: e */
    public C5095d0.c f29293e;

    /* renamed from: f */
    public long f29294f;

    /* renamed from: g */
    public int f29295g;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hh/k$a.class
     */
    /* renamed from: hh.k$a */
    /* loaded from: combined.jar:classes2.jar:hh/k$a.class */
    public class a implements Parcelable.Creator<C5103k> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C5103k createFromParcel(Parcel parcel) {
            return new C5103k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5103k[] newArray(int i10) {
            return new C5103k[i10];
        }
    }

    public C5103k(Parcel parcel) {
        this.f29290b = null;
        this.f29291c = null;
        this.f29293e = C5095d0.c.INFO;
        this.f29294f = System.currentTimeMillis();
        this.f29295g = -1;
        this.f29290b = parcel.readArray(Object.class.getClassLoader());
        this.f29291c = parcel.readString();
        this.f29292d = parcel.readInt();
        this.f29293e = C5095d0.c.getEnumByValue(parcel.readInt());
        this.f29295g = parcel.readInt();
        this.f29294f = parcel.readLong();
    }

    public C5103k(C5095d0.c cVar, int i10) {
        this.f29290b = null;
        this.f29291c = null;
        this.f29293e = C5095d0.c.INFO;
        this.f29294f = System.currentTimeMillis();
        this.f29295g = -1;
        this.f29292d = i10;
        this.f29293e = cVar;
    }

    public C5103k(C5095d0.c cVar, int i10, String str) {
        this.f29290b = null;
        this.f29291c = null;
        this.f29293e = C5095d0.c.INFO;
        this.f29294f = System.currentTimeMillis();
        this.f29291c = str;
        this.f29293e = cVar;
        this.f29295g = i10;
    }

    public C5103k(C5095d0.c cVar, int i10, Object... objArr) {
        this.f29290b = null;
        this.f29291c = null;
        this.f29293e = C5095d0.c.INFO;
        this.f29294f = System.currentTimeMillis();
        this.f29295g = -1;
        this.f29292d = i10;
        this.f29290b = objArr;
        this.f29293e = cVar;
    }

    public C5103k(C5095d0.c cVar, String str) {
        this.f29290b = null;
        this.f29291c = null;
        this.f29293e = C5095d0.c.INFO;
        this.f29294f = System.currentTimeMillis();
        this.f29295g = -1;
        this.f29293e = cVar;
        this.f29291c = str;
    }

    /* renamed from: l */
    public static String m25525l(CharSequence charSequence, Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (Object obj : objArr) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(charSequence);
            }
            sb2.append(obj);
        }
        return sb2.toString();
    }

    /* renamed from: b */
    public long m25526b() {
        return this.f29294f;
    }

    /* renamed from: c */
    public byte[] m25527c() {
        String obj;
        ByteBuffer allocate = ByteBuffer.allocate(16384);
        allocate.put((byte) 0);
        allocate.putLong(this.f29294f);
        allocate.putInt(this.f29295g);
        allocate.putInt(this.f29293e.getInt());
        allocate.putInt(this.f29292d);
        String str = this.f29291c;
        if (str == null || str.length() == 0) {
            allocate.putInt(0);
        } else {
            m25530m(this.f29291c, allocate);
        }
        Object[] objArr = this.f29290b;
        if (objArr == null || objArr.length == 0) {
            allocate.putInt(0);
        } else {
            allocate.putInt(objArr.length);
            for (Object obj2 : this.f29290b) {
                if (obj2 instanceof String) {
                    allocate.putChar('s');
                    obj = (String) obj2;
                } else {
                    if (obj2 instanceof Integer) {
                        allocate.putChar('i');
                        allocate.putInt(((Integer) obj2).intValue());
                    } else if (obj2 instanceof Float) {
                        allocate.putChar('f');
                        allocate.putFloat(((Float) obj2).floatValue());
                    } else if (obj2 instanceof Double) {
                        allocate.putChar('d');
                        allocate.putDouble(((Double) obj2).doubleValue());
                    } else if (obj2 instanceof Long) {
                        allocate.putChar('l');
                        allocate.putLong(((Long) obj2).longValue());
                    } else if (obj2 == null) {
                        allocate.putChar('0');
                    } else {
                        C5095d0.m25470m("Unknown object for LogItem marschaling " + obj2);
                        allocate.putChar('s');
                        obj = obj2.toString();
                    }
                }
                m25530m(obj, allocate);
            }
        }
        int position = allocate.position();
        allocate.rewind();
        return Arrays.copyOf(allocate.array(), position);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        String str;
        C5095d0.c cVar;
        if (!(obj instanceof C5103k)) {
            return obj.equals(this);
        }
        C5103k c5103k = (C5103k) obj;
        return Arrays.equals(this.f29290b, c5103k.f29290b) && (((str = c5103k.f29291c) == null && this.f29291c == str) || this.f29291c.equals(str)) && this.f29292d == c5103k.f29292d && ((((cVar = this.f29293e) == null && c5103k.f29293e == cVar) || c5103k.f29293e.equals(cVar)) && this.f29295g == c5103k.f29295g && this.f29294f == c5103k.f29294f);
    }

    @SuppressLint({"StringFormatMatches"})
    /* renamed from: j */
    public final String m25528j(Context context) {
        String str;
        String str2;
        context.getPackageManager();
        String str3 = "error getting package signature";
        try {
            X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray()));
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_1);
            messageDigest.update(x509Certificate.getEncoded());
            byte[] digest = messageDigest.digest();
            str2 = Arrays.equals(digest, C5095d0.f29256m) ? context.getString(2132018255) : Arrays.equals(digest, C5095d0.f29257n) ? context.getString(2132017544) : Arrays.equals(digest, C5095d0.f29258o) ? "amazon version" : Arrays.equals(digest, C5095d0.f29259p) ? "F-Droid built and signed version" : context.getString(2132017378, x509Certificate.getSubjectX500Principal().getName());
            str3 = str2;
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException e10) {
            str = "error getting version";
            str2 = str3;
        }
        Object[] objArr = this.f29290b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[copyOf.length - 1] = str2;
        copyOf[copyOf.length - 2] = str;
        return context.getString(2132018078, copyOf);
    }

    /* renamed from: k */
    public String m25529k(Context context) {
        try {
            String str = this.f29291c;
            if (str != null) {
                return str;
            }
            if (context != null) {
                int i10 = this.f29292d;
                if (i10 == 2132018078) {
                    return m25528j(context);
                }
                Object[] objArr = this.f29290b;
                return objArr == null ? context.getString(i10) : context.getString(i10, objArr);
            }
            String format = String.format(Locale.ENGLISH, "Log (no context) resid %d", Integer.valueOf(this.f29292d));
            String str2 = format;
            if (this.f29290b != null) {
                str2 = format + m25525l("|", this.f29290b);
            }
            return str2;
        } catch (FormatFlagsConversionMismatchException e10) {
            if (context == null) {
                throw e10;
            }
            throw new FormatFlagsConversionMismatchException(e10.getLocalizedMessage() + m25529k(null), e10.getConversion());
        } catch (UnknownFormatConversionException e11) {
            if (context == null) {
                throw e11;
            }
            throw new UnknownFormatConversionException(e11.getLocalizedMessage() + m25529k(null));
        }
    }

    /* renamed from: m */
    public final void m25530m(String str, ByteBuffer byteBuffer) {
        byte[] bytes = str.getBytes("UTF-8");
        byteBuffer.putInt(bytes.length);
        byteBuffer.put(bytes);
    }

    public String toString() {
        return m25529k(null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeArray(this.f29290b);
        parcel.writeString(this.f29291c);
        parcel.writeInt(this.f29292d);
        parcel.writeInt(this.f29293e.getInt());
        parcel.writeInt(this.f29295g);
        parcel.writeLong(this.f29294f);
    }
}

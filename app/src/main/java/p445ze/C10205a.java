package p445ze;

import af.C0158a;
import af.C0160c;
import af.C0161d;
import af.C0162e;
import af.C0163f;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import bf.C0896a;
import bf.C0897b;
import bf.C0898c;
import bf.C0899d;
import com.amazonaws.mobileconnectors.appsync.AppSyncMutationsSqlHelper;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.achartengine.ChartFactory;
import p088f1.AbstractC4749a;
import p107g1.C4930b;
import p107g1.C4931c;
import ve.C9343d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ze/a.class
 */
/* renamed from: ze.a */
/* loaded from: combined.jar:classes2.jar:ze/a.class */
public class C10205a implements AbstractC4749a.a<Cursor> {

    /* renamed from: a */
    public WeakReference<Context> f46703a;

    /* renamed from: b */
    public InterfaceC10206b f46704b;

    /* renamed from: c */
    public int f46705c;

    /* renamed from: d */
    public String[] f46706d;

    /* renamed from: e */
    public C4930b f46707e;

    /* renamed from: f */
    public String f46708f;

    public C10205a(Context context, InterfaceC10206b interfaceC10206b, int i10) {
        this(context, interfaceC10206b, i10, null);
    }

    public C10205a(Context context, InterfaceC10206b interfaceC10206b, int i10, String[] strArr) {
        this.f46705c = 0;
        this.f46703a = new WeakReference<>(context);
        this.f46704b = interfaceC10206b;
        this.f46705c = i10;
        this.f46706d = strArr;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        this.f46708f = m42721e(strArr);
    }

    @Override // p088f1.AbstractC4749a.a
    /* renamed from: b */
    public void mo24050b(C4931c<Cursor> c4931c) {
    }

    @Override // p088f1.AbstractC4749a.a
    /* renamed from: c */
    public C4931c<Cursor> mo24051c(int i10, Bundle bundle) {
        C4930b c0898c;
        int i11 = this.f46705c;
        if (i11 == 0) {
            c0898c = new C0898c(this.f46703a.get());
        } else if (i11 == 1) {
            c0898c = new C0899d(this.f46703a.get());
        } else {
            if (i11 != 2) {
                if (i11 == 3) {
                    c0898c = new C0897b(this.f46703a.get());
                }
                return this.f46707e;
            }
            c0898c = new C0896a(this.f46703a.get());
        }
        this.f46707e = c0898c;
        return this.f46707e;
    }

    /* renamed from: d */
    public final boolean m42720d(String str) {
        return Pattern.compile(this.f46708f, 2).matcher(C9343d.m39381b(str)).matches();
    }

    /* renamed from: e */
    public final String m42721e(String[] strArr) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (i10 == 0) {
                str = strArr[i10];
            } else {
                sb2.append("|\\.");
                str = strArr[i10];
            }
            sb2.append(str.replace(InstructionFileId.DOT, ""));
        }
        return ".+(\\." + sb2.toString() + ")$";
    }

    /* renamed from: f */
    public final void m42722f(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        if (cursor.getPosition() != -1) {
            cursor.moveToPosition(-1);
        }
        while (cursor.moveToNext()) {
            C0158a c0158a = new C0158a();
            c0158a.m700Q(cursor.getLong(cursor.getColumnIndexOrThrow("_id")));
            c0158a.m701R(cursor.getString(cursor.getColumnIndexOrThrow(ChartFactory.TITLE)));
            c0158a.m702S(cursor.getString(cursor.getColumnIndexOrThrow("_data")));
            c0158a.m704U(cursor.getLong(cursor.getColumnIndexOrThrow("_size")));
            c0158a.m699P(cursor.getLong(cursor.getColumnIndexOrThrow("date_added")));
            c0158a.m684W(cursor.getLong(cursor.getColumnIndexOrThrow("duration")));
            C0160c c0160c = new C0160c();
            c0160c.m718f(C9343d.m39381b(C9343d.m39382c(c0158a.m710z())));
            c0160c.m719g(C9343d.m39382c(c0158a.m710z()));
            if (arrayList.contains(c0160c)) {
                ((C0160c) arrayList.get(arrayList.indexOf(c0160c))).m713a(c0158a);
            } else {
                c0160c.m713a(c0158a);
                arrayList.add(c0160c);
            }
        }
        InterfaceC10206b interfaceC10206b = this.f46704b;
        if (interfaceC10206b != null) {
            interfaceC10206b.mo15597a(arrayList);
        }
    }

    /* renamed from: g */
    public final void m42723g(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        if (cursor.getPosition() != -1) {
            cursor.moveToPosition(-1);
        }
        while (cursor.moveToNext()) {
            String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
            if (string != null && m42720d(string)) {
                C0162e c0162e = new C0162e();
                c0162e.m700Q(cursor.getLong(cursor.getColumnIndexOrThrow("_id")));
                c0162e.m701R(cursor.getString(cursor.getColumnIndexOrThrow(ChartFactory.TITLE)));
                c0162e.m702S(cursor.getString(cursor.getColumnIndexOrThrow("_data")));
                c0162e.m704U(cursor.getLong(cursor.getColumnIndexOrThrow("_size")));
                c0162e.m699P(cursor.getLong(cursor.getColumnIndexOrThrow("date_added")));
                c0162e.m724W(cursor.getString(cursor.getColumnIndexOrThrow(AppSyncMutationsSqlHelper.COLUMN_MIME_TYPE)));
                C0160c c0160c = new C0160c();
                c0160c.m718f(C9343d.m39381b(C9343d.m39382c(c0162e.m710z())));
                c0160c.m719g(C9343d.m39382c(c0162e.m710z()));
                if (arrayList.contains(c0160c)) {
                    ((C0160c) arrayList.get(arrayList.indexOf(c0160c))).m713a(c0162e);
                } else {
                    c0160c.m713a(c0162e);
                    arrayList.add(c0160c);
                }
            }
        }
        InterfaceC10206b interfaceC10206b = this.f46704b;
        if (interfaceC10206b != null) {
            interfaceC10206b.mo15597a(arrayList);
        }
    }

    /* renamed from: h */
    public final void m42724h(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        if (cursor.getPosition() != -1) {
            cursor.moveToPosition(-1);
        }
        while (cursor.moveToNext()) {
            C0161d c0161d = new C0161d();
            c0161d.m700Q(cursor.getLong(cursor.getColumnIndexOrThrow("_id")));
            c0161d.m701R(cursor.getString(cursor.getColumnIndexOrThrow(ChartFactory.TITLE)));
            c0161d.m702S(cursor.getString(cursor.getColumnIndexOrThrow("_data")));
            c0161d.m704U(cursor.getLong(cursor.getColumnIndexOrThrow("_size")));
            c0161d.m697C(cursor.getString(cursor.getColumnIndexOrThrow("bucket_id")));
            c0161d.m698H(cursor.getString(cursor.getColumnIndexOrThrow("bucket_display_name")));
            c0161d.m699P(cursor.getLong(cursor.getColumnIndexOrThrow("date_added")));
            c0161d.m720V(cursor.getInt(cursor.getColumnIndexOrThrow("orientation")));
            C0160c c0160c = new C0160c();
            c0160c.m717e(c0161d.m705p());
            c0160c.m718f(c0161d.m706r());
            c0160c.m719g(C9343d.m39382c(c0161d.m710z()));
            if (arrayList.contains(c0160c)) {
                ((C0160c) arrayList.get(arrayList.indexOf(c0160c))).m713a(c0161d);
            } else {
                c0160c.m713a(c0161d);
                arrayList.add(c0160c);
            }
        }
        InterfaceC10206b interfaceC10206b = this.f46704b;
        if (interfaceC10206b != null) {
            interfaceC10206b.mo15597a(arrayList);
        }
    }

    @Override // p088f1.AbstractC4749a.a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo24049a(C4931c<Cursor> c4931c, Cursor cursor) {
        if (cursor == null) {
            return;
        }
        int i10 = this.f46705c;
        if (i10 == 0) {
            m42724h(cursor);
            return;
        }
        if (i10 == 1) {
            m42726j(cursor);
        } else if (i10 == 2) {
            m42722f(cursor);
        } else {
            if (i10 != 3) {
                return;
            }
            m42723g(cursor);
        }
    }

    /* renamed from: j */
    public final void m42726j(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        if (cursor.getPosition() != -1) {
            cursor.moveToPosition(-1);
        }
        while (cursor.moveToNext()) {
            C0163f c0163f = new C0163f();
            c0163f.m700Q(cursor.getLong(cursor.getColumnIndexOrThrow("_id")));
            c0163f.m701R(cursor.getString(cursor.getColumnIndexOrThrow(ChartFactory.TITLE)));
            c0163f.m702S(cursor.getString(cursor.getColumnIndexOrThrow("_data")));
            c0163f.m704U(cursor.getLong(cursor.getColumnIndexOrThrow("_size")));
            c0163f.m697C(cursor.getString(cursor.getColumnIndexOrThrow("bucket_id")));
            c0163f.m698H(cursor.getString(cursor.getColumnIndexOrThrow("bucket_display_name")));
            c0163f.m699P(cursor.getLong(cursor.getColumnIndexOrThrow("date_added")));
            c0163f.m729X(cursor.getLong(cursor.getColumnIndexOrThrow("duration")));
            C0160c c0160c = new C0160c();
            c0160c.m717e(c0163f.m705p());
            c0160c.m718f(c0163f.m706r());
            c0160c.m719g(C9343d.m39382c(c0163f.m710z()));
            if (arrayList.contains(c0160c)) {
                ((C0160c) arrayList.get(arrayList.indexOf(c0160c))).m713a(c0163f);
            } else {
                c0160c.m713a(c0163f);
                arrayList.add(c0160c);
            }
        }
        InterfaceC10206b interfaceC10206b = this.f46704b;
        if (interfaceC10206b != null) {
            interfaceC10206b.mo15597a(arrayList);
        }
    }
}

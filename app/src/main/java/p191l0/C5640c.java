package p191l0;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import com.amazonaws.mobileconnectors.p044s3.transferutility.TransferTable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p069e0.C4564c;
import p191l0.C5643f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l0/c.class
 */
/* renamed from: l0.c */
/* loaded from: combined.jar:classes1.jar:l0/c.class */
public class C5640c {

    /* renamed from: a */
    public static final Comparator<byte[]> f31740a = new a();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l0/c$a.class
     */
    /* renamed from: l0.c$a */
    /* loaded from: combined.jar:classes1.jar:l0/c$a.class */
    public class a implements Comparator<byte[]> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            if (bArr.length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            for (int i10 = 0; i10 < bArr.length; i10++) {
                byte b10 = bArr[i10];
                byte b11 = bArr2[i10];
                if (b10 != b11) {
                    return b10 - b11;
                }
            }
            return 0;
        }
    }

    /* renamed from: a */
    public static List<byte[]> m27825a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: b */
    public static boolean m27826b(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static List<List<byte[]>> m27827c(C5641d c5641d, Resources resources) {
        return c5641d.m27833b() != null ? c5641d.m27833b() : C4564c.m23025c(resources, c5641d.m27834c());
    }

    /* renamed from: d */
    public static C5643f.a m27828d(Context context, C5641d c5641d, CancellationSignal cancellationSignal) {
        ProviderInfo m27829e = m27829e(context.getPackageManager(), c5641d, context.getResources());
        return m27829e == null ? C5643f.a.m27850a(1, null) : C5643f.a.m27850a(0, m27830f(context, c5641d, m27829e.authority, cancellationSignal));
    }

    /* renamed from: e */
    public static ProviderInfo m27829e(PackageManager packageManager, C5641d c5641d, Resources resources) {
        String m27836e = c5641d.m27836e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(m27836e, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + m27836e);
        }
        if (!resolveContentProvider.packageName.equals(c5641d.m27837f())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + m27836e + ", but package was not " + c5641d.m27837f());
        }
        List<byte[]> m27825a = m27825a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
        Collections.sort(m27825a, f31740a);
        List<List<byte[]>> m27827c = m27827c(c5641d, resources);
        for (int i10 = 0; i10 < m27827c.size(); i10++) {
            ArrayList arrayList = new ArrayList(m27827c.get(i10));
            Collections.sort(arrayList, f31740a);
            if (m27826b(m27825a, arrayList)) {
                return resolveContentProvider;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static C5643f.b[] m27830f(Context context, C5641d c5641d, String str, CancellationSignal cancellationSignal) {
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath(TransferTable.COLUMN_FILE).build();
        Cursor cursor = null;
        try {
            Cursor query = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{c5641d.m27838g()}, null, cancellationSignal);
            ArrayList arrayList2 = arrayList;
            if (query != null) {
                arrayList2 = arrayList;
                if (query.getCount() > 0) {
                    int columnIndex = query.getColumnIndex("result_code");
                    ArrayList arrayList3 = new ArrayList();
                    int columnIndex2 = query.getColumnIndex("_id");
                    int columnIndex3 = query.getColumnIndex("file_id");
                    int columnIndex4 = query.getColumnIndex("font_ttc_index");
                    int columnIndex5 = query.getColumnIndex("font_weight");
                    int columnIndex6 = query.getColumnIndex("font_italic");
                    while (true) {
                        cursor = query;
                        if (!query.moveToNext()) {
                            break;
                        }
                        arrayList3.add(C5643f.b.m27853a(columnIndex3 == -1 ? ContentUris.withAppendedId(build, query.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, query.getLong(columnIndex3)), columnIndex4 != -1 ? query.getInt(columnIndex4) : 0, columnIndex5 != -1 ? query.getInt(columnIndex5) : 400, columnIndex6 != -1 && query.getInt(columnIndex6) == 1, columnIndex != -1 ? query.getInt(columnIndex) : 0));
                    }
                    arrayList2 = arrayList3;
                }
            }
            if (query != null) {
                query.close();
            }
            return (C5643f.b[]) arrayList2.toArray(new C5643f.b[0]);
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }
}

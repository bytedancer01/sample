package p360v1;

import android.database.Cursor;
import android.database.MatrixCursor;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:v1/b.class
 */
/* renamed from: v1.b */
/* loaded from: combined.jar:classes1.jar:v1/b.class */
public class C9224b {
    /* renamed from: a */
    public static Cursor m38890a(Cursor cursor) {
        try {
            MatrixCursor matrixCursor = new MatrixCursor(cursor.getColumnNames(), cursor.getCount());
            while (cursor.moveToNext()) {
                Object[] objArr = new Object[cursor.getColumnCount()];
                for (int i10 = 0; i10 < cursor.getColumnCount(); i10++) {
                    int type = cursor.getType(i10);
                    if (type == 0) {
                        objArr[i10] = null;
                    } else if (type == 1) {
                        objArr[i10] = Long.valueOf(cursor.getLong(i10));
                    } else if (type == 2) {
                        objArr[i10] = Double.valueOf(cursor.getDouble(i10));
                    } else if (type == 3) {
                        objArr[i10] = cursor.getString(i10);
                    } else {
                        if (type != 4) {
                            throw new IllegalStateException();
                        }
                        objArr[i10] = cursor.getBlob(i10);
                    }
                }
                matrixCursor.addRow(objArr);
            }
            return matrixCursor;
        } finally {
            cursor.close();
        }
    }

    /* renamed from: b */
    public static int m38891b(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }
}

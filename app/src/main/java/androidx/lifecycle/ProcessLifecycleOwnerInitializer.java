package androidx.lifecycle;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/lifecycle/ProcessLifecycleOwnerInitializer.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/lifecycle/ProcessLifecycleOwnerInitializer.class */
public class ProcessLifecycleOwnerInitializer extends ContentProvider {
    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        C0576j.m3160a(getContext());
        C0588v.m3182h(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}

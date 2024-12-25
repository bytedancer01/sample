package p428yg;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import p428yg.AbstractC10019y;
import p428yg.C10014t;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yg/o.class
 */
/* renamed from: yg.o */
/* loaded from: combined.jar:classes2.jar:yg/o.class */
public class C10009o extends C10000g {

    /* renamed from: b */
    public static final String[] f45879b = {"orientation"};

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yg/o$a.class
     */
    /* renamed from: yg.o$a */
    /* loaded from: combined.jar:classes2.jar:yg/o$a.class */
    public enum a {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);

        public final int androidKind;
        public final int height;
        public final int width;

        a(int i10, int i11, int i12) {
            this.androidKind = i10;
            this.width = i11;
            this.height = i12;
        }
    }

    public C10009o(Context context) {
        super(context);
    }

    /* renamed from: k */
    public static int m42098k(ContentResolver contentResolver, Uri uri) {
        Cursor cursor = null;
        Cursor cursor2 = null;
        try {
            Cursor query = contentResolver.query(uri, f45879b, null, null, null);
            if (query != null && query.moveToFirst()) {
                cursor2 = query;
                cursor = query;
                int i10 = query.getInt(0);
                query.close();
                return i10;
            }
            if (query == null) {
                return 0;
            }
            query.close();
            return 0;
        } catch (RuntimeException e10) {
            if (cursor == null) {
                return 0;
            }
            cursor.close();
            return 0;
        } catch (Throwable th2) {
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th2;
        }
    }

    /* renamed from: l */
    public static a m42099l(int i10, int i11) {
        a aVar = a.MICRO;
        if (i10 <= aVar.width && i11 <= aVar.height) {
            return aVar;
        }
        a aVar2 = a.MINI;
        return (i10 > aVar2.width || i11 > aVar2.height) ? a.FULL : aVar2;
    }

    @Override // p428yg.C10000g, p428yg.AbstractC10019y
    /* renamed from: c */
    public boolean mo41998c(C10017w c10017w) {
        Uri uri = c10017w.f45928d;
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    @Override // p428yg.C10000g, p428yg.AbstractC10019y
    /* renamed from: f */
    public AbstractC10019y.a mo41999f(C10017w c10017w, int i10) {
        Bitmap thumbnail;
        ContentResolver contentResolver = this.f45835a.getContentResolver();
        int m42098k = m42098k(contentResolver, c10017w.f45928d);
        String type = contentResolver.getType(c10017w.f45928d);
        boolean z10 = type != null && type.startsWith("video/");
        if (c10017w.m42134c()) {
            a m42099l = m42099l(c10017w.f45932h, c10017w.f45933i);
            if (!z10 && m42099l == a.FULL) {
                return new AbstractC10019y.a(null, m42036j(c10017w), C10014t.e.DISK, m42098k);
            }
            long parseId = ContentUris.parseId(c10017w.f45928d);
            BitmapFactory.Options m42159d = AbstractC10019y.m42159d(c10017w);
            m42159d.inJustDecodeBounds = true;
            AbstractC10019y.m42157a(c10017w.f45932h, c10017w.f45933i, m42099l.width, m42099l.height, m42159d, c10017w);
            if (z10) {
                thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, m42099l == a.FULL ? 1 : m42099l.androidKind, m42159d);
            } else {
                thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, m42099l.androidKind, m42159d);
            }
            if (thumbnail != null) {
                return new AbstractC10019y.a(thumbnail, null, C10014t.e.DISK, m42098k);
            }
        }
        return new AbstractC10019y.a(null, m42036j(c10017w), C10014t.e.DISK, m42098k);
    }
}

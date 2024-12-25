package bf;

import android.content.Context;
import android.provider.MediaStore;
import org.achartengine.ChartFactory;
import p107g1.C4930b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:bf/a.class
 */
/* renamed from: bf.a */
/* loaded from: combined.jar:classes2.jar:bf/a.class */
public class C0896a extends C4930b {

    /* renamed from: x */
    public static final String[] f6028x = {"_id", ChartFactory.TITLE, "_data", "_size", "date_added", "duration"};

    public C0896a(Context context) {
        super(context);
        m24887L(f6028x);
        m24891P(MediaStore.Files.getContentUri("external"));
        m24890O("date_added DESC");
        m24888M("mime_type=? or mime_type=? or mime_type=?");
        m24889N(new String[]{"audio/mpeg", "audio/mp3", "audio/x-ms-wma"});
    }
}

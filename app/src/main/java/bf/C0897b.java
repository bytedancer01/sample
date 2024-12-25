package bf;

import android.content.Context;
import android.provider.MediaStore;
import com.amazonaws.mobileconnectors.appsync.AppSyncMutationsSqlHelper;
import org.achartengine.ChartFactory;
import p107g1.C4930b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:bf/b.class
 */
/* renamed from: bf.b */
/* loaded from: combined.jar:classes2.jar:bf/b.class */
public class C0897b extends C4930b {

    /* renamed from: x */
    public static final String[] f6029x = {"_id", ChartFactory.TITLE, "_data", "_size", "date_added", AppSyncMutationsSqlHelper.COLUMN_MIME_TYPE};

    public C0897b(Context context) {
        super(context);
        m24887L(f6029x);
        m24891P(MediaStore.Files.getContentUri("external"));
        m24890O("date_added DESC");
    }
}

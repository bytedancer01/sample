package p416y3;

import android.content.res.AssetManager;
import java.io.InputStream;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:y3/h.class
 */
/* renamed from: y3.h */
/* loaded from: combined.jar:classes1.jar:y3/h.class */
public class C9822h extends AbstractC9815a<InputStream> {
    public C9822h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // p416y3.AbstractC9815a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo41346c(InputStream inputStream) {
        inputStream.close();
    }

    @Override // p416y3.AbstractC9815a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InputStream mo41347d(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}

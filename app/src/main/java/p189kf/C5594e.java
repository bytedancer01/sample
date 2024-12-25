package p189kf;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.storage.result.StorageUploadFileResult;
import com.maxdigitall.maxdigitaliptvbox.view.activity.BackupAndRestoreActivity;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kf/e.class
 */
/* renamed from: kf.e */
/* loaded from: combined.jar:classes2.jar:kf/e.class */
public final /* synthetic */ class C5594e implements Consumer {

    /* renamed from: a */
    public final BackupAndRestoreActivity f31680a;

    public /* synthetic */ C5594e(BackupAndRestoreActivity backupAndRestoreActivity) {
        this.f31680a = backupAndRestoreActivity;
    }

    @Override // com.amplifyframework.core.Consumer
    public final void accept(Object obj) {
        this.f31680a.m15653d1((StorageUploadFileResult) obj);
    }
}

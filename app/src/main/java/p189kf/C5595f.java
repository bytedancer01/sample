package p189kf;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.storage.StorageException;
import com.maxdigitall.maxdigitaliptvbox.view.activity.BackupAndRestoreActivity;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kf/f.class
 */
/* renamed from: kf.f */
/* loaded from: combined.jar:classes2.jar:kf/f.class */
public final /* synthetic */ class C5595f implements Consumer {

    /* renamed from: a */
    public final BackupAndRestoreActivity f31681a;

    public /* synthetic */ C5595f(BackupAndRestoreActivity backupAndRestoreActivity) {
        this.f31681a = backupAndRestoreActivity;
    }

    @Override // com.amplifyframework.core.Consumer
    public final void accept(Object obj) {
        this.f31681a.m15650a1((StorageException) obj);
    }
}

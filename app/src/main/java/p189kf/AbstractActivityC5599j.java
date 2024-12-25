package p189kf;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActivityC0243b;
import ve.C9340a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kf/j.class
 */
/* renamed from: kf.j */
/* loaded from: combined.jar:classes2.jar:kf/j.class */
public abstract class AbstractActivityC5599j extends ActivityC0243b {

    /* renamed from: d */
    public C9340a f31684d;

    /* renamed from: e */
    public boolean f31685e;

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
    }

    public void onBackClick(View view) {
        finish();
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean booleanExtra = getIntent().getBooleanExtra("isNeedFolderList", false);
        this.f31685e = booleanExtra;
        if (booleanExtra) {
            C9340a c9340a = new C9340a();
            this.f31684d = c9340a;
            c9340a.m39374b(this);
        }
    }
}

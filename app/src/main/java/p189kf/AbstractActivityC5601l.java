package p189kf;

import android.content.Intent;
import androidx.fragment.app.ActivityC0416e;
import com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kf/l.class
 */
/* renamed from: kf.l */
/* loaded from: combined.jar:classes2.jar:kf/l.class */
public abstract class AbstractActivityC5601l extends ActivityC0416e {
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        startActivity(new Intent(this, (Class<?>) SearchActivity.class));
        return true;
    }
}

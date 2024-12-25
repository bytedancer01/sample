package p285q9;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p060da.C4414m;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:q9/h.class
 */
/* renamed from: q9.h */
/* loaded from: combined.jar:classes2.jar:q9/h.class */
public final class C7857h extends View.AccessibilityDelegate {

    /* renamed from: a */
    public final CastSeekBar f37929a;

    public /* synthetic */ C7857h(CastSeekBar castSeekBar, C7856g c7856g) {
        this.f37929a = castSeekBar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(SeekBar.class.getName());
        accessibilityEvent.setItemCount(this.f37929a.f14726b.f37924b);
        accessibilityEvent.setCurrentItemIndex(this.f37929a.getProgress());
    }

    @Override // android.view.View.AccessibilityDelegate
    @TargetApi(16)
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(SeekBar.class.getName());
        if (C4414m.m22451b() && view.isEnabled()) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(NTLMEngineImpl.FLAG_WORKSTATION_PRESENT);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    @TargetApi(16)
    public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        if (!view.isEnabled()) {
            return false;
        }
        if (super.performAccessibilityAction(view, i10, bundle)) {
            return true;
        }
        if (!C4414m.m22451b()) {
            return false;
        }
        if (i10 != 4096 && i10 != 8192) {
            return false;
        }
        this.f37929a.m13101i();
        CastSeekBar castSeekBar = this.f37929a;
        int i11 = castSeekBar.f14726b.f37924b / 20;
        int i12 = i11;
        if (i10 == 8192) {
            i12 = -i11;
        }
        castSeekBar.m13100h(castSeekBar.getProgress() + i12);
        this.f37929a.m13102j();
        return false;
    }
}

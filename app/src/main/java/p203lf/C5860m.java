package p203lf;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAdLayout;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:lf/m.class
 */
/* renamed from: lf.m */
/* loaded from: combined.jar:classes2.jar:lf/m.class */
public class C5860m extends RecyclerView.AbstractC0674e0 {

    /* renamed from: u */
    public NativeAdLayout f32692u;

    /* renamed from: v */
    public TextView f32693v;

    /* renamed from: w */
    public Button f32694w;

    /* renamed from: x */
    public MediaView f32695x;

    /* renamed from: y */
    public TextView f32696y;

    public C5860m(View view) {
        super(view);
        NativeAdLayout nativeAdLayout = (NativeAdLayout) view.findViewById(2131428752);
        this.f32692u = nativeAdLayout;
        this.f32693v = (TextView) nativeAdLayout.findViewById(2131428751);
        this.f32696y = (TextView) this.f32692u.findViewById(2131428750);
        this.f32695x = (MediaView) this.f32692u.findViewById(2131428753);
        this.f32694w = (Button) this.f32692u.findViewById(2131428749);
    }

    /* renamed from: R */
    public NativeAdLayout m28566R() {
        return this.f32692u;
    }

    /* renamed from: S */
    public Button m28567S() {
        return this.f32694w;
    }

    /* renamed from: T */
    public MediaView m28568T() {
        return this.f32695x;
    }

    /* renamed from: U */
    public TextView m28569U() {
        return this.f32696y;
    }

    /* renamed from: V */
    public TextView m28570V() {
        return this.f32693v;
    }
}

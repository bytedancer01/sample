package p285q9;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.TextView;
import p244o9.InterfaceC6931a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:q9/i.class
 */
/* renamed from: q9.i */
/* loaded from: combined.jar:classes2.jar:q9/i.class */
public final class C7858i implements InterfaceC6931a {

    /* renamed from: a */
    public final AbstractActivityC7850a f37930a;

    public C7858i(AbstractActivityC7850a abstractActivityC7850a) {
        this.f37930a = abstractActivityC7850a;
    }

    @Override // p244o9.InterfaceC6931a
    @TargetApi(23)
    /* renamed from: a */
    public final void mo29921a(Bitmap bitmap) {
        TextView textView;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        TextView textView2;
        if (bitmap != null) {
            AbstractActivityC7850a abstractActivityC7850a = this.f37930a;
            textView = abstractActivityC7850a.f37882H;
            if (textView != null) {
                textView2 = abstractActivityC7850a.f37882H;
                textView2.setVisibility(8);
            }
            AbstractActivityC7850a abstractActivityC7850a2 = this.f37930a;
            imageView = abstractActivityC7850a2.f37881G;
            if (imageView != null) {
                imageView2 = abstractActivityC7850a2.f37881G;
                imageView2.setVisibility(0);
                imageView3 = this.f37930a.f37881G;
                imageView3.setImageBitmap(bitmap);
            }
        }
    }
}

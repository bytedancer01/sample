package p003a2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.apache.http.impl.auth.NTLMEngineImpl;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a2/r.class
 */
/* renamed from: a2.r */
/* loaded from: combined.jar:classes1.jar:a2/r.class */
public class C0038r {

    /* renamed from: a */
    public static final boolean f166a;

    /* renamed from: b */
    public static final boolean f167b;

    /* renamed from: c */
    public static final boolean f168c;

    static {
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = true;
        f166a = true;
        f167b = true;
        if (i10 < 28) {
            z10 = false;
        }
        f168c = z10;
    }

    /* renamed from: a */
    public static View m191a(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        C0006a0.m38i(view, matrix);
        C0006a0.m39j(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap m192b = m192b(view, matrix, rectF, viewGroup);
        if (m192b != null) {
            imageView.setImageBitmap(m192b);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH), View.MeasureSpec.makeMeasureSpec(round4 - round2, NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap m192b(android.view.View r5, android.graphics.Matrix r6, android.graphics.RectF r7, android.view.ViewGroup r8) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p003a2.C0038r.m192b(android.view.View, android.graphics.Matrix, android.graphics.RectF, android.view.ViewGroup):android.graphics.Bitmap");
    }

    /* renamed from: c */
    public static Animator m193c(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }
}

package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.apache.commons.net.nntp.NNTPReply;
import p373w.C9385e;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/constraintlayout/widget/e.class
 */
/* renamed from: androidx.constraintlayout.widget.e */
/* loaded from: combined.jar:classes1.jar:androidx/constraintlayout/widget/e.class */
public class C0378e extends View {

    /* renamed from: b */
    public int f2596b;

    /* renamed from: c */
    public View f2597c;

    /* renamed from: d */
    public int f2598d;

    /* renamed from: a */
    public void m1766a(ConstraintLayout constraintLayout) {
        if (this.f2597c == null) {
            return;
        }
        ConstraintLayout.C0372b c0372b = (ConstraintLayout.C0372b) getLayoutParams();
        ConstraintLayout.C0372b c0372b2 = (ConstraintLayout.C0372b) this.f2597c.getLayoutParams();
        c0372b2.f2442n0.m39589A0(0);
        C9385e.b m39660w = c0372b.f2442n0.m39660w();
        C9385e.b bVar = C9385e.b.FIXED;
        if (m39660w != bVar) {
            c0372b.f2442n0.m39591B0(c0372b2.f2442n0.m39608N());
        }
        if (c0372b.f2442n0.m39605K() != bVar) {
            c0372b.f2442n0.m39627e0(c0372b2.f2442n0.m39654t());
        }
        c0372b2.f2442n0.m39589A0(8);
    }

    /* renamed from: b */
    public void m1767b(ConstraintLayout constraintLayout) {
        if (this.f2596b == -1 && !isInEditMode()) {
            setVisibility(this.f2598d);
        }
        View findViewById = constraintLayout.findViewById(this.f2596b);
        this.f2597c = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.C0372b) findViewById.getLayoutParams()).f2418b0 = true;
            this.f2597c.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f2597c;
    }

    public int getEmptyVisibility() {
        return this.f2598d;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(NNTPReply.ARTICLE_RETRIEVED_REQUEST_TEXT_SEPARATELY, NNTPReply.ARTICLE_RETRIEVED_REQUEST_TEXT_SEPARATELY, NNTPReply.ARTICLE_RETRIEVED_REQUEST_TEXT_SEPARATELY);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i10) {
        View findViewById;
        if (this.f2596b == i10) {
            return;
        }
        View view = this.f2597c;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.C0372b) this.f2597c.getLayoutParams()).f2418b0 = false;
            this.f2597c = null;
        }
        this.f2596b = i10;
        if (i10 == -1 || (findViewById = ((View) getParent()).findViewById(i10)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i10) {
        this.f2598d = i10;
    }
}

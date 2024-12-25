package p440z8;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import org.achartengine.renderer.DefaultRenderer;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:z8/c.class
 */
/* renamed from: z8.c */
/* loaded from: combined.jar:classes2.jar:z8/c.class */
public final class C10077c {

    /* renamed from: g */
    public static final C10077c f46244g = new C10077c(-1, DefaultRenderer.BACKGROUND_COLOR, 0, 0, -1, null);

    /* renamed from: a */
    public final int f46245a;

    /* renamed from: b */
    public final int f46246b;

    /* renamed from: c */
    public final int f46247c;

    /* renamed from: d */
    public final int f46248d;

    /* renamed from: e */
    public final int f46249e;

    /* renamed from: f */
    public final Typeface f46250f;

    public C10077c(int i10, int i11, int i12, int i13, int i14, Typeface typeface) {
        this.f46245a = i10;
        this.f46246b = i11;
        this.f46247c = i12;
        this.f46248d = i13;
        this.f46249e = i14;
        this.f46250f = typeface;
    }

    /* renamed from: a */
    public static C10077c m42395a(CaptioningManager.CaptionStyle captionStyle) {
        return C4401z0.f26679a >= 21 ? m42397c(captionStyle) : m42396b(captionStyle);
    }

    /* renamed from: b */
    public static C10077c m42396b(CaptioningManager.CaptionStyle captionStyle) {
        return new C10077c(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    /* renamed from: c */
    public static C10077c m42397c(CaptioningManager.CaptionStyle captionStyle) {
        return new C10077c(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f46244g.f46245a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f46244g.f46246b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f46244g.f46247c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f46244g.f46248d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f46244g.f46249e, captionStyle.getTypeface());
    }
}

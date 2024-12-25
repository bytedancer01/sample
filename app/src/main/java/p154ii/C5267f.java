package p154ii;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ii/f.class
 */
/* renamed from: ii.f */
/* loaded from: combined.jar:classes2.jar:ii/f.class */
public class C5267f {

    /* renamed from: a */
    public static final b f30277a = new c();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ii/f$b.class
     */
    /* renamed from: ii.f$b */
    /* loaded from: combined.jar:classes2.jar:ii/f$b.class */
    public interface b {
        /* renamed from: a */
        void mo26330a(ViewGroup viewGroup, View view, Rect rect);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ii/f$c.class
     */
    /* renamed from: ii.f$c */
    /* loaded from: combined.jar:classes2.jar:ii/f$c.class */
    public static class c implements b {
        public c() {
        }

        @Override // p154ii.C5267f.b
        /* renamed from: a */
        public void mo26330a(ViewGroup viewGroup, View view, Rect rect) {
            C5268g.m26332b(viewGroup, view, rect);
        }
    }

    /* renamed from: a */
    public static void m26328a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m26329b(viewGroup, view, rect);
    }

    /* renamed from: b */
    public static void m26329b(ViewGroup viewGroup, View view, Rect rect) {
        f30277a.mo26330a(viewGroup, view, rect);
    }
}

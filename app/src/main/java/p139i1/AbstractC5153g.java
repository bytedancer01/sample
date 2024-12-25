package p139i1;

import android.media.VolumeProvider;
import android.os.Build;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:i1/g.class
 */
/* renamed from: i1.g */
/* loaded from: combined.jar:classes1.jar:i1/g.class */
public abstract class AbstractC5153g {

    /* renamed from: a */
    public final int f29519a;

    /* renamed from: b */
    public final int f29520b;

    /* renamed from: c */
    public final String f29521c;

    /* renamed from: d */
    public int f29522d;

    /* renamed from: e */
    public d f29523e;

    /* renamed from: f */
    public VolumeProvider f29524f;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:i1/g$a.class
     */
    /* renamed from: i1.g$a */
    /* loaded from: combined.jar:classes1.jar:i1/g$a.class */
    public class a extends VolumeProvider {

        /* renamed from: a */
        public final AbstractC5153g f29525a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC5153g abstractC5153g, int i10, int i11, int i12, String str) {
            super(i10, i11, i12, str);
            this.f29525a = abstractC5153g;
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i10) {
            this.f29525a.mo25786e(i10);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i10) {
            this.f29525a.mo25787f(i10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:i1/g$b.class
     */
    /* renamed from: i1.g$b */
    /* loaded from: combined.jar:classes1.jar:i1/g$b.class */
    public class b extends VolumeProvider {

        /* renamed from: a */
        public final AbstractC5153g f29526a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC5153g abstractC5153g, int i10, int i11, int i12) {
            super(i10, i11, i12);
            this.f29526a = abstractC5153g;
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i10) {
            this.f29526a.mo25786e(i10);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i10) {
            this.f29526a.mo25787f(i10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:i1/g$c.class
     */
    /* renamed from: i1.g$c */
    /* loaded from: combined.jar:classes1.jar:i1/g$c.class */
    public static class c {
        /* renamed from: a */
        public static void m25790a(VolumeProvider volumeProvider, int i10) {
            volumeProvider.setCurrentVolume(i10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:i1/g$d.class
     */
    /* renamed from: i1.g$d */
    /* loaded from: combined.jar:classes1.jar:i1/g$d.class */
    public static abstract class d {
        public abstract void onVolumeChanged(AbstractC5153g abstractC5153g);
    }

    public AbstractC5153g(int i10, int i11, int i12, String str) {
        this.f29519a = i10;
        this.f29520b = i11;
        this.f29522d = i12;
        this.f29521c = str;
    }

    /* renamed from: a */
    public final int m25782a() {
        return this.f29522d;
    }

    /* renamed from: b */
    public final int m25783b() {
        return this.f29520b;
    }

    /* renamed from: c */
    public final int m25784c() {
        return this.f29519a;
    }

    /* renamed from: d */
    public Object m25785d() {
        if (this.f29524f == null) {
            this.f29524f = Build.VERSION.SDK_INT >= 30 ? new a(this, this.f29519a, this.f29520b, this.f29522d, this.f29521c) : new b(this, this.f29519a, this.f29520b, this.f29522d);
        }
        return this.f29524f;
    }

    /* renamed from: e */
    public abstract void mo25786e(int i10);

    /* renamed from: f */
    public abstract void mo25787f(int i10);

    /* renamed from: g */
    public void m25788g(d dVar) {
        this.f29523e = dVar;
    }

    /* renamed from: h */
    public final void m25789h(int i10) {
        this.f29522d = i10;
        c.m25790a((VolumeProvider) m25785d(), i10);
        d dVar = this.f29523e;
        if (dVar != null) {
            dVar.onVolumeChanged(this);
        }
    }
}

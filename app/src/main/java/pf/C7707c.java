package pf;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.util.SparseArray;
import android.view.View;
import android.widget.TableLayout;
import java.util.Locale;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:pf/c.class
 */
/* renamed from: pf.c */
/* loaded from: combined.jar:classes2.jar:pf/c.class */
public class C7707c {

    /* renamed from: a */
    public C7711g f37455a;

    /* renamed from: c */
    public IMediaPlayer f37457c;

    /* renamed from: b */
    public SparseArray<View> f37456b = new SparseArray<>();

    /* renamed from: d */
    public long f37458d = 0;

    /* renamed from: e */
    public long f37459e = 0;

    /* renamed from: f */
    @SuppressLint({"HandlerLeak"})
    public Handler f37460f = new a(this);

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:pf/c$a.class
     */
    /* renamed from: pf.c$a */
    /* loaded from: combined.jar:classes2.jar:pf/c$a.class */
    public class a extends Handler {

        /* renamed from: a */
        public final C7707c f37461a;

        public a(C7707c c7707c) {
            this.f37461a = c7707c;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void handleMessage(android.os.Message r13) {
            /*
                Method dump skipped, instructions count: 539
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: pf.C7707c.a.handleMessage(android.os.Message):void");
        }
    }

    public C7707c(Context context, TableLayout tableLayout) {
        this.f37455a = new C7711g(context, tableLayout);
    }

    /* renamed from: i */
    public static String m33664i(long j10) {
        Locale locale = Locale.US;
        Object[] objArr = new Object[1];
        if (j10 >= 1000) {
            objArr[0] = Float.valueOf(j10 / 1000.0f);
            return String.format(locale, "%.2f sec", objArr);
        }
        objArr[0] = Long.valueOf(j10);
        return String.format(locale, "%d msec", objArr);
    }

    /* renamed from: j */
    public static String m33665j(long j10) {
        return j10 >= 100000 ? String.format(Locale.US, "%.2f MB", Float.valueOf((j10 / 1000.0f) / 1000.0f)) : j10 >= 100 ? String.format(Locale.US, "%.1f KB", Float.valueOf(j10 / 1000.0f)) : String.format(Locale.US, "%d B", Long.valueOf(j10));
    }

    /* renamed from: k */
    public static String m33666k(long j10, long j11) {
        if (j11 <= 0 || j10 <= 0) {
            return "0 B/s";
        }
        float f10 = (j10 * 1000.0f) / j11;
        return f10 >= 1000000.0f ? String.format(Locale.US, "%.2f MB/s", Float.valueOf((f10 / 1000.0f) / 1000.0f)) : f10 >= 1000.0f ? String.format(Locale.US, "%.1f KB/s", Float.valueOf(f10 / 1000.0f)) : String.format(Locale.US, "%d B/s", Long.valueOf((long) f10));
    }

    /* renamed from: p */
    public static int m33667p() {
        return 0;
    }

    /* renamed from: l */
    public void m33668l(IMediaPlayer iMediaPlayer) {
        this.f37457c = iMediaPlayer;
        if (iMediaPlayer != null) {
            this.f37460f.sendEmptyMessageDelayed(1, 500L);
        } else {
            this.f37460f.removeMessages(1);
        }
    }

    /* renamed from: m */
    public final void m33669m(int i10, String str) {
        View view = this.f37456b.get(i10);
        if (view != null) {
            this.f37455a.m33697l(view, str);
        } else {
            this.f37456b.put(i10, this.f37455a.m33689c(i10, str));
        }
    }

    /* renamed from: n */
    public void m33670n(long j10) {
        this.f37458d = j10;
    }

    /* renamed from: o */
    public void m33671o(long j10) {
        this.f37459e = j10;
    }
}

package p189kf;

import android.content.Context;
import com.maxdigitall.maxdigitaliptvbox.model.EpisodesUsingSinglton;
import com.maxdigitall.maxdigitaliptvbox.model.callback.GetEpisdoeDetailsCallback;
import com.maxdigitall.maxdigitaliptvbox.model.database.SeriesRecentWatchDatabase;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import java.util.ArrayList;
import java.util.List;
import p290qf.C7920a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kf/m.class
 */
/* renamed from: kf.m */
/* loaded from: combined.jar:classes2.jar:kf/m.class */
public class C5602m {

    /* renamed from: b */
    public static SeriesRecentWatchDatabase f31687b;

    /* renamed from: a */
    public Context f31688a;

    public C5602m(Context context) {
        this.f31688a = context;
        f31687b = new SeriesRecentWatchDatabase(context);
    }

    /* renamed from: a */
    public int m27650a(String str) {
        C7920a.m34301l().m34316w(str);
        return f31687b.m15321B0(str);
    }

    /* renamed from: b */
    public void m27651b(String str) {
        new SeriesRecentWatchDatabase(this.f31688a).m15330q(str);
    }

    /* renamed from: c */
    public ArrayList<GetEpisdoeDetailsCallback> m27652c(String str) {
        SeriesRecentWatchDatabase seriesRecentWatchDatabase = f31687b;
        if (seriesRecentWatchDatabase != null) {
            return seriesRecentWatchDatabase.m15320B(str);
        }
        return null;
    }

    /* renamed from: d */
    public final void m27653d(Context context, List<GetEpisdoeDetailsCallback> list, int i10) {
        try {
            new SeriesRecentWatchDatabase(context).m15325f(list.get(i10));
        } catch (Exception e10) {
        }
    }

    /* renamed from: e */
    public final void m27654e(Context context, List<GetEpisdoeDetailsCallback> list, int i10) {
        m27653d(context, list, i10);
    }

    /* renamed from: f */
    public void m27655f() {
        if (C7920a.m34301l() == null || m27657h(C7920a.m34301l().m34308k(), SharepreferenceDBHandler.m15337A(this.f31688a)) != 0) {
            return;
        }
        try {
            m27658i(this.f31688a, EpisodesUsingSinglton.m14753c().m14755b().get(C7920a.m34301l().m34307j()).m14966r());
            m27654e(this.f31688a, EpisodesUsingSinglton.m14753c().m14755b(), C7920a.m34301l().m34307j());
        } catch (Exception e10) {
        }
    }

    /* renamed from: g */
    public void m27656g(Context context, GetEpisdoeDetailsCallback getEpisdoeDetailsCallback) {
        try {
            new SeriesRecentWatchDatabase(context).m15325f(getEpisdoeDetailsCallback);
        } catch (Exception e10) {
        }
    }

    /* renamed from: h */
    public int m27657h(String str, int i10) {
        return f31687b.m15321B0(str);
    }

    /* renamed from: i */
    public void m27658i(Context context, String str) {
        try {
            new SeriesRecentWatchDatabase(context).m15323D0(str);
        } catch (Exception e10) {
        }
    }

    /* renamed from: j */
    public void m27659j(String str, long j10) {
        SeriesRecentWatchDatabase seriesRecentWatchDatabase = f31687b;
        if (seriesRecentWatchDatabase != null) {
            seriesRecentWatchDatabase.m15324E0(str, Long.valueOf(j10));
        }
    }
}

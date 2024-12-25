package p203lf;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:lf/g.class
 */
/* renamed from: lf.g */
/* loaded from: combined.jar:classes2.jar:lf/g.class */
public class C5854g extends BaseAdapter {

    /* renamed from: b */
    public List<String> f32572b;

    /* renamed from: d */
    public List<String> f32574d;

    /* renamed from: e */
    public LayoutInflater f32575e;

    /* renamed from: f */
    public Context f32576f;

    /* renamed from: g */
    public DatabaseHandler f32577g;

    /* renamed from: h */
    public a f32578h;

    /* renamed from: k */
    public int f32581k = 0;

    /* renamed from: l */
    public int f32582l = 0;

    /* renamed from: m */
    public int f32583m = 0;

    /* renamed from: n */
    public int f32584n = 0;

    /* renamed from: o */
    public int f32585o = 0;

    /* renamed from: p */
    public int f32586p = 0;

    /* renamed from: q */
    public int f32587q = 0;

    /* renamed from: i */
    public List<Integer> f32579i = new ArrayList();

    /* renamed from: j */
    public List<Integer> f32580j = new ArrayList();

    /* renamed from: c */
    public List<String> f32573c = new ArrayList();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/g$a.class
     */
    /* renamed from: lf.g$a */
    /* loaded from: combined.jar:classes2.jar:lf/g$a.class */
    public static class a {

        /* renamed from: a */
        public TextView f32588a;

        /* renamed from: b */
        public TextView f32589b;

        /* renamed from: c */
        public TextView f32590c;

        /* renamed from: d */
        public ImageView f32591d;

        /* renamed from: e */
        public LinearLayout f32592e;
    }

    public C5854g(Context context, List<String> list) {
        this.f32574d = list;
        this.f32572b = list;
        this.f32576f = context;
        this.f32575e = LayoutInflater.from(context);
        this.f32577g = new DatabaseHandler(context);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f32574d.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        return this.f32574d.get(i10);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0166 A[Catch: Exception -> 0x01b4, TryCatch #1 {Exception -> 0x01b4, blocks: (B:37:0x00df, B:39:0x0123, B:41:0x012c, B:42:0x015e, B:44:0x0166, B:46:0x0173, B:48:0x017f, B:52:0x0188, B:53:0x019a, B:54:0x0134, B:56:0x013c, B:57:0x014b, B:59:0x0153), top: B:36:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019a A[Catch: Exception -> 0x01b4, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x01b4, blocks: (B:37:0x00df, B:39:0x0123, B:41:0x012c, B:42:0x015e, B:44:0x0166, B:46:0x0173, B:48:0x017f, B:52:0x0188, B:53:0x019a, B:54:0x0134, B:56:0x013c, B:57:0x014b, B:59:0x0153), top: B:36:0x00df }] */
    @Override // android.widget.Adapter
    @android.annotation.SuppressLint({"InflateParams"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p203lf.C5854g.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}

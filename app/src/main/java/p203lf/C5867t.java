package p203lf;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import java.util.ArrayList;
import nf.C6783a;
import p151if.C5251a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:lf/t.class
 */
/* renamed from: lf.t */
/* loaded from: combined.jar:classes2.jar:lf/t.class */
public class C5867t extends BaseAdapter implements Filterable {

    /* renamed from: b */
    public String f32782b;

    /* renamed from: e */
    public LayoutInflater f32785e;

    /* renamed from: g */
    public Context f32787g;

    /* renamed from: h */
    public DatabaseHandler f32788h;

    /* renamed from: i */
    public LiveStreamDBHandler f32789i;

    /* renamed from: j */
    public c f32790j;

    /* renamed from: k */
    public TextView f32791k;

    /* renamed from: l */
    public String f32792l;

    /* renamed from: m */
    public C6783a f32793m;

    /* renamed from: n */
    public boolean f32794n;

    /* renamed from: f */
    public b f32786f = new b();

    /* renamed from: c */
    public ArrayList<LiveStreamsDBModel> f32783c = new ArrayList<>();

    /* renamed from: d */
    public ArrayList<LiveStreamsDBModel> f32784d = new ArrayList<>();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/t$b.class
     */
    /* renamed from: lf.t$b */
    /* loaded from: combined.jar:classes2.jar:lf/t$b.class */
    public class b extends Filter {

        /* renamed from: a */
        public final C5867t f32795a;

        public b(C5867t c5867t) {
            this.f32795a = c5867t;
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase = charSequence.toString().toLowerCase();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList<LiveStreamsDBModel> arrayList = this.f32795a.f32783c;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                LiveStreamsDBModel liveStreamsDBModel = arrayList.get(i10);
                if (liveStreamsDBModel.getName().toLowerCase().contains(lowerCase) || liveStreamsDBModel.m14805L().contains(lowerCase)) {
                    arrayList2.add(liveStreamsDBModel);
                }
            }
            filterResults.values = arrayList2;
            filterResults.count = arrayList2.size();
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            TextView textView;
            int i10;
            try {
                this.f32795a.f32784d = (ArrayList) filterResults.values;
                this.f32795a.notifyDataSetChanged();
                if (this.f32795a.f32784d.size() == 0) {
                    textView = this.f32795a.f32791k;
                    i10 = 0;
                } else {
                    textView = this.f32795a.f32791k;
                    i10 = 8;
                }
                textView.setVisibility(i10);
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/t$c.class
     */
    /* renamed from: lf.t$c */
    /* loaded from: combined.jar:classes2.jar:lf/t$c.class */
    public static class c {

        /* renamed from: a */
        public TextView f32796a;

        /* renamed from: b */
        public ImageView f32797b;

        /* renamed from: c */
        public ImageView f32798c;

        /* renamed from: d */
        public ImageView f32799d;

        /* renamed from: e */
        public LinearLayout f32800e;

        /* renamed from: f */
        public TextView f32801f;

        /* renamed from: g */
        public LinearLayout f32802g;

        /* renamed from: h */
        public ProgressBar f32803h;

        /* renamed from: i */
        public TextView f32804i;

        /* renamed from: j */
        public LinearLayout f32805j;
    }

    public C5867t(Context context, ArrayList<LiveStreamsDBModel> arrayList) {
        this.f32792l = "mobile";
        this.f32787g = context;
        this.f32783c.clear();
        this.f32784d.clear();
        this.f32783c.addAll(arrayList);
        this.f32784d.addAll(arrayList);
        this.f32787g = context;
        this.f32785e = LayoutInflater.from(context);
        this.f32788h = new DatabaseHandler(context);
        this.f32789i = new LiveStreamDBHandler(context);
        C6783a c6783a = new C6783a(context);
        this.f32793m = c6783a;
        this.f32794n = c6783a.m31242A();
        if (new C6783a(context).m31288z().equals(C5251a.f30065s0)) {
            this.f32792l = "tv";
        } else {
            this.f32792l = "mobile";
        }
    }

    /* renamed from: c */
    public final void m28613c() {
        this.f32782b = this.f32787g.getSharedPreferences("currentlyPlayingVideo", 0).getString("currentlyPlayingVideo", "");
    }

    /* renamed from: d */
    public final void m28614d() {
        this.f32782b = this.f32787g.getSharedPreferences("currentlyPlayingVideo", 0).getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", "");
    }

    /* renamed from: e */
    public ArrayList<LiveStreamsDBModel> m28615e() {
        return this.f32784d;
    }

    /* renamed from: f */
    public void m28616f(TextView textView) {
        this.f32791k = textView;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        try {
            return this.f32784d.size();
        } catch (Exception e10) {
            return 0;
        }
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.f32786f;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        return this.f32784d.get(i10);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0305 A[Catch: Exception -> 0x061b, TryCatch #1 {Exception -> 0x061b, blocks: (B:5:0x011b, B:7:0x0122, B:9:0x013d, B:12:0x0165, B:13:0x017e, B:15:0x0192, B:17:0x01a3, B:19:0x01d7, B:21:0x01ed, B:23:0x0205, B:24:0x0295, B:26:0x02aa, B:30:0x02dd, B:32:0x0305, B:34:0x0320, B:36:0x0329, B:37:0x05a7, B:39:0x05b8, B:41:0x05ce, B:45:0x0600, B:46:0x034e, B:48:0x036e, B:51:0x02c4, B:56:0x020c, B:57:0x0225, B:59:0x024c, B:61:0x0262, B:62:0x027c, B:63:0x0375, B:65:0x03a9, B:67:0x03dd, B:69:0x03f3, B:71:0x040b, B:74:0x04a0, B:78:0x04d4, B:80:0x04fc, B:82:0x0517, B:84:0x0520, B:86:0x052c, B:88:0x0561, B:89:0x0544, B:91:0x054b, B:92:0x0585, B:95:0x04bb, B:100:0x0412, B:101:0x042b, B:103:0x0452, B:105:0x0468, B:106:0x0482, B:110:0x0130), top: B:4:0x011b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x05b8 A[Catch: Exception -> 0x061b, TryCatch #1 {Exception -> 0x061b, blocks: (B:5:0x011b, B:7:0x0122, B:9:0x013d, B:12:0x0165, B:13:0x017e, B:15:0x0192, B:17:0x01a3, B:19:0x01d7, B:21:0x01ed, B:23:0x0205, B:24:0x0295, B:26:0x02aa, B:30:0x02dd, B:32:0x0305, B:34:0x0320, B:36:0x0329, B:37:0x05a7, B:39:0x05b8, B:41:0x05ce, B:45:0x0600, B:46:0x034e, B:48:0x036e, B:51:0x02c4, B:56:0x020c, B:57:0x0225, B:59:0x024c, B:61:0x0262, B:62:0x027c, B:63:0x0375, B:65:0x03a9, B:67:0x03dd, B:69:0x03f3, B:71:0x040b, B:74:0x04a0, B:78:0x04d4, B:80:0x04fc, B:82:0x0517, B:84:0x0520, B:86:0x052c, B:88:0x0561, B:89:0x0544, B:91:0x054b, B:92:0x0585, B:95:0x04bb, B:100:0x0412, B:101:0x042b, B:103:0x0452, B:105:0x0468, B:106:0x0482, B:110:0x0130), top: B:4:0x011b }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x04fc A[Catch: Exception -> 0x061b, TryCatch #1 {Exception -> 0x061b, blocks: (B:5:0x011b, B:7:0x0122, B:9:0x013d, B:12:0x0165, B:13:0x017e, B:15:0x0192, B:17:0x01a3, B:19:0x01d7, B:21:0x01ed, B:23:0x0205, B:24:0x0295, B:26:0x02aa, B:30:0x02dd, B:32:0x0305, B:34:0x0320, B:36:0x0329, B:37:0x05a7, B:39:0x05b8, B:41:0x05ce, B:45:0x0600, B:46:0x034e, B:48:0x036e, B:51:0x02c4, B:56:0x020c, B:57:0x0225, B:59:0x024c, B:61:0x0262, B:62:0x027c, B:63:0x0375, B:65:0x03a9, B:67:0x03dd, B:69:0x03f3, B:71:0x040b, B:74:0x04a0, B:78:0x04d4, B:80:0x04fc, B:82:0x0517, B:84:0x0520, B:86:0x052c, B:88:0x0561, B:89:0x0544, B:91:0x054b, B:92:0x0585, B:95:0x04bb, B:100:0x0412, B:101:0x042b, B:103:0x0452, B:105:0x0468, B:106:0x0482, B:110:0x0130), top: B:4:0x011b }] */
    @Override // android.widget.Adapter
    @android.annotation.SuppressLint({"InflateParams"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            Method dump skipped, instructions count: 1571
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p203lf.C5867t.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}

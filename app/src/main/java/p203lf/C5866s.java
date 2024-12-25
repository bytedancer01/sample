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
import com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity;
import java.util.ArrayList;
import nf.C6783a;
import p151if.C5251a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:lf/s.class
 */
/* renamed from: lf.s */
/* loaded from: combined.jar:classes2.jar:lf/s.class */
public class C5866s extends BaseAdapter implements Filterable {

    /* renamed from: b */
    public String f32759b;

    /* renamed from: c */
    public ArrayList<LiveStreamsDBModel> f32760c;

    /* renamed from: d */
    public ArrayList<LiveStreamsDBModel> f32761d;

    /* renamed from: e */
    public LayoutInflater f32762e;

    /* renamed from: g */
    public Context f32764g;

    /* renamed from: h */
    public DatabaseHandler f32765h;

    /* renamed from: i */
    public LiveStreamDBHandler f32766i;

    /* renamed from: j */
    public c f32767j;

    /* renamed from: k */
    public String f32768k;

    /* renamed from: m */
    public C6783a f32770m;

    /* renamed from: n */
    public boolean f32771n;

    /* renamed from: f */
    public b f32763f = new b();

    /* renamed from: l */
    public boolean f32769l = false;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/s$b.class
     */
    /* renamed from: lf.s$b */
    /* loaded from: combined.jar:classes2.jar:lf/s$b.class */
    public class b extends Filter {

        /* renamed from: a */
        public final C5866s f32772a;

        public b(C5866s c5866s) {
            this.f32772a = c5866s;
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase = charSequence.toString().toLowerCase();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList<LiveStreamsDBModel> arrayList = this.f32772a.f32760c;
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
            try {
                this.f32772a.f32761d = (ArrayList) filterResults.values;
                this.f32772a.notifyDataSetChanged();
                if (this.f32772a.f32761d == null || this.f32772a.f32761d.size() != 0) {
                    if (!this.f32772a.f32768k.equals("mobile")) {
                        ((NSTIJKPlayerSkyTvActivity) this.f32772a.f32764g).m18605r2();
                    }
                } else if (!this.f32772a.f32768k.equals("mobile")) {
                    ((NSTIJKPlayerSkyTvActivity) this.f32772a.f32764g).m18548B2();
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/s$c.class
     */
    /* renamed from: lf.s$c */
    /* loaded from: combined.jar:classes2.jar:lf/s$c.class */
    public static class c {

        /* renamed from: a */
        public TextView f32773a;

        /* renamed from: b */
        public ImageView f32774b;

        /* renamed from: c */
        public ImageView f32775c;

        /* renamed from: d */
        public ImageView f32776d;

        /* renamed from: e */
        public LinearLayout f32777e;

        /* renamed from: f */
        public LinearLayout f32778f;

        /* renamed from: g */
        public ProgressBar f32779g;

        /* renamed from: h */
        public TextView f32780h;

        /* renamed from: i */
        public LinearLayout f32781i;
    }

    public C5866s(Context context, ArrayList<LiveStreamsDBModel> arrayList) {
        this.f32761d = null;
        this.f32768k = "mobile";
        ArrayList<LiveStreamsDBModel> arrayList2 = new ArrayList<>();
        this.f32761d = arrayList2;
        arrayList2.addAll(arrayList);
        ArrayList<LiveStreamsDBModel> arrayList3 = new ArrayList<>();
        this.f32760c = arrayList3;
        arrayList3.addAll(arrayList);
        this.f32764g = context;
        this.f32762e = LayoutInflater.from(context);
        this.f32765h = new DatabaseHandler(context);
        this.f32766i = new LiveStreamDBHandler(context);
        C6783a c6783a = new C6783a(context);
        this.f32770m = c6783a;
        this.f32771n = c6783a.m31242A();
        if (new C6783a(context).m31288z().equals(C5251a.f30065s0)) {
            this.f32768k = "tv";
        } else {
            this.f32768k = "mobile";
        }
    }

    /* renamed from: e */
    public final void m28608e() {
        this.f32759b = this.f32764g.getSharedPreferences("currentlyPlayingVideo", 0).getString("currentlyPlayingVideo", "");
    }

    /* renamed from: f */
    public final void m28609f() {
        this.f32759b = this.f32764g.getSharedPreferences("currentlyPlayingVideo", 0).getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", "");
    }

    /* renamed from: g */
    public ArrayList<LiveStreamsDBModel> m28610g() {
        return this.f32761d;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<LiveStreamsDBModel> arrayList = this.f32761d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.f32763f;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        try {
            return this.f32761d.get(i10);
        } catch (Exception e10) {
            return null;
        }
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x02da A[Catch: Exception -> 0x0598, TryCatch #4 {Exception -> 0x0598, blocks: (B:5:0x0108, B:7:0x010f, B:9:0x012a, B:12:0x0152, B:13:0x016b, B:15:0x017f, B:17:0x0190, B:19:0x01c4, B:21:0x01da, B:23:0x01f2, B:24:0x0282, B:26:0x0297, B:30:0x02ca, B:32:0x02da, B:34:0x02f5, B:36:0x02fe, B:37:0x0524, B:39:0x0535, B:41:0x054b, B:45:0x057d, B:46:0x0318, B:48:0x0338, B:51:0x02b1, B:56:0x01f9, B:57:0x0212, B:59:0x0239, B:61:0x024f, B:62:0x0269, B:63:0x033f, B:65:0x037e, B:67:0x03b2, B:69:0x03c8, B:71:0x03e0, B:74:0x0475, B:78:0x04a9, B:80:0x04b9, B:82:0x04d4, B:84:0x04dd, B:85:0x0502, B:88:0x0490, B:93:0x03e7, B:94:0x0400, B:96:0x0427, B:98:0x043d, B:99:0x0457, B:103:0x011d), top: B:4:0x0108 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0535 A[Catch: Exception -> 0x0598, TryCatch #4 {Exception -> 0x0598, blocks: (B:5:0x0108, B:7:0x010f, B:9:0x012a, B:12:0x0152, B:13:0x016b, B:15:0x017f, B:17:0x0190, B:19:0x01c4, B:21:0x01da, B:23:0x01f2, B:24:0x0282, B:26:0x0297, B:30:0x02ca, B:32:0x02da, B:34:0x02f5, B:36:0x02fe, B:37:0x0524, B:39:0x0535, B:41:0x054b, B:45:0x057d, B:46:0x0318, B:48:0x0338, B:51:0x02b1, B:56:0x01f9, B:57:0x0212, B:59:0x0239, B:61:0x024f, B:62:0x0269, B:63:0x033f, B:65:0x037e, B:67:0x03b2, B:69:0x03c8, B:71:0x03e0, B:74:0x0475, B:78:0x04a9, B:80:0x04b9, B:82:0x04d4, B:84:0x04dd, B:85:0x0502, B:88:0x0490, B:93:0x03e7, B:94:0x0400, B:96:0x0427, B:98:0x043d, B:99:0x0457, B:103:0x011d), top: B:4:0x0108 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x04b9 A[Catch: Exception -> 0x0598, TryCatch #4 {Exception -> 0x0598, blocks: (B:5:0x0108, B:7:0x010f, B:9:0x012a, B:12:0x0152, B:13:0x016b, B:15:0x017f, B:17:0x0190, B:19:0x01c4, B:21:0x01da, B:23:0x01f2, B:24:0x0282, B:26:0x0297, B:30:0x02ca, B:32:0x02da, B:34:0x02f5, B:36:0x02fe, B:37:0x0524, B:39:0x0535, B:41:0x054b, B:45:0x057d, B:46:0x0318, B:48:0x0338, B:51:0x02b1, B:56:0x01f9, B:57:0x0212, B:59:0x0239, B:61:0x024f, B:62:0x0269, B:63:0x033f, B:65:0x037e, B:67:0x03b2, B:69:0x03c8, B:71:0x03e0, B:74:0x0475, B:78:0x04a9, B:80:0x04b9, B:82:0x04d4, B:84:0x04dd, B:85:0x0502, B:88:0x0490, B:93:0x03e7, B:94:0x0400, B:96:0x0427, B:98:0x043d, B:99:0x0457, B:103:0x011d), top: B:4:0x0108 }] */
    @Override // android.widget.Adapter
    @android.annotation.SuppressLint({"InflateParams"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            Method dump skipped, instructions count: 1440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p203lf.C5866s.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}

package com.maxdigitall.maxdigitaliptvbox.view.fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.leanback.widget.C0493a;
import androidx.leanback.widget.C0548x;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.callback.SeriesDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.XMLTVProgrammePojo;
import com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivityLowerSDK;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.TimeZone;
import nf.C6783a;
import org.joda.time.LocalDateTime;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SearchFragmentLowerSDK.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SearchFragmentLowerSDK.class */
public class SearchFragmentLowerSDK extends Fragment implements Filterable {

    /* renamed from: c */
    public C0493a f22297c;

    /* renamed from: d */
    public String f22298d;

    @BindView
    public EditText et_search;

    /* renamed from: g */
    public LiveStreamDBHandler f22301g;

    /* renamed from: h */
    public Context f22302h;

    /* renamed from: b */
    public final Handler f22296b = new Handler();

    /* renamed from: e */
    public boolean f22299e = false;

    /* renamed from: f */
    public C3721e f22300f = new C3721e(this, null);

    /* renamed from: i */
    public boolean f22303i = false;

    /* renamed from: j */
    public ArrayList<String> f22304j = new ArrayList<>();

    /* renamed from: k */
    public final int f22305k = 1;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SearchFragmentLowerSDK$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragmentLowerSDK$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SearchFragmentLowerSDK$a.class */
    public class C3717a implements TextWatcher {

        /* renamed from: b */
        public final SearchFragmentLowerSDK f22306b;

        public C3717a(SearchFragmentLowerSDK searchFragmentLowerSDK) {
            this.f22306b = searchFragmentLowerSDK;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            this.f22306b.f22300f.filter(charSequence.toString());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SearchFragmentLowerSDK$b.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragmentLowerSDK$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SearchFragmentLowerSDK$b.class */
    public class AsyncTaskC3718b extends AsyncTask<String, Void, ArrayList<XMLTVProgrammePojo>> {

        /* renamed from: a */
        public final SearchFragmentLowerSDK f22307a;

        public AsyncTaskC3718b(SearchFragmentLowerSDK searchFragmentLowerSDK) {
            this.f22307a = searchFragmentLowerSDK;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList<XMLTVProgrammePojo> doInBackground(String... strArr) {
            return this.f22307a.m18151j();
        }

        /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x00a6 A[Catch: Exception -> 0x00bd, TryCatch #0 {Exception -> 0x00bd, blocks: (B:15:0x0009, B:17:0x0010, B:19:0x0052, B:21:0x0062, B:23:0x0072, B:5:0x009d, B:7:0x00a6, B:3:0x0082), top: B:14:0x0009 }] */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onPostExecute(java.util.ArrayList<com.maxdigitall.maxdigitaliptvbox.model.pojo.XMLTVProgrammePojo> r5) {
            /*
                r4 = this;
                r0 = r4
                r1 = r5
                super.onPostExecute(r1)
                r0 = r5
                if (r0 == 0) goto L82
                r0 = r5
                int r0 = r0.size()     // Catch: java.lang.Exception -> Lbd
                if (r0 <= 0) goto L82
                r0 = r4
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragmentLowerSDK r0 = r0.f22307a     // Catch: java.lang.Exception -> Lbd
                r1 = 1
                boolean r0 = com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragmentLowerSDK.m18146e(r0, r1)     // Catch: java.lang.Exception -> Lbd
                r0 = r4
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragmentLowerSDK r0 = r0.f22307a     // Catch: java.lang.Exception -> Lbd
                android.app.Activity r0 = r0.getActivity()     // Catch: java.lang.Exception -> Lbd
                com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivityLowerSDK r0 = (com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivityLowerSDK) r0     // Catch: java.lang.Exception -> Lbd
                r0.m16372i()     // Catch: java.lang.Exception -> Lbd
                r0 = r4
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragmentLowerSDK r0 = r0.f22307a     // Catch: java.lang.Exception -> Lbd
                android.app.Activity r0 = r0.getActivity()     // Catch: java.lang.Exception -> Lbd
                com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivityLowerSDK r0 = (com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivityLowerSDK) r0     // Catch: java.lang.Exception -> Lbd
                r1 = r5
                r2 = 0
                r0.m16389z(r1, r2)     // Catch: java.lang.Exception -> Lbd
                r0 = r4
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragmentLowerSDK r0 = r0.f22307a     // Catch: java.lang.Exception -> Lbd
                android.app.Activity r0 = r0.getActivity()     // Catch: java.lang.Exception -> Lbd
                com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivityLowerSDK r0 = (com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivityLowerSDK) r0     // Catch: java.lang.Exception -> Lbd
                r0.m16360J()     // Catch: java.lang.Exception -> Lbd
                r0 = r4
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragmentLowerSDK r0 = r0.f22307a     // Catch: java.lang.Exception -> Lbd
                android.app.Activity r0 = r0.getActivity()     // Catch: java.lang.Exception -> Lbd
                com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivityLowerSDK r0 = (com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivityLowerSDK) r0     // Catch: java.lang.Exception -> Lbd
                boolean r0 = r0.m16365b()     // Catch: java.lang.Exception -> Lbd
                if (r0 != 0) goto L9c
                r0 = r4
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragmentLowerSDK r0 = r0.f22307a     // Catch: java.lang.Exception -> Lbd
                android.app.Activity r0 = r0.getActivity()     // Catch: java.lang.Exception -> Lbd
                com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivityLowerSDK r0 = (com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivityLowerSDK) r0     // Catch: java.lang.Exception -> Lbd
                boolean r0 = r0.m16366c()     // Catch: java.lang.Exception -> Lbd
                if (r0 != 0) goto L9c
                r0 = r4
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragmentLowerSDK r0 = r0.f22307a     // Catch: java.lang.Exception -> Lbd
                android.app.Activity r0 = r0.getActivity()     // Catch: java.lang.Exception -> Lbd
                com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivityLowerSDK r0 = (com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivityLowerSDK) r0     // Catch: java.lang.Exception -> Lbd
                boolean r0 = r0.m16367d()     // Catch: java.lang.Exception -> Lbd
                if (r0 != 0) goto L9c
                r0 = r4
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragmentLowerSDK r0 = r0.f22307a     // Catch: java.lang.Exception -> Lbd
                android.app.Activity r0 = r0.getActivity()     // Catch: java.lang.Exception -> Lbd
                com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivityLowerSDK r0 = (com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivityLowerSDK) r0     // Catch: java.lang.Exception -> Lbd
                r0.m16359I()     // Catch: java.lang.Exception -> Lbd
                goto L9c
            L82:
                r0 = r4
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragmentLowerSDK r0 = r0.f22307a     // Catch: java.lang.Exception -> Lbd
                android.app.Activity r0 = r0.getActivity()     // Catch: java.lang.Exception -> Lbd
                com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivityLowerSDK r0 = (com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivityLowerSDK) r0     // Catch: java.lang.Exception -> Lbd
                r0.m16374k()     // Catch: java.lang.Exception -> Lbd
                r0 = r4
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragmentLowerSDK r0 = r0.f22307a     // Catch: java.lang.Exception -> Lbd
                android.app.Activity r0 = r0.getActivity()     // Catch: java.lang.Exception -> Lbd
                com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivityLowerSDK r0 = (com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivityLowerSDK) r0     // Catch: java.lang.Exception -> Lbd
                r0.m16373j()     // Catch: java.lang.Exception -> Lbd
            L9c:
                r0 = r4
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragmentLowerSDK r0 = r0.f22307a     // Catch: java.lang.Exception -> Lbd
                boolean r0 = com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragmentLowerSDK.m18145d(r0)     // Catch: java.lang.Exception -> Lbd
                if (r0 != 0) goto Lbc
                r0 = r4
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragmentLowerSDK r0 = r0.f22307a     // Catch: java.lang.Exception -> Lbd
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragmentLowerSDK.m18150i(r0)     // Catch: java.lang.Exception -> Lbd
                r0 = r4
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragmentLowerSDK r0 = r0.f22307a     // Catch: java.lang.Exception -> Lbd
                android.app.Activity r0 = r0.getActivity()     // Catch: java.lang.Exception -> Lbd
                com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivityLowerSDK r0 = (com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivityLowerSDK) r0     // Catch: java.lang.Exception -> Lbd
                java.lang.String r1 = "No Record Found"
                r0.m16358H(r1)     // Catch: java.lang.Exception -> Lbd
            Lbc:
                return
            Lbd:
                r5 = move-exception
                goto Lbc
            */
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragmentLowerSDK.AsyncTaskC3718b.onPostExecute(java.util.ArrayList):void");
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SearchFragmentLowerSDK$c.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragmentLowerSDK$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SearchFragmentLowerSDK$c.class */
    public class AsyncTaskC3719c extends AsyncTask<String, Void, ArrayList<LiveStreamsDBModel>> {

        /* renamed from: a */
        public final SearchFragmentLowerSDK f22308a;

        public AsyncTaskC3719c(SearchFragmentLowerSDK searchFragmentLowerSDK) {
            this.f22308a = searchFragmentLowerSDK;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList<LiveStreamsDBModel> doInBackground(String... strArr) {
            return this.f22308a.m18152k();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(ArrayList<LiveStreamsDBModel> arrayList) {
            Activity activity;
            super.onPostExecute(arrayList);
            if (arrayList != null) {
                try {
                    if (arrayList.size() > 0) {
                        ArrayList<LiveStreamsDBModel> arrayList2 = new ArrayList<>();
                        ArrayList<LiveStreamsDBModel> arrayList3 = new ArrayList<>();
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            String m14812S = arrayList.get(i10).m14812S();
                            boolean z10 = -1;
                            int hashCode = m14812S.hashCode();
                            if (hashCode != 3322092) {
                                if (hashCode != 104087344) {
                                    if (hashCode == 2002910179 && m14812S.equals("created_live")) {
                                        z10 = true;
                                    }
                                } else if (m14812S.equals("movie")) {
                                    z10 = 2;
                                }
                            } else if (m14812S.equals("live")) {
                                z10 = false;
                            }
                            if (!z10 || z10) {
                                arrayList2.add(arrayList.get(i10));
                            } else if (z10 == 2) {
                                arrayList3.add(arrayList.get(i10));
                            }
                        }
                        try {
                            if (arrayList3.size() > 0) {
                                this.f22308a.f22303i = true;
                                ((SearchActivityLowerSDK) this.f22308a.getActivity()).m16372i();
                                ((SearchActivityLowerSDK) this.f22308a.getActivity()).m16375l();
                                ((SearchActivityLowerSDK) this.f22308a.getActivity()).m16373j();
                                ((SearchActivityLowerSDK) this.f22308a.getActivity()).m16352B(arrayList3);
                                ((SearchActivityLowerSDK) this.f22308a.getActivity()).m16357G();
                                ((SearchActivityLowerSDK) this.f22308a.getActivity()).m16356F();
                            } else {
                                ((SearchActivityLowerSDK) this.f22308a.getActivity()).m16371h();
                                ((SearchActivityLowerSDK) this.f22308a.getActivity()).m16370g();
                            }
                        } catch (Exception e10) {
                        }
                        if (arrayList2.size() <= 0) {
                            ((SearchActivityLowerSDK) this.f22308a.getActivity()).m16369f();
                            activity = this.f22308a.getActivity();
                            ((SearchActivityLowerSDK) activity).m16368e();
                            C5255e.f30091o = new AsyncTaskC3718b(this.f22308a).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f22308a.f22298d);
                        }
                        this.f22308a.f22303i = true;
                        ((SearchActivityLowerSDK) this.f22308a.getActivity()).m16372i();
                        ((SearchActivityLowerSDK) this.f22308a.getActivity()).m16375l();
                        ((SearchActivityLowerSDK) this.f22308a.getActivity()).m16370g();
                        ((SearchActivityLowerSDK) this.f22308a.getActivity()).m16373j();
                        ((SearchActivityLowerSDK) this.f22308a.getActivity()).m16351A(arrayList2);
                        ((SearchActivityLowerSDK) this.f22308a.getActivity()).m16355E();
                        ((SearchActivityLowerSDK) this.f22308a.getActivity()).m16354D();
                        C5255e.f30091o = new AsyncTaskC3718b(this.f22308a).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f22308a.f22298d);
                    }
                } catch (Exception e11) {
                    return;
                }
            }
            ((SearchActivityLowerSDK) this.f22308a.getActivity()).m16371h();
            ((SearchActivityLowerSDK) this.f22308a.getActivity()).m16370g();
            ((SearchActivityLowerSDK) this.f22308a.getActivity()).m16369f();
            activity = this.f22308a.getActivity();
            ((SearchActivityLowerSDK) activity).m16368e();
            C5255e.f30091o = new AsyncTaskC3718b(this.f22308a).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f22308a.f22298d);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SearchFragmentLowerSDK$d.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragmentLowerSDK$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SearchFragmentLowerSDK$d.class */
    public class AsyncTaskC3720d extends AsyncTask<String, Void, ArrayList<SeriesDBModel>> {

        /* renamed from: a */
        public final SearchFragmentLowerSDK f22309a;

        public AsyncTaskC3720d(SearchFragmentLowerSDK searchFragmentLowerSDK) {
            this.f22309a = searchFragmentLowerSDK;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList<SeriesDBModel> doInBackground(String... strArr) {
            return this.f22309a.m18153l();
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(ArrayList<SeriesDBModel> arrayList) {
            super.onPostExecute(arrayList);
            if (arrayList != null) {
                try {
                } catch (Exception e10) {
                    Log.e("SearchFragmentLowerSDK", "onPostExecute: " + e10.getMessage());
                }
                if (arrayList.size() > 0) {
                    this.f22309a.f22303i = true;
                    ((SearchActivityLowerSDK) this.f22309a.getActivity()).m16372i();
                    ((SearchActivityLowerSDK) this.f22309a.getActivity()).m16373j();
                    ((SearchActivityLowerSDK) this.f22309a.getActivity()).m16353C(arrayList);
                    ((SearchActivityLowerSDK) this.f22309a.getActivity()).m16362L();
                    ((SearchActivityLowerSDK) this.f22309a.getActivity()).m16361K();
                    C5255e.f30091o = new AsyncTaskC3719c(this.f22309a).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f22309a.f22298d);
                }
            }
            ((SearchActivityLowerSDK) this.f22309a.getActivity()).m16376m();
            ((SearchActivityLowerSDK) this.f22309a.getActivity()).m16375l();
            C5255e.f30091o = new AsyncTaskC3719c(this.f22309a).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f22309a.f22298d);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SearchFragmentLowerSDK$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragmentLowerSDK$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SearchFragmentLowerSDK$e.class */
    public class C3721e extends Filter {

        /* renamed from: a */
        public final SearchFragmentLowerSDK f22310a;

        public C3721e(SearchFragmentLowerSDK searchFragmentLowerSDK) {
            this.f22310a = searchFragmentLowerSDK;
        }

        public /* synthetic */ C3721e(SearchFragmentLowerSDK searchFragmentLowerSDK, C3717a c3717a) {
            this(searchFragmentLowerSDK);
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            this.f22310a.m18155n(charSequence.toString().toLowerCase());
            return new Filter.FilterResults();
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        }
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.f22300f;
    }

    /* renamed from: j */
    public final ArrayList<XMLTVProgrammePojo> m18151j() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(new C6783a(this.f22302h).m31243B()));
        return this.f22301g.m15166G1(this.f22298d, simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + C5255e.m26200C(this.f22302h))));
    }

    /* renamed from: k */
    public final ArrayList<LiveStreamsDBModel> m18152k() {
        return this.f22301g.m15195U1(this.f22298d);
    }

    /* renamed from: l */
    public final ArrayList<SeriesDBModel> m18153l() {
        return this.f22301g.m15197V1(this.f22298d);
    }

    /* renamed from: m */
    public final void m18154m() {
        ((SearchActivityLowerSDK) getActivity()).m16369f();
        ((SearchActivityLowerSDK) getActivity()).m16371h();
        ((SearchActivityLowerSDK) getActivity()).m16376m();
        ((SearchActivityLowerSDK) getActivity()).m16374k();
        ((SearchActivityLowerSDK) getActivity()).m16368e();
        ((SearchActivityLowerSDK) getActivity()).m16370g();
        ((SearchActivityLowerSDK) getActivity()).m16375l();
        ((SearchActivityLowerSDK) getActivity()).m16373j();
    }

    /* renamed from: n */
    public final void m18155n(String str) {
        AsyncTask asyncTask = C5255e.f30091o;
        if (asyncTask != null && asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            C5255e.f30091o.cancel(true);
        }
        this.f22303i = false;
        if (!TextUtils.isEmpty(str) && !str.equals("nil")) {
            this.f22298d = str;
            C5255e.f30091o = new AsyncTaskC3720d(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        } else {
            Log.e("SearchFragmentLowerSDK", "loadQuery: hide all tabs");
            m18154m();
            ((SearchActivityLowerSDK) getActivity()).m16358H("Search any Channel, Movies and Series");
        }
    }

    /* renamed from: o */
    public final void m18156o() {
        EditText editText = this.et_search;
        if (editText != null) {
            editText.addTextChangedListener(new C3717a(this));
        }
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f22297c = new C0493a(new C0548x());
        this.f22302h = getActivity();
        this.f22301g = new LiveStreamDBHandler(this.f22302h);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setHasOptionsMenu(false);
        View inflate = layoutInflater.inflate(2131624219, viewGroup, false);
        ButterKnife.m5627b(this, inflate);
        m18156o();
        return inflate;
    }
}

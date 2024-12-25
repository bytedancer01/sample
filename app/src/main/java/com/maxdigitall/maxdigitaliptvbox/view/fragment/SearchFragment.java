package com.maxdigitall.maxdigitaliptvbox.view.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.ActivityC0416e;
import androidx.leanback.widget.AbstractC0494a0;
import androidx.leanback.widget.AbstractC0519j0;
import androidx.leanback.widget.AbstractC0537r0;
import androidx.leanback.widget.C0493a;
import androidx.leanback.widget.C0529o0;
import androidx.leanback.widget.C0548x;
import androidx.leanback.widget.InterfaceC0506e0;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.callback.SeriesDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.XMLTVProgrammePojo;
import com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity;
import com.maxdigitall.maxdigitaliptvbox.view.fragment.C3746a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.TimeZone;
import nf.C6783a;
import org.joda.time.LocalDateTime;
import p030c0.C0936d;
import p050d0.C4298j;
import p151if.C5255e;
import p413y0.C9793f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SearchFragment.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SearchFragment.class */
public class SearchFragment extends C3746a implements C3746a.i {

    /* renamed from: C */
    public C0493a f22284C;

    /* renamed from: D */
    public String f22285D;

    /* renamed from: F */
    public LiveStreamDBHandler f22287F;

    /* renamed from: G */
    public Context f22288G;

    /* renamed from: B */
    public final Handler f22283B = new Handler();

    /* renamed from: E */
    public boolean f22286E = false;

    /* renamed from: H */
    public boolean f22289H = false;

    /* renamed from: I */
    public ArrayList<String> f22290I = new ArrayList<>();

    /* renamed from: J */
    public final int f22291J = 1;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SearchFragment$b.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragment$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SearchFragment$b.class */
    public class AsyncTaskC3713b extends AsyncTask<String, Void, ArrayList<XMLTVProgrammePojo>> {

        /* renamed from: a */
        public final SearchFragment f22292a;

        public AsyncTaskC3713b(SearchFragment searchFragment) {
            this.f22292a = searchFragment;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList<XMLTVProgrammePojo> doInBackground(String... strArr) {
            return this.f22292a.m18127g0();
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
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragment r0 = r0.f22292a     // Catch: java.lang.Exception -> Lbd
                r1 = 1
                boolean r0 = com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragment.m18122Y(r0, r1)     // Catch: java.lang.Exception -> Lbd
                r0 = r4
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragment r0 = r0.f22292a     // Catch: java.lang.Exception -> Lbd
                androidx.fragment.app.e r0 = r0.getActivity()     // Catch: java.lang.Exception -> Lbd
                com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity r0 = (com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity) r0     // Catch: java.lang.Exception -> Lbd
                r0.m16336m0()     // Catch: java.lang.Exception -> Lbd
                r0 = r4
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragment r0 = r0.f22292a     // Catch: java.lang.Exception -> Lbd
                androidx.fragment.app.e r0 = r0.getActivity()     // Catch: java.lang.Exception -> Lbd
                com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity r0 = (com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity) r0     // Catch: java.lang.Exception -> Lbd
                r1 = r5
                r2 = 0
                r0.m16314F0(r1, r2)     // Catch: java.lang.Exception -> Lbd
                r0 = r4
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragment r0 = r0.f22292a     // Catch: java.lang.Exception -> Lbd
                androidx.fragment.app.e r0 = r0.getActivity()     // Catch: java.lang.Exception -> Lbd
                com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity r0 = (com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity) r0     // Catch: java.lang.Exception -> Lbd
                r0.m16324P0()     // Catch: java.lang.Exception -> Lbd
                r0 = r4
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragment r0 = r0.f22292a     // Catch: java.lang.Exception -> Lbd
                androidx.fragment.app.e r0 = r0.getActivity()     // Catch: java.lang.Exception -> Lbd
                com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity r0 = (com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity) r0     // Catch: java.lang.Exception -> Lbd
                boolean r0 = r0.m16329f0()     // Catch: java.lang.Exception -> Lbd
                if (r0 != 0) goto L9c
                r0 = r4
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragment r0 = r0.f22292a     // Catch: java.lang.Exception -> Lbd
                androidx.fragment.app.e r0 = r0.getActivity()     // Catch: java.lang.Exception -> Lbd
                com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity r0 = (com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity) r0     // Catch: java.lang.Exception -> Lbd
                boolean r0 = r0.m16330g0()     // Catch: java.lang.Exception -> Lbd
                if (r0 != 0) goto L9c
                r0 = r4
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragment r0 = r0.f22292a     // Catch: java.lang.Exception -> Lbd
                androidx.fragment.app.e r0 = r0.getActivity()     // Catch: java.lang.Exception -> Lbd
                com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity r0 = (com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity) r0     // Catch: java.lang.Exception -> Lbd
                boolean r0 = r0.m16331h0()     // Catch: java.lang.Exception -> Lbd
                if (r0 != 0) goto L9c
                r0 = r4
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragment r0 = r0.f22292a     // Catch: java.lang.Exception -> Lbd
                androidx.fragment.app.e r0 = r0.getActivity()     // Catch: java.lang.Exception -> Lbd
                com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity r0 = (com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity) r0     // Catch: java.lang.Exception -> Lbd
                r0.m16323O0()     // Catch: java.lang.Exception -> Lbd
                goto L9c
            L82:
                r0 = r4
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragment r0 = r0.f22292a     // Catch: java.lang.Exception -> Lbd
                androidx.fragment.app.e r0 = r0.getActivity()     // Catch: java.lang.Exception -> Lbd
                com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity r0 = (com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity) r0     // Catch: java.lang.Exception -> Lbd
                r0.m16338o0()     // Catch: java.lang.Exception -> Lbd
                r0 = r4
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragment r0 = r0.f22292a     // Catch: java.lang.Exception -> Lbd
                androidx.fragment.app.e r0 = r0.getActivity()     // Catch: java.lang.Exception -> Lbd
                com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity r0 = (com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity) r0     // Catch: java.lang.Exception -> Lbd
                r0.m16337n0()     // Catch: java.lang.Exception -> Lbd
            L9c:
                r0 = r4
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragment r0 = r0.f22292a     // Catch: java.lang.Exception -> Lbd
                boolean r0 = com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragment.m18121X(r0)     // Catch: java.lang.Exception -> Lbd
                if (r0 != 0) goto Lbc
                r0 = r4
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragment r0 = r0.f22292a     // Catch: java.lang.Exception -> Lbd
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragment.m18126f0(r0)     // Catch: java.lang.Exception -> Lbd
                r0 = r4
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragment r0 = r0.f22292a     // Catch: java.lang.Exception -> Lbd
                androidx.fragment.app.e r0 = r0.getActivity()     // Catch: java.lang.Exception -> Lbd
                com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity r0 = (com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity) r0     // Catch: java.lang.Exception -> Lbd
                java.lang.String r1 = "No Record Found"
                r0.m16322N0(r1)     // Catch: java.lang.Exception -> Lbd
            Lbc:
                return
            Lbd:
                r5 = move-exception
                goto Lbc
            */
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragment.AsyncTaskC3713b.onPostExecute(java.util.ArrayList):void");
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SearchFragment$c.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragment$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SearchFragment$c.class */
    public class AsyncTaskC3714c extends AsyncTask<String, Void, ArrayList<LiveStreamsDBModel>> {

        /* renamed from: a */
        public final SearchFragment f22293a;

        public AsyncTaskC3714c(SearchFragment searchFragment) {
            this.f22293a = searchFragment;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList<LiveStreamsDBModel> doInBackground(String... strArr) {
            return this.f22293a.m18128h0();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(ArrayList<LiveStreamsDBModel> arrayList) {
            ActivityC0416e activity;
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
                                this.f22293a.f22289H = true;
                                ((SearchActivity) this.f22293a.getActivity()).m16336m0();
                                ((SearchActivity) this.f22293a.getActivity()).m16339p0();
                                ((SearchActivity) this.f22293a.getActivity()).m16337n0();
                                ((SearchActivity) this.f22293a.getActivity()).m16316H0(arrayList3);
                                ((SearchActivity) this.f22293a.getActivity()).m16321M0();
                                ((SearchActivity) this.f22293a.getActivity()).m16320L0();
                            } else {
                                ((SearchActivity) this.f22293a.getActivity()).m16335l0();
                                ((SearchActivity) this.f22293a.getActivity()).m16334k0();
                            }
                        } catch (Exception e10) {
                        }
                        if (arrayList2.size() <= 0) {
                            ((SearchActivity) this.f22293a.getActivity()).m16333j0();
                            activity = this.f22293a.getActivity();
                            ((SearchActivity) activity).m16332i0();
                            C5255e.f30091o = new AsyncTaskC3713b(this.f22293a).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f22293a.f22285D);
                        }
                        this.f22293a.f22289H = true;
                        ((SearchActivity) this.f22293a.getActivity()).m16336m0();
                        ((SearchActivity) this.f22293a.getActivity()).m16339p0();
                        ((SearchActivity) this.f22293a.getActivity()).m16334k0();
                        ((SearchActivity) this.f22293a.getActivity()).m16337n0();
                        ((SearchActivity) this.f22293a.getActivity()).m16315G0(arrayList2);
                        ((SearchActivity) this.f22293a.getActivity()).m16319K0();
                        ((SearchActivity) this.f22293a.getActivity()).m16318J0();
                        C5255e.f30091o = new AsyncTaskC3713b(this.f22293a).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f22293a.f22285D);
                    }
                } catch (Exception e11) {
                    return;
                }
            }
            ((SearchActivity) this.f22293a.getActivity()).m16335l0();
            ((SearchActivity) this.f22293a.getActivity()).m16334k0();
            ((SearchActivity) this.f22293a.getActivity()).m16333j0();
            activity = this.f22293a.getActivity();
            ((SearchActivity) activity).m16332i0();
            C5255e.f30091o = new AsyncTaskC3713b(this.f22293a).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f22293a.f22285D);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SearchFragment$d.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragment$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SearchFragment$d.class */
    public class AsyncTaskC3715d extends AsyncTask<String, Void, ArrayList<SeriesDBModel>> {

        /* renamed from: a */
        public final SearchFragment f22294a;

        public AsyncTaskC3715d(SearchFragment searchFragment) {
            this.f22294a = searchFragment;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList<SeriesDBModel> doInBackground(String... strArr) {
            return this.f22294a.m18129i0();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:7:0x009b
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(java.util.ArrayList<com.maxdigitall.maxdigitaliptvbox.model.callback.SeriesDBModel> r8) {
            /*
                r7 = this;
                r0 = r7
                r1 = r8
                super.onPostExecute(r1)
                r0 = r8
                if (r0 == 0) goto L5e
                r0 = r8
                int r0 = r0.size()     // Catch: java.lang.Exception -> L9b
                if (r0 <= 0) goto L5e
                r0 = r7
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragment r0 = r0.f22294a     // Catch: java.lang.Exception -> L9b
                r1 = 1
                boolean r0 = com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragment.m18122Y(r0, r1)     // Catch: java.lang.Exception -> L9b
                r0 = r7
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragment r0 = r0.f22294a     // Catch: java.lang.Exception -> L9b
                androidx.fragment.app.e r0 = r0.getActivity()     // Catch: java.lang.Exception -> L9b
                com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity r0 = (com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity) r0     // Catch: java.lang.Exception -> L9b
                r0.m16336m0()     // Catch: java.lang.Exception -> L9b
                r0 = r7
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragment r0 = r0.f22294a     // Catch: java.lang.Exception -> L9b
                androidx.fragment.app.e r0 = r0.getActivity()     // Catch: java.lang.Exception -> L9b
                com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity r0 = (com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity) r0     // Catch: java.lang.Exception -> L9b
                r0.m16337n0()     // Catch: java.lang.Exception -> L9b
                r0 = r7
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragment r0 = r0.f22294a     // Catch: java.lang.Exception -> L9b
                androidx.fragment.app.e r0 = r0.getActivity()     // Catch: java.lang.Exception -> L9b
                com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity r0 = (com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity) r0     // Catch: java.lang.Exception -> L9b
                r1 = r8
                r0.m16317I0(r1)     // Catch: java.lang.Exception -> L9b
                r0 = r7
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragment r0 = r0.f22294a     // Catch: java.lang.Exception -> L9b
                androidx.fragment.app.e r0 = r0.getActivity()     // Catch: java.lang.Exception -> L9b
                com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity r0 = (com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity) r0     // Catch: java.lang.Exception -> L9b
                r0.m16326R0()     // Catch: java.lang.Exception -> L9b
                r0 = r7
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragment r0 = r0.f22294a     // Catch: java.lang.Exception -> L9b
                androidx.fragment.app.e r0 = r0.getActivity()     // Catch: java.lang.Exception -> L9b
                com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity r0 = (com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity) r0     // Catch: java.lang.Exception -> L9b
                r0.m16325Q0()     // Catch: java.lang.Exception -> L9b
                goto L78
            L5e:
                r0 = r7
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragment r0 = r0.f22294a     // Catch: java.lang.Exception -> L9b
                androidx.fragment.app.e r0 = r0.getActivity()     // Catch: java.lang.Exception -> L9b
                com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity r0 = (com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity) r0     // Catch: java.lang.Exception -> L9b
                r0.m16340q0()     // Catch: java.lang.Exception -> L9b
                r0 = r7
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragment r0 = r0.f22294a     // Catch: java.lang.Exception -> L9b
                androidx.fragment.app.e r0 = r0.getActivity()     // Catch: java.lang.Exception -> L9b
                com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity r0 = (com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity) r0     // Catch: java.lang.Exception -> L9b
                r0.m16339p0()     // Catch: java.lang.Exception -> L9b
            L78:
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragment$c r0 = new com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragment$c     // Catch: java.lang.Exception -> L9b
                r1 = r0
                r2 = r7
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragment r2 = r2.f22294a
                r1.<init>(r2)
                java.util.concurrent.Executor r1 = android.os.AsyncTask.THREAD_POOL_EXECUTOR
                r2 = 1
                java.lang.String[] r2 = new java.lang.String[r2]
                r3 = r2
                r4 = 0
                r5 = r7
                com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragment r5 = r5.f22294a
                java.lang.String r5 = com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragment.m18123Z(r5)
                r3[r4] = r5
                android.os.AsyncTask r0 = r0.executeOnExecutor(r1, r2)
                p151if.C5255e.f30091o = r0
                return
            L9b:
                r8 = move-exception
                goto L78
            */
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragment.AsyncTaskC3715d.onPostExecute(java.util.ArrayList):void");
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SearchFragment$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.SearchFragment$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SearchFragment$e.class */
    public final class C3716e implements InterfaceC0506e0 {

        /* renamed from: a */
        public final SearchFragment f22295a;

        public C3716e(SearchFragment searchFragment) {
            this.f22295a = searchFragment;
        }

        @Override // androidx.leanback.widget.InterfaceC0499c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2569a(AbstractC0519j0.a aVar, Object obj, AbstractC0537r0.b bVar, C0529o0 c0529o0) {
        }
    }

    /* renamed from: g0 */
    public final ArrayList<XMLTVProgrammePojo> m18127g0() {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(new C6783a(this.f22288G).m31243B()));
            return this.f22287F.m15166G1(this.f22285D, simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + C5255e.m26200C(this.f22288G))));
        } catch (Exception e10) {
            return null;
        }
    }

    /* renamed from: h0 */
    public final ArrayList<LiveStreamsDBModel> m18128h0() {
        return this.f22287F.m15195U1(this.f22285D);
    }

    /* renamed from: i0 */
    public final ArrayList<SeriesDBModel> m18129i0() {
        return this.f22287F.m15197V1(this.f22285D);
    }

    /* renamed from: j0 */
    public final boolean m18130j0(String str) {
        ActivityC0416e activity = getActivity();
        this.f22288G = activity;
        return activity.getPackageManager().checkPermission(str, this.f22288G.getPackageName()) == 0;
    }

    /* renamed from: k0 */
    public boolean m18131k0() {
        return this.f22284C.mo2536i() > 0 && this.f22286E;
    }

    @Override // com.maxdigitall.maxdigitaliptvbox.view.fragment.C3746a.i
    /* renamed from: l */
    public AbstractC0494a0 mo18132l() {
        return this.f22284C;
    }

    /* renamed from: l0 */
    public final void m18133l0() {
        ((SearchActivity) getActivity()).m16333j0();
        ((SearchActivity) getActivity()).m16335l0();
        ((SearchActivity) getActivity()).m16340q0();
        ((SearchActivity) getActivity()).m16338o0();
        ((SearchActivity) getActivity()).m16332i0();
        ((SearchActivity) getActivity()).m16334k0();
        ((SearchActivity) getActivity()).m16339p0();
        ((SearchActivity) getActivity()).m16337n0();
    }

    /* renamed from: m0 */
    public final void m18134m0(String str) {
        AsyncTask asyncTask = C5255e.f30091o;
        if (asyncTask != null && asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            C5255e.f30091o.cancel(true);
        }
        this.f22289H = false;
        if (TextUtils.isEmpty(str) || str.equals("nil")) {
            m18133l0();
            ((SearchActivity) getActivity()).m16322N0("Search any Channel, Movies and Series");
        } else {
            this.f22285D = str;
            C5255e.f30091o = new AsyncTaskC3715d(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (i10 != 16) {
            return;
        }
        if (i11 == -1) {
            m18223E(intent, true);
        } else {
            if (m18131k0()) {
                return;
            }
            Log.v("SearchFragment", "Voice search canceled");
            getView().findViewById(C9793f.f44994p).requestFocus();
        }
    }

    @Override // com.maxdigitall.maxdigitaliptvbox.view.fragment.C3746a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f22284C = new C0493a(new C0548x());
        this.f22288G = getActivity();
        this.f22287F = new LiveStreamDBHandler(this.f22288G);
        C4298j.m21759b(this.f22288G, "android.permission.RECORD_AUDIO");
        C0936d.m5641r(getActivity(), new String[]{"android.permission.RECORD_AUDIO"}, 1);
        m18226I(this);
        m18222B(new C3716e());
        Log.d("SearchFragment", "User is initiating a search. Do we have RECORD_AUDIO permission? " + m18130j0("android.permission.RECORD_AUDIO"));
        Log.d("SearchFragment", !m18130j0("android.permission.RECORD_AUDIO") ? "Does not have RECORD_AUDIO, using SpeechRecognitionCallback" : "We DO have RECORD_AUDIO");
    }

    @Override // com.maxdigitall.maxdigitaliptvbox.view.fragment.C3746a, androidx.fragment.app.Fragment
    public void onPause() {
        this.f22283B.removeCallbacksAndMessages(null);
        super.onPause();
    }

    @Override // com.maxdigitall.maxdigitaliptvbox.view.fragment.C3746a.i
    public boolean onQueryTextChange(String str) {
        Log.i("SearchFragment", String.format("Search text changed: %s", str));
        if (str.equals(this.f22285D)) {
            return true;
        }
        m18134m0(str);
        return true;
    }

    @Override // com.maxdigitall.maxdigitaliptvbox.view.fragment.C3746a.i
    public boolean onQueryTextSubmit(String str) {
        Log.i("SearchFragment", String.format("Search text submitted: %s", str));
        if (str.equals(this.f22285D)) {
            return true;
        }
        m18134m0(str);
        return true;
    }
}

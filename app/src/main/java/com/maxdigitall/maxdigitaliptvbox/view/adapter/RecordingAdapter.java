package com.maxdigitall.maxdigitaliptvbox.view.adapter;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.ExternalPlayerModelClass;
import com.maxdigitall.maxdigitaliptvbox.view.activity.RecordingActivity;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import nf.C6783a;
import p151if.C5251a;
import p151if.C5255e;
import p316s2.C8522c;
import pf.C7705a;
import pf.C7707c;
import pf.C7708d;
import pf.C7709e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/RecordingAdapter.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/RecordingAdapter.class */
public class RecordingAdapter extends RecyclerView.AbstractC0677h<MyViewHolder> {

    /* renamed from: n */
    public static C6783a f20259n;

    /* renamed from: o */
    public static String f20260o;

    /* renamed from: p */
    public static String f20261p;

    /* renamed from: e */
    public ArrayList<ExternalPlayerModelClass> f20262e;

    /* renamed from: f */
    public Boolean f20263f;

    /* renamed from: g */
    public Date f20264g;

    /* renamed from: h */
    public DateFormat f20265h;

    /* renamed from: i */
    public SimpleDateFormat f20266i;

    /* renamed from: j */
    public String f20267j;

    /* renamed from: k */
    public String f20268k;

    /* renamed from: l */
    public RecordingActivity f20269l;

    /* renamed from: m */
    public ArrayList<File> f20270m;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/RecordingAdapter$MyViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/RecordingAdapter$MyViewHolder.class */
    public static class MyViewHolder extends RecyclerView.AbstractC0674e0 {

        @BindView
        public ImageView iv_delete_recording;

        @BindView
        public LinearLayout ll_list_view;

        @BindView
        public TextView tv_date;

        @BindView
        public TextView tv_file_size;

        @BindView
        public TextView tv_recordings;

        @BindView
        public TextView tv_time;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.m5627b(this, view);
            m4048L(false);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/RecordingAdapter$MyViewHolder_ViewBinding.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/RecordingAdapter$MyViewHolder_ViewBinding.class */
    public class MyViewHolder_ViewBinding implements Unbinder {

        /* renamed from: b */
        public MyViewHolder f20271b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f20271b = myViewHolder;
            myViewHolder.tv_recordings = (TextView) C8522c.m36739c(view, 2131429587, "field 'tv_recordings'", TextView.class);
            myViewHolder.tv_file_size = (TextView) C8522c.m36739c(view, 2131429456, "field 'tv_file_size'", TextView.class);
            myViewHolder.tv_date = (TextView) C8522c.m36739c(view, 2131429407, "field 'tv_date'", TextView.class);
            myViewHolder.tv_time = (TextView) C8522c.m36739c(view, 2131429630, "field 'tv_time'", TextView.class);
            myViewHolder.iv_delete_recording = (ImageView) C8522c.m36739c(view, 2131428165, "field 'iv_delete_recording'", ImageView.class);
            myViewHolder.ll_list_view = (LinearLayout) C8522c.m36739c(view, 2131428433, "field 'll_list_view'", LinearLayout.class);
        }

        @Override // butterknife.Unbinder
        /* renamed from: a */
        public void mo5629a() {
            MyViewHolder myViewHolder = this.f20271b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f20271b = null;
            myViewHolder.tv_recordings = null;
            myViewHolder.tv_file_size = null;
            myViewHolder.tv_date = null;
            myViewHolder.tv_time = null;
            myViewHolder.iv_delete_recording = null;
            myViewHolder.ll_list_view = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/RecordingAdapter$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.RecordingAdapter$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/RecordingAdapter$a.class */
    public class ViewOnClickListenerC3455a implements View.OnClickListener {

        /* renamed from: b */
        public final int f20272b;

        /* renamed from: c */
        public final RecordingAdapter f20273c;

        public ViewOnClickListenerC3455a(RecordingAdapter recordingAdapter, int i10) {
            this.f20273c = recordingAdapter;
            this.f20272b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RecordingAdapter recordingAdapter = this.f20273c;
            recordingAdapter.m17331o0(view, this.f20272b, recordingAdapter.f20270m);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/RecordingAdapter$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.RecordingAdapter$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/RecordingAdapter$b.class */
    public class ViewOnClickListenerC3456b implements View.OnClickListener {

        /* renamed from: b */
        public final RecordingAdapter f20274b;

        public ViewOnClickListenerC3456b(RecordingAdapter recordingAdapter) {
            this.f20274b = recordingAdapter;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/RecordingAdapter$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.RecordingAdapter$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/RecordingAdapter$c.class */
    public class C3457c implements PopupMenu.OnMenuItemClickListener {

        /* renamed from: a */
        public final ArrayList f20275a;

        /* renamed from: b */
        public final int f20276b;

        /* renamed from: c */
        public final RecordingAdapter f20277c;

        public C3457c(RecordingAdapter recordingAdapter, ArrayList arrayList, int i10) {
            this.f20277c = recordingAdapter;
            this.f20275a = arrayList;
            this.f20276b = i10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        
            r0 = new android.content.Intent(r5.f20277c.f20269l, (java.lang.Class<?>) com.maxdigitall.maxdigitaliptvbox.view.activity.PlayExternalPlayerActivity.class);
            r0.putExtra("url", ((java.io.File) r5.f20275a.get(r5.f20276b)).getAbsolutePath());
            r0.putExtra("app_name", ((com.maxdigitall.maxdigitaliptvbox.model.pojo.ExternalPlayerModelClass) r5.f20277c.f20262e.get(r7)).m15415a());
            r0.putExtra("packagename", ((com.maxdigitall.maxdigitaliptvbox.model.pojo.ExternalPlayerModelClass) r5.f20277c.f20262e.get(r7)).m15416b());
            r5.f20277c.f20269l.startActivity(r0);
         */
        @Override // android.widget.PopupMenu.OnMenuItemClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onMenuItemClick(android.view.MenuItem r6) {
            /*
                Method dump skipped, instructions count: 612
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.adapter.RecordingAdapter.C3457c.onMenuItemClick(android.view.MenuItem):boolean");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/RecordingAdapter$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.RecordingAdapter$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/RecordingAdapter$d.class */
    public class C3458d implements PopupMenu.OnDismissListener {

        /* renamed from: a */
        public final RecordingAdapter f20278a;

        public C3458d(RecordingAdapter recordingAdapter) {
            this.f20278a = recordingAdapter;
        }

        @Override // android.widget.PopupMenu.OnDismissListener
        public void onDismiss(PopupMenu popupMenu) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/RecordingAdapter$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.RecordingAdapter$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/RecordingAdapter$e.class */
    public class ViewOnFocusChangeListenerC3459e implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f20279b;

        /* renamed from: c */
        public final RecordingAdapter f20280c;

        public ViewOnFocusChangeListenerC3459e(RecordingAdapter recordingAdapter, View view) {
            this.f20280c = recordingAdapter;
            this.f20279b = view;
        }

        /* renamed from: a */
        public final void m17332a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f20279b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m17333b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f20279b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m17334c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f20279b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            View view2;
            int i10;
            float f10 = 1.05f;
            if (z10) {
                if (!z10) {
                    f10 = 1.0f;
                }
                m17333b(f10);
                m17334c(f10);
                Log.e("id is", "" + this.f20279b.getTag());
                view2 = this.f20279b;
                i10 = 2131231896;
            } else {
                if (z10) {
                    return;
                }
                if (!z10) {
                    f10 = 1.0f;
                }
                m17333b(f10);
                m17334c(f10);
                m17332a(z10);
                view2 = this.f20279b;
                i10 = 2131231895;
            }
            view2.setBackgroundResource(i10);
        }
    }

    public RecordingAdapter(RecordingActivity recordingActivity, ArrayList<File> arrayList) {
        String str;
        String str2;
        this.f20263f = Boolean.TRUE;
        new ArrayList();
        this.f20270m = arrayList;
        this.f20269l = recordingActivity;
        this.f20267j = C5255e.m26247n0(C7705a.m33651a());
        f20260o = recordingActivity.getApplicationContext().getPackageName();
        f20261p = m17328l0(recordingActivity);
        this.f20268k = C5255e.m26247n0(C7708d.m33672d());
        Locale locale = Locale.US;
        this.f20266i = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f20265h = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f20264g = new Date();
        SimpleDateFormat simpleDateFormat = this.f20266i;
        if (m17327k0(simpleDateFormat, simpleDateFormat.format(new Date(C7709e.m33680a(recordingActivity))), this.f20265h.format(this.f20264g)) < C7707c.m33667p() || (str = this.f20267j) == null || this.f20268k == null) {
            return;
        }
        if (f20261p.equals(str) && (this.f20267j == null || (str2 = this.f20268k) == null || f20260o.equals(str2))) {
            return;
        }
        this.f20263f = Boolean.FALSE;
    }

    /* renamed from: k0 */
    public static long m17327k0(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0L;
        }
    }

    /* renamed from: l0 */
    public static String m17328l0(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public void mo2996G(MyViewHolder myViewHolder, int i10) {
        File file;
        TextView textView;
        StringBuilder sb2;
        String str;
        ArrayList<File> arrayList = this.f20270m;
        if (arrayList == null || (file = arrayList.get(i10)) == null) {
            return;
        }
        String string = this.f20269l.getSharedPreferences("timeFormat", 0).getString("timeFormat", C5251a.f30053m0);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", locale);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(string, locale);
        Date date = new Date(file.lastModified());
        Date date2 = new Date(file.lastModified());
        float length = (file.length() / 1024.0f) / 1024.0f;
        String name = file.getName();
        myViewHolder.tv_recordings.setText(name.substring(0, 1).toUpperCase() + name.substring(1));
        TextView textView2 = myViewHolder.tv_recordings;
        textView2.setPaintFlags(textView2.getPaintFlags() | 8);
        if (length > 1024.0f) {
            textView = myViewHolder.tv_file_size;
            sb2 = new StringBuilder();
            sb2.append((float) (Math.round((length / 1024.0f) * 100.0d) / 100.0d));
            str = " GB";
        } else {
            textView = myViewHolder.tv_file_size;
            sb2 = new StringBuilder();
            sb2.append((float) (Math.round(length * 100.0d) / 100.0d));
            str = " MB";
        }
        sb2.append(str);
        textView.setText(sb2.toString());
        myViewHolder.tv_date.setText(simpleDateFormat.format(date));
        myViewHolder.tv_time.setText(simpleDateFormat2.format(date2));
        LinearLayout linearLayout = myViewHolder.ll_list_view;
        linearLayout.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3459e(this, linearLayout));
        myViewHolder.ll_list_view.setOnClickListener(new ViewOnClickListenerC3455a(this, i10));
        myViewHolder.iv_delete_recording.setOnClickListener(new ViewOnClickListenerC3456b(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        return this.f20270m.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder mo2998J(ViewGroup viewGroup, int i10) {
        return new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(2131624491, viewGroup, false));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:14:0x00d0
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* renamed from: o0 */
    public final void m17331o0(android.view.View r8, int r9, java.util.ArrayList<java.io.File> r10) {
        /*
            r7 = this;
            android.widget.PopupMenu r0 = new android.widget.PopupMenu
            r1 = r0
            r2 = r7
            com.maxdigitall.maxdigitaliptvbox.view.activity.RecordingActivity r2 = r2.f20269l
            r3 = r8
            r1.<init>(r2, r3)
            r8 = r0
            r0 = r8
            android.view.MenuInflater r0 = r0.getMenuInflater()
            r1 = 2131689493(0x7f0f0015, float:1.9008003E38)
            r2 = r8
            android.view.Menu r2 = r2.getMenu()
            r0.inflate(r1, r2)
            r0 = r7
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.f20262e = r1
            com.maxdigitall.maxdigitaliptvbox.model.database.ExternalPlayerDataBase r0 = new com.maxdigitall.maxdigitaliptvbox.model.database.ExternalPlayerDataBase
            r1 = r0
            r2 = r7
            com.maxdigitall.maxdigitaliptvbox.view.activity.RecordingActivity r2 = r2.f20269l
            r1.<init>(r2)
            java.util.ArrayList r0 = r0.m15132o()
            r12 = r0
            r0 = r7
            r1 = r12
            r0.f20262e = r1
            r0 = r12
            if (r0 == 0) goto Lb1
            r0 = r12
            int r0 = r0.size()
            if (r0 <= 0) goto Lb1
            r0 = 0
            r11 = r0
        L4c:
            r0 = r11
            r1 = r7
            java.util.ArrayList<com.maxdigitall.maxdigitaliptvbox.model.pojo.ExternalPlayerModelClass> r1 = r1.f20262e
            int r1 = r1.size()
            if (r0 >= r1) goto Lb1
            r0 = r8
            android.view.Menu r0 = r0.getMenu()     // Catch: java.lang.Exception -> Ld0
            r13 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld0
            r12 = r0
            r0 = r12
            r0.<init>()     // Catch: java.lang.Exception -> Ld0
            r0 = r12
            r1 = r7
            com.maxdigitall.maxdigitaliptvbox.view.activity.RecordingActivity r1 = r1.f20269l     // Catch: java.lang.Exception -> Ld0
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Exception -> Ld0
            r2 = 2132018328(0x7f140498, float:1.967496E38)
            java.lang.String r1 = r1.getString(r2)     // Catch: java.lang.Exception -> Ld0
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> Ld0
            r0 = r12
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> Ld0
            r0 = r12
            r1 = r7
            java.util.ArrayList<com.maxdigitall.maxdigitaliptvbox.model.pojo.ExternalPlayerModelClass> r1 = r1.f20262e     // Catch: java.lang.Exception -> Ld0
            r2 = r11
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> Ld0
            com.maxdigitall.maxdigitaliptvbox.model.pojo.ExternalPlayerModelClass r1 = (com.maxdigitall.maxdigitaliptvbox.model.pojo.ExternalPlayerModelClass) r1     // Catch: java.lang.Exception -> Ld0
            java.lang.String r1 = r1.m15415a()     // Catch: java.lang.Exception -> Ld0
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> Ld0
            r0 = r13
            r1 = 0
            r2 = r11
            r3 = r11
            r4 = r12
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Ld0
            android.view.MenuItem r0 = r0.add(r1, r2, r3, r4)     // Catch: java.lang.Exception -> Ld0
        Lab:
            int r11 = r11 + 1
            goto L4c
        Lb1:
            r0 = r8
            com.maxdigitall.maxdigitaliptvbox.view.adapter.RecordingAdapter$c r1 = new com.maxdigitall.maxdigitaliptvbox.view.adapter.RecordingAdapter$c
            r2 = r1
            r3 = r7
            r4 = r10
            r5 = r9
            r2.<init>(r3, r4, r5)
            r0.setOnMenuItemClickListener(r1)
            r0 = r8
            com.maxdigitall.maxdigitaliptvbox.view.adapter.RecordingAdapter$d r1 = new com.maxdigitall.maxdigitaliptvbox.view.adapter.RecordingAdapter$d
            r2 = r1
            r3 = r7
            r2.<init>(r3)
            r0.setOnDismissListener(r1)
            r0 = r8
            r0.show()
            return
        Ld0:
            r12 = move-exception
            goto Lab
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.adapter.RecordingAdapter.m17331o0(android.view.View, int, java.util.ArrayList):void");
    }
}

package com.maxdigitall.maxdigitaliptvbox.view.activity;

import af.C0160c;
import af.C0163f;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cf.C1087k;
import com.amazonaws.services.p045s3.internal.Constants;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import com.maxdigitall.maxdigitaliptvbox.model.Mylist;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nf.C6783a;
import p059d9.C4392v;
import p151if.C5251a;
import p189kf.AbstractActivityC5599j;
import p203lf.C5856i;
import p203lf.C5873z;
import p203lf.InterfaceC5862o;
import p445ze.InterfaceC10206b;
import ve.C9343d;
import ye.C9982a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VideoPickActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VideoPickActivity.class */
public class VideoPickActivity extends AbstractActivityC5599j {

    /* renamed from: D */
    public int f19117D;

    /* renamed from: G */
    public Context f19120G;

    /* renamed from: f */
    public int f19121f;

    /* renamed from: h */
    public RecyclerView f19123h;

    /* renamed from: i */
    public C5873z f19124i;

    /* renamed from: j */
    public boolean f19125j;

    /* renamed from: k */
    public boolean f19126k;

    /* renamed from: m */
    public List<C0160c<C0163f>> f19128m;

    /* renamed from: n */
    public ProgressBar f19129n;

    /* renamed from: o */
    public TextView f19130o;

    /* renamed from: p */
    public TextView f19131p;

    /* renamed from: q */
    public LinearLayout f19132q;

    /* renamed from: r */
    public RelativeLayout f19133r;

    /* renamed from: s */
    public RelativeLayout f19134s;

    /* renamed from: t */
    public List<C0163f> f19135t;

    /* renamed from: u */
    public long f19136u;

    /* renamed from: v */
    public String f19137v;

    /* renamed from: w */
    public String f19138w;

    /* renamed from: x */
    public int f19139x;

    /* renamed from: y */
    public int f19140y;

    /* renamed from: z */
    public String f19141z;

    /* renamed from: g */
    public int f19122g = 0;

    /* renamed from: l */
    public ArrayList<C0163f> f19127l = new ArrayList<>();

    /* renamed from: A */
    public ArrayList<Mylist> f19114A = new ArrayList<>();

    /* renamed from: B */
    public int f19115B = 0;

    /* renamed from: C */
    public AsyncTask f19116C = null;

    /* renamed from: E */
    public C1087k f19118E = new C1087k();

    /* renamed from: F */
    public Handler f19119F = new Handler();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VideoPickActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VideoPickActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VideoPickActivity$a.class */
    public class ViewOnClickListenerC3234a implements View.OnClickListener {

        /* renamed from: b */
        public final VideoPickActivity f19142b;

        public ViewOnClickListenerC3234a(VideoPickActivity videoPickActivity) {
            this.f19142b = videoPickActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putParcelableArrayListExtra("ResultPickVideo", this.f19142b.f19127l);
            this.f19142b.setResult(-1, intent);
            this.f19142b.finish();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VideoPickActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VideoPickActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VideoPickActivity$b.class */
    public class ViewOnClickListenerC3235b implements View.OnClickListener {

        /* renamed from: b */
        public final VideoPickActivity f19143b;

        public ViewOnClickListenerC3235b(VideoPickActivity videoPickActivity) {
            this.f19143b = videoPickActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VideoPickActivity videoPickActivity = this.f19143b;
            videoPickActivity.f31684d.m39376d(videoPickActivity.f19134s);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VideoPickActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VideoPickActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VideoPickActivity$c.class */
    public class C3236c implements C5856i.b {

        /* renamed from: a */
        public final VideoPickActivity f19144a;

        public C3236c(VideoPickActivity videoPickActivity) {
            this.f19144a = videoPickActivity;
        }

        @Override // p203lf.C5856i.b
        /* renamed from: a */
        public void mo15596a(C0160c c0160c) {
            if (this.f19144a.f19124i != null) {
                if (this.f19144a.f19116C != null && this.f19144a.f19116C.getStatus().equals(AsyncTask.Status.RUNNING)) {
                    this.f19144a.f19116C.cancel(true);
                }
                this.f19144a.f19114A.clear();
                this.f19144a.f19123h.setAdapter(null);
                this.f19144a.f19124i.m4099w();
            }
            VideoPickActivity videoPickActivity = this.f19144a;
            videoPickActivity.f31684d.m39376d(videoPickActivity.f19134s);
            this.f19144a.f19131p.setText(c0160c.m715c());
            this.f19144a.f19135t.clear();
            if (TextUtils.isEmpty(c0160c.m716d())) {
                VideoPickActivity videoPickActivity2 = this.f19144a;
                videoPickActivity2.m16793K0(videoPickActivity2.f19128m);
                return;
            }
            for (C0160c c0160c2 : this.f19144a.f19128m) {
                if (c0160c2.m716d().equals(c0160c.m716d())) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c0160c2);
                    this.f19144a.m16793K0(arrayList);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VideoPickActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VideoPickActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VideoPickActivity$d.class */
    public class C3237d implements InterfaceC10206b<C0163f> {

        /* renamed from: a */
        public final VideoPickActivity f19145a;

        public C3237d(VideoPickActivity videoPickActivity) {
            this.f19145a = videoPickActivity;
        }

        @Override // p445ze.InterfaceC10206b
        /* renamed from: a */
        public void mo15597a(List<C0160c<C0163f>> list) {
            this.f19145a.f19129n.setVisibility(8);
            if (this.f19145a.f31685e) {
                ArrayList arrayList = new ArrayList();
                C0160c c0160c = new C0160c();
                c0160c.m718f(this.f19145a.getResources().getString(2132018796));
                arrayList.add(c0160c);
                arrayList.addAll(list);
                this.f19145a.f31684d.m39373a(arrayList);
            }
            this.f19145a.f19128m = list;
            VideoPickActivity videoPickActivity = this.f19145a;
            if (videoPickActivity.f19115B == 0) {
                videoPickActivity.m16793K0(list);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VideoPickActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VideoPickActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VideoPickActivity$e.class */
    public class C3238e implements InterfaceC5862o<C0163f> {

        /* renamed from: a */
        public final VideoPickActivity f19146a;

        public C3238e(VideoPickActivity videoPickActivity) {
            this.f19146a = videoPickActivity;
        }

        @Override // p203lf.InterfaceC5862o
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo15598a(boolean z10, C0163f c0163f) {
            if (z10) {
                this.f19146a.f19127l.add(c0163f);
                VideoPickActivity.m16779F0(this.f19146a);
            } else {
                this.f19146a.f19127l.remove(c0163f);
                VideoPickActivity.m16780G0(this.f19146a);
            }
            this.f19146a.f19130o.setText(this.f19146a.f19122g + "/" + this.f19146a.f19121f);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VideoPickActivity$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VideoPickActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VideoPickActivity$f.class */
    public class RunnableC3239f implements Runnable {

        /* renamed from: b */
        public final VideoPickActivity f19147b;

        public RunnableC3239f(VideoPickActivity videoPickActivity) {
            this.f19147b = videoPickActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f19147b.f19116C = new AsyncTaskC3240g(this.f19147b, 0).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VideoPickActivity$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VideoPickActivity$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VideoPickActivity$g.class */
    public class AsyncTaskC3240g extends AsyncTask<String, Integer, Boolean> {

        /* renamed from: a */
        public final VideoPickActivity f19148a;

        public AsyncTaskC3240g(VideoPickActivity videoPickActivity, int i10) {
            this.f19148a = videoPickActivity;
            videoPickActivity.f19117D = 1;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            DecimalFormat decimalFormat;
            int i10;
            C1087k c1087k;
            StringBuilder sb2;
            try {
                decimalFormat = new DecimalFormat("#.##");
                this.f19148a.f19114A.clear();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            for (i10 = 0; i10 < this.f19148a.f19135t.size(); i10++) {
                C1087k c1087k2 = this.f19148a.f19118E;
                if (c1087k2 != null) {
                    try {
                        c1087k2.m6480e();
                    } catch (InterruptedException e11) {
                        e11.printStackTrace();
                    }
                }
                if ((this.f19148a.f19116C != null && this.f19148a.f19116C.isCancelled()) || ((c1087k = this.f19148a.f19118E) != null && c1087k.m6477b())) {
                    C4392v.m22268b("hgsdfhg", "hgshf");
                    break;
                }
                C0163f c0163f = this.f19148a.f19135t.get(i10);
                long length = new File(c0163f.m710z()).length();
                this.f19148a.f19136u = length / 1024;
                float f10 = length / 1024;
                if (f10 >= Constants.f7590MB) {
                    float floatValue = Float.valueOf(decimalFormat.format(f10 / r0)).floatValue();
                    sb2 = new StringBuilder();
                    sb2.append(String.valueOf(floatValue));
                    sb2.append(" GB");
                } else if (f10 >= 1024) {
                    float floatValue2 = Float.valueOf(decimalFormat.format(f10 / 1024.0f)).floatValue();
                    sb2 = new StringBuilder();
                    sb2.append(String.valueOf(floatValue2));
                    sb2.append(" MB");
                } else {
                    sb2 = new StringBuilder();
                    sb2.append(String.valueOf(f10));
                    sb2.append(" KB");
                }
                String sb3 = sb2.toString();
                this.f19148a.f19137v = c0163f.m710z().substring(c0163f.m710z().lastIndexOf("/") + 1);
                this.f19148a.f19138w = c0163f.m710z().substring(c0163f.m710z().lastIndexOf(InstructionFileId.DOT) + 1);
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(c0163f.m710z());
                Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime();
                try {
                    this.f19148a.f19139x = frameAtTime.getWidth();
                    this.f19148a.f19140y = frameAtTime.getHeight();
                } catch (Exception e12) {
                    VideoPickActivity videoPickActivity = this.f19148a;
                    videoPickActivity.f19139x = 0;
                    videoPickActivity.f19140y = 0;
                }
                long lastModified = new File(c0163f.m710z()).lastModified();
                this.f19148a.f19141z = C9343d.m39383d(c0163f.m727V());
                VideoPickActivity videoPickActivity2 = this.f19148a;
                videoPickActivity2.f19114A.add(new Mylist(videoPickActivity2.f19137v, lastModified, sb3, videoPickActivity2.f19139x, videoPickActivity2.f19140y, videoPickActivity2.f19141z, videoPickActivity2.f19138w));
                if (i10 == 10 || (i10 != 0 && i10 % 10 == 0)) {
                    publishProgress(Integer.valueOf(i10));
                }
                e10.printStackTrace();
            }
            return Boolean.TRUE;
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            VideoPickActivity videoPickActivity = this.f19148a;
            videoPickActivity.f19117D = 0;
            videoPickActivity.f19129n.setVisibility(8);
            this.f19148a.f19124i.m28679j0(this.f19148a.f19114A);
            this.f19148a.f19124i.m4099w();
            this.f19148a.f19124i.m28485d0(this.f19148a.f19135t);
        }

        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
            super.onProgressUpdate(numArr);
            this.f19148a.f19129n.setVisibility(8);
            this.f19148a.f19124i.m28679j0(this.f19148a.f19114A);
            this.f19148a.f19124i.m4099w();
            this.f19148a.f19124i.m28485d0(this.f19148a.f19135t);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            this.f19148a.f19129n.setVisibility(0);
            if (this.f19148a.f19116C == null || !this.f19148a.f19116C.getStatus().equals(AsyncTask.Status.RUNNING)) {
                return;
            }
            this.f19148a.f19116C.cancel(true);
        }
    }

    /* renamed from: F0 */
    public static /* synthetic */ int m16779F0(VideoPickActivity videoPickActivity) {
        int i10 = videoPickActivity.f19122g;
        videoPickActivity.f19122g = i10 + 1;
        return i10;
    }

    /* renamed from: G0 */
    public static /* synthetic */ int m16780G0(VideoPickActivity videoPickActivity) {
        int i10 = videoPickActivity.f19122g;
        videoPickActivity.f19122g = i10 - 1;
        return i10;
    }

    /* renamed from: H0 */
    public final boolean m16790H0(List<C0163f> list) {
        for (C0163f c0163f : list) {
            if (c0163f.m710z().equals(this.f19124i.f32918k)) {
                this.f19127l.add(c0163f);
                int i10 = this.f19122g + 1;
                this.f19122g = i10;
                this.f19124i.m28682m0(i10);
                this.f19130o.setText(this.f19122g + "/" + this.f19121f);
                return true;
            }
        }
        return false;
    }

    /* renamed from: I0 */
    public final void m16791I0() {
        TextView textView = (TextView) findViewById(2131429391);
        this.f19130o = textView;
        textView.setText(this.f19122g + "/" + this.f19121f);
        this.f19123h.setLayoutManager(new LinearLayoutManager(this));
        this.f19129n = (ProgressBar) findViewById(2131428842);
        if (new File(getExternalCacheDir().getAbsolutePath() + File.separator + "FilePick").exists()) {
            this.f19129n.setVisibility(8);
        } else {
            this.f19129n.setVisibility(0);
        }
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(2131428969);
        this.f19133r = relativeLayout;
        relativeLayout.setOnClickListener(new ViewOnClickListenerC3234a(this));
        this.f19134s = (RelativeLayout) findViewById(2131429271);
        LinearLayout linearLayout = (LinearLayout) findViewById(2131428406);
        this.f19132q = linearLayout;
        if (this.f31685e) {
            linearLayout.setVisibility(0);
            this.f19132q.setOnClickListener(new ViewOnClickListenerC3235b(this));
            TextView textView2 = (TextView) findViewById(2131429458);
            this.f19131p = textView2;
            textView2.setText(getResources().getString(2132018796));
            try {
                this.f31684d.m39375c(new C3236c(this));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* renamed from: J0 */
    public final void m16792J0() {
        C9982a.m41929b(this, new C3237d(this));
    }

    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: K0 */
    public final void m16793K0(List<C0160c<C0163f>> list) {
        boolean z10 = this.f19126k;
        C5873z c5873z = new C5873z(this, this.f19125j, this.f19121f);
        this.f19124i = c5873z;
        this.f19123h.setAdapter(c5873z);
        boolean z11 = z10;
        if (z10) {
            z11 = z10;
            if (!TextUtils.isEmpty(this.f19124i.f32918k)) {
                z11 = !this.f19124i.m28678i0() && new File(this.f19124i.f32918k).exists();
            }
        }
        this.f19135t.clear();
        for (C0160c<C0163f> c0160c : list) {
            this.f19135t.addAll(c0160c.m714b());
            if (z11) {
                z11 = m16790H0(c0160c.m714b());
            }
        }
        Iterator<C0163f> it = this.f19127l.iterator();
        while (it.hasNext()) {
            int indexOf = this.f19135t.indexOf(it.next());
            if (indexOf != -1) {
                this.f19135t.get(indexOf).m703T(true);
            }
        }
        this.f19124i.m28486e0(new C3238e(this));
        Handler handler = this.f19119F;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f19119F.postDelayed(new RunnableC3239f(this), 1000L);
        }
    }

    @Override // p189kf.AbstractActivityC5599j, androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f19120G = this;
        super.onCreate(bundle);
        setContentView(2131624563);
        if (new C6783a(this.f19120G).m31288z().equals(C5251a.f30065s0)) {
            setRequestedOrientation(0);
        } else {
            setRequestedOrientation(1);
        }
        this.f19135t = new ArrayList();
        this.f19121f = getIntent().getIntExtra("MaxNumber", 9);
        this.f19125j = getIntent().getBooleanExtra("IsNeedCamera", false);
        this.f19126k = getIntent().getBooleanExtra("IsTakenAutoSelected", true);
        RecyclerView recyclerView = (RecyclerView) findViewById(2131429091);
        this.f19123h = recyclerView;
        recyclerView.setNestedScrollingEnabled(false);
        m16791I0();
        m16792J0();
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AsyncTask asyncTask = this.f19116C;
        if (asyncTask != null && asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            this.f19116C.cancel(true);
        }
        try {
            if (this.f19117D == 1) {
                this.f19118E.m6476a();
            }
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f19115B++;
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        try {
            if (this.f19117D == 1) {
                this.f19118E.m6479d();
            }
        } catch (Exception e10) {
        }
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onStop() {
        super.onStop();
        try {
            if (this.f19117D == 1) {
                this.f19118E.m6478c();
            }
        } catch (Exception e10) {
        }
    }
}

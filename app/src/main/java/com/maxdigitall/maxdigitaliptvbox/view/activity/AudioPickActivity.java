package com.maxdigitall.maxdigitaliptvbox.view.activity;

import af.C0158a;
import af.C0160c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
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
import com.maxdigitall.maxdigitaliptvbox.model.Myaudiofile;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nf.C6783a;
import p151if.C5251a;
import p189kf.AbstractActivityC5599j;
import p203lf.C5849b;
import p203lf.C5856i;
import p203lf.InterfaceC5862o;
import p445ze.InterfaceC10206b;
import ve.C9342c;
import ve.C9343d;
import ye.C9982a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AudioPickActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AudioPickActivity.class */
public class AudioPickActivity extends AbstractActivityC5599j {

    /* renamed from: B */
    public String f16880B;

    /* renamed from: E */
    public int f16883E;

    /* renamed from: H */
    public Context f16886H;

    /* renamed from: f */
    public Bitmap f16887f;

    /* renamed from: g */
    public int f16888g;

    /* renamed from: i */
    public RecyclerView f16890i;

    /* renamed from: j */
    public C5849b f16891j;

    /* renamed from: k */
    public boolean f16892k;

    /* renamed from: l */
    public boolean f16893l;

    /* renamed from: n */
    public List<C0160c<C0158a>> f16895n;

    /* renamed from: o */
    public String f16896o;

    /* renamed from: p */
    public TextView f16897p;

    /* renamed from: q */
    public TextView f16898q;

    /* renamed from: r */
    public LinearLayout f16899r;

    /* renamed from: s */
    public RelativeLayout f16900s;

    /* renamed from: t */
    public RelativeLayout f16901t;

    /* renamed from: u */
    public RelativeLayout f16902u;

    /* renamed from: v */
    public ProgressBar f16903v;

    /* renamed from: w */
    public List<C0158a> f16904w;

    /* renamed from: x */
    public long f16905x;

    /* renamed from: y */
    public String f16906y;

    /* renamed from: z */
    public String f16907z;

    /* renamed from: h */
    public int f16889h = 0;

    /* renamed from: m */
    public ArrayList<C0158a> f16894m = new ArrayList<>();

    /* renamed from: A */
    public int f16879A = 0;

    /* renamed from: C */
    public ArrayList<Myaudiofile> f16881C = new ArrayList<>();

    /* renamed from: D */
    public AsyncTask f16882D = null;

    /* renamed from: F */
    public C1087k f16884F = new C1087k();

    /* renamed from: G */
    public Handler f16885G = new Handler();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AudioPickActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AudioPickActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AudioPickActivity$a.class */
    public class ViewOnClickListenerC2687a implements View.OnClickListener {

        /* renamed from: b */
        public final AudioPickActivity f16908b;

        public ViewOnClickListenerC2687a(AudioPickActivity audioPickActivity) {
            this.f16908b = audioPickActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putParcelableArrayListExtra("ResultPickAudio", this.f16908b.f16894m);
            this.f16908b.setResult(-1, intent);
            this.f16908b.finish();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AudioPickActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AudioPickActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AudioPickActivity$b.class */
    public class ViewOnClickListenerC2688b implements View.OnClickListener {

        /* renamed from: b */
        public final AudioPickActivity f16909b;

        public ViewOnClickListenerC2688b(AudioPickActivity audioPickActivity) {
            this.f16909b = audioPickActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AudioPickActivity audioPickActivity = this.f16909b;
            audioPickActivity.f31684d.m39376d(audioPickActivity.f16901t);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AudioPickActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AudioPickActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AudioPickActivity$c.class */
    public class C2689c implements C5856i.b {

        /* renamed from: a */
        public final AudioPickActivity f16910a;

        public C2689c(AudioPickActivity audioPickActivity) {
            this.f16910a = audioPickActivity;
        }

        @Override // p203lf.C5856i.b
        /* renamed from: a */
        public void mo15596a(C0160c c0160c) {
            ArrayList<Myaudiofile> arrayList = this.f16910a.f16881C;
            if (arrayList != null && arrayList.size() > 0) {
                this.f16910a.f16881C.clear();
                this.f16910a.f16891j.m4099w();
            }
            this.f16910a.f16903v.setVisibility(0);
            AudioPickActivity audioPickActivity = this.f16910a;
            audioPickActivity.f31684d.m39376d(audioPickActivity.f16901t);
            this.f16910a.f16898q.setText(c0160c.m715c());
            this.f16910a.f16904w.clear();
            if (TextUtils.isEmpty(c0160c.m716d())) {
                AudioPickActivity audioPickActivity2 = this.f16910a;
                audioPickActivity2.m15595J0(audioPickActivity2.f16895n);
                this.f16910a.f16903v.setVisibility(8);
                return;
            }
            for (C0160c c0160c2 : this.f16910a.f16895n) {
                if (c0160c2.m716d().equals(c0160c.m716d())) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(c0160c2);
                    this.f16910a.m15595J0(arrayList2);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AudioPickActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AudioPickActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AudioPickActivity$d.class */
    public class ViewOnClickListenerC2690d implements View.OnClickListener {

        /* renamed from: b */
        public final AudioPickActivity f16911b;

        public ViewOnClickListenerC2690d(AudioPickActivity audioPickActivity) {
            this.f16911b = audioPickActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent("android.provider.MediaStore.RECORD_SOUND");
            if (C9343d.m39380a(this.f16911b, intent)) {
                this.f16911b.startActivityForResult(intent, 769);
            } else {
                C9342c.m39377a(this.f16911b).m39379c(this.f16911b.getString(2132018798));
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AudioPickActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AudioPickActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AudioPickActivity$e.class */
    public class C2691e implements InterfaceC10206b<C0158a> {

        /* renamed from: a */
        public final AudioPickActivity f16912a;

        public C2691e(AudioPickActivity audioPickActivity) {
            this.f16912a = audioPickActivity;
        }

        @Override // p445ze.InterfaceC10206b
        /* renamed from: a */
        public void mo15597a(List<C0160c<C0158a>> list) {
            if (this.f16912a.f31685e) {
                ArrayList arrayList = new ArrayList();
                C0160c c0160c = new C0160c();
                c0160c.m718f(this.f16912a.getResources().getString(2132018796));
                arrayList.add(c0160c);
                arrayList.addAll(list);
                this.f16912a.f31684d.m39373a(arrayList);
            }
            this.f16912a.f16895n = list;
            AudioPickActivity audioPickActivity = this.f16912a;
            if (audioPickActivity.f16879A == 0) {
                audioPickActivity.m15595J0(list);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AudioPickActivity$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AudioPickActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AudioPickActivity$f.class */
    public class C2692f implements InterfaceC5862o<C0158a> {

        /* renamed from: a */
        public final AudioPickActivity f16913a;

        public C2692f(AudioPickActivity audioPickActivity) {
            this.f16913a = audioPickActivity;
        }

        @Override // p203lf.InterfaceC5862o
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo15598a(boolean z10, C0158a c0158a) {
            if (z10) {
                this.f16913a.f16894m.add(c0158a);
                AudioPickActivity.m15579C0(this.f16913a);
            } else {
                this.f16913a.f16894m.remove(c0158a);
                AudioPickActivity.m15580D0(this.f16913a);
            }
            this.f16913a.f16897p.setText(this.f16913a.f16889h + "/" + this.f16913a.f16888g);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AudioPickActivity$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AudioPickActivity$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AudioPickActivity$g.class */
    public class RunnableC2693g implements Runnable {

        /* renamed from: b */
        public final AudioPickActivity f16914b;

        public RunnableC2693g(AudioPickActivity audioPickActivity) {
            this.f16914b = audioPickActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f16914b.f16882D = new AsyncTaskC2694h(this.f16914b, 0).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AudioPickActivity$h.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AudioPickActivity$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AudioPickActivity$h.class */
    public class AsyncTaskC2694h extends AsyncTask<Void, Integer, Void> {

        /* renamed from: a */
        public final AudioPickActivity f16915a;

        public AsyncTaskC2694h(AudioPickActivity audioPickActivity, int i10) {
            this.f16915a = audioPickActivity;
            audioPickActivity.f16883E = 1;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            StringBuilder sb2;
            try {
                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                this.f16915a.f16881C.clear();
                for (int i10 = 0; i10 < this.f16915a.f16904w.size(); i10++) {
                    if (this.f16915a.f16882D != null && this.f16915a.f16882D.isCancelled()) {
                        return null;
                    }
                    C0158a c0158a = this.f16915a.f16904w.get(i10);
                    long length = new File(c0158a.m710z()).length();
                    this.f16915a.f16905x = length / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
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
                    this.f16915a.f16906y = c0158a.m710z().substring(c0158a.m710z().lastIndexOf("/") + 1);
                    this.f16915a.f16907z = c0158a.m710z().substring(c0158a.m710z().lastIndexOf(InstructionFileId.DOT) + 1);
                    long lastModified = new File(c0158a.m710z()).lastModified();
                    this.f16915a.f16880B = C9343d.m39383d(c0158a.m683V());
                    try {
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        mediaMetadataRetriever.setDataSource(c0158a.m710z());
                        ByteArrayInputStream byteArrayInputStream = mediaMetadataRetriever.getEmbeddedPicture() != null ? new ByteArrayInputStream(mediaMetadataRetriever.getEmbeddedPicture()) : null;
                        mediaMetadataRetriever.release();
                        this.f16915a.f16887f = BitmapFactory.decodeStream(byteArrayInputStream);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    AudioPickActivity audioPickActivity = this.f16915a;
                    audioPickActivity.f16881C.add(new Myaudiofile(audioPickActivity.f16906y, lastModified, sb3, audioPickActivity.f16880B, audioPickActivity.f16887f));
                    if (i10 == 2 || (i10 != 0 && i10 % 50 == 0)) {
                        publishProgress(Integer.valueOf(i10));
                    }
                }
                return null;
            } catch (Exception e11) {
                e11.printStackTrace();
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r42) {
            super.onPostExecute(r42);
            AudioPickActivity audioPickActivity = this.f16915a;
            audioPickActivity.f16883E = 0;
            audioPickActivity.f16903v.setVisibility(8);
            this.f16915a.f16891j.m28475l0(this.f16915a.f16881C);
            this.f16915a.f16891j.m4099w();
            this.f16915a.f16891j.m28485d0(this.f16915a.f16904w);
        }

        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
            super.onProgressUpdate(numArr);
            this.f16915a.f16891j.m28475l0(this.f16915a.f16881C);
            this.f16915a.f16891j.m4099w();
            this.f16915a.f16891j.m28485d0(this.f16915a.f16904w);
            this.f16915a.f16903v.setVisibility(8);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f16915a.f16903v.setVisibility(0);
            if (this.f16915a.f16882D == null || !this.f16915a.f16882D.getStatus().equals(AsyncTask.Status.RUNNING)) {
                return;
            }
            this.f16915a.f16882D.cancel(true);
        }
    }

    /* renamed from: C0 */
    public static /* synthetic */ int m15579C0(AudioPickActivity audioPickActivity) {
        int i10 = audioPickActivity.f16889h;
        audioPickActivity.f16889h = i10 + 1;
        return i10;
    }

    /* renamed from: D0 */
    public static /* synthetic */ int m15580D0(AudioPickActivity audioPickActivity) {
        int i10 = audioPickActivity.f16889h;
        audioPickActivity.f16889h = i10 - 1;
        return i10;
    }

    /* renamed from: G0 */
    public final boolean m15592G0(List<C0158a> list) {
        for (C0158a c0158a : list) {
            if (c0158a.m710z().equals(this.f16896o)) {
                this.f16894m.add(c0158a);
                int i10 = this.f16889h + 1;
                this.f16889h = i10;
                this.f16891j.m28478o0(i10);
                this.f16897p.setText(this.f16889h + "/" + this.f16888g);
                return true;
            }
        }
        return false;
    }

    /* renamed from: H0 */
    public final void m15593H0() {
        TextView textView = (TextView) findViewById(2131429391);
        this.f16897p = textView;
        textView.setText(this.f16889h + "/" + this.f16888g);
        this.f16890i = (RecyclerView) findViewById(2131429086);
        this.f16890i.setLayoutManager(new LinearLayoutManager(this));
        ProgressBar progressBar = (ProgressBar) findViewById(2131428842);
        this.f16903v = progressBar;
        progressBar.setVisibility(0);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(2131428969);
        this.f16900s = relativeLayout;
        relativeLayout.setOnClickListener(new ViewOnClickListenerC2687a(this));
        this.f16901t = (RelativeLayout) findViewById(2131429271);
        LinearLayout linearLayout = (LinearLayout) findViewById(2131428406);
        this.f16899r = linearLayout;
        if (this.f31685e) {
            linearLayout.setVisibility(0);
            this.f16899r.setOnClickListener(new ViewOnClickListenerC2688b(this));
            TextView textView2 = (TextView) findViewById(2131429458);
            this.f16898q = textView2;
            textView2.setText(getResources().getString(2132018796));
            this.f31684d.m39375c(new C2689c(this));
        }
        if (this.f16892k) {
            RelativeLayout relativeLayout2 = (RelativeLayout) findViewById(2131429044);
            this.f16902u = relativeLayout2;
            relativeLayout2.setVisibility(0);
            this.f16902u.setOnClickListener(new ViewOnClickListenerC2690d(this));
        }
    }

    /* renamed from: I0 */
    public final void m15594I0() {
        C9982a.m41928a(this, new C2691e(this));
    }

    /* renamed from: J0 */
    public final void m15595J0(List<C0160c<C0158a>> list) {
        this.f16903v.setVisibility(0);
        this.f16904w.clear();
        C5849b c5849b = new C5849b(this, this.f16888g);
        this.f16891j = c5849b;
        this.f16890i.setAdapter(c5849b);
        this.f16891j.m28486e0(new C2692f(this));
        boolean z10 = this.f16893l;
        boolean z11 = z10;
        if (z10) {
            z11 = z10;
            if (!TextUtils.isEmpty(this.f16896o)) {
                File file = new File(this.f16896o);
                z11 = false;
                if (!this.f16891j.m28474k0()) {
                    z11 = false;
                    if (file.exists()) {
                        z11 = true;
                    }
                }
            }
        }
        for (C0160c<C0158a> c0160c : list) {
            this.f16904w.addAll(c0160c.m714b());
            if (z11) {
                z11 = m15592G0(c0160c.m714b());
            }
        }
        Iterator<C0158a> it = this.f16894m.iterator();
        while (it.hasNext()) {
            int indexOf = this.f16904w.indexOf(it.next());
            if (indexOf != -1) {
                this.f16904w.get(indexOf).m703T(true);
            }
        }
        Handler handler = this.f16885G;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f16885G.postDelayed(new RunnableC2693g(this), 1000L);
        }
    }

    @Override // p189kf.AbstractActivityC5599j, androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 769 && i11 == -1) {
            if (intent.getData() != null) {
                this.f16896o = intent.getData().getPath();
            }
            m15594I0();
        }
    }

    @Override // p189kf.AbstractActivityC5599j, androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f16886H = this;
        super.onCreate(bundle);
        setContentView(2131624562);
        if (new C6783a(this.f16886H).m31288z().equals(C5251a.f30065s0)) {
            setRequestedOrientation(0);
        } else {
            setRequestedOrientation(1);
        }
        this.f16904w = new ArrayList();
        this.f16888g = getIntent().getIntExtra("MaxNumber", 9);
        this.f16892k = getIntent().getBooleanExtra("IsNeedRecorder", false);
        this.f16893l = getIntent().getBooleanExtra("IsTakenAutoSelected", true);
        m15593H0();
        m15594I0();
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AsyncTask asyncTask = this.f16882D;
        if (asyncTask != null && asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            this.f16882D.cancel(true);
        }
        try {
            if (this.f16883E == 1) {
                this.f16884F.m6476a();
            }
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f16879A++;
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onStop() {
        super.onStop();
        try {
            if (this.f16883E == 1) {
                this.f16884F.m6478c();
            }
        } catch (Exception e10) {
        }
    }
}

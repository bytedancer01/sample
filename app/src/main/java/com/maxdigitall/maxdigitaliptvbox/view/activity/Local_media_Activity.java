package com.maxdigitall.maxdigitaliptvbox.view.activity;

import af.C0158a;
import af.C0162e;
import af.C0163f;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActivityC0243b;
import cf.C1081e;
import java.util.Iterator;
import nf.C6783a;
import p151if.C5251a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/Local_media_Activity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/Local_media_Activity.class */
public class Local_media_Activity extends ActivityC0243b {

    /* renamed from: e */
    public static C6783a f17526e;

    /* renamed from: d */
    public Context f17527d = this;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/Local_media_Activity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.Local_media_Activity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/Local_media_Activity$a.class */
    public class C2821a implements C1081e.g {

        /* renamed from: a */
        public final String[] f17528a;

        /* renamed from: b */
        public final Local_media_Activity f17529b;

        public C2821a(Local_media_Activity local_media_Activity, String[] strArr) {
            this.f17529b = local_media_Activity;
            this.f17528a = strArr;
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (i10 == 512) {
            if (i11 == -1) {
                Iterator it = intent.getParcelableArrayListExtra("ResultPickVideo").iterator();
                while (it.hasNext()) {
                    String m710z = ((C0163f) it.next()).m710z();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m710z);
                    sb2.append("\n");
                }
                return;
            }
            return;
        }
        if (i10 == 768) {
            if (i11 == -1) {
                Iterator it2 = intent.getParcelableArrayListExtra("ResultPickAudio").iterator();
                while (it2.hasNext()) {
                    String m710z2 = ((C0158a) it2.next()).m710z();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(m710z2);
                    sb3.append("\n");
                }
                return;
            }
            return;
        }
        if (i10 == 1024 && i11 == -1) {
            Iterator it3 = intent.getParcelableArrayListExtra("ResultPickFILE").iterator();
            while (it3.hasNext()) {
                String m710z3 = ((C0162e) it3.next()).m710z();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(m710z3);
                sb4.append("\n");
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this.f17527d, (Class<?>) RoutingActivity.class));
        finishAffinity();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case 2131427657:
                Intent intent = new Intent(this, (Class<?>) AudioPickActivity.class);
                intent.putExtra("IsNeedRecorder", false);
                intent.putExtra("MaxNumber", 9);
                intent.putExtra("isNeedFolderList", true);
                startActivityForResult(intent, 768);
                break;
            case 2131427658:
                C1081e c1081e = new C1081e(this.f17527d, new C2821a(this, new String[]{""}));
                if (Build.VERSION.SDK_INT < 30) {
                    c1081e.m6392w("");
                    break;
                } else {
                    c1081e.m6393x("");
                    break;
                }
            case 2131427659:
                Intent intent2 = new Intent(this, (Class<?>) VideoPickActivity.class);
                intent2.putExtra("IsNeedCamera", false);
                intent2.putExtra("MaxNumber", 9);
                intent2.putExtra("isNeedFolderList", true);
                startActivity(intent2);
                break;
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f17527d = this;
        super.onCreate(bundle);
        C6783a c6783a = new C6783a(this.f17527d);
        f17526e = c6783a;
        setContentView(c6783a.m31288z().equals(C5251a.f30065s0) ? 2131624009 : 2131624008);
    }
}

package p030c0;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import java.util.Arrays;
import p050d0.C4290b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c0/d.class
 */
/* renamed from: c0.d */
/* loaded from: combined.jar:classes1.jar:c0/d.class */
public class C0936d extends C4290b {

    /* renamed from: c */
    public static d f6549c;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c0/d$a.class
     */
    /* renamed from: c0.d$a */
    /* loaded from: combined.jar:classes1.jar:c0/d$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final String[] f6550b;

        /* renamed from: c */
        public final Activity f6551c;

        /* renamed from: d */
        public final int f6552d;

        public a(String[] strArr, Activity activity, int i10) {
            this.f6550b = strArr;
            this.f6551c = activity;
            this.f6552d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f6550b.length];
            PackageManager packageManager = this.f6551c.getPackageManager();
            String packageName = this.f6551c.getPackageName();
            int length = this.f6550b.length;
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = packageManager.checkPermission(this.f6550b[i10], packageName);
            }
            ((c) this.f6551c).onRequestPermissionsResult(this.f6552d, this.f6550b, iArr);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c0/d$b.class
     */
    /* renamed from: c0.d$b */
    /* loaded from: combined.jar:classes1.jar:c0/d$b.class */
    public class b implements Runnable {

        /* renamed from: b */
        public final Activity f6553b;

        public b(Activity activity) {
            this.f6553b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f6553b.isFinishing() || C0942g.m5662i(this.f6553b)) {
                return;
            }
            this.f6553b.recreate();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c0/d$c.class
     */
    /* renamed from: c0.d$c */
    /* loaded from: combined.jar:classes1.jar:c0/d$c.class */
    public interface c {
        void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c0/d$d.class
     */
    /* renamed from: c0.d$d */
    /* loaded from: combined.jar:classes1.jar:c0/d$d.class */
    public interface d {
        /* renamed from: a */
        boolean m5649a(Activity activity, String[] strArr, int i10);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c0/d$e.class
     */
    /* renamed from: c0.d$e */
    /* loaded from: combined.jar:classes1.jar:c0/d$e.class */
    public interface e {
        void validateRequestPermissionsRequestCode(int i10);
    }

    /* renamed from: m */
    public static void m5636m(Activity activity) {
        activity.finishAffinity();
    }

    /* renamed from: n */
    public static void m5637n(Activity activity) {
        activity.finishAfterTransition();
    }

    @Deprecated
    /* renamed from: o */
    public static boolean m5638o(Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }

    /* renamed from: p */
    public static void m5639p(Activity activity) {
        activity.postponeEnterTransition();
    }

    /* renamed from: q */
    public static void m5640q(Activity activity) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 28) {
            if (i10 <= 23) {
                new Handler(activity.getMainLooper()).post(new b(activity));
                return;
            } else if (C0942g.m5662i(activity)) {
                return;
            }
        }
        activity.recreate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public static void m5641r(Activity activity, String[] strArr, int i10) {
        d dVar = f6549c;
        if (dVar == null || !dVar.m5649a(activity, strArr, i10)) {
            for (String str : strArr) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof e) {
                    ((e) activity).validateRequestPermissionsRequestCode(i10);
                }
                activity.requestPermissions(strArr, i10);
            } else if (activity instanceof c) {
                new Handler(Looper.getMainLooper()).post(new a(strArr, activity, i10));
            }
        }
    }

    /* renamed from: s */
    public static <T extends View> T m5642s(Activity activity, int i10) {
        View requireViewById;
        if (Build.VERSION.SDK_INT >= 28) {
            requireViewById = activity.requireViewById(i10);
            return (T) requireViewById;
        }
        T t10 = (T) activity.findViewById(i10);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    /* renamed from: t */
    public static void m5643t(Activity activity, AbstractC0967s0 abstractC0967s0) {
        activity.setEnterSharedElementCallback(null);
    }

    /* renamed from: u */
    public static void m5644u(Activity activity, AbstractC0967s0 abstractC0967s0) {
        activity.setExitSharedElementCallback(null);
    }

    /* renamed from: v */
    public static boolean m5645v(Activity activity, String str) {
        boolean shouldShowRequestPermissionRationale;
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        shouldShowRequestPermissionRationale = activity.shouldShowRequestPermissionRationale(str);
        return shouldShowRequestPermissionRationale;
    }

    /* renamed from: w */
    public static void m5646w(Activity activity, Intent intent, int i10, Bundle bundle) {
        activity.startActivityForResult(intent, i10, bundle);
    }

    /* renamed from: x */
    public static void m5647x(Activity activity, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    /* renamed from: y */
    public static void m5648y(Activity activity) {
        activity.startPostponedEnterTransition();
    }
}

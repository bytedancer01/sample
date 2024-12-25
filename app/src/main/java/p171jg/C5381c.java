package p171jg;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import com.onesignal.shortcutbadger.impl.AdwHomeBadger;
import com.onesignal.shortcutbadger.impl.ApexHomeBadger;
import com.onesignal.shortcutbadger.impl.AsusHomeBadger;
import com.onesignal.shortcutbadger.impl.DefaultBadger;
import com.onesignal.shortcutbadger.impl.EverythingMeHomeBadger;
import com.onesignal.shortcutbadger.impl.HuaweiHomeBadger;
import com.onesignal.shortcutbadger.impl.NewHtcHomeBadger;
import com.onesignal.shortcutbadger.impl.NovaHomeBadger;
import com.onesignal.shortcutbadger.impl.OPPOHomeBader;
import com.onesignal.shortcutbadger.impl.SamsungHomeBadger;
import com.onesignal.shortcutbadger.impl.SonyHomeBadger;
import com.onesignal.shortcutbadger.impl.VivoHomeBadger;
import com.onesignal.shortcutbadger.impl.ZukHomeBadger;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:jg/c.class
 */
/* renamed from: jg.c */
/* loaded from: combined.jar:classes2.jar:jg/c.class */
public final class C5381c {

    /* renamed from: a */
    public static final List<Class<? extends InterfaceC5379a>> f30751a;

    /* renamed from: b */
    public static final Object f30752b;

    /* renamed from: c */
    public static InterfaceC5379a f30753c;

    /* renamed from: d */
    public static ComponentName f30754d;

    static {
        LinkedList linkedList = new LinkedList();
        f30751a = linkedList;
        f30752b = new Object();
        linkedList.add(AdwHomeBadger.class);
        linkedList.add(ApexHomeBadger.class);
        linkedList.add(NewHtcHomeBadger.class);
        linkedList.add(NovaHomeBadger.class);
        linkedList.add(SonyHomeBadger.class);
        linkedList.add(AsusHomeBadger.class);
        linkedList.add(HuaweiHomeBadger.class);
        linkedList.add(OPPOHomeBader.class);
        linkedList.add(SamsungHomeBadger.class);
        linkedList.add(ZukHomeBadger.class);
        linkedList.add(VivoHomeBadger.class);
        linkedList.add(EverythingMeHomeBadger.class);
    }

    /* renamed from: a */
    public static void m26730a(Context context, int i10) {
        if (f30753c == null && !m26731b(context)) {
            throw new C5380b("No default launcher available");
        }
        try {
            f30753c.mo20838b(context, f30754d, i10);
        } catch (Exception e10) {
            throw new C5380b("Unable to execute badge", e10);
        }
    }

    /* renamed from: b */
    public static boolean m26731b(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            Log.e("ShortcutBadger", "Unable to find launch intent for package " + context.getPackageName());
            return false;
        }
        f30754d = launchIntentForPackage.getComponent();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity == null || resolveActivity.activityInfo.name.toLowerCase().contains("resolver")) {
            return false;
        }
        String str = resolveActivity.activityInfo.packageName;
        Iterator<Class<? extends InterfaceC5379a>> it = f30751a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC5379a interfaceC5379a = null;
            try {
                interfaceC5379a = it.next().newInstance();
            } catch (Exception e10) {
            }
            if (interfaceC5379a != null && interfaceC5379a.mo20837a().contains(str)) {
                f30753c = interfaceC5379a;
                break;
            }
        }
        if (f30753c != null) {
            return true;
        }
        String str2 = Build.MANUFACTURER;
        f30753c = str2.equalsIgnoreCase("ZUK") ? new ZukHomeBadger() : str2.equalsIgnoreCase("OPPO") ? new OPPOHomeBader() : str2.equalsIgnoreCase("VIVO") ? new VivoHomeBadger() : new DefaultBadger();
        return true;
    }
}

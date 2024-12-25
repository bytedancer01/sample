package p208m1;

import android.annotation.NonNull;
import android.media.MediaRoute2Info;
import android.media.RouteDiscoveryPreference;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p208m1.C5895d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:m1/m.class
 */
/* renamed from: m1.m */
/* loaded from: combined.jar:classes1.jar:m1/m.class */
public class C5904m {
    /* renamed from: a */
    public static List<String> m29015a(List<MediaRoute2Info> list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (MediaRoute2Info mediaRoute2Info : list) {
            if (mediaRoute2Info != null) {
                arrayList.add(mediaRoute2Info.getId());
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static RouteDiscoveryPreference m29016b(C5896e c5896e) {
        Object obj;
        if (c5896e == null || !c5896e.m28810e()) {
            final ArrayList arrayList = new ArrayList();
            final boolean z10 = false;
            obj = new Object(arrayList, z10) { // from class: android.media.RouteDiscoveryPreference$Builder
                static {
                    throw new NoClassDefFoundError();
                }

                @NonNull
                public native /* synthetic */ RouteDiscoveryPreference build();
            };
        } else {
            final boolean m28809d = c5896e.m28809d();
            final ArrayList arrayList2 = new ArrayList();
            Iterator<String> it = c5896e.m28808c().m28856e().iterator();
            while (it.hasNext()) {
                arrayList2.add(m29018d(it.next()));
            }
            obj = new Object(arrayList2, m28809d) { // from class: android.media.RouteDiscoveryPreference$Builder
                static {
                    throw new NoClassDefFoundError();
                }

                @NonNull
                public native /* synthetic */ RouteDiscoveryPreference build();
            };
        }
        return obj.build();
    }

    /* renamed from: c */
    public static C5895d m29017c(MediaRoute2Info mediaRoute2Info) {
        if (mediaRoute2Info == null) {
            return null;
        }
        C5895d.a m28791f = new C5895d.a(mediaRoute2Info.getId(), mediaRoute2Info.getName().toString()).m28792g(mediaRoute2Info.getConnectionState()).m28804s(mediaRoute2Info.getVolumeHandling()).m28805t(mediaRoute2Info.getVolumeMax()).m28803r(mediaRoute2Info.getVolume()).m28796k(mediaRoute2Info.getExtras()).m28795j(true).m28791f(false);
        CharSequence description = mediaRoute2Info.getDescription();
        if (description != null) {
            m28791f.m28793h(description.toString());
        }
        Uri iconUri = mediaRoute2Info.getIconUri();
        if (iconUri != null) {
            m28791f.m28797l(iconUri);
        }
        Bundle extras = mediaRoute2Info.getExtras();
        if (extras == null || !extras.containsKey("androidx.mediarouter.media.KEY_EXTRAS") || !extras.containsKey("androidx.mediarouter.media.KEY_DEVICE_TYPE") || !extras.containsKey("androidx.mediarouter.media.KEY_CONTROL_FILTERS")) {
            return null;
        }
        m28791f.m28796k(extras.getBundle("androidx.mediarouter.media.KEY_EXTRAS"));
        m28791f.m28794i(extras.getInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", 0));
        m28791f.m28801p(extras.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
        ArrayList parcelableArrayList = extras.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
        if (parcelableArrayList != null) {
            m28791f.m28787b(parcelableArrayList);
        }
        return m28791f.m28790e();
    }

    /* renamed from: d */
    public static String m29018d(String str) {
        str.hashCode();
        switch (str) {
            case "android.media.intent.category.REMOTE_PLAYBACK":
                return "android.media.route.feature.REMOTE_PLAYBACK";
            case "android.media.intent.category.LIVE_AUDIO":
                return "android.media.route.feature.LIVE_AUDIO";
            case "android.media.intent.category.LIVE_VIDEO":
                return "android.media.route.feature.LIVE_VIDEO";
            default:
                return str;
        }
    }
}

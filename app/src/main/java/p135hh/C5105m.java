package p135hh;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.util.Vector;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hh/m.class
 */
/* renamed from: hh.m */
/* loaded from: combined.jar:classes2.jar:hh/m.class */
public class C5105m {
    /* renamed from: a */
    public static Vector<String> m25548a(Context context, boolean z10) {
        Vector<String> vector = new Vector<>();
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        for (Network network : connectivityManager.getAllNetworks()) {
            connectivityManager.getNetworkInfo(network);
            LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (!networkCapabilities.hasTransport(4) && !networkCapabilities.hasTransport(0)) {
                for (LinkAddress linkAddress : linkProperties.getLinkAddresses()) {
                    if (((linkAddress.getAddress() instanceof Inet4Address) && !z10) || ((linkAddress.getAddress() instanceof Inet6Address) && z10)) {
                        vector.add(linkAddress.toString());
                    }
                }
            }
        }
        return vector;
    }
}

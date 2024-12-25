package p422y9;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.simpleframework.xml.strategy.Name;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/p1.class
 */
/* renamed from: y9.p1 */
/* loaded from: combined.jar:classes2.jar:y9/p1.class */
public final class C9940p1 {

    /* renamed from: a */
    public static final Uri f45630a;

    /* renamed from: b */
    public static final Uri f45631b;

    static {
        Uri parse = Uri.parse("https://plus.google.com/");
        f45630a = parse;
        f45631b = parse.buildUpon().appendPath("circles").appendPath("find").build();
    }

    /* renamed from: a */
    public static Intent m41861a() {
        Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }

    /* renamed from: b */
    public static Intent m41862b(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter(Name.MARK, "com.google.android.gms");
        if (!TextUtils.isEmpty(str2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", str2);
        }
        intent.setData(appendQueryParameter.build());
        intent.setPackage("com.android.vending");
        intent.addFlags(NTLMEngineImpl.FLAG_REQUEST_NTLM2_SESSION);
        return intent;
    }

    /* renamed from: c */
    public static Intent m41863c(String str) {
        Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }
}

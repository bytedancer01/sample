package p422y9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/j1.class
 */
/* renamed from: y9.j1 */
/* loaded from: combined.jar:classes2.jar:y9/j1.class */
public final class C9922j1 {

    /* renamed from: f */
    public static final Uri f45583f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a */
    public final String f45584a;

    /* renamed from: b */
    public final String f45585b;

    /* renamed from: c */
    public final ComponentName f45586c;

    /* renamed from: d */
    public final int f45587d;

    /* renamed from: e */
    public final boolean f45588e;

    public C9922j1(String str, String str2, int i10, boolean z10) {
        C9935o.m41846f(str);
        this.f45584a = str;
        C9935o.m41846f(str2);
        this.f45585b = str2;
        this.f45586c = null;
        this.f45587d = i10;
        this.f45588e = z10;
    }

    /* renamed from: a */
    public final int m41809a() {
        return this.f45587d;
    }

    /* renamed from: b */
    public final ComponentName m41810b() {
        return this.f45586c;
    }

    /* renamed from: c */
    public final Intent m41811c(Context context) {
        Intent component;
        Bundle bundle;
        if (this.f45584a != null) {
            component = null;
            if (this.f45588e) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", this.f45584a);
                try {
                    bundle = context.getContentResolver().call(f45583f, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException e10) {
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e10.toString()));
                    bundle = null;
                }
                Intent intent = bundle == null ? null : (Intent) bundle.getParcelable("serviceResponseIntentKey");
                component = intent;
                if (intent == null) {
                    String valueOf = String.valueOf(this.f45584a);
                    Log.w("ConnectionStatusConfig", valueOf.length() != 0 ? "Dynamic lookup for intent failed for action: ".concat(valueOf) : new String("Dynamic lookup for intent failed for action: "));
                    component = intent;
                }
            }
            if (component == null) {
                return new Intent(this.f45584a).setPackage(this.f45585b);
            }
        } else {
            component = new Intent().setComponent(this.f45586c);
        }
        return component;
    }

    /* renamed from: d */
    public final String m41812d() {
        return this.f45585b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9922j1)) {
            return false;
        }
        C9922j1 c9922j1 = (C9922j1) obj;
        return C9932n.m41832b(this.f45584a, c9922j1.f45584a) && C9932n.m41832b(this.f45585b, c9922j1.f45585b) && C9932n.m41832b(this.f45586c, c9922j1.f45586c) && this.f45587d == c9922j1.f45587d && this.f45588e == c9922j1.f45588e;
    }

    public final int hashCode() {
        return C9932n.m41833c(this.f45584a, this.f45585b, this.f45586c, Integer.valueOf(this.f45587d), Boolean.valueOf(this.f45588e));
    }

    public final String toString() {
        String str = this.f45584a;
        String str2 = str;
        if (str == null) {
            C9935o.m41850j(this.f45586c);
            str2 = this.f45586c.flattenToString();
        }
        return str2;
    }
}

package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.navigation.AbstractC0639s;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p030c0.C0940f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/navigation/a.class
 */
@AbstractC0639s.b("activity")
/* renamed from: androidx.navigation.a */
/* loaded from: combined.jar:classes1.jar:androidx/navigation/a.class */
public class C0616a extends AbstractC0639s<a> {

    /* renamed from: a */
    public Context f4162a;

    /* renamed from: b */
    public Activity f4163b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/navigation/a$a.class
     */
    /* renamed from: androidx.navigation.a$a */
    /* loaded from: combined.jar:classes1.jar:androidx/navigation/a$a.class */
    public static class a extends C0631k {

        /* renamed from: k */
        public Intent f4164k;

        /* renamed from: l */
        public String f4165l;

        public a(AbstractC0639s<? extends a> abstractC0639s) {
            super(abstractC0639s);
        }

        @Override // androidx.navigation.C0631k
        /* renamed from: B */
        public void mo3470B(Context context, AttributeSet attributeSet) {
            super.mo3470B(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C0642v.f4317a);
            String string = obtainAttributes.getString(C0642v.f4322f);
            String str = string;
            if (string != null) {
                str = string.replace("${applicationId}", context.getPackageName());
            }
            m3480Q(str);
            String string2 = obtainAttributes.getString(C0642v.f4318b);
            if (string2 != null) {
                String str2 = string2;
                if (string2.charAt(0) == '.') {
                    str2 = context.getPackageName() + string2;
                }
                m3477N(new ComponentName(context, str2));
            }
            m3476M(obtainAttributes.getString(C0642v.f4319c));
            String string3 = obtainAttributes.getString(C0642v.f4320d);
            if (string3 != null) {
                m3478O(Uri.parse(string3));
            }
            m3479P(obtainAttributes.getString(C0642v.f4321e));
            obtainAttributes.recycle();
        }

        @Override // androidx.navigation.C0631k
        /* renamed from: H */
        public boolean mo3471H() {
            return false;
        }

        /* renamed from: I */
        public final String m3472I() {
            Intent intent = this.f4164k;
            if (intent == null) {
                return null;
            }
            return intent.getAction();
        }

        /* renamed from: J */
        public final ComponentName m3473J() {
            Intent intent = this.f4164k;
            if (intent == null) {
                return null;
            }
            return intent.getComponent();
        }

        /* renamed from: K */
        public final String m3474K() {
            return this.f4165l;
        }

        /* renamed from: L */
        public final Intent m3475L() {
            return this.f4164k;
        }

        /* renamed from: M */
        public final a m3476M(String str) {
            if (this.f4164k == null) {
                this.f4164k = new Intent();
            }
            this.f4164k.setAction(str);
            return this;
        }

        /* renamed from: N */
        public final a m3477N(ComponentName componentName) {
            if (this.f4164k == null) {
                this.f4164k = new Intent();
            }
            this.f4164k.setComponent(componentName);
            return this;
        }

        /* renamed from: O */
        public final a m3478O(Uri uri) {
            if (this.f4164k == null) {
                this.f4164k = new Intent();
            }
            this.f4164k.setData(uri);
            return this;
        }

        /* renamed from: P */
        public final a m3479P(String str) {
            this.f4165l = str;
            return this;
        }

        /* renamed from: Q */
        public final a m3480Q(String str) {
            if (this.f4164k == null) {
                this.f4164k = new Intent();
            }
            this.f4164k.setPackage(str);
            return this;
        }

        @Override // androidx.navigation.C0631k
        public String toString() {
            String m3472I;
            ComponentName m3473J = m3473J();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            if (m3473J == null) {
                m3472I = m3472I();
                if (m3472I != null) {
                    sb2.append(" action=");
                }
                return sb2.toString();
            }
            sb2.append(" class=");
            m3472I = m3473J.getClassName();
            sb2.append(m3472I);
            return sb2.toString();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/navigation/a$b.class
     */
    /* renamed from: androidx.navigation.a$b */
    /* loaded from: combined.jar:classes1.jar:androidx/navigation/a$b.class */
    public static final class b implements AbstractC0639s.a {

        /* renamed from: a */
        public final int f4166a;

        /* renamed from: a */
        public C0940f m3481a() {
            return null;
        }

        /* renamed from: b */
        public int m3482b() {
            return this.f4166a;
        }
    }

    public C0616a(Context context) {
        this.f4162a = context;
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                this.f4163b = (Activity) context;
                return;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
    }

    @Override // androidx.navigation.AbstractC0639s
    /* renamed from: e */
    public boolean mo3466e() {
        Activity activity = this.f4163b;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    @Override // androidx.navigation.AbstractC0639s
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public a mo3464a() {
        return new a(this);
    }

    /* renamed from: g */
    public final Context m3468g() {
        return this.f4162a;
    }

    @Override // androidx.navigation.AbstractC0639s
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0631k mo3465b(a aVar, Bundle bundle, C0636p c0636p, AbstractC0639s.a aVar2) {
        Intent intent;
        int intExtra;
        if (aVar.m3475L() == null) {
            throw new IllegalStateException("Destination " + aVar.m3569v() + " does not have an Intent set.");
        }
        Intent intent2 = new Intent(aVar.m3475L());
        if (bundle != null) {
            intent2.putExtras(bundle);
            String m3474K = aVar.m3474K();
            if (!TextUtils.isEmpty(m3474K)) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(m3474K);
                while (matcher.find()) {
                    String group = matcher.group(1);
                    if (!bundle.containsKey(group)) {
                        throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + m3474K);
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    stringBuffer.append(Uri.encode(bundle.get(group).toString()));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        boolean z10 = aVar2 instanceof b;
        if (z10) {
            intent2.addFlags(((b) aVar2).m3482b());
        }
        if (!(this.f4162a instanceof Activity)) {
            intent2.addFlags(268435456);
        }
        if (c0636p != null && c0636p.m3599g()) {
            intent2.addFlags(NTLMEngineImpl.FLAG_REQUEST_128BIT_KEY_EXCH);
        }
        Activity activity = this.f4163b;
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", aVar.m3569v());
        Resources resources = m3468g().getResources();
        if (c0636p != null) {
            int m3595c = c0636p.m3595c();
            int m3596d = c0636p.m3596d();
            if ((m3595c <= 0 || !resources.getResourceTypeName(m3595c).equals("animator")) && (m3596d <= 0 || !resources.getResourceTypeName(m3596d).equals("animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", m3595c);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", m3596d);
            } else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(m3595c) + " and popExit resource " + resources.getResourceName(m3596d) + "when launching " + aVar);
            }
        }
        if (z10) {
            ((b) aVar2).m3481a();
        }
        this.f4162a.startActivity(intent2);
        if (c0636p == null || this.f4163b == null) {
            return null;
        }
        int m3593a = c0636p.m3593a();
        int m3594b = c0636p.m3594b();
        if ((m3593a <= 0 || !resources.getResourceTypeName(m3593a).equals("animator")) && (m3594b <= 0 || !resources.getResourceTypeName(m3594b).equals("animator"))) {
            if (m3593a < 0 && m3594b < 0) {
                return null;
            }
            this.f4163b.overridePendingTransition(Math.max(m3593a, 0), Math.max(m3594b, 0));
            return null;
        }
        Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(m3593a) + " and exit resource " + resources.getResourceName(m3594b) + "when launching " + aVar);
        return null;
    }
}

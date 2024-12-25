package p208m1;

import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.simpleframework.xml.strategy.Name;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:m1/d.class
 */
/* renamed from: m1.d */
/* loaded from: combined.jar:classes1.jar:m1/d.class */
public final class C5895d {

    /* renamed from: a */
    public final Bundle f33036a;

    /* renamed from: b */
    public List<String> f33037b;

    /* renamed from: c */
    public List<IntentFilter> f33038c;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/d$a.class
     */
    /* renamed from: m1.d$a */
    /* loaded from: combined.jar:classes1.jar:m1/d$a.class */
    public static final class a {

        /* renamed from: a */
        public final Bundle f33039a;

        /* renamed from: b */
        public ArrayList<String> f33040b;

        /* renamed from: c */
        public ArrayList<IntentFilter> f33041c;

        public a(String str, String str2) {
            this.f33039a = new Bundle();
            m28798m(str);
            m28799n(str2);
        }

        public a(C5895d c5895d) {
            if (c5895d == null) {
                throw new IllegalArgumentException("descriptor must not be null");
            }
            this.f33039a = new Bundle(c5895d.f33036a);
            if (!c5895d.m28771j().isEmpty()) {
                this.f33040b = new ArrayList<>(c5895d.m28771j());
            }
            if (c5895d.m28767f().isEmpty()) {
                return;
            }
            this.f33041c = new ArrayList<>(c5895d.f33038c);
        }

        /* renamed from: a */
        public a m28786a(IntentFilter intentFilter) {
            if (intentFilter == null) {
                throw new IllegalArgumentException("filter must not be null");
            }
            if (this.f33041c == null) {
                this.f33041c = new ArrayList<>();
            }
            if (!this.f33041c.contains(intentFilter)) {
                this.f33041c.add(intentFilter);
            }
            return this;
        }

        /* renamed from: b */
        public a m28787b(Collection<IntentFilter> collection) {
            if (collection == null) {
                throw new IllegalArgumentException("filters must not be null");
            }
            if (!collection.isEmpty()) {
                for (IntentFilter intentFilter : collection) {
                    if (intentFilter != null) {
                        m28786a(intentFilter);
                    }
                }
            }
            return this;
        }

        /* renamed from: c */
        public a m28788c(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("groupMemberId must not be empty");
            }
            if (this.f33040b == null) {
                this.f33040b = new ArrayList<>();
            }
            if (!this.f33040b.contains(str)) {
                this.f33040b.add(str);
            }
            return this;
        }

        /* renamed from: d */
        public a m28789d(Collection<String> collection) {
            if (collection == null) {
                throw new IllegalArgumentException("groupMemberIds must not be null");
            }
            if (!collection.isEmpty()) {
                Iterator<String> it = collection.iterator();
                while (it.hasNext()) {
                    m28788c(it.next());
                }
            }
            return this;
        }

        /* renamed from: e */
        public C5895d m28790e() {
            ArrayList<IntentFilter> arrayList = this.f33041c;
            if (arrayList != null) {
                this.f33039a.putParcelableArrayList("controlFilters", arrayList);
            }
            ArrayList<String> arrayList2 = this.f33040b;
            if (arrayList2 != null) {
                this.f33039a.putStringArrayList("groupMemberIds", arrayList2);
            }
            return new C5895d(this.f33039a);
        }

        /* renamed from: f */
        public a m28791f(boolean z10) {
            this.f33039a.putBoolean("canDisconnect", z10);
            return this;
        }

        /* renamed from: g */
        public a m28792g(int i10) {
            this.f33039a.putInt("connectionState", i10);
            return this;
        }

        /* renamed from: h */
        public a m28793h(String str) {
            this.f33039a.putString("status", str);
            return this;
        }

        /* renamed from: i */
        public a m28794i(int i10) {
            this.f33039a.putInt("deviceType", i10);
            return this;
        }

        /* renamed from: j */
        public a m28795j(boolean z10) {
            this.f33039a.putBoolean("enabled", z10);
            return this;
        }

        /* renamed from: k */
        public a m28796k(Bundle bundle) {
            if (bundle == null) {
                this.f33039a.putBundle("extras", null);
            } else {
                this.f33039a.putBundle("extras", new Bundle(bundle));
            }
            return this;
        }

        /* renamed from: l */
        public a m28797l(Uri uri) {
            if (uri == null) {
                throw new IllegalArgumentException("iconUri must not be null");
            }
            this.f33039a.putString("iconUri", uri.toString());
            return this;
        }

        /* renamed from: m */
        public a m28798m(String str) {
            if (str == null) {
                throw new NullPointerException("id must not be null");
            }
            this.f33039a.putString(Name.MARK, str);
            return this;
        }

        /* renamed from: n */
        public a m28799n(String str) {
            if (str == null) {
                throw new NullPointerException("name must not be null");
            }
            this.f33039a.putString("name", str);
            return this;
        }

        /* renamed from: o */
        public a m28800o(int i10) {
            this.f33039a.putInt("playbackStream", i10);
            return this;
        }

        /* renamed from: p */
        public a m28801p(int i10) {
            this.f33039a.putInt("playbackType", i10);
            return this;
        }

        /* renamed from: q */
        public a m28802q(int i10) {
            this.f33039a.putInt("presentationDisplayId", i10);
            return this;
        }

        /* renamed from: r */
        public a m28803r(int i10) {
            this.f33039a.putInt("volume", i10);
            return this;
        }

        /* renamed from: s */
        public a m28804s(int i10) {
            this.f33039a.putInt("volumeHandling", i10);
            return this;
        }

        /* renamed from: t */
        public a m28805t(int i10) {
            this.f33039a.putInt("volumeMax", i10);
            return this;
        }
    }

    public C5895d(Bundle bundle) {
        this.f33036a = bundle;
    }

    /* renamed from: d */
    public static C5895d m28762d(Bundle bundle) {
        return bundle != null ? new C5895d(bundle) : null;
    }

    /* renamed from: a */
    public boolean m28763a() {
        return this.f33036a.getBoolean("canDisconnect", false);
    }

    /* renamed from: b */
    public void m28764b() {
        if (this.f33038c == null) {
            ArrayList parcelableArrayList = this.f33036a.getParcelableArrayList("controlFilters");
            this.f33038c = parcelableArrayList;
            if (parcelableArrayList == null) {
                this.f33038c = Collections.emptyList();
            }
        }
    }

    /* renamed from: c */
    public void m28765c() {
        if (this.f33037b == null) {
            ArrayList<String> stringArrayList = this.f33036a.getStringArrayList("groupMemberIds");
            this.f33037b = stringArrayList;
            if (stringArrayList == null) {
                this.f33037b = Collections.emptyList();
            }
        }
    }

    /* renamed from: e */
    public int m28766e() {
        return this.f33036a.getInt("connectionState", 0);
    }

    /* renamed from: f */
    public List<IntentFilter> m28767f() {
        m28764b();
        return this.f33038c;
    }

    /* renamed from: g */
    public String m28768g() {
        return this.f33036a.getString("status");
    }

    /* renamed from: h */
    public int m28769h() {
        return this.f33036a.getInt("deviceType");
    }

    /* renamed from: i */
    public Bundle m28770i() {
        return this.f33036a.getBundle("extras");
    }

    /* renamed from: j */
    public List<String> m28771j() {
        m28765c();
        return this.f33037b;
    }

    /* renamed from: k */
    public Uri m28772k() {
        String string = this.f33036a.getString("iconUri");
        return string == null ? null : Uri.parse(string);
    }

    /* renamed from: l */
    public String m28773l() {
        return this.f33036a.getString(Name.MARK);
    }

    /* renamed from: m */
    public int m28774m() {
        return this.f33036a.getInt("maxClientVersion", Integer.MAX_VALUE);
    }

    /* renamed from: n */
    public int m28775n() {
        return this.f33036a.getInt("minClientVersion", 1);
    }

    /* renamed from: o */
    public String m28776o() {
        return this.f33036a.getString("name");
    }

    /* renamed from: p */
    public int m28777p() {
        return this.f33036a.getInt("playbackStream", -1);
    }

    /* renamed from: q */
    public int m28778q() {
        return this.f33036a.getInt("playbackType", 1);
    }

    /* renamed from: r */
    public int m28779r() {
        return this.f33036a.getInt("presentationDisplayId", -1);
    }

    /* renamed from: s */
    public IntentSender m28780s() {
        return (IntentSender) this.f33036a.getParcelable("settingsIntent");
    }

    /* renamed from: t */
    public int m28781t() {
        return this.f33036a.getInt("volume");
    }

    public String toString() {
        return "MediaRouteDescriptor{ id=" + m28773l() + ", groupMemberIds=" + m28771j() + ", name=" + m28776o() + ", description=" + m28768g() + ", iconUri=" + m28772k() + ", isEnabled=" + m28784w() + ", connectionState=" + m28766e() + ", controlFilters=" + Arrays.toString(m28767f().toArray()) + ", playbackType=" + m28778q() + ", playbackStream=" + m28777p() + ", deviceType=" + m28769h() + ", volume=" + m28781t() + ", volumeMax=" + m28783v() + ", volumeHandling=" + m28782u() + ", presentationDisplayId=" + m28779r() + ", extras=" + m28770i() + ", isValid=" + m28785x() + ", minClientVersion=" + m28775n() + ", maxClientVersion=" + m28774m() + " }";
    }

    /* renamed from: u */
    public int m28782u() {
        return this.f33036a.getInt("volumeHandling", 0);
    }

    /* renamed from: v */
    public int m28783v() {
        return this.f33036a.getInt("volumeMax");
    }

    /* renamed from: w */
    public boolean m28784w() {
        return this.f33036a.getBoolean("enabled", true);
    }

    /* renamed from: x */
    public boolean m28785x() {
        m28764b();
        return (TextUtils.isEmpty(m28773l()) || TextUtils.isEmpty(m28776o()) || this.f33038c.contains(null)) ? false : true;
    }
}

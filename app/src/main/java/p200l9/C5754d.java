package p200l9;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p304r9.C8013a;
import p402x9.C9691a;
import p422y9.C9932n;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/d.class
 */
/* renamed from: l9.d */
/* loaded from: combined.jar:classes2.jar:l9/d.class */
public class C5754d extends AbstractC10125a {
    public static final Parcelable.Creator<C5754d> CREATOR = new C5805s1();

    /* renamed from: d */
    public String f32206d;

    /* renamed from: e */
    public String f32207e;

    /* renamed from: f */
    public final List f32208f;

    /* renamed from: g */
    public String f32209g;

    /* renamed from: h */
    public Uri f32210h;

    /* renamed from: i */
    public String f32211i;

    /* renamed from: j */
    public String f32212j;

    public C5754d() {
        this.f32208f = new ArrayList();
    }

    public C5754d(String str, String str2, List list, List list2, String str3, Uri uri, String str4, String str5) {
        this.f32206d = str;
        this.f32207e = str2;
        this.f32208f = list2;
        this.f32209g = str3;
        this.f32210h = uri;
        this.f32211i = str4;
        this.f32212j = str5;
    }

    /* renamed from: P */
    public String m28170P() {
        return this.f32206d;
    }

    /* renamed from: Q */
    public String m28171Q() {
        return this.f32211i;
    }

    @Deprecated
    /* renamed from: R */
    public List<C9691a> m28172R() {
        return null;
    }

    /* renamed from: S */
    public String m28173S() {
        return this.f32209g;
    }

    /* renamed from: T */
    public List<String> m28174T() {
        return Collections.unmodifiableList(this.f32208f);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5754d)) {
            return false;
        }
        C5754d c5754d = (C5754d) obj;
        return C8013a.m34870k(this.f32206d, c5754d.f32206d) && C8013a.m34870k(this.f32207e, c5754d.f32207e) && C8013a.m34870k(this.f32208f, c5754d.f32208f) && C8013a.m34870k(this.f32209g, c5754d.f32209g) && C8013a.m34870k(this.f32210h, c5754d.f32210h) && C8013a.m34870k(this.f32211i, c5754d.f32211i) && C8013a.m34870k(this.f32212j, c5754d.f32212j);
    }

    public String getName() {
        return this.f32207e;
    }

    public int hashCode() {
        return C9932n.m41833c(this.f32206d, this.f32207e, this.f32208f, this.f32209g, this.f32210h, this.f32211i);
    }

    public String toString() {
        String str = this.f32206d;
        String str2 = this.f32207e;
        List list = this.f32208f;
        return "applicationId: " + str + ", name: " + str2 + ", namespaces.count: " + (list == null ? 0 : list.size()) + ", senderAppIdentifier: " + this.f32209g + ", senderAppLaunchUrl: " + String.valueOf(this.f32210h) + ", iconUrl: " + this.f32211i + ", type: " + this.f32212j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42536s(parcel, 2, m28170P(), false);
        C10127c.m42536s(parcel, 3, getName(), false);
        C10127c.m42540w(parcel, 4, m28172R(), false);
        C10127c.m42538u(parcel, 5, m28174T(), false);
        C10127c.m42536s(parcel, 6, m28173S(), false);
        C10127c.m42535r(parcel, 7, this.f32210h, i10, false);
        C10127c.m42536s(parcel, 8, m28171Q(), false);
        C10127c.m42536s(parcel, 9, this.f32212j, false);
        C10127c.m42519b(parcel, m42518a);
    }
}

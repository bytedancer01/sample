package p030c0;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.app.Person;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c0/o0.class
 */
/* renamed from: c0.o0 */
/* loaded from: combined.jar:classes1.jar:c0/o0.class */
public class C0959o0 {

    /* renamed from: a */
    public CharSequence f6635a;

    /* renamed from: b */
    public IconCompat f6636b;

    /* renamed from: c */
    public String f6637c;

    /* renamed from: d */
    public String f6638d;

    /* renamed from: e */
    public boolean f6639e;

    /* renamed from: f */
    public boolean f6640f;

    /* renamed from: a */
    public IconCompat m5720a() {
        return this.f6636b;
    }

    /* renamed from: b */
    public String m5721b() {
        return this.f6638d;
    }

    /* renamed from: c */
    public CharSequence m5722c() {
        return this.f6635a;
    }

    /* renamed from: d */
    public String m5723d() {
        return this.f6637c;
    }

    /* renamed from: e */
    public boolean m5724e() {
        return this.f6639e;
    }

    /* renamed from: f */
    public boolean m5725f() {
        return this.f6640f;
    }

    /* renamed from: g */
    public String m5726g() {
        String str = this.f6637c;
        if (str != null) {
            return str;
        }
        if (this.f6635a == null) {
            return "";
        }
        return "name:" + ((Object) this.f6635a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.app.Person$Builder] */
    /* renamed from: h */
    public Person m5727h() {
        return new Object() { // from class: android.app.Person$Builder
            static {
                throw new NoClassDefFoundError();
            }

            @NonNull
            public native /* synthetic */ Person build();

            @NonNull
            public native /* synthetic */ Person$Builder setBot(boolean z10);

            @NonNull
            public native /* synthetic */ Person$Builder setIcon(@Nullable Icon icon);

            @NonNull
            public native /* synthetic */ Person$Builder setImportant(boolean z10);

            @NonNull
            public native /* synthetic */ Person$Builder setKey(@Nullable String str);

            @NonNull
            public native /* synthetic */ Person$Builder setName(@Nullable CharSequence charSequence);

            @NonNull
            public native /* synthetic */ Person$Builder setUri(@Nullable String str);
        }.setName(m5722c()).setIcon(m5720a() != null ? m5720a().m1896q() : null).setUri(m5723d()).setKey(m5721b()).setBot(m5724e()).setImportant(m5725f()).build();
    }
}

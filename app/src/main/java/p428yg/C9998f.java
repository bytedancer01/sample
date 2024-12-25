package p428yg;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.InputStream;
import p428yg.AbstractC10019y;
import p428yg.C10014t;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yg/f.class
 */
/* renamed from: yg.f */
/* loaded from: combined.jar:classes2.jar:yg/f.class */
public class C9998f extends AbstractC10019y {

    /* renamed from: b */
    public static final UriMatcher f45829b;

    /* renamed from: a */
    public final Context f45830a;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yg/f$a.class
     */
    @TargetApi(14)
    /* renamed from: yg.f$a */
    /* loaded from: combined.jar:classes2.jar:yg/f$a.class */
    public static class a {
        /* renamed from: a */
        public static InputStream m42030a(ContentResolver contentResolver, Uri uri) {
            return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
        }
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f45829b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    public C9998f(Context context) {
        this.f45830a = context;
    }

    @Override // p428yg.AbstractC10019y
    /* renamed from: c */
    public boolean mo41998c(C10017w c10017w) {
        Uri uri = c10017w.f45928d;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f45829b.match(c10017w.f45928d) != -1;
    }

    @Override // p428yg.AbstractC10019y
    /* renamed from: f */
    public AbstractC10019y.a mo41999f(C10017w c10017w, int i10) {
        InputStream m42029j = m42029j(c10017w);
        return m42029j != null ? new AbstractC10019y.a(m42029j, C10014t.e.DISK) : null;
    }

    /* renamed from: j */
    public final InputStream m42029j(C10017w c10017w) {
        Uri uri;
        ContentResolver contentResolver = this.f45830a.getContentResolver();
        Uri uri2 = c10017w.f45928d;
        int match = f45829b.match(uri2);
        if (match != 1) {
            if (match != 2) {
                uri = uri2;
                if (match != 3) {
                    if (match != 4) {
                        throw new IllegalStateException("Invalid uri: " + uri2);
                    }
                }
            }
            return contentResolver.openInputStream(uri2);
        }
        Uri lookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri2);
        uri = lookupContact;
        if (lookupContact == null) {
            return null;
        }
        return a.m42030a(contentResolver, uri);
    }
}

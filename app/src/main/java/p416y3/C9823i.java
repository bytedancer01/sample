package p416y3;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:y3/i.class
 */
/* renamed from: y3.i */
/* loaded from: combined.jar:classes1.jar:y3/i.class */
public class C9823i extends AbstractC9821g<InputStream> {

    /* renamed from: d */
    public static final UriMatcher f45156d;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f45156d = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
    }

    public C9823i(Context context, Uri uri) {
        super(context, uri);
    }

    @Override // p416y3.AbstractC9821g
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo41351c(InputStream inputStream) {
        inputStream.close();
    }

    @Override // p416y3.AbstractC9821g
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InputStream mo41352d(Uri uri, ContentResolver contentResolver) {
        return m41363g(uri, contentResolver, f45156d.match(uri));
    }

    /* renamed from: g */
    public final InputStream m41363g(Uri uri, ContentResolver contentResolver, int i10) {
        if (i10 != 1 && i10 != 3) {
            return contentResolver.openInputStream(uri);
        }
        Uri uri2 = uri;
        if (i10 == 1) {
            uri2 = ContactsContract.Contacts.lookupContact(contentResolver, uri);
            if (uri2 == null) {
                throw new FileNotFoundException("Contact cannot be found");
            }
        }
        return m41364h(contentResolver, uri2);
    }

    @TargetApi(14)
    /* renamed from: h */
    public final InputStream m41364h(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }
}

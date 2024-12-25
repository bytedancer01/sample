package p295r0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:r0/c.class
 */
/* renamed from: r0.c */
/* loaded from: combined.jar:classes1.jar:r0/c.class */
public final class C7940c {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:r0/c$a.class
     */
    /* renamed from: r0.c$a */
    /* loaded from: combined.jar:classes1.jar:r0/c$a.class */
    public class a extends InputConnectionWrapper {

        /* renamed from: a */
        public final c f38204a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InputConnection inputConnection, boolean z10, c cVar) {
            super(inputConnection, z10);
            this.f38204a = cVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
            if (this.f38204a.mo1568a(C7941d.m34468f(inputContentInfo), i10, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i10, bundle);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:r0/c$b.class
     */
    /* renamed from: r0.c$b */
    /* loaded from: combined.jar:classes1.jar:r0/c$b.class */
    public class b extends InputConnectionWrapper {

        /* renamed from: a */
        public final c f38205a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InputConnection inputConnection, boolean z10, c cVar) {
            super(inputConnection, z10);
            this.f38205a = cVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (C7940c.m34467b(str, bundle, this.f38205a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:r0/c$c.class
     */
    /* renamed from: r0.c$c */
    /* loaded from: combined.jar:classes1.jar:r0/c$c.class */
    public interface c {
        /* renamed from: a */
        boolean mo1568a(C7941d c7941d, int i10, Bundle bundle);
    }

    /* renamed from: a */
    public static InputConnection m34466a(InputConnection inputConnection, EditorInfo editorInfo, c cVar) {
        if (inputConnection == null) {
            throw new IllegalArgumentException("inputConnection must be non-null");
        }
        if (editorInfo == null) {
            throw new IllegalArgumentException("editorInfo must be non-null");
        }
        if (cVar != null) {
            return Build.VERSION.SDK_INT >= 25 ? new a(inputConnection, false, cVar) : C7939b.m34457a(editorInfo).length == 0 ? inputConnection : new b(inputConnection, false, cVar);
        }
        throw new IllegalArgumentException("onCommitContentListener must be non-null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static boolean m34467b(String str, Bundle bundle, c cVar) {
        byte b10;
        ResultReceiver resultReceiver;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            b10 = false;
        } else {
            if (!TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                return false;
            }
            b10 = true;
        }
        try {
            ResultReceiver resultReceiver2 = (ResultReceiver) bundle.getParcelable(b10 != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
            try {
                Uri uri = (Uri) bundle.getParcelable(b10 != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
                ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(b10 != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
                Uri uri2 = (Uri) bundle.getParcelable(b10 != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
                int i10 = bundle.getInt(b10 != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
                Bundle bundle2 = (Bundle) bundle.getParcelable(b10 != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
                boolean z10 = false;
                if (uri != null) {
                    z10 = false;
                    if (clipDescription != null) {
                        z10 = cVar.mo1568a(new C7941d(uri, clipDescription, uri2), i10, bundle2);
                    }
                }
                if (resultReceiver2 != null) {
                    resultReceiver2.send(z10 ? 1 : 0, null);
                }
                return z10;
            } catch (Throwable th2) {
                th = th2;
                resultReceiver = resultReceiver2;
                if (resultReceiver != null) {
                    resultReceiver.send(0, null);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            resultReceiver = null;
        }
    }
}

package p411xi;

import ci.C1129o;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xi/q.class
 */
/* renamed from: xi.q */
/* loaded from: combined.jar:classes2.jar:xi/q.class */
public final /* synthetic */ class C9773q {

    /* renamed from: a */
    public static final Logger f44552a = Logger.getLogger("okio.Okio");

    @NotNull
    /* renamed from: b */
    public static final InterfaceC9782z m41240b(@NotNull File file) {
        C9367f.m39526e(file, "$this$appendingSink");
        return C9772p.m41233g(new FileOutputStream(file, true));
    }

    /* renamed from: c */
    public static final boolean m41241c(@NotNull AssertionError assertionError) {
        C9367f.m39526e(assertionError, "$this$isAndroidGetsocknameError");
        boolean z10 = false;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            z10 = false;
            if (message != null ? C1129o.m6736D(message, "getsockname failed", false, 2, null) : false) {
                z10 = true;
            }
        }
        return z10;
    }

    @NotNull
    /* renamed from: d */
    public static final InterfaceC9782z m41242d(@NotNull File file, boolean z10) {
        C9367f.m39526e(file, "$this$sink");
        return C9772p.m41233g(new FileOutputStream(file, z10));
    }

    @NotNull
    /* renamed from: e */
    public static final InterfaceC9782z m41243e(@NotNull OutputStream outputStream) {
        C9367f.m39526e(outputStream, "$this$sink");
        return new C9776t(outputStream, new C9758c0());
    }

    @NotNull
    /* renamed from: f */
    public static final InterfaceC9782z m41244f(@NotNull Socket socket) {
        C9367f.m39526e(socket, "$this$sink");
        C9754a0 c9754a0 = new C9754a0(socket);
        OutputStream outputStream = socket.getOutputStream();
        C9367f.m39525d(outputStream, "getOutputStream()");
        return c9754a0.m41106v(new C9776t(outputStream, c9754a0));
    }

    /* renamed from: g */
    public static /* synthetic */ InterfaceC9782z m41245g(File file, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return C9772p.m41232f(file, z10);
    }

    @NotNull
    /* renamed from: h */
    public static final InterfaceC9756b0 m41246h(@NotNull File file) {
        C9367f.m39526e(file, "$this$source");
        return C9772p.m41237k(new FileInputStream(file));
    }

    @NotNull
    /* renamed from: i */
    public static final InterfaceC9756b0 m41247i(@NotNull InputStream inputStream) {
        C9367f.m39526e(inputStream, "$this$source");
        return new C9771o(inputStream, new C9758c0());
    }

    @NotNull
    /* renamed from: j */
    public static final InterfaceC9756b0 m41248j(@NotNull Socket socket) {
        C9367f.m39526e(socket, "$this$source");
        C9754a0 c9754a0 = new C9754a0(socket);
        InputStream inputStream = socket.getInputStream();
        C9367f.m39525d(inputStream, "getInputStream()");
        return c9754a0.m41107w(new C9771o(inputStream, c9754a0));
    }
}

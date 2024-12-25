package p173ji;

import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;
import p411xi.C9764h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ji/q.class
 */
/* renamed from: ji.q */
/* loaded from: combined.jar:classes2.jar:ji/q.class */
public final class C5426q {

    /* renamed from: a */
    public static final C5426q f31117a = new C5426q();

    @NotNull
    /* renamed from: a */
    public static final String m27028a(@NotNull String str, @NotNull String str2, @NotNull Charset charset) {
        C9367f.m39526e(str, CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME);
        C9367f.m39526e(str2, CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD);
        C9367f.m39526e(charset, "charset");
        return "Basic " + C9764h.f44531f.m41211c(str + ':' + str2, charset).mo41190d();
    }
}

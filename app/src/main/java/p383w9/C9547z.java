package p383w9;

import com.google.android.gms.common.api.GoogleApiClient;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/z.class
 */
/* renamed from: w9.z */
/* loaded from: combined.jar:classes2.jar:w9/z.class */
public class C9547z extends GoogleApiClient {

    /* renamed from: b */
    public final String f43509b = "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.";

    public C9547z(String str) {
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        throw new UnsupportedOperationException(this.f43509b);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: d */
    public final void mo13107d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        throw new UnsupportedOperationException(this.f43509b);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        throw new UnsupportedOperationException(this.f43509b);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: g */
    public final boolean mo13110g() {
        throw new UnsupportedOperationException(this.f43509b);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: h */
    public final void mo13111h(GoogleApiClient.InterfaceC2413c interfaceC2413c) {
        throw new UnsupportedOperationException(this.f43509b);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: i */
    public final void mo13112i(GoogleApiClient.InterfaceC2413c interfaceC2413c) {
        throw new UnsupportedOperationException(this.f43509b);
    }
}

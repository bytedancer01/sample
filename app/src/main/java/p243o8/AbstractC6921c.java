package p243o8;

import com.google.android.exoplayer2.decoder.AbstractC2328a;
import java.nio.ByteBuffer;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p059d9.C4349a;
import p332t6.AbstractC8640h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:o8/c.class
 */
/* renamed from: o8.c */
/* loaded from: combined.jar:classes2.jar:o8/c.class */
public abstract class AbstractC6921c extends AbstractC8640h<C6927i, AbstractC6928j, C6925g> implements InterfaceC6924f {

    /* renamed from: n */
    public final String f35831n;

    public AbstractC6921c(String str) {
        super(new C6927i[2], new AbstractC6928j[2]);
        this.f35831n = str;
        m37096u(1024);
    }

    @Override // p332t6.AbstractC8640h
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final C6925g mo11984j(C6927i c6927i, AbstractC6928j abstractC6928j, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) C4349a.m21882e(c6927i.f40327c);
            abstractC6928j.m31889e(c6927i.f40329e, mo31882z(byteBuffer.array(), byteBuffer.limit(), z10), c6927i.f35834i);
            abstractC6928j.clearFlag(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
            return null;
        } catch (C6925g e10) {
            return e10;
        }
    }

    @Override // p243o8.InterfaceC6924f
    /* renamed from: a */
    public void mo31878a(long j10) {
    }

    @Override // p332t6.InterfaceC8635c
    public final String getName() {
        return this.f35831n;
    }

    @Override // p332t6.AbstractC8640h
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final C6927i mo11981g() {
        return new C6927i();
    }

    @Override // p332t6.AbstractC8640h
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final AbstractC6928j mo11982h() {
        return new C6922d(new AbstractC2328a.a(this) { // from class: o8.b

            /* renamed from: a */
            public final AbstractC6921c f35830a;

            {
                this.f35830a = this;
            }

            @Override // com.google.android.exoplayer2.decoder.AbstractC2328a.a
            /* renamed from: a */
            public final void mo301a(AbstractC2328a abstractC2328a) {
                this.f35830a.mo11985r((AbstractC6928j) abstractC2328a);
            }
        });
    }

    @Override // p332t6.AbstractC8640h
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final C6925g mo11983i(Throwable th2) {
        return new C6925g("Unexpected decode error", th2);
    }

    /* renamed from: z */
    public abstract InterfaceC6923e mo31882z(byte[] bArr, int i10, boolean z10);
}

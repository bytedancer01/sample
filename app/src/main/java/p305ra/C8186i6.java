package p305ra;

import java.io.IOException;
import p305ra.AbstractC8231l6;
import p305ra.C8186i6;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/i6.class
 */
/* renamed from: ra.i6 */
/* loaded from: combined.jar:classes2.jar:ra/i6.class */
public class C8186i6<MessageType extends AbstractC8231l6<MessageType, BuilderType>, BuilderType extends C8186i6<MessageType, BuilderType>> extends AbstractC8334s4<MessageType, BuilderType> {

    /* renamed from: b */
    public final MessageType f39118b;

    /* renamed from: c */
    public MessageType f39119c;

    /* renamed from: d */
    public boolean f39120d = false;

    public C8186i6(MessageType messagetype) {
        this.f39118b = messagetype;
        this.f39119c = (MessageType) messagetype.mo35030x(4, null, null);
    }

    /* renamed from: k */
    public static final void m35440k(MessageType messagetype, MessageType messagetype2) {
        C8442z7.m36242a().m36243b(messagetype.getClass()).mo35100e(messagetype, messagetype2);
    }

    @Override // p305ra.InterfaceC8322r7
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ InterfaceC8307q7 mo35441d() {
        return this.f39118b;
    }

    @Override // p305ra.AbstractC8334s4
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ AbstractC8334s4 mo35442h(byte[] bArr, int i10, int i11) {
        m35447n(bArr, 0, i11, C8425y5.m36226a());
        return this;
    }

    @Override // p305ra.AbstractC8334s4
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ AbstractC8334s4 mo35443i(byte[] bArr, int i10, int i11, C8425y5 c8425y5) {
        m35447n(bArr, 0, i11, c8425y5);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p305ra.AbstractC8334s4
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ AbstractC8334s4 mo35444j(AbstractC8349t4 abstractC8349t4) {
        m35446m((AbstractC8231l6) abstractC8349t4);
        return this;
    }

    /* renamed from: l */
    public final MessageType m35445l() {
        MessageType mo35451t = mo35451t();
        boolean z10 = true;
        byte byteValue = ((Byte) mo35451t.mo35030x(1, null, null)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z10 = false;
            } else {
                z10 = C8442z7.m36242a().m36243b(mo35451t.getClass()).mo35101f(mo35451t);
                mo35451t.mo35030x(2, true != z10 ? null : mo35451t, null);
            }
        }
        if (z10) {
            return mo35451t;
        }
        throw new C8293p8(mo35451t);
    }

    /* renamed from: m */
    public final BuilderType m35446m(MessageType messagetype) {
        if (this.f39120d) {
            m35448o();
            this.f39120d = false;
        }
        m35440k(this.f39119c, messagetype);
        return this;
    }

    /* renamed from: n */
    public final BuilderType m35447n(byte[] bArr, int i10, int i11, C8425y5 c8425y5) {
        if (this.f39120d) {
            m35448o();
            this.f39120d = false;
        }
        try {
            C8442z7.m36242a().m36243b(this.f39119c.getClass()).mo35098c(this.f39119c, bArr, 0, i11, new C8394w4(c8425y5));
            return this;
        } catch (C8396w6 e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException e12) {
            throw C8396w6.m35986a();
        }
    }

    /* renamed from: o */
    public void m35448o() {
        MessageType messagetype = (MessageType) this.f39119c.mo35030x(4, null, null);
        m35440k(messagetype, this.f39119c);
        this.f39119c = messagetype;
    }

    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final BuilderType clone() {
        BuilderType buildertype = (BuilderType) this.f39118b.mo35030x(5, null, null);
        buildertype.m35446m(mo35451t());
        return buildertype;
    }

    @Override // p305ra.InterfaceC8292p7
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public MessageType mo35451t() {
        if (this.f39120d) {
            return this.f39119c;
        }
        MessageType messagetype = this.f39119c;
        C8442z7.m36242a().m36243b(messagetype.getClass()).mo35102g(messagetype);
        this.f39120d = true;
        return this.f39119c;
    }
}

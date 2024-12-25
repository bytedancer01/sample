package p329t3;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import p005a4.InterfaceC0065b;
import p073e4.C4612g;
import p142i4.AbstractC5173d;
import p142i4.AbstractC5175f;
import p142i4.C5177h;
import p142i4.C5186q;
import p280q4.InterfaceC7757f;
import p396x3.EnumC9644a;
import p396x3.InterfaceC9646c;
import p396x3.InterfaceC9648e;
import p396x3.InterfaceC9650g;
import p435z3.EnumC10038b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:t3/a.class
 */
/* renamed from: t3.a */
/* loaded from: combined.jar:classes1.jar:t3/a.class */
public class C8611a<ModelType, TranscodeType> extends C8615e<ModelType, C4612g, Bitmap, TranscodeType> {

    /* renamed from: E */
    public final InterfaceC0065b f40191E;

    /* renamed from: F */
    public AbstractC5175f f40192F;

    /* renamed from: G */
    public EnumC9644a f40193G;

    /* renamed from: H */
    public InterfaceC9648e<InputStream, Bitmap> f40194H;

    /* renamed from: I */
    public InterfaceC9648e<ParcelFileDescriptor, Bitmap> f40195I;

    public C8611a(InterfaceC7757f<ModelType, C4612g, Bitmap, TranscodeType> interfaceC7757f, Class<TranscodeType> cls, C8615e<ModelType, ?, ?, ?> c8615e) {
        super(interfaceC7757f, cls, c8615e);
        this.f40192F = AbstractC5175f.f29555c;
        InterfaceC0065b m37011l = c8615e.f40209d.m37011l();
        this.f40191E = m37011l;
        EnumC9644a m37012m = c8615e.f40209d.m37012m();
        this.f40193G = m37012m;
        this.f40194H = new C5186q(m37011l, m37012m);
        this.f40195I = new C5177h(m37011l, this.f40193G);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p329t3.C8615e
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public C8611a<ModelType, TranscodeType> mo36966h(InterfaceC9648e<C4612g, Bitmap> interfaceC9648e) {
        super.mo36966h(interfaceC9648e);
        return this;
    }

    @Override // p329t3.C8615e
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public C8611a<ModelType, TranscodeType> mo36967i(EnumC10038b enumC10038b) {
        super.mo36967i(enumC10038b);
        return this;
    }

    /* renamed from: D */
    public C8611a<ModelType, TranscodeType> m36957D() {
        return m36961H(this.f40209d.m37010k());
    }

    @Override // p329t3.C8615e
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public C8611a<ModelType, TranscodeType> mo36968o(int i10, int i11) {
        super.mo36968o(i10, i11);
        return this;
    }

    @Override // p329t3.C8615e
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public C8611a<ModelType, TranscodeType> mo36969p(InterfaceC9646c interfaceC9646c) {
        super.mo36969p(interfaceC9646c);
        return this;
    }

    @Override // p329t3.C8615e
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public C8611a<ModelType, TranscodeType> mo36970r(boolean z10) {
        super.mo36970r(z10);
        return this;
    }

    /* renamed from: H */
    public C8611a<ModelType, TranscodeType> m36961H(AbstractC5173d... abstractC5173dArr) {
        super.mo36971u(abstractC5173dArr);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p329t3.C8615e
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public C8611a<ModelType, TranscodeType> mo36971u(InterfaceC9650g<Bitmap>... interfaceC9650gArr) {
        super.mo36971u(interfaceC9650gArr);
        return this;
    }

    @Override // p329t3.C8615e
    /* renamed from: b */
    public void mo36963b() {
        m36972x();
    }

    @Override // p329t3.C8615e
    /* renamed from: c */
    public void mo36964c() {
        m36957D();
    }

    /* renamed from: x */
    public C8611a<ModelType, TranscodeType> m36972x() {
        return m36961H(this.f40209d.m37009j());
    }

    @Override // p329t3.C8615e
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public C8611a<ModelType, TranscodeType> mo36965g() {
        return (C8611a) super.mo36965g();
    }
}

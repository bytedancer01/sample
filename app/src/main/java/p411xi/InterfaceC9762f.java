package p411xi;

import java.nio.channels.WritableByteChannel;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xi/f.class
 */
/* renamed from: xi.f */
/* loaded from: combined.jar:classes2.jar:xi/f.class */
public interface InterfaceC9762f extends InterfaceC9782z, WritableByteChannel {
    @NotNull
    /* renamed from: G */
    InterfaceC9762f mo41124G();

    /* renamed from: I */
    long mo41127I(@NotNull InterfaceC9756b0 interfaceC9756b0);

    @NotNull
    /* renamed from: M */
    InterfaceC9762f mo41131M();

    @NotNull
    /* renamed from: Q */
    InterfaceC9762f mo41136Q(@NotNull String str);

    @NotNull
    /* renamed from: T */
    InterfaceC9762f mo41140T(@NotNull String str, int i10, int i11);

    @NotNull
    /* renamed from: d0 */
    InterfaceC9762f mo41155d0(long j10);

    @Override // p411xi.InterfaceC9782z, java.io.Flushable
    void flush();

    @NotNull
    C9761e getBuffer();

    @NotNull
    /* renamed from: i0 */
    InterfaceC9762f mo41162i0(@NotNull C9764h c9764h);

    @NotNull
    /* renamed from: s0 */
    InterfaceC9762f mo41174s0(long j10);

    @NotNull
    InterfaceC9762f write(@NotNull byte[] bArr);

    @NotNull
    InterfaceC9762f write(@NotNull byte[] bArr, int i10, int i11);

    @NotNull
    InterfaceC9762f writeByte(int i10);

    @NotNull
    InterfaceC9762f writeInt(int i10);

    @NotNull
    InterfaceC9762f writeShort(int i10);

    @NotNull
    /* renamed from: z */
    C9761e mo41177z();
}

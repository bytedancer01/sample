package p411xi;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xi/g.class
 */
/* renamed from: xi.g */
/* loaded from: combined.jar:classes2.jar:xi/g.class */
public interface InterfaceC9763g extends InterfaceC9756b0, ReadableByteChannel {
    @NotNull
    /* renamed from: V */
    String mo41143V();

    @NotNull
    /* renamed from: W */
    byte[] mo41145W(long j10);

    /* renamed from: b0 */
    void mo41151b0(long j10);

    /* renamed from: c0 */
    long mo41153c0(@NotNull C9764h c9764h);

    @NotNull
    /* renamed from: g0 */
    C9764h mo41159g0(long j10);

    @NotNull
    C9761e getBuffer();

    @NotNull
    InputStream inputStream();

    /* renamed from: k */
    void mo41163k(@NotNull C9761e c9761e, long j10);

    /* renamed from: k0 */
    boolean mo41164k0();

    @NotNull
    /* renamed from: m */
    String mo41166m(long j10);

    /* renamed from: r */
    long mo41171r(@NotNull InterfaceC9782z interfaceC9782z);

    @NotNull
    /* renamed from: r0 */
    String mo41172r0(@NotNull Charset charset);

    byte readByte();

    void readFully(@NotNull byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    /* renamed from: s */
    int mo41173s(@NotNull C9775s c9775s);

    void skip(long j10);

    /* renamed from: u */
    boolean mo41175u(long j10);

    @NotNull
    /* renamed from: z */
    C9761e mo41177z();

    /* renamed from: z0 */
    long mo41178z0();
}

package p348u7;

import ec.C4699b;
import ec.C4701d;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p283q7.AbstractC7846h;
import p283q7.C7839a;
import p283q7.C7843e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:u7/a.class
 */
/* renamed from: u7.a */
/* loaded from: combined.jar:classes2.jar:u7/a.class */
public final class C8797a extends AbstractC7846h {

    /* renamed from: c */
    public static final Pattern f40797c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a */
    public final CharsetDecoder f40798a = C4701d.f27717c.newDecoder();

    /* renamed from: b */
    public final CharsetDecoder f40799b = C4701d.f27716b.newDecoder();

    @Override // p283q7.AbstractC7846h
    /* renamed from: b */
    public C7839a mo34101b(C7843e c7843e, ByteBuffer byteBuffer) {
        String m37647c = m37647c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (m37647c == null) {
            return new C7839a(new C8799c(bArr, null, null));
        }
        Matcher matcher = f40797c.matcher(m37647c);
        String str2 = null;
        int i10 = 0;
        while (matcher.find(i10)) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            String str3 = str;
            String str4 = str2;
            if (group != null) {
                String m23638e = C4699b.m23638e(group);
                m23638e.hashCode();
                if (m23638e.equals("streamurl")) {
                    str4 = group2;
                    str3 = str;
                } else if (m23638e.equals("streamtitle")) {
                    str3 = group2;
                    str4 = str2;
                } else {
                    str3 = str;
                    str4 = str2;
                }
            }
            i10 = matcher.end();
            str = str3;
            str2 = str4;
        }
        return new C7839a(new C8799c(bArr, str, str2));
    }

    /* renamed from: c */
    public final String m37647c(ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder;
        try {
            str = this.f40798a.decode(byteBuffer).toString();
            charsetDecoder = this.f40798a;
        } catch (CharacterCodingException e10) {
            this.f40798a.reset();
            byteBuffer.rewind();
            try {
                str = this.f40799b.decode(byteBuffer).toString();
            } catch (CharacterCodingException e11) {
                str = null;
            } catch (Throwable th2) {
                this.f40799b.reset();
                byteBuffer.rewind();
                throw th2;
            }
            charsetDecoder = this.f40799b;
        } catch (Throwable th3) {
            this.f40798a.reset();
            byteBuffer.rewind();
            throw th3;
        }
        charsetDecoder.reset();
        byteBuffer.rewind();
        return str;
    }
}

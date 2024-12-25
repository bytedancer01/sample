package md;

import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import p188kd.AbstractC5557j;
import p188kd.C5558k;
import p188kd.C5559l;
import p188kd.C5565r;
import p232nd.C6778n;
import sd.C8555a;
import sd.C8557c;
import sd.C8558d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:md/l.class
 */
/* renamed from: md.l */
/* loaded from: combined.jar:classes2.jar:md/l.class */
public final class C6571l {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:md/l$a.class
     */
    /* renamed from: md.l$a */
    /* loaded from: combined.jar:classes2.jar:md/l$a.class */
    public static final class a extends Writer {

        /* renamed from: b */
        public final Appendable f34392b;

        /* renamed from: c */
        public final C10322a f34393c = new C10322a();

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:md/l$a$a.class
         */
        /* renamed from: md.l$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes2.jar:md/l$a$a.class */
        public static class C10322a implements CharSequence {

            /* renamed from: b */
            public char[] f34394b;

            @Override // java.lang.CharSequence
            public char charAt(int i10) {
                return this.f34394b[i10];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f34394b.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i10, int i11) {
                return new String(this.f34394b, i10, i11 - i10);
            }
        }

        public a(Appendable appendable) {
            this.f34392b = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(int i10) {
            this.f34392b.append((char) i10);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            C10322a c10322a = this.f34393c;
            c10322a.f34394b = cArr;
            this.f34392b.append(c10322a, i10, i11 + i10);
        }
    }

    /* renamed from: a */
    public static AbstractC5557j m30334a(C8555a c8555a) {
        boolean z10;
        try {
            try {
                c8555a.mo31105J0();
                z10 = false;
            } catch (IOException e10) {
                throw new C5558k(e10);
            } catch (NumberFormatException e11) {
                throw new C5565r(e11);
            } catch (C8558d e12) {
                throw new C5565r(e12);
            }
        } catch (EOFException e13) {
            e = e13;
            z10 = true;
        }
        try {
            return C6778n.f35330U.mo27561b(c8555a);
        } catch (EOFException e14) {
            e = e14;
            if (z10) {
                return C5559l.f31648b;
            }
            throw new C5565r(e);
        }
    }

    /* renamed from: b */
    public static void m30335b(AbstractC5557j abstractC5557j, C8557c c8557c) {
        C6778n.f35330U.mo27562d(c8557c, abstractC5557j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Writer] */
    /* renamed from: c */
    public static Writer m30336c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }
}

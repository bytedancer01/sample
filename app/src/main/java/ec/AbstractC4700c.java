package ec;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ec/c.class
 */
/* renamed from: ec.c */
/* loaded from: combined.jar:classes2.jar:ec/c.class */
public abstract class AbstractC4700c implements InterfaceC4709l<Character> {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ec/c$a.class
     */
    /* renamed from: ec.c$a */
    /* loaded from: combined.jar:classes2.jar:ec/c$a.class */
    public static abstract class a extends AbstractC4700c {
        @Override // ec.InterfaceC4709l
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.m23644b(ch2);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ec/c$b.class
     */
    /* renamed from: ec.c$b */
    /* loaded from: combined.jar:classes2.jar:ec/c$b.class */
    public static final class b extends a {

        /* renamed from: a */
        public final char f27712a;

        public b(char c10) {
            this.f27712a = c10;
        }

        @Override // ec.AbstractC4700c
        /* renamed from: e */
        public boolean mo23646e(char c10) {
            return c10 == this.f27712a;
        }

        public String toString() {
            return "CharMatcher.is('" + AbstractC4700c.m23643g(this.f27712a) + "')";
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ec/c$c.class
     */
    /* renamed from: ec.c$c */
    /* loaded from: combined.jar:classes2.jar:ec/c$c.class */
    public static abstract class c extends a {

        /* renamed from: a */
        public final String f27713a;

        public c(String str) {
            this.f27713a = (String) C4708k.m23668j(str);
        }

        public final String toString() {
            return this.f27713a;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ec/c$d.class
     */
    /* renamed from: ec.c$d */
    /* loaded from: combined.jar:classes2.jar:ec/c$d.class */
    public static final class d extends c {

        /* renamed from: b */
        public static final d f27714b = new d();

        public d() {
            super("CharMatcher.none()");
        }

        @Override // ec.AbstractC4700c
        /* renamed from: c */
        public int mo23645c(CharSequence charSequence, int i10) {
            C4708k.m23670l(i10, charSequence.length());
            return -1;
        }

        @Override // ec.AbstractC4700c
        /* renamed from: e */
        public boolean mo23646e(char c10) {
            return false;
        }
    }

    /* renamed from: d */
    public static AbstractC4700c m23641d(char c10) {
        return new b(c10);
    }

    /* renamed from: f */
    public static AbstractC4700c m23642f() {
        return d.f27714b;
    }

    /* renamed from: g */
    public static String m23643g(char c10) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    /* renamed from: b */
    public boolean m23644b(Character ch2) {
        return mo23646e(ch2.charValue());
    }

    /* renamed from: c */
    public int mo23645c(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        C4708k.m23670l(i10, length);
        while (i10 < length) {
            if (mo23646e(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* renamed from: e */
    public abstract boolean mo23646e(char c10);
}

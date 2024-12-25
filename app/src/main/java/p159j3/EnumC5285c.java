package p159j3;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:j3/c.class
 */
/* renamed from: j3.c */
/* loaded from: combined.jar:classes1.jar:j3/c.class */
public enum EnumC5285c {
    IDLE,
    ACTIVE,
    TERMINATED,
    CANCELED;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:j3/c$a.class
     */
    /* renamed from: j3.c$a */
    /* loaded from: combined.jar:classes1.jar:j3/c$a.class */
    public static class a {

        /* renamed from: a */
        public final EnumC5285c f30335a;

        public a(EnumC5285c enumC5285c) {
            this.f30335a = enumC5285c;
        }

        /* renamed from: b */
        public static a m26393b(EnumC5285c enumC5285c) {
            return new a(enumC5285c);
        }

        /* renamed from: a */
        public String m26394a(EnumC5285c... enumC5285cArr) {
            StringBuilder sb2 = new StringBuilder("Expected: " + this.f30335a.name() + ", but found [");
            int length = enumC5285cArr.length;
            String str = "";
            int i10 = 0;
            while (i10 < length) {
                EnumC5285c enumC5285c = enumC5285cArr[i10];
                sb2.append(str);
                sb2.append(enumC5285c.name());
                i10++;
                str = ", ";
            }
            sb2.append("]");
            return sb2.toString();
        }
    }
}

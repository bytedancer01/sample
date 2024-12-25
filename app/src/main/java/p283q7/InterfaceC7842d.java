package p283q7;

import p267p6.C7629w0;
import p302r7.C8010b;
import p321s7.C8543b;
import p348u7.C8797a;
import p366v7.C9300h;
import p400x7.C9675c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:q7/d.class
 */
/* renamed from: q7.d */
/* loaded from: combined.jar:classes2.jar:q7/d.class */
public interface InterfaceC7842d {

    /* renamed from: a */
    public static final InterfaceC7842d f37805a = new a();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:q7/d$a.class
     */
    /* renamed from: q7.d$a */
    /* loaded from: combined.jar:classes2.jar:q7/d$a.class */
    public class a implements InterfaceC7842d {
        @Override // p283q7.InterfaceC7842d
        /* renamed from: a */
        public boolean mo34094a(C7629w0 c7629w0) {
            String str = c7629w0.f37086m;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // p283q7.InterfaceC7842d
        /* renamed from: b */
        public InterfaceC7841c mo34095b(C7629w0 c7629w0) {
            String str = c7629w0.f37086m;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new C8010b();
                    case "application/x-icy":
                        return new C8797a();
                    case "application/id3":
                        return new C9300h();
                    case "application/x-emsg":
                        return new C8543b();
                    case "application/x-scte35":
                        return new C9675c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    /* renamed from: a */
    boolean mo34094a(C7629w0 c7629w0);

    /* renamed from: b */
    InterfaceC7841c mo34095b(C7629w0 c7629w0);
}

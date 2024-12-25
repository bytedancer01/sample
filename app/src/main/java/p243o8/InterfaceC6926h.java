package p243o8;

import p267p6.C7629w0;
import p269p8.C7664a;
import p269p8.C7666c;
import p284q8.C7847a;
import p303r8.C8011a;
import p334t8.C8642a;
import p349u8.C8800a;
import p367v8.C9309c;
import p382w8.C9430a;
import p401x8.C9680a;
import p401x8.C9687h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:o8/h.class
 */
/* renamed from: o8.h */
/* loaded from: combined.jar:classes2.jar:o8/h.class */
public interface InterfaceC6926h {

    /* renamed from: a */
    public static final InterfaceC6926h f35833a = new a();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:o8/h$a.class
     */
    /* renamed from: o8.h$a */
    /* loaded from: combined.jar:classes2.jar:o8/h$a.class */
    public class a implements InterfaceC6926h {
        @Override // p243o8.InterfaceC6926h
        /* renamed from: a */
        public boolean mo31887a(C7629w0 c7629w0) {
            String str = c7629w0.f37086m;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str);
        }

        @Override // p243o8.InterfaceC6926h
        /* renamed from: b */
        public InterfaceC6924f mo31888b(C7629w0 c7629w0) {
            String str = c7629w0.f37086m;
            if (str != null) {
                switch (str) {
                    case "application/dvbsubs":
                        return new C7847a(c7629w0.f37088o);
                    case "application/pgs":
                        return new C8011a();
                    case "application/x-mp4-vtt":
                        return new C9680a();
                    case "text/vtt":
                        return new C9687h();
                    case "application/x-quicktime-tx3g":
                        return new C9430a(c7629w0.f37088o);
                    case "text/x-ssa":
                        return new C8642a(c7629w0.f37088o);
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new C7664a(str, c7629w0.f37072E, 16000L);
                    case "application/cea-708":
                        return new C7666c(c7629w0.f37072E, c7629w0.f37088o);
                    case "application/x-subrip":
                        return new C8800a();
                    case "application/ttml+xml":
                        return new C9309c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    /* renamed from: a */
    boolean mo31887a(C7629w0 c7629w0);

    /* renamed from: b */
    InterfaceC6924f mo31888b(C7629w0 c7629w0);
}

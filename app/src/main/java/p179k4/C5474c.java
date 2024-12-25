package p179k4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import p396x3.InterfaceC9648e;
import p435z3.InterfaceC10048l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:k4/c.class
 */
/* renamed from: k4.c */
/* loaded from: combined.jar:classes1.jar:k4/c.class */
public class C5474c<T> implements InterfaceC9648e<File, T> {

    /* renamed from: c */
    public static final a f31283c = new a();

    /* renamed from: a */
    public InterfaceC9648e<InputStream, T> f31284a;

    /* renamed from: b */
    public final a f31285b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:k4/c$a.class
     */
    /* renamed from: k4.c$a */
    /* loaded from: combined.jar:classes1.jar:k4/c$a.class */
    public static class a {
        /* renamed from: a */
        public InputStream m27277a(File file) {
            return new FileInputStream(file);
        }
    }

    public C5474c(InterfaceC9648e<InputStream, T> interfaceC9648e) {
        this(interfaceC9648e, f31283c);
    }

    public C5474c(InterfaceC9648e<InputStream, T> interfaceC9648e, a aVar) {
        this.f31284a = interfaceC9648e;
        this.f31285b = aVar;
    }

    @Override // p396x3.InterfaceC9648e
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC10048l<T> mo25843a(File file, int i10, int i11) {
        InputStream inputStream = null;
        try {
            InputStream m27277a = this.f31285b.m27277a(file);
            inputStream = m27277a;
            InterfaceC10048l<T> mo25843a = this.f31284a.mo25843a(m27277a, i10, i11);
            if (m27277a != null) {
                try {
                    m27277a.close();
                } catch (IOException e10) {
                }
            }
            return mo25843a;
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e11) {
                }
            }
            throw th2;
        }
    }

    @Override // p396x3.InterfaceC9648e
    public String getId() {
        return "";
    }
}

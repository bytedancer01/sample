package p223n2;

import android.net.Uri;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import p071e2.C4574c;
import p071e2.C4591t;
import p071e2.EnumC4572a;
import p071e2.EnumC4583l;
import p071e2.EnumC4586o;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:n2/v.class
 */
/* renamed from: n2.v */
/* loaded from: combined.jar:classes1.jar:n2/v.class */
public class C6642v {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:n2/v$a.class
     */
    /* renamed from: n2.v$a */
    /* loaded from: combined.jar:classes1.jar:n2/v$a.class */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final int[] f34623a;

        /* renamed from: b */
        public static final int[] f34624b;

        /* renamed from: c */
        public static final int[] f34625c;

        /* renamed from: d */
        public static final int[] f34626d;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:74:0x00ef
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                Method dump skipped, instructions count: 263
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p223n2.C6642v.a.m45088clinit():void");
        }
    }

    /* renamed from: a */
    public static int m30618a(EnumC4572a enumC4572a) {
        int i10 = a.f34624b[enumC4572a.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + enumC4572a + " to int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0087 -> B:21:0x008b). Please report as a decompilation issue!!! */
    /* renamed from: b */
    public static C4574c m30619b(byte[] bArr) {
        ObjectInputStream objectInputStream;
        C4574c c4574c = new C4574c();
        if (bArr == null) {
            return c4574c;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                } catch (IOException e10) {
                    e = e10;
                    objectInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    bArr = null;
                    if (bArr != null) {
                        try {
                            bArr.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                    }
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                    throw th;
                }
                try {
                    for (int readInt = objectInputStream.readInt(); readInt > 0; readInt--) {
                        c4574c.m23108a(Uri.parse(objectInputStream.readUTF()), objectInputStream.readBoolean());
                    }
                    try {
                        objectInputStream.close();
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                    byteArrayInputStream.close();
                } catch (IOException e14) {
                    e = e14;
                    e.printStackTrace();
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e15) {
                            e15.printStackTrace();
                        }
                    }
                    byteArrayInputStream.close();
                    return c4574c;
                }
            } catch (IOException e16) {
                e16.printStackTrace();
            }
            return c4574c;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x00ae -> B:22:0x00b2). Please report as a decompilation issue!!! */
    /* renamed from: c */
    public static byte[] m30620c(C4574c c4574c) {
        ObjectOutputStream objectOutputStream;
        if (c4574c.m23110c() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
        } catch (IOException e10) {
            e10.printStackTrace();
            objectOutputStream2 = objectOutputStream2;
        }
        try {
            try {
                ObjectOutputStream objectOutputStream3 = null;
                ObjectOutputStream objectOutputStream4 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream4.writeInt(c4574c.m23110c());
                    for (C4574c.a aVar : c4574c.m23109b()) {
                        objectOutputStream4.writeUTF(aVar.m23111a().toString());
                        objectOutputStream4.writeBoolean(aVar.m23112b());
                        objectOutputStream3 = aVar;
                    }
                    try {
                        objectOutputStream4.close();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                    byteArrayOutputStream.close();
                    objectOutputStream2 = objectOutputStream3;
                } catch (IOException e12) {
                    objectOutputStream = objectOutputStream4;
                    e = e12;
                    objectOutputStream2 = objectOutputStream;
                    e.printStackTrace();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e13) {
                            e13.printStackTrace();
                        }
                    }
                    byteArrayOutputStream.close();
                    return byteArrayOutputStream.toByteArray();
                } catch (Throwable th2) {
                    th = th2;
                    objectOutputStream2 = objectOutputStream4;
                    if (objectOutputStream2 != false) {
                        try {
                            objectOutputStream2.close();
                        } catch (IOException e14) {
                            e14.printStackTrace();
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e15) {
                        e15.printStackTrace();
                    }
                    throw th;
                }
            } catch (IOException e16) {
                e = e16;
                objectOutputStream = null;
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: d */
    public static EnumC4572a m30621d(int i10) {
        if (i10 == 0) {
            return EnumC4572a.EXPONENTIAL;
        }
        if (i10 == 1) {
            return EnumC4572a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to BackoffPolicy");
    }

    /* renamed from: e */
    public static EnumC4583l m30622e(int i10) {
        if (i10 == 0) {
            return EnumC4583l.NOT_REQUIRED;
        }
        if (i10 == 1) {
            return EnumC4583l.CONNECTED;
        }
        if (i10 == 2) {
            return EnumC4583l.UNMETERED;
        }
        if (i10 == 3) {
            return EnumC4583l.NOT_ROAMING;
        }
        if (i10 == 4) {
            return EnumC4583l.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i10 == 5) {
            return EnumC4583l.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to NetworkType");
    }

    /* renamed from: f */
    public static EnumC4586o m30623f(int i10) {
        if (i10 == 0) {
            return EnumC4586o.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i10 == 1) {
            return EnumC4586o.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to OutOfQuotaPolicy");
    }

    /* renamed from: g */
    public static C4591t.a m30624g(int i10) {
        if (i10 == 0) {
            return C4591t.a.ENQUEUED;
        }
        if (i10 == 1) {
            return C4591t.a.RUNNING;
        }
        if (i10 == 2) {
            return C4591t.a.SUCCEEDED;
        }
        if (i10 == 3) {
            return C4591t.a.FAILED;
        }
        if (i10 == 4) {
            return C4591t.a.BLOCKED;
        }
        if (i10 == 5) {
            return C4591t.a.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to State");
    }

    /* renamed from: h */
    public static int m30625h(EnumC4583l enumC4583l) {
        int i10 = a.f34625c[enumC4583l.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && enumC4583l == EnumC4583l.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + enumC4583l + " to int");
    }

    /* renamed from: i */
    public static int m30626i(EnumC4586o enumC4586o) {
        int i10 = a.f34626d[enumC4586o.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + enumC4586o + " to int");
    }

    /* renamed from: j */
    public static int m30627j(C4591t.a aVar) {
        switch (a.f34623a[aVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + aVar + " to int");
        }
    }
}

package bj;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import bj.C0915c;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: bj.a */
/* loaded from: combined.jar:classes3.jar:bj/a.class */
public class C0913a implements C0915c.a {

    /* renamed from: bj.a$a */
    /* loaded from: combined.jar:classes3.jar:bj/a$a.class */
    public static class a {

        /* renamed from: a */
        public ZipFile f6063a;

        /* renamed from: b */
        public ZipEntry f6064b;

        public a(ZipFile zipFile, ZipEntry zipEntry) {
            this.f6063a = zipFile;
            this.f6064b = zipEntry;
        }
    }

    @Override // bj.C0915c.a
    /* renamed from: a */
    public void mo5601a(Context context, String[] strArr, String str, File file, C0916d c0916d) {
        a aVar;
        a m5604d;
        String[] strArr2;
        Closeable closeable;
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        long m5603c;
        try {
            m5604d = m5604d(context, strArr, str, c0916d);
        } catch (Throwable th2) {
            th = th2;
            aVar = null;
        }
        try {
            if (m5604d == null) {
                try {
                    strArr2 = m5605e(context, str);
                } catch (Exception e10) {
                    strArr2 = new String[]{e10.toString()};
                }
                throw new C0914b(str, strArr, strArr2);
            }
            for (int i10 = 0; i10 < 5; i10++) {
                c0916d.m5624i("Found %s! Extracting...", str);
                try {
                    if (file.exists() || file.createNewFile()) {
                        try {
                            inputStream = m5604d.f6063a.getInputStream(m5604d.f6064b);
                            try {
                                fileOutputStream = new FileOutputStream(file);
                                try {
                                    m5603c = m5603c(inputStream, fileOutputStream);
                                    fileOutputStream.getFD().sync();
                                } catch (FileNotFoundException e11) {
                                    m5602b(inputStream);
                                    m5602b(fileOutputStream);
                                } catch (IOException e12) {
                                    m5602b(inputStream);
                                    m5602b(fileOutputStream);
                                } catch (Throwable th3) {
                                    closeable = fileOutputStream;
                                    th = th3;
                                    m5602b(inputStream);
                                    m5602b(closeable);
                                    throw th;
                                }
                            } catch (FileNotFoundException e13) {
                                fileOutputStream = null;
                            } catch (IOException e14) {
                                fileOutputStream = null;
                            } catch (Throwable th4) {
                                th = th4;
                                closeable = null;
                            }
                        } catch (FileNotFoundException e15) {
                            inputStream = null;
                            fileOutputStream = null;
                        } catch (IOException e16) {
                            inputStream = null;
                            fileOutputStream = null;
                        } catch (Throwable th5) {
                            th = th5;
                            closeable = null;
                            inputStream = null;
                        }
                        if (m5603c == file.length()) {
                            m5602b(inputStream);
                            m5602b(fileOutputStream);
                            file.setReadable(true, false);
                            file.setExecutable(true, false);
                            file.setWritable(true);
                            try {
                                ZipFile zipFile = m5604d.f6063a;
                                if (zipFile != null) {
                                    zipFile.close();
                                    return;
                                }
                                return;
                            } catch (IOException e17) {
                                return;
                            }
                        }
                        m5602b(inputStream);
                        m5602b(fileOutputStream);
                    }
                } catch (IOException e18) {
                }
            }
            c0916d.m5623h("FATAL! Couldn't extract the library from the APK!");
            try {
                ZipFile zipFile2 = m5604d.f6063a;
                if (zipFile2 != null) {
                    zipFile2.close();
                }
            } catch (IOException e19) {
            }
        } catch (Throwable th6) {
            th = th6;
            aVar = m5604d;
            if (aVar != null) {
                try {
                    ZipFile zipFile3 = aVar.f6063a;
                    if (zipFile3 != null) {
                        zipFile3.close();
                    }
                } catch (IOException e20) {
                }
            }
            throw th;
        }
    }

    /* renamed from: b */
    public final void m5602b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
            }
        }
    }

    /* renamed from: c */
    public final long m5603c(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        long j10 = 0;
        while (true) {
            long j11 = j10;
            int read = inputStream.read(bArr);
            if (read == -1) {
                outputStream.flush();
                return j11;
            }
            outputStream.write(bArr, 0, read);
            j10 = j11 + read;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:34:0x00ec
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* renamed from: d */
    public final bj.C0913a.a m5604d(android.content.Context r8, java.lang.String[] r9, java.lang.String r10, bj.C0916d r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bj.C0913a.m5604d(android.content.Context, java.lang.String[], java.lang.String, bj.d):bj.a$a");
    }

    /* renamed from: e */
    public final String[] m5605e(Context context, String str) {
        Pattern compile = Pattern.compile("lib" + File.separatorChar + "([^\\" + File.separatorChar + "]*)" + File.separatorChar + str);
        HashSet hashSet = new HashSet();
        String[] m5606f = m5606f(context);
        int length = m5606f.length;
        for (int i10 = 0; i10 < length; i10++) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(m5606f[i10]), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(entries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException e10) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    /* renamed from: f */
    public final String[] m5606f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }
}

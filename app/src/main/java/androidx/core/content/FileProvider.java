package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.cookie.ClientCookie;
import org.xmlpull.v1.XmlPullParserException;
import p050d0.C4290b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/core/content/FileProvider.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/core/content/FileProvider.class */
public class FileProvider extends ContentProvider {

    /* renamed from: c */
    public static final String[] f2652c = {"_display_name", "_size"};

    /* renamed from: d */
    public static final File f2653d = new File("/");

    /* renamed from: e */
    public static HashMap<String, InterfaceC0389a> f2654e = new HashMap<>();

    /* renamed from: b */
    public InterfaceC0389a f2655b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/core/content/FileProvider$a.class
     */
    /* renamed from: androidx.core.content.FileProvider$a */
    /* loaded from: combined.jar:classes1.jar:androidx/core/content/FileProvider$a.class */
    public interface InterfaceC0389a {
        /* renamed from: a */
        Uri mo1877a(File file);

        /* renamed from: b */
        File mo1878b(Uri uri);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/core/content/FileProvider$b.class
     */
    /* renamed from: androidx.core.content.FileProvider$b */
    /* loaded from: combined.jar:classes1.jar:androidx/core/content/FileProvider$b.class */
    public static class C0390b implements InterfaceC0389a {

        /* renamed from: a */
        public final String f2656a;

        /* renamed from: b */
        public final HashMap<String, File> f2657b = new HashMap<>();

        public C0390b(String str) {
            this.f2656a = str;
        }

        @Override // androidx.core.content.FileProvider.InterfaceC0389a
        /* renamed from: a */
        public Uri mo1877a(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.f2657b.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
                }
                String path2 = entry.getValue().getPath();
                boolean endsWith = path2.endsWith("/");
                int length = path2.length();
                if (!endsWith) {
                    length++;
                }
                return new Uri.Builder().scheme("content").authority(this.f2656a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(canonicalPath.substring(length), "/")).build();
            } catch (IOException e10) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        @Override // androidx.core.content.FileProvider.InterfaceC0389a
        /* renamed from: b */
        public File mo1878b(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.f2657b.get(decode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (canonicalFile.getPath().startsWith(file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException e10) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        /* renamed from: c */
        public void m1879c(String str, File file) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.f2657b.put(str, file.getCanonicalFile());
            } catch (IOException e10) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e10);
            }
        }
    }

    /* renamed from: a */
    public static File m1870a(File file, String... strArr) {
        int length = strArr.length;
        int i10 = 0;
        while (i10 < length) {
            String str = strArr[i10];
            File file2 = file;
            if (str != null) {
                file2 = new File(file, str);
            }
            i10++;
            file = file2;
        }
        return file;
    }

    /* renamed from: b */
    public static Object[] m1871b(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[i10];
        System.arraycopy(objArr, 0, objArr2, 0, i10);
        return objArr2;
    }

    /* renamed from: c */
    public static String[] m1872c(String[] strArr, int i10) {
        String[] strArr2 = new String[i10];
        System.arraycopy(strArr, 0, strArr2, 0, i10);
        return strArr2;
    }

    /* renamed from: d */
    public static InterfaceC0389a m1873d(Context context, String str) {
        InterfaceC0389a interfaceC0389a;
        synchronized (f2654e) {
            InterfaceC0389a interfaceC0389a2 = f2654e.get(str);
            interfaceC0389a = interfaceC0389a2;
            if (interfaceC0389a2 == null) {
                try {
                    interfaceC0389a = m1876g(context, str);
                    f2654e.put(str, interfaceC0389a);
                } catch (IOException e10) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e10);
                } catch (XmlPullParserException e11) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e11);
                }
            }
        }
        return interfaceC0389a;
    }

    /* renamed from: e */
    public static Uri m1874e(Context context, String str, File file) {
        return m1873d(context, str).mo1877a(file);
    }

    /* renamed from: f */
    public static int m1875f(String str) {
        int i10;
        if ("r".equals(str)) {
            i10 = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i10 = 738197504;
        } else if ("wa".equals(str)) {
            i10 = 704643072;
        } else if ("rw".equals(str)) {
            i10 = 939524096;
        } else {
            if (!"rwt".equals(str)) {
                throw new IllegalArgumentException("Invalid mode: " + str);
            }
            i10 = 1006632960;
        }
        return i10;
    }

    /* renamed from: g */
    public static InterfaceC0389a m1876g(Context context, String str) {
        File file;
        C0390b c0390b = new C0390b(str);
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (resolveContentProvider == null) {
            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
        }
        XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (loadXmlMetaData == null) {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        while (true) {
            int next = loadXmlMetaData.next();
            if (next == 1) {
                return c0390b;
            }
            if (next == 2) {
                String name = loadXmlMetaData.getName();
                String attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                String attributeValue2 = loadXmlMetaData.getAttributeValue(null, ClientCookie.PATH_ATTR);
                if ("root-path".equals(name)) {
                    file = f2653d;
                } else if ("files-path".equals(name)) {
                    file = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    file = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] m21728g = C4290b.m21728g(context, null);
                    file = null;
                    if (m21728g.length > 0) {
                        file = m21728g[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] m21727f = C4290b.m21727f(context);
                    file = null;
                    if (m21727f.length > 0) {
                        file = m21727f[0];
                    }
                } else {
                    file = null;
                    if ("external-media-path".equals(name)) {
                        File[] externalMediaDirs = context.getExternalMediaDirs();
                        file = null;
                        if (externalMediaDirs.length > 0) {
                            file = externalMediaDirs[0];
                        }
                    }
                }
                if (file != null) {
                    c0390b.m1879c(attributeValue, m1870a(file, attributeValue2));
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        this.f2655b = m1873d(context, providerInfo.authority.split(";")[0]);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return this.f2655b.mo1878b(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File mo1878b = this.f2655b.mo1878b(uri);
        int lastIndexOf = mo1878b.getName().lastIndexOf(46);
        if (lastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(mo1878b.getName().substring(lastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return ParcelFileDescriptor.open(this.f2655b.mo1878b(uri), m1875f(str));
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i10;
        int i11;
        File mo1878b = this.f2655b.mo1878b(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        String[] strArr3 = strArr;
        if (strArr == null) {
            strArr3 = f2652c;
        }
        String[] strArr4 = new String[strArr3.length];
        Object[] objArr = new Object[strArr3.length];
        int length = strArr3.length;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = i13;
            if (i12 >= length) {
                String[] m1872c = m1872c(strArr4, i14);
                Object[] m1871b = m1871b(objArr, i14);
                MatrixCursor matrixCursor = new MatrixCursor(m1872c, 1);
                matrixCursor.addRow(m1871b);
                return matrixCursor;
            }
            String str3 = strArr3[i12];
            if ("_display_name".equals(str3)) {
                strArr4[i14] = "_display_name";
                int i15 = i14 + 1;
                objArr[i14] = queryParameter == null ? mo1878b.getName() : queryParameter;
                i11 = i15;
            } else {
                i10 = i14;
                if ("_size".equals(str3)) {
                    strArr4[i14] = "_size";
                    objArr[i14] = Long.valueOf(mo1878b.length());
                    i11 = i14 + 1;
                } else {
                    i12++;
                    i13 = i10;
                }
            }
            i10 = i11;
            i12++;
            i13 = i10;
        }
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}

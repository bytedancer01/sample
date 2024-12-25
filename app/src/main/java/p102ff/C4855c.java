package p102ff;

import android.support.v4.media.session.PlaybackStateCompat;
import com.amazonaws.regions.ServiceAbbreviations;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import com.amazonaws.services.p045s3.util.Mimetypes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import org.apache.http.HttpHeaders;
import org.apache.http.protocol.HTTP;
import org.simpleframework.xml.strategy.Name;
import p102ff.AbstractC4854b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ff/c.class
 */
/* renamed from: ff.c */
/* loaded from: combined.jar:classes2.jar:ff/c.class */
public class C4855c extends AbstractC4854b {

    /* renamed from: j */
    public static final List<String> f28525j = new a();

    /* renamed from: k */
    public static final Map<String, String> f28526k = new b();

    /* renamed from: l */
    public static Map<String, InterfaceC4856d> f28527l = new HashMap();

    /* renamed from: h */
    public final List<File> f28528h;

    /* renamed from: i */
    public final boolean f28529i;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ff/c$a.class
     */
    /* renamed from: ff.c$a */
    /* loaded from: combined.jar:classes2.jar:ff/c$a.class */
    public class a extends ArrayList<String> {
        public a() {
            add("index.html");
            add("index.htm");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ff/c$b.class
     */
    /* renamed from: ff.c$b */
    /* loaded from: combined.jar:classes2.jar:ff/c$b.class */
    public class b extends HashMap<String, String> {
        public b() {
            put("css", "text/css");
            put("htm", Mimetypes.MIMETYPE_HTML);
            put("html", Mimetypes.MIMETYPE_HTML);
            put("xml", "text/xml");
            put("java", "text/x-java-source, text/java");
            put("md", HTTP.PLAIN_TEXT_TYPE);
            put("txt", HTTP.PLAIN_TEXT_TYPE);
            put("asc", HTTP.PLAIN_TEXT_TYPE);
            put("gif", "image/gif");
            put("jpg", "image/jpeg");
            put("jpeg", "image/jpeg");
            put("png", "image/png");
            put("mp3", "audio/mpeg");
            put("m3u", "audio/mpeg-url");
            put("mp4", "video/mp4");
            put("ogv", "video/ogg");
            put("flv", "video/x-flv");
            put("mov", "video/quicktime");
            put(ServiceAbbreviations.SimpleWorkflow, "application/x-shockwave-flash");
            put("js", "application/javascript");
            put("pdf", "application/pdf");
            put("doc", "application/msword");
            put("ogg", "application/x-ogg");
            put("zip", "application/octet-stream");
            put("exe", "application/octet-stream");
            put(Name.LABEL, "application/octet-stream");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ff/c$c.class
     */
    /* renamed from: ff.c$c */
    /* loaded from: combined.jar:classes2.jar:ff/c$c.class */
    public class c extends FileInputStream {

        /* renamed from: b */
        public final long f28530b;

        /* renamed from: c */
        public final C4855c f28531c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C4855c c4855c, File file, long j10) {
            super(file);
            this.f28531c = c4855c;
            this.f28530b = j10;
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public int available() {
            return (int) this.f28530b;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ff/c$d.class
     */
    /* renamed from: ff.c$d */
    /* loaded from: combined.jar:classes2.jar:ff/c$d.class */
    public class d implements FilenameFilter {

        /* renamed from: a */
        public final C4855c f28532a;

        public d(C4855c c4855c) {
            this.f28532a = c4855c;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return new File(file, str).isFile();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ff/c$e.class
     */
    /* renamed from: ff.c$e */
    /* loaded from: combined.jar:classes2.jar:ff/c$e.class */
    public class e implements FilenameFilter {

        /* renamed from: a */
        public final C4855c f28533a;

        public e(C4855c c4855c) {
            this.f28533a = c4855c;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return new File(file, str).isDirectory();
        }
    }

    public C4855c(String str, int i10, File file, boolean z10) {
        super(str, i10);
        this.f28529i = z10;
        ArrayList arrayList = new ArrayList();
        this.f28528h = arrayList;
        arrayList.add(file);
        m24706B();
    }

    /* renamed from: A */
    public final List<File> m24705A() {
        return this.f28528h;
    }

    /* renamed from: B */
    public void m24706B() {
    }

    /* renamed from: C */
    public String m24707C(String str, File file) {
        String str2;
        String substring;
        int lastIndexOf;
        String str3 = "Directory " + str;
        StringBuilder sb2 = new StringBuilder("<html><head><title>" + str3 + "</title><style><!--\nspan.dirname { font-weight: bold; }\nspan.filesize { font-size: 75%; }\n// -->\n</style></head><body><h1>" + str3 + "</h1>");
        String substring2 = (str.length() <= 1 || (lastIndexOf = (substring = str.substring(0, str.length() - 1)).lastIndexOf(47)) < 0 || lastIndexOf >= substring.length()) ? null : str.substring(0, lastIndexOf + 1);
        List<String> asList = Arrays.asList(file.list(new d(this)));
        Collections.sort(asList);
        List asList2 = Arrays.asList(file.list(new e(this)));
        Collections.sort(asList2);
        if (substring2 != null || asList2.size() + asList.size() > 0) {
            sb2.append("<ul>");
            if (substring2 != null || asList2.size() > 0) {
                sb2.append("<section class=\"directories\">");
                if (substring2 != null) {
                    sb2.append("<li><a rel=\"directory\" href=\"");
                    sb2.append(substring2);
                    sb2.append("\"><span class=\"dirname\">..</span></a></b></li>");
                }
                Iterator it = asList2.iterator();
                while (it.hasNext()) {
                    String str4 = ((String) it.next()) + "/";
                    sb2.append("<li><a rel=\"directory\" href=\"");
                    sb2.append(m24713u(str + str4));
                    sb2.append("\"><span class=\"dirname\">");
                    sb2.append(str4);
                    sb2.append("</span></a></b></li>");
                }
                sb2.append("</section>");
            }
            if (asList.size() > 0) {
                sb2.append("<section class=\"files\">");
                for (String str5 : asList) {
                    sb2.append("<li><a href=\"");
                    sb2.append(m24713u(str + str5));
                    sb2.append("\"><span class=\"filename\">");
                    sb2.append(str5);
                    sb2.append("</span></a>");
                    long length = new File(file, str5).length();
                    sb2.append("&nbsp;<span class=\"filesize\">(");
                    if (length < 1024) {
                        sb2.append(length);
                        str2 = " bytes";
                    } else if (length < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                        sb2.append(length / 1024);
                        sb2.append(InstructionFileId.DOT);
                        sb2.append(((length % 1024) / 10) % 100);
                        str2 = " KB";
                    } else {
                        sb2.append(length / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
                        sb2.append(InstructionFileId.DOT);
                        sb2.append(((length % PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) / 10) % 100);
                        str2 = " MB";
                    }
                    sb2.append(str2);
                    sb2.append(")</span></li>");
                }
                sb2.append("</section>");
            }
            sb2.append("</ul>");
        }
        sb2.append("</body></html>");
        return sb2.toString();
    }

    /* renamed from: D */
    public final AbstractC4854b.k m24708D(Map<String, String> map, AbstractC4854b.i iVar, String str) {
        AbstractC4854b.k m24709E;
        String replace = str.trim().replace(File.separatorChar, '/');
        boolean z10 = false;
        String str2 = replace;
        if (replace.indexOf(63) >= 0) {
            str2 = replace.substring(0, replace.indexOf(63));
        }
        if (str2.startsWith("src/main") || str2.endsWith("src/main") || str2.contains("../")) {
            return m24715w("Won't serve ../ for security reasons.");
        }
        File file = null;
        List<File> m24705A = m24705A();
        for (int i10 = 0; !z10 && i10 < m24705A.size(); i10++) {
            file = m24705A.get(i10);
            z10 = m24710r(str2, file);
        }
        if (!z10) {
            return m24718z();
        }
        File file2 = new File(file, str2);
        if (file2.isDirectory() && !str2.endsWith("/")) {
            String str3 = str2 + "/";
            AbstractC4854b.k m24712t = m24712t(AbstractC4854b.k.b.REDIRECT, Mimetypes.MIMETYPE_HTML, "<html><body>Redirected: <a href=\"" + str3 + "\">" + str3 + "</a></body></html>");
            m24712t.m24695a("Location", str3);
            return m24712t;
        }
        if (file2.isDirectory()) {
            String m24714v = m24714v(file2);
            if (m24714v == null) {
                return file2.canRead() ? m24712t(AbstractC4854b.k.b.OK, Mimetypes.MIMETYPE_HTML, m24707C(str2, file2)) : m24715w("No directory listing.");
            }
            return m24708D(map, iVar, str2 + m24714v);
        }
        String m24717y = m24717y(str2);
        InterfaceC4856d interfaceC4856d = f28527l.get(m24717y);
        if (interfaceC4856d != null) {
            AbstractC4854b.k m24720b = interfaceC4856d.m24720b(str2, map, iVar, file2, m24717y);
            m24709E = m24720b;
            if (m24720b != null) {
                m24709E = m24720b;
                if (m24720b instanceof C4853a) {
                    C4853a c4853a = (C4853a) m24720b;
                    return m24708D(c4853a.m24667i(), iVar, c4853a.m24668j());
                }
            }
        } else {
            m24709E = m24709E(str2, map, file2, m24717y);
        }
        if (m24709E == null) {
            m24709E = m24718z();
        }
        return m24709E;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01b5 A[Catch: IOException -> 0x0209, TRY_LEAVE, TryCatch #0 {IOException -> 0x0209, blocks: (B:2:0x0000, B:4:0x003c, B:8:0x0058, B:10:0x0063, B:14:0x007d, B:17:0x008c, B:19:0x00a5, B:25:0x00be, B:27:0x00ef, B:37:0x0122, B:38:0x01a4, B:40:0x01b5, B:41:0x01c5), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c5 A[Catch: IOException -> 0x0209, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x0209, blocks: (B:2:0x0000, B:4:0x003c, B:8:0x0058, B:10:0x0063, B:14:0x007d, B:17:0x008c, B:19:0x00a5, B:25:0x00be, B:27:0x00ef, B:37:0x0122, B:38:0x01a4, B:40:0x01b5, B:41:0x01c5), top: B:1:0x0000 }] */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p102ff.AbstractC4854b.k m24709E(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, java.io.File r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p102ff.C4855c.m24709E(java.lang.String, java.util.Map, java.io.File, java.lang.String):ff.b$k");
    }

    @Override // p102ff.AbstractC4854b
    /* renamed from: l */
    public AbstractC4854b.k mo24680l(AbstractC4854b.i iVar) {
        Map<String, String> headers = iVar.getHeaders();
        Map<String, String> mo24690a = iVar.mo24690a();
        String uri = iVar.getUri();
        if (!this.f28529i) {
            System.out.println(iVar.getMethod() + " '" + uri + "' ");
            for (String str : headers.keySet()) {
                System.out.println("  HDR: '" + str + "' = '" + headers.get(str) + "'");
            }
            for (String str2 : mo24690a.keySet()) {
                System.out.println("  PRM: '" + str2 + "' = '" + mo24690a.get(str2) + "'");
            }
        }
        for (File file : m24705A()) {
            if (!file.isDirectory()) {
                return m24716x("given path is not a directory (" + file + ").");
            }
        }
        return m24708D(Collections.unmodifiableMap(headers), iVar, uri);
    }

    /* renamed from: r */
    public final boolean m24710r(String str, File file) {
        boolean exists = new File(file, str).exists();
        boolean z10 = exists;
        if (!exists) {
            InterfaceC4856d interfaceC4856d = f28527l.get(m24717y(str));
            z10 = exists;
            if (interfaceC4856d != null) {
                z10 = interfaceC4856d.m24719a(str, file);
            }
        }
        return z10;
    }

    /* renamed from: s */
    public final AbstractC4854b.k m24711s(AbstractC4854b.k.b bVar, String str, InputStream inputStream) {
        AbstractC4854b.k kVar = new AbstractC4854b.k(bVar, str, inputStream);
        kVar.m24695a(HttpHeaders.ACCEPT_RANGES, "bytes");
        return kVar;
    }

    /* renamed from: t */
    public final AbstractC4854b.k m24712t(AbstractC4854b.k.b bVar, String str, String str2) {
        AbstractC4854b.k kVar = new AbstractC4854b.k(bVar, str, str2);
        kVar.m24695a(HttpHeaders.ACCEPT_RANGES, "bytes");
        return kVar;
    }

    /* renamed from: u */
    public final String m24713u(String str) {
        StringBuilder sb2;
        StringTokenizer stringTokenizer = new StringTokenizer(str, "/ ", true);
        String str2 = "";
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.equals("/")) {
                sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append("/");
            } else if (nextToken.equals(" ")) {
                sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append("%20");
            } else {
                try {
                    str2 = str2 + URLEncoder.encode(nextToken, "UTF-8");
                } catch (UnsupportedEncodingException e10) {
                }
            }
            str2 = sb2.toString();
        }
        return str2;
    }

    /* renamed from: v */
    public final String m24714v(File file) {
        for (String str : f28525j) {
            if (new File(file, str).exists()) {
                return str;
            }
        }
        return null;
    }

    /* renamed from: w */
    public AbstractC4854b.k m24715w(String str) {
        return m24712t(AbstractC4854b.k.b.FORBIDDEN, HTTP.PLAIN_TEXT_TYPE, "FORBIDDEN: " + str);
    }

    /* renamed from: x */
    public AbstractC4854b.k m24716x(String str) {
        return m24712t(AbstractC4854b.k.b.INTERNAL_ERROR, HTTP.PLAIN_TEXT_TYPE, "INTERNAL ERRROR: " + str);
    }

    /* renamed from: y */
    public final String m24717y(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        String str2 = lastIndexOf >= 0 ? f28526k.get(str.substring(lastIndexOf + 1).toLowerCase()) : null;
        String str3 = str2;
        if (str2 == null) {
            str3 = "application/octet-stream";
        }
        return str3;
    }

    /* renamed from: z */
    public AbstractC4854b.k m24718z() {
        return m24712t(AbstractC4854b.k.b.NOT_FOUND, HTTP.PLAIN_TEXT_TYPE, "Error 404, file not found.");
    }
}

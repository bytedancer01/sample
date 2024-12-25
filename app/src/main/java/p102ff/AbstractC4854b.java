package p102ff;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.PushbackInputStream;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TimeZone;
import org.apache.commons.net.SocketClient;
import org.apache.commons.net.tftp.TFTP;
import org.apache.http.HttpStatus;
import org.apache.http.cookie.InterfaceC7038SM;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.apache.http.protocol.HTTP;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ff/b.class
 */
/* renamed from: ff.b */
/* loaded from: combined.jar:classes2.jar:ff/b.class */
public abstract class AbstractC4854b {

    /* renamed from: a */
    public final String f28484a;

    /* renamed from: b */
    public final int f28485b;

    /* renamed from: c */
    public ServerSocket f28486c;

    /* renamed from: d */
    public final Set<Socket> f28487d = new HashSet();

    /* renamed from: e */
    public Thread f28488e;

    /* renamed from: f */
    public b f28489f;

    /* renamed from: g */
    public o f28490g;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ff/b$a.class
     */
    /* renamed from: ff.b$a */
    /* loaded from: combined.jar:classes2.jar:ff/b$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final AbstractC4854b f28491b;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:ff/b$a$a.class
         */
        /* renamed from: ff.b$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes2.jar:ff/b$a$a.class */
        public class RunnableC10294a implements Runnable {

            /* renamed from: b */
            public final Socket f28492b;

            /* renamed from: c */
            public final InputStream f28493c;

            /* renamed from: d */
            public final a f28494d;

            public RunnableC10294a(a aVar, Socket socket, InputStream inputStream) {
                this.f28494d = aVar;
                this.f28492b = socket;
                this.f28493c = inputStream;
            }

            /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
            
                if ("NanoHttpd Shutdown".equals(r10.getMessage()) == false) goto L27;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 209
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p102ff.AbstractC4854b.a.RunnableC10294a.run():void");
            }
        }

        public a(AbstractC4854b abstractC4854b) {
            this.f28491b = abstractC4854b;
        }

        @Override // java.lang.Runnable
        public void run() {
            do {
                try {
                    Socket accept = this.f28491b.f28486c.accept();
                    this.f28491b.m24679h(accept);
                    accept.setSoTimeout(TFTP.DEFAULT_TIMEOUT);
                    this.f28491b.f28489f.mo24686a(new RunnableC10294a(this, accept, accept.getInputStream()));
                } catch (IOException e10) {
                }
            } while (!this.f28491b.f28486c.isClosed());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ff/b$b.class
     */
    /* renamed from: ff.b$b */
    /* loaded from: combined.jar:classes2.jar:ff/b$b.class */
    public interface b {
        /* renamed from: a */
        void mo24686a(Runnable runnable);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ff/b$c.class
     */
    /* renamed from: ff.b$c */
    /* loaded from: combined.jar:classes2.jar:ff/b$c.class */
    public static class c {

        /* renamed from: a */
        public final String f28495a;

        /* renamed from: b */
        public final String f28496b;

        /* renamed from: c */
        public final String f28497c;

        /* renamed from: a */
        public String m24687a() {
            return String.format("%s=%s; expires=%s", this.f28495a, this.f28496b, this.f28497c);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ff/b$d.class
     */
    /* renamed from: ff.b$d */
    /* loaded from: combined.jar:classes2.jar:ff/b$d.class */
    public class d implements Iterable<String> {

        /* renamed from: b */
        public final HashMap<String, String> f28498b = new HashMap<>();

        /* renamed from: c */
        public final ArrayList<c> f28499c = new ArrayList<>();

        /* renamed from: d */
        public final AbstractC4854b f28500d;

        public d(AbstractC4854b abstractC4854b, Map<String, String> map) {
            this.f28500d = abstractC4854b;
            String str = map.get("cookie");
            if (str != null) {
                for (String str2 : str.split(";")) {
                    String[] split = str2.trim().split("=");
                    if (split.length == 2) {
                        this.f28498b.put(split[0], split[1]);
                    }
                }
            }
        }

        /* renamed from: a */
        public void m24688a(k kVar) {
            Iterator<c> it = this.f28499c.iterator();
            while (it.hasNext()) {
                kVar.m24695a(InterfaceC7038SM.SET_COOKIE, it.next().m24687a());
            }
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return this.f28498b.keySet().iterator();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ff/b$e.class
     */
    /* renamed from: ff.b$e */
    /* loaded from: combined.jar:classes2.jar:ff/b$e.class */
    public static class e implements b {

        /* renamed from: a */
        public long f28501a;

        @Override // p102ff.AbstractC4854b.b
        /* renamed from: a */
        public void mo24686a(Runnable runnable) {
            this.f28501a++;
            Thread thread = new Thread(runnable);
            thread.setDaemon(true);
            thread.setName("NanoHttpd Request Processor (#" + this.f28501a + ")");
            thread.start();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ff/b$f.class
     */
    /* renamed from: ff.b$f */
    /* loaded from: combined.jar:classes2.jar:ff/b$f.class */
    public static class f implements n {

        /* renamed from: a */
        public final String f28502a = System.getProperty("java.io.tmpdir");

        /* renamed from: b */
        public final List<m> f28503b = new ArrayList();

        @Override // p102ff.AbstractC4854b.n
        public void clear() {
            Iterator<m> it = this.f28503b.iterator();
            while (it.hasNext()) {
                try {
                    it.next().m24704a();
                } catch (Exception e10) {
                }
            }
            this.f28503b.clear();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ff/b$g.class
     */
    /* renamed from: ff.b$g */
    /* loaded from: combined.jar:classes2.jar:ff/b$g.class */
    public class g implements o {

        /* renamed from: a */
        public final AbstractC4854b f28504a;

        public g(AbstractC4854b abstractC4854b) {
            this.f28504a = abstractC4854b;
        }

        public /* synthetic */ g(AbstractC4854b abstractC4854b, a aVar) {
            this(abstractC4854b);
        }

        @Override // p102ff.AbstractC4854b.o
        /* renamed from: a */
        public n mo24689a() {
            return new f();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ff/b$h.class
     */
    /* renamed from: ff.b$h */
    /* loaded from: combined.jar:classes2.jar:ff/b$h.class */
    public class h implements i {

        /* renamed from: a */
        public final n f28505a;

        /* renamed from: b */
        public final OutputStream f28506b;

        /* renamed from: c */
        public final PushbackInputStream f28507c;

        /* renamed from: d */
        public int f28508d;

        /* renamed from: e */
        public int f28509e;

        /* renamed from: f */
        public String f28510f;

        /* renamed from: g */
        public j f28511g;

        /* renamed from: h */
        public Map<String, String> f28512h;

        /* renamed from: i */
        public Map<String, String> f28513i;

        /* renamed from: j */
        public d f28514j;

        /* renamed from: k */
        public String f28515k;

        /* renamed from: l */
        public final AbstractC4854b f28516l;

        public h(AbstractC4854b abstractC4854b, n nVar, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
            this.f28516l = abstractC4854b;
            this.f28505a = nVar;
            this.f28507c = new PushbackInputStream(inputStream, NTLMEngineImpl.FLAG_WORKSTATION_PRESENT);
            this.f28506b = outputStream;
            String str = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "127.0.0.1" : inetAddress.getHostAddress().toString();
            HashMap hashMap = new HashMap();
            this.f28513i = hashMap;
            hashMap.put("remote-addr", str);
            this.f28513i.put("http-client-ip", str);
        }

        @Override // p102ff.AbstractC4854b.i
        /* renamed from: a */
        public final Map<String, String> mo24690a() {
            return this.f28512h;
        }

        /* renamed from: b */
        public final void m24691b(BufferedReader bufferedReader, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
            AbstractC4854b abstractC4854b;
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(readLine);
                if (!stringTokenizer.hasMoreTokens()) {
                    throw new l(k.b.BAD_REQUEST, "BAD REQUEST: Syntax error. Usage: GET /example/file.html");
                }
                map.put("method", stringTokenizer.nextToken());
                if (!stringTokenizer.hasMoreTokens()) {
                    throw new l(k.b.BAD_REQUEST, "BAD REQUEST: Missing URI. Usage: GET /example/file.html");
                }
                String nextToken = stringTokenizer.nextToken();
                int indexOf = nextToken.indexOf(63);
                if (indexOf >= 0) {
                    m24692c(nextToken.substring(indexOf + 1), map2);
                    abstractC4854b = this.f28516l;
                    nextToken = nextToken.substring(0, indexOf);
                } else {
                    abstractC4854b = this.f28516l;
                }
                String m24678g = abstractC4854b.m24678g(nextToken);
                if (stringTokenizer.hasMoreTokens()) {
                    while (true) {
                        String readLine2 = bufferedReader.readLine();
                        if (readLine2 == null || readLine2.trim().length() <= 0) {
                            break;
                        }
                        int indexOf2 = readLine2.indexOf(58);
                        if (indexOf2 >= 0) {
                            map3.put(readLine2.substring(0, indexOf2).trim().toLowerCase(Locale.US), readLine2.substring(indexOf2 + 1).trim());
                        }
                    }
                }
                map.put("uri", m24678g);
            } catch (IOException e10) {
                throw new l(k.b.INTERNAL_ERROR, "SERVER INTERNAL ERROR: IOException: " + e10.getMessage(), e10);
            }
        }

        /* renamed from: c */
        public final void m24692c(String str, Map<String, String> map) {
            if (str == null) {
                this.f28515k = "";
                return;
            }
            this.f28515k = str;
            StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                int indexOf = nextToken.indexOf(61);
                if (indexOf >= 0) {
                    map.put(this.f28516l.m24678g(nextToken.substring(0, indexOf)).trim(), this.f28516l.m24678g(nextToken.substring(indexOf + 1)));
                } else {
                    map.put(this.f28516l.m24678g(nextToken).trim(), "");
                }
            }
        }

        /* renamed from: d */
        public void m24693d() {
            OutputStream outputStream;
            byte[] bArr;
            try {
                try {
                    try {
                        bArr = new byte[NTLMEngineImpl.FLAG_WORKSTATION_PRESENT];
                        this.f28508d = 0;
                        this.f28509e = 0;
                    } catch (l e10) {
                        new k(e10.m24703a(), HTTP.PLAIN_TEXT_TYPE, e10.getMessage()).m24697c(this.f28506b);
                        outputStream = this.f28506b;
                        AbstractC4854b.m24674i(outputStream);
                    } catch (SocketException e11) {
                        throw e11;
                    }
                } catch (SocketTimeoutException e12) {
                    throw e12;
                } catch (IOException e13) {
                    new k(k.b.INTERNAL_ERROR, HTTP.PLAIN_TEXT_TYPE, "SERVER INTERNAL ERROR: IOException: " + e13.getMessage()).m24697c(this.f28506b);
                    outputStream = this.f28506b;
                    AbstractC4854b.m24674i(outputStream);
                }
                try {
                    int read = this.f28507c.read(bArr, 0, NTLMEngineImpl.FLAG_WORKSTATION_PRESENT);
                    if (read == -1) {
                        AbstractC4854b.m24674i(this.f28507c);
                        AbstractC4854b.m24674i(this.f28506b);
                        throw new SocketException("NanoHttpd Shutdown");
                    }
                    while (read > 0) {
                        int i10 = this.f28509e + read;
                        this.f28509e = i10;
                        int m24694e = m24694e(bArr, i10);
                        this.f28508d = m24694e;
                        if (m24694e > 0) {
                            break;
                        }
                        PushbackInputStream pushbackInputStream = this.f28507c;
                        int i11 = this.f28509e;
                        read = pushbackInputStream.read(bArr, i11, NTLMEngineImpl.FLAG_WORKSTATION_PRESENT - i11);
                    }
                    int i12 = this.f28508d;
                    int i13 = this.f28509e;
                    if (i12 < i13) {
                        this.f28507c.unread(bArr, i12, i13 - i12);
                    }
                    this.f28512h = new HashMap();
                    if (this.f28513i == null) {
                        this.f28513i = new HashMap();
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.f28509e)));
                    HashMap hashMap = new HashMap();
                    m24691b(bufferedReader, hashMap, this.f28512h, this.f28513i);
                    j lookup = j.lookup(hashMap.get("method"));
                    this.f28511g = lookup;
                    if (lookup == null) {
                        throw new l(k.b.BAD_REQUEST, "BAD REQUEST: Syntax error.");
                    }
                    this.f28510f = hashMap.get("uri");
                    this.f28514j = new d(this.f28516l, this.f28513i);
                    k mo24680l = this.f28516l.mo24680l(this);
                    if (mo24680l == null) {
                        throw new l(k.b.INTERNAL_ERROR, "SERVER INTERNAL ERROR: Serve() returned a null response.");
                    }
                    this.f28514j.m24688a(mo24680l);
                    mo24680l.m24702h(this.f28511g);
                    mo24680l.m24697c(this.f28506b);
                } catch (Exception e14) {
                    AbstractC4854b.m24674i(this.f28507c);
                    AbstractC4854b.m24674i(this.f28506b);
                    throw new SocketException("NanoHttpd Shutdown");
                }
            } finally {
                this.f28505a.clear();
            }
        }

        /* renamed from: e */
        public final int m24694e(byte[] bArr, int i10) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 3;
                if (i12 >= i10) {
                    return 0;
                }
                if (bArr[i11] == 13 && bArr[i11 + 1] == 10 && bArr[i11 + 2] == 13 && bArr[i12] == 10) {
                    return i11 + 4;
                }
                i11++;
            }
        }

        @Override // p102ff.AbstractC4854b.i
        public final Map<String, String> getHeaders() {
            return this.f28513i;
        }

        @Override // p102ff.AbstractC4854b.i
        public final j getMethod() {
            return this.f28511g;
        }

        @Override // p102ff.AbstractC4854b.i
        public final String getUri() {
            return this.f28510f;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ff/b$i.class
     */
    /* renamed from: ff.b$i */
    /* loaded from: combined.jar:classes2.jar:ff/b$i.class */
    public interface i {
        /* renamed from: a */
        Map<String, String> mo24690a();

        Map<String, String> getHeaders();

        j getMethod();

        String getUri();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ff/b$j.class
     */
    /* renamed from: ff.b$j */
    /* loaded from: combined.jar:classes2.jar:ff/b$j.class */
    public enum j {
        GET,
        PUT,
        POST,
        DELETE,
        HEAD,
        OPTIONS;

        public static j lookup(String str) {
            for (j jVar : values()) {
                if (jVar.toString().equalsIgnoreCase(str)) {
                    return jVar;
                }
            }
            return null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ff/b$k.class
     */
    /* renamed from: ff.b$k */
    /* loaded from: combined.jar:classes2.jar:ff/b$k.class */
    public static class k {

        /* renamed from: a */
        public a f28517a;

        /* renamed from: b */
        public String f28518b;

        /* renamed from: c */
        public InputStream f28519c;

        /* renamed from: d */
        public final Map<String, String> f28520d = new HashMap();

        /* renamed from: e */
        public j f28521e;

        /* renamed from: f */
        public boolean f28522f;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:ff/b$k$a.class
         */
        /* renamed from: ff.b$k$a */
        /* loaded from: combined.jar:classes2.jar:ff/b$k$a.class */
        public interface a {
            String getDescription();
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:ff/b$k$b.class
         */
        /* renamed from: ff.b$k$b */
        /* loaded from: combined.jar:classes2.jar:ff/b$k$b.class */
        public enum b implements a {
            SWITCH_PROTOCOL(101, "Switching Protocols"),
            OK(200, "OK"),
            CREATED(201, "Created"),
            ACCEPTED(202, "Accepted"),
            NO_CONTENT(HttpStatus.SC_NO_CONTENT, "No Content"),
            PARTIAL_CONTENT(HttpStatus.SC_PARTIAL_CONTENT, "Partial Content"),
            REDIRECT(301, "Moved Permanently"),
            NOT_MODIFIED(HttpStatus.SC_NOT_MODIFIED, "Not Modified"),
            BAD_REQUEST(400, "Bad Request"),
            UNAUTHORIZED(HttpStatus.SC_UNAUTHORIZED, "Unauthorized"),
            FORBIDDEN(403, "Forbidden"),
            NOT_FOUND(404, "Not Found"),
            METHOD_NOT_ALLOWED(HttpStatus.SC_METHOD_NOT_ALLOWED, "Method Not Allowed"),
            RANGE_NOT_SATISFIABLE(HttpStatus.SC_REQUESTED_RANGE_NOT_SATISFIABLE, "Requested Range Not Satisfiable"),
            INTERNAL_ERROR(500, "Internal Server Error");

            private final String description;
            private final int requestStatus;

            b(int i10, String str) {
                this.requestStatus = i10;
                this.description = str;
            }

            @Override // p102ff.AbstractC4854b.k.a
            public String getDescription() {
                return "" + this.requestStatus + " " + this.description;
            }

            public int getRequestStatus() {
                return this.requestStatus;
            }
        }

        public k(a aVar, String str, InputStream inputStream) {
            this.f28517a = aVar;
            this.f28518b = str;
            this.f28519c = inputStream;
        }

        public k(a aVar, String str, String str2) {
            ByteArrayInputStream byteArrayInputStream;
            this.f28517a = aVar;
            this.f28518b = str;
            if (str2 != null) {
                try {
                    byteArrayInputStream = new ByteArrayInputStream(str2.getBytes("UTF-8"));
                } catch (UnsupportedEncodingException e10) {
                    e10.printStackTrace();
                    return;
                }
            } else {
                byteArrayInputStream = null;
            }
            this.f28519c = byteArrayInputStream;
        }

        /* renamed from: a */
        public void m24695a(String str, String str2) {
            this.f28520d.put(str, str2);
        }

        /* renamed from: b */
        public final boolean m24696b(Map<String, String> map, String str) {
            Iterator<String> it = map.keySet().iterator();
            boolean z10 = false;
            while (true) {
                boolean z11 = z10;
                if (!it.hasNext()) {
                    return z11;
                }
                z10 = z11 | it.next().equalsIgnoreCase(str);
            }
        }

        /* renamed from: c */
        public void m24697c(OutputStream outputStream) {
            String str = this.f28518b;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            try {
                if (this.f28517a == null) {
                    throw new Error("sendResponse(): Status can't be null.");
                }
                PrintWriter printWriter = new PrintWriter(outputStream);
                printWriter.print("HTTP/1.1 " + this.f28517a.getDescription() + " \r\n");
                if (str != null) {
                    printWriter.print("Content-Type: " + str + SocketClient.NETASCII_EOL);
                }
                Map<String, String> map = this.f28520d;
                if (map == null || map.get("Date") == null) {
                    printWriter.print("Date: " + simpleDateFormat.format(new Date()) + SocketClient.NETASCII_EOL);
                }
                Map<String, String> map2 = this.f28520d;
                if (map2 != null) {
                    for (String str2 : map2.keySet()) {
                        printWriter.print(str2 + ": " + this.f28520d.get(str2) + SocketClient.NETASCII_EOL);
                    }
                }
                m24700f(printWriter, this.f28520d);
                if (this.f28521e == j.HEAD || !this.f28522f) {
                    InputStream inputStream = this.f28519c;
                    int available = inputStream != null ? inputStream.available() : 0;
                    m24701g(printWriter, this.f28520d, available);
                    printWriter.print(SocketClient.NETASCII_EOL);
                    printWriter.flush();
                    m24699e(outputStream, available);
                } else {
                    m24698d(outputStream, printWriter);
                }
                outputStream.flush();
                AbstractC4854b.m24674i(this.f28519c);
            } catch (IOException e10) {
            }
        }

        /* renamed from: d */
        public final void m24698d(OutputStream outputStream, PrintWriter printWriter) {
            printWriter.print("Transfer-Encoding: chunked\r\n");
            printWriter.print(SocketClient.NETASCII_EOL);
            printWriter.flush();
            byte[] bytes = SocketClient.NETASCII_EOL.getBytes();
            byte[] bArr = new byte[262144];
            while (true) {
                int read = this.f28519c.read(bArr);
                if (read <= 0) {
                    outputStream.write(String.format("0\r\n\r\n", new Object[0]).getBytes());
                    return;
                } else {
                    outputStream.write(String.format("%x\r\n", Integer.valueOf(read)).getBytes());
                    outputStream.write(bArr, 0, read);
                    outputStream.write(bytes);
                }
            }
        }

        /* renamed from: e */
        public final void m24699e(OutputStream outputStream, int i10) {
            if (this.f28521e == j.HEAD || this.f28519c == null) {
                return;
            }
            byte[] bArr = new byte[262144];
            while (i10 > 0) {
                int read = this.f28519c.read(bArr, 0, i10 > 262144 ? 262144 : i10);
                if (read <= 0) {
                    return;
                }
                outputStream.write(bArr, 0, read);
                i10 -= read;
            }
        }

        /* renamed from: f */
        public void m24700f(PrintWriter printWriter, Map<String, String> map) {
            if (m24696b(map, "connection")) {
                return;
            }
            printWriter.print("Connection: keep-alive\r\n");
        }

        /* renamed from: g */
        public void m24701g(PrintWriter printWriter, Map<String, String> map, int i10) {
            if (m24696b(map, "content-length")) {
                return;
            }
            printWriter.print("Content-Length: " + i10 + SocketClient.NETASCII_EOL);
        }

        /* renamed from: h */
        public void m24702h(j jVar) {
            this.f28521e = jVar;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ff/b$l.class
     */
    /* renamed from: ff.b$l */
    /* loaded from: combined.jar:classes2.jar:ff/b$l.class */
    public static final class l extends Exception {

        /* renamed from: b */
        public final k.b f28524b;

        public l(k.b bVar, String str) {
            super(str);
            this.f28524b = bVar;
        }

        public l(k.b bVar, String str, Exception exc) {
            super(str, exc);
            this.f28524b = bVar;
        }

        /* renamed from: a */
        public k.b m24703a() {
            return this.f28524b;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ff/b$m.class
     */
    /* renamed from: ff.b$m */
    /* loaded from: combined.jar:classes2.jar:ff/b$m.class */
    public interface m {
        /* renamed from: a */
        void m24704a();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ff/b$n.class
     */
    /* renamed from: ff.b$n */
    /* loaded from: combined.jar:classes2.jar:ff/b$n.class */
    public interface n {
        void clear();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ff/b$o.class
     */
    /* renamed from: ff.b$o */
    /* loaded from: combined.jar:classes2.jar:ff/b$o.class */
    public interface o {
        /* renamed from: a */
        n mo24689a();
    }

    public AbstractC4854b(String str, int i10) {
        this.f28484a = str;
        this.f28485b = i10;
        m24682n(new g(this, null));
        m24681m(new e());
    }

    /* renamed from: i */
    public static final void m24674i(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
            }
        }
    }

    /* renamed from: j */
    public static final void m24675j(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (IOException e10) {
            }
        }
    }

    /* renamed from: k */
    public static final void m24676k(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e10) {
            }
        }
    }

    /* renamed from: f */
    public void m24677f() {
        synchronized (this) {
            Iterator<Socket> it = this.f28487d.iterator();
            while (it.hasNext()) {
                m24676k(it.next());
            }
        }
    }

    /* renamed from: g */
    public String m24678g(String str) {
        String str2;
        try {
            str2 = URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e10) {
            str2 = null;
        }
        return str2;
    }

    /* renamed from: h */
    public void m24679h(Socket socket) {
        synchronized (this) {
            this.f28487d.add(socket);
        }
    }

    /* renamed from: l */
    public abstract k mo24680l(i iVar);

    /* renamed from: m */
    public void m24681m(b bVar) {
        this.f28489f = bVar;
    }

    /* renamed from: n */
    public void m24682n(o oVar) {
        this.f28490g = oVar;
    }

    /* renamed from: o */
    public void m24683o() {
        ServerSocket serverSocket = new ServerSocket();
        this.f28486c = serverSocket;
        serverSocket.bind(this.f28484a != null ? new InetSocketAddress(this.f28484a, this.f28485b) : new InetSocketAddress(this.f28485b));
        Thread thread = new Thread(new a(this));
        this.f28488e = thread;
        thread.setDaemon(true);
        this.f28488e.setName("NanoHttpd Main Listener");
        this.f28488e.start();
    }

    /* renamed from: p */
    public void m24684p() {
        try {
            m24675j(this.f28486c);
            m24677f();
            Thread thread = this.f28488e;
            if (thread != null) {
                thread.join();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: q */
    public void m24685q(Socket socket) {
        synchronized (this) {
            this.f28487d.remove(socket);
        }
    }
}

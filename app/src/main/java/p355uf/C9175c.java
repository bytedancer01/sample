package p355uf;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.maxdigitall.maxdigitaliptvbox.model.database.EPGSourcesModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.XMLTVProgrammePojo;
import java.io.InputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.xml.parsers.SAXParserFactory;
import org.achartengine.ChartFactory;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import p151if.C5251a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:uf/c.class
 */
/* renamed from: uf.c */
/* loaded from: combined.jar:classes2.jar:uf/c.class */
public class C9175c extends DefaultHandler {

    /* renamed from: g */
    public SharedPreferences f41949g;

    /* renamed from: h */
    public Context f41950h;

    /* renamed from: i */
    public LiveStreamDBHandler f41951i;

    /* renamed from: l */
    public SimpleDateFormat f41954l;

    /* renamed from: b */
    public String f41944b = "";

    /* renamed from: c */
    public String f41945c = "XMLHelper";

    /* renamed from: d */
    public Boolean f41946d = Boolean.FALSE;

    /* renamed from: e */
    public String f41947e = "";

    /* renamed from: f */
    public XMLTVProgrammePojo f41948f = null;

    /* renamed from: j */
    public String f41952j = "0";

    /* renamed from: k */
    public int f41953k = 0;

    /* renamed from: m */
    public ArrayList<XMLTVProgrammePojo> f41955m = new ArrayList<>();

    /* renamed from: a */
    public void m38610a(Context context) {
        this.f41950h = context;
        this.f41951i = new LiveStreamDBHandler(context);
        try {
            C5251a.f30061q0 = true;
            this.f41949g = context.getSharedPreferences("loginPrefs", 0);
            this.f41954l = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            this.f41949g.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
            this.f41949g.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
            ArrayList<EPGSourcesModel> m15208b1 = this.f41951i.m15208b1();
            if (m15208b1 != null && m15208b1.size() > 0) {
                this.f41944b = m15208b1.get(0).m15120b();
                this.f41952j = String.valueOf(m15208b1.get(0).m15121c());
            }
            String str = this.f41944b;
            if (str == null || str.isEmpty() || this.f41944b.equalsIgnoreCase("")) {
                return;
            }
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            xMLReader.setContentHandler(this);
            InputStream openStream = new URL(this.f41944b).openStream();
            InputSource inputSource = new InputSource(openStream);
            inputSource.setEncoding("UTF-8");
            xMLReader.parse(inputSource);
            openStream.close();
        } catch (Exception e10) {
            Log.e(this.f41945c, "Exception: " + e10.getMessage());
        }
    }

    /* renamed from: b */
    public ArrayList<XMLTVProgrammePojo> m38611b() {
        return this.f41955m;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i10, int i11) {
        if (this.f41946d.booleanValue()) {
            try {
                this.f41947e += new String(cArr, i10, i11);
            } catch (Exception e10) {
                this.f41947e = "";
            }
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
        this.f41946d = Boolean.FALSE;
        XMLTVProgrammePojo xMLTVProgrammePojo = this.f41948f;
        if (xMLTVProgrammePojo != null) {
            xMLTVProgrammePojo.m15525w(this.f41952j);
        }
        if (str2.equalsIgnoreCase(ChartFactory.TITLE)) {
            this.f41948f.m15501A(this.f41947e);
            return;
        }
        if (str2.equalsIgnoreCase("desc")) {
            this.f41948f.m15518p(this.f41947e);
            return;
        }
        if (str2.equalsIgnoreCase("programme")) {
            this.f41955m.add(this.f41948f);
            int i10 = this.f41953k + 1;
            this.f41953k = i10;
            if (i10 > 10000) {
                this.f41953k = 0;
                LiveStreamDBHandler liveStreamDBHandler = this.f41951i;
                if (liveStreamDBHandler != null && liveStreamDBHandler.m15265y(this.f41955m)) {
                    this.f41955m.clear();
                }
            }
            this.f41948f = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0219 A[Catch: Exception -> 0x0275, TRY_ENTER, TryCatch #2 {Exception -> 0x0275, blocks: (B:24:0x002f, B:28:0x0045, B:30:0x0051, B:32:0x005f, B:42:0x00b8, B:44:0x00ca, B:45:0x00e7, B:46:0x0105, B:48:0x0111, B:57:0x015b, B:59:0x016d, B:60:0x018a, B:62:0x01b4, B:66:0x01cc, B:68:0x01de, B:10:0x0219, B:13:0x0227, B:16:0x0235, B:51:0x0127, B:35:0x0075), top: B:23:0x002f, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0227 A[Catch: Exception -> 0x0275, TRY_ENTER, TryCatch #2 {Exception -> 0x0275, blocks: (B:24:0x002f, B:28:0x0045, B:30:0x0051, B:32:0x005f, B:42:0x00b8, B:44:0x00ca, B:45:0x00e7, B:46:0x0105, B:48:0x0111, B:57:0x015b, B:59:0x016d, B:60:0x018a, B:62:0x01b4, B:66:0x01cc, B:68:0x01de, B:10:0x0219, B:13:0x0227, B:16:0x0235, B:51:0x0127, B:35:0x0075), top: B:23:0x002f, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0235 A[Catch: Exception -> 0x0275, TRY_ENTER, TryCatch #2 {Exception -> 0x0275, blocks: (B:24:0x002f, B:28:0x0045, B:30:0x0051, B:32:0x005f, B:42:0x00b8, B:44:0x00ca, B:45:0x00e7, B:46:0x0105, B:48:0x0111, B:57:0x015b, B:59:0x016d, B:60:0x018a, B:62:0x01b4, B:66:0x01cc, B:68:0x01de, B:10:0x0219, B:13:0x0227, B:16:0x0235, B:51:0x0127, B:35:0x0075), top: B:23:0x002f, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void startElement(java.lang.String r6, java.lang.String r7, java.lang.String r8, org.xml.sax.Attributes r9) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p355uf.C9175c.startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
    }
}

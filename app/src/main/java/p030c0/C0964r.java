package p030c0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p018b0.C0777b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c0/r.class
 */
/* renamed from: c0.r */
/* loaded from: combined.jar:classes1.jar:c0/r.class */
public class C0964r {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c0/r$a.class
     */
    /* renamed from: c0.r$a */
    /* loaded from: combined.jar:classes1.jar:c0/r$a.class */
    public static class a {

        /* renamed from: a */
        public final Bundle f6641a;

        /* renamed from: b */
        public IconCompat f6642b;

        /* renamed from: c */
        public final C0965r0[] f6643c;

        /* renamed from: d */
        public final C0965r0[] f6644d;

        /* renamed from: e */
        public boolean f6645e;

        /* renamed from: f */
        public boolean f6646f;

        /* renamed from: g */
        public final int f6647g;

        /* renamed from: h */
        public final boolean f6648h;

        /* renamed from: i */
        @Deprecated
        public int f6649i;

        /* renamed from: j */
        public CharSequence f6650j;

        /* renamed from: k */
        public PendingIntent f6651k;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:c0/r$a$a.class
         */
        /* renamed from: c0.r$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes1.jar:c0/r$a$a.class */
        public static final class C10256a {

            /* renamed from: a */
            public final IconCompat f6652a;

            /* renamed from: b */
            public final CharSequence f6653b;

            /* renamed from: c */
            public final PendingIntent f6654c;

            /* renamed from: d */
            public boolean f6655d;

            /* renamed from: e */
            public final Bundle f6656e;

            /* renamed from: f */
            public ArrayList<C0965r0> f6657f;

            /* renamed from: g */
            public int f6658g;

            /* renamed from: h */
            public boolean f6659h;

            /* renamed from: i */
            public boolean f6660i;

            public C10256a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i10 != 0 ? IconCompat.m1882d(null, "", i10) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false);
            }

            public C10256a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0965r0[] c0965r0Arr, boolean z10, int i10, boolean z11, boolean z12) {
                this.f6655d = true;
                this.f6659h = true;
                this.f6652a = iconCompat;
                this.f6653b = e.m5760f(charSequence);
                this.f6654c = pendingIntent;
                this.f6656e = bundle;
                this.f6657f = c0965r0Arr == null ? null : new ArrayList<>(Arrays.asList(c0965r0Arr));
                this.f6655d = z10;
                this.f6658g = i10;
                this.f6659h = z11;
                this.f6660i = z12;
            }

            /* renamed from: a */
            public a m5747a() {
                m5748b();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<C0965r0> arrayList3 = this.f6657f;
                if (arrayList3 != null) {
                    Iterator<C0965r0> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        C0965r0 next = it.next();
                        if (next.m5812j()) {
                            arrayList.add(next);
                        } else {
                            arrayList2.add(next);
                        }
                    }
                }
                C0965r0[] c0965r0Arr = null;
                C0965r0[] c0965r0Arr2 = arrayList.isEmpty() ? null : (C0965r0[]) arrayList.toArray(new C0965r0[arrayList.size()]);
                if (!arrayList2.isEmpty()) {
                    c0965r0Arr = (C0965r0[]) arrayList2.toArray(new C0965r0[arrayList2.size()]);
                }
                return new a(this.f6652a, this.f6653b, this.f6654c, this.f6656e, c0965r0Arr, c0965r0Arr2, this.f6655d, this.f6658g, this.f6659h, this.f6660i);
            }

            /* renamed from: b */
            public final void m5748b() {
                if (this.f6660i && this.f6654c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }
        }

        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.m1882d(null, "", i10) : null, charSequence, pendingIntent);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0965r0[] c0965r0Arr, C0965r0[] c0965r0Arr2, boolean z10, int i10, boolean z11, boolean z12) {
            this.f6646f = true;
            this.f6642b = iconCompat;
            if (iconCompat != null && iconCompat.m1891j() == 2) {
                this.f6649i = iconCompat.m1889f();
            }
            this.f6650j = e.m5760f(charSequence);
            this.f6651k = pendingIntent;
            this.f6641a = bundle == null ? new Bundle() : bundle;
            this.f6643c = c0965r0Arr;
            this.f6644d = c0965r0Arr2;
            this.f6645e = z10;
            this.f6647g = i10;
            this.f6646f = z11;
            this.f6648h = z12;
        }

        /* renamed from: a */
        public PendingIntent m5738a() {
            return this.f6651k;
        }

        /* renamed from: b */
        public boolean m5739b() {
            return this.f6645e;
        }

        /* renamed from: c */
        public Bundle m5740c() {
            return this.f6641a;
        }

        /* renamed from: d */
        public IconCompat m5741d() {
            int i10;
            if (this.f6642b == null && (i10 = this.f6649i) != 0) {
                this.f6642b = IconCompat.m1882d(null, "", i10);
            }
            return this.f6642b;
        }

        /* renamed from: e */
        public C0965r0[] m5742e() {
            return this.f6643c;
        }

        /* renamed from: f */
        public int m5743f() {
            return this.f6647g;
        }

        /* renamed from: g */
        public boolean m5744g() {
            return this.f6646f;
        }

        /* renamed from: h */
        public CharSequence m5745h() {
            return this.f6650j;
        }

        /* renamed from: i */
        public boolean m5746i() {
            return this.f6648h;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c0/r$b.class
     */
    /* renamed from: c0.r$b */
    /* loaded from: combined.jar:classes1.jar:c0/r$b.class */
    public static class b extends h {

        /* renamed from: e */
        public Bitmap f6661e;

        /* renamed from: f */
        public IconCompat f6662f;

        /* renamed from: g */
        public boolean f6663g;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:c0/r$b$a.class
         */
        /* renamed from: c0.r$b$a */
        /* loaded from: combined.jar:classes1.jar:c0/r$b$a.class */
        public static class a {
            /* renamed from: a */
            public static void m5754a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            /* renamed from: b */
            public static void m5755b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:c0/r$b$b.class
         */
        /* renamed from: c0.r$b$b, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes1.jar:c0/r$b$b.class */
        public static class C10257b {
            /* renamed from: a */
            public static void m5756a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        @Override // p030c0.C0964r.h
        /* renamed from: b */
        public void mo5749b(InterfaceC0962q interfaceC0962q) {
            int i10 = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(interfaceC0962q.getBuilder()).setBigContentTitle(this.f6713b).bigPicture(this.f6661e);
            if (this.f6663g) {
                IconCompat iconCompat = this.f6662f;
                Context context = null;
                if (iconCompat != null) {
                    if (i10 >= 23) {
                        if (interfaceC0962q instanceof C0951k0) {
                            context = ((C0951k0) interfaceC0962q).m5678e();
                        }
                        C10257b.m5756a(bigPicture, this.f6662f.m1897r(context));
                    } else if (iconCompat.m1891j() == 1) {
                        a.m5754a(bigPicture, this.f6662f.m1888e());
                    }
                }
                a.m5754a(bigPicture, null);
            }
            if (this.f6715d) {
                a.m5755b(bigPicture, this.f6714c);
            }
        }

        @Override // p030c0.C0964r.h
        /* renamed from: c */
        public String mo5750c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        /* renamed from: h */
        public b m5751h(Bitmap bitmap) {
            this.f6662f = bitmap == null ? null : IconCompat.m1881c(bitmap);
            this.f6663g = true;
            return this;
        }

        /* renamed from: i */
        public b m5752i(Bitmap bitmap) {
            this.f6661e = bitmap;
            return this;
        }

        /* renamed from: j */
        public b m5753j(CharSequence charSequence) {
            this.f6714c = e.m5760f(charSequence);
            this.f6715d = true;
            return this;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c0/r$c.class
     */
    /* renamed from: c0.r$c */
    /* loaded from: combined.jar:classes1.jar:c0/r$c.class */
    public static class c extends h {

        /* renamed from: e */
        public CharSequence f6664e;

        @Override // p030c0.C0964r.h
        /* renamed from: a */
        public void mo5757a(Bundle bundle) {
            super.mo5757a(bundle);
        }

        @Override // p030c0.C0964r.h
        /* renamed from: b */
        public void mo5749b(InterfaceC0962q interfaceC0962q) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(interfaceC0962q.getBuilder()).setBigContentTitle(this.f6713b).bigText(this.f6664e);
            if (this.f6715d) {
                bigText.setSummaryText(this.f6714c);
            }
        }

        @Override // p030c0.C0964r.h
        /* renamed from: c */
        public String mo5750c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        /* renamed from: h */
        public c m5758h(CharSequence charSequence) {
            this.f6664e = e.m5760f(charSequence);
            return this;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c0/r$d.class
     */
    /* renamed from: c0.r$d */
    /* loaded from: combined.jar:classes1.jar:c0/r$d.class */
    public static final class d {
        /* renamed from: a */
        public static Notification.BubbleMetadata m5759a(d dVar) {
            return null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c0/r$e.class
     */
    /* renamed from: c0.r$e */
    /* loaded from: combined.jar:classes1.jar:c0/r$e.class */
    public static class e {

        /* renamed from: A */
        public boolean f6665A;

        /* renamed from: B */
        public boolean f6666B;

        /* renamed from: C */
        public String f6667C;

        /* renamed from: D */
        public Bundle f6668D;

        /* renamed from: E */
        public int f6669E;

        /* renamed from: F */
        public int f6670F;

        /* renamed from: G */
        public Notification f6671G;

        /* renamed from: H */
        public RemoteViews f6672H;

        /* renamed from: I */
        public RemoteViews f6673I;

        /* renamed from: J */
        public RemoteViews f6674J;

        /* renamed from: K */
        public String f6675K;

        /* renamed from: L */
        public int f6676L;

        /* renamed from: M */
        public String f6677M;

        /* renamed from: N */
        public long f6678N;

        /* renamed from: O */
        public int f6679O;

        /* renamed from: P */
        public boolean f6680P;

        /* renamed from: Q */
        public Notification f6681Q;

        /* renamed from: R */
        public boolean f6682R;

        /* renamed from: S */
        public Icon f6683S;

        /* renamed from: T */
        @Deprecated
        public ArrayList<String> f6684T;

        /* renamed from: a */
        public Context f6685a;

        /* renamed from: b */
        public ArrayList<a> f6686b;

        /* renamed from: c */
        public ArrayList<C0959o0> f6687c;

        /* renamed from: d */
        public ArrayList<a> f6688d;

        /* renamed from: e */
        public CharSequence f6689e;

        /* renamed from: f */
        public CharSequence f6690f;

        /* renamed from: g */
        public PendingIntent f6691g;

        /* renamed from: h */
        public PendingIntent f6692h;

        /* renamed from: i */
        public RemoteViews f6693i;

        /* renamed from: j */
        public Bitmap f6694j;

        /* renamed from: k */
        public CharSequence f6695k;

        /* renamed from: l */
        public int f6696l;

        /* renamed from: m */
        public int f6697m;

        /* renamed from: n */
        public boolean f6698n;

        /* renamed from: o */
        public boolean f6699o;

        /* renamed from: p */
        public h f6700p;

        /* renamed from: q */
        public CharSequence f6701q;

        /* renamed from: r */
        public CharSequence f6702r;

        /* renamed from: s */
        public CharSequence[] f6703s;

        /* renamed from: t */
        public int f6704t;

        /* renamed from: u */
        public int f6705u;

        /* renamed from: v */
        public boolean f6706v;

        /* renamed from: w */
        public String f6707w;

        /* renamed from: x */
        public boolean f6708x;

        /* renamed from: y */
        public String f6709y;

        /* renamed from: z */
        public boolean f6710z;

        @Deprecated
        public e(Context context) {
            this(context, null);
        }

        public e(Context context, String str) {
            this.f6686b = new ArrayList<>();
            this.f6687c = new ArrayList<>();
            this.f6688d = new ArrayList<>();
            this.f6698n = true;
            this.f6710z = false;
            this.f6669E = 0;
            this.f6670F = 0;
            this.f6676L = 0;
            this.f6679O = 0;
            Notification notification = new Notification();
            this.f6681Q = notification;
            this.f6685a = context;
            this.f6675K = str;
            notification.when = System.currentTimeMillis();
            this.f6681Q.audioStreamType = -1;
            this.f6697m = 0;
            this.f6684T = new ArrayList<>();
            this.f6680P = true;
        }

        /* renamed from: f */
        public static CharSequence m5760f(CharSequence charSequence) {
            if (charSequence == null) {
                return charSequence;
            }
            CharSequence charSequence2 = charSequence;
            if (charSequence.length() > 5120) {
                charSequence2 = charSequence.subSequence(0, 5120);
            }
            return charSequence2;
        }

        /* renamed from: A */
        public e m5761A(int i10) {
            this.f6697m = i10;
            return this;
        }

        /* renamed from: B */
        public e m5762B(int i10, int i11, boolean z10) {
            this.f6704t = i10;
            this.f6705u = i11;
            this.f6706v = z10;
            return this;
        }

        /* renamed from: C */
        public e m5763C(boolean z10) {
            this.f6698n = z10;
            return this;
        }

        /* renamed from: D */
        public e m5764D(int i10) {
            this.f6681Q.icon = i10;
            return this;
        }

        /* renamed from: E */
        public e m5765E(Uri uri) {
            Notification notification = this.f6681Q;
            notification.sound = uri;
            notification.audioStreamType = -1;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            return this;
        }

        /* renamed from: F */
        public e m5766F(h hVar) {
            if (this.f6700p != hVar) {
                this.f6700p = hVar;
                if (hVar != null) {
                    hVar.m5802g(this);
                }
            }
            return this;
        }

        /* renamed from: G */
        public e m5767G(CharSequence charSequence) {
            this.f6681Q.tickerText = m5760f(charSequence);
            return this;
        }

        /* renamed from: H */
        public e m5768H(long[] jArr) {
            this.f6681Q.vibrate = jArr;
            return this;
        }

        /* renamed from: I */
        public e m5769I(int i10) {
            this.f6670F = i10;
            return this;
        }

        /* renamed from: J */
        public e m5770J(long j10) {
            this.f6681Q.when = j10;
            return this;
        }

        /* renamed from: a */
        public e m5771a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f6686b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: b */
        public e m5772b(a aVar) {
            if (aVar != null) {
                this.f6686b.add(aVar);
            }
            return this;
        }

        /* renamed from: c */
        public Notification m5773c() {
            return new C0951k0(this).m5676b();
        }

        /* renamed from: d */
        public e m5774d(f fVar) {
            fVar.m5796a(this);
            return this;
        }

        /* renamed from: e */
        public Bundle m5775e() {
            if (this.f6668D == null) {
                this.f6668D = new Bundle();
            }
            return this.f6668D;
        }

        /* renamed from: g */
        public final Bitmap m5776g(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            if (bitmap != null) {
                if (Build.VERSION.SDK_INT >= 27) {
                    bitmap2 = bitmap;
                } else {
                    Resources resources = this.f6685a.getResources();
                    int dimensionPixelSize = resources.getDimensionPixelSize(C0777b.f5306b);
                    int dimensionPixelSize2 = resources.getDimensionPixelSize(C0777b.f5305a);
                    if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                        return bitmap;
                    }
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap2 = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            return bitmap2;
        }

        /* renamed from: h */
        public e m5777h(boolean z10) {
            m5786q(16, z10);
            return this;
        }

        /* renamed from: i */
        public e m5778i(String str) {
            this.f6675K = str;
            return this;
        }

        /* renamed from: j */
        public e m5779j(int i10) {
            this.f6669E = i10;
            return this;
        }

        /* renamed from: k */
        public e m5780k(RemoteViews remoteViews) {
            this.f6681Q.contentView = remoteViews;
            return this;
        }

        /* renamed from: l */
        public e m5781l(PendingIntent pendingIntent) {
            this.f6691g = pendingIntent;
            return this;
        }

        /* renamed from: m */
        public e m5782m(CharSequence charSequence) {
            this.f6690f = m5760f(charSequence);
            return this;
        }

        /* renamed from: n */
        public e m5783n(CharSequence charSequence) {
            this.f6689e = m5760f(charSequence);
            return this;
        }

        /* renamed from: o */
        public e m5784o(int i10) {
            Notification notification = this.f6681Q;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        /* renamed from: p */
        public e m5785p(PendingIntent pendingIntent) {
            this.f6681Q.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: q */
        public final void m5786q(int i10, boolean z10) {
            Notification notification;
            int i11;
            if (z10) {
                notification = this.f6681Q;
                i11 = i10 | notification.flags;
            } else {
                notification = this.f6681Q;
                i11 = (i10 ^ (-1)) & notification.flags;
            }
            notification.flags = i11;
        }

        /* renamed from: r */
        public e m5787r(String str) {
            this.f6707w = str;
            return this;
        }

        /* renamed from: s */
        public e m5788s(int i10) {
            this.f6679O = i10;
            return this;
        }

        /* renamed from: t */
        public e m5789t(boolean z10) {
            this.f6708x = z10;
            return this;
        }

        /* renamed from: u */
        public e m5790u(Bitmap bitmap) {
            this.f6694j = m5776g(bitmap);
            return this;
        }

        /* renamed from: v */
        public e m5791v(int i10, int i11, int i12) {
            Notification notification = this.f6681Q;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            notification.flags = ((i11 == 0 || i12 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        /* renamed from: w */
        public e m5792w(boolean z10) {
            this.f6710z = z10;
            return this;
        }

        /* renamed from: x */
        public e m5793x(int i10) {
            this.f6696l = i10;
            return this;
        }

        /* renamed from: y */
        public e m5794y(boolean z10) {
            m5786q(2, z10);
            return this;
        }

        /* renamed from: z */
        public e m5795z(boolean z10) {
            m5786q(8, z10);
            return this;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c0/r$f.class
     */
    /* renamed from: c0.r$f */
    /* loaded from: combined.jar:classes1.jar:c0/r$f.class */
    public interface f {
        /* renamed from: a */
        e m5796a(e eVar);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c0/r$g.class
     */
    /* renamed from: c0.r$g */
    /* loaded from: combined.jar:classes1.jar:c0/r$g.class */
    public static class g extends h {

        /* renamed from: e */
        public ArrayList<CharSequence> f6711e = new ArrayList<>();

        @Override // p030c0.C0964r.h
        /* renamed from: b */
        public void mo5749b(InterfaceC0962q interfaceC0962q) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(interfaceC0962q.getBuilder()).setBigContentTitle(this.f6713b);
            if (this.f6715d) {
                bigContentTitle.setSummaryText(this.f6714c);
            }
            Iterator<CharSequence> it = this.f6711e.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine(it.next());
            }
        }

        @Override // p030c0.C0964r.h
        /* renamed from: c */
        public String mo5750c() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        /* renamed from: h */
        public g m5797h(CharSequence charSequence) {
            if (charSequence != null) {
                this.f6711e.add(e.m5760f(charSequence));
            }
            return this;
        }

        /* renamed from: i */
        public g m5798i(CharSequence charSequence) {
            this.f6713b = e.m5760f(charSequence);
            return this;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c0/r$h.class
     */
    /* renamed from: c0.r$h */
    /* loaded from: combined.jar:classes1.jar:c0/r$h.class */
    public static abstract class h {

        /* renamed from: a */
        public e f6712a;

        /* renamed from: b */
        public CharSequence f6713b;

        /* renamed from: c */
        public CharSequence f6714c;

        /* renamed from: d */
        public boolean f6715d = false;

        /* renamed from: a */
        public void mo5757a(Bundle bundle) {
            if (this.f6715d) {
                bundle.putCharSequence("android.summaryText", this.f6714c);
            }
            CharSequence charSequence = this.f6713b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String mo5750c = mo5750c();
            if (mo5750c != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", mo5750c);
            }
        }

        /* renamed from: b */
        public abstract void mo5749b(InterfaceC0962q interfaceC0962q);

        /* renamed from: c */
        public String mo5750c() {
            return null;
        }

        /* renamed from: d */
        public RemoteViews mo5799d(InterfaceC0962q interfaceC0962q) {
            return null;
        }

        /* renamed from: e */
        public RemoteViews mo5800e(InterfaceC0962q interfaceC0962q) {
            return null;
        }

        /* renamed from: f */
        public RemoteViews m5801f(InterfaceC0962q interfaceC0962q) {
            return null;
        }

        /* renamed from: g */
        public void m5802g(e eVar) {
            if (this.f6712a != eVar) {
                this.f6712a = eVar;
                if (eVar != null) {
                    eVar.m5766F(this);
                }
            }
        }
    }

    /* renamed from: a */
    public static Bundle m5736a(Notification notification) {
        return notification.extras;
    }

    /* renamed from: b */
    public static boolean m5737b(Notification notification) {
        return (notification.flags & 512) != 0;
    }
}

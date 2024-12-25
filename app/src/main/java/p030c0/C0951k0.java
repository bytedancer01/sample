package p030c0;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p030c0.C0964r;
import p294r.C7929b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c0/k0.class
 */
/* renamed from: c0.k0 */
/* loaded from: combined.jar:classes1.jar:c0/k0.class */
public class C0951k0 implements InterfaceC0962q {

    /* renamed from: a */
    public final Context f6573a;

    /* renamed from: b */
    public final Notification.Builder f6574b;

    /* renamed from: c */
    public final C0964r.e f6575c;

    /* renamed from: d */
    public RemoteViews f6576d;

    /* renamed from: e */
    public RemoteViews f6577e;

    /* renamed from: f */
    public final List<Bundle> f6578f = new ArrayList();

    /* renamed from: g */
    public final Bundle f6579g = new Bundle();

    /* renamed from: h */
    public int f6580h;

    /* renamed from: i */
    public RemoteViews f6581i;

    /* JADX WARN: Multi-variable type inference failed */
    public C0951k0(C0964r.e eVar) {
        Notification.Builder badgeIconType;
        Notification.Builder settingsText;
        Notification.Builder shortcutId;
        Notification.Builder timeoutAfter;
        Icon icon;
        this.f6575c = eVar;
        this.f6573a = eVar.f6685a;
        this.f6574b = Build.VERSION.SDK_INT >= 26 ? new Notification.Builder(eVar.f6685a, eVar.f6675K) : new Notification.Builder(eVar.f6685a);
        Notification notification = eVar.f6681Q;
        this.f6574b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f6693i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f6689e).setContentText(eVar.f6690f).setContentInfo(eVar.f6695k).setContentIntent(eVar.f6691g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f6692h, (notification.flags & 128) != 0).setLargeIcon(eVar.f6694j).setNumber(eVar.f6696l).setProgress(eVar.f6704t, eVar.f6705u, eVar.f6706v);
        this.f6574b.setSubText(eVar.f6701q).setUsesChronometer(eVar.f6699o).setPriority(eVar.f6697m);
        Iterator<C0964r.a> it = eVar.f6686b.iterator();
        while (it.hasNext()) {
            m5675a(it.next());
        }
        Bundle bundle = eVar.f6668D;
        if (bundle != null) {
            this.f6579g.putAll(bundle);
        }
        int i10 = Build.VERSION.SDK_INT;
        this.f6576d = eVar.f6672H;
        this.f6577e = eVar.f6673I;
        this.f6574b.setShowWhen(eVar.f6698n);
        this.f6574b.setLocalOnly(eVar.f6710z).setGroup(eVar.f6707w).setGroupSummary(eVar.f6708x).setSortKey(eVar.f6709y);
        this.f6580h = eVar.f6679O;
        this.f6574b.setCategory(eVar.f6667C).setColor(eVar.f6669E).setVisibility(eVar.f6670F).setPublicVersion(eVar.f6671G).setSound(notification.sound, notification.audioAttributes);
        List m5673d = i10 < 28 ? m5673d(m5674f(eVar.f6687c), eVar.f6684T) : eVar.f6684T;
        if (m5673d != null && !m5673d.isEmpty()) {
            Iterator<String> it2 = m5673d.iterator();
            while (it2.hasNext()) {
                this.f6574b.addPerson(it2.next());
            }
        }
        this.f6581i = eVar.f6674J;
        if (eVar.f6688d.size() > 0) {
            Bundle bundle2 = eVar.m5775e().getBundle("android.car.EXTENSIONS");
            Bundle bundle3 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            for (int i11 = 0; i11 < eVar.f6688d.size(); i11++) {
                bundle5.putBundle(Integer.toString(i11), C0953l0.m5680a(eVar.f6688d.get(i11)));
            }
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            eVar.m5775e().putBundle("android.car.EXTENSIONS", bundle3);
            this.f6579g.putBundle("android.car.EXTENSIONS", bundle4);
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 23 && (icon = eVar.f6683S) != null) {
            this.f6574b.setSmallIcon(icon);
        }
        if (i12 >= 24) {
            this.f6574b.setExtras(eVar.f6668D).setRemoteInputHistory(eVar.f6703s);
            RemoteViews remoteViews = eVar.f6672H;
            if (remoteViews != null) {
                this.f6574b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = eVar.f6673I;
            if (remoteViews2 != null) {
                this.f6574b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.f6674J;
            if (remoteViews3 != null) {
                this.f6574b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i12 >= 26) {
            badgeIconType = this.f6574b.setBadgeIconType(eVar.f6676L);
            settingsText = badgeIconType.setSettingsText(eVar.f6702r);
            shortcutId = settingsText.setShortcutId(eVar.f6677M);
            timeoutAfter = shortcutId.setTimeoutAfter(eVar.f6678N);
            timeoutAfter.setGroupAlertBehavior(eVar.f6679O);
            if (eVar.f6666B) {
                this.f6574b.setColorized(eVar.f6665A);
            }
            if (!TextUtils.isEmpty(eVar.f6675K)) {
                this.f6574b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i12 >= 28) {
            Iterator<C0959o0> it3 = eVar.f6687c.iterator();
            while (it3.hasNext()) {
                this.f6574b.addPerson(it3.next().m5727h());
            }
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 29) {
            this.f6574b.setAllowSystemGeneratedContextualActions(eVar.f6680P);
            this.f6574b.setBubbleMetadata(C0964r.d.m5759a(null));
        }
        if (eVar.f6682R) {
            if (this.f6575c.f6708x) {
                this.f6580h = 2;
            } else {
                this.f6580h = 1;
            }
            this.f6574b.setVibrate(null);
            this.f6574b.setSound(null);
            int i14 = notification.defaults & (-2) & (-3);
            notification.defaults = i14;
            this.f6574b.setDefaults(i14);
            if (i13 >= 26) {
                if (TextUtils.isEmpty(this.f6575c.f6707w)) {
                    this.f6574b.setGroup("silent");
                }
                this.f6574b.setGroupAlertBehavior(this.f6580h);
            }
        }
    }

    /* renamed from: d */
    public static List<String> m5673d(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C7929b c7929b = new C7929b(list.size() + list2.size());
        c7929b.addAll(list);
        c7929b.addAll(list2);
        return new ArrayList(c7929b);
    }

    /* renamed from: f */
    public static List<String> m5674f(List<C0959o0> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<C0959o0> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m5726g());
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void m5675a(C0964r.a aVar) {
        int i10 = Build.VERSION.SDK_INT;
        IconCompat m5741d = aVar.m5741d();
        Notification.Action.Builder builder = i10 >= 23 ? new Notification.Action.Builder(m5741d != null ? m5741d.m1896q() : null, aVar.m5745h(), aVar.m5738a()) : new Notification.Action.Builder(m5741d != null ? m5741d.m1889f() : 0, aVar.m5745h(), aVar.m5738a());
        if (aVar.m5742e() != null) {
            for (RemoteInput remoteInput : C0965r0.m5804b(aVar.m5742e())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = aVar.m5740c() != null ? new Bundle(aVar.m5740c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.m5739b());
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 24) {
            builder.setAllowGeneratedReplies(aVar.m5739b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.m5743f());
        if (i11 >= 28) {
            builder.setSemanticAction(aVar.m5743f());
        }
        if (i11 >= 29) {
            builder.setContextual(aVar.m5746i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.m5744g());
        builder.addExtras(bundle);
        this.f6574b.addAction(builder.build());
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x003a, code lost:
    
        if (r4 != null) goto L11;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.app.Notification m5676b() {
        /*
            r3 = this;
            r0 = r3
            c0.r$e r0 = r0.f6575c
            c0.r$h r0 = r0.f6700p
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L11
            r0 = r5
            r1 = r3
            r0.mo5749b(r1)
        L11:
            r0 = r5
            if (r0 == 0) goto L1e
            r0 = r5
            r1 = r3
            android.widget.RemoteViews r0 = r0.mo5800e(r1)
            r4 = r0
            goto L20
        L1e:
            r0 = 0
            r4 = r0
        L20:
            r0 = r3
            android.app.Notification r0 = r0.m5677c()
            r6 = r0
            r0 = r4
            if (r0 == 0) goto L31
        L29:
            r0 = r6
            r1 = r4
            r0.contentView = r1
            goto L40
        L31:
            r0 = r3
            c0.r$e r0 = r0.f6575c
            android.widget.RemoteViews r0 = r0.f6672H
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L40
            goto L29
        L40:
            r0 = r5
            if (r0 == 0) goto L53
            r0 = r5
            r1 = r3
            android.widget.RemoteViews r0 = r0.mo5799d(r1)
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L53
            r0 = r6
            r1 = r4
            r0.bigContentView = r1
        L53:
            r0 = r5
            if (r0 == 0) goto L6c
            r0 = r3
            c0.r$e r0 = r0.f6575c
            c0.r$h r0 = r0.f6700p
            r1 = r3
            android.widget.RemoteViews r0 = r0.m5801f(r1)
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L6c
            r0 = r6
            r1 = r4
            r0.headsUpContentView = r1
        L6c:
            r0 = r5
            if (r0 == 0) goto L7e
            r0 = r6
            android.os.Bundle r0 = p030c0.C0964r.m5736a(r0)
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L7e
            r0 = r5
            r1 = r4
            r0.mo5757a(r1)
        L7e:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p030c0.C0951k0.m5676b():android.app.Notification");
    }

    /* renamed from: c */
    public Notification m5677c() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            return this.f6574b.build();
        }
        if (i10 >= 24) {
            Notification build = this.f6574b.build();
            if (this.f6580h != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && this.f6580h == 2) {
                    m5679g(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f6580h == 1) {
                    m5679g(build);
                }
            }
            return build;
        }
        this.f6574b.setExtras(this.f6579g);
        Notification build2 = this.f6574b.build();
        RemoteViews remoteViews = this.f6576d;
        if (remoteViews != null) {
            build2.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.f6577e;
        if (remoteViews2 != null) {
            build2.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.f6581i;
        if (remoteViews3 != null) {
            build2.headsUpContentView = remoteViews3;
        }
        if (this.f6580h != 0) {
            if (build2.getGroup() != null && (build2.flags & 512) != 0 && this.f6580h == 2) {
                m5679g(build2);
            }
            if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.f6580h == 1) {
                m5679g(build2);
            }
        }
        return build2;
    }

    /* renamed from: e */
    public Context m5678e() {
        return this.f6573a;
    }

    /* renamed from: g */
    public final void m5679g(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = notification.defaults & (-2) & (-3);
    }

    @Override // p030c0.InterfaceC0962q
    public Notification.Builder getBuilder() {
        return this.f6574b;
    }
}

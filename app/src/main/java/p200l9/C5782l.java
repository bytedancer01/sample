package p200l9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.achartengine.ChartFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p304r9.C8013a;
import p323s9.C8551b;
import p402x9.C9691a;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/l.class
 */
/* renamed from: l9.l */
/* loaded from: combined.jar:classes2.jar:l9/l.class */
public class C5782l extends AbstractC10125a {

    /* renamed from: i */
    public static final C5772h1 f32301i;

    /* renamed from: d */
    public final List f32302d;

    /* renamed from: e */
    public final Bundle f32303e;

    /* renamed from: f */
    public int f32304f;

    /* renamed from: g */
    public final a f32305g;

    /* renamed from: h */
    public static final String[] f32300h = {"none", "String", "int", "double", "ISO-8601 date String", "Time in milliseconds as long"};
    public static final Parcelable.Creator<C5782l> CREATOR = new C5775i1();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:l9/l$a.class
     */
    /* renamed from: l9.l$a */
    /* loaded from: combined.jar:classes2.jar:l9/l$a.class */
    public class a {

        /* renamed from: a */
        public final C5782l f32306a;

        public a(C5782l c5782l) {
            this.f32306a = c5782l;
        }
    }

    static {
        C5772h1 c5772h1 = new C5772h1();
        c5772h1.m28204b("com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime", 4);
        c5772h1.m28204b("com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate", 4);
        c5772h1.m28204b("com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate", 4);
        c5772h1.m28204b("com.google.android.gms.cast.metadata.TITLE", ChartFactory.TITLE, 1);
        c5772h1.m28204b("com.google.android.gms.cast.metadata.SUBTITLE", "subtitle", 1);
        c5772h1.m28204b("com.google.android.gms.cast.metadata.ARTIST", "artist", 1);
        c5772h1.m28204b("com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist", 1);
        c5772h1.m28204b("com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName", 1);
        c5772h1.m28204b("com.google.android.gms.cast.metadata.COMPOSER", "composer", 1);
        c5772h1.m28204b("com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber", 2);
        c5772h1.m28204b("com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber", 2);
        c5772h1.m28204b("com.google.android.gms.cast.metadata.SEASON_NUMBER", "season", 2);
        c5772h1.m28204b("com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode", 2);
        c5772h1.m28204b("com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle", 1);
        c5772h1.m28204b("com.google.android.gms.cast.metadata.STUDIO", "studio", 1);
        c5772h1.m28204b("com.google.android.gms.cast.metadata.WIDTH", "width", 2);
        c5772h1.m28204b("com.google.android.gms.cast.metadata.HEIGHT", "height", 2);
        c5772h1.m28204b("com.google.android.gms.cast.metadata.LOCATION_NAME", "location", 1);
        c5772h1.m28204b("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude", 3);
        c5772h1.m28204b("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude", 3);
        c5772h1.m28204b("com.google.android.gms.cast.metadata.SECTION_DURATION", "sectionDuration", 5);
        c5772h1.m28204b("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "sectionStartTimeInMedia", 5);
        c5772h1.m28204b("com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "sectionStartAbsoluteTime", 5);
        c5772h1.m28204b("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "sectionStartTimeInContainer", 5);
        c5772h1.m28204b("com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", "queueItemId", 2);
        c5772h1.m28204b("com.google.android.gms.cast.metadata.BOOK_TITLE", "bookTitle", 1);
        c5772h1.m28204b("com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "chapterNumber", 2);
        c5772h1.m28204b("com.google.android.gms.cast.metadata.CHAPTER_TITLE", "chapterTitle", 1);
        f32301i = c5772h1;
    }

    public C5782l() {
        this(0);
    }

    public C5782l(int i10) {
        this(new ArrayList(), new Bundle(), i10);
    }

    public C5782l(List list, Bundle bundle, int i10) {
        this.f32305g = new a(this);
        this.f32302d = list;
        this.f32303e = bundle;
        this.f32304f = i10;
    }

    /* renamed from: W */
    public static void m28242W(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("null and empty keys are not allowed");
        }
        int m28203a = f32301i.m28203a(str);
        if (m28203a == i10 || m28203a == 0) {
            return;
        }
        throw new IllegalArgumentException("Value for " + str + " must be a " + f32300h[i10]);
    }

    /* renamed from: P */
    public boolean m28243P(String str) {
        return this.f32303e.containsKey(str);
    }

    /* renamed from: Q */
    public List<C9691a> m28244Q() {
        return this.f32302d;
    }

    /* renamed from: R */
    public int m28245R() {
        return this.f32304f;
    }

    /* renamed from: S */
    public String m28246S(String str) {
        m28242W(str, 1);
        return this.f32303e.getString(str);
    }

    /* renamed from: T */
    public long m28247T(String str) {
        m28242W(str, 5);
        return this.f32303e.getLong(str);
    }

    /* renamed from: U */
    public boolean m28248U() {
        List list = this.f32302d;
        return (list == null || list.isEmpty()) ? false : true;
    }

    /* renamed from: V */
    public void m28249V(String str, String str2) {
        m28242W(str, 1);
        this.f32303e.putString(str, str2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:12:0x02a4
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* renamed from: X */
    public final org.json.JSONObject m28250X() {
        /*
            Method dump skipped, instructions count: 686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p200l9.C5782l.m28250X():org.json.JSONObject");
    }

    /* renamed from: Y */
    public final void m28251Y(JSONObject jSONObject) {
        String str;
        Bundle bundle;
        clear();
        this.f32304f = 0;
        try {
            this.f32304f = jSONObject.getInt("metadataType");
        } catch (JSONException e10) {
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null) {
            C8551b.m36779c(this.f32302d, optJSONArray);
        }
        ArrayList arrayList = new ArrayList();
        int i10 = this.f32304f;
        if (i10 == 0) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i10 == 1) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i10 == 2) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
        } else if (i10 == 3) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i10 == 4) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
        } else if (i10 == 5) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        HashSet hashSet = new HashSet(arrayList);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && !"metadataType".equals(next)) {
                    C5772h1 c5772h1 = f32301i;
                    String m28206d = c5772h1.m28206d(next);
                    if (m28206d == null) {
                        Object obj = jSONObject.get(next);
                        if (obj instanceof String) {
                            this.f32303e.putString(next, (String) obj);
                        } else if (obj instanceof Integer) {
                            this.f32303e.putInt(next, ((Integer) obj).intValue());
                        } else if (obj instanceof Double) {
                            this.f32303e.putDouble(next, ((Double) obj).doubleValue());
                        }
                    } else if (hashSet.contains(m28206d)) {
                        try {
                            Object obj2 = jSONObject.get(next);
                            if (obj2 != null) {
                                int m28203a = c5772h1.m28203a(m28206d);
                                if (m28203a != 1) {
                                    if (m28203a != 2) {
                                        if (m28203a == 3) {
                                            double optDouble = jSONObject.optDouble(next);
                                            if (!Double.isNaN(optDouble)) {
                                                this.f32303e.putDouble(m28206d, optDouble);
                                            }
                                        } else if (m28203a != 4) {
                                            if (m28203a == 5) {
                                                this.f32303e.putLong(m28206d, C8013a.m34864e(jSONObject.optLong(next)));
                                            }
                                        } else if (obj2 instanceof String) {
                                            str = (String) obj2;
                                            if (C8551b.m36777a(str) != null) {
                                                bundle = this.f32303e;
                                            }
                                        }
                                    } else if (obj2 instanceof Integer) {
                                        this.f32303e.putInt(m28206d, ((Integer) obj2).intValue());
                                    }
                                } else if (obj2 instanceof String) {
                                    bundle = this.f32303e;
                                    str = (String) obj2;
                                }
                                bundle.putString(m28206d, str);
                            }
                        } catch (JSONException e11) {
                        }
                    }
                }
            }
        } catch (JSONException e12) {
        }
    }

    /* renamed from: Z */
    public final boolean m28252Z(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !m28252Z((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public void m28253b(C9691a c9691a) {
        this.f32302d.add(c9691a);
    }

    public void clear() {
        this.f32303e.clear();
        this.f32302d.clear();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5782l)) {
            return false;
        }
        C5782l c5782l = (C5782l) obj;
        return m28252Z(this.f32303e, c5782l.f32303e) && this.f32302d.equals(c5782l.f32302d);
    }

    public int hashCode() {
        Bundle bundle = this.f32303e;
        int i10 = 17;
        int i11 = 17;
        if (bundle != null) {
            Iterator<String> it = bundle.keySet().iterator();
            while (true) {
                i11 = i10;
                if (!it.hasNext()) {
                    break;
                }
                Object obj = this.f32303e.get(it.next());
                i10 = (i10 * 31) + (obj != null ? obj.hashCode() : 0);
            }
        }
        return (i11 * 31) + this.f32302d.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42540w(parcel, 2, m28244Q(), false);
        C10127c.m42522e(parcel, 3, this.f32303e, false);
        C10127c.m42529l(parcel, 4, m28245R());
        C10127c.m42519b(parcel, m42518a);
    }
}

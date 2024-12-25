package com.maxdigitall.maxdigitaliptvbox.view.demo;

import android.R;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.JsonReader;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0243b;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.maxdigitall.maxdigitaliptvbox.view.demo.C3662a;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.apache.http.HttpHost;
import p027b9.C0857o;
import p027b9.C0858p;
import p027b9.InterfaceC0854m;
import p059d9.C4349a;
import p059d9.C4392v;
import p059d9.C4401z0;
import p218mf.C6588b;
import p218mf.C6589c;
import p218mf.ServiceC6587a;
import p267p6.C7561b1;
import p267p6.C7594k1;
import p420y7.AbstractServiceC9875y;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/SampleChooserActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/SampleChooserActivity.class */
public class SampleChooserActivity extends ActivityC0243b implements C3662a.c, ExpandableListView.OnChildClickListener {

    /* renamed from: d */
    public String[] f22018d;

    /* renamed from: e */
    public boolean f22019e;

    /* renamed from: f */
    public C3662a f22020f;

    /* renamed from: g */
    public ViewOnClickListenerC3660d f22021g;

    /* renamed from: h */
    public MenuItem f22022h;

    /* renamed from: i */
    public ExpandableListView f22023i;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/SampleChooserActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.SampleChooserActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/SampleChooserActivity$b.class */
    public static final class C3658b {

        /* renamed from: a */
        public final String f22024a;

        /* renamed from: b */
        public final List<C3659c> f22025b = new ArrayList();

        public C3658b(String str) {
            this.f22024a = str;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/SampleChooserActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.SampleChooserActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/SampleChooserActivity$c.class */
    public static final class C3659c {

        /* renamed from: a */
        public final String f22026a;

        /* renamed from: b */
        public final List<C7561b1> f22027b;

        public C3659c(String str, List<C7561b1> list) {
            C4349a.m21878a(!list.isEmpty());
            this.f22026a = str;
            this.f22027b = Collections.unmodifiableList(new ArrayList(list));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/SampleChooserActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.SampleChooserActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/SampleChooserActivity$d.class */
    public final class ViewOnClickListenerC3660d extends BaseExpandableListAdapter implements View.OnClickListener {

        /* renamed from: b */
        public List<C3658b> f22028b = Collections.emptyList();

        /* renamed from: c */
        public final SampleChooserActivity f22029c;

        public ViewOnClickListenerC3660d(SampleChooserActivity sampleChooserActivity) {
            this.f22029c = sampleChooserActivity;
        }

        @Override // android.widget.ExpandableListAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3659c getChild(int i10, int i11) {
            return getGroup(i10).f22025b.get(i11);
        }

        @Override // android.widget.ExpandableListAdapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3658b getGroup(int i10) {
            return this.f22028b.get(i10);
        }

        /* renamed from: c */
        public final void m18011c(View view, C3659c c3659c) {
            view.setTag(c3659c);
            ((TextView) view.findViewById(2131429093)).setText(c3659c.f22026a);
            boolean z10 = true;
            boolean z11 = this.f22029c.m18005u0(c3659c) == 0;
            if (!z11 || !this.f22029c.f22020f.m18026h(c3659c.f22027b.get(0))) {
                z10 = false;
            }
            ImageButton imageButton = (ImageButton) view.findViewById(2131427866);
            imageButton.setTag(c3659c);
            imageButton.setColorFilter(z11 ? z10 ? -12409355 : -4342339 : -10066330);
            imageButton.setImageResource(z10 ? 2131231131 : 2131231199);
        }

        /* renamed from: d */
        public void m18012d(List<C3658b> list) {
            this.f22028b = list;
            notifyDataSetChanged();
        }

        @Override // android.widget.ExpandableListAdapter
        public long getChildId(int i10, int i11) {
            return i11;
        }

        @Override // android.widget.ExpandableListAdapter
        public View getChildView(int i10, int i11, boolean z10, View view, ViewGroup viewGroup) {
            View view2 = view;
            if (view == null) {
                view2 = this.f22029c.getLayoutInflater().inflate(2131624498, viewGroup, false);
                View findViewById = view2.findViewById(2131427866);
                findViewById.setOnClickListener(this);
                findViewById.setFocusable(false);
            }
            m18011c(view2, getChild(i10, i11));
            return view2;
        }

        @Override // android.widget.ExpandableListAdapter
        public int getChildrenCount(int i10) {
            return getGroup(i10).f22025b.size();
        }

        @Override // android.widget.ExpandableListAdapter
        public int getGroupCount() {
            return this.f22028b.size();
        }

        @Override // android.widget.ExpandableListAdapter
        public long getGroupId(int i10) {
            return i10;
        }

        @Override // android.widget.ExpandableListAdapter
        public View getGroupView(int i10, boolean z10, View view, ViewGroup viewGroup) {
            View view2 = view;
            if (view == null) {
                view2 = this.f22029c.getLayoutInflater().inflate(R.layout.simple_expandable_list_item_1, viewGroup, false);
            }
            ((TextView) view2).setText(getGroup(i10).f22024a);
            return view2;
        }

        @Override // android.widget.ExpandableListAdapter
        public boolean hasStableIds() {
            return false;
        }

        @Override // android.widget.ExpandableListAdapter
        public boolean isChildSelectable(int i10, int i11) {
            return true;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f22029c.m18008z0((C3659c) view.getTag());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/SampleChooserActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.SampleChooserActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/SampleChooserActivity$e.class */
    public final class AsyncTaskC3661e extends AsyncTask<String, Void, List<C3658b>> {

        /* renamed from: a */
        public boolean f22030a;

        /* renamed from: b */
        public final SampleChooserActivity f22031b;

        public AsyncTaskC3661e(SampleChooserActivity sampleChooserActivity) {
            this.f22031b = sampleChooserActivity;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<C3658b> doInBackground(String... strArr) {
            ArrayList arrayList = new ArrayList();
            InterfaceC0854m mo5296a = C6588b.m30439d(this.f22031b.getApplicationContext()).mo5296a();
            for (String str : strArr) {
                try {
                    try {
                        m18018f(new JsonReader(new InputStreamReader(new C0857o(mo5296a, new C0858p(Uri.parse(str))), "UTF-8")), arrayList);
                    } catch (Exception e10) {
                        C4392v.m22271e("SampleChooserActivity", "Error loading sample list: " + str, e10);
                        this.f22030a = true;
                    }
                } finally {
                    C4401z0.m22401o(mo5296a);
                }
            }
            return arrayList;
        }

        /* renamed from: b */
        public final C3658b m18014b(String str, List<C3658b> list) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (C4401z0.m22371c(str, list.get(i10).f22024a)) {
                    return list.get(i10);
                }
            }
            C3658b c3658b = new C3658b(str);
            list.add(c3658b);
            return c3658b;
        }

        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(List<C3658b> list) {
            this.f22031b.m18007x0(list, this.f22030a);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:125:0x021f, code lost:
        
            if (r0.equals("subtitle_uri") == false) goto L7;
         */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.maxdigitall.maxdigitaliptvbox.view.demo.SampleChooserActivity.C3659c m18016d(android.util.JsonReader r8, boolean r9) {
            /*
                Method dump skipped, instructions count: 1110
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.demo.SampleChooserActivity.AsyncTaskC3661e.m18016d(android.util.JsonReader, boolean):com.maxdigitall.maxdigitaliptvbox.view.demo.SampleChooserActivity$c");
        }

        /* renamed from: e */
        public final void m18017e(JsonReader jsonReader, List<C3658b> list) {
            String nextName;
            ArrayList arrayList = new ArrayList();
            jsonReader.beginObject();
            String str = "";
            while (jsonReader.hasNext()) {
                nextName = jsonReader.nextName();
                nextName.hashCode();
                switch (nextName) {
                    case "_comment":
                        jsonReader.nextString();
                        break;
                    case "name":
                        str = jsonReader.nextString();
                        break;
                    case "samples":
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            arrayList.add(m18016d(jsonReader, false));
                        }
                        jsonReader.endArray();
                        break;
                    default:
                        throw C7594k1.m32824c("Unsupported name: " + nextName, null);
                }
            }
            jsonReader.endObject();
            m18014b(str, list).f22025b.addAll(arrayList);
        }

        /* renamed from: f */
        public final void m18018f(JsonReader jsonReader, List<C3658b> list) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                m18017e(jsonReader, list);
            }
            jsonReader.endArray();
        }
    }

    /* renamed from: v0 */
    public static boolean m18003v0(MenuItem menuItem) {
        return menuItem != null && menuItem.isChecked();
    }

    @Override // com.maxdigitall.maxdigitaliptvbox.view.demo.C3662a.c
    /* renamed from: d0 */
    public void mo18004d0() {
        this.f22021g.notifyDataSetChanged();
    }

    @Override // android.widget.ExpandableListView.OnChildClickListener
    public boolean onChildClick(ExpandableListView expandableListView, View view, int i10, int i11, long j10) {
        SharedPreferences.Editor edit = getPreferences(0).edit();
        edit.putInt("sample_chooser_group_position", i10);
        edit.putInt("sample_chooser_child_position", i11);
        edit.apply();
        C3659c c3659c = (C3659c) view.getTag();
        Intent intent = new Intent(this, (Class<?>) PlayerActivity.class);
        intent.putExtra("prefer_extension_decoders", m18003v0(this.f22022h));
        C6589c.m30452d(c3659c.f22027b, intent);
        startActivity(intent);
        return true;
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624497);
        this.f22021g = new ViewOnClickListenerC3660d(this);
        ExpandableListView expandableListView = (ExpandableListView) findViewById(2131429092);
        this.f22023i = expandableListView;
        expandableListView.setAdapter(this.f22021g);
        this.f22023i.setOnChildClickListener(this);
        String dataString = getIntent().getDataString();
        if (dataString != null) {
            this.f22018d = new String[]{dataString};
        } else {
            ArrayList arrayList = new ArrayList();
            try {
                for (String str : getAssets().list("")) {
                    if (str.endsWith(".exolist.json")) {
                        arrayList.add("asset:///" + str);
                    }
                }
            } catch (IOException e10) {
                Toast.makeText(getApplicationContext(), 2132018503, 1).show();
            }
            String[] strArr = new String[arrayList.size()];
            this.f22018d = strArr;
            arrayList.toArray(strArr);
            Arrays.sort(this.f22018d);
        }
        this.f22019e = C6588b.m30448m();
        this.f22020f = C6588b.m30445j(this);
        m18006w0();
        try {
            AbstractServiceC9875y.m41563z(this, ServiceC6587a.class);
        } catch (IllegalStateException e11) {
            AbstractServiceC9875y.m41545A(this, ServiceC6587a.class);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131689503, menu);
        MenuItem findItem = menu.findItem(2131428868);
        this.f22022h = findItem;
        findItem.setVisible(this.f22019e);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.setChecked(!menuItem.isChecked());
        return true;
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (iArr.length == 0) {
            return;
        }
        if (iArr[0] == 0) {
            m18006w0();
        } else {
            Toast.makeText(getApplicationContext(), 2132018503, 1).show();
            finish();
        }
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onStart() {
        super.onStart();
        this.f22020f.m18024f(this);
        this.f22021g.notifyDataSetChanged();
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onStop() {
        this.f22020f.m18028j(this);
        super.onStop();
    }

    /* renamed from: u0 */
    public final int m18005u0(C3659c c3659c) {
        if (c3659c.f22027b.size() > 1) {
            return 2132017595;
        }
        C7561b1.g gVar = (C7561b1.g) C4349a.m21882e(c3659c.f22027b.get(0).f36449b);
        if (gVar.f36507d != null) {
            return 2132017588;
        }
        String scheme = gVar.f36504a.getScheme();
        return (HttpHost.DEFAULT_SCHEME_NAME.equals(scheme) || ClientConstants.DOMAIN_SCHEME.equals(scheme)) ? 0 : 2132017596;
    }

    /* renamed from: w0 */
    public final void m18006w0() {
        C4349a.m21882e(this.f22018d);
        int i10 = 0;
        while (true) {
            String[] strArr = this.f22018d;
            if (i10 >= strArr.length) {
                new AsyncTaskC3661e().execute(this.f22018d);
                return;
            } else if (C4401z0.m22314A0(this, Uri.parse(strArr[i10]))) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* renamed from: x0 */
    public final void m18007x0(List<C3658b> list, boolean z10) {
        if (z10) {
            Toast.makeText(getApplicationContext(), 2132018503, 1).show();
        }
        this.f22021g.m18012d(list);
        SharedPreferences preferences = getPreferences(0);
        int i10 = preferences.getInt("sample_chooser_group_position", -1);
        int i11 = preferences.getInt("sample_chooser_child_position", -1);
        if (i10 == -1 || i11 == -1 || i10 >= list.size() || i11 >= list.get(i10).f22025b.size()) {
            return;
        }
        this.f22023i.expandGroup(i10);
        this.f22023i.setSelectedChild(i10, i11, true);
    }

    /* renamed from: z0 */
    public final void m18008z0(C3659c c3659c) {
        int m18005u0 = m18005u0(c3659c);
        if (m18005u0 != 0) {
            Toast.makeText(getApplicationContext(), m18005u0, 1).show();
        } else {
            this.f22020f.m18029k(getSupportFragmentManager(), c3659c.f22027b.get(0), C6588b.m30437b(this, m18003v0(this.f22022h)));
        }
    }
}

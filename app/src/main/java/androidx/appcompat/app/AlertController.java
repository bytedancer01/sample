package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.C0351s0;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import p029c.C0920a;
import p029c.C0925f;
import p029c.C0929j;
import p049d.DialogC4281g;
import p235o0.C6824g0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/app/AlertController.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/app/AlertController.class */
public class AlertController {

    /* renamed from: A */
    public NestedScrollView f1362A;

    /* renamed from: C */
    public Drawable f1364C;

    /* renamed from: D */
    public ImageView f1365D;

    /* renamed from: E */
    public TextView f1366E;

    /* renamed from: F */
    public TextView f1367F;

    /* renamed from: G */
    public View f1368G;

    /* renamed from: H */
    public ListAdapter f1369H;

    /* renamed from: J */
    public int f1371J;

    /* renamed from: K */
    public int f1372K;

    /* renamed from: L */
    public int f1373L;

    /* renamed from: M */
    public int f1374M;

    /* renamed from: N */
    public int f1375N;

    /* renamed from: O */
    public int f1376O;

    /* renamed from: P */
    public boolean f1377P;

    /* renamed from: R */
    public Handler f1379R;

    /* renamed from: a */
    public final Context f1381a;

    /* renamed from: b */
    public final DialogC4281g f1382b;

    /* renamed from: c */
    public final Window f1383c;

    /* renamed from: d */
    public final int f1384d;

    /* renamed from: e */
    public CharSequence f1385e;

    /* renamed from: f */
    public CharSequence f1386f;

    /* renamed from: g */
    public ListView f1387g;

    /* renamed from: h */
    public View f1388h;

    /* renamed from: i */
    public int f1389i;

    /* renamed from: j */
    public int f1390j;

    /* renamed from: k */
    public int f1391k;

    /* renamed from: l */
    public int f1392l;

    /* renamed from: m */
    public int f1393m;

    /* renamed from: o */
    public Button f1395o;

    /* renamed from: p */
    public CharSequence f1396p;

    /* renamed from: q */
    public Message f1397q;

    /* renamed from: r */
    public Drawable f1398r;

    /* renamed from: s */
    public Button f1399s;

    /* renamed from: t */
    public CharSequence f1400t;

    /* renamed from: u */
    public Message f1401u;

    /* renamed from: v */
    public Drawable f1402v;

    /* renamed from: w */
    public Button f1403w;

    /* renamed from: x */
    public CharSequence f1404x;

    /* renamed from: y */
    public Message f1405y;

    /* renamed from: z */
    public Drawable f1406z;

    /* renamed from: n */
    public boolean f1394n = false;

    /* renamed from: B */
    public int f1363B = 0;

    /* renamed from: I */
    public int f1370I = -1;

    /* renamed from: Q */
    public int f1378Q = 0;

    /* renamed from: S */
    public final View.OnClickListener f1380S = new ViewOnClickListenerC0234a(this);

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/app/AlertController$RecycleListView.class
     */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/app/AlertController$RecycleListView.class */
    public static class RecycleListView extends ListView {

        /* renamed from: b */
        public final int f1407b;

        /* renamed from: c */
        public final int f1408c;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0929j.f6487n2);
            this.f1408c = obtainStyledAttributes.getDimensionPixelOffset(C0929j.f6492o2, -1);
            this.f1407b = obtainStyledAttributes.getDimensionPixelOffset(C0929j.f6497p2, -1);
        }

        /* renamed from: a */
        public void m845a(boolean z10, boolean z11) {
            if (z11 && z10) {
                return;
            }
            setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f1407b, getPaddingRight(), z11 ? getPaddingBottom() : this.f1408c);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/app/AlertController$a.class
     */
    /* renamed from: androidx.appcompat.app.AlertController$a */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/app/AlertController$a.class */
    public class ViewOnClickListenerC0234a implements View.OnClickListener {

        /* renamed from: b */
        public final AlertController f1409b;

        public ViewOnClickListenerC0234a(AlertController alertController) {
            this.f1409b = alertController;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onClick(android.view.View r5) {
            /*
                r4 = this;
                r0 = r4
                androidx.appcompat.app.AlertController r0 = r0.f1409b
                r7 = r0
                r0 = r5
                r1 = r7
                android.widget.Button r1 = r1.f1395o
                if (r0 != r1) goto L20
                r0 = r7
                android.os.Message r0 = r0.f1397q
                r6 = r0
                r0 = r6
                if (r0 == 0) goto L20
                r0 = r6
                r5 = r0
            L18:
                r0 = r5
                android.os.Message r0 = android.os.Message.obtain(r0)
                r5 = r0
                goto L51
            L20:
                r0 = r5
                r1 = r7
                android.widget.Button r1 = r1.f1399s
                if (r0 != r1) goto L36
                r0 = r7
                android.os.Message r0 = r0.f1401u
                r6 = r0
                r0 = r6
                if (r0 == 0) goto L36
                r0 = r6
                r5 = r0
                goto L18
            L36:
                r0 = r5
                r1 = r7
                android.widget.Button r1 = r1.f1403w
                if (r0 != r1) goto L4f
                r0 = r7
                android.os.Message r0 = r0.f1405y
                r5 = r0
                r0 = r5
                if (r0 == 0) goto L4f
                r0 = r5
                android.os.Message r0 = android.os.Message.obtain(r0)
                r5 = r0
                goto L51
            L4f:
                r0 = 0
                r5 = r0
            L51:
                r0 = r5
                if (r0 == 0) goto L59
                r0 = r5
                r0.sendToTarget()
            L59:
                r0 = r4
                androidx.appcompat.app.AlertController r0 = r0.f1409b
                r5 = r0
                r0 = r5
                android.os.Handler r0 = r0.f1379R
                r1 = 1
                r2 = r5
                d.g r2 = r2.f1382b
                android.os.Message r0 = r0.obtainMessage(r1, r2)
                r0.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.ViewOnClickListenerC0234a.onClick(android.view.View):void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/app/AlertController$b.class
     */
    /* renamed from: androidx.appcompat.app.AlertController$b */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/app/AlertController$b.class */
    public class C0235b implements NestedScrollView.InterfaceC0392b {

        /* renamed from: a */
        public final View f1410a;

        /* renamed from: b */
        public final View f1411b;

        /* renamed from: c */
        public final AlertController f1412c;

        public C0235b(AlertController alertController, View view, View view2) {
            this.f1412c = alertController;
            this.f1410a = view;
            this.f1411b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.InterfaceC0392b
        /* renamed from: a */
        public void mo846a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
            AlertController.m820g(nestedScrollView, this.f1410a, this.f1411b);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/app/AlertController$c.class
     */
    /* renamed from: androidx.appcompat.app.AlertController$c */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/app/AlertController$c.class */
    public class RunnableC0236c implements Runnable {

        /* renamed from: b */
        public final View f1413b;

        /* renamed from: c */
        public final View f1414c;

        /* renamed from: d */
        public final AlertController f1415d;

        public RunnableC0236c(AlertController alertController, View view, View view2) {
            this.f1415d = alertController;
            this.f1413b = view;
            this.f1414c = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.m820g(this.f1415d.f1362A, this.f1413b, this.f1414c);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/app/AlertController$d.class
     */
    /* renamed from: androidx.appcompat.app.AlertController$d */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/app/AlertController$d.class */
    public class C0237d implements AbsListView.OnScrollListener {

        /* renamed from: a */
        public final View f1416a;

        /* renamed from: b */
        public final View f1417b;

        /* renamed from: c */
        public final AlertController f1418c;

        public C0237d(AlertController alertController, View view, View view2) {
            this.f1418c = alertController;
            this.f1416a = view;
            this.f1417b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
            AlertController.m820g(absListView, this.f1416a, this.f1417b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/app/AlertController$e.class
     */
    /* renamed from: androidx.appcompat.app.AlertController$e */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/app/AlertController$e.class */
    public class RunnableC0238e implements Runnable {

        /* renamed from: b */
        public final View f1419b;

        /* renamed from: c */
        public final View f1420c;

        /* renamed from: d */
        public final AlertController f1421d;

        public RunnableC0238e(AlertController alertController, View view, View view2) {
            this.f1421d = alertController;
            this.f1419b = view;
            this.f1420c = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.m820g(this.f1421d.f1387g, this.f1419b, this.f1420c);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/app/AlertController$f.class
     */
    /* renamed from: androidx.appcompat.app.AlertController$f */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/app/AlertController$f.class */
    public static class C0239f {

        /* renamed from: A */
        public int f1422A;

        /* renamed from: B */
        public int f1423B;

        /* renamed from: C */
        public int f1424C;

        /* renamed from: D */
        public int f1425D;

        /* renamed from: F */
        public boolean[] f1427F;

        /* renamed from: G */
        public boolean f1428G;

        /* renamed from: H */
        public boolean f1429H;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f1431J;

        /* renamed from: K */
        public Cursor f1432K;

        /* renamed from: L */
        public String f1433L;

        /* renamed from: M */
        public String f1434M;

        /* renamed from: N */
        public AdapterView.OnItemSelectedListener f1435N;

        /* renamed from: O */
        public e f1436O;

        /* renamed from: a */
        public final Context f1438a;

        /* renamed from: b */
        public final LayoutInflater f1439b;

        /* renamed from: d */
        public Drawable f1441d;

        /* renamed from: f */
        public CharSequence f1443f;

        /* renamed from: g */
        public View f1444g;

        /* renamed from: h */
        public CharSequence f1445h;

        /* renamed from: i */
        public CharSequence f1446i;

        /* renamed from: j */
        public Drawable f1447j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f1448k;

        /* renamed from: l */
        public CharSequence f1449l;

        /* renamed from: m */
        public Drawable f1450m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f1451n;

        /* renamed from: o */
        public CharSequence f1452o;

        /* renamed from: p */
        public Drawable f1453p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f1454q;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f1456s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f1457t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f1458u;

        /* renamed from: v */
        public CharSequence[] f1459v;

        /* renamed from: w */
        public ListAdapter f1460w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f1461x;

        /* renamed from: y */
        public int f1462y;

        /* renamed from: z */
        public View f1463z;

        /* renamed from: c */
        public int f1440c = 0;

        /* renamed from: e */
        public int f1442e = 0;

        /* renamed from: E */
        public boolean f1426E = false;

        /* renamed from: I */
        public int f1430I = -1;

        /* renamed from: P */
        public boolean f1437P = true;

        /* renamed from: r */
        public boolean f1455r = true;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/appcompat/app/AlertController$f$a.class
         */
        /* renamed from: androidx.appcompat.app.AlertController$f$a */
        /* loaded from: combined.jar:classes1.jar:androidx/appcompat/app/AlertController$f$a.class */
        public class a extends ArrayAdapter<CharSequence> {

            /* renamed from: b */
            public final RecycleListView f1464b;

            /* renamed from: c */
            public final C0239f f1465c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0239f c0239f, Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f1465c = c0239f;
                this.f1464b = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = this.f1465c.f1427F;
                if (zArr != null && zArr[i10]) {
                    this.f1464b.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/appcompat/app/AlertController$f$b.class
         */
        /* renamed from: androidx.appcompat.app.AlertController$f$b */
        /* loaded from: combined.jar:classes1.jar:androidx/appcompat/app/AlertController$f$b.class */
        public class b extends CursorAdapter {

            /* renamed from: b */
            public final int f1466b;

            /* renamed from: c */
            public final int f1467c;

            /* renamed from: d */
            public final RecycleListView f1468d;

            /* renamed from: e */
            public final AlertController f1469e;

            /* renamed from: f */
            public final C0239f f1470f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C0239f c0239f, Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f1470f = c0239f;
                this.f1468d = recycleListView;
                this.f1469e = alertController;
                Cursor cursor2 = getCursor();
                this.f1466b = cursor2.getColumnIndexOrThrow(c0239f.f1433L);
                this.f1467c = cursor2.getColumnIndexOrThrow(c0239f.f1434M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f1466b));
                RecycleListView recycleListView = this.f1468d;
                int position = cursor.getPosition();
                boolean z10 = true;
                if (cursor.getInt(this.f1467c) != 1) {
                    z10 = false;
                }
                recycleListView.setItemChecked(position, z10);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return this.f1470f.f1439b.inflate(this.f1469e.f1374M, viewGroup, false);
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/appcompat/app/AlertController$f$c.class
         */
        /* renamed from: androidx.appcompat.app.AlertController$f$c */
        /* loaded from: combined.jar:classes1.jar:androidx/appcompat/app/AlertController$f$c.class */
        public class c implements AdapterView.OnItemClickListener {

            /* renamed from: b */
            public final AlertController f1471b;

            /* renamed from: c */
            public final C0239f f1472c;

            public c(C0239f c0239f, AlertController alertController) {
                this.f1472c = c0239f;
                this.f1471b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                this.f1472c.f1461x.onClick(this.f1471b.f1382b, i10);
                if (this.f1472c.f1429H) {
                    return;
                }
                this.f1471b.f1382b.dismiss();
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/appcompat/app/AlertController$f$d.class
         */
        /* renamed from: androidx.appcompat.app.AlertController$f$d */
        /* loaded from: combined.jar:classes1.jar:androidx/appcompat/app/AlertController$f$d.class */
        public class d implements AdapterView.OnItemClickListener {

            /* renamed from: b */
            public final RecycleListView f1473b;

            /* renamed from: c */
            public final AlertController f1474c;

            /* renamed from: d */
            public final C0239f f1475d;

            public d(C0239f c0239f, RecycleListView recycleListView, AlertController alertController) {
                this.f1475d = c0239f;
                this.f1473b = recycleListView;
                this.f1474c = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                boolean[] zArr = this.f1475d.f1427F;
                if (zArr != null) {
                    zArr[i10] = this.f1473b.isItemChecked(i10);
                }
                this.f1475d.f1431J.onClick(this.f1474c.f1382b, i10, this.f1473b.isItemChecked(i10));
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/appcompat/app/AlertController$f$e.class
         */
        /* renamed from: androidx.appcompat.app.AlertController$f$e */
        /* loaded from: combined.jar:classes1.jar:androidx/appcompat/app/AlertController$f$e.class */
        public interface e {
            /* renamed from: a */
            void m849a(ListView listView);
        }

        public C0239f(Context context) {
            this.f1438a = context;
            this.f1439b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* renamed from: a */
        public void m847a(AlertController alertController) {
            View view = this.f1444g;
            if (view != null) {
                alertController.m831m(view);
            } else {
                CharSequence charSequence = this.f1443f;
                if (charSequence != null) {
                    alertController.m836r(charSequence);
                }
                Drawable drawable = this.f1441d;
                if (drawable != null) {
                    alertController.m833o(drawable);
                }
                int i10 = this.f1440c;
                if (i10 != 0) {
                    alertController.m832n(i10);
                }
                int i11 = this.f1442e;
                if (i11 != 0) {
                    alertController.m832n(alertController.m823d(i11));
                }
            }
            CharSequence charSequence2 = this.f1445h;
            if (charSequence2 != null) {
                alertController.m834p(charSequence2);
            }
            CharSequence charSequence3 = this.f1446i;
            if (charSequence3 != null || this.f1447j != null) {
                alertController.m830l(-1, charSequence3, this.f1448k, null, this.f1447j);
            }
            CharSequence charSequence4 = this.f1449l;
            if (charSequence4 != null || this.f1450m != null) {
                alertController.m830l(-2, charSequence4, this.f1451n, null, this.f1450m);
            }
            CharSequence charSequence5 = this.f1452o;
            if (charSequence5 != null || this.f1453p != null) {
                alertController.m830l(-3, charSequence5, this.f1454q, null, this.f1453p);
            }
            if (this.f1459v != null || this.f1432K != null || this.f1460w != null) {
                m848b(alertController);
            }
            View view2 = this.f1463z;
            if (view2 != null) {
                if (this.f1426E) {
                    alertController.m839u(view2, this.f1422A, this.f1423B, this.f1424C, this.f1425D);
                    return;
                } else {
                    alertController.m838t(view2);
                    return;
                }
            }
            int i12 = this.f1462y;
            if (i12 != 0) {
                alertController.m837s(i12);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x010e  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0124  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m848b(androidx.appcompat.app.AlertController r12) {
            /*
                Method dump skipped, instructions count: 312
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0239f.m848b(androidx.appcompat.app.AlertController):void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/app/AlertController$g.class
     */
    /* renamed from: androidx.appcompat.app.AlertController$g */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/app/AlertController$g.class */
    public static final class HandlerC0240g extends Handler {

        /* renamed from: a */
        public WeakReference<DialogInterface> f1476a;

        public HandlerC0240g(DialogInterface dialogInterface) {
            this.f1476a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f1476a.get(), message.what);
            } else {
                if (i10 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/app/AlertController$h.class
     */
    /* renamed from: androidx.appcompat.app.AlertController$h */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/app/AlertController$h.class */
    public static class C0241h extends ArrayAdapter<CharSequence> {
        public C0241h(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, DialogC4281g dialogC4281g, Window window) {
        this.f1381a = context;
        this.f1382b = dialogC4281g;
        this.f1383c = window;
        this.f1379R = new HandlerC0240g(dialogC4281g);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C0929j.f6307F, C0920a.f6119n, 0);
        this.f1371J = obtainStyledAttributes.getResourceId(C0929j.f6312G, 0);
        this.f1372K = obtainStyledAttributes.getResourceId(C0929j.f6322I, 0);
        this.f1373L = obtainStyledAttributes.getResourceId(C0929j.f6332K, 0);
        this.f1374M = obtainStyledAttributes.getResourceId(C0929j.f6337L, 0);
        this.f1375N = obtainStyledAttributes.getResourceId(C0929j.f6347N, 0);
        this.f1376O = obtainStyledAttributes.getResourceId(C0929j.f6327J, 0);
        this.f1377P = obtainStyledAttributes.getBoolean(C0929j.f6342M, true);
        this.f1384d = obtainStyledAttributes.getDimensionPixelSize(C0929j.f6317H, 0);
        obtainStyledAttributes.recycle();
        dialogC4281g.m21649d(1);
    }

    /* renamed from: A */
    public static boolean m818A(Context context) {
        TypedValue typedValue = new TypedValue();
        boolean z10 = true;
        context.getTheme().resolveAttribute(C0920a.f6118m, typedValue, true);
        if (typedValue.data == 0) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: a */
    public static boolean m819a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            int i10 = childCount - 1;
            childCount = i10;
            if (m819a(viewGroup.getChildAt(i10))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static void m820g(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    /* renamed from: b */
    public final void m821b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: c */
    public Button m822c(int i10) {
        if (i10 == -3) {
            return this.f1403w;
        }
        if (i10 == -2) {
            return this.f1399s;
        }
        if (i10 != -1) {
            return null;
        }
        return this.f1395o;
    }

    /* renamed from: d */
    public int m823d(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f1381a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: e */
    public ListView m824e() {
        return this.f1387g;
    }

    /* renamed from: f */
    public void m825f() {
        this.f1382b.setContentView(m829k());
        m844z();
    }

    /* renamed from: h */
    public boolean m826h(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1362A;
        return nestedScrollView != null && nestedScrollView.m1925q(keyEvent);
    }

    /* renamed from: i */
    public boolean m827i(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1362A;
        return nestedScrollView != null && nestedScrollView.m1925q(keyEvent);
    }

    /* renamed from: j */
    public final ViewGroup m828j(View view, View view2) {
        if (view == null) {
            View view3 = view2;
            if (view2 instanceof ViewStub) {
                view3 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view3;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        View view4 = view;
        if (view instanceof ViewStub) {
            view4 = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view4;
    }

    /* renamed from: k */
    public final int m829k() {
        int i10 = this.f1372K;
        if (i10 != 0 && this.f1378Q == 1) {
            return i10;
        }
        return this.f1371J;
    }

    /* renamed from: l */
    public void m830l(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        Message message2 = message;
        if (message == null) {
            message2 = message;
            if (onClickListener != null) {
                message2 = this.f1379R.obtainMessage(i10, onClickListener);
            }
        }
        if (i10 == -3) {
            this.f1404x = charSequence;
            this.f1405y = message2;
            this.f1406z = drawable;
        } else if (i10 == -2) {
            this.f1400t = charSequence;
            this.f1401u = message2;
            this.f1402v = drawable;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f1396p = charSequence;
            this.f1397q = message2;
            this.f1398r = drawable;
        }
    }

    /* renamed from: m */
    public void m831m(View view) {
        this.f1368G = view;
    }

    /* renamed from: n */
    public void m832n(int i10) {
        this.f1364C = null;
        this.f1363B = i10;
        ImageView imageView = this.f1365D;
        if (imageView != null) {
            if (i10 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f1365D.setImageResource(this.f1363B);
            }
        }
    }

    /* renamed from: o */
    public void m833o(Drawable drawable) {
        this.f1364C = drawable;
        this.f1363B = 0;
        ImageView imageView = this.f1365D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f1365D.setImageDrawable(drawable);
            }
        }
    }

    /* renamed from: p */
    public void m834p(CharSequence charSequence) {
        this.f1386f = charSequence;
        TextView textView = this.f1367F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: q */
    public final void m835q(ViewGroup viewGroup, View view, int i10, int i11) {
        View view2;
        View view3;
        Runnable runnableC0238e;
        View findViewById = this.f1383c.findViewById(C0925f.f6238v);
        View findViewById2 = this.f1383c.findViewById(C0925f.f6237u);
        if (Build.VERSION.SDK_INT < 23) {
            View view4 = findViewById;
            if (findViewById != null) {
                view4 = findViewById;
                if ((i10 & 1) == 0) {
                    viewGroup.removeView(findViewById);
                    view4 = null;
                }
            }
            view2 = findViewById2;
            if (findViewById2 != null) {
                view2 = findViewById2;
                if ((i10 & 2) == 0) {
                    viewGroup.removeView(findViewById2);
                    view2 = null;
                }
            }
            if (view4 == null && view2 == null) {
                return;
            }
            if (this.f1386f != null) {
                this.f1362A.setOnScrollChangeListener(new C0235b(this, view4, view2));
                view3 = this.f1362A;
                runnableC0238e = new RunnableC0236c(this, view4, view2);
            } else {
                ListView listView = this.f1387g;
                if (listView != null) {
                    listView.setOnScrollListener(new C0237d(this, view4, view2));
                    view3 = this.f1387g;
                    runnableC0238e = new RunnableC0238e(this, view4, view2);
                } else {
                    if (view4 != null) {
                        viewGroup.removeView(view4);
                    }
                    if (view2 == null) {
                        return;
                    }
                }
            }
            view3.post(runnableC0238e);
            return;
        }
        C6824g0.m31476D0(view, i10, i11);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 == null) {
            return;
        } else {
            view2 = findViewById2;
        }
        viewGroup.removeView(view2);
    }

    /* renamed from: r */
    public void m836r(CharSequence charSequence) {
        this.f1385e = charSequence;
        TextView textView = this.f1366E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: s */
    public void m837s(int i10) {
        this.f1388h = null;
        this.f1389i = i10;
        this.f1394n = false;
    }

    /* renamed from: t */
    public void m838t(View view) {
        this.f1388h = view;
        this.f1389i = 0;
        this.f1394n = false;
    }

    /* renamed from: u */
    public void m839u(View view, int i10, int i11, int i12, int i13) {
        this.f1388h = view;
        this.f1389i = 0;
        this.f1394n = true;
        this.f1390j = i10;
        this.f1391k = i11;
        this.f1392l = i12;
        this.f1393m = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: v */
    public final void m840v(ViewGroup viewGroup) {
        boolean z10;
        boolean z11;
        boolean z12;
        Button button;
        Button button2 = (Button) viewGroup.findViewById(R.id.button1);
        this.f1395o = button2;
        button2.setOnClickListener(this.f1380S);
        if (TextUtils.isEmpty(this.f1396p) && this.f1398r == null) {
            this.f1395o.setVisibility(8);
            z10 = false;
        } else {
            this.f1395o.setText(this.f1396p);
            Drawable drawable = this.f1398r;
            if (drawable != null) {
                int i10 = this.f1384d;
                drawable.setBounds(0, 0, i10, i10);
                this.f1395o.setCompoundDrawables(this.f1398r, null, null, null);
            }
            this.f1395o.setVisibility(0);
            z10 = true;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button2);
        this.f1399s = button3;
        button3.setOnClickListener(this.f1380S);
        if (TextUtils.isEmpty(this.f1400t) && this.f1402v == null) {
            this.f1399s.setVisibility(8);
            z11 = z10;
        } else {
            this.f1399s.setText(this.f1400t);
            Drawable drawable2 = this.f1402v;
            if (drawable2 != null) {
                int i11 = this.f1384d;
                drawable2.setBounds(0, 0, i11, i11);
                this.f1399s.setCompoundDrawables(this.f1402v, null, null, null);
            }
            this.f1399s.setVisibility(0);
            z11 = ((z10 ? 1 : 0) | 2) == true ? 1 : 0;
        }
        Button button4 = (Button) viewGroup.findViewById(R.id.button3);
        this.f1403w = button4;
        button4.setOnClickListener(this.f1380S);
        if (TextUtils.isEmpty(this.f1404x) && this.f1406z == null) {
            this.f1403w.setVisibility(8);
            z12 = z11;
        } else {
            this.f1403w.setText(this.f1404x);
            Drawable drawable3 = this.f1406z;
            if (drawable3 != null) {
                int i12 = this.f1384d;
                drawable3.setBounds(0, 0, i12, i12);
                this.f1403w.setCompoundDrawables(this.f1406z, null, null, null);
            }
            this.f1403w.setVisibility(0);
            z12 = ((z11 ? 1 : 0) | 4) == true ? 1 : 0;
        }
        if (m818A(this.f1381a)) {
            if (z12) {
                button = this.f1395o;
            } else if (z12 == 2) {
                button = this.f1399s;
            } else if (z12 == 4) {
                button = this.f1403w;
            }
            m821b(button);
        }
        if (z12) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: w */
    public final void m841w(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f1383c.findViewById(C0925f.f6239w);
        this.f1362A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f1362A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f1367F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f1386f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f1362A.removeView(this.f1367F);
        if (this.f1387g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f1362A.getParent();
        int indexOfChild = viewGroup2.indexOfChild(this.f1362A);
        viewGroup2.removeViewAt(indexOfChild);
        viewGroup2.addView(this.f1387g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    /* renamed from: x */
    public final void m842x(ViewGroup viewGroup) {
        View view = this.f1388h;
        boolean z10 = false;
        if (view == null) {
            view = this.f1389i != 0 ? LayoutInflater.from(this.f1381a).inflate(this.f1389i, viewGroup, false) : null;
        }
        if (view != null) {
            z10 = true;
        }
        if (!z10 || !m819a(view)) {
            this.f1383c.setFlags(131072, 131072);
        }
        if (!z10) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f1383c.findViewById(C0925f.f6230n);
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        if (this.f1394n) {
            frameLayout.setPadding(this.f1390j, this.f1391k, this.f1392l, this.f1393m);
        }
        if (this.f1387g != null) {
            ((LinearLayout.LayoutParams) ((C0351s0.a) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [android.view.View] */
    /* renamed from: y */
    public final void m843y(ViewGroup viewGroup) {
        if (this.f1368G != null) {
            viewGroup.addView(this.f1368G, 0, new ViewGroup.LayoutParams(-1, -2));
            viewGroup = this.f1383c.findViewById(C0925f.f6215O);
        } else {
            this.f1365D = (ImageView) this.f1383c.findViewById(R.id.icon);
            if ((!TextUtils.isEmpty(this.f1385e)) && this.f1377P) {
                TextView textView = (TextView) this.f1383c.findViewById(C0925f.f6226j);
                this.f1366E = textView;
                textView.setText(this.f1385e);
                int i10 = this.f1363B;
                if (i10 != 0) {
                    this.f1365D.setImageResource(i10);
                    return;
                }
                Drawable drawable = this.f1364C;
                if (drawable != null) {
                    this.f1365D.setImageDrawable(drawable);
                    return;
                } else {
                    this.f1366E.setPadding(this.f1365D.getPaddingLeft(), this.f1365D.getPaddingTop(), this.f1365D.getPaddingRight(), this.f1365D.getPaddingBottom());
                    this.f1365D.setVisibility(8);
                    return;
                }
            }
            this.f1383c.findViewById(C0925f.f6215O).setVisibility(8);
            this.f1365D.setVisibility(8);
        }
        viewGroup.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: z */
    public final void m844z() {
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        View findViewById3 = this.f1383c.findViewById(C0925f.f6236t);
        int i10 = C0925f.f6216P;
        View findViewById4 = findViewById3.findViewById(i10);
        int i11 = C0925f.f6229m;
        View findViewById5 = findViewById3.findViewById(i11);
        int i12 = C0925f.f6227k;
        View findViewById6 = findViewById3.findViewById(i12);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(C0925f.f6231o);
        m842x(viewGroup);
        View findViewById7 = viewGroup.findViewById(i10);
        View findViewById8 = viewGroup.findViewById(i11);
        View findViewById9 = viewGroup.findViewById(i12);
        ViewGroup m828j = m828j(findViewById7, findViewById4);
        ViewGroup m828j2 = m828j(findViewById8, findViewById5);
        ViewGroup m828j3 = m828j(findViewById9, findViewById6);
        m841w(m828j2);
        m840v(m828j3);
        m843y(m828j);
        boolean z10 = viewGroup.getVisibility() != 8;
        int i13 = (m828j == null || m828j.getVisibility() == 8) ? 0 : 1;
        boolean z11 = (m828j3 == null || m828j3.getVisibility() == 8) ? false : true;
        if (!z11 && m828j2 != null && (findViewById2 = m828j2.findViewById(C0925f.f6211K)) != null) {
            findViewById2.setVisibility(0);
        }
        if (i13 != 0) {
            NestedScrollView nestedScrollView = this.f1362A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (this.f1386f != null || this.f1387g != null) {
                view = m828j.findViewById(C0925f.f6214N);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (m828j2 != null && (findViewById = m828j2.findViewById(C0925f.f6212L)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f1387g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).m845a(i13, z11);
        }
        if (!z10) {
            View view2 = this.f1387g;
            if (view2 == null) {
                view2 = this.f1362A;
            }
            if (view2 != null) {
                int i14 = 0;
                if (z11) {
                    i14 = 2;
                }
                m835q(m828j2, view2, i13 | i14, 3);
            }
        }
        ListView listView2 = this.f1387g;
        if (listView2 == null || (listAdapter = this.f1369H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i15 = this.f1370I;
        if (i15 > -1) {
            listView2.setItemChecked(i15, true);
            listView2.setSelection(i15);
        }
    }
}

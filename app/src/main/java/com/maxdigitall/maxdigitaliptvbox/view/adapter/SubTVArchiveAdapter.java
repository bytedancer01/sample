package com.maxdigitall.maxdigitaliptvbox.view.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0304c1;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.maxdigitall.maxdigitaliptvbox.model.database.ExternalPlayerDataBase;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.ExternalPlayerModelClass;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.XMLTVProgrammePojo;
import com.maxdigitall.maxdigitaliptvbox.view.activity.PlayExternalPlayerActivity;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import p151if.C5255e;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SubTVArchiveAdapter.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SubTVArchiveAdapter.class */
public class SubTVArchiveAdapter extends RecyclerView.AbstractC0677h<MyViewHolder> {

    /* renamed from: r */
    public static SharedPreferences f20913r;

    /* renamed from: e */
    public final int f20914e;

    /* renamed from: f */
    public final String f20915f;

    /* renamed from: g */
    public final boolean f20916g;

    /* renamed from: h */
    public final String f20917h;

    /* renamed from: i */
    public final String f20918i;

    /* renamed from: j */
    public final String f20919j;

    /* renamed from: k */
    public final String f20920k;

    /* renamed from: l */
    public final String f20921l;

    /* renamed from: m */
    public final String f20922m;

    /* renamed from: n */
    public Context f20923n;

    /* renamed from: o */
    public ArrayList<XMLTVProgrammePojo> f20924o;

    /* renamed from: p */
    public SharedPreferences f20925p;

    /* renamed from: q */
    public String f20926q = new SimpleDateFormat("dd-MMM-yyyy", Locale.US).format(new Date());

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SubTVArchiveAdapter$MyViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SubTVArchiveAdapter$MyViewHolder.class */
    public static class MyViewHolder extends RecyclerView.AbstractC0674e0 {

        @BindView
        public LinearLayout ll_main_layout;

        @BindView
        public RelativeLayout rl_archive_layout;

        @BindView
        public TextView tvChannelName;

        @BindView
        public TextView tvDateTime;

        @BindView
        public TextView tvNowPlaying;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.m5627b(this, view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SubTVArchiveAdapter$MyViewHolder_ViewBinding.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SubTVArchiveAdapter$MyViewHolder_ViewBinding.class */
    public class MyViewHolder_ViewBinding implements Unbinder {

        /* renamed from: b */
        public MyViewHolder f20927b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f20927b = myViewHolder;
            myViewHolder.tvDateTime = (TextView) C8522c.m36739c(view, 2131429410, "field 'tvDateTime'", TextView.class);
            myViewHolder.tvChannelName = (TextView) C8522c.m36739c(view, 2131429384, "field 'tvChannelName'", TextView.class);
            myViewHolder.tvNowPlaying = (TextView) C8522c.m36739c(view, 2131429546, "field 'tvNowPlaying'", TextView.class);
            myViewHolder.rl_archive_layout = (RelativeLayout) C8522c.m36739c(view, 2131428951, "field 'rl_archive_layout'", RelativeLayout.class);
            myViewHolder.ll_main_layout = (LinearLayout) C8522c.m36739c(view, 2131428436, "field 'll_main_layout'", LinearLayout.class);
        }

        @Override // butterknife.Unbinder
        /* renamed from: a */
        public void mo5629a() {
            MyViewHolder myViewHolder = this.f20927b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f20927b = null;
            myViewHolder.tvDateTime = null;
            myViewHolder.tvChannelName = null;
            myViewHolder.tvNowPlaying = null;
            myViewHolder.rl_archive_layout = null;
            myViewHolder.ll_main_layout = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SubTVArchiveAdapter$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SubTVArchiveAdapter$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SubTVArchiveAdapter$a.class */
    public class ViewOnClickListenerC3524a implements View.OnClickListener {

        /* renamed from: b */
        public final String f20928b;

        /* renamed from: c */
        public final String f20929c;

        /* renamed from: d */
        public final String f20930d;

        /* renamed from: e */
        public final SubTVArchiveAdapter f20931e;

        public ViewOnClickListenerC3524a(SubTVArchiveAdapter subTVArchiveAdapter, String str, String str2, String str3) {
            this.f20931e = subTVArchiveAdapter;
            this.f20928b = str;
            this.f20929c = str2;
            this.f20930d = str3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i10;
            try {
                i10 = Integer.parseInt(this.f20931e.f20917h);
            } catch (NumberFormatException e10) {
                i10 = -1;
            }
            SubTVArchiveAdapter subTVArchiveAdapter = this.f20931e;
            subTVArchiveAdapter.m17493o0(view, subTVArchiveAdapter.f20923n, this.f20928b, i10, this.f20931e.f20918i, this.f20931e.f20919j, this.f20931e.f20921l, this.f20931e.f20920k, this.f20929c, this.f20931e.f20922m, this.f20930d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SubTVArchiveAdapter$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SubTVArchiveAdapter$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SubTVArchiveAdapter$b.class */
    public class ViewOnClickListenerC3525b implements View.OnClickListener {

        /* renamed from: b */
        public final String f20932b;

        /* renamed from: c */
        public final String f20933c;

        /* renamed from: d */
        public final String f20934d;

        /* renamed from: e */
        public final SubTVArchiveAdapter f20935e;

        public ViewOnClickListenerC3525b(SubTVArchiveAdapter subTVArchiveAdapter, String str, String str2, String str3) {
            this.f20935e = subTVArchiveAdapter;
            this.f20932b = str;
            this.f20933c = str2;
            this.f20934d = str3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i10;
            try {
                i10 = Integer.parseInt(this.f20935e.f20917h);
            } catch (NumberFormatException e10) {
                i10 = -1;
            }
            C5255e.m26218U(this.f20935e.f20923n, this.f20932b, i10, this.f20935e.f20918i, this.f20935e.f20919j, this.f20935e.f20921l, this.f20935e.f20920k, this.f20933c, this.f20935e.f20922m, this.f20934d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SubTVArchiveAdapter$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SubTVArchiveAdapter$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SubTVArchiveAdapter$c.class */
    public class C3526c implements C0304c1.d {

        /* renamed from: a */
        public final ArrayList f20936a;

        /* renamed from: b */
        public final Context f20937b;

        /* renamed from: c */
        public final String f20938c;

        /* renamed from: d */
        public final int f20939d;

        /* renamed from: e */
        public final String f20940e;

        /* renamed from: f */
        public final String f20941f;

        /* renamed from: g */
        public final String f20942g;

        /* renamed from: h */
        public final String f20943h;

        /* renamed from: i */
        public final String f20944i;

        /* renamed from: j */
        public final String f20945j;

        /* renamed from: k */
        public final String f20946k;

        /* renamed from: l */
        public final SubTVArchiveAdapter f20947l;

        public C3526c(SubTVArchiveAdapter subTVArchiveAdapter, ArrayList arrayList, Context context, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f20947l = subTVArchiveAdapter;
            this.f20936a = arrayList;
            this.f20937b = context;
            this.f20938c = str;
            this.f20939d = i10;
            this.f20940e = str2;
            this.f20941f = str3;
            this.f20942g = str4;
            this.f20943h = str5;
            this.f20944i = str6;
            this.f20945j = str7;
            this.f20946k = str8;
        }

        @Override // androidx.appcompat.widget.C0304c1.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                ArrayList arrayList = this.f20936a;
                if (arrayList != null && arrayList.size() > 0) {
                    for (int i10 = 0; i10 < this.f20936a.size(); i10++) {
                        if (menuItem.getItemId() == i10) {
                            if (menuItem.getItemId() == 0) {
                                C5255e.m26218U(this.f20937b, this.f20938c, this.f20939d, this.f20940e, this.f20941f, this.f20942g, this.f20943h, this.f20944i, this.f20945j, this.f20946k);
                            } else {
                                String m26201D = C5255e.m26201D(this.f20937b, this.f20939d, this.f20944i, this.f20946k);
                                Intent intent = new Intent(this.f20937b, (Class<?>) PlayExternalPlayerActivity.class);
                                intent.putExtra("url", m26201D);
                                intent.putExtra("app_name", ((ExternalPlayerModelClass) this.f20936a.get(i10)).m15415a());
                                intent.putExtra("packagename", ((ExternalPlayerModelClass) this.f20936a.get(i10)).m15416b());
                                this.f20937b.startActivity(intent);
                            }
                        }
                    }
                }
                return false;
            } catch (Exception e10) {
                return false;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SubTVArchiveAdapter$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SubTVArchiveAdapter$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SubTVArchiveAdapter$d.class */
    public class C3527d implements C0304c1.c {

        /* renamed from: a */
        public final SubTVArchiveAdapter f20948a;

        public C3527d(SubTVArchiveAdapter subTVArchiveAdapter) {
            this.f20948a = subTVArchiveAdapter;
        }

        @Override // androidx.appcompat.widget.C0304c1.c
        /* renamed from: a */
        public void mo1281a(C0304c1 c0304c1) {
        }
    }

    public SubTVArchiveAdapter(ArrayList arrayList, int i10, boolean z10, String str, String str2, String str3, String str4, String str5, String str6, String str7, Context context) {
        this.f20924o = arrayList;
        this.f20923n = context;
        this.f20914e = i10;
        this.f20915f = str;
        this.f20916g = z10;
        this.f20917h = str2;
        this.f20918i = str3;
        this.f20919j = str4;
        this.f20920k = str5;
        this.f20921l = str6;
        this.f20922m = str7;
    }

    /* renamed from: l0 */
    public final long m17490l0(String str, String str2) {
        long j10;
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        new Date(System.currentTimeMillis());
        new SimpleDateFormat("yyyy-MM-dd", locale);
        try {
            j10 = simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime();
        } catch (ParseException e10) {
            e10.printStackTrace();
            j10 = -1;
        }
        return (j10 / 1000) / 60;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    @SuppressLint({"SetTextI18n"})
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public void mo2996G(MyViewHolder myViewHolder, int i10) {
        RelativeLayout relativeLayout;
        Resources resources;
        int color;
        try {
            Context context = this.f20923n;
            if (context != null) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("selectedPlayer", 0);
                this.f20925p = sharedPreferences;
                String string = sharedPreferences.getString("selectedPlayer", "");
                String m15512j = this.f20924o.get(i10).m15512j();
                String m15514l = this.f20924o.get(i10).m15514l();
                SharedPreferences sharedPreferences2 = this.f20923n.getSharedPreferences("timeFormat", 0);
                f20913r = sharedPreferences2;
                new SimpleDateFormat(sharedPreferences2.getString("timeFormat", ""), Locale.US);
                String m26256w = C5255e.m26256w(m15512j, this.f20923n);
                String m26256w2 = C5255e.m26256w(m15514l, this.f20923n);
                DateFormat.getInstance();
                String valueOf = String.valueOf(m17490l0(m15512j, m15514l));
                String m17494p0 = m17494p0(m15512j);
                String str = new String(Base64.decode(this.f20924o.get(i10).m15515m(), 0), StandardCharsets.UTF_8);
                myViewHolder.tvDateTime.setText(m26256w + " - " + m26256w2);
                myViewHolder.tvChannelName.setText(str);
                String str2 = this.f20926q;
                if (str2 == null || !str2.equals(this.f20915f)) {
                    relativeLayout = myViewHolder.rl_archive_layout;
                    resources = this.f20923n.getResources();
                } else {
                    if (i10 == this.f20914e && this.f20916g) {
                        relativeLayout = myViewHolder.rl_archive_layout;
                        color = this.f20923n.getResources().getColor(2131099692);
                        relativeLayout.setBackgroundColor(color);
                        myViewHolder.rl_archive_layout.setOnClickListener(new ViewOnClickListenerC3524a(this, string, m17494p0, valueOf));
                        myViewHolder.ll_main_layout.setOnClickListener(new ViewOnClickListenerC3525b(this, string, m17494p0, valueOf));
                    }
                    relativeLayout = myViewHolder.rl_archive_layout;
                    resources = this.f20923n.getResources();
                }
                color = resources.getColor(2131100146);
                relativeLayout.setBackgroundColor(color);
                myViewHolder.rl_archive_layout.setOnClickListener(new ViewOnClickListenerC3524a(this, string, m17494p0, valueOf));
                myViewHolder.ll_main_layout.setOnClickListener(new ViewOnClickListenerC3525b(this, string, m17494p0, valueOf));
            }
        } catch (Exception e10) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        return this.f20924o.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder mo2998J(ViewGroup viewGroup, int i10) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131624328, viewGroup, false);
        if (inflate != null) {
            inflate.setFocusable(true);
        }
        return new MyViewHolder(inflate);
    }

    /* renamed from: o0 */
    public final void m17493o0(View view, Context context, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        C0304c1 c0304c1 = new C0304c1(context, view);
        c0304c1.m1276c().inflate(2131689489, c0304c1.m1275b());
        ArrayList<ExternalPlayerModelClass> m15132o = new ExternalPlayerDataBase(context).m15132o();
        try {
            if (m15132o != null) {
                try {
                    if (m15132o.size() > 0) {
                        c0304c1.m1275b().add(0, 0, 0, context.getResources().getString(2132018170));
                        ExternalPlayerModelClass externalPlayerModelClass = new ExternalPlayerModelClass();
                        externalPlayerModelClass.m15419e(0);
                        externalPlayerModelClass.m15418d(context.getResources().getString(2132018328));
                        arrayList.add(externalPlayerModelClass);
                        int i11 = 0;
                        while (true) {
                            int i12 = i11;
                            if (i12 >= m15132o.size()) {
                                break;
                            }
                            Menu m1275b = c0304c1.m1275b();
                            int i13 = i12 + 1;
                            m1275b.add(0, i13, 0, context.getResources().getString(2132018328) + " " + m15132o.get(i12).m15415a());
                            arrayList.add(m15132o.get(i12));
                            i11 = i13;
                        }
                        c0304c1.m1279f(new C3526c(this, arrayList, context, str, i10, str2, str3, str4, str5, str6, str7, str8));
                        c0304c1.m1278e(new C3527d(this));
                        c0304c1.m1280g();
                    }
                } catch (Exception e10) {
                    return;
                }
            }
            C5255e.m26218U(context, str, i10, str2, str3, str4, str5, str6, str7, str8);
        } catch (Exception e11) {
        }
    }

    /* renamed from: p0 */
    public final String m17494p0(String str) {
        String str2;
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        new Date(System.currentTimeMillis());
        try {
            str2 = new SimpleDateFormat("yyyy-MM-dd:HH-mm", locale).format(simpleDateFormat.parse(str));
        } catch (ParseException e10) {
            e10.printStackTrace();
            str2 = null;
        }
        return str2;
    }
}

package com.maxdigitall.maxdigitaliptvbox.view.adapter;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0304c1;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsActivity;
import java.util.ArrayList;
import java.util.List;
import p151if.C5251a;
import p151if.C5255e;
import p316s2.C8522c;
import p428yg.C10014t;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SubCategoriesChildAdapter.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SubCategoriesChildAdapter.class */
public class SubCategoriesChildAdapter extends RecyclerView.AbstractC0677h<MyViewHolder> {

    /* renamed from: e */
    public Context f20846e;

    /* renamed from: f */
    public List<LiveStreamsDBModel> f20847f;

    /* renamed from: g */
    public SharedPreferences f20848g;

    /* renamed from: h */
    public List<LiveStreamsDBModel> f20849h;

    /* renamed from: i */
    public List<LiveStreamsDBModel> f20850i;

    /* renamed from: j */
    public DatabaseHandler f20851j;

    /* renamed from: k */
    public LiveStreamsDBModel f20852k;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SubCategoriesChildAdapter$MyViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SubCategoriesChildAdapter$MyViewHolder.class */
    public static class MyViewHolder extends RecyclerView.AbstractC0674e0 {

        @BindView
        public RelativeLayout Movie;

        @BindView
        public ImageView MovieImage;

        @BindView
        public TextView MovieName;

        @BindView
        public RelativeLayout cardView;

        @BindView
        public ImageView ivFavourite;

        @BindView
        public LinearLayout llMenu;

        @BindView
        public TextView movieNameTV;

        @BindView
        public TextView tvStreamOptions;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.m5627b(this, view);
            m4048L(false);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SubCategoriesChildAdapter$MyViewHolder_ViewBinding.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SubCategoriesChildAdapter$MyViewHolder_ViewBinding.class */
    public class MyViewHolder_ViewBinding implements Unbinder {

        /* renamed from: b */
        public MyViewHolder f20853b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f20853b = myViewHolder;
            myViewHolder.MovieName = (TextView) C8522c.m36739c(view, 2131429519, "field 'MovieName'", TextView.class);
            myViewHolder.Movie = (RelativeLayout) C8522c.m36739c(view, 2131429012, "field 'Movie'", RelativeLayout.class);
            myViewHolder.movieNameTV = (TextView) C8522c.m36739c(view, 2131429520, "field 'movieNameTV'", TextView.class);
            myViewHolder.MovieImage = (ImageView) C8522c.m36739c(view, 2131428200, "field 'MovieImage'", ImageView.class);
            myViewHolder.cardView = (RelativeLayout) C8522c.m36739c(view, 2131427703, "field 'cardView'", RelativeLayout.class);
            myViewHolder.tvStreamOptions = (TextView) C8522c.m36739c(view, 2131429619, "field 'tvStreamOptions'", TextView.class);
            myViewHolder.ivFavourite = (ImageView) C8522c.m36739c(view, 2131428179, "field 'ivFavourite'", ImageView.class);
            myViewHolder.llMenu = (LinearLayout) C8522c.m36739c(view, 2131428441, "field 'llMenu'", LinearLayout.class);
        }

        @Override // butterknife.Unbinder
        /* renamed from: a */
        public void mo5629a() {
            MyViewHolder myViewHolder = this.f20853b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f20853b = null;
            myViewHolder.MovieName = null;
            myViewHolder.Movie = null;
            myViewHolder.movieNameTV = null;
            myViewHolder.MovieImage = null;
            myViewHolder.cardView = null;
            myViewHolder.tvStreamOptions = null;
            myViewHolder.ivFavourite = null;
            myViewHolder.llMenu = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SubCategoriesChildAdapter$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SubCategoriesChildAdapter$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SubCategoriesChildAdapter$a.class */
    public class ViewOnClickListenerC3517a implements View.OnClickListener {

        /* renamed from: b */
        public final String f20854b;

        /* renamed from: c */
        public final int f20855c;

        /* renamed from: d */
        public final String f20856d;

        /* renamed from: e */
        public final String f20857e;

        /* renamed from: f */
        public final String f20858f;

        /* renamed from: g */
        public final String f20859g;

        /* renamed from: h */
        public final SubCategoriesChildAdapter f20860h;

        public ViewOnClickListenerC3517a(SubCategoriesChildAdapter subCategoriesChildAdapter, String str, int i10, String str2, String str3, String str4, String str5) {
            this.f20860h = subCategoriesChildAdapter;
            this.f20854b = str;
            this.f20855c = i10;
            this.f20856d = str2;
            this.f20857e = str3;
            this.f20858f = str4;
            this.f20859g = str5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26220W(this.f20860h.f20846e, this.f20854b, this.f20855c, this.f20856d, this.f20857e, this.f20858f, this.f20859g, "", 0);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SubCategoriesChildAdapter$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SubCategoriesChildAdapter$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SubCategoriesChildAdapter$b.class */
    public class ViewOnClickListenerC3518b implements View.OnClickListener {

        /* renamed from: b */
        public final int f20861b;

        /* renamed from: c */
        public final String f20862c;

        /* renamed from: d */
        public final String f20863d;

        /* renamed from: e */
        public final String f20864e;

        /* renamed from: f */
        public final String f20865f;

        /* renamed from: g */
        public final String f20866g;

        /* renamed from: h */
        public final String f20867h;

        /* renamed from: i */
        public final SubCategoriesChildAdapter f20868i;

        public ViewOnClickListenerC3518b(SubCategoriesChildAdapter subCategoriesChildAdapter, int i10, String str, String str2, String str3, String str4, String str5, String str6) {
            this.f20868i = subCategoriesChildAdapter;
            this.f20861b = i10;
            this.f20862c = str;
            this.f20863d = str2;
            this.f20864e = str3;
            this.f20865f = str4;
            this.f20866g = str5;
            this.f20867h = str6;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f20868i.m17477k0(this.f20861b, this.f20862c, this.f20863d, this.f20864e, this.f20865f, this.f20866g, this.f20867h);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SubCategoriesChildAdapter$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SubCategoriesChildAdapter$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SubCategoriesChildAdapter$c.class */
    public class ViewOnClickListenerC3519c implements View.OnClickListener {

        /* renamed from: b */
        public final int f20869b;

        /* renamed from: c */
        public final String f20870c;

        /* renamed from: d */
        public final String f20871d;

        /* renamed from: e */
        public final String f20872e;

        /* renamed from: f */
        public final String f20873f;

        /* renamed from: g */
        public final String f20874g;

        /* renamed from: h */
        public final String f20875h;

        /* renamed from: i */
        public final SubCategoriesChildAdapter f20876i;

        public ViewOnClickListenerC3519c(SubCategoriesChildAdapter subCategoriesChildAdapter, int i10, String str, String str2, String str3, String str4, String str5, String str6) {
            this.f20876i = subCategoriesChildAdapter;
            this.f20869b = i10;
            this.f20870c = str;
            this.f20871d = str2;
            this.f20872e = str3;
            this.f20873f = str4;
            this.f20874g = str5;
            this.f20875h = str6;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f20876i.m17477k0(this.f20869b, this.f20870c, this.f20871d, this.f20872e, this.f20873f, this.f20874g, this.f20875h);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SubCategoriesChildAdapter$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SubCategoriesChildAdapter$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SubCategoriesChildAdapter$d.class */
    public class ViewOnLongClickListenerC3520d implements View.OnLongClickListener {

        /* renamed from: b */
        public final MyViewHolder f20877b;

        /* renamed from: c */
        public final int f20878c;

        /* renamed from: d */
        public final String f20879d;

        /* renamed from: e */
        public final String f20880e;

        /* renamed from: f */
        public final String f20881f;

        /* renamed from: g */
        public final String f20882g;

        /* renamed from: h */
        public final String f20883h;

        /* renamed from: i */
        public final String f20884i;

        /* renamed from: j */
        public final SubCategoriesChildAdapter f20885j;

        public ViewOnLongClickListenerC3520d(SubCategoriesChildAdapter subCategoriesChildAdapter, MyViewHolder myViewHolder, int i10, String str, String str2, String str3, String str4, String str5, String str6) {
            this.f20885j = subCategoriesChildAdapter;
            this.f20877b = myViewHolder;
            this.f20878c = i10;
            this.f20879d = str;
            this.f20880e = str2;
            this.f20881f = str3;
            this.f20882g = str4;
            this.f20883h = str5;
            this.f20884i = str6;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            this.f20885j.m17476j0(this.f20877b, this.f20878c, this.f20879d, this.f20880e, this.f20881f, this.f20882g, this.f20883h, this.f20884i);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SubCategoriesChildAdapter$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SubCategoriesChildAdapter$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SubCategoriesChildAdapter$e.class */
    public class ViewOnLongClickListenerC3521e implements View.OnLongClickListener {

        /* renamed from: b */
        public final MyViewHolder f20886b;

        /* renamed from: c */
        public final int f20887c;

        /* renamed from: d */
        public final String f20888d;

        /* renamed from: e */
        public final String f20889e;

        /* renamed from: f */
        public final String f20890f;

        /* renamed from: g */
        public final String f20891g;

        /* renamed from: h */
        public final String f20892h;

        /* renamed from: i */
        public final String f20893i;

        /* renamed from: j */
        public final SubCategoriesChildAdapter f20894j;

        public ViewOnLongClickListenerC3521e(SubCategoriesChildAdapter subCategoriesChildAdapter, MyViewHolder myViewHolder, int i10, String str, String str2, String str3, String str4, String str5, String str6) {
            this.f20894j = subCategoriesChildAdapter;
            this.f20886b = myViewHolder;
            this.f20887c = i10;
            this.f20888d = str;
            this.f20889e = str2;
            this.f20890f = str3;
            this.f20891g = str4;
            this.f20892h = str5;
            this.f20893i = str6;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            this.f20894j.m17476j0(this.f20886b, this.f20887c, this.f20888d, this.f20889e, this.f20890f, this.f20891g, this.f20892h, this.f20893i);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SubCategoriesChildAdapter$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SubCategoriesChildAdapter$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SubCategoriesChildAdapter$f.class */
    public class ViewOnClickListenerC3522f implements View.OnClickListener {

        /* renamed from: b */
        public final MyViewHolder f20895b;

        /* renamed from: c */
        public final int f20896c;

        /* renamed from: d */
        public final String f20897d;

        /* renamed from: e */
        public final String f20898e;

        /* renamed from: f */
        public final String f20899f;

        /* renamed from: g */
        public final String f20900g;

        /* renamed from: h */
        public final String f20901h;

        /* renamed from: i */
        public final String f20902i;

        /* renamed from: j */
        public final SubCategoriesChildAdapter f20903j;

        public ViewOnClickListenerC3522f(SubCategoriesChildAdapter subCategoriesChildAdapter, MyViewHolder myViewHolder, int i10, String str, String str2, String str3, String str4, String str5, String str6) {
            this.f20903j = subCategoriesChildAdapter;
            this.f20895b = myViewHolder;
            this.f20896c = i10;
            this.f20897d = str;
            this.f20898e = str2;
            this.f20899f = str3;
            this.f20900g = str4;
            this.f20901h = str5;
            this.f20902i = str6;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f20903j.m17476j0(this.f20895b, this.f20896c, this.f20897d, this.f20898e, this.f20899f, this.f20900g, this.f20901h, this.f20902i);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SubCategoriesChildAdapter$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SubCategoriesChildAdapter$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SubCategoriesChildAdapter$g.class */
    public class C3523g implements C0304c1.d {

        /* renamed from: a */
        public final int f20904a;

        /* renamed from: b */
        public final String f20905b;

        /* renamed from: c */
        public final String f20906c;

        /* renamed from: d */
        public final String f20907d;

        /* renamed from: e */
        public final String f20908e;

        /* renamed from: f */
        public final String f20909f;

        /* renamed from: g */
        public final String f20910g;

        /* renamed from: h */
        public final MyViewHolder f20911h;

        /* renamed from: i */
        public final SubCategoriesChildAdapter f20912i;

        public C3523g(SubCategoriesChildAdapter subCategoriesChildAdapter, int i10, String str, String str2, String str3, String str4, String str5, String str6, MyViewHolder myViewHolder) {
            this.f20912i = subCategoriesChildAdapter;
            this.f20904a = i10;
            this.f20905b = str;
            this.f20906c = str2;
            this.f20907d = str3;
            this.f20908e = str4;
            this.f20909f = str5;
            this.f20910g = str6;
            this.f20911h = myViewHolder;
        }

        /* renamed from: a */
        public final void m17478a() {
            FavouriteDBModel favouriteDBModel = new FavouriteDBModel();
            favouriteDBModel.m14767h(this.f20909f);
            favouriteDBModel.m14772m(this.f20904a);
            this.f20912i.f20852k.m14833k0(this.f20905b);
            this.f20912i.f20852k.m14834l0(this.f20910g);
            favouriteDBModel.m14774o(SharepreferenceDBHandler.m15337A(this.f20912i.f20846e));
            this.f20912i.f20851j.m15111l(favouriteDBModel, "vod");
            this.f20911h.ivFavourite.setVisibility(0);
        }

        /* renamed from: b */
        public final void m17479b() {
            this.f20911h.cardView.performClick();
        }

        /* renamed from: c */
        public final void m17480c() {
            SubCategoriesChildAdapter subCategoriesChildAdapter = this.f20912i;
            subCategoriesChildAdapter.f20851j.m15115t(this.f20904a, this.f20909f, "vod", this.f20905b, SharepreferenceDBHandler.m15337A(subCategoriesChildAdapter.f20846e));
            this.f20911h.ivFavourite.setVisibility(4);
        }

        /* renamed from: d */
        public final void m17481d(int i10, String str, String str2, String str3, String str4, String str5, String str6) {
            if (this.f20912i.f20846e != null) {
                Intent intent = new Intent(this.f20912i.f20846e, (Class<?>) ViewDetailsActivity.class);
                intent.putExtra(C5251a.f30075y, String.valueOf(i10));
                intent.putExtra("movie", str);
                intent.putExtra("selectedPlayer", str2);
                intent.putExtra("streamType", str3);
                intent.putExtra("containerExtension", str4);
                intent.putExtra("categoryID", str5);
                intent.putExtra("num", str6);
                this.f20912i.f20846e.startActivity(intent);
            }
        }

        @Override // androidx.appcompat.widget.C0304c1.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case 2131428646:
                    m17481d(this.f20904a, this.f20905b, this.f20906c, this.f20907d, this.f20908e, this.f20909f, this.f20910g);
                    break;
                case 2131428754:
                    m17478a();
                    break;
                case 2131428768:
                    m17479b();
                    break;
                case 2131428775:
                    m17480c();
                    break;
            }
            return false;
        }
    }

    public SubCategoriesChildAdapter(List<LiveStreamsDBModel> list, Context context) {
        this.f20847f = list;
        this.f20846e = context;
        ArrayList arrayList = new ArrayList();
        this.f20849h = arrayList;
        arrayList.addAll(list);
        this.f20850i = list;
        this.f20851j = new DatabaseHandler(context);
        this.f20852k = this.f20852k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public void mo2996G(MyViewHolder myViewHolder, int i10) {
        int i11;
        Context context = this.f20846e;
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("selectedPlayer", 0);
            this.f20848g = sharedPreferences;
            String string = sharedPreferences.getString("selectedPlayer", "");
            try {
                i11 = Integer.parseInt(this.f20847f.get(i10).m14811R());
            } catch (NumberFormatException e10) {
                i11 = -1;
            }
            String m14827g = this.f20847f.get(i10).m14827g();
            String m14846x = this.f20847f.get(i10).m14846x();
            String m14812S = this.f20847f.get(i10).m14812S();
            String m14805L = this.f20847f.get(i10).m14805L();
            myViewHolder.MovieName.setText(this.f20847f.get(i10).getName());
            myViewHolder.movieNameTV.setText(this.f20847f.get(i10).getName());
            String m14810Q = this.f20847f.get(i10).m14810Q();
            String name = this.f20847f.get(i10).getName();
            myViewHolder.MovieImage.setImageDrawable(null);
            if (m14810Q == null || m14810Q.equals("")) {
                myViewHolder.MovieImage.setImageDrawable(this.f20846e.getResources().getDrawable(2131231660, null));
            } else {
                C10014t.m42105q(this.f20846e).m42116l(this.f20847f.get(i10).m14810Q()).m42154j(2131231660).m42151g(myViewHolder.MovieImage);
            }
            if (this.f20851j.m15112o(i11, m14827g, "vod", SharepreferenceDBHandler.m15337A(this.f20846e)).size() > 0) {
                myViewHolder.ivFavourite.setVisibility(0);
            } else {
                myViewHolder.ivFavourite.setVisibility(4);
            }
            myViewHolder.cardView.setOnClickListener(new ViewOnClickListenerC3517a(this, string, i11, m14812S, m14846x, m14805L, name));
            myViewHolder.MovieImage.setOnClickListener(new ViewOnClickListenerC3518b(this, i11, name, string, m14812S, m14846x, m14827g, m14805L));
            myViewHolder.Movie.setOnClickListener(new ViewOnClickListenerC3519c(this, i11, name, string, m14812S, m14846x, m14827g, m14805L));
            myViewHolder.Movie.setOnLongClickListener(new ViewOnLongClickListenerC3520d(this, myViewHolder, i11, m14827g, name, string, m14812S, m14846x, m14805L));
            myViewHolder.MovieImage.setOnLongClickListener(new ViewOnLongClickListenerC3521e(this, myViewHolder, i11, m14827g, name, string, m14812S, m14846x, m14805L));
            myViewHolder.llMenu.setOnClickListener(new ViewOnClickListenerC3522f(this, myViewHolder, i11, m14827g, name, string, m14812S, m14846x, m14805L));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder mo2998J(ViewGroup viewGroup, int i10) {
        return new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(2131624249, viewGroup, false));
    }

    /* renamed from: j0 */
    public final void m17476j0(MyViewHolder myViewHolder, int i10, String str, String str2, String str3, String str4, String str5, String str6) {
        Menu m1275b;
        int i11;
        C0304c1 c0304c1 = new C0304c1(this.f20846e, myViewHolder.tvStreamOptions);
        c0304c1.m1277d(2131689479);
        if (this.f20851j.m15112o(i10, str, "vod", SharepreferenceDBHandler.m15337A(this.f20846e)).size() > 0) {
            m1275b = c0304c1.m1275b();
            i11 = 4;
        } else {
            m1275b = c0304c1.m1275b();
            i11 = 3;
        }
        m1275b.getItem(i11).setVisible(true);
        c0304c1.m1279f(new C3523g(this, i10, str2, str3, str4, str5, str, str6, myViewHolder));
        c0304c1.m1280g();
    }

    /* renamed from: k0 */
    public final void m17477k0(int i10, String str, String str2, String str3, String str4, String str5, String str6) {
        if (this.f20846e != null) {
            Intent intent = new Intent(this.f20846e, (Class<?>) ViewDetailsActivity.class);
            intent.putExtra(C5251a.f30075y, String.valueOf(i10));
            intent.putExtra("movie", str);
            intent.putExtra("selectedPlayer", str2);
            intent.putExtra("streamType", str3);
            intent.putExtra("containerExtension", str4);
            intent.putExtra("categoryID", str5);
            intent.putExtra("num", str6);
            this.f20846e.startActivity(intent);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        return this.f20847f.size();
    }
}

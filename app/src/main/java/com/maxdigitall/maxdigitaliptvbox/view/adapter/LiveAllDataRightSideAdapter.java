package com.maxdigitall.maxdigitaliptvbox.view.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0304c1;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.maxdigitall.maxdigitaliptvbox.miscelleneious.chromecastfeature.ExpandedControlsActivity;
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteM3UModel;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.VodAllCategoriesSingleton;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.activity.LiveAllDataSingleActivity;
import java.util.ArrayList;
import nf.C6783a;
import org.jetbrains.annotations.NotNull;
import p082ef.C4718a;
import p151if.C5251a;
import p151if.C5255e;
import p200l9.C5782l;
import p216m9.C5938b;
import p216m9.C5947e;
import p316s2.C8522c;
import p402x9.C9691a;
import p428yg.C10014t;
import p428yg.InterfaceC9996e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter.class */
public class LiveAllDataRightSideAdapter extends RecyclerView.AbstractC0677h<RecyclerView.AbstractC0674e0> implements Filterable {

    /* renamed from: B */
    public String f19795B;

    /* renamed from: C */
    public String f19796C;

    /* renamed from: E */
    public Handler f19798E;

    /* renamed from: F */
    public LiveStreamDBHandler f19799F;

    /* renamed from: i */
    public Context f19804i;

    /* renamed from: k */
    public DatabaseHandler f19806k;

    /* renamed from: l */
    public Animation f19807l;

    /* renamed from: m */
    public String f19808m;

    /* renamed from: p */
    public String f19811p;

    /* renamed from: t */
    public SharedPreferences f19815t;

    /* renamed from: u */
    public C5947e f19816u;

    /* renamed from: j */
    public Boolean f19805j = Boolean.FALSE;

    /* renamed from: n */
    public C3401l f19809n = new C3401l(this, null);

    /* renamed from: o */
    public C3402m f19810o = new C3402m(this, null);

    /* renamed from: q */
    public String f19812q = "";

    /* renamed from: r */
    public boolean f19813r = false;

    /* renamed from: s */
    public int f19814s = -1;

    /* renamed from: v */
    public String f19817v = "";

    /* renamed from: w */
    public String f19818w = "0";

    /* renamed from: x */
    public String f19819x = "";

    /* renamed from: y */
    public String f19820y = "";

    /* renamed from: z */
    public String f19821z = "";

    /* renamed from: A */
    public int f19794A = 0;

    /* renamed from: D */
    public String f19797D = "";

    /* renamed from: e */
    public ArrayList<LiveStreamsDBModel> f19800e = VodAllCategoriesSingleton.m14909b().m14912d();

    /* renamed from: f */
    public ArrayList<LiveStreamsDBModel> f19801f = VodAllCategoriesSingleton.m14909b().m14912d();

    /* renamed from: g */
    public final ArrayList<LiveStreamsDBModel> f19802g = VodAllCategoriesSingleton.m14909b().m14910a();

    /* renamed from: h */
    public ArrayList<LiveStreamsDBModel> f19803h = VodAllCategoriesSingleton.m14909b().m14910a();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$ContinueWatchingViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$ContinueWatchingViewHolder.class */
    public static class ContinueWatchingViewHolder extends RecyclerView.AbstractC0674e0 {
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$ContinueWatchingViewHolder_ViewBinding.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$ContinueWatchingViewHolder_ViewBinding.class */
    public class ContinueWatchingViewHolder_ViewBinding implements Unbinder {
        public ContinueWatchingViewHolder_ViewBinding(ContinueWatchingViewHolder continueWatchingViewHolder, View view) {
            throw null;
        }

        @Override // butterknife.Unbinder
        /* renamed from: a */
        public void mo5629a() {
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$ViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$ViewHolder.class */
    public static class ViewHolder extends RecyclerView.AbstractC0674e0 {

        @BindView
        public RelativeLayout Movie;

        @BindView
        public ImageView MovieImage;

        @BindView
        public TextView SeriesName;

        @BindView
        public CardView cardView;

        @BindView
        public ImageView ivFavourite;

        @BindView
        public LinearLayout llMenu;

        @BindView
        public TextView tvStreamOptions;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.m5627b(this, view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$ViewHolder_ViewBinding.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$ViewHolder_ViewBinding.class */
    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: b */
        public ViewHolder f19822b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f19822b = viewHolder;
            viewHolder.SeriesName = (TextView) C8522c.m36739c(view, 2131429602, "field 'SeriesName'", TextView.class);
            viewHolder.Movie = (RelativeLayout) C8522c.m36739c(view, 2131429012, "field 'Movie'", RelativeLayout.class);
            viewHolder.MovieImage = (ImageView) C8522c.m36739c(view, 2131428200, "field 'MovieImage'", ImageView.class);
            viewHolder.cardView = (CardView) C8522c.m36739c(view, 2131427703, "field 'cardView'", CardView.class);
            viewHolder.tvStreamOptions = (TextView) C8522c.m36739c(view, 2131429619, "field 'tvStreamOptions'", TextView.class);
            viewHolder.ivFavourite = (ImageView) C8522c.m36739c(view, 2131428179, "field 'ivFavourite'", ImageView.class);
            viewHolder.llMenu = (LinearLayout) C8522c.m36739c(view, 2131428441, "field 'llMenu'", LinearLayout.class);
        }

        @Override // butterknife.Unbinder
        /* renamed from: a */
        public void mo5629a() {
            ViewHolder viewHolder = this.f19822b;
            if (viewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f19822b = null;
            viewHolder.SeriesName = null;
            viewHolder.Movie = null;
            viewHolder.MovieImage = null;
            viewHolder.cardView = null;
            viewHolder.tvStreamOptions = null;
            viewHolder.ivFavourite = null;
            viewHolder.llMenu = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapter$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$a.class */
    public class C3390a implements InterfaceC9996e {

        /* renamed from: a */
        public final ViewHolder f19823a;

        /* renamed from: b */
        public final LiveAllDataRightSideAdapter f19824b;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$a$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapter$a$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$a$a.class */
        public class a implements InterfaceC9996e {

            /* renamed from: a */
            public final C3390a f19825a;

            public a(C3390a c3390a) {
                this.f19825a = c3390a;
            }

            @Override // p428yg.InterfaceC9996e
            /* renamed from: a */
            public void mo15848a() {
            }

            @Override // p428yg.InterfaceC9996e
            public void onSuccess() {
            }
        }

        public C3390a(LiveAllDataRightSideAdapter liveAllDataRightSideAdapter, ViewHolder viewHolder) {
            this.f19824b = liveAllDataRightSideAdapter;
            this.f19823a = viewHolder;
        }

        @Override // p428yg.InterfaceC9996e
        /* renamed from: a */
        public void mo15848a() {
            C10014t.m42105q(this.f19824b.f19804i).m42116l(String.valueOf(this.f19824b.f19804i.getResources().getDrawable(2131231769))).m42149e().m42146b().m42152h(this.f19823a.MovieImage, new a(this));
            this.f19823a.SeriesName.setVisibility(0);
        }

        @Override // p428yg.InterfaceC9996e
        public void onSuccess() {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapter$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$b.class */
    public class C3391b implements C0304c1.d {

        /* renamed from: a */
        public final ArrayList f19826a;

        /* renamed from: b */
        public final ViewHolder f19827b;

        /* renamed from: c */
        public final int f19828c;

        /* renamed from: d */
        public final ArrayList f19829d;

        /* renamed from: e */
        public final String f19830e;

        /* renamed from: f */
        public final LiveAllDataRightSideAdapter f19831f;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$b$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapter$b$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$b$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final C3391b f19832b;

            public a(C3391b c3391b) {
                this.f19832b = c3391b;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f19832b.f19831f.m4099w();
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$b$b.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapter$b$b */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$b$b.class */
        public class b extends Dialog implements View.OnClickListener {

            /* renamed from: b */
            public Activity f19833b;

            /* renamed from: c */
            public TextView f19834c;

            /* renamed from: d */
            public TextView f19835d;

            /* renamed from: e */
            public TextView f19836e;

            /* renamed from: f */
            public LinearLayout f19837f;

            /* renamed from: g */
            public LinearLayout f19838g;

            /* renamed from: h */
            public final C3391b f19839h;

            /* JADX WARN: Classes with same name are omitted:
              classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$b$b$a.class
             */
            /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapter$b$b$a */
            /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$b$b$a.class */
            public class a implements Runnable {

                /* renamed from: b */
                public final b f19840b;

                public a(b bVar) {
                    this.f19840b = bVar;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (this.f19840b.f19839h.f19831f.f19804i instanceof LiveAllDataSingleActivity) {
                        ((LiveAllDataSingleActivity) this.f19840b.f19839h.f19831f.f19804i).m15938e1();
                    }
                }
            }

            /* JADX WARN: Classes with same name are omitted:
              classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$b$b$b.class
             */
            /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapter$b$b$b, reason: collision with other inner class name */
            /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$b$b$b.class */
            public class ViewOnFocusChangeListenerC10269b implements View.OnFocusChangeListener {

                /* renamed from: b */
                public View f19841b;

                /* renamed from: c */
                public final b f19842c;

                public ViewOnFocusChangeListenerC10269b(b bVar, View view) {
                    this.f19842c = bVar;
                    this.f19841b = view;
                }

                @Override // android.view.View.OnFocusChangeListener
                @SuppressLint({"ResourceType"})
                public void onFocusChange(View view, boolean z10) {
                    int i10;
                    LinearLayout linearLayout;
                    if (z10) {
                        View view2 = this.f19841b;
                        i10 = 2131230846;
                        if (view2 == null || view2.getTag() == null || !this.f19841b.getTag().equals("1")) {
                            View view3 = this.f19841b;
                            if (view3 == null || view3.getTag() == null || !this.f19841b.getTag().equals("2")) {
                                return;
                            }
                            linearLayout = this.f19842c.f19838g;
                        }
                        linearLayout = this.f19842c.f19837f;
                    } else {
                        View view4 = this.f19841b;
                        i10 = 2131230845;
                        if (view4 == null || view4.getTag() == null || !this.f19841b.getTag().equals("1")) {
                            View view5 = this.f19841b;
                            if (view5 == null || view5.getTag() == null || !this.f19841b.getTag().equals("2")) {
                                return;
                            }
                            linearLayout = this.f19842c.f19838g;
                        }
                        linearLayout = this.f19842c.f19837f;
                    }
                    linearLayout.setBackgroundResource(i10);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C3391b c3391b, Activity activity) {
                super(activity);
                this.f19839h = c3391b;
                this.f19833b = activity;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int id2 = view.getId();
                if (id2 == 2131427653) {
                    dismiss();
                } else if (id2 == 2131427681) {
                    try {
                        this.f19839h.f19831f.f19799F.m15194U0(String.valueOf(this.f19839h.f19830e));
                        if (this.f19839h.f19831f.f19804i instanceof LiveAllDataSingleActivity) {
                            ((LiveAllDataSingleActivity) this.f19839h.f19831f.f19804i).m15944k1();
                        }
                        new Handler().postDelayed(new a(this), 100L);
                    } catch (Exception e10) {
                    }
                }
                dismiss();
            }

            @Override // android.app.Dialog
            public void onCreate(Bundle bundle) {
                super.onCreate(bundle);
                setContentView(new C6783a(this.f19839h.f19831f.f19804i).m31288z().equals(C5251a.f30065s0) ? 2131624128 : 2131624127);
                this.f19834c = (TextView) findViewById(2131427681);
                this.f19835d = (TextView) findViewById(2131427653);
                this.f19837f = (LinearLayout) findViewById(2131428448);
                this.f19838g = (LinearLayout) findViewById(2131428541);
                TextView textView = (TextView) findViewById(2131429644);
                this.f19836e = textView;
                textView.setText(this.f19839h.f19831f.f19804i.getResources().getString(2132018831));
                this.f19834c.setOnClickListener(this);
                this.f19835d.setOnClickListener(this);
                TextView textView2 = this.f19834c;
                textView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC10269b(this, textView2));
                TextView textView3 = this.f19835d;
                textView3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC10269b(this, textView3));
            }
        }

        public C3391b(LiveAllDataRightSideAdapter liveAllDataRightSideAdapter, ArrayList arrayList, ViewHolder viewHolder, int i10, ArrayList arrayList2, String str) {
            this.f19831f = liveAllDataRightSideAdapter;
            this.f19826a = arrayList;
            this.f19827b = viewHolder;
            this.f19828c = i10;
            this.f19829d = arrayList2;
            this.f19830e = str;
        }

        @Override // androidx.appcompat.widget.C0304c1.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            int itemId = menuItem.getItemId();
            if (itemId == 2131428642) {
                new b(this, (LiveAllDataSingleActivity) this.f19831f.f19804i).show();
                return false;
            }
            if (itemId != 2131428754 && itemId != 2131428775) {
                return false;
            }
            this.f19831f.m17130y0(this.f19826a, this.f19827b, this.f19828c, this.f19829d);
            new Handler().postDelayed(new a(this), 300L);
            if (!(this.f19831f.f19804i instanceof LiveAllDataSingleActivity)) {
                return false;
            }
            ((LiveAllDataSingleActivity) this.f19831f.f19804i).m15938e1();
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapter$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$c.class */
    public class C3392c implements C0304c1.d {

        /* renamed from: a */
        public final ArrayList f19843a;

        /* renamed from: b */
        public final ViewHolder f19844b;

        /* renamed from: c */
        public final int f19845c;

        /* renamed from: d */
        public final ArrayList f19846d;

        /* renamed from: e */
        public final int f19847e;

        /* renamed from: f */
        public final LiveAllDataRightSideAdapter f19848f;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$c$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapter$c$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$c$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final C3392c f19849b;

            public a(C3392c c3392c) {
                this.f19849b = c3392c;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f19849b.f19848f.m4099w();
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$c$b.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapter$c$b */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$c$b.class */
        public class b extends Dialog implements View.OnClickListener {

            /* renamed from: b */
            public Activity f19850b;

            /* renamed from: c */
            public TextView f19851c;

            /* renamed from: d */
            public TextView f19852d;

            /* renamed from: e */
            public TextView f19853e;

            /* renamed from: f */
            public LinearLayout f19854f;

            /* renamed from: g */
            public LinearLayout f19855g;

            /* renamed from: h */
            public final C3392c f19856h;

            /* JADX WARN: Classes with same name are omitted:
              classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$c$b$a.class
             */
            /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapter$c$b$a */
            /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$c$b$a.class */
            public class a implements Runnable {

                /* renamed from: b */
                public final b f19857b;

                public a(b bVar) {
                    this.f19857b = bVar;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (this.f19857b.f19856h.f19848f.f19804i instanceof LiveAllDataSingleActivity) {
                        ((LiveAllDataSingleActivity) this.f19857b.f19856h.f19848f.f19804i).m15938e1();
                    }
                }
            }

            /* JADX WARN: Classes with same name are omitted:
              classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$c$b$b.class
             */
            /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapter$c$b$b, reason: collision with other inner class name */
            /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$c$b$b.class */
            public class ViewOnFocusChangeListenerC10270b implements View.OnFocusChangeListener {

                /* renamed from: b */
                public View f19858b;

                /* renamed from: c */
                public final b f19859c;

                public ViewOnFocusChangeListenerC10270b(b bVar, View view) {
                    this.f19859c = bVar;
                    this.f19858b = view;
                }

                @Override // android.view.View.OnFocusChangeListener
                @SuppressLint({"ResourceType"})
                public void onFocusChange(View view, boolean z10) {
                    int i10;
                    LinearLayout linearLayout;
                    if (z10) {
                        View view2 = this.f19858b;
                        i10 = 2131230846;
                        if (view2 == null || view2.getTag() == null || !this.f19858b.getTag().equals("1")) {
                            View view3 = this.f19858b;
                            if (view3 == null || view3.getTag() == null || !this.f19858b.getTag().equals("2")) {
                                return;
                            }
                            linearLayout = this.f19859c.f19855g;
                        }
                        linearLayout = this.f19859c.f19854f;
                    } else {
                        View view4 = this.f19858b;
                        i10 = 2131230845;
                        if (view4 == null || view4.getTag() == null || !this.f19858b.getTag().equals("1")) {
                            View view5 = this.f19858b;
                            if (view5 == null || view5.getTag() == null || !this.f19858b.getTag().equals("2")) {
                                return;
                            }
                            linearLayout = this.f19859c.f19855g;
                        }
                        linearLayout = this.f19859c.f19854f;
                    }
                    linearLayout.setBackgroundResource(i10);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C3392c c3392c, Activity activity) {
                super(activity);
                this.f19856h = c3392c;
                this.f19850b = activity;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int id2 = view.getId();
                if (id2 == 2131427653) {
                    dismiss();
                } else if (id2 == 2131427681) {
                    try {
                        this.f19856h.f19848f.f19799F.m15194U0(String.valueOf(this.f19856h.f19847e));
                        if (this.f19856h.f19848f.f19804i instanceof LiveAllDataSingleActivity) {
                            ((LiveAllDataSingleActivity) this.f19856h.f19848f.f19804i).m15944k1();
                        }
                        new Handler().postDelayed(new a(this), 100L);
                    } catch (Exception e10) {
                    }
                }
                dismiss();
            }

            @Override // android.app.Dialog
            public void onCreate(Bundle bundle) {
                super.onCreate(bundle);
                setContentView(new C6783a(this.f19856h.f19848f.f19804i).m31288z().equals(C5251a.f30065s0) ? 2131624128 : 2131624127);
                this.f19851c = (TextView) findViewById(2131427681);
                this.f19852d = (TextView) findViewById(2131427653);
                this.f19854f = (LinearLayout) findViewById(2131428448);
                this.f19855g = (LinearLayout) findViewById(2131428541);
                TextView textView = (TextView) findViewById(2131429644);
                this.f19853e = textView;
                textView.setText(this.f19856h.f19848f.f19804i.getResources().getString(2132018831));
                this.f19851c.setOnClickListener(this);
                this.f19852d.setOnClickListener(this);
                TextView textView2 = this.f19851c;
                textView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC10270b(this, textView2));
                TextView textView3 = this.f19852d;
                textView3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC10270b(this, textView3));
            }
        }

        public C3392c(LiveAllDataRightSideAdapter liveAllDataRightSideAdapter, ArrayList arrayList, ViewHolder viewHolder, int i10, ArrayList arrayList2, int i11) {
            this.f19848f = liveAllDataRightSideAdapter;
            this.f19843a = arrayList;
            this.f19844b = viewHolder;
            this.f19845c = i10;
            this.f19846d = arrayList2;
            this.f19847e = i11;
        }

        @Override // androidx.appcompat.widget.C0304c1.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            int itemId = menuItem.getItemId();
            if (itemId == 2131428642) {
                new b(this, (LiveAllDataSingleActivity) this.f19848f.f19804i).show();
                return false;
            }
            if (itemId != 2131428754 && itemId != 2131428775) {
                return false;
            }
            this.f19848f.m17129x0(this.f19843a, this.f19844b, this.f19845c, this.f19846d);
            new Handler().postDelayed(new a(this), 300L);
            if (!(this.f19848f.f19804i instanceof LiveAllDataSingleActivity)) {
                return false;
            }
            ((LiveAllDataSingleActivity) this.f19848f.f19804i).m15938e1();
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapter$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$d.class */
    public class C3393d implements InterfaceC9996e {

        /* renamed from: a */
        public final LiveAllDataRightSideAdapter f19860a;

        public C3393d(LiveAllDataRightSideAdapter liveAllDataRightSideAdapter) {
            this.f19860a = liveAllDataRightSideAdapter;
        }

        @Override // p428yg.InterfaceC9996e
        /* renamed from: a */
        public void mo15848a() {
        }

        @Override // p428yg.InterfaceC9996e
        public void onSuccess() {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapter$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$e.class */
    public class C3394e implements InterfaceC9996e {

        /* renamed from: a */
        public final LiveAllDataRightSideAdapter f19861a;

        public C3394e(LiveAllDataRightSideAdapter liveAllDataRightSideAdapter) {
            this.f19861a = liveAllDataRightSideAdapter;
        }

        @Override // p428yg.InterfaceC9996e
        /* renamed from: a */
        public void mo15848a() {
        }

        @Override // p428yg.InterfaceC9996e
        public void onSuccess() {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapter$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$f.class */
    public class ViewOnClickListenerC3395f implements View.OnClickListener {

        /* renamed from: b */
        public final String f19862b;

        /* renamed from: c */
        public final int f19863c;

        /* renamed from: d */
        public final String f19864d;

        /* renamed from: e */
        public final String f19865e;

        /* renamed from: f */
        public final String f19866f;

        /* renamed from: g */
        public final LiveAllDataRightSideAdapter f19867g;

        public ViewOnClickListenerC3395f(LiveAllDataRightSideAdapter liveAllDataRightSideAdapter, String str, int i10, String str2, String str3, String str4) {
            this.f19867g = liveAllDataRightSideAdapter;
            this.f19862b = str;
            this.f19863c = i10;
            this.f19864d = str2;
            this.f19865e = str3;
            this.f19866f = str4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int m17122B0 = SharepreferenceDBHandler.m15373f(this.f19867g.f19804i).equals("m3u") ? this.f19867g.m17122B0(this.f19862b, "m3u") : this.f19867g.m17122B0(String.valueOf(this.f19863c), "api");
            try {
                LiveAllDataRightSideAdapter liveAllDataRightSideAdapter = this.f19867g;
                liveAllDataRightSideAdapter.f19816u = C5938b.m29235e(liveAllDataRightSideAdapter.f19804i).m29243c().m29358c();
            } catch (Exception e10) {
            }
            if (this.f19867g.f19816u == null || !this.f19867g.f19816u.m29348c()) {
                C5255e.m26221X(this.f19867g.f19804i, "Built-in Player ( Default )", this.f19863c, this.f19866f, m17122B0, "", "", "", this.f19867g.f19796C, "", this.f19867g.f19795B);
                return;
            }
            if (this.f19867g.f19816u != null && this.f19867g.f19816u.m29290r() != null && this.f19867g.f19816u.m29290r().m31009j() != null && this.f19867g.f19816u.m29290r().m31009j().m13058R() != null) {
                LiveAllDataRightSideAdapter liveAllDataRightSideAdapter2 = this.f19867g;
                liveAllDataRightSideAdapter2.f19797D = liveAllDataRightSideAdapter2.f19816u.m29290r().m31009j().m13058R();
            }
            String m26202E = SharepreferenceDBHandler.m15373f(this.f19867g.f19804i).equals("m3u") ? this.f19862b : C5255e.m26202E(this.f19867g.f19804i, this.f19863c, "m3u8", "live");
            if (this.f19867g.f19797D.contains(String.valueOf(m26202E))) {
                this.f19867g.f19804i.startActivity(new Intent(this.f19867g.f19804i, (Class<?>) ExpandedControlsActivity.class));
                return;
            }
            C5782l c5782l = new C5782l(1);
            c5782l.m28249V("com.google.android.gms.cast.metadata.TITLE", this.f19864d);
            c5782l.m28253b(new C9691a(Uri.parse(this.f19865e)));
            LiveAllDataRightSideAdapter liveAllDataRightSideAdapter3 = this.f19867g;
            C4718a.m23742b(liveAllDataRightSideAdapter3.f19798E, liveAllDataRightSideAdapter3.f19816u.m29290r(), m26202E, c5782l, this.f19867g.f19804i);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapter$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$g.class */
    public class ViewOnClickListenerC3396g implements View.OnClickListener {

        /* renamed from: b */
        public final String f19868b;

        /* renamed from: c */
        public final int f19869c;

        /* renamed from: d */
        public final String f19870d;

        /* renamed from: e */
        public final String f19871e;

        /* renamed from: f */
        public final String f19872f;

        /* renamed from: g */
        public final LiveAllDataRightSideAdapter f19873g;

        public ViewOnClickListenerC3396g(LiveAllDataRightSideAdapter liveAllDataRightSideAdapter, String str, int i10, String str2, String str3, String str4) {
            this.f19873g = liveAllDataRightSideAdapter;
            this.f19868b = str;
            this.f19869c = i10;
            this.f19870d = str2;
            this.f19871e = str3;
            this.f19872f = str4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int m17122B0 = SharepreferenceDBHandler.m15373f(this.f19873g.f19804i).equals("m3u") ? this.f19873g.m17122B0(this.f19868b, "m3u") : this.f19873g.m17122B0(String.valueOf(this.f19869c), "api");
            try {
                LiveAllDataRightSideAdapter liveAllDataRightSideAdapter = this.f19873g;
                liveAllDataRightSideAdapter.f19816u = C5938b.m29235e(liveAllDataRightSideAdapter.f19804i).m29243c().m29358c();
            } catch (Exception e10) {
            }
            if (this.f19873g.f19816u == null || !this.f19873g.f19816u.m29348c()) {
                C5255e.m26221X(this.f19873g.f19804i, "Built-in Player ( Default )", this.f19869c, this.f19872f, m17122B0, "", "", "", this.f19873g.f19796C, "", this.f19873g.f19795B);
                return;
            }
            if (this.f19873g.f19816u != null && this.f19873g.f19816u.m29290r() != null && this.f19873g.f19816u.m29290r().m31009j() != null && this.f19873g.f19816u.m29290r().m31009j().m13058R() != null) {
                LiveAllDataRightSideAdapter liveAllDataRightSideAdapter2 = this.f19873g;
                liveAllDataRightSideAdapter2.f19797D = liveAllDataRightSideAdapter2.f19816u.m29290r().m31009j().m13058R();
            }
            String m26202E = SharepreferenceDBHandler.m15373f(this.f19873g.f19804i).equals("m3u") ? this.f19868b : C5255e.m26202E(this.f19873g.f19804i, this.f19869c, "m3u8", "live");
            if (this.f19873g.f19797D.contains(String.valueOf(this.f19869c))) {
                this.f19873g.f19804i.startActivity(new Intent(this.f19873g.f19804i, (Class<?>) ExpandedControlsActivity.class));
                return;
            }
            C5782l c5782l = new C5782l(1);
            c5782l.m28249V("com.google.android.gms.cast.metadata.TITLE", this.f19870d);
            c5782l.m28253b(new C9691a(Uri.parse(this.f19871e)));
            LiveAllDataRightSideAdapter liveAllDataRightSideAdapter3 = this.f19873g;
            C4718a.m23742b(liveAllDataRightSideAdapter3.f19798E, liveAllDataRightSideAdapter3.f19816u.m29290r(), m26202E, c5782l, this.f19873g.f19804i);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapter$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$h.class */
    public class ViewOnClickListenerC3397h implements View.OnClickListener {

        /* renamed from: b */
        public final String f19874b;

        /* renamed from: c */
        public final int f19875c;

        /* renamed from: d */
        public final String f19876d;

        /* renamed from: e */
        public final String f19877e;

        /* renamed from: f */
        public final String f19878f;

        /* renamed from: g */
        public final LiveAllDataRightSideAdapter f19879g;

        public ViewOnClickListenerC3397h(LiveAllDataRightSideAdapter liveAllDataRightSideAdapter, String str, int i10, String str2, String str3, String str4) {
            this.f19879g = liveAllDataRightSideAdapter;
            this.f19874b = str;
            this.f19875c = i10;
            this.f19876d = str2;
            this.f19877e = str3;
            this.f19878f = str4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int m17122B0 = SharepreferenceDBHandler.m15373f(this.f19879g.f19804i).equals("m3u") ? this.f19879g.m17122B0(this.f19874b, "m3u") : this.f19879g.m17122B0(String.valueOf(this.f19875c), "api");
            try {
                LiveAllDataRightSideAdapter liveAllDataRightSideAdapter = this.f19879g;
                liveAllDataRightSideAdapter.f19816u = C5938b.m29235e(liveAllDataRightSideAdapter.f19804i).m29243c().m29358c();
            } catch (Exception e10) {
            }
            if (this.f19879g.f19816u == null || !this.f19879g.f19816u.m29348c()) {
                C5255e.m26221X(this.f19879g.f19804i, "Built-in Player ( Default )", this.f19875c, this.f19878f, m17122B0, "", "", "", this.f19879g.f19796C, "", this.f19879g.f19795B);
                return;
            }
            if (this.f19879g.f19816u != null && this.f19879g.f19816u.m29290r() != null && this.f19879g.f19816u.m29290r().m31009j() != null && this.f19879g.f19816u.m29290r().m31009j().m13058R() != null) {
                LiveAllDataRightSideAdapter liveAllDataRightSideAdapter2 = this.f19879g;
                liveAllDataRightSideAdapter2.f19797D = liveAllDataRightSideAdapter2.f19816u.m29290r().m31009j().m13058R();
            }
            String m26202E = SharepreferenceDBHandler.m15373f(this.f19879g.f19804i).equals("m3u") ? this.f19874b : C5255e.m26202E(this.f19879g.f19804i, this.f19875c, "m3u8", "live");
            if (this.f19879g.f19797D.contains(String.valueOf(this.f19875c))) {
                this.f19879g.f19804i.startActivity(new Intent(this.f19879g.f19804i, (Class<?>) ExpandedControlsActivity.class));
                return;
            }
            C5782l c5782l = new C5782l(1);
            c5782l.m28249V("com.google.android.gms.cast.metadata.TITLE", this.f19876d);
            c5782l.m28253b(new C9691a(Uri.parse(this.f19877e)));
            LiveAllDataRightSideAdapter liveAllDataRightSideAdapter3 = this.f19879g;
            C4718a.m23742b(liveAllDataRightSideAdapter3.f19798E, liveAllDataRightSideAdapter3.f19816u.m29290r(), m26202E, c5782l, this.f19879g.f19804i);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapter$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$i.class */
    public class ViewOnLongClickListenerC3398i implements View.OnLongClickListener {

        /* renamed from: b */
        public final ViewHolder f19880b;

        /* renamed from: c */
        public final int f19881c;

        /* renamed from: d */
        public final String f19882d;

        /* renamed from: e */
        public final int f19883e;

        /* renamed from: f */
        public final String f19884f;

        /* renamed from: g */
        public final String f19885g;

        /* renamed from: h */
        public final LiveAllDataRightSideAdapter f19886h;

        public ViewOnLongClickListenerC3398i(LiveAllDataRightSideAdapter liveAllDataRightSideAdapter, ViewHolder viewHolder, int i10, String str, int i11, String str2, String str3) {
            this.f19886h = liveAllDataRightSideAdapter;
            this.f19880b = viewHolder;
            this.f19881c = i10;
            this.f19882d = str;
            this.f19883e = i11;
            this.f19884f = str2;
            this.f19885g = str3;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (this.f19886h.f19796C.equals("-6")) {
                LiveAllDataRightSideAdapter liveAllDataRightSideAdapter = this.f19886h;
                liveAllDataRightSideAdapter.m17123C0(this.f19880b, this.f19881c, liveAllDataRightSideAdapter.f19801f);
                return true;
            }
            if (SharepreferenceDBHandler.m15373f(this.f19886h.f19804i).equals("m3u")) {
                ArrayList<FavouriteM3UModel> m15159E0 = this.f19886h.f19799F.m15159E0(this.f19882d, SharepreferenceDBHandler.m15337A(this.f19886h.f19804i));
                LiveAllDataRightSideAdapter liveAllDataRightSideAdapter2 = this.f19886h;
                liveAllDataRightSideAdapter2.m17130y0(m15159E0, this.f19880b, this.f19881c, liveAllDataRightSideAdapter2.f19801f);
                return true;
            }
            ArrayList<FavouriteDBModel> m15112o = this.f19886h.f19806k.m15112o(this.f19883e, this.f19884f, this.f19885g, SharepreferenceDBHandler.m15337A(this.f19886h.f19804i));
            LiveAllDataRightSideAdapter liveAllDataRightSideAdapter3 = this.f19886h;
            liveAllDataRightSideAdapter3.m17129x0(m15112o, this.f19880b, this.f19881c, liveAllDataRightSideAdapter3.f19801f);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapter$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$j.class */
    public class ViewOnLongClickListenerC3399j implements View.OnLongClickListener {

        /* renamed from: b */
        public final ViewHolder f19887b;

        /* renamed from: c */
        public final int f19888c;

        /* renamed from: d */
        public final String f19889d;

        /* renamed from: e */
        public final int f19890e;

        /* renamed from: f */
        public final String f19891f;

        /* renamed from: g */
        public final String f19892g;

        /* renamed from: h */
        public final LiveAllDataRightSideAdapter f19893h;

        public ViewOnLongClickListenerC3399j(LiveAllDataRightSideAdapter liveAllDataRightSideAdapter, ViewHolder viewHolder, int i10, String str, int i11, String str2, String str3) {
            this.f19893h = liveAllDataRightSideAdapter;
            this.f19887b = viewHolder;
            this.f19888c = i10;
            this.f19889d = str;
            this.f19890e = i11;
            this.f19891f = str2;
            this.f19892g = str3;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (this.f19893h.f19796C.equals("-6")) {
                LiveAllDataRightSideAdapter liveAllDataRightSideAdapter = this.f19893h;
                liveAllDataRightSideAdapter.m17123C0(this.f19887b, this.f19888c, liveAllDataRightSideAdapter.f19801f);
                return true;
            }
            if (SharepreferenceDBHandler.m15373f(this.f19893h.f19804i).equals("m3u")) {
                ArrayList<FavouriteM3UModel> m15159E0 = this.f19893h.f19799F.m15159E0(this.f19889d, SharepreferenceDBHandler.m15337A(this.f19893h.f19804i));
                LiveAllDataRightSideAdapter liveAllDataRightSideAdapter2 = this.f19893h;
                liveAllDataRightSideAdapter2.m17130y0(m15159E0, this.f19887b, this.f19888c, liveAllDataRightSideAdapter2.f19801f);
                return true;
            }
            ArrayList<FavouriteDBModel> m15112o = this.f19893h.f19806k.m15112o(this.f19890e, this.f19891f, this.f19892g, SharepreferenceDBHandler.m15337A(this.f19893h.f19804i));
            LiveAllDataRightSideAdapter liveAllDataRightSideAdapter3 = this.f19893h;
            liveAllDataRightSideAdapter3.m17129x0(m15112o, this.f19887b, this.f19888c, liveAllDataRightSideAdapter3.f19801f);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapter$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$k.class */
    public class ViewOnLongClickListenerC3400k implements View.OnLongClickListener {

        /* renamed from: b */
        public final ViewHolder f19894b;

        /* renamed from: c */
        public final int f19895c;

        /* renamed from: d */
        public final String f19896d;

        /* renamed from: e */
        public final int f19897e;

        /* renamed from: f */
        public final String f19898f;

        /* renamed from: g */
        public final String f19899g;

        /* renamed from: h */
        public final LiveAllDataRightSideAdapter f19900h;

        public ViewOnLongClickListenerC3400k(LiveAllDataRightSideAdapter liveAllDataRightSideAdapter, ViewHolder viewHolder, int i10, String str, int i11, String str2, String str3) {
            this.f19900h = liveAllDataRightSideAdapter;
            this.f19894b = viewHolder;
            this.f19895c = i10;
            this.f19896d = str;
            this.f19897e = i11;
            this.f19898f = str2;
            this.f19899g = str3;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (this.f19900h.f19796C.equals("-6")) {
                LiveAllDataRightSideAdapter liveAllDataRightSideAdapter = this.f19900h;
                liveAllDataRightSideAdapter.m17123C0(this.f19894b, this.f19895c, liveAllDataRightSideAdapter.f19801f);
                return true;
            }
            if (SharepreferenceDBHandler.m15373f(this.f19900h.f19804i).equals("m3u")) {
                ArrayList<FavouriteM3UModel> m15159E0 = this.f19900h.f19799F.m15159E0(this.f19896d, SharepreferenceDBHandler.m15337A(this.f19900h.f19804i));
                LiveAllDataRightSideAdapter liveAllDataRightSideAdapter2 = this.f19900h;
                liveAllDataRightSideAdapter2.m17130y0(m15159E0, this.f19894b, this.f19895c, liveAllDataRightSideAdapter2.f19801f);
                return true;
            }
            ArrayList<FavouriteDBModel> m15112o = this.f19900h.f19806k.m15112o(this.f19897e, this.f19898f, this.f19899g, SharepreferenceDBHandler.m15337A(this.f19900h.f19804i));
            LiveAllDataRightSideAdapter liveAllDataRightSideAdapter3 = this.f19900h;
            liveAllDataRightSideAdapter3.m17129x0(m15112o, this.f19894b, this.f19895c, liveAllDataRightSideAdapter3.f19801f);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$l.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapter$l */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$l.class */
    public class C3401l extends Filter {

        /* renamed from: a */
        public final LiveAllDataRightSideAdapter f19901a;

        public C3401l(LiveAllDataRightSideAdapter liveAllDataRightSideAdapter) {
            this.f19901a = liveAllDataRightSideAdapter;
        }

        public /* synthetic */ C3401l(LiveAllDataRightSideAdapter liveAllDataRightSideAdapter, C3390a c3390a) {
            this(liveAllDataRightSideAdapter);
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase = charSequence.toString().toLowerCase();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = this.f19901a.f19800e;
            if (arrayList == null) {
                filterResults.values = null;
                filterResults.count = 0;
                return filterResults;
            }
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                LiveStreamsDBModel liveStreamsDBModel = (LiveStreamsDBModel) arrayList.get(i10);
                if (liveStreamsDBModel.getName().toLowerCase().contains(lowerCase) || liveStreamsDBModel.getName().contains(lowerCase)) {
                    arrayList2.add(liveStreamsDBModel);
                }
            }
            filterResults.values = arrayList2;
            filterResults.count = arrayList2.size();
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            try {
                this.f19901a.f19801f = (ArrayList) filterResults.values;
                if (this.f19901a.f19801f != null) {
                    this.f19901a.m4099w();
                    if (this.f19901a.f19801f == null || this.f19901a.f19801f.size() != 0) {
                        ((LiveAllDataSingleActivity) this.f19901a.f19804i).m15949p1();
                        ((LiveAllDataSingleActivity) this.f19901a.f19804i).m15927S0();
                    } else {
                        ((LiveAllDataSingleActivity) this.f19901a.f19804i).m15925Q0();
                        ((LiveAllDataSingleActivity) this.f19901a.f19804i).m15951q1(this.f19901a.f19804i.getResources().getString(2132018196));
                    }
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$m.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapter$m */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$m.class */
    public class C3402m extends Filter {

        /* renamed from: a */
        public final LiveAllDataRightSideAdapter f19902a;

        public C3402m(LiveAllDataRightSideAdapter liveAllDataRightSideAdapter) {
            this.f19902a = liveAllDataRightSideAdapter;
        }

        public /* synthetic */ C3402m(LiveAllDataRightSideAdapter liveAllDataRightSideAdapter, C3390a c3390a) {
            this(liveAllDataRightSideAdapter);
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase = charSequence.toString().toLowerCase();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = this.f19902a.f19802g;
            if (arrayList == null) {
                filterResults.values = null;
                filterResults.count = 0;
                return filterResults;
            }
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                LiveStreamsDBModel liveStreamsDBModel = (LiveStreamsDBModel) arrayList.get(i10);
                if (liveStreamsDBModel.getName().toLowerCase().contains(lowerCase) || liveStreamsDBModel.getName().contains(lowerCase)) {
                    arrayList2.add(liveStreamsDBModel);
                }
            }
            filterResults.values = arrayList2;
            filterResults.count = arrayList2.size();
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            try {
                this.f19902a.f19803h = (ArrayList) filterResults.values;
                if (this.f19902a.f19803h != null) {
                    this.f19902a.m4099w();
                    if (this.f19902a.f19803h.size() == 0) {
                        ((LiveAllDataSingleActivity) this.f19902a.f19804i).m15925Q0();
                        ((LiveAllDataSingleActivity) this.f19902a.f19804i).m15951q1(this.f19902a.f19804i.getResources().getString(2132018196));
                    } else {
                        ((LiveAllDataSingleActivity) this.f19902a.f19804i).m15949p1();
                        ((LiveAllDataSingleActivity) this.f19902a.f19804i).m15927S0();
                    }
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$n.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapter$n */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapter$n.class */
    public class ViewOnFocusChangeListenerC3403n implements View.OnFocusChangeListener {

        /* renamed from: b */
        public int f19903b;

        /* renamed from: c */
        public final LiveAllDataRightSideAdapter f19904c;

        public ViewOnFocusChangeListenerC3403n(LiveAllDataRightSideAdapter liveAllDataRightSideAdapter, int i10) {
            this.f19904c = liveAllDataRightSideAdapter;
            this.f19903b = i10;
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            this.f19904c.f19814s = z10 ? this.f19903b : -1;
        }
    }

    public LiveAllDataRightSideAdapter(Context context, String str, String str2, String str3) {
        this.f19808m = "";
        this.f19811p = "mobile";
        this.f19795B = "";
        this.f19796C = "0";
        this.f19804i = context;
        this.f19806k = new DatabaseHandler(context);
        this.f19799F = new LiveStreamDBHandler(context);
        this.f19807l = AnimationUtils.loadAnimation(context, 2130771980);
        this.f19808m = str;
        this.f19795B = str2;
        this.f19796C = str3;
        if (new C6783a(context).m31288z().equals(C5251a.f30065s0)) {
            this.f19811p = "tv";
        } else {
            this.f19811p = "mobile";
        }
        this.f19798E = new Handler(Looper.getMainLooper());
        if (this.f19811p.equals("mobile")) {
            try {
                this.f19816u = C5938b.m29235e(context).m29243c().m29358c();
            } catch (Exception e10) {
            }
        }
    }

    /* renamed from: A0 */
    public int m17121A0() {
        return this.f19814s;
    }

    /* renamed from: B0 */
    public int m17122B0(String str, String str2) {
        try {
            ArrayList<LiveStreamsDBModel> arrayList = this.f19800e;
            if (arrayList == null || arrayList.size() <= 0) {
                return 0;
            }
            if (str2.equals("m3u")) {
                for (int i10 = 0; i10 < this.f19800e.size(); i10++) {
                    if (this.f19800e.get(i10).m14816W().equals(str)) {
                        return i10;
                    }
                }
                return 0;
            }
            for (int i11 = 0; i11 < this.f19800e.size(); i11++) {
                if (this.f19800e.get(i11).m14811R().equals(str)) {
                    return i11;
                }
            }
            return 0;
        } catch (Exception e10) {
            return 0;
        }
    }

    /* renamed from: C0 */
    public final void m17123C0(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, ArrayList<LiveStreamsDBModel> arrayList) {
        int i11;
        C0304c1.d c3392c;
        C0304c1 c0304c1;
        try {
            if (SharepreferenceDBHandler.m15373f(this.f19804i).equals("m3u")) {
                if (arrayList == null || arrayList.size() <= 0) {
                    return;
                }
                ViewHolder viewHolder = (ViewHolder) abstractC0674e0;
                C0304c1 c0304c12 = new C0304c1(this.f19804i, viewHolder.cardView);
                c0304c12.m1277d(2131689492);
                String m14816W = arrayList.get(i10).m14816W();
                ArrayList<FavouriteM3UModel> m15159E0 = this.f19799F.m15159E0(m14816W, SharepreferenceDBHandler.m15337A(this.f19804i));
                if (m15159E0.size() > 0) {
                    c0304c12.m1275b().getItem(0).setVisible(false);
                    c0304c12.m1275b().getItem(1).setVisible(true);
                } else {
                    c0304c12.m1275b().getItem(0).setVisible(true);
                    c0304c12.m1275b().getItem(1).setVisible(false);
                }
                c3392c = new C3391b(this, m15159E0, viewHolder, i10, arrayList, m14816W);
                c0304c1 = c0304c12;
            } else {
                if (arrayList == null || arrayList.size() <= 0) {
                    return;
                }
                ViewHolder viewHolder2 = (ViewHolder) abstractC0674e0;
                C0304c1 c0304c13 = new C0304c1(this.f19804i, viewHolder2.cardView);
                c0304c13.m1277d(2131689492);
                LiveStreamsDBModel liveStreamsDBModel = arrayList.get(i10);
                if (liveStreamsDBModel.m14811R() != null) {
                    try {
                        i11 = Integer.parseInt(liveStreamsDBModel.m14811R());
                    } catch (NumberFormatException e10) {
                        i11 = 0;
                    }
                } else {
                    i11 = -1;
                }
                ArrayList<FavouriteDBModel> m15112o = this.f19806k.m15112o(i11, liveStreamsDBModel.m14827g(), liveStreamsDBModel.m14812S(), SharepreferenceDBHandler.m15337A(this.f19804i));
                if (m15112o.size() > 0) {
                    c0304c13.m1275b().getItem(0).setVisible(false);
                    c0304c13.m1275b().getItem(1).setVisible(true);
                } else {
                    c0304c13.m1275b().getItem(0).setVisible(true);
                    c0304c13.m1275b().getItem(1).setVisible(false);
                }
                c3392c = new C3392c(this, m15112o, viewHolder2, i10, arrayList, i11);
                c0304c1 = c0304c13;
            }
            c0304c1.m1279f(c3392c);
            c0304c1.m1280g();
        } catch (Exception e11) {
        }
    }

    /* renamed from: D0 */
    public final void m17124D0(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, ArrayList<LiveStreamsDBModel> arrayList) {
        this.f19806k.m15115t(C5255e.m26215R(arrayList.get(i10).m14811R()), arrayList.get(i10).m14827g(), arrayList.get(i10).m14812S(), arrayList.get(i10).getName(), SharepreferenceDBHandler.m15337A(this.f19804i));
        ((ViewHolder) abstractC0674e0).ivFavourite.setVisibility(4);
    }

    /* renamed from: E0 */
    public final void m17125E0(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, ArrayList<LiveStreamsDBModel> arrayList) {
        this.f19799F.m15188R0(arrayList.get(i10).m14816W(), SharepreferenceDBHandler.m15337A(this.f19804i));
        ((ViewHolder) abstractC0674e0).ivFavourite.setVisibility(4);
    }

    /* renamed from: F0 */
    public void m17126F0() {
        this.f19813r = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0229, code lost:
    
        if (r9.f19799F.m15159E0(r15, com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler.m15337A(r9.f19804i)).size() > 0) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0216 A[Catch: Exception -> 0x0363, TryCatch #2 {Exception -> 0x0363, blocks: (B:3:0x0022, B:5:0x002b, B:7:0x0032, B:9:0x003b, B:11:0x006a, B:13:0x0072, B:15:0x0078, B:16:0x0086, B:18:0x008e, B:19:0x009a, B:66:0x00a6, B:22:0x00bb, B:24:0x00c3, B:25:0x00d1, B:27:0x00d9, B:28:0x00e7, B:30:0x00ef, B:31:0x00fd, B:34:0x0123, B:36:0x013b, B:41:0x0206, B:43:0x0216, B:46:0x022e, B:47:0x025f, B:49:0x032f, B:51:0x0335, B:52:0x0238, B:53:0x0244, B:38:0x01c6, B:40:0x01bc, B:60:0x017d, B:61:0x012f, B:73:0x034d, B:57:0x0147), top: B:2:0x0022, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0244 A[Catch: Exception -> 0x0363, TRY_ENTER, TryCatch #2 {Exception -> 0x0363, blocks: (B:3:0x0022, B:5:0x002b, B:7:0x0032, B:9:0x003b, B:11:0x006a, B:13:0x0072, B:15:0x0078, B:16:0x0086, B:18:0x008e, B:19:0x009a, B:66:0x00a6, B:22:0x00bb, B:24:0x00c3, B:25:0x00d1, B:27:0x00d9, B:28:0x00e7, B:30:0x00ef, B:31:0x00fd, B:34:0x0123, B:36:0x013b, B:41:0x0206, B:43:0x0216, B:46:0x022e, B:47:0x025f, B:49:0x032f, B:51:0x0335, B:52:0x0238, B:53:0x0244, B:38:0x01c6, B:40:0x01bc, B:60:0x017d, B:61:0x012f, B:73:0x034d, B:57:0x0147), top: B:2:0x0022, inners: #0 }] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    @android.annotation.SuppressLint({"SetTextI18n"})
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo2996G(@org.jetbrains.annotations.NotNull androidx.recyclerview.widget.RecyclerView.AbstractC0674e0 r10, int r11) {
        /*
            Method dump skipped, instructions count: 871
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapter.mo2996G(androidx.recyclerview.widget.RecyclerView$e0, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    @NotNull
    /* renamed from: J */
    public RecyclerView.AbstractC0674e0 mo2998J(@NotNull ViewGroup viewGroup, int i10) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(2131624323, viewGroup, false));
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.f19808m.equals("continue_watching") ? this.f19810o : this.f19809n;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        ArrayList<LiveStreamsDBModel> arrayList;
        if (this.f19808m.equals("continue_watching")) {
            ArrayList<LiveStreamsDBModel> arrayList2 = this.f19803h;
            if (arrayList2 == null || arrayList2.size() <= 0) {
                return 0;
            }
            arrayList = this.f19803h;
        } else {
            ArrayList<LiveStreamsDBModel> arrayList3 = this.f19801f;
            if (arrayList3 == null || arrayList3.size() <= 0) {
                return 0;
            }
            arrayList = this.f19801f;
        }
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: q */
    public int mo3018q(int i10) {
        return 0;
    }

    /* renamed from: v0 */
    public final void m17127v0(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, ArrayList<LiveStreamsDBModel> arrayList) {
        ViewHolder viewHolder = (ViewHolder) abstractC0674e0;
        FavouriteDBModel favouriteDBModel = new FavouriteDBModel();
        favouriteDBModel.m14767h(arrayList.get(i10).m14827g());
        favouriteDBModel.m14772m(C5255e.m26215R(arrayList.get(i10).m14811R()));
        favouriteDBModel.m14770k(arrayList.get(i10).getName());
        favouriteDBModel.m14771l(arrayList.get(i10).m14805L());
        favouriteDBModel.m14774o(SharepreferenceDBHandler.m15337A(this.f19804i));
        this.f19806k.m15111l(favouriteDBModel, arrayList.get(i10).m14812S());
        viewHolder.ivFavourite.startAnimation(this.f19807l);
        viewHolder.ivFavourite.setVisibility(0);
    }

    /* renamed from: w0 */
    public final void m17128w0(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, ArrayList<LiveStreamsDBModel> arrayList) {
        ViewHolder viewHolder = (ViewHolder) abstractC0674e0;
        FavouriteM3UModel favouriteM3UModel = new FavouriteM3UModel();
        favouriteM3UModel.m14782h(arrayList.get(i10).m14816W());
        favouriteM3UModel.m14783i(SharepreferenceDBHandler.m15337A(this.f19804i));
        favouriteM3UModel.m14781g(arrayList.get(i10).getName());
        favouriteM3UModel.m14779e(arrayList.get(i10).m14827g());
        this.f19799F.m15156D0(favouriteM3UModel);
        viewHolder.ivFavourite.startAnimation(this.f19807l);
        viewHolder.ivFavourite.setVisibility(0);
    }

    /* renamed from: x0 */
    public final void m17129x0(ArrayList<FavouriteDBModel> arrayList, RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, ArrayList<LiveStreamsDBModel> arrayList2) {
        if (arrayList.size() > 0) {
            m17124D0(abstractC0674e0, i10, arrayList2);
        } else {
            m17127v0(abstractC0674e0, i10, arrayList2);
        }
        this.f19813r = true;
        Context context = this.f19804i;
        if (context instanceof LiveAllDataSingleActivity) {
            ((LiveAllDataSingleActivity) context).m15938e1();
        }
    }

    /* renamed from: y0 */
    public final void m17130y0(ArrayList<FavouriteM3UModel> arrayList, RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, ArrayList<LiveStreamsDBModel> arrayList2) {
        if (arrayList.size() > 0) {
            m17125E0(abstractC0674e0, i10, arrayList2);
        } else {
            m17128w0(abstractC0674e0, i10, arrayList2);
        }
        this.f19813r = true;
        Context context = this.f19804i;
        if (context instanceof LiveAllDataSingleActivity) {
            ((LiveAllDataSingleActivity) context).m15938e1();
        }
    }

    /* renamed from: z0 */
    public boolean m17131z0() {
        return this.f19813r;
    }
}

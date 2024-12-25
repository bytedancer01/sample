package com.maxdigitall.maxdigitaliptvbox.view.adapter;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.C0704c;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteM3UModel;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamCategoryIdDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.PasswordStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import nf.C6783a;
import p151if.C5251a;
import p316s2.C8522c;
import p324sf.InterfaceC8568g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiPlayerCategoriesAdapter.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiPlayerCategoriesAdapter.class */
public class MultiPlayerCategoriesAdapter extends RecyclerView.AbstractC0677h<MyViewHolder> {

    /* renamed from: A */
    public MultiPlayerChannelsAdapter f20025A;

    /* renamed from: B */
    public GridLayoutManager f20026B;

    /* renamed from: C */
    public TextView f20027C;

    /* renamed from: D */
    public TextView f20028D;

    /* renamed from: E */
    public InterfaceC8568g f20029E;

    /* renamed from: F */
    public PopupWindow f20030F;

    /* renamed from: G */
    public ArrayList<LiveStreamsDBModel> f20031G;

    /* renamed from: H */
    public ArrayList<LiveStreamsDBModel> f20032H;

    /* renamed from: J */
    public ArrayList<PasswordStatusDBModel> f20034J;

    /* renamed from: K */
    public ArrayList<FavouriteM3UModel> f20035K;

    /* renamed from: L */
    public ArrayList<FavouriteDBModel> f20036L;

    /* renamed from: M */
    public DatabaseHandler f20037M;

    /* renamed from: e */
    public List<LiveStreamCategoryIdDBModel> f20038e;

    /* renamed from: f */
    public Context f20039f;

    /* renamed from: g */
    public List<LiveStreamCategoryIdDBModel> f20040g;

    /* renamed from: h */
    public List<LiveStreamCategoryIdDBModel> f20041h;

    /* renamed from: i */
    public LiveStreamDBHandler f20042i;

    /* renamed from: j */
    public DatabaseHandler f20043j;

    /* renamed from: o */
    public RecyclerView f20048o;

    /* renamed from: p */
    public ProgressBar f20049p;

    /* renamed from: q */
    public RelativeLayout f20050q;

    /* renamed from: s */
    public AppBarLayout f20052s;

    /* renamed from: t */
    public PopupWindow f20053t;

    /* renamed from: v */
    public ArrayList<LiveStreamsDBModel> f20055v;

    /* renamed from: w */
    public ArrayList<LiveStreamsDBModel> f20056w;

    /* renamed from: x */
    public ArrayList<LiveStreamsDBModel> f20057x;

    /* renamed from: y */
    public ArrayList<LiveStreamsDBModel> f20058y;

    /* renamed from: k */
    public boolean f20044k = true;

    /* renamed from: l */
    public int f20045l = 0;

    /* renamed from: m */
    public AsyncTask f20046m = null;

    /* renamed from: n */
    public int f20047n = 0;

    /* renamed from: r */
    public AsyncTask f20051r = null;

    /* renamed from: u */
    public AsyncTask f20054u = null;

    /* renamed from: z */
    public String f20059z = "";

    /* renamed from: I */
    public ArrayList<String> f20033I = new ArrayList<>();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiPlayerCategoriesAdapter$MyViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiPlayerCategoriesAdapter$MyViewHolder.class */
    public static class MyViewHolder extends RecyclerView.AbstractC0674e0 {

        @BindView
        public ImageView iv_foraward_arrow;

        @BindView
        public ProgressBar pbPagingLoader;

        @BindView
        public RelativeLayout rlListOfCategories;

        @BindView
        public RelativeLayout rlOuter;

        @BindView
        public RelativeLayout testing;

        @BindView
        public TextView tvMovieCategoryName;

        @BindView
        public TextView tvXubCount;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.m5627b(this, view);
            m4048L(false);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiPlayerCategoriesAdapter$MyViewHolder_ViewBinding.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiPlayerCategoriesAdapter$MyViewHolder_ViewBinding.class */
    public class MyViewHolder_ViewBinding implements Unbinder {

        /* renamed from: b */
        public MyViewHolder f20060b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f20060b = myViewHolder;
            myViewHolder.tvMovieCategoryName = (TextView) C8522c.m36739c(view, 2131429513, "field 'tvMovieCategoryName'", TextView.class);
            myViewHolder.pbPagingLoader = (ProgressBar) C8522c.m36739c(view, 2131428840, "field 'pbPagingLoader'", ProgressBar.class);
            myViewHolder.rlOuter = (RelativeLayout) C8522c.m36739c(view, 2131429028, "field 'rlOuter'", RelativeLayout.class);
            myViewHolder.rlListOfCategories = (RelativeLayout) C8522c.m36739c(view, 2131429008, "field 'rlListOfCategories'", RelativeLayout.class);
            myViewHolder.testing = (RelativeLayout) C8522c.m36739c(view, 2131429278, "field 'testing'", RelativeLayout.class);
            myViewHolder.tvXubCount = (TextView) C8522c.m36739c(view, 2131429620, "field 'tvXubCount'", TextView.class);
            myViewHolder.iv_foraward_arrow = (ImageView) C8522c.m36739c(view, 2131428181, "field 'iv_foraward_arrow'", ImageView.class);
        }

        @Override // butterknife.Unbinder
        /* renamed from: a */
        public void mo5629a() {
            MyViewHolder myViewHolder = this.f20060b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f20060b = null;
            myViewHolder.tvMovieCategoryName = null;
            myViewHolder.pbPagingLoader = null;
            myViewHolder.rlOuter = null;
            myViewHolder.rlListOfCategories = null;
            myViewHolder.testing = null;
            myViewHolder.tvXubCount = null;
            myViewHolder.iv_foraward_arrow = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiPlayerCategoriesAdapter$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.MultiPlayerCategoriesAdapter$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiPlayerCategoriesAdapter$a.class */
    public class ViewOnKeyListenerC3424a implements View.OnKeyListener {

        /* renamed from: b */
        public final RecyclerView f20061b;

        /* renamed from: c */
        public final MultiPlayerCategoriesAdapter f20062c;

        public ViewOnKeyListenerC3424a(MultiPlayerCategoriesAdapter multiPlayerCategoriesAdapter, RecyclerView recyclerView) {
            this.f20062c = multiPlayerCategoriesAdapter;
            this.f20061b = recyclerView;
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            MultiPlayerCategoriesAdapter multiPlayerCategoriesAdapter;
            int i11;
            RecyclerView.AbstractC0685p layoutManager = this.f20061b.getLayoutManager();
            if (keyEvent.getAction() != 0) {
                return false;
            }
            if (i10 == 20) {
                multiPlayerCategoriesAdapter = this.f20062c;
                i11 = 1;
            } else {
                if (i10 != 19) {
                    return false;
                }
                multiPlayerCategoriesAdapter = this.f20062c;
                i11 = -1;
            }
            return multiPlayerCategoriesAdapter.m17203H0(layoutManager, i11);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiPlayerCategoriesAdapter$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.MultiPlayerCategoriesAdapter$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiPlayerCategoriesAdapter$b.class */
    public class C3425b implements Comparator<LiveStreamCategoryIdDBModel> {

        /* renamed from: b */
        public final MultiPlayerCategoriesAdapter f20063b;

        public C3425b(MultiPlayerCategoriesAdapter multiPlayerCategoriesAdapter) {
            this.f20063b = multiPlayerCategoriesAdapter;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel, LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel2) {
            return liveStreamCategoryIdDBModel.m14788c().compareTo(liveStreamCategoryIdDBModel2.m14788c());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiPlayerCategoriesAdapter$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.MultiPlayerCategoriesAdapter$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiPlayerCategoriesAdapter$c.class */
    public class C3426c implements Comparator<LiveStreamCategoryIdDBModel> {

        /* renamed from: b */
        public final MultiPlayerCategoriesAdapter f20064b;

        public C3426c(MultiPlayerCategoriesAdapter multiPlayerCategoriesAdapter) {
            this.f20064b = multiPlayerCategoriesAdapter;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel, LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel2) {
            return liveStreamCategoryIdDBModel2.m14788c().compareTo(liveStreamCategoryIdDBModel.m14788c());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiPlayerCategoriesAdapter$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.MultiPlayerCategoriesAdapter$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiPlayerCategoriesAdapter$d.class */
    public class ViewOnClickListenerC3427d implements View.OnClickListener {

        /* renamed from: b */
        public final MyViewHolder f20065b;

        /* renamed from: c */
        public final String f20066c;

        /* renamed from: d */
        public final MultiPlayerCategoriesAdapter f20067d;

        public ViewOnClickListenerC3427d(MultiPlayerCategoriesAdapter multiPlayerCategoriesAdapter, MyViewHolder myViewHolder, String str) {
            this.f20067d = multiPlayerCategoriesAdapter;
            this.f20065b = myViewHolder;
            this.f20066c = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f20067d.f20047n = this.f20065b.m4068r();
            MultiPlayerCategoriesAdapter multiPlayerCategoriesAdapter = this.f20067d;
            multiPlayerCategoriesAdapter.m17209t0(multiPlayerCategoriesAdapter.f20039f, view, this.f20066c);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiPlayerCategoriesAdapter$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.MultiPlayerCategoriesAdapter$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiPlayerCategoriesAdapter$e.class */
    public class C3428e implements PopupWindow.OnDismissListener {

        /* renamed from: b */
        public final MultiPlayerCategoriesAdapter f20068b;

        public C3428e(MultiPlayerCategoriesAdapter multiPlayerCategoriesAdapter) {
            this.f20068b = multiPlayerCategoriesAdapter;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiPlayerCategoriesAdapter$f.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.MultiPlayerCategoriesAdapter$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiPlayerCategoriesAdapter$f.class */
    public class AsyncTaskC3429f extends AsyncTask<MyViewHolder, Void, Integer> {

        /* renamed from: a */
        public MyViewHolder f20069a;

        /* renamed from: b */
        public final MultiPlayerCategoriesAdapter f20070b;

        public AsyncTaskC3429f(MultiPlayerCategoriesAdapter multiPlayerCategoriesAdapter, MyViewHolder myViewHolder) {
            this.f20070b = multiPlayerCategoriesAdapter;
            this.f20069a = myViewHolder;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(MyViewHolder... myViewHolderArr) {
            try {
                return SharepreferenceDBHandler.m15373f(this.f20070b.f20039f).equals("m3u") ? Integer.valueOf(this.f20070b.f20042i.m15173J1("live")) : Integer.valueOf(this.f20070b.f20043j.m15109B("live", SharepreferenceDBHandler.m15337A(this.f20070b.f20039f)));
            } catch (Exception e10) {
                return 0;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            if (num.intValue() == 0 || num.intValue() == -1) {
                this.f20069a.tvXubCount.setText("0");
            } else {
                this.f20069a.tvXubCount.setText(String.valueOf(num));
            }
            this.f20069a.tvXubCount.setVisibility(0);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f20069a.tvXubCount.setVisibility(8);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiPlayerCategoriesAdapter$g.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.MultiPlayerCategoriesAdapter$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiPlayerCategoriesAdapter$g.class */
    public class AsyncTaskC3430g extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        public final MultiPlayerCategoriesAdapter f20071a;

        public AsyncTaskC3430g(MultiPlayerCategoriesAdapter multiPlayerCategoriesAdapter) {
            this.f20071a = multiPlayerCategoriesAdapter;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(String... strArr) {
            boolean z10 = false;
            String str = strArr[0];
            try {
                int hashCode = str.hashCode();
                if (hashCode == -74797390) {
                    if (str.equals("get_fav")) {
                        z10 = 2;
                    }
                    z10 = -1;
                } else if (hashCode != 47612238) {
                    if (hashCode == 613425326 && str.equals("all_channels")) {
                    }
                    z10 = -1;
                } else {
                    if (str.equals("all_channels_with_cat")) {
                        z10 = true;
                    }
                    z10 = -1;
                }
                if (!z10) {
                    return this.f20071a.m17205p0();
                }
                if (z10) {
                    return this.f20071a.m17207r0();
                }
                if (z10 != 2) {
                    return null;
                }
                return this.f20071a.m17212w0();
            } catch (Exception e10) {
                return "error";
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            try {
                if (this.f20071a.f20055v == null || this.f20071a.f20055v.size() == 0) {
                    ProgressBar progressBar = this.f20071a.f20049p;
                    if (progressBar != null) {
                        progressBar.setVisibility(4);
                        this.f20071a.f20028D.setVisibility(0);
                    }
                } else {
                    MultiPlayerCategoriesAdapter multiPlayerCategoriesAdapter = this.f20071a;
                    multiPlayerCategoriesAdapter.m17202G0(multiPlayerCategoriesAdapter.f20055v);
                }
            } catch (Exception e10) {
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiPlayerCategoriesAdapter$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.MultiPlayerCategoriesAdapter$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiPlayerCategoriesAdapter$h.class */
    public class ViewOnFocusChangeListenerC3431h implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f20072b;

        /* renamed from: c */
        public final MultiPlayerCategoriesAdapter f20073c;

        public ViewOnFocusChangeListenerC3431h(MultiPlayerCategoriesAdapter multiPlayerCategoriesAdapter, View view) {
            this.f20073c = multiPlayerCategoriesAdapter;
            this.f20072b = view;
        }

        /* renamed from: a */
        public final void m17222a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f20072b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m17223b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f20072b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m17224c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f20072b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            View view2;
            int i10;
            if (z10) {
                m17223b(1.09f);
                m17224c(1.09f);
                Log.e("id is", "" + this.f20072b.getTag());
                view2 = this.f20072b;
                i10 = 2131231896;
            } else {
                if (z10) {
                    return;
                }
                m17223b(1.0f);
                m17224c(1.0f);
                m17222a(false);
                view2 = this.f20072b;
                i10 = 2131231895;
            }
            view2.setBackgroundResource(i10);
        }
    }

    public MultiPlayerCategoriesAdapter(List<LiveStreamCategoryIdDBModel> list, Context context, InterfaceC8568g interfaceC8568g, PopupWindow popupWindow, int i10) {
        ArrayList arrayList = new ArrayList();
        this.f20040g = arrayList;
        arrayList.addAll(list);
        this.f20041h = list;
        this.f20038e = list;
        this.f20039f = context;
        this.f20042i = new LiveStreamDBHandler(context);
        this.f20043j = new DatabaseHandler(context);
        this.f20055v = new ArrayList<>();
        this.f20056w = new ArrayList<>();
        this.f20057x = new ArrayList<>();
        this.f20058y = new ArrayList<>();
        this.f20029E = interfaceC8568g;
        this.f20030F = popupWindow;
        this.f20037M = new DatabaseHandler(context);
        String m15381j = SharepreferenceDBHandler.m15381j(context);
        if (m15381j.equals("1")) {
            Collections.sort(list, new C3425b(this));
        }
        if (m15381j.equals("2")) {
            Collections.sort(list, new C3426c(this));
        }
    }

    /* renamed from: A0 */
    public final ArrayList<FavouriteM3UModel> m17196A0(ArrayList<FavouriteM3UModel> arrayList, ArrayList<String> arrayList2) {
        boolean z10;
        this.f20035K = new ArrayList<>();
        if (arrayList == null) {
            return null;
        }
        try {
            Iterator<FavouriteM3UModel> it = arrayList.iterator();
            while (it.hasNext()) {
                FavouriteM3UModel next = it.next();
                if (arrayList2 != null) {
                    Iterator<String> it2 = arrayList2.iterator();
                    while (true) {
                        z10 = false;
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (next.m14775a().equals(it2.next())) {
                            z10 = true;
                            break;
                        }
                    }
                    if (!z10) {
                        this.f20035K.add(next);
                    }
                }
            }
            return this.f20035K;
        } catch (Exception e10) {
            return null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: B0, reason: merged with bridge method [inline-methods] */
    public void mo2996G(MyViewHolder myViewHolder, int i10) {
        LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = this.f20038e.get(i10);
        String m14788c = liveStreamCategoryIdDBModel.m14788c();
        String m14787b = liveStreamCategoryIdDBModel.m14787b();
        Bundle bundle = new Bundle();
        bundle.putString("category_id", m14787b);
        bundle.putString("category_name", m14788c);
        if (m14788c != null && !m14788c.equals("") && !m14788c.isEmpty()) {
            myViewHolder.tvMovieCategoryName.setText(m14788c);
        }
        if (SharepreferenceDBHandler.m15373f(this.f20039f).equals("m3u")) {
            if (liveStreamCategoryIdDBModel.m14787b().equals("-1")) {
                m17201F0(myViewHolder);
            } else {
                myViewHolder.tvXubCount.setText(String.valueOf(liveStreamCategoryIdDBModel.m14789d()));
            }
            if (m14787b.equals("0")) {
                this.f20045l = liveStreamCategoryIdDBModel.m14789d();
            }
        } else {
            if (liveStreamCategoryIdDBModel.m14787b().equals("-1")) {
                m17201F0(myViewHolder);
            } else {
                myViewHolder.tvXubCount.setText(String.valueOf(liveStreamCategoryIdDBModel.m14789d()));
            }
            if (m14787b.equals("0")) {
                int m15205Z1 = this.f20042i.m15205Z1("live");
                if (m15205Z1 == 0 || m15205Z1 == -1) {
                    myViewHolder.tvXubCount.setText("");
                } else {
                    myViewHolder.tvXubCount.setText(String.valueOf(m15205Z1));
                }
            }
        }
        if (new C6783a(this.f20039f).m31288z().equals(C5251a.f30065s0) && i10 == this.f20047n) {
            myViewHolder.rlOuter.requestFocus();
            m17199D0(1.09f, myViewHolder.rlOuter);
            m17200E0(1.09f, myViewHolder.rlOuter);
            myViewHolder.rlOuter.setBackgroundResource(2131231896);
        }
        myViewHolder.rlOuter.setOnClickListener(new ViewOnClickListenerC3427d(this, myViewHolder, m14787b));
        RelativeLayout relativeLayout = myViewHolder.rlOuter;
        relativeLayout.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3431h(this, relativeLayout));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: C0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder mo2998J(ViewGroup viewGroup, int i10) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131624240, viewGroup, false);
        ImageView imageView = (ImageView) inflate.findViewById(2131428181);
        if (SharepreferenceDBHandler.m15397t(this.f20039f).equalsIgnoreCase("Arabic")) {
            imageView.setImageResource(2131231526);
        }
        return new MyViewHolder(inflate);
    }

    /* renamed from: D0 */
    public final void m17199D0(float f10, RelativeLayout relativeLayout) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(relativeLayout, "scaleX", f10);
        ofFloat.setDuration(150L);
        ofFloat.start();
    }

    /* renamed from: E0 */
    public final void m17200E0(float f10, RelativeLayout relativeLayout) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(relativeLayout, "scaleY", f10);
        ofFloat.setDuration(150L);
        ofFloat.start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: F */
    public void mo4088F(RecyclerView recyclerView) {
        super.mo4088F(recyclerView);
        recyclerView.setOnKeyListener(new ViewOnKeyListenerC3424a(this, recyclerView));
    }

    /* renamed from: F0 */
    public final void m17201F0(MyViewHolder myViewHolder) {
        new AsyncTaskC3429f(this, myViewHolder).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, myViewHolder);
    }

    /* renamed from: G0 */
    public final void m17202G0(ArrayList<LiveStreamsDBModel> arrayList) {
        this.f20025A = new MultiPlayerChannelsAdapter(arrayList, this.f20039f, this.f20053t, this.f20029E, this.f20030F);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f20039f, 1);
        this.f20026B = gridLayoutManager;
        this.f20048o.setLayoutManager(gridLayoutManager);
        this.f20048o.setItemAnimator(new C0704c());
        this.f20048o.setAdapter(this.f20025A);
        ProgressBar progressBar = this.f20049p;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    /* renamed from: H0 */
    public final boolean m17203H0(RecyclerView.AbstractC0685p abstractC0685p, int i10) {
        int i11 = this.f20047n + i10;
        if (i11 < 0 || i11 >= mo3013n()) {
            return false;
        }
        m4100x(this.f20047n);
        this.f20047n = i11;
        m4100x(i11);
        abstractC0685p.mo2769U1(this.f20047n);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        return this.f20038e.size();
    }

    /* renamed from: o0 */
    public void m17204o0() {
        m17210u0();
        this.f20054u = new AsyncTaskC3430g(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "all_channels");
    }

    /* renamed from: p0 */
    public final String m17205p0() {
        try {
            ArrayList<LiveStreamsDBModel> arrayList = this.f20055v;
            if (arrayList != null && this.f20056w != null) {
                arrayList.clear();
                this.f20056w.clear();
            }
            int m15189R1 = this.f20042i.m15189R1(SharepreferenceDBHandler.m15337A(this.f20039f));
            ArrayList<LiveStreamsDBModel> m15217f1 = this.f20042i.m15217f1("0", "live");
            this.f20032H = m15217f1;
            if (m15189R1 <= 0 || m15217f1 == null) {
                this.f20055v = m15217f1;
                return "all_channels";
            }
            ArrayList<String> arrayList2 = this.f20033I;
            if (arrayList2 != null) {
                this.f20057x = m17214y0(m15217f1, arrayList2);
            }
            this.f20055v = this.f20057x;
            return "all_channels";
        } catch (Exception e10) {
            return "all_channels";
        }
    }

    /* renamed from: q0 */
    public void m17206q0() {
        m17210u0();
        this.f20054u = new AsyncTaskC3430g(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "all_channels_with_cat");
    }

    /* renamed from: r0 */
    public final String m17207r0() {
        try {
            ArrayList<LiveStreamsDBModel> arrayList = this.f20055v;
            if (arrayList != null && this.f20056w != null) {
                arrayList.clear();
                this.f20056w.clear();
            }
            LiveStreamDBHandler liveStreamDBHandler = this.f20042i;
            if (liveStreamDBHandler != null) {
                this.f20058y = liveStreamDBHandler.m15217f1(this.f20059z, "live");
            }
            this.f20055v = this.f20058y;
            return "all_channels_with_cat";
        } catch (Exception e10) {
            return "all_channels_with_cat";
        }
    }

    /* renamed from: s0 */
    public void m17208s0() {
        m17210u0();
        this.f20054u = new AsyncTaskC3430g(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_fav");
    }

    @SuppressLint({"ResourceType"})
    /* renamed from: t0 */
    public final void m17209t0(Context context, View view, String str) {
        this.f20059z = str;
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(2131624123, (LinearLayout) view.findViewById(2131428492));
        this.f20049p = (ProgressBar) inflate.findViewById(2131428830);
        this.f20048o = (RecyclerView) inflate.findViewById(2131428747);
        this.f20050q = (RelativeLayout) inflate.findViewById(2131429021);
        this.f20052s = (AppBarLayout) inflate.findViewById(2131427548);
        this.f20027C = (TextView) inflate.findViewById(2131429607);
        this.f20028D = (TextView) inflate.findViewById(2131428784);
        this.f20027C.setText(context.getResources().getString(2132017954));
        PopupWindow popupWindow = new PopupWindow(context);
        this.f20053t = popupWindow;
        popupWindow.setContentView(inflate);
        this.f20053t.setWidth(-1);
        this.f20053t.setHeight(-1);
        this.f20053t.setFocusable(true);
        this.f20053t.setOnDismissListener(new C3428e(this));
        ProgressBar progressBar = this.f20049p;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        AppBarLayout appBarLayout = this.f20052s;
        if (appBarLayout != null) {
            appBarLayout.setBackground(context.getResources().getDrawable(2131100143));
        }
        this.f20033I = m17213x0();
        String str2 = this.f20059z;
        if (str2 == null || str2.equals("") || !this.f20059z.equals("0")) {
            String str3 = this.f20059z;
            if (str3 == null || str3.equals("") || !this.f20059z.equals("-1")) {
                m17206q0();
            } else {
                m17208s0();
            }
        } else {
            m17204o0();
        }
        this.f20053t.showAtLocation(inflate, 1, 0, 0);
    }

    /* renamed from: u0 */
    public final void m17210u0() {
        AsyncTask asyncTask = this.f20054u;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            SharepreferenceDBHandler.m15348L(0, this.f20039f);
        } else {
            SharepreferenceDBHandler.m15348L(1, this.f20039f);
            this.f20054u.cancel(true);
        }
    }

    /* renamed from: v0 */
    public void m17211v0() {
        ArrayList<LiveStreamsDBModel> arrayList;
        try {
            if (SharepreferenceDBHandler.m15373f(this.f20039f).equals("m3u")) {
                new ArrayList();
                LiveStreamDBHandler liveStreamDBHandler = this.f20042i;
                if (liveStreamDBHandler == null) {
                    return;
                }
                ArrayList<FavouriteM3UModel> m15175K1 = liveStreamDBHandler.m15175K1("live");
                ArrayList<LiveStreamsDBModel> arrayList2 = new ArrayList<>();
                ArrayList<String> arrayList3 = this.f20033I;
                ArrayList<FavouriteM3UModel> arrayList4 = m15175K1;
                if (arrayList3 != null) {
                    arrayList4 = m15175K1;
                    if (arrayList3.size() > 0) {
                        arrayList4 = m15175K1;
                        if (m15175K1 != null) {
                            arrayList4 = m15175K1;
                            if (m15175K1.size() > 0) {
                                arrayList4 = m17196A0(m15175K1, this.f20033I);
                            }
                        }
                    }
                }
                Iterator<FavouriteM3UModel> it = arrayList4.iterator();
                while (it.hasNext()) {
                    FavouriteM3UModel next = it.next();
                    ArrayList<LiveStreamsDBModel> m15183O1 = this.f20042i.m15183O1(next.m14775a(), next.m14777c());
                    if (m15183O1 != null && m15183O1.size() > 0) {
                        arrayList2.add(m15183O1.get(0));
                    }
                }
                if (arrayList2.size() == 0) {
                    return;
                } else {
                    arrayList = arrayList2;
                }
            } else {
                new ArrayList();
                DatabaseHandler databaseHandler = this.f20037M;
                if (databaseHandler == null) {
                    return;
                }
                ArrayList<FavouriteDBModel> m15116v = databaseHandler.m15116v("live", SharepreferenceDBHandler.m15337A(this.f20039f));
                ArrayList<LiveStreamsDBModel> arrayList5 = new ArrayList<>();
                ArrayList<String> arrayList6 = this.f20033I;
                ArrayList<FavouriteDBModel> arrayList7 = m15116v;
                if (arrayList6 != null) {
                    arrayList7 = m15116v;
                    if (arrayList6.size() > 0) {
                        arrayList7 = m15116v;
                        if (m15116v != null) {
                            arrayList7 = m15116v;
                            if (m15116v.size() > 0) {
                                arrayList7 = m17215z0(m15116v, this.f20033I);
                            }
                        }
                    }
                }
                Iterator<FavouriteDBModel> it2 = arrayList7.iterator();
                while (it2.hasNext()) {
                    FavouriteDBModel next2 = it2.next();
                    LiveStreamsDBModel m15179M1 = new LiveStreamDBHandler(this.f20039f).m15179M1(next2.m14760a(), String.valueOf(next2.m14764e()));
                    if (m15179M1 != null) {
                        arrayList5.add(m15179M1);
                    }
                }
                if (arrayList5.size() == 0) {
                    return;
                } else {
                    arrayList = arrayList5;
                }
            }
            this.f20031G = arrayList;
        } catch (Exception e10) {
        }
    }

    /* renamed from: w0 */
    public String m17212w0() {
        try {
            ArrayList<LiveStreamsDBModel> arrayList = this.f20055v;
            if (arrayList != null && this.f20056w != null) {
                arrayList.clear();
                this.f20056w.clear();
            }
            this.f20031G = new ArrayList<>();
            m17211v0();
            this.f20055v = this.f20031G;
            return "get_fav";
        } catch (Exception e10) {
            return "get_fav";
        }
    }

    /* renamed from: x0 */
    public final ArrayList<String> m17213x0() {
        ArrayList<PasswordStatusDBModel> m15232m1 = this.f20042i.m15232m1(SharepreferenceDBHandler.m15337A(this.f20039f));
        this.f20034J = m15232m1;
        if (m15232m1 != null) {
            Iterator<PasswordStatusDBModel> it = m15232m1.iterator();
            while (it.hasNext()) {
                PasswordStatusDBModel next = it.next();
                if (next.m15290a().equals("1")) {
                    this.f20033I.add(next.m15291b());
                }
            }
        }
        return this.f20033I;
    }

    /* renamed from: y0 */
    public final ArrayList<LiveStreamsDBModel> m17214y0(ArrayList<LiveStreamsDBModel> arrayList, ArrayList<String> arrayList2) {
        boolean z10;
        try {
            Iterator<LiveStreamsDBModel> it = arrayList.iterator();
            while (it.hasNext()) {
                LiveStreamsDBModel next = it.next();
                Iterator<String> it2 = arrayList2.iterator();
                while (true) {
                    z10 = false;
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (next.m14827g().equals(it2.next())) {
                        z10 = true;
                        break;
                    }
                }
                if (!z10) {
                    this.f20056w.add(next);
                }
            }
        } catch (Exception e10) {
        }
        return this.f20056w;
    }

    /* renamed from: z0 */
    public final ArrayList<FavouriteDBModel> m17215z0(ArrayList<FavouriteDBModel> arrayList, ArrayList<String> arrayList2) {
        boolean z10;
        try {
            this.f20036L = new ArrayList<>();
            Iterator<FavouriteDBModel> it = arrayList.iterator();
            while (it.hasNext()) {
                FavouriteDBModel next = it.next();
                Iterator<String> it2 = arrayList2.iterator();
                while (true) {
                    z10 = false;
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (next.m14760a().equals(it2.next())) {
                        z10 = true;
                        break;
                    }
                }
                if (!z10) {
                    this.f20036L.add(next);
                }
            }
        } catch (Exception e10) {
        }
        return this.f20036L;
    }
}

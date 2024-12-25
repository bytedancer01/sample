package com.maxdigitall.maxdigitaliptvbox.view.adapter;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.TMDBCastsPojo;
import com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsCastActivity;
import java.util.List;
import nf.C6783a;
import org.jetbrains.annotations.NotNull;
import p151if.C5251a;
import p316s2.C8522c;
import p428yg.C10014t;
import p428yg.InterfaceC9996e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/CastAdapter.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/CastAdapter.class */
public class CastAdapter extends RecyclerView.AbstractC0677h<MyViewHolder> {

    /* renamed from: e */
    public Context f19646e;

    /* renamed from: f */
    public List<TMDBCastsPojo> f19647f;

    /* renamed from: g */
    public String f19648g;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/CastAdapter$MyViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/CastAdapter$MyViewHolder.class */
    public static class MyViewHolder extends RecyclerView.AbstractC0674e0 {

        @BindView
        public RelativeLayout Movie;

        @BindView
        public ImageView MovieImage;

        @BindView
        public TextView tv_cast_name;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.m5627b(this, view);
            m4048L(false);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/CastAdapter$MyViewHolder_ViewBinding.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/CastAdapter$MyViewHolder_ViewBinding.class */
    public class MyViewHolder_ViewBinding implements Unbinder {

        /* renamed from: b */
        public MyViewHolder f19649b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f19649b = myViewHolder;
            myViewHolder.Movie = (RelativeLayout) C8522c.m36739c(view, 2131429012, "field 'Movie'", RelativeLayout.class);
            myViewHolder.MovieImage = (ImageView) C8522c.m36739c(view, 2131428200, "field 'MovieImage'", ImageView.class);
            myViewHolder.tv_cast_name = (TextView) C8522c.m36739c(view, 2131429374, "field 'tv_cast_name'", TextView.class);
        }

        @Override // butterknife.Unbinder
        /* renamed from: a */
        public void mo5629a() {
            MyViewHolder myViewHolder = this.f19649b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f19649b = null;
            myViewHolder.Movie = null;
            myViewHolder.MovieImage = null;
            myViewHolder.tv_cast_name = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/CastAdapter$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.CastAdapter$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/CastAdapter$a.class */
    public class C3366a implements InterfaceC9996e {

        /* renamed from: a */
        public final MyViewHolder f19650a;

        /* renamed from: b */
        public final CastAdapter f19651b;

        public C3366a(CastAdapter castAdapter, MyViewHolder myViewHolder) {
            this.f19651b = castAdapter;
            this.f19650a = myViewHolder;
        }

        @Override // p428yg.InterfaceC9996e
        /* renamed from: a */
        public void mo15848a() {
            this.f19650a.MovieImage.setImageDrawable(this.f19651b.f19646e.getResources().getDrawable(2131231769, null));
        }

        @Override // p428yg.InterfaceC9996e
        public void onSuccess() {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/CastAdapter$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.CastAdapter$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/CastAdapter$b.class */
    public class ViewOnClickListenerC3367b implements View.OnClickListener {

        /* renamed from: b */
        public final int f19652b;

        /* renamed from: c */
        public final CastAdapter f19653c;

        public ViewOnClickListenerC3367b(CastAdapter castAdapter, int i10) {
            this.f19653c = castAdapter;
            this.f19652b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            try {
                str = ((TMDBCastsPojo) this.f19653c.f19647f.get(this.f19652b)).m15479a().toString();
            } catch (Exception e10) {
                str = "0";
            }
            if (str.equals("0")) {
                return;
            }
            this.f19653c.m17062i0(str, ((TMDBCastsPojo) this.f19653c.f19647f.get(this.f19652b)).m15480b(), ((TMDBCastsPojo) this.f19653c.f19647f.get(this.f19652b)).m15481c());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/CastAdapter$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.CastAdapter$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/CastAdapter$c.class */
    public class ViewOnClickListenerC3368c implements View.OnClickListener {

        /* renamed from: b */
        public final int f19654b;

        /* renamed from: c */
        public final CastAdapter f19655c;

        public ViewOnClickListenerC3368c(CastAdapter castAdapter, int i10) {
            this.f19655c = castAdapter;
            this.f19654b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            try {
                str = ((TMDBCastsPojo) this.f19655c.f19647f.get(this.f19654b)).m15479a().toString();
            } catch (Exception e10) {
                str = "0";
            }
            if (str.equals("0")) {
                return;
            }
            this.f19655c.m17062i0(str, ((TMDBCastsPojo) this.f19655c.f19647f.get(this.f19654b)).m15480b(), ((TMDBCastsPojo) this.f19655c.f19647f.get(this.f19654b)).m15481c());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/CastAdapter$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.CastAdapter$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/CastAdapter$d.class */
    public class ViewOnFocusChangeListenerC3369d implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f19656b;

        /* renamed from: c */
        public final CastAdapter f19657c;

        public ViewOnFocusChangeListenerC3369d(CastAdapter castAdapter, View view) {
            this.f19657c = castAdapter;
            this.f19656b = view;
        }

        /* renamed from: a */
        public final void m17063a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f19656b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m17064b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f19656b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m17065c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f19656b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            View view2;
            int i10;
            float f10 = 1.0f;
            if (!z10) {
                if (z10) {
                    return;
                }
                if (z10) {
                    f10 = 1.09f;
                }
                m17063a(z10);
                if ((this.f19656b.getTag() == null || !this.f19656b.getTag().equals("1")) && (this.f19656b.getTag() == null || !this.f19656b.getTag().equals("2"))) {
                    return;
                }
                m17064b(f10);
                m17065c(f10);
                this.f19656b.setBackgroundResource(2131230845);
                return;
            }
            if (z10) {
                f10 = 1.1f;
            }
            Log.e("id is", "" + this.f19656b.getTag());
            if (this.f19656b.getTag() != null && this.f19656b.getTag().equals("1")) {
                m17064b(f10);
                view2 = this.f19656b;
                i10 = 2131230828;
            } else {
                if (this.f19656b.getTag() == null || !this.f19656b.getTag().equals("2")) {
                    return;
                }
                m17064b(f10);
                view2 = this.f19656b;
                i10 = 2131231576;
            }
            view2.setBackgroundResource(i10);
        }
    }

    public CastAdapter(List<TMDBCastsPojo> list, Context context, boolean z10, String str) {
        this.f19647f = list;
        this.f19646e = context;
        this.f19648g = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public void mo2996G(MyViewHolder myViewHolder, @SuppressLint({"RecyclerView"}) int i10) {
        if (this.f19646e != null) {
            String str = "https://image.tmdb.org/t/p/w500/" + this.f19647f.get(i10).m15481c();
            myViewHolder.MovieImage.setImageDrawable(null);
            if (str.equals("")) {
                myViewHolder.MovieImage.setImageDrawable(this.f19646e.getResources().getDrawable(2131231769, null));
            } else {
                C10014t.m42105q(this.f19646e).m42116l(str).m42152h(myViewHolder.MovieImage, new C3366a(this, myViewHolder));
            }
            myViewHolder.tv_cast_name.setText(this.f19647f.get(i10).m15480b());
            myViewHolder.tv_cast_name.setVisibility(0);
            myViewHolder.MovieImage.setOnClickListener(new ViewOnClickListenerC3367b(this, i10));
            myViewHolder.Movie.setOnClickListener(new ViewOnClickListenerC3368c(this, i10));
            RelativeLayout relativeLayout = myViewHolder.Movie;
            relativeLayout.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3369d(this, relativeLayout));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    @NotNull
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder mo2998J(ViewGroup viewGroup, int i10) {
        LayoutInflater from;
        int i11;
        if (new C6783a(this.f19646e).m31288z().equals(C5251a.f30065s0)) {
            from = LayoutInflater.from(viewGroup.getContext());
            i11 = 2131624117;
        } else {
            from = LayoutInflater.from(viewGroup.getContext());
            i11 = 2131624116;
        }
        return new MyViewHolder(from.inflate(i11, viewGroup, false));
    }

    /* renamed from: i0 */
    public final void m17062i0(String str, String str2, String str3) {
        if (this.f19646e == null) {
            Log.e("Null hai context", ">>>>>>>>>>>True its Null");
            return;
        }
        Intent intent = new Intent(this.f19646e, (Class<?>) ViewDetailsCastActivity.class);
        intent.putExtra("castID", str);
        intent.putExtra("castName", str2);
        intent.putExtra("profilePath", str3);
        intent.putExtra("streamBackdrop", this.f19648g);
        this.f19646e.startActivity(intent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        return this.f19647f.size();
    }
}

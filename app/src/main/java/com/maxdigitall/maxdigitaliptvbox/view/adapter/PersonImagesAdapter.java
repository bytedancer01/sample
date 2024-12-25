package com.maxdigitall.maxdigitaliptvbox.view.adapter;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.TMDBPersonProfilePojo;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p316s2.C8522c;
import p428yg.C10014t;
import p428yg.InterfaceC9996e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/PersonImagesAdapter.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/PersonImagesAdapter.class */
public class PersonImagesAdapter extends RecyclerView.AbstractC0677h<MyViewHolder> {

    /* renamed from: e */
    public Context f20251e;

    /* renamed from: f */
    public List<TMDBPersonProfilePojo> f20252f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/PersonImagesAdapter$MyViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/PersonImagesAdapter$MyViewHolder.class */
    public static class MyViewHolder extends RecyclerView.AbstractC0674e0 {

        @BindView
        public RelativeLayout Movie;

        @BindView
        public ImageView MovieImage;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.m5627b(this, view);
            m4048L(false);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/PersonImagesAdapter$MyViewHolder_ViewBinding.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/PersonImagesAdapter$MyViewHolder_ViewBinding.class */
    public class MyViewHolder_ViewBinding implements Unbinder {

        /* renamed from: b */
        public MyViewHolder f20253b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f20253b = myViewHolder;
            myViewHolder.Movie = (RelativeLayout) C8522c.m36739c(view, 2131429012, "field 'Movie'", RelativeLayout.class);
            myViewHolder.MovieImage = (ImageView) C8522c.m36739c(view, 2131428200, "field 'MovieImage'", ImageView.class);
        }

        @Override // butterknife.Unbinder
        /* renamed from: a */
        public void mo5629a() {
            MyViewHolder myViewHolder = this.f20253b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f20253b = null;
            myViewHolder.Movie = null;
            myViewHolder.MovieImage = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/PersonImagesAdapter$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.PersonImagesAdapter$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/PersonImagesAdapter$a.class */
    public class C3452a implements InterfaceC9996e {

        /* renamed from: a */
        public final MyViewHolder f20254a;

        /* renamed from: b */
        public final PersonImagesAdapter f20255b;

        public C3452a(PersonImagesAdapter personImagesAdapter, MyViewHolder myViewHolder) {
            this.f20255b = personImagesAdapter;
            this.f20254a = myViewHolder;
        }

        @Override // p428yg.InterfaceC9996e
        /* renamed from: a */
        public void mo15848a() {
            this.f20254a.MovieImage.setImageDrawable(this.f20255b.f20251e.getResources().getDrawable(2131231769, null));
        }

        @Override // p428yg.InterfaceC9996e
        public void onSuccess() {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/PersonImagesAdapter$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.PersonImagesAdapter$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/PersonImagesAdapter$b.class */
    public class ViewOnClickListenerC3453b implements View.OnClickListener {

        /* renamed from: b */
        public final PersonImagesAdapter f20256b;

        public ViewOnClickListenerC3453b(PersonImagesAdapter personImagesAdapter) {
            this.f20256b = personImagesAdapter;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/PersonImagesAdapter$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.PersonImagesAdapter$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/PersonImagesAdapter$c.class */
    public class ViewOnFocusChangeListenerC3454c implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f20257b;

        /* renamed from: c */
        public final PersonImagesAdapter f20258c;

        public ViewOnFocusChangeListenerC3454c(PersonImagesAdapter personImagesAdapter, View view) {
            this.f20258c = personImagesAdapter;
            this.f20257b = view;
        }

        /* renamed from: a */
        public final void m17317a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f20257b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m17318b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f20257b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m17319c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f20257b, "scaleY", f10);
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
                m17317a(z10);
                if ((this.f20257b.getTag() == null || !this.f20257b.getTag().equals("1")) && (this.f20257b.getTag() == null || !this.f20257b.getTag().equals("2"))) {
                    return;
                }
                m17318b(f10);
                m17319c(f10);
                this.f20257b.setBackgroundResource(2131230845);
                return;
            }
            if (z10) {
                f10 = 1.1f;
            }
            Log.e("id is", "" + this.f20257b.getTag());
            if (this.f20257b.getTag() != null && this.f20257b.getTag().equals("1")) {
                m17318b(f10);
                view2 = this.f20257b;
                i10 = 2131230828;
            } else {
                if (this.f20257b.getTag() == null || !this.f20257b.getTag().equals("2")) {
                    return;
                }
                m17318b(f10);
                view2 = this.f20257b;
                i10 = 2131231576;
            }
            view2.setBackgroundResource(i10);
        }
    }

    public PersonImagesAdapter(List<TMDBPersonProfilePojo> list, Context context, boolean z10) {
        this.f20252f = list;
        this.f20251e = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public void mo2996G(MyViewHolder myViewHolder, @SuppressLint({"RecyclerView"}) int i10) {
        if (this.f20251e != null) {
            String str = "https://image.tmdb.org/t/p/w500/" + this.f20252f.get(i10).m15485a();
            myViewHolder.MovieImage.setImageDrawable(null);
            if (str.equals("")) {
                myViewHolder.MovieImage.setImageDrawable(this.f20251e.getResources().getDrawable(2131231769, null));
            } else {
                C10014t.m42105q(this.f20251e).m42116l(str).m42152h(myViewHolder.MovieImage, new C3452a(this, myViewHolder));
            }
            myViewHolder.MovieImage.setOnClickListener(new ViewOnClickListenerC3453b(this));
            RelativeLayout relativeLayout = myViewHolder.Movie;
            relativeLayout.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3454c(this, relativeLayout));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    @NotNull
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder mo2998J(ViewGroup viewGroup, int i10) {
        return new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(2131624116, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        return this.f20252f.size();
    }
}

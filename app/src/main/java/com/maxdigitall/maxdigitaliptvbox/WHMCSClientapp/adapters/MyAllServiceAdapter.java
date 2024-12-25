package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.adapters;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.modelclassess.ActiveServiceModelClass;
import java.util.ArrayList;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/adapters/MyAllServiceAdapter.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/adapters/MyAllServiceAdapter.class */
public class MyAllServiceAdapter extends RecyclerView.AbstractC0677h<ViewHolder> {

    /* renamed from: e */
    public Context f16206e;

    /* renamed from: f */
    public ArrayList<ActiveServiceModelClass> f16207f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/adapters/MyAllServiceAdapter$OnFocusChangeAccountListener.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/adapters/MyAllServiceAdapter$OnFocusChangeAccountListener.class */
    public class OnFocusChangeAccountListener implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f16210b;

        /* renamed from: c */
        public final MyAllServiceAdapter f16211c;

        public OnFocusChangeAccountListener(MyAllServiceAdapter myAllServiceAdapter, View view) {
            this.f16211c = myAllServiceAdapter;
            this.f16210b = view;
        }

        /* renamed from: a */
        public final void m14610a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16210b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m14611b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16210b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m14612c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16210b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            View view2;
            int i10;
            float f10 = 1.04f;
            if (z10) {
                if (!z10) {
                    f10 = 1.0f;
                }
                m14611b(f10);
                m14612c(f10);
                Log.e("id is", "" + this.f16210b.getTag());
                view2 = this.f16210b;
                i10 = 2131231898;
            } else {
                if (z10) {
                    return;
                }
                if (!z10) {
                    f10 = 1.0f;
                }
                m14611b(f10);
                m14612c(f10);
                m14610a(z10);
                view2 = this.f16210b;
                i10 = 2131231897;
            }
            view2.setBackgroundResource(i10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/adapters/MyAllServiceAdapter$ViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/adapters/MyAllServiceAdapter$ViewHolder.class */
    public class ViewHolder extends RecyclerView.AbstractC0674e0 {

        /* renamed from: u */
        public TextView f16212u;

        /* renamed from: v */
        public TextView f16213v;

        /* renamed from: w */
        public TextView f16214w;

        /* renamed from: x */
        public LinearLayout f16215x;

        /* renamed from: y */
        public final MyAllServiceAdapter f16216y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(MyAllServiceAdapter myAllServiceAdapter, View view) {
            super(view);
            this.f16216y = myAllServiceAdapter;
            this.f16212u = (TextView) view.findViewById(2131429631);
            this.f16213v = (TextView) view.findViewById(2131429566);
            this.f16214w = (TextView) view.findViewById(2131429526);
            this.f16215x = (LinearLayout) view.findViewById(2131428459);
        }
    }

    public MyAllServiceAdapter(Context context, ArrayList<ActiveServiceModelClass> arrayList) {
        this.f16206e = context;
        this.f16207f = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0157  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo2996G(com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.adapters.MyAllServiceAdapter.ViewHolder r7, int r8) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.adapters.MyAllServiceAdapter.mo2996G(com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.adapters.MyAllServiceAdapter$ViewHolder, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public ViewHolder mo2998J(ViewGroup viewGroup, int i10) {
        return new ViewHolder(this, LayoutInflater.from(this.f16206e).inflate(2131624109, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        return this.f16207f.size();
    }
}

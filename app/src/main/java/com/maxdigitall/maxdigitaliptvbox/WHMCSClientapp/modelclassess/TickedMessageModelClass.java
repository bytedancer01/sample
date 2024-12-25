package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.modelclassess;

import java.util.List;
import p201ld.InterfaceC5839a;
import p201ld.InterfaceC5841c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/modelclassess/TickedMessageModelClass.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/modelclassess/TickedMessageModelClass.class */
public class TickedMessageModelClass {

    /* renamed from: a */
    @InterfaceC5839a
    @InterfaceC5841c("result")
    public String f16322a;

    /* renamed from: b */
    @InterfaceC5839a
    @InterfaceC5841c("replies")
    public Replies f16323b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/modelclassess/TickedMessageModelClass$Replies.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/modelclassess/TickedMessageModelClass$Replies.class */
    public class Replies {

        /* renamed from: a */
        @InterfaceC5839a
        @InterfaceC5841c("reply")
        public List<Reply> f16324a;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/modelclassess/TickedMessageModelClass$Replies$Reply.class
         */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/modelclassess/TickedMessageModelClass$Replies$Reply.class */
        public class Reply {

            /* renamed from: a */
            @InterfaceC5839a
            @InterfaceC5841c("name")
            public String f16325a;

            /* renamed from: b */
            @InterfaceC5839a
            @InterfaceC5841c("date")
            public String f16326b;

            /* renamed from: c */
            @InterfaceC5839a
            @InterfaceC5841c("message")
            public String f16327c;

            /* renamed from: d */
            @InterfaceC5839a
            @InterfaceC5841c("admin")
            public String f16328d;

            /* renamed from: a */
            public String m14701a() {
                return this.f16328d;
            }

            /* renamed from: b */
            public String m14702b() {
                return this.f16326b;
            }

            /* renamed from: c */
            public String m14703c() {
                return this.f16327c;
            }

            /* renamed from: d */
            public String m14704d() {
                return this.f16325a;
            }
        }

        /* renamed from: a */
        public List<Reply> m14700a() {
            return this.f16324a;
        }
    }

    /* renamed from: a */
    public Replies m14698a() {
        return this.f16323b;
    }

    /* renamed from: b */
    public String m14699b() {
        return this.f16322a;
    }
}

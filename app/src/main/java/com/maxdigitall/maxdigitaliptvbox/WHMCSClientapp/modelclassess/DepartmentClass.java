package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.modelclassess;

import java.util.List;
import org.simpleframework.xml.strategy.Name;
import p201ld.InterfaceC5839a;
import p201ld.InterfaceC5841c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/modelclassess/DepartmentClass.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/modelclassess/DepartmentClass.class */
public class DepartmentClass {

    /* renamed from: a */
    @InterfaceC5839a
    @InterfaceC5841c("result")
    public String f16285a;

    /* renamed from: b */
    @InterfaceC5839a
    @InterfaceC5841c("departments")
    public Departments f16286b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/modelclassess/DepartmentClass$Departments.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/modelclassess/DepartmentClass$Departments.class */
    public class Departments {

        /* renamed from: a */
        @InterfaceC5839a
        @InterfaceC5841c("department")
        public List<Department> f16287a;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/modelclassess/DepartmentClass$Departments$Department.class
         */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/modelclassess/DepartmentClass$Departments$Department.class */
        public class Department {

            /* renamed from: a */
            @InterfaceC5839a
            @InterfaceC5841c(Name.MARK)
            public String f16288a;

            /* renamed from: b */
            @InterfaceC5839a
            @InterfaceC5841c("name")
            public String f16289b;

            /* renamed from: a */
            public String m14664a() {
                return this.f16288a;
            }

            /* renamed from: b */
            public String m14665b() {
                return this.f16289b;
            }
        }

        /* renamed from: a */
        public List<Department> m14663a() {
            return this.f16287a;
        }
    }

    /* renamed from: a */
    public Departments m14661a() {
        return this.f16286b;
    }

    /* renamed from: b */
    public String m14662b() {
        return this.f16285a;
    }
}

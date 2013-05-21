package pri.tw;

import org.joda.time.DateTime;

import java.util.Date;

public class UniversityData {

    private static final Date ESTABLISHED_TIME = new DateTime(1900, 12, 12, 12, 12, 12).toDate();

    public static University getUniversity() {
        University university = new University("Xi Dian", ESTABLISHED_TIME, "active");

        university.addDepartment(createDepartmentOne());
        university.addDepartment(createDepartmentTwo());

        return university;
    }

    private static Department createDepartmentOne() {
        Department one = new Department("DepartmentOne", "English", "FlowerForDepartmentOne");
        one.addClazz(new Clazz("Class1", "Teacher1", "Flower1", 30));
        one.addClazz(new Clazz("Class2", "Teacher2", "Flower2", 31));
        return one;
    }

    private static Department createDepartmentTwo() {
        Department two = new Department("Two", "Chinese", "FlowerForDepartmentTwo");
        two.addClazz(new Clazz("Class3", "Teacher3", "Flower3", 32));
        two.addClazz(new Clazz("Class4", "Teacher4", "Flower4", 33));
        return two;
    }
}

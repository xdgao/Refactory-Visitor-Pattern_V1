package pri.tw;

import java.util.List;

public class Printer {
    private University university;

    public Printer(University university) {
        this.university = university;
    }

    public String printOne() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("University(").append(university.getName()).append(")\\n");
        buffer.append("--Established Time(").append(university.getEstablishedTime()).append(")\\n");
        buffer.append("--flowers(").append(university.getFlowers()).append(")\\n");
        List<Department> departments = university.getDepartments();
        buffer.append("--Departments)\\n");
        for (Department department : departments) {
            buffer.append("----Department(").append(department.getName()).append(")\\n");
            buffer.append("----major(").append(department.getMajor()).append(")\\n");
            buffer.append("----flowers(").append(department.getFlowers()).append(")\\n");
            List<Clazz> clazzs = department.getClazzs();
            for (Clazz clazz : clazzs) {
                buffer.append("------class(").append(clazz.getName()).append(")\\n");
                buffer.append("------").append(clazz.getNumberOfStudents()).append(" students\\n");
                buffer.append("------teacher(").append(clazz.getTeacher()).append(")\\n");
                buffer.append("------flowers(").append(clazz.getFlower()).append(")\\n");
            }
        }
        return buffer.toString();
    }

    public String printTwo() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("flowers(").append(university.getFlowers()).append(")");
        buffer.append("--University(").append(university.getName()).append(")");
        buffer.append("--Established Time(").append(university.getEstablishedTime()).append(")\\n");
        List<Department> departments = university.getDepartments();
        for (Department department : departments) {
            buffer.append("--flowers(").append(department.getFlowers()).append(")");
            buffer.append("--Department(").append(department.getName()).append(")");
            buffer.append("--major(").append(department.getMajor()).append(")\\n");
            List<Clazz> clazzs = department.getClazzs();
            for (Clazz clazz : clazzs) {
                buffer.append("----flowers(").append(clazz.getFlower()).append(")");
                buffer.append("--class(").append(clazz.getName()).append(")");
                buffer.append("--").append(clazz.getNumberOfStudents()).append(" students");
                buffer.append("--teacher(").append(clazz.getTeacher()).append(")\\n");
            }
        }
        return buffer.toString();
    }
}

package pri.tw;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private String major;
    private String flowers;
    private List<Clazz> clazzs = new ArrayList<Clazz>();

    public Department(String name, String major, String flowers) {
        this.name = name;
        this.major = major;
        this.flowers = flowers;
    }

    public void addClazz(Clazz clazz) {
        clazzs.add(clazz);
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public String getFlowers() {
        return flowers;
    }

    public List<Clazz> getClazzs() {
        return clazzs;
    }
}

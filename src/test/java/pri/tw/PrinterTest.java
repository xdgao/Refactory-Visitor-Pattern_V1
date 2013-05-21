package pri.tw;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PrinterTest {
    @Test
    public void shouldPrintCorrectInfoForFormatOne(){
        Printer printer = new Printer(UniversityData.getUniversity());
        String result = printer.printOne();
        assertThat(result, is("University(Xi Dian)\\n" +
                "--Established Time(Wed Dec 12 12:12:12 GMT+08:00 1900)\\n" +
                "--flowers(active)\\n" +
                "--Departments)\\n" +
                "----Department(DepartmentOne)\\n" +
                "----major(English)\\n" +
                "----flowers(FlowerForDepartmentOne)\\n" +
                "------class(Class1)\\n" +
                "------30 students\\n" +
                "------teacher(Teacher1)\\n" +
                "------flowers(Flower1)\\n" +
                "------class(Class2)\\n" +
                "------31 students\\n" +
                "------teacher(Teacher2)\\n" +
                "------flowers(Flower2)\\n" +
                "----Department(Two)\\n" +
                "----major(Chinese)\\n" +
                "----flowers(FlowerForDepartmentTwo)\\n" +
                "------class(Class3)\\n" +
                "------32 students\\n" +
                "------teacher(Teacher3)\\n" +
                "------flowers(Flower3)\\n" +
                "------class(Class4)\\n" +
                "------33 students\\n" +
                "------teacher(Teacher4)\\n" +
                "------flowers(Flower4)\\n"));
    }

    @Test
        public void shouldPrintCorrectInfoForFormatTwo(){
            Printer printer = new Printer(UniversityData.getUniversity());
            String result = printer.printTwo();
            assertThat(result, is("flowers(active)--University(Xi Dian)--Established Time(Wed Dec 12 12:12:12 GMT+08:00 1900)\\n" +
                    "--flowers(FlowerForDepartmentOne)--Department(DepartmentOne)--major(English)\\n" +
                    "----flowers(Flower1)--class(Class1)--30 students--teacher(Teacher1)\\n" +
                    "----flowers(Flower2)--class(Class2)--31 students--teacher(Teacher2)\\n" +
                    "--flowers(FlowerForDepartmentTwo)--Department(Two)--major(Chinese)\\n" +
                    "----flowers(Flower3)--class(Class3)--32 students--teacher(Teacher3)\\n" +
                    "----flowers(Flower4)--class(Class4)--33 students--teacher(Teacher4)\\n"));
        }
}

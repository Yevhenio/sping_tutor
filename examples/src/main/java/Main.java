import methods.StudentLoader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import student.Student;
import student.Subject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by eugene on 11.04.15.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new FileSystemXmlApplicationContext
                ("examples/src/main/resources/spring-beans.xml");


        Student stud = (Student)context.getBean("student");
        System.out.println(stud.toString());
        Student obj = (Student) context.getBean("student");
        obj.getName();
        obj.setName("Vlad");
        obj.setAge(44);
       Student obj1 = (Student) context.getBean("student");
        obj.getName();
        System.out.println(obj.toString());
        System.out.println(obj1.toString());


        System.out.println(context.getBean("studentLoader").toString());

    }
}


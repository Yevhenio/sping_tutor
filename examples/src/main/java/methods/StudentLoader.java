package methods;

import student.Student;
import student.Subject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by eugene on 11.04.15.
 */
public class StudentLoader {


    private ArrayList<Student> students;

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }


    private ArrayList<String[]> getStrings() throws IOException {
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<String[]> strings = new ArrayList<>();

        File file = new File("examples/src/main/java/input.txt");
        FileReader reader = new FileReader(file);
        BufferedReader bfReader = new BufferedReader(reader);
        String line;
        while ((line = bfReader.readLine()) != null) {
            stringList.add(line);
        }
        reader.close();
        for (int i = 0; i < stringList.size(); i++) {
            strings.add(stringList.get(i).split(":"));
        }
        return strings;
    }

    public ArrayList loadStudents() throws IOException {

       students = new ArrayList<>();
        for (int i = 0; i < getStrings().size(); i++) {

            Student student = new Student();
            student.setName((getStrings().get(i)[0]));
            student.setAge(Integer.parseInt(getStrings().get(i)[1]));
            student.setSubject((getStrings().get(i)[2]));


            students.add(student);



        }

        return students;
    }
}

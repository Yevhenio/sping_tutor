package methods;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by eugene on 11.04.15.
 */
public class StudentUtil {
    private StudentLoader studentLoader;
    private StudentWriter studentWriter;

   public void getStudents() throws IOException {
       System.out.println(studentLoader.loadStudents().toString());
   }
}

import PrimerEjercicio.Employee;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.junit.Test;

import javax.xml.transform.Result;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class GsonTest {

    @Test
    public void tomarDatosDeJsonConGson() {
        Gson gson = new Gson();
        BufferedReader br = null;
        try {
            //\src\main\java\PrimerEjercicio\employees.json
            br = new BufferedReader(new FileReader("./src/main/java/PrimerEjercicio/employees.json"));
            Employee employee = gson.fromJson(br, Employee.class);
            assert (employee.getAge() == 30);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
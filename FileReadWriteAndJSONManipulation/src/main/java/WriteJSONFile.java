import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteJSONFile {
    public static void main(String[] args) throws IOException {
        JSONObject empObj = new JSONObject();
        empObj.put("name", "Mr. Shajib");
        empObj.put("Department", "IT");
        empObj.put("Designation", "Software Engineer");
        JSONObject addressObj = new JSONObject();
        addressObj.put("present_address", "Badda,Gulshan-1");
        addressObj.put("PO", "Gulshan");
        addressObj.put("Area", "Gulshan-1");
        empObj.put("address", addressObj);
        empObj.put("phone_number", "01620141540");

        FileWriter file = new FileWriter("./src/main/resources/Employee.json");
        file.write(empObj.toJSONString());
        file.flush();
        System.out.print(empObj);

    }
}

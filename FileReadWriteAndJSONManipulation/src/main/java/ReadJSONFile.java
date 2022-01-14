import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class ReadJSONFile {
    public static void main(String[] args) throws IOException, ParseException {

        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader("./src/main/resources/Employee.json"));
        JSONObject empObj = (JSONObject) obj;

        System.out.println(empObj);
        String name = (String) empObj.get("name");
        System.out.println(name);
        String department = (String) empObj.get("Department");
        System.out.println(department);
        String designation = (String) empObj.get("Designation");
        System.out.println(designation);

        JSONObject addressObj = (JSONObject) empObj.get("address");
        String area = (String) addressObj.get("Area");
        System.out.println(area);
        String po = (String) addressObj.get("PO");
        System.out.println(po);
        String present_address = (String) addressObj.get("present_address");
        System.out.println(present_address);

        String phone_number = (String) empObj.get("phone_number");
        System.out.println(phone_number);

    }
}

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadJSONArray {
    public static void main(String[] args) throws IOException, ParseException {
        readJSONArray(1);
    }

    static void readJSONArray(int pos) throws IOException, ParseException {
        String fileName = "./src/main/resources/Student.json";
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader(fileName));
        JSONArray jsonArray = (JSONArray) obj;
        System.out.println(jsonArray);
        JSONObject json = (JSONObject) jsonArray.get(pos);


        String name = (String) json.get("name");
        String id = (String) json.get("id");
        String department = (String) json.get("department");

        System.out.println(name);
        System.out.println(id);
        System.out.println(department);
    }
}

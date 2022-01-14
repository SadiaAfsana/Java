import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Create_Questions {
    public static void main(String[] args) throws IOException, ParseException {

        String fileName = "./src/main/resources/Questions.json";

        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader(fileName));
        JSONObject QstnObj = new JSONObject();

        for (int i = 1; i <= 20; i++) {

            Scanner input1 = new Scanner(System.in);
            Scanner input = new Scanner(System.in);
            System.out.println("Input Question ID: " + i);
            QstnObj.put("id", input1.next());
            System.out.println("Input Question: " + i);
            QstnObj.put("Question", input.nextLine());

            JSONObject OptionObj = new JSONObject();
            System.out.println("Input option a: ");
            OptionObj.put("a", input.nextLine());
            System.out.println("Input option b: ");
            OptionObj.put("b", input.nextLine());
            System.out.println("Input option c: ");
            OptionObj.put("c", input.nextLine());
            System.out.println("Input option d: ");
            OptionObj.put("d", input.nextLine());
            QstnObj.put("options", OptionObj);

            System.out.println("Input Answer: ");
            QstnObj.put("Answer", input.next());

            JSONArray jsonArray = (JSONArray) obj;
            jsonArray.add(QstnObj);
            FileWriter file = new FileWriter(fileName);
            file.write(jsonArray.toJSONString());
            file.flush();
            file.close();
            System.out.println("Saved!");

        }
    }
}
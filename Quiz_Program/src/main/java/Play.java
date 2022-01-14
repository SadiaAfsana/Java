import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Play {
    public static void main(String[] args) throws IOException, ParseException {
        readQstns();

    }

    static void readQstns() throws IOException, ParseException {
        String fileName = "./src/main/resources/Questions.json";

        int score = 0;
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader(fileName));
        JSONArray jsonArray = (JSONArray) obj;

        for (int i = 0; i < 5; i++) {

            Random r = new Random();
            int index = r.nextInt(jsonArray.size());

            JSONObject json = (JSONObject) jsonArray.get(index);
            JSONObject json1 = (JSONObject) json.get("options");

            String qst = (String) json.get("Question");
            String ans = (String) json.get("Answer");

            String op1 = (String) json1.get("a");
            String op2 = (String) json1.get("b");
            String op3 = (String) json1.get("c");
            String op4 = (String) json1.get("d");

            System.out.println(qst);
            System.out.println("a: " + op1);
            System.out.println("b: " + op2);
            System.out.println("c: " + op3);
            System.out.println("d: " + op4);

            System.out.println("Choose an Option a-d: ");
            Scanner sc = new Scanner(System.in);
            if (ans.equals(sc.nextLine())) {
                System.out.println("Correct");
                score++;
            } else System.out.println("wrong");
        }
        System.out.println("Your Final Score is: " + score + "/5");
    }
}

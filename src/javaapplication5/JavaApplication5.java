package javaapplication5;

import java.io.IOException;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JavaApplication5 {

    public static void main(String[] args) throws IOException {

       // JSONObject obj1 = new JSONObject();
        String[] name = {"Zied", "sosti", "Boudimai", "Jean", "Alsi"};
        int[] id = {10, 20, 30, 40, 50};
        double[] salary = {1000, 2000, 3000, 4000, 5000};

        JSONArray mainarray = new JSONArray();
        JSONObject mainobject = new JSONObject();

        for (int i = 0; i < id.length; i++) {

            mainobject.accumulate("id", id[i]);
            mainobject.accumulate("name", name[i]);
            mainobject.accumulate("salary", salary[i]);
            mainarray.add(mainobject);
            mainobject.clear();

        }
        System.out.println(mainarray);
        FileWriter.saveStringIntoFile("json/employee.json", mainarray.toString());

    }

}

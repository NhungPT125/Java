package Lab06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab06_3 {

    public static void main(String[] args) {

        String myStr = "100 minutes";

        String[] word = myStr.split(" ");
        List<String> arrList = new ArrayList<>(Arrays.asList(word));
        arrList.remove("minutes");
        System.out.println(arrList);

        Pattern pattern = Pattern.compile(" ");
        word = pattern.split(myStr);
        System.out.println(word);

        System.out.println(myStr.substring(0,3));

        String myStr2 = "12345nabc678";
        System.out.println("String: " + myStr2.substring(5,9));
        System.out.println("Expected " + myStr2.substring(0,5) + myStr2.substring(9,12));

    }
}

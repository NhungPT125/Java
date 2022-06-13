package Lab06;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab06_4 {

    public static void main(String[] args) {

        String url = "https://google.com";
        System.out.println(url.contains("http"));
        System.out.println(url.contains("https"));
        System.out.println(url.contains("google.com"));
        System.out.println(url.contains(".com"));
        System.out.println(url.contains(".net"));
    }
}

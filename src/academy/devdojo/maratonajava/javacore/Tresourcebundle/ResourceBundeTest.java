package academy.devdojo.maratonajava.javacore.Tresourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundeTest {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        String helloBundle = bundle.getString("hello");
        String goodMorningBundle = bundle.getString("good.morning");
        System.out.println(helloBundle);
        System.out.println(goodMorningBundle);
    }
}

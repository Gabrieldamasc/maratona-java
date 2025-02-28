package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome1 = "Gabriel";
        String nome2 = "012345";
        System.out.println(nome1.toUpperCase());
        System.out.println(nome1.substring(1));
        System.out.println(nome2.substring(0,nome2.length()-1));
        System.out.println(nome2.length());
        System.out.println(nome1.charAt(2));
        System.out.println(nome1.endsWith("eL"));
    }
}

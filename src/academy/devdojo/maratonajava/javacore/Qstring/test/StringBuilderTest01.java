package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Gabriel";
        System.out.println(nome.concat(" damasceno"));

        StringBuilder sb = new StringBuilder("Gabriel");
        sb.append(" Nunes").append("oliveira");
        System.out.println(sb);
        System.out.println(sb.reverse());
    }
}

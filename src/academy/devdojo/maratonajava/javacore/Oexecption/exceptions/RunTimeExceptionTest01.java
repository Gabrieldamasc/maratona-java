package academy.devdojo.maratonajava.javacore.Oexecption.exceptions;

public class RunTimeExceptionTest01 {
    public static void main(String[] args) {
        System.out.println("Idade: " + ageuser(200));
    }

    public static int ageuser(int age) throws IllegalArgumentException{
        if (age <= 0 || age > 150) {
            throw new IllegalArgumentException("incorrect user's age");
        }
        return age;
    }
}

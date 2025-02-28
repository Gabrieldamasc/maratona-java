package academy.devdojo.maratonajava.javacore.Oexecption.exceptions;

import java.io.IOException;
import java.sql.SQLException;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            System.out.println("Dentro do ArithmeticException | Dentro do ArrayIndexOutOfBoundsException | IllegalArgumentException | ");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }

        try {
            talvezLanceException();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    private static void talvezLanceException () throws SQLException, IOException {

    }
}

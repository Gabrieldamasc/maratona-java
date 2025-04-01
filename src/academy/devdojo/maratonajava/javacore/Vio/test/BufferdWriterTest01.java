package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.*;

public class BufferdWriterTest01 {
    public static void main(String[] args) {
        File file = new File("texto.txt");
        try(FileWriter fr = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fr)){
            bw.write("Olá testando o bufferedWriter");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException("Falha do sistema");
        }
    }
}

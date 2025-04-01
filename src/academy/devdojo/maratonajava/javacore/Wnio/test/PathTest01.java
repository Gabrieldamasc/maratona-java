package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\T-Gamer\\IdeaProjects\\maratona-java\\texto.txt");
        System.out.println(p1.getFileName());
    }
}

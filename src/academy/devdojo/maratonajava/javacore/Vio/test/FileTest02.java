package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCreated = fileDiretorio.mkdir();
        System.out.println("Diretório criado? " + isDiretorioCreated);

        File fileArquivo = new File(fileDiretorio, "arquivo.txt");
        boolean isArquivoCreated = fileArquivo.createNewFile();
        System.out.println("Arquivo .txt criado? " + isArquivoCreated);

        File fileRenameArquivo = new File(fileDiretorio, "arquivo_renomeado.txt");
        boolean isArquivoRenamed = fileArquivo.renameTo(fileRenameArquivo);
        System.out.println("O arquivo .txt foi renomeado? " + isArquivoRenamed);

        File diretorioRenamed = new File("pasta02");
        boolean isDiretorioRenamed = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println("O diretório foi renomeado? " + isDiretorioRenamed);
    }
}

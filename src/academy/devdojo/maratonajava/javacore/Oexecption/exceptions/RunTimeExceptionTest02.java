package academy.devdojo.maratonajava.javacore.Oexecption.exceptions;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        abreConexao();
        abreConexao2();
    }

    public static String abreConexao(){
        try {
            System.out.println("Abrindo conexão");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }

    public static void abreConexao2(){
        try {
            System.out.println("Abrindo conexão");
            System.out.println("Escrevendo dados no arquivo");
            throw new RuntimeException("Conexão inválida");
        }catch (Exception e){
            throw new RuntimeException("Conexão inválida");
        }finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}

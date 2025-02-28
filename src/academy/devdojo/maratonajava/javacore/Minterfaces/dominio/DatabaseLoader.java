package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void load(){
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remover() {
        System.out.println("Removendo dados");
    }

    @Override
    public void checkingPermissions() {
        System.out.println("Verificando as permissões do usuário dos dados");
    }

    public static void retrieveDataMaxSize(){
        System.out.println("Dentro do retrieveDataMaxSize dentro da classe");
    }
}

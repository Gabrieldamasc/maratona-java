package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DataFileLoader implements DataLoader, DataRemover{
    @Override
    public void load(){
        System.out.println("Carregando arquivos do banco de dados");
    }

    @Override
    public void remover() {
        System.out.println("Removendo dados");
    }

    @Override
    public void checkingPermissions(){
        System.out.println("Verificando as permissões do usuário nos arquivos");
    }
}

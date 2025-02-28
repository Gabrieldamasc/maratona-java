package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    void load();
    default void checkingPermissions(){
        System.out.println("Checando permissões");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize dentro da interface");
    }
}

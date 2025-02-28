package academy.devdojo.maratonajava.javacore.Minterfaces.test;

import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DataFileLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DataLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        DataFileLoader dataFileLoader = new DataFileLoader();

        dataFileLoader.load();
        databaseLoader.load();

        dataFileLoader.remover();
        databaseLoader.remover();



        dataFileLoader.checkingPermissions();
        databaseLoader.checkingPermissions();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveDataMaxSize();
    }
}

package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_JURIDICA(1, "PJ"),
    PESSOA_FISICA(2, "PF");

    public int valor;
    private String nomeRelatorio;



   public static TipoCliente tipoClientePorRelatorio(String nomeRelatorio){
       for (TipoCliente tipoCliente : values()) {
           if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
               return tipoCliente;
           }
       }
       return null;
   }

    TipoCliente(int VALOR, String nomeRelatorio) {
        this.valor = VALOR;
        this.nomeRelatorio = nomeRelatorio;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public int getVALOR() {
        return valor;
    }
}

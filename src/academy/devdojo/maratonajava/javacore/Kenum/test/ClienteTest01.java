package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Gabriel", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Roberto", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.CREDITO.valorDesconto(100));
        System.out.println(TipoPagamento.DEBITO.valorDesconto(100));

        TipoCliente tipoCliente1 = TipoCliente.tipoClientePorRelatorio("PF");
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorRelatorio("PJ");
        TipoCliente tipoCliente3 = TipoCliente.tipoClientePorRelatorio("Pj");
        System.out.println(tipoCliente1);
        System.out.println(tipoCliente2);
        System.out.println(tipoCliente3);


    }
}

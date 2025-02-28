package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoPagamento {
    DEBITO{
        @Override
        public double valorDesconto(double valor) {
            return valor * 0.1;
        }
    }, CREDITO{
        @Override
        public double valorDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double valorDesconto(double valor);
}

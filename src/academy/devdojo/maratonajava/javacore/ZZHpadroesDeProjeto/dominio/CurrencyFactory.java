package academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.dominio;

public class CurrencyFactory {
    public static Currency newCurrency(Country country){
        switch (country){
            case USA -> {
                return new UsDollar();
            }
            case BRAZIL -> {
                return new Real();
            }
            default -> throw new IllegalArgumentException("País não encontrado");
        }
    }
}

package academy.devdojo.maratonajava.javacore.Pwrappers.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        int intP = 10;
        short shortP = 1;
        float floatP = 10f;
        long longP = 10L;
        double doubleP = 10d;
        boolean booleanP = false;
        char charP = 'w';

        Byte byteW = 1;
        Integer intW = 10;
        Short shortW = 1;
        Float floatW = 10f;
        Long longW = 10L;
        Double doubleW = 10d;
        Boolean booleanW = false;
        Character charW = 'W';

        int i = intW;
        Integer i1 = Integer.parseInt("10");
        boolean verdadeiro = Boolean.parseBoolean("saa");
        System.out.println(verdadeiro);
        int i2 = Integer.parseInt("22");
        System.out.println(i2);

        System.out.println(Character.compare('1','1'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.isLowerCase('b'));
        System.out.println(Character.getName(122));
        System.out.println(Character.getType('p'));

    }
}

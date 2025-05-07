package academy.devdojo.maratonajava.javacore.ZclassesInternas.test;

public class OuterClassTest01 {
    public String name = "Gabriel";

    public class Inner{
        public void printName(){
            System.out.println(name);
        }
    }


    public static void main(String[] args) {
        OuterClassTest01 outerClassTest01 = new OuterClassTest01();
        Inner inner = outerClassTest01.new Inner();
        inner.printName();
    }
}

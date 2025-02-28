package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String name;
    private int age;
    private double[] salary;
    private double media = 0;

    public void imprimeDadosFuncionario() {
        System.out.println("Nome do funcionário: " + this.name);
        System.out.println("Idade do funcionário: " + this.age);
        if (salary == null) {
            return;
        }
        for (double salary : salary) {
            System.out.print(salary + " ");
        }
        imprimeMediaSalario();
    }

    public void imprimeMediaSalario() {
        if (salary == null) {
            return;
        }

        for (double salary : salary) {
            media += salary;
        }
        media /= salary.length;
        System.out.println("\nA média salaraial é: "+media);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getSalary() {
        return salary;
    }

    public void setSalary(double[] salary) {
        this.salary = salary;
    }

    public double getMedia() {
        return media;
    }

}

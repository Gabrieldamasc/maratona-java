package lista.execercicios.StudentRegister;

public class Student {
     private String name;
     private double grade;

    public Student(String nome, double nota) {
        this.name = nome;
        this.grade = nota;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nome='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}

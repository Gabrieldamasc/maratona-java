package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Mestre Kami";
        professor.idade = 78;
        professor.sexo = 'm';

        System.out.println("Nome do professor: " + professor.nome + " Idade: " + professor.idade + " sexo: " + professor.sexo);
    }
}

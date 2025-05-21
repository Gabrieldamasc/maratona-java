package lista.execercicios.LutaLoko.test;

import lista.execercicios.LutaLoko.domain.Fighter;

import java.util.*;

public class LutaLokoFight {
    static List<Fighter> fighters = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("----------- LUTA LOKO -----------");
        imprimirBatalha();
        decidirVencedor();
    }

    private static void lerNomeLutador() {

        Scanner userIn = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Digite o nome do lutador");
            String fighterName = userIn.next();
            fighters.add(new Fighter(fighterName));
        }
    }

    private static int calcularStatsLutador(Fighter fighter) {
        return fighter.getGuard() + fighter.getForce();
    }

    private static void imprimirBatalha() {
        lerNomeLutador();
        List<String> name = fighters.stream().map(Fighter::getName).toList();
        for (int i = 0; i < fighters.size(); i++) {
            Fighter f = fighters.get(i);
            System.out.println("O nome do " + (i + 1) + "° lutador é : " + name.get(i));
            System.out.println("Sua força é: " + f.getForce());
            System.out.println("Sua Defesa é: " + f.getGuard());
        }
    }

    private static void decidirVencedor(){
        Fighter f1 = fighters.get(0);
        Fighter f2 = fighters.get(1);

        int statsF1 = calcularStatsLutador(f1);
        int statsF2 = calcularStatsLutador(f2);

        if (statsF1 > statsF2 && f1.getForce() != 0){
            System.out.println("O lutador "+ f1.getName() +" ganhou!");
        } else if (statsF1 < statsF2 && f1.getForce() != 0) {
            System.out.println("O lutador "+ f2.getName() +" ganhou!");
        }else{
            System.out.println("Empate!");
        }
    }
}

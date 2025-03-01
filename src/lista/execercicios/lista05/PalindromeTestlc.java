package lista.execercicios.lista05;

class Solution {
    public boolean isPalindrome(int x) {
        String nome = x + "";
        String contrario = "";
        for (int i = (nome.length() - 1); i >= 0; i--) {
            contrario = contrario + nome.charAt(i);
        }

        if (contrario.toLowerCase().equals(nome.toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }
}
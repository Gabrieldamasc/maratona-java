package lista.execercicios.lista05;

class Solution {
    public boolean isPalindrome(int x) {
        String xs = x + "";
        String contrario = "";
        for (int i = (xs.length()-1); i >= 0 ; i--) {
            contrario = contrario + xs.charAt(i);
        }

        if (contrario.toLowerCase().equals(xs.toLowerCase())){
            return true;
        }else{
            return false;
        }
    }
}
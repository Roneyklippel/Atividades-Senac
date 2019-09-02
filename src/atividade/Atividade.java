package atividade;

public class Atividade {

    public static void main(String[] args) {
        int cateto1 = 10;
        int cateto2 = 20;

        double hipotenusa = teoremaPitaguras(cateto1, cateto2);
        System.out.println(hipotenusa);

    }

    private static double teoremaPitaguras(int cateto1, int cateto2) {
        double hipotenusa = (cateto1 * cateto1) + (cateto2 * cateto2);
        return Math.sqrt(hipotenusa);

    }

}

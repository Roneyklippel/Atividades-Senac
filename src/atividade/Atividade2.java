
package atividade;


public class Atividade2 {

    public static void main(String[] args) {
       
        
       double lado1=5;
       double lado2=15;
       
       double mariola = misturaGoiaba( lado1,lado2);
       System.out.println(mariola);
    }
    private static double misturaGoiaba(double v1,double v2){
        return (v1*v2)+ ((v1*2)+(v2*2));
        
    }

   
}

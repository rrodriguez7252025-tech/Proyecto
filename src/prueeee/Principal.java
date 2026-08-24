package prueeee;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        utilitarios util = new utilitarios();
        int[] pares = new int[5];
        int[] impares = new int[5];
        int contaPar = 0, contaImp = 0;
        int dato = 0;
        int conta = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("escriba 10 numeros positivos");
        System.out.println("==============");
        while (conta < 10) {
            System.out.println("escriba el dato: " + (conta + 1) + ": ");
            dato = leer.nextInt();
            if (dato<0) {
                System.out.println("dato incorrecto");
            }else{
                if (dato % 2 == 0) {
                util.pares(pares, contaPar, dato);
                contaPar++;
            } else {
                util.impares(impares, contaImp, dato);
                contaImp++;
            }
                conta++;
            }
        }
        util.imprimir(pares);
        util.imprimir(impares);
        System.out.println("valores mayor a Diez en pares son : " + util.contarMayorDiez(pares));
        System.out.println("valores mayor a Diez en impares son : " + util.contarMayorDiez(impares));
        System.out.println("valores menores a Cinco en pares son : " + util.contarMenoresCinco(pares));
        System.out.println("valores menores a Cinco en impares son : " + util.contarMenoresCinco(impares));
    }
}

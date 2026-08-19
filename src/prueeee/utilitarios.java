package prueeee;

public class utilitarios {

    public void imprimir(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.println("El valor" + (i + 1) + "es: " + num[i]);
        }
    }
    public  void pares(int []par, int cont, int valor){
        par[cont]=valor;
    }
    public  void impares(int []par, int cont, int valor){
        par[cont]=valor;
    }
}

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;
        numero = 10;
        System.out.println(numero);

        //quando usamos um 'FINAL' usamos o numero da variavel em UPPER CASE
        final double VALOR_DE_PI = 3.14; //Este 'Final' significa o 'const' no C#, nao pode ser alterado seu valor.


    }
}

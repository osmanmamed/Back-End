public class Casting {
    public static void main(String[] args) {
        /*Casting feito implicitamente, pois o valor possui um
         * tamanho menor que o tipo da variável que irá recebê-lo.
         */
        char a = 'a';
        int b = 'b';
        float c = 100;


        System.out.println(a); //imprime a
        System.out.println(b); //imprime 98 tabela ASCII
        System.out.println(c); //imprime 100.0

        /*Casting feito explicitamente, pois o valor possui um tamanho
         * maior que o tipo da variável que irá recebê-lo
         */

         int d = (int) 5.9987;
         float e = (float) 5.0;
         int f = (char) (a + 5);
         char g = (char) 110.5;


         System.out.println(d); //imprime 5
         System.out.println(e); //imprime 5.0
         System.out.println(f); //imprime 102
         System.out.println(g); //imprime n
    }
}

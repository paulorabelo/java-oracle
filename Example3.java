/*

    Esse programa ilustra a diferença
    entre as variáveis int e double.

*/

class Example3 {
    public static void main (String args[]) {
        int var; // essa instrução declara uma variável int
        double x; // declara uma variável ponto flutuante

        var = 10; // atribui a var o valor 10
        x = 10.0; // atribui a x o valor 10.0

        System.out.println("Valor de var: " + var);
        System.out.println("Valor de x: " + x);
        System.out.println(); // Exibe uma linha em branco

        // agora divide as duas por 4
        var = var / 4;
        x = x / 4;

        System.out.println("var dividida por 4: " + var);
        System.out.println("x dividido por 4: " + x);
    }
}

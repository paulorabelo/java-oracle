/*

    Demonstra um bloco de código.

*/
class BlocoDemo {
    public static void main (String args[]) {
        double i, j, d;

        i = 5;
        j = 10;

        // o alvo desta instrução if é o bloco Código
        if (i != 0) {
            System.out.println("'i' não é igual a zero");
            d = j / i;
            System.out.println("j / i é " + d);
        }
    }
}

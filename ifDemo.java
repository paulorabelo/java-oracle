/*

    Demonstra a instrução if.

*/
class ifDemo {
    public static void main (String arg[]) {
        int a, b, c;

        a = 2;
        b = 3;

        if (a < b) System.out.println("a é menor que b");

        // esta instrução não exibirá nada

        if (a == b) System.out.println("Você não vê nada.");

        System.out.println();

        c = a - b; // c será igual a -1.

        System.out.println("c é igual a -1");
        if (c >= 0) System.out.println("c não é negativo");
        if (c < 0) System.out.println("c é negativo");

        System.out.println();

        c = b - a; // c será igual a 1.

        System.out.println("c é igual a 1");
        if (c >= 0) System.out.println("c não é negativo");
        if (c < 0) System.out.println("c é negativo");

    }
}

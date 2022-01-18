/*

    Este código demonstra uma variável.
    
*/

class Example2 {
    public static void main(String args[]) {
        int var1; // esta instrução declara uma variável
        int var2; // esta instrução declara uma segunda variável

//      int var1, var2; // as duas declaradas c/ apenas uma instrução

        var1 = 1024; // esta instrução atribui 1024 a var1.

        System.out.println("var1 contém " + var1);

        var2 = var1 / 2;

        System.out.print("var2 contém var1 / 2: ");
        System.out.println(var2);
    }
}

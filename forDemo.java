/*

    Demonstração do laço for.

*/
class ForDemo {
    public static void main (String args[]) {
        int count;

        for (count = 0; count < 5; count = count + 1) // laço itera 5 vezes
            System.out.println ("Iteração de n.: " + count);

        System.out.println ("Pronto!");
    }
}

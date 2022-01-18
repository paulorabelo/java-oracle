/*

    Este programa exibe uma tabela de
    conversões de galões em litros.

*/
class GalToLitTable {
    public static void main(String args[]) {
        double gal, lit;
        int counter;

        counter = 0; // Inicialmente zerado.
        for(gal = 1; gal <=100; gal++) {
            lit = gal * 3.7854; // conversão para litros
            System.out.println(gal + " galões são " + 
                                lit + " litros.");
            counter++; // Incrementa o contador de linhas
            // a cada 10 linhas, exibe uma linha em branco
            if (counter == 10) {
                System.out.println();
                counter = 0; // zera o contador de linhas
            }
        }
    }
}

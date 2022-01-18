/*

    Esse programa faz a conversão de galões em litros

*/

class GalToLit {
    public static void main (String args[]) {
        double gal; // declara e atribui valor a galão
        double lit; // declara e atribui valor a litros

        gal = 10; // inicializado com 10 galões
        lit = gal * 3.7854; // converte para litros

        System.out.println(gal + " galões são " + lit + " litros.");
    }
}

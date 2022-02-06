/*
    do while ( condição ) {
    Executa primeiro e depois testa a condição.
    }
*/

public class Posts {
    public static void main (String args[]) {
        
        int numero = 1;

//        while ( numero <=5 ) {
//
//            System.out.println( numero );
//
//            numero = numero + 1;
//        }

        do{
            System.out.println( numero );
            numero = numero + 1;
        }while(numero <=5);
    }
}

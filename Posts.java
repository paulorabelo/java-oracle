/*
    while ( condição ) {
    Executa enquanto a condição é satisfeita
    }
*/

public class Posts {
    public static void main (String args[]) {
        
        String[] postagens = {
            "Bom dia amigos",
            "Postagem 2",
            "Postagem 3"
        };
        System.out.println ( postagens.length );

        int numero = 0;
        int totalPostagens = postagens.length;

        while ( numero < totalPostagens ) {
            System.out.println("#####");
            System.out.println("Postagem " + numero );
            System.out.println("#####");
            numero = numero + 1;
        }
    }
}

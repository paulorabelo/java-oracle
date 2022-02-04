public class notas {
    public static void main (String args[]){

        int nota = 10;
        switch( nota ){
            case 10 :
            case 9 :
                System.out.println("Excelente aluno");
                break;
            case 8 :
                System.out.println("ALuno bom");
                break;
            case 7 :
                System.out.println("ALuno regular");
                break;
            default :
                System.out.println("aluno ruim");       
        }
    }
}

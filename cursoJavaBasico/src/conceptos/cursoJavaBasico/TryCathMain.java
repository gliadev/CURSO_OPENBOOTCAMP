package conceptos.cursoJavaBasico;

public class TryCathMain {
    public static void main(String[] args) {

        try{
            //intruccion que puede ser poblematica
            int resultado = 5 / 0;

        } //  el codigo que queremos llevar a cabo si pasa ese error
        catch (ArithmeticException e){
            // imprime el error lo podemos meter en un log
            e.printStackTrace();
        } // otra opcion es el finaly se va ejecutar si o si
         finally {
            System.out.println("Cierre de recursos");
        }


        System.out.println("fin");
    }
}

// el programa falla en el resultado, pero sigue ejecutando y el pirntln

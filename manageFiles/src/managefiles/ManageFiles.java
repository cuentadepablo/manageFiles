/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managefiles;
import java.io.File;
import java.util.Scanner;
/**
 *
 * @author mrpotes
 */
public class ManageFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // fichero que queremos leer
        File fichero  =  new File ("/Users/mrpotes/tmp.txt");
        Scanner s = null;
        try {
            //leemos el contenido del fichero
            System.out.println("Leyendo el fichero ..............");
            s= new Scanner (fichero);
            //leemos linea a linea el fichero
            while (s.hasNextLine()){
                String linea =s.nextLine();
                if (linea.equals("tmp.txt")){
                    System.out.println("Hasta aqui hemos llegado");
                }
                System.out.println(linea);

            }
        }catch(Exception Ex){
            System.out.println("Mensaje: "+ Ex.getMessage());
        } finally {
            // Cerramos el fichero tanto si hemos leido o no el fichero
            try{
                if(s!=null){
                  s.close();
                }
            }catch(Exception Ex2){
                    System.out.println("Mensaje de Error2: "+ Ex2.getMessage());
                          
            }
        }
    }
}
    


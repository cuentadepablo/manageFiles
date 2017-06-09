/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturadefichero;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author mrpotes
 */
public class manageFiles {
    
    private File fichero = null;
    Scanner s = null;
    
    //constructor 1 sin parametros
    public manageFiles(){
        fichero  =  new File ("/Users/mrpotes/tmp2.txt");
        
    }
    
    public manageFiles(String nombreFichero){
        System.out.println("nombreFichero=" + nombreFichero);
        fichero = new File (nombreFichero);
        
    }
   
    
    public void printFile(){
        try {
            //leemos el contenido del fichero
            System.out.println("Leyendo el fichero ..............");
            Readable fichero;
            s= new Scanner (this.fichero);
            //leemos linea a linea el fichero
            while (s.hasNextLine()){
                String linea =s.nextLine();
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
    
    public String[] fitxerContePatro(String patron){
            int numCoincidencias = 0;
            Pattern regPattern = Pattern.compile(patron);
            Matcher regMatch = regPattern.matcher("vacio");
            ArrayList<String> matches = new ArrayList<>();
            String[] matchesArray = null;
            
            try {
            //leemos el contenido del fichero
            System.out.println("Leyendo el fichero ..............");
            Readable fichero;
            s= new Scanner (this.fichero);
            //leemos linea a linea el fichero
            while (s.hasNextLine()){
                String linea =s.nextLine();
                regMatch = regPattern.matcher(linea);
                while(regMatch.find())
                {
                    String match = regMatch.group();
                    matches.add(match);
                }
                numCoincidencias = matches.size();
                
                matchesArray = new String[matches.size()];
                matches.toArray(matchesArray);
                    
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
        return matchesArray;
        }   
    } 
    
    public int numLineas(){
       Integer numLineas = 0;
        try {
            //leemos el contenido del fichero
            System.out.println("Leyendo el fichero ..............");
            Readable fichero;
            s= new Scanner (this.fichero);
            //leemos linea a linea el fichero
            while (s.hasNextLine()){
                String linea =s.nextLine();
                numLineas = numLineas +1;
                

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
        return numLineas;
    }
}

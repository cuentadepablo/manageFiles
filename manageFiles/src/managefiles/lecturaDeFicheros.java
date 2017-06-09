/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturadefichero;

import jdk.nashorn.internal.runtime.JSType;

/**
 *
 * @author mrpotes
 */
public class LecturaDeFichero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String fichero = new String();
       String[] coincidencies;
       fichero = "/Users/mrpotes/tmp.txt";
       manageFiles mf = new manageFiles(fichero);
       coincidencies = mf.fitxerContePatro("Public");
       System.out.println("Hi han hagut " + coincidencies.length + " coincidencies");
       Integer intNumLineas = mf.numLineas();
       //String numLineas = Integer.toString(intNumLineas);
       System.out.print("El Fitxer té " + intNumLineas.toString() + " lineas;");
    }
}
    


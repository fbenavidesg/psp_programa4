package edu.uniandes.ecos.util;

import edu.uniandes.ecos.controller.App;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase con metodos de utilidad para la app
 * @author fbenavides
 */
public class UtilFile {
    
    /**
    * metodo de apoyo para leer archivo
    * @param path String ruta y nombre del archivo
    * @return 
    * @throws FileNotFoundException
    * @throws IOException 
    */     
    public ArrayList<String> readFileValues( String path ) throws FileNotFoundException, IOException{
        ArrayList<String> listValues = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader( path ));
        String line;
        while ((line = br.readLine()) != null) {
            listValues.add(line);
        }
        return listValues;
    } 
    /**
     * metodo de apoyo para convertir lista de String a lista de double
     * @param stringArray
     * @return 
     */
    public ArrayList<Double> getDoubleArray(ArrayList<String> stringArray) {
        ArrayList<Double> result = new ArrayList<Double>();
        for(String stringValue : stringArray) {
            try {
                result.add(Double.parseDouble(stringValue));
            } catch(NumberFormatException nfe) {
               Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, nfe);
            } 
        }       
        return result;
    }
    /**
     * metodo de apoyo que saca el promedio de una lista de numeros double
     * @param listNumbers
     * @return 
     */
    public Double averageDoubleList( ArrayList<Double> listNumbers ){
        Double average = 0.0;
        for (Double number : listNumbers) {
            average += number;
        }
        return average/listNumbers.size();
    }
    
}

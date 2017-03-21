package edu.uniandes.ecos.controller;

import edu.uniandes.ecos.model.RangesStandardDeviation;
import edu.uniandes.ecos.model.ResultRanges;
import edu.uniandes.ecos.util.UtilFile;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Clase que funciona como controlador de la aplicacion
 * @author fbenavides
 */
public class ControllerApp {
    /**
     * metodo que arranca la funcionalidad y orquesta todo el funcionamiento
     * @throws IOException 
     */
    public ResultRanges execute( String data_source, String getData ) throws IOException{
        ArrayList<String> listValues = new ArrayList<>();
        String filenameDefault = "src/main/resources/files/datos.txt";
        UtilFile ufile = new UtilFile();
        if( data_source.equals("file") ){
            listValues = ufile.readFileValues(filenameDefault);
        }else{
            String[] arrayGet = getData.split(";");
            for (int i = 0; i < arrayGet.length; i++) {
                listValues.add(arrayGet[i]);
            }
        }
        ArrayList<Double> listValuesNumber = listValuesNumber = ufile.getDoubleArray(listValues);
        RangesStandardDeviation rangesStandardDeviation = new RangesStandardDeviation();
        ResultRanges resultRanges = rangesStandardDeviation.calculateRages(listValuesNumber);
        return resultRanges;
    }
    
}

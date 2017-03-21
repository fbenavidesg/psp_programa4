package edu.uniandes.ecos.model;

import edu.uniandes.ecos.util.UtilFile;
import java.util.ArrayList;

/**
 * clase que calcula los resultados
 * @author fbenavides
 */
public class RangesStandardDeviation {
    /**
     * metodo principal de calculo de rangos
     * @param listValues
     * @return 
     */
    public ResultRanges calculateRages( ArrayList<Double> listValues ){
        UtilFile ufile = new UtilFile();
        
        ArrayList<Double> listValuesLogarithm = logarithm(listValues);
        Double averageLogarithm = ufile.averageDoubleList(listValuesLogarithm);
        Double variance = variance(listValuesLogarithm,averageLogarithm);
        Double deviation = standardDeviation(variance);
        Double[] ranges = ragesResult(deviation,averageLogarithm);
        
        ResultRanges resultRanges = new ResultRanges();
        resultRanges.setListValues(listValues);
        resultRanges.setRangeVS(ranges[0]);
        resultRanges.setRangeS(ranges[1]);
        resultRanges.setRangeM(ranges[2]);
        resultRanges.setRangeL(ranges[3]);
        resultRanges.setRangeVL(ranges[4]);
        return resultRanges;
    }
    /**
     * calcula el logaritmo para cada valor
     * @param listValues lista con el valor log de cada numero
     * @return 
     */
    public ArrayList<Double> logarithm( ArrayList<Double> listValues ){
        ArrayList<Double> listValuesLogarithm = new ArrayList<Double>();
        for (Double listValue : listValues) {
            listValuesLogarithm.add(Math.log(listValue));
        }
        return listValuesLogarithm;
    }
    /**
     * calcula la varianza
     * @param listValuesLogarithm 
     * @param averageLogarithm
     * @return 
     */
    public Double variance( ArrayList<Double> listValuesLogarithm, Double averageLogarithm ){
        Double variance = 0.0;
        for (Double listValue : listValuesLogarithm) {
            variance += Math.pow((listValue - averageLogarithm),2);
        }
        return variance/(listValuesLogarithm.size()-1);
    }
    /**
     * Calcula la desviacion estandar
     * @param variance
     * @return 
     */
    public Double standardDeviation( Double variance ){
        Double result = 0.0;
        result = Math.sqrt(variance);
        return result;
    }
    /**
     * calcula los rangos con la desviacion estandar
     * @param deviation
     * @param averageLogarithm
     * @return 
     */
    public Double[] ragesResult(Double deviation, Double averageLogarithm){
        Double[] ranges = new Double[5];
        ranges[0] = Math.exp(averageLogarithm - (2*deviation));
        ranges[1] = Math.exp(averageLogarithm - deviation);
        ranges[2] = Math.exp(averageLogarithm);
        ranges[3] = Math.exp(averageLogarithm + deviation);
        ranges[4] = Math.exp(averageLogarithm + (2*deviation));
        return ranges;
    } 
    
}

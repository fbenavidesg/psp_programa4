package edu.uniandes.ecos.model;

import java.util.ArrayList;

/**
 * Clase que almacena el resultado de los calculos de la app
 * @author fbenavides
 */
public class ResultRanges {
    
    private ArrayList<Double> listValues;
    private Double rangeVS;
    private Double rangeS;
    private Double rangeM;
    private Double rangeL;
    private Double rangeVL;

    public ArrayList<Double> getListValues() {
        return listValues;
    }

    public void setListValues(ArrayList<Double> listValues) {
        this.listValues = listValues;
    }

    public Double getRangeVS() {
        return rangeVS;
    }

    public void setRangeVS(Double rangeVS) {
        this.rangeVS = rangeVS;
    }

    public Double getRangeS() {
        return rangeS;
    }

    public void setRangeS(Double rangeS) {
        this.rangeS = rangeS;
    }

    public Double getRangeM() {
        return rangeM;
    }

    public void setRangeM(Double rangeM) {
        this.rangeM = rangeM;
    }

    public Double getRangeL() {
        return rangeL;
    }

    public void setRangeL(Double rangeL) {
        this.rangeL = rangeL;
    }

    public Double getRangeVL() {
        return rangeVL;
    }

    public void setRangeVL(Double rangeVL) {
        this.rangeVL = rangeVL;
    }
    
}

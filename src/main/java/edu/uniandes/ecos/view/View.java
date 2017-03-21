/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.view;

import edu.uniandes.ecos.model.ResultRanges;

/**
 *
 * @author fbenavides
 */
public class View {
    public void showResult( ResultRanges resultRanges){
        System.out.println("VALORES");
        for (Double value : resultRanges.getListValues()) {
            System.out.println(value);
        }
        System.out.println("\n\nRANGOS");
        System.out.println("VS --> " + resultRanges.getRangeVS());
        System.out.println("S --> " + resultRanges.getRangeS());
        System.out.println("M --> " + resultRanges.getRangeM());
        System.out.println("L --> " + resultRanges.getRangeL());
        System.out.println("VL --> " + resultRanges.getRangeVL());
    }
}

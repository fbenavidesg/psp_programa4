/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.model;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fbenavides
 */
public class RangesStandardDeviationTest {

    public RangesStandardDeviationTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    private ArrayList<Double> listDoubleInput1() {
        ArrayList<Double> listValues = new ArrayList<Double>();
        listValues.add(7.0);
        listValues.add(12.0);
        listValues.add(10.0);
        listValues.add(12.0);
        listValues.add(10.0);
        listValues.add(12.0);
        listValues.add(12.0);
        listValues.add(12.0);
        listValues.add(12.0);
        listValues.add(8.0);
        listValues.add(8.0);
        listValues.add(8.0);
        listValues.add(20.0);
        listValues.add(14.0);
        listValues.add(18.0);
        listValues.add(12.0);
        return listValues;
    }

    private ArrayList<Double> listDoubleLog1() {
        ArrayList<Double> listValues = new ArrayList<Double>();

        listValues.add(1.9459101490553132);
        listValues.add(2.4849066497880004);
        listValues.add(2.302585092994046);
        listValues.add(2.4849066497880004);
        listValues.add(2.302585092994046);
        listValues.add(2.4849066497880004);
        listValues.add(2.4849066497880004);
        listValues.add(2.4849066497880004);
        listValues.add(2.4849066497880004);
        listValues.add(2.0794415416798357);
        listValues.add(2.0794415416798357);
        listValues.add(2.0794415416798357);
        listValues.add(2.995732273553991);
        listValues.add(2.6390573296152584);
        listValues.add(2.8903717578961645);
        listValues.add(2.4849066497880004);
        return listValues;
    }

    /**
     * Test of calculateRages method, of class RangesStandardDeviation.
     */
    @Test
    public void testCalculateRages() {
        System.out.println("calculateRages");
        ArrayList<Double> listValues = listDoubleInput1();

        RangesStandardDeviation instance = new RangesStandardDeviation();

        ResultRanges expResult = new ResultRanges();
        expResult.setRangeVS(6.3375179612117245);
        expResult.setRangeS(8.43928111212605);
        expResult.setRangeM(11.23806924499352);
        expResult.setRangeL(14.965042481379408);
        expResult.setRangeVL(19.92802247318948);

        ResultRanges result = instance.calculateRages(listValues);

        assertEquals(expResult.getRangeVS(), result.getRangeVS());
        assertEquals(expResult.getRangeS(), result.getRangeS());
        assertEquals(expResult.getRangeM(), result.getRangeM());
        assertEquals(expResult.getRangeL(), result.getRangeL());
        assertEquals(expResult.getRangeVL(), result.getRangeVL());

    }

    /**
     * Test of logarithm method, of class RangesStandardDeviation.
     */
    @Test
    public void testLogarithm() {
        System.out.println("logarithm");
        ArrayList<Double> listValues = listDoubleInput1();
        RangesStandardDeviation instance = new RangesStandardDeviation();
        ArrayList<Double> expResult = listDoubleLog1();
        ArrayList<Double> result = instance.logarithm(listValues);
        assertTrue(result.equals(expResult));
    }
    /**
     * Test of variance method, of class RangesStandardDeviation.
     */
    @Test
    public void testVariance() {
        System.out.println("variance");
        ArrayList<Double> listValuesLogarithm = listDoubleLog1();
        Double averageLogarithm = 2.4193070543540203;
        RangesStandardDeviation instance = new RangesStandardDeviation();
        Double expResult = 0.08203064551785172;
        Double result = instance.variance(listValuesLogarithm, averageLogarithm);
        assertEquals(expResult, result);
    }
    /**
     * Test of standardDeviation method, of class RangesStandardDeviation.
     */
    @Test
    public void testStandardDeviation() {
        System.out.println("standardDeviation");
        Double variance = 0.08203064551785172;
        RangesStandardDeviation instance = new RangesStandardDeviation();
        Double expResult = 0.28640992566224327;
        Double result = instance.standardDeviation(variance);
        assertEquals(expResult, result);
    }
}

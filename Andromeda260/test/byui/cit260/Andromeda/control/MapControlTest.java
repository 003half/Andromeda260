/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Andromeda.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rubengonzalezflores
 */
public class MapControlTest {
    
    public MapControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    

    /**
     * Test of distanceToPlanet method, of class MapControl.
     */
    @Test
    public void testDistanceToPlanet() {
        System.out.println("distanceToPlanet");
        double pointA = 43;
        double pointB = 42;
        MapControl instance = new MapControl();
        double expResult = 1;
        double result = instance.distanceToPlanet(pointA, pointB);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of fuelNeeded method, of class MapControl.
     */
    @Test
    public void testFuelNeeded() {
        System.out.println("fuelNeeded");
        double pointA = 50;
        double pointB = 200;
        double armor = 5;
        double iridium = 10;
        double palladium = 10;
        double platinum = 5;
        MapControl instance = new MapControl();
        double expResult = 76.5;
        double result = instance.fuelNeeded(pointA, pointB, armor, iridium, palladium, platinum);
        assertEquals(expResult, result, 0.0);
        
        
    }
    
    @Test
    public void testFuelNeeded1() {
        System.out.println("fuelNeeded");
        double pointA = 50;
        double pointB = 200;
        double armor = -1;
        double iridium = 10;
        double palladium = 10;
        double platinum = 5;
        MapControl instance = new MapControl();
        double expResult = -1;
        double result = instance.fuelNeeded(pointA, pointB, armor, iridium, palladium, platinum);
        assertEquals(expResult, result, 0.0);
        
        
    }
    
    @Test
    public void testFuelNeeded2() {
        System.out.println("fuelNeeded");
        double pointA = 50;
        double pointB = 200;
        double armor = 5;
        double iridium = -50;
        double palladium = 10;
        double platinum = 5;
        MapControl instance = new MapControl();
        double expResult = -1;
        double result = instance.fuelNeeded(pointA, pointB, armor, iridium, palladium, platinum);
        assertEquals(expResult, result, 0.0);
        
        
    }
    
    @Test
    public void testFuelNeeded3() {
        System.out.println("fuelNeeded");
        double pointA = 50;
        double pointB = 200;
        double armor = 105;
        double iridium = 10;
        double palladium = 10;
        double platinum = 5;
        MapControl instance = new MapControl();
        double expResult = -1;
        double result = instance.fuelNeeded(pointA, pointB, armor, iridium, palladium, platinum);
        assertEquals(expResult, result, 0.0);
        
        
    }
    
     @Test
    public void testFuelNeeded4() {
        System.out.println("fuelNeeded");
        double pointA = 50;
        double pointB = 200;
        double armor = 100;
        double iridium = 0;
        double palladium = 0;
        double platinum = 15001.5;
        MapControl instance = new MapControl();
        double expResult = -1;
        double result = instance.fuelNeeded(pointA, pointB, armor, iridium, palladium, platinum);
        assertEquals(expResult, result, 0.0);
        
        
    }
    
     @Test
    public void testFuelNeeded5() {
        System.out.println("fuelNeeded");
        double pointA = 50;
        double pointB = 150;
        double armor = 5;
        double iridium = 100;
        double palladium = 100;
        double platinum = 100;
        MapControl instance = new MapControl();
        double expResult = 326;
        double result = instance.fuelNeeded(pointA, pointB, armor, iridium, palladium, platinum);
        assertEquals(expResult, result, 0.0);
        
        
    }
    
     @Test
    public void testFuelNeeded6() {
        System.out.println("fuelNeeded");
        double pointA = 200;
        double pointB = 200;
        double armor = 5;
        double iridium = 33;
        double palladium = 33;
        double platinum = 34;
        MapControl instance = new MapControl();
        double expResult = 0;
        double result = instance.fuelNeeded(pointA, pointB, armor, iridium, palladium, platinum);
        assertEquals(expResult, result, 0.0);
        
        
    }
     @Test
    public void testFuelNeeded7() {
        System.out.println("fuelNeeded");
        double pointA = 50;
        double pointB = 150;
        double armor = 100;
        double iridium = 100;
        double palladium = 100;
        double platinum = 100;
        MapControl instance = new MapControl();
        double expResult = 10301;
        double result = instance.fuelNeeded(pointA, pointB, armor, iridium, palladium, platinum);
        assertEquals(expResult, result, 0.0);
        
        
    }
}

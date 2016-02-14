/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Andromeda.control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author rubengonzalezflores
 */
public class MapControlTest {
    
    public MapControlTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
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

    /**
     * Test of cylinderVolumeCalculator method, of class MapControl.
     */
    @Test
    public void testCylinderVolumeCalculator() {
        System.out.println("cylinderVolumeCalculator");
        double height = 35;
        double radius = 5;
        MapControl instance = new MapControl();
        double expResult = 2747.5;
        double result = instance.cylinderVolumeCalculator(height, radius);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testCylinderVolumeCalculator2() {
        System.out.println("cylinderVolumeCalculator");
        double height = -1;
        double radius = 5;
        MapControl instance = new MapControl();
        double expResult = -1;
        double result = instance.cylinderVolumeCalculator(height, radius);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testCylinderVolumeCalculator3() {
        System.out.println("cylinderVolumeCalculator");
        double height = 35;
        double radius = -1;
        MapControl instance = new MapControl();
        double expResult = -1;
        double result = instance.cylinderVolumeCalculator(height, radius);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testCylinderVolumeCalculator4() {
        System.out.println("cylinderVolumeCalculator");
        double height = 200;
        double radius = 5;
        MapControl instance = new MapControl();
        double expResult = -1;
        double result = instance.cylinderVolumeCalculator(height, radius);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testCylinderVolumeCalculator5() {
        System.out.println("cylinderVolumeCalculator");
        double height = 100;
        double radius = 5;
        MapControl instance = new MapControl();
        double expResult = 7850;
        double result = instance.cylinderVolumeCalculator(height, radius);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testCylinderVolumeCalculator6() {
        System.out.println("cylinderVolumeCalculator");
        double height = 35;
        double radius = 100;
        MapControl instance = new MapControl();
        double expResult = 1099000;
        double result = instance.cylinderVolumeCalculator(height, radius);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testCylinderVolumeCalculator7() {
        System.out.println("cylinderVolumeCalculator");
        double height = 1;
        double radius = 5;
        MapControl instance = new MapControl();
        double expResult = 78.5;
        double result = instance.cylinderVolumeCalculator(height, radius);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testCylinderVolumeCalculator8() {
        System.out.println("cylinderVolumeCalculator");
        double height = 35;
        double radius = 1;
        MapControl instance = new MapControl();
        double expResult = 109.9;
        double result = instance.cylinderVolumeCalculator(height, radius);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of upgradedArmor method, of class MapControl.
     */
    @Test
    public void testUpgradedArmor() {
        System.out.println("upgradedArmor");
        double iridium = 51;
        double pallidium = 51;
        double platinum = 51;
        MapControl instance = new MapControl();
        double expResult = 17;
        double result = instance.upgradedArmor(iridium, pallidium, platinum);
        assertEquals(expResult, result, 0.0);
        
    }
     @Test
    public void testUpgradedArmor2() {
        System.out.println("upgradedArmor");
        double iridium = -1;
        double pallidium = 50;
        double platinum = 50;
        MapControl instance = new MapControl();
        double expResult = -1;
        double result = instance.upgradedArmor(iridium, pallidium, platinum);
        assertEquals(expResult, result, 0.0);
        
    }
     @Test
    public void testUpgradedArmor3() {
        System.out.println("upgradedArmor");
        double iridium = 50;
        double pallidium = -1;
        double platinum = 50;
        MapControl instance = new MapControl();
        double expResult = -1;
        double result = instance.upgradedArmor(iridium, pallidium, platinum);
        assertEquals(expResult, result, 0.0);
        
    }
       @Test
    public void testUpgradedArmor4() {
        System.out.println("upgradedArmor");
        double iridium = 50;
        double pallidium = 50;
        double platinum = -1;
        MapControl instance = new MapControl();
        double expResult = -1;
        double result = instance.upgradedArmor(iridium, pallidium, platinum);
        assertEquals(expResult, result, 0.0);
        
    }
        @Test
    public void testUpgradedArmor5() {
        System.out.println("upgradedArmor");
        double iridium = 101;
        double pallidium = 500;
        double platinum = 60;
        MapControl instance = new MapControl();
        double expResult = -1;
        double result = instance.upgradedArmor(iridium, pallidium, platinum);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testUpgradedArmor6() {
        System.out.println("upgradedArmor");
        double iridium = 100;
        double pallidium = 50;
        double platinum = 30;
        MapControl instance = new MapControl();
        double expResult = 20;
        double result = instance.upgradedArmor(iridium, pallidium, platinum);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testUpgradedArmor7() {
        System.out.println("upgradedArmor");
        double iridium = 50;
        double pallidium = 100;
        double platinum = 30;
        MapControl instance = new MapControl();
        double expResult = 20;
        double result = instance.upgradedArmor(iridium, pallidium, platinum);
        assertEquals(expResult, result, 0.0);
        
    }
     @Test
    public void testUpgradedArmor8() {
        System.out.println("upgradedArmor");
        double iridium = 50;
        double pallidium = 30;
        double platinum = 100;
        MapControl instance = new MapControl();
        double expResult = 20;
        double result = instance.upgradedArmor(iridium, pallidium, platinum);
        assertEquals(expResult, result, 0.0);
}
    
}

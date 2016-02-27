/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Andromeda260.view;

import java.util.Scanner;

/**
 *
 * @author rubengonzalezflores
 */
public class UpgradeResources {
    
    public UpgradeResources(){
        
        
        }
    void upgradeWeapon(){
        //To Be Used! Figured we could use this Class for both Armor and other resources later on
    }
    
    void upgradeArmor(){
        System.out.println("\nIt looks like you have enough resources for an upgrade!"
            +"\n Follow these steps to upgrade your armor.");
        boolean valid = false;
        while (!valid){
            double iridium = this.getInputIridium();
        }
    }
    
    private double getInputIridium(){
        Scanner keyboard = new Scanner(System.ini);
        boolean valid = false;
        String selection = null;
        //The loop starts!
        while (!valid){
            selection = keyboard.nextLine();
            selection = selection.trim();
            
            if (selection.length() < 1) {
                System.out.println("Input cannot be left blank.");
                
            }
            
            else {
                selection = this.upgradeArmor();
                
            }
        }
        }
    }
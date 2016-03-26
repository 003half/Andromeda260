package byui.cit260.Andromeda260.view;

import static java.lang.Math.random;

/**
 *
 * @author reyob
 */
public class AttackNativesView extends View{
    
    private double nativeAttackStrength = random() * 10;
    
    public AttackNativesView(){
        this.menu = "\nAs you approach the planet,"
                + "\nyour scanners indicate that"
                + "\nthe ships defending the planet"
                + "\nhave an attack strength of " + nativeAttackStrength +"."
                + "\nDo you wish to proceed with the attack?"
                + "\nA - Attack anyway, you have better armor"
                + "\nL - Leave without risking your new paint job"
                + "\nQ - You didn't mean to attack them anyway, you are on a"
                + "\ndiplomatic mission.";
    }
    
    @Override
    public void doAction(char selection) {
         switch (selection) {
            case 'A':
                attack();
                break;
            case 'L':
                this.console.println("\nLoser");
                break;
             case 'Q':
                break;
            default:
                this.console.println("Invalid option");
                break;
        }
    }

    private void attack() {
        //this function is temporary and uses player input instead of saved data
        //the final program should use saved data instead
        this.console.println("\nWhat is your attack strength?");//this will eventually be replaced
        double shipAttackStength = this.getNumberInput();//this will call the ships saved strength
        if (shipAttackStength >= nativeAttackStrength){
            this.console.println("\nCongratulations, you beat up the poor defensles natives."
                    + "\nMURDERER!!");
        } else {this.console.println("\nWuss, you can't even beat up the local with"
                + "\nall your advanced weaponry.");}
    }
    
}

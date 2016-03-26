package byui.cit260.Andromeda260.view;

import andromeda260.Andromeda260;
import java.io.PrintWriter;

/**
 *
 * @author Dean Boyer
 */
public class ErrorView {
    private static final PrintWriter errorFile = Andromeda260.getOutFile();
    private static final PrintWriter logFile = Andromeda260.getLogFile();
    
    public static void display(String className, String errorMessage) {
        //error display
        errorFile.println(
                          "--------------------------------------------------"
                        + "\n- Error - " + errorMessage
                        + "\n--------------------------------------------------");
        
        //log error
        logFile.println(className + " - " + errorMessage);
    }
}

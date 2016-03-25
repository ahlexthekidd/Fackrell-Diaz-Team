/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.ultimatechess.exceptions;

/**
 *
 * @author Zero
 */
public class TrialsControlException extends Exception {

    public TrialsControlException() {
        super("\nThis is an exception thrown by"
                + " the MapControlException Class");
    }

    public TrialsControlException(String message) {
        super(message);
    }

    public TrialsControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public TrialsControlException(Throwable cause) {
        super(cause);
    }

    public TrialsControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}

package nyc.c4q.sirisays.animations;

import java.util.Random;
import android.graphics.*;
import android.view.animation.*;


/**
 * Created by MarckemX on 11/1/17.
 */

public class Animate {
    static AlphaAnimation fadeOut;
    final static private char[] codeChars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    final static  Random randomNum = new Random();

    public static String generate(){
//        int number = randomNum.nextInt(14);
        String hexCode ="";
        while(hexCode.length()<6){
            hexCode += codeChars[randomNum.nextInt(15)];
        }
        return hexCode;
    }

    public int colorToInt(String rgb){
        return 0;
    }

    public static Animation createFade() {
        fadeOut = new AlphaAnimation(1, 0);
        fadeOut.setInterpolator(new AccelerateInterpolator());
        fadeOut.setStartOffset(500);
        fadeOut.setDuration(1000);
        return fadeOut;
    }

}

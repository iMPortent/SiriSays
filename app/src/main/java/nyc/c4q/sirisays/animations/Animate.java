package nyc.c4q.sirisays.animations;

import java.util.Random;

import android.view.View;
import android.view.animation.*;
import java.util.*;
import android.view.animation.Animation;
import android.util.*;

/**
 * Created by MarckemX on 11/1/17.
 */

public class Animate {
    static AlphaAnimation fadeOut;
    final static private char[] codeChars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    final static  Random randomNum = new Random();

//    public static String generate(){
////        int number = randomNum.nextInt(14);
//        String hexCode ="";
//        while(hexCode.length()<6){
//            hexCode += codeChars[randomNum.nextInt(15)];
//        }
//        return hexCode;
//    }

    public static Animation createFade() {
        fadeOut = new AlphaAnimation(1, 0);
        fadeOut.setInterpolator(new AccelerateInterpolator());
        fadeOut.setStartOffset(0);
        fadeOut.setDuration(1000);
        return fadeOut;
    }

    /**
     * Created by MarckemX on 11/2/17.
     */


}

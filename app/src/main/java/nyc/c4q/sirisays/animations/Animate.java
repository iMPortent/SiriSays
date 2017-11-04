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
        AlphaAnimation fadeOut = new AlphaAnimation(1, 0);
        fadeOut.setInterpolator(new AccelerateInterpolator());
        fadeOut.setStartOffset(0);
        fadeOut.setDuration(1000);
        return fadeOut;
    }

    public static Animation fadeIn() {
        AlphaAnimation fadeIn = new AlphaAnimation(0, 1);
        fadeIn.setInterpolator(new AccelerateInterpolator());
        fadeIn.setStartOffset(0);
        fadeIn.setDuration(1000);
        return fadeIn;
    }


    /**
     * Created by MarckemX on 11/2/17.
     */


}

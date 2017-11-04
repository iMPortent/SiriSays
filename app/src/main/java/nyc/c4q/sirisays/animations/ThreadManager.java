package nyc.c4q.sirisays.animations;

import android.util.Log;
import android.view.View;
import android.widget.*;
import java.util.ArrayList;
import android.view.*;
import android.os.*;
/**
 * Created by MarckemX on 11/4/17.
 */

public class ThreadManager {

//    private static ArrayList<Thread>multipleThreads = new ArrayList();
    static ArrayList<ImageView>pattern = new ArrayList();
    final private static  int DELAY = 1000;
    final private String TAG = "SharedAnimation";

    public void addToPattern(ImageView image){
        pattern.add(image);
    }

    public void runPattern(){
        for(int i = 0; i < pattern.size();i++) {
            SharedAnimation animation = new SharedAnimation();
            animation.setImageView(pattern.get(i));
            animation.threadIt();        }
    }

    public static class SharedAnimation extends Handler implements Runnable {

        private static ImageView x;

        public void setImageView(ImageView v) {
            SharedAnimation.x = v;
        }

        @Override
        public void run() {
            x.startAnimation(Animate.createFade());
        }

        public void threadIt(){
            postDelayed(this,1000);
        }


    }
}


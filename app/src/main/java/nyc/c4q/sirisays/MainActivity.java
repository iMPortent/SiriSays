package nyc.c4q.sirisays;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import nyc.c4q.sirisays.animations.*;
import android.view.*;
import java.util.*;

import static android.app.PendingIntent.getActivity;

public class MainActivity extends AppCompatActivity {
    ImageView[] circles;
    ImageView circle_one,circle_two,circle_three,circle_four;
    Queue userPat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setValues();
        //setColors();
    }

    public void setValues(){
        circle_one = findViewById(R.id.first);
        circle_two = findViewById(R.id.second);
        circle_three = findViewById(R.id.third);
        circle_four = findViewById(R.id.fourth);

        circles = new ImageView[4];

        userPat = new LinkedList();

        userPat.add(circle_four);
        circles[0] = circle_one;
        circles[1] = circle_two;
        circles[2] = circle_three;
        circles[3] = circle_four;

        circle_one.setAnimation(Animate.createFade());
    }

    public void fadeIt(View v){
        //Expensive to create queue for the users input, keeping out for now
        //userPat.add(v.getId());
        v.startAnimation(Animate.createFade());
//        Toast.makeText(getApplicationContext(),String.valueOf(userPat.size()),Toast.LENGTH_SHORT).show();
    }


//    public void checkText(){
//        while(userPat.poll()!=null){
//
//        }
//    }





}

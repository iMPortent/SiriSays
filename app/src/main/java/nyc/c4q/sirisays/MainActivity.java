package nyc.c4q.sirisays;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import nyc.c4q.sirisays.animations.*;
import android.view.*;
import java.util.*;

import static android.app.PendingIntent.getActivity;

public class MainActivity extends AppCompatActivity {
    ThreadManager manager = new ThreadManager();
    ImageView[] circles;
    ImageView circle_one,circle_two,circle_three,circle_four;
    ArrayList<Integer>CPUpat,userPat;
    Random random = new Random();
    int index = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setValues();

        CPUpat();
        //setColors();
     }

    public void setValues(){
        circle_one = findViewById(R.id.first);
        circle_two = findViewById(R.id.second);
        circle_three = findViewById(R.id.third);
        circle_four = findViewById(R.id.fourth);

        circles = new ImageView[4];

        userPat = new ArrayList();
        CPUpat = new ArrayList();

//        userPat.add(circle_four);
        circles[0] = circle_one;
        circles[1] = circle_two;
        circles[2] = circle_three;
        circles[3] = circle_four;

    }

    public void fadeIt(View v){


        //Expensive to create queue for the users input, keeping out for now

        //userPat.add(v.getId());

        v.startAnimation(Animate.createFade());

        if(matchPattern(v,index)&& !(index == CPUpat.size()-1)){index++;} else{ index = 0; CPUpat();}


//        Toast.makeText(getApplicationContext(),String.valueOf(userPat.size()),Toast.LENGTH_SHORT).show();
//        for(int i = 0 ; i < CPUpat.size();i++) {
//            if(matchPattern(v, i)){CPUpat();};
//        }
    }

    public void CPUpat(){
        ImageView pickImage = circles[random.nextInt(4)];
        CPUpat.add(pickImage.getId());
        manager.addToPattern(pickImage);
        manager.runPattern();
     }

    public boolean matchPattern(View view, int index){
        if(CPUpat.get(index)==view.getId()){
            Toast.makeText(getApplicationContext(),"right",Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(getApplicationContext(),"wrong",Toast.LENGTH_SHORT).show();
            index = 0;
            return false;
        }
    }


//     public void runPattern(ArrayList<Integer> pattern){
//
//         //if not stopping no need for array of threads
//
//         //Thread[] threads = new Thread[pattern.size()];
//
//         Thread thread;
//        for(int i = 0; i < pattern.size();i++){
//           thread = new Thread(new Animate.SharedAnimation(findViewById(CPUpat.get(i))));
//           thread.start();
//        }
//
//        //test without stopping threads
//
////        for(Thread x : threads){
////            x.join();
////        }n
//     }

//     public void userAttempt(View view) {
//         int length = CPUpat.size();
//         int counter = 0;
//         while(){
//             matchPattern(view,counter);
//         }
//     }



//     public void compTurn(){
//         CPUpat();
//         runPattern(CPUpat);
//     }

//     public void userTurn(View view){
//         userAttempt(view);
//     }


        //method if user has a queue for inputs

//    public void checkText(){

//        while(userPat.poll()!=null){
//
//        }
//    }





}

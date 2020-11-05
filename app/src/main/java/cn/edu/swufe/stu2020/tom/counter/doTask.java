package cn.edu.swufe.stu2020.tom.counter;

import java.util.Timer;
import java.util.TimerTask;

public class doTask extends TimerTask {

    String index;
    Timer myTimer = new Timer();
    public doTask(String index) {
        this.index = index;
    }

    public void run() {
        System.out.println(index);
    }

    public static void main(String args[]) {
        doTask myTask1 = new doTask("First task");
        myTask1.start(0,3);
        doTask myTask2 = new doTask("Second task");
        myTask2.start(0,1);

        try{
            Thread.sleep(9000);
        }
        catch(InterruptedException e){            
        }   
        
        myTask1.end();
        myTask2.end();
        
    }

    public void start(int delay, int internal) {
        myTimer.schedule(this, delay * 1000, internal * 1000);
    }
    public void end(){
        myTimer.cancel();
    }

}

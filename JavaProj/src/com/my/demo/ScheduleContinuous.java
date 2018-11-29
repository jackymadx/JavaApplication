/**
 * 
 */
package com.my.demo;

/**
 * @author jacky
 *
 */
import java.util.*;
//We only need Timer and TimerTask from util package

public class ScheduleContinuous
{
 Timer scheduleTimer = new Timer();
 int defaultStartTime = 3000; //Seconds
 int defaultInterval = 3000; //Seconds
 
 public static void main(String args[])
 {
    ScheduleContinuous scheduleContinuous = new ScheduleContinuous();
    scheduleContinuous.proceed();
 }
 
 private void proceed()
 {
    //This will schedule the ScheduleContinuousTask to execute after 3 seconds
    scheduleTimer.schedule(new ScheduleContinuousTask(), defaultStartTime, defaultInterval);
 }
 
 class ScheduleContinuousTask extends TimerTask
 {
    public void run()
    {
       System.out.println("Start of Task");
       //Perform your task(s) here
       System.out.println("End of Task");
       //Add a condition to STOP
       //Invoke scheduleTimer.cancel() in the condition
    }
 }
}
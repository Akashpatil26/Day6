package Day6programms;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopWatch sw= new StopWatch();
        System.out.println("Enter 1:");
        long start = scanner.nextLong();
        sw.setStartTime();
        System.out.println("Enter 2 ");
        long end = scanner.nextLong();
        sw.setEndTimeTime();

        long l =sw.calculateElapsedTime();
        System.out.println("Time elapsed is : " +l);

      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Enter between 1-9 ");
        int start =scanner.nextInt();
        System.out.println("Enter between 1-9 ");
        int end
*/

    }
    public long startTime =0;
    public long endTime=0;
    public long elapsedTime=0;
    /*setting starttime */

    public void setStartTime(){
        startTime=System.currentTimeMillis();
        System.out.println("The start time is "+startTime);
    }
    public void setEndTimeTime(){
        endTime=System.currentTimeMillis();
        System.out.println("The stop time is "+endTime);
    }
    public long calculateElapsedTime(){
        elapsedTime = startTime - endTime;
        return elapsedTime;
    }

}

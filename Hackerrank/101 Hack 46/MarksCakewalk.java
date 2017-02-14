import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Collections;

public class MarksCakewalk{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calories = new int[n];
        for(int calories_i=0; calories_i < n; calories_i++){
            calories[calories_i] = in.nextInt();
        }

        // your code goes here
        Arrays.sort(calories);

        for(int i = 0; i < calories.length / 2; i++){
            int temp = calories[i];
            calories[i] = calories[calories.length - i - 1];
            calories[calories.length - i - 1] = temp;
        }
   
    //    System.out.println(Arrays.toString(calories));

        int i = 0;
        long totcal = 0;
        for (int xcal:calories){
            totcal = totcal + (xcal * (Math.round(Math.pow(2, i))));
            i++;
        //    System.out.println(totcal);
        }
  //  System.out.println();
    System.out.println(totcal);
    }
}

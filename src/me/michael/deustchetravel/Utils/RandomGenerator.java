package me.michael.deustchetravel.Utils;

import java.util.Random;

public class RandomGenerator {
    public static Integer Number(){
        Random RandomIDGenerator = new Random();
        return RandomIDGenerator.nextInt(10000000);
    }

    public static String Strings(Integer LengthOfString ){
        String ListOfString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder(LengthOfString);

        for(int x = 0; x < LengthOfString; x++)
        {
            int index = (int) (ListOfString.length()*Math.random());

            sb.append(ListOfString.charAt(index));
        }

        return sb.toString();
    }
}

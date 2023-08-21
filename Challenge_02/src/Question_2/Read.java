package Question_2;

import java.util.Scanner;

public class Read {


    public static int Count (String text, String caracter){
        int count = 0;
        int index = 0;

        while(index != -1){
            index = text.indexOf(caracter, index);
            if(index != -1){
                count ++;
                index += caracter.length();
            }
        }
        return count;
    }

}

/*
문제
16진수 수를 입력받아서 10진수로 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 16진수 수가 주어진다. 이 수의 최대 길이는 6글자이다. 16진수 수는 0~9와 A~F로 이루어져 있고, A~F는 10~15를 뜻한다. 또, 이 수는 음이 아닌 정수이다.

출력
첫째 줄에 입력으로 주어진 16진수 수를 10진수로 변환해 출력한다.
*/

import java.util.*;
import java.math.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String numStr = scan.nextLine();
        int reInt = 0;
        int tempInt = 0;
        char[] numChArray = numStr.toCharArray();

        for (int i = numChArray.length -1; i >= 0; i--){
            tempInt = changeDec(numChArray[i]);
            tempInt = tempInt * (int) Math.pow(16, (numChArray.length-1-i));
            reInt += tempInt;
        }

        System.out.println(reInt);

        scan.close();
    }

    public static int changeDec(char num){
        int rtNum = 0;
        switch(num){
                case 'A' : rtNum = 10;
                break;
                case 'B' : rtNum = 11;
                break;
                case 'C' : rtNum = 12;
                break;
                case 'D' : rtNum = 13;
                break;
                case 'E' : rtNum = 14;
                break;
                case 'F' : rtNum = 15;
                break;
                default : rtNum = Character.getNumericValue(num);
                break;                
        }
        return rtNum;
    }

}
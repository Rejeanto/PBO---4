package com.pboreg;

public class Main6 {
    public static void main(String[] args){
        // code here cannot use x

        {// this is a block
            //code here cannor use
            int x = 100;
            //code here can use x
            System.out.println(x);
        }//the block ends here

        //code here cannot use x
    }
}

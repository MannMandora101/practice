package DesignPattern;/* 
  @created 21/11/22
  @author  manish.mandora
*/

import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String a[]) {
        Main main=new Main();
        Thread thread=new Thread();
        Singleton.getInstance();
        System.out.println(Singleton.getInstance());
        thread.run();


        Thread thread1=new Thread();
        Singleton.getInstance();
        System.out.println(Singleton.getInstance());
        thread1.run();


        String s="the sky is blue";
        Stack<String> stack=new Stack<>();
        String[] split = s.split(" ");
        for(int i=0;i<=s.length();i++){
            System.out.println(split[i]);
            stack.push(split[i]);
        }


    }
}

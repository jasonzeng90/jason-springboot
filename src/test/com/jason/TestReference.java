package com.jason;

import java.util.HashMap;
import java.util.Map;

public class TestReference {

    public static void main(String[] args) {

        //demo1
        String str = new String("hello");
        char[] chs = {'w', 'o', 'r', 'l', 'd'};
        change(str, chs);
        System.out.println(str + " " + new String(chs));//hello World

        //-------------------------------------------------
        //demo2

        StringBuffer sb = new StringBuffer("hello");
        change(sb);
        System.out.println(sb);//hello world

        //demo3
        StringBuffer a=new StringBuffer("A");
        StringBuffer b=new StringBuffer("B");
        operate(a,b);
        System.out.println(a+"."+b);//AB.B


    }

    public static void change(StringBuffer sb) {
        sb.append(" world");
//      sb.deleteCharAt(0);
    }

    public static void change(String str, char[] chs) {
        str.replace('h', 'H');
        chs[0] = 'W';
    }

    static void operate(StringBuffer x,StringBuffer y) {

        x.append(y);
        y=x;

    }


    void test1(){
        Map<String,String> map1 = new HashMap<>();
        Map<String,String> map2 = new HashMap<>();
        map1.put("image","http://reas.rockfintech.com/statement/file/imgFiles/20181025/10201810251519029094743185816184_0.jpg");
        map1.put("ocrType","0");
        map1.put("imageType","URL");
        map2.put("image","http://reas.rockfintech.com/statement/file/imgFiles/20181025/10201810251519029094743185816184_1.jpg");
        map2.put("ocrType","1");
        map2.put("imageType","URL");
        Map<String,String>[] maps = new Map[2];
        maps[0] = map1;
        maps[1] = map2;

    }

}

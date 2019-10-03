package com.example.autoconverter;

import me.myatminsoe.mdetect.MDetect;
import me.myatminsoe.mdetect.Rabbit;

public class Detect {
    /*public static String convert(String to, String text){
        String returnText = text;
        if (to.equals("u")) {
            if (MDetect.INSTANCE.isUnicode()) {
                returnText=text;
            }else {
                returnText= Rabbit.zg2uni(text);
            }
        }else if (to.equals("z")){
            if (MDetect.INSTANCE.isUnicode()) {
                returnText=Rabbit.uni2zg(text);
            }else {
                returnText= text;
            }
        }
        return returnText;
    }*/
    int zawgyi;
    int unicode;
}

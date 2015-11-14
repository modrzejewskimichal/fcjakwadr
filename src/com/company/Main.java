package com.company;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class Main {

    public static void main(String[] args) {
        //a  b  c
        //f(x)=2*x*x-3*x-8
        //delta=b*b-4*a*c
        //xjeden=(-b-pierwiastekdelta)/(2*a)
        //xdwa=(-b+pierwiastekdelta)/(2*a)
        // write your code here
        double a=2, b=-3, c=-8;
        double x1, x2, x0, d;
        d=b*b-4*a*c;
        if(d<0) {
            x1=(-b- Math.sqrt(d))/(2*a);
            x2=(-b+ Math.sqrt(d))/(2*a);
            System.out.println("x1" + x1);
            System.out.println("x2" + x2);
        }
        else if(d>0){
            System.out.println("x nie istnieje");
        }
        else if(d==0){x0=-b/2*a;
            System.out.println(x0);

        }
    }
}

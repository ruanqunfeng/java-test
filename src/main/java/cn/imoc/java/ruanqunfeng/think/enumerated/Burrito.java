package cn.imoc.java.ruanqunfeng.think.enumerated;

import cn.imoc.java.ruanqunfeng.think.io.BufferedInputFile;

import static cn.imoc.java.ruanqunfeng.think.enumerated.Spiciness.*;

public class Burrito {
    Spiciness degree;
    public Burrito(Spiciness degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Burrito is " + degree;
    }

    public static void main(String[] args) {
        System.out.println(new Burrito(Spiciness.NOT));
        System.out.println(new Burrito(Spiciness.MEDIUM));
        System.out.println(new Burrito(Spiciness.HOT));
    }
}

package cn.imoc.java.ruanqunfeng.think.String;

class Candy {
    static {
        System.out.println(" Candy ");
    }
}

class Gum {
    static {
        System.out.println(" Gum ");
    }
}


public class TestString {

    public static void main(String[] args) {
        int x = 5;
        double y = 5.645564;
        System.out.printf("y : %d %f \n", x,y);
        System.out.format("y : %d %f ", x,y);

        System.out.println("Begin");
        try {
            Class.forName("Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("Not found Gum Class");
        }
        System.out.println("After");
        new Candy();
        System.out.println("END");
    }
}
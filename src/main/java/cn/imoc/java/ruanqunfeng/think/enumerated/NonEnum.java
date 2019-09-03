package cn.imoc.java.ruanqunfeng.think.enumerated;

public class NonEnum {
    public static void main(String[] args) {
        Class<Integer> intClass = Integer.class;
        try {
            for (Integer integer : intClass.getEnumConstants()) {
                System.out.println(integer);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

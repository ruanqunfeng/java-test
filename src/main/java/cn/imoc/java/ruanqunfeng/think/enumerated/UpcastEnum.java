package cn.imoc.java.ruanqunfeng.think.enumerated;

enum Search {HITHER, YON}

public class UpcastEnum {
    public static void main(String[] args) {
        cn.imoc.java.ruanqunfeng.think.enumerated.Search[] vals = Search.values();
        for (cn.imoc.java.ruanqunfeng.think.enumerated.Search val : vals) {
            System.out.println(val);
        }
        Enum e = Search.HITHER;
        // e.values(); // No values() in Enum
        for (Enum en : e.getClass().getEnumConstants()) {
            System.out.println(en);
        }
    }
}

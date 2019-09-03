package cn.imoc.java.ruanqunfeng.think.enumerated;

import java.util.*;
import static net.mindview.util.Print.*;
import static cn.imoc.java.ruanqunfeng.think.enumerated.AlarmPoints.*;

public class EnumSets {
    public static void main(String[] args) {
        EnumSet<AlarmPoints> points = EnumSet.noneOf(AlarmPoints.class);// Empty Set
        points.add(BATHROOM);
        print(points);
        points.addAll(EnumSet.of(AlarmPoints.STAIR1, AlarmPoints.STAIR2, AlarmPoints.KITCHEN));
        points = EnumSet.allOf(AlarmPoints.class);
        points.removeAll(EnumSet.of(AlarmPoints.STAIR1, AlarmPoints.STAIR2, AlarmPoints.KITCHEN));
        print(points);
    }
}

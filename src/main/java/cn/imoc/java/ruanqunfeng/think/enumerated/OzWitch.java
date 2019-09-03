package cn.imoc.java.ruanqunfeng.think.enumerated;

import static net.mindview.util.Print.*;

public enum OzWitch {
    // Instances must be defined first, before methods:
    WEST("Miss Gulch, aka the Wicked Witch of the West"),
    NORTH("Glinda, the Good Witch of the North"),
    EAST("Wicked Witch of the Ease, wearer of the Ruby Slippers, crushed by Dorothy's house"),
    SOUTH("Good by inference, but missing");
    private String description;
    private OzWitch(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {
        for (cn.imoc.java.ruanqunfeng.think.enumerated.OzWitch witch : OzWitch.values()) {
            print(witch + ": " + witch.getDescription());
        }
    }
}
































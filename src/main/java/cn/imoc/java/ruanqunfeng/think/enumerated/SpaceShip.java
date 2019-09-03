package cn.imoc.java.ruanqunfeng.think.enumerated;

public enum SpaceShip {
    SCOUT, CARGO, TRANSPORT, CRUISER, BATTLESHIP, MOTHERSHIP;

    @Override
    public String toString() {
        String id = name();
        String lower = id.substring(1).toLowerCase();
        return id.charAt(0) + lower;
    }

    public static void main(String[] args) {
        for (cn.imoc.java.ruanqunfeng.think.enumerated.SpaceShip spaceShip : values()) {
            System.out.println(spaceShip);
        }
    }
}

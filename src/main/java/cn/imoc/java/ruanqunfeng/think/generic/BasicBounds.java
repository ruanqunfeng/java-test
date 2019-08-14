package cn.imoc.java.ruanqunfeng.think.generic;

interface HasColor {
    java.awt.Color getColor();
}

class Colored<T extends HasColor> {
    T item;

    Colored(T item) {
        this.item = item;
    }

    T getItem() {
        return this.item;
    }

    java.awt.Color color() {
        return item.getColor();
    }
}

class Dimension {
    public int x, y, z;
}

//class ColoredDimension<T extends HasColor & Dimension> { // class must be first,then interface
class ColoredDimension<T extends Dimension & HasColor> {
    T item;
    ColoredDimension(T item) {
        this.item = item;
    }
    T getItem() {
        return this.item;
    }
    java.awt.Color color() {
        return item.getColor();
    }
    int getX() {
        return item.x;
    }

    int getY() {
        return item.y;
    }

    int getZ() {
        return item.z;
    }
}

public class BasicBounds {

}

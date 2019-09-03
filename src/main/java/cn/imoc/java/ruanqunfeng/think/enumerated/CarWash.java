package cn.imoc.java.ruanqunfeng.think.enumerated;

import static net.mindview.util.Print.*;

import java.util.*;

public class CarWash {
    public enum Cycle {
        UNDERBODY {
            void atcion() {
                print("Spraying the underbody");
            }
        },
        WHEELWASH {
            void action() {
                print("Washing the wheels");
            }
        },
        PREWASH {
            void action() {
                print("Loosening the dirt");
            }
        },
        BASIC {
            void action() {
                print("The basic wash");
            }
        };

        abstract void action();
    }

    EnumSet<Cycle> cycles = EnumSet.of(Cycle.BASIC, Cycle.PREWASH);

    public void add(Cycle cycle) {
        cycles.add(cycle);
    }

    public void washCar() {
        for (cn.imoc.java.ruanqunfeng.think.enumerated.CarWash.Cycle c : cycles) {
            c.action();
        }
    }

    @Override
    public String toString() {
        return cycles.toString();
    }

    public static void main(String[] args) {
        cn.imoc.java.ruanqunfeng.think.enumerated.CarWash wash = new CarWash();
        print(wash);
        ((CarWash) wash).washCar();

    }
}































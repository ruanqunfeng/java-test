package cn.imoc.java.ruanqunfeng.think.io;

import java.io.*;
import static net.mindview.util.Print.*;
import java.util.concurrent.*;
import java.util.*;

public class Logon implements Serializable {
    private Date date = new Date();
    private String username;
    private transient String password;
    public Logon(String name, String pwd) {
        username = name;
        password = pwd;
    }

    @Override
    public String toString() {
        return "logon info: \n  username: " + username + "\n    date: " + date + "\n    password: " + password;
    }

    public static void main(String[] args) throws Exception{
        Logon a = new Logon("Hulk", "myLittlePony");
        print("logon a = " + a);
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("Logon.out"));
        o.writeObject(a);
        o.close();
        TimeUnit.SECONDS.sleep(1);

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("Logon.out"));
        print("Recovering object at " + new Date());
        a = (Logon)in.readObject();
        print("logon a = " + a);
    }
}

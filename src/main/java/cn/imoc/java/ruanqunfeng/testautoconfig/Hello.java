package cn.imoc.java.ruanqunfeng.testautoconfig;

public class Hello {
    public String getParms() {
        return parms;
    }

    public void setParms(String parms) {
        this.parms = parms;
    }

    private String parms;

    public String sayHello() {
        return "Hello " + this.parms;
    }
}

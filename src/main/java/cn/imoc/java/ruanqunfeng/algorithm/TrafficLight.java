package cn.imoc.java.ruanqunfeng.algorithm;

public class TrafficLight {
    public static void main(String[] args) {
        /*
         * 同步互斥swit notify
         * 编写红绿灯
         */
        D d = new D();
        /*自定义线程执行绿灯*/
        new Thread() {

            @Override
            public void run() {
                /*一直可以执行绿灯*/
                while (true) {
                    d.g();
                }
            }

        }.start();
        /*主线程执行红灯*/
        while (true) {
            d.r();
        }
    }

}

class D {
    /*标记变量*/
    private boolean flag = true;

    /*红灯闪烁的方法*/
    public synchronized void r() {

        while (!flag) {
            try {
                /*红灯等待*/
                this.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        for (int i = 1; i <= 10; i++) {
            try {
                /*线程每进行一次休息半秒*/
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            /*循环让红灯亮10秒*/
            System.out.println("红灯亮" + "->" + i);
        }
        /*让红灯wait*/
        flag = false;
        /*唤醒下一个线程*/
        this.notify();
    }

    public synchronized void g() {
        while (flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("绿灯亮" + "->" + i);
        }
        flag = true;
        this.notify();
    }
}

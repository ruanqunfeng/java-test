package cn.imoc.java.ruanqunfeng.Hedera;

//import com.hedera.hashgraph.sdk.crypto.ed25519.Ed25519PrivateKey;
//import com.hedera.hashgraph.sdk.crypto.ed25519.Ed25519PublicKey;

import java.util.TreeSet;

import static net.mindview.util.Print.print;

public class generateKeys {
    public static void main(String[] args) {

        /*Ed25519PrivateKey newKey = Ed25519PrivateKey.generate();
        Ed25519PublicKey newPublicKey = newKey.getPublicKey();

        System.out.println("private key = " + newKey);
        System.out.println("public key = " + newPublicKey);*/

        int[] ints = {9, 4, 7, 9, 4, 11, 3};
        System.out.println(getSecondNum(ints));

        new test();

    }

    private static int getSecondNum(int[] ints) {

        TreeSet<Integer> set = new TreeSet<>();
        for (int insNUm : ints) {
            set.add(insNUm);
        }

        print(set);

        set.remove(set.last());
        System.out.println(set);

        return set.pollLast();

    }

    private static class test {
        static {
            System.out.println("===================");
        }
    }
}

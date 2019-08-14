package cn.imoc.java.ruanqunfeng.think.generic;

public class LinkedStack<T> {
    private static class Node<U> {
        U item;
        Node<U> next;
        Node() {
            item = null;
            next = null;
        }
        Node(U item,Node<U> next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return item == null && next == null;
        }
    }

    private Node<T> top = new Node<T>();

    public void push(T itme) {
        top = new Node<T> (itme,top);
    }

    public T pop() {
        T result = top.item;
        if (!top.end()) {
            top = top.next;
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedStack<String> l = new LinkedStack<>();
        for (String s : "ruan qun feng".split(" ")) {
            l.push(s);
        }

        String s;
        while ((s = l.pop()) != null) {
            System.out.println("s = " + s);
        }
    }
}

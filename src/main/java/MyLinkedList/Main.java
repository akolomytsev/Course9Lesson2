package MyLinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> poems = new LinkedList<>();
        poems.add(MyLinkedList.str1);
        poems.add(MyLinkedList.str2);
        poems.add(MyLinkedList.str3);
        poems.add(MyLinkedList.str4);
        poems.add(MyLinkedList.str5);
        poems.add(MyLinkedList.str6);
        poems.add(MyLinkedList.str7);
        poems.add(MyLinkedList.str8);
        poems.add(MyLinkedList.str9);
        poems.add(MyLinkedList.str10);
        poems.add(MyLinkedList.str11);
        poems.add(MyLinkedList.str12);

        System.out.println(poems);

        poems.remove(0);
        poems.removeLast();
        poems.addFirst(MyLinkedList.str12);
        poems.addLast(MyLinkedList.str1);
        poems.remove(6);
        poems.remove(1);
        poems.remove(2);
        poems.remove(5);
        poems.add(2,MyLinkedList.str7);
        poems.add(4,MyLinkedList.str9);
        poems.add(6,MyLinkedList.str2);
        poems.remove(8);
        poems.add(9,MyLinkedList.str4);
        poems.add(10,MyLinkedList.str10);
        System.out.println(poems);

    }
}

package driver;

import dstructure.linkedlist.LinkedList;

public class Driver {
    //
    public static void main(String[] args) {
        //
        /*GenArrayList<String> list = new GenArrayList<>(1);
        list.add("salom");
        list.add("Hello");
        list.add("Diva");
        //list.printContent();

        GenArrayList<Integer> iList = GenArrayList.newInstance();
        iList.add(1);
        iList.add(2);
        iList.add(3);
        iList.add(4);
        iList.add(5);
        iList.addAt(5, 10);
        //iList.clear();
        System.out.println(iList.contains(4));*/
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(30);
        ll.add(40);
        ll.add(10);
        ll.add(20);
        ll.addAt(0, 100);
        ll.printContent();
    }
}

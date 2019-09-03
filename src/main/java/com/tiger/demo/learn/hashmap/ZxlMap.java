package com.tiger.demo.learn.hashmap;

public class ZxlMap {

    public static Node [] oldTable = {new Node("k1","v1",new Node("k2","v2",new Node("k3","v3",null) ) )};
    public static Node [] newTable ={new Node(),new Node()};


    public static Node [] reSize(Node [] newTable){

        int length = newTable.length;
        for (Node node : oldTable) {
            while (null != node){
                Node next = node.getNext();
                int i = node.getKey().hashCode() % (length - 1);
                node.setNext(newTable[i]);
                newTable[i] = node;
                node = next;

            }
        }
        return newTable;

    }

    public static void main(String[] args) {
        System.out.println("----start");
        Node[] nodes = reSize(newTable);
        System.out.println("----end");
    }


}

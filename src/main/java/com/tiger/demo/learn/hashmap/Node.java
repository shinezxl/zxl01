package com.tiger.demo.learn.hashmap;

import lombok.Data;

@Data
public class Node {
    private String key;
    private Object value;
    private Node next;

    public Node(String key, Object value, Node next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public Node() {
    }
}

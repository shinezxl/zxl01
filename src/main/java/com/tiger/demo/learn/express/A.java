package com.tiger.demo.learn.express;

import lombok.Data;

import java.util.Objects;

@Data
public class A {
    private Integer a ;
    private String b ;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a1 = (A) o;
        return Objects.equals(a, a1.a) &&
                Objects.equals(b, a1.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}

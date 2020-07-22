package com.tiger.demo.learn.express;

import lombok.Data;

import java.util.List;
import java.util.Objects;

@Data
public class C {
    private List<A> a ;
    private List<B> b ;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        C c = (C) o;
        return Objects.equals(a, c.a) &&
                Objects.equals(b, c.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}

package com.lyramakes.lutils;

import java.util.Arrays;

@SuppressWarnings("unchecked")
public class Tuple<T> {
    private TupleItem<T>[] t;

    public Tuple() {

    }

    public Tuple(T... t) {
        TupleItem<T>[] ti = new TupleItem[t.length];

        for (int i = 0; i < t.length; i++) {
            ti[i] = new TupleItem<>(t[i]);
        }

        this.t = ti;
    }


    public TupleItem<T>[] get() {
        return t;
    }


    public <E> E get(int indx) {
        return (E) t[indx].get();
    }

    @Override
    public String toString() {
        return Arrays.toString(t);
    }
}

class TupleItem<E> {
    private final E e;

    public TupleItem(E e) {
        this.e = e;
    }

    public E get() {
        return e;
    }

    @Override
    public String toString() {
        return e.toString();
    }
}
package ru.suai.example;

public class Vector {
    private int v[];

    public Vector(int length) {
        v = new int [length];
    }

    public void set(int idx, int value) {
        v[idx] = value;
    }

    public int get(int idx) {
        return v[idx];
    }

    public int len() {
        return v.length;
    }

    public Vector sum(Vector obj) {
        Vector res = new Vector(v.length);
        for(int i = 0; i < v.length; i++) {
            res.v[i] = v[i] + obj.v[i];
        }
        return res;
    }

    public Vector sub(Vector obj) {
        Vector res = new Vector(v.length);
        for(int i = 0; i < v.length; i++) {
            res.v[i] = v[i] - obj.v[i];
        }
        return res;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < v.length; i++) {
            sb.append(v[i]);
            sb.append(' ');
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object o) {
        if(this == o)
            return true;
        if(!(o instanceof Vector))
            return false;
        Vector vec = (Vector)o;
        if(vec.v.length != v.length)
            return false;
        for(int i = 0; i < v.length; i++) {
            if(vec.v[i] != v[i])
                return false;
        }
        return true;
    }

}

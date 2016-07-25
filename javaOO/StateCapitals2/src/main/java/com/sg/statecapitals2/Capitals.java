package com.sg.statecapitals2;

public class Capitals {

    private String name;
    private int pop;
    private int size;

    public Capitals(String nameIn, int popIn, int sizeIn) {
        name = nameIn;
        pop = popIn;
        size = sizeIn;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}

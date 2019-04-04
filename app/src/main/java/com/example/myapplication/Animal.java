package com.example.myapplication;

public class Animal {
    private String name;
    private  int legs;
    private String moreInform;
    private boolean hasFur;

    public Animal(){}

    public Animal(String name, int legsNumber, String info, boolean hasfurr) {
        this.name = name;
        this.hasFur = hasfurr;
        this.legs = legsNumber;
        this.moreInform = info;


    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getMoreInform() {
        return moreInform;
    }

    public void setMoreInform(String moreInform) {
        this.moreInform = moreInform;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFurr) {
        this.hasFur = hasFurr;
    }

    @Override
    public String toString() {
        return "Animal Nname: " + name + "\nlegs:" + legs +
                "\nHas Fur? " + hasFur +
                "\n More Information: " + moreInform;
    }

}


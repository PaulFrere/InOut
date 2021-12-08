package ru.zsa.halflife3;

import java.io.Serializable;

public class Progress implements Serializable {
    protected String name;
    protected int health;
    protected int weapon;
    protected int lvl;

    public Progress(String name, int health, int weapon, int lvl){
        this.name = name;
        this.health = health;
        this.weapon = weapon;
        this.lvl = lvl;
    }

    @Override
    public String toString(){
        return "Progress{" +
                "name" + name + '\'' +
                "health" + health + '\'' +
                "weapon" + weapon + '\'' +
                "lvl" + lvl +
                '}';
    }
}

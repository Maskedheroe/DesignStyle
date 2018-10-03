package com.example.hou.memento;

/*
*
* 游戏进度备忘
*
* */

public class Role {

    private int vit;
    private int atk;
    private int def;

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtl() {
        return atk;
    }

    public void setAtl(int atl) {
        this.atk = atl;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }


    public RoleStateMemento saveState(){  //返回一个备忘录 存储着自己的信息
        return new RoleStateMemento(vit,atk,def);
    }

    public void RecoveryState(RoleStateMemento memento){
        this.vit =memento.getVit();
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }

    public void show(){
        System.out.println(getAtl()+getDef()+getVit());
    }

    public void getInitState(){
        this.setAtl(100);
        this.setDef(100);
        this.setVit(100);
    }

    public void fight(){

        this.setAtl(0);
        this.setDef(0);
        this.setVit(0);
    }

}

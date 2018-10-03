package com.example.hou.memento;

public class Test {
    public static void main(){

        Role role1 = new Role();
        role1.getInitState();
        role1.show();

        //保存进度
        RoleStateCaretaker stateAnim = new RoleStateCaretaker();
        stateAnim.setMemento(role1.saveState());  //保存

        //大战boss 严重损耗
        role1.fight();
        role1.show();

        //恢复操作
        role1.RecoveryState(stateAnim.getMemento());
        role1.show();


    }
}

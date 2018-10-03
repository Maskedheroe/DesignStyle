package com.example.hou.memento;


/*
*
* 角色状态管理者类
* 该类负责保存好备忘录memento  作为备忘录的聚合类
*
* */

public class RoleStateCaretaker {

    private RoleStateMemento memento;

    public RoleStateMemento getMemento() {
        return memento;
    }

    public void setMemento(RoleStateMemento memento) {
        this.memento = memento;
    }
}

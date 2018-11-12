package com.example.hou.Decorator

abstract class Decorator : Component() {
    private var component : Component? = null

    public fun setComponent(component: Component){
        this.component = component
    }

    public override fun Operation() {
        if (component!=null){
            component!!.Operation()
        }
    }
}
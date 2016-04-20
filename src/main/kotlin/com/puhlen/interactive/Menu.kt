/*
 * MIT License
 * Copyright (c) 2016 Peter Uhlenbruck
 */
package com.puhlen.interactive

class Menu(){
    var title = ""
    private var items: MutableList<MenuItem> = mutableListOf()
    fun addItem(item: MenuItem):Boolean{
        return items.add(item)
    }

    fun render(){
        Output.printStream.println(title)
        for(i in items){
            Output.printStream.println(i.message)
        }
    }
}

class MenuItem(val message: String){
    var SelectionHandler:SelectionHandler = DefaultSelectionHandler;
}

interface SelectionHandler{
    fun select();
}

object DefaultSelectionHandler:SelectionHandler{
    override fun select() {}
}
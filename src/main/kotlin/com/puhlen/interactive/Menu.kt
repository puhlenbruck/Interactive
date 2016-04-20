/*
 * MIT License
 * Copyright (c) 2016 Peter Uhlenbruck
 */
package com.puhlen.interactive

class Menu() {
    var title = ""
    private var items: MutableList<MenuItem> = mutableListOf()
    fun addItem(item: MenuItem): Boolean {
        return items.add(item)
    }

    fun render() {
        Output.printStream.println(title)
        for (i in items.indices) {
            Output.printStream.println("${i + 1}) ${items[i]}")
        }
    }
}

class MenuItem(val message: String) {
    var selectionHandler: SelectionHandler = DefaultSelectionHandler;
    internal fun select() {
        selectionHandler.select()
    }

    override fun toString(): String {
        return message
    }

}

interface SelectionHandler {
    fun select();
}

object DefaultSelectionHandler : SelectionHandler {
    override fun select() {
    }
}

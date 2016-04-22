/*
 * MIT License
 * Copyright (c) 2016 Peter Uhlenbruck
 */

package com.puhlen.interactive

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

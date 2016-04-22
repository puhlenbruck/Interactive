/*
 * MIT License
 * Copyright (c) 2016 Peter Uhlenbruck
 */
package com.puhlen.interactive

import java.util.*

class Menu() {
    var title = ""
    var prompt = ">"
    private val items: MutableList<MenuItem> = mutableListOf()
    fun addItem(item: MenuItem): Boolean {
        return items.add(item)
    }

    fun render() {
        var gettingInput = true
        while(gettingInput) {
            Output.printStream.println(title)
            for (i in items.indices) {
                Output.printStream.println("${i + 1}) ${items[i]}")
            }
            Output.printStream.print(prompt)
            val read = Scanner(Input.inputSream)
            val line = read.nextLine().trim();
            if (line.matches(Regex("[0-9]+"))) {
                val selection = line.toInt() - 1
                if(selection in items.indices){
                    items[selection].select()
                    gettingInput = false
                    return
                }
            }
            Output.printStream.println("please enter a number between 1 and ${items.size}")
        }
    }
}
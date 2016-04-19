/*
 * MIT License
 * Copyright (c) 2016 Peter Uhlenbruck
 */

package com.puhlen.interactive

import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import org.junit.Before
import org.junit.Test
import java.io.PrintStream

class OutputTest {

    val ps : PrintStream = mock()

    var out = Output

    @Before fun setup(){
        out.printStream = ps
    }

    @Test fun test(){
        Output.printStream.println()
        verify(ps).println()
    }

}

package com.example.dependencyinjectionstart.example1

import com.example.dependencyinjectionstart.example1.di.DaggerNewComponent
import javax.inject.Inject

class Activity {

    @Inject lateinit var monitor : Monitor
    @Inject lateinit var keyboard : Keyboard
    @Inject lateinit var mouse : Mouse

    init {
        DaggerNewComponent.create().inject(this)
    }

}
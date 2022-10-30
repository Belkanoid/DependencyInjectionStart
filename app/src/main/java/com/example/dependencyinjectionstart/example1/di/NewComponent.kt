package com.example.dependencyinjectionstart.example1.di

import com.example.dependencyinjectionstart.example1.Activity
import dagger.Component

@Component(modules = [NewModule::class])
interface NewComponent {

    fun inject(activity: Activity)
}
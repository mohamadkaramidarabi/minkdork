package com.example.mindork.di.component

import android.app.Application
import com.example.mindork.MvpApp
import com.example.mindork.di.builder.ActivityBuilder
import com.example.mindork.di.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class,AppModule::class,ActivityBuilder::class])
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: MvpApp)
}
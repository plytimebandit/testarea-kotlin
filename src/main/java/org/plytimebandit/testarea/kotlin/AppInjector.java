package org.plytimebandit.testarea.kotlin;

import org.jetbrains.annotations.NotNull;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class AppInjector {

    @NotNull
    public static Injector create() {
        return Guice.createInjector(new AppModule());
    }
}

package org.sergei.spring.lesson_04;

import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music {

    @Override
    public String getSong() {
        return "Take five";
    }

    @Override
    public void doInit() {
        System.out.println("jazz music bean initialized " + this);

    }

    @Override
    public void doDestroy() {
        System.out.println("jazz music bean destroyed " + this);

    }
}

package com.example.bookaop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

import java.time.LocalDate;

@Aspect
public class Logger {
    private int action = 0;
    @AfterReturning("execution(* com.example.bookaop.controllers.BookController.*(..))")
    public void log1(JoinPoint point) {
        action++;
        System.out.println("[Log1]" + "So luong muon sach: " + action);

    }

    @AfterReturning(value = "execution(public * com.example.bookaop.controllers.BookController.borrow(..))")
    public void log2() {
        System.out.println("[Log2]" + "Sach thay doi luc: " + LocalDate.now());
    }
}

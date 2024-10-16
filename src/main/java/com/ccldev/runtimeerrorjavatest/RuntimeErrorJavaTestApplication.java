package com.ccldev.runtimeerrorjavatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class RuntimeErrorJavaTestApplication {

  public static void main(String[] args) {
    SpringApplication.run(RuntimeErrorJavaTestApplication.class, args);
  }

}

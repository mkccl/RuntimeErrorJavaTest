package com.ccldev.runtimeerrorjavatest;

import com.ccldev.runtimeerrorjavatest.errorlogger.LoggerEnabled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@LoggerEnabled
@RestController
@RequestMapping("/test")
public class TestController {


  @GetMapping("/error")
  public void error() {
    throw new RuntimeException("This is a test error");
  }

  @GetMapping("/noerror")
  public void noError() {
    System.out.println("No error occurred");
  }

  @GetMapping("/stringerror")
  public void stringError() {
    String s = null;
    s.length();
  }

}

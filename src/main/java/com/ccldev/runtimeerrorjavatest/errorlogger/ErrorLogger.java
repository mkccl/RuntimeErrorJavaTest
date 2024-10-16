package com.ccldev.runtimeerrorjavatest.errorlogger;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class ErrorLogger {


  public ErrorLogger() {
  }

  public void logError(String className, String methodName, Throwable throwable) {
    log.error("Error occurred in class: {}, method: {}, error: {}", className, methodName,
        throwable.getMessage());
  }

  private String getStackTraceAsString(Throwable throwable) {
    // Implementation to convert stack trace to string
    // ...
    System.out.println("Stack trace: " + throwable.getStackTrace());
    return "";
  }
}

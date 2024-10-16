package com.ccldev.runtimeerrorjavatest.errorlogger;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ErrorLoggingAspect {
  private final ErrorLogger errorLogger;

  public ErrorLoggingAspect(ErrorLogger errorLogger) {
    this.errorLogger = errorLogger;
  }

  @Around("@within(LoggerEnabled)")
  public Object logErrors(ProceedingJoinPoint joinPoint) throws Throwable {
    System.out.println("Aspect called");
    try {
      return joinPoint.proceed();
    } catch (Throwable throwable) {
      String className = joinPoint.getTarget().getClass().getName();
      String methodName = joinPoint.getSignature().getName();
      errorLogger.logError(className, methodName, throwable);
      throw throwable;
    }
  }
}

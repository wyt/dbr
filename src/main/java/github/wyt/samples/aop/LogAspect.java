package github.wyt.samples.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class LogAspect {

  @Pointcut("@annotation(github.wyt.samples.aop.Action)")
  public void annotationPointCut() {}

  @Pointcut("execution (* github.wyt.samples.aop.DemoMethodService.*(..))")
  private void methodPointCut() {}

  @After("annotationPointCut()")
  public void after(JoinPoint joinPoint) {
    MethodSignature signature = (MethodSignature) joinPoint.getSignature();
    Method method = signature.getMethod();
    Action action = method.getAnnotation(Action.class);
    System.out.println("注解式拦截： " + action.name());
  }

  @Before("methodPointCut()")
  public void before(JoinPoint joinPoint) {
    MethodSignature signature = (MethodSignature) joinPoint.getSignature();
    Method method = signature.getMethod();
    System.out.println("方法规则式拦截： " + method.getName());
  }
}

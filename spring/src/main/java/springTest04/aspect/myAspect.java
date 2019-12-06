package springTest04.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("myAspect")
@Aspect
public class myAspect {
    @Before("myAspect.he()")
    public void beforeAdvice() {
        System.out.println("i am coming here to advice you . ");
    }
    @AfterReturning("myAspect.he()")
    public void afterReturning() {
        System.out.println("这是一个后置增强.");
    }
    @Around("myAspect.he()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("这是环绕通知的上面部分");

        proceedingJoinPoint.proceed();

        System.out.println("这是环绕通知的下面部分");
    }
    @After("he()")
    public void after() {
        System.out.println("这是最终通知,他肯定会执行");
    }
    @AfterThrowing("myAspect.he()")
    public void Throwing() {
        System.out.println("这是错误抛出advice");
    }

    @Pointcut("execution(public void springTest04..*(..))")
    public void he() {
    }
}

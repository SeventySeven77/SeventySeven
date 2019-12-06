package springTest03.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class advice01 {
    public void beforeAdvice(){
        System.out.println("i am coming here to advice you . ");
    }
    public void afterReturning(){
        System.out.println("这是一个后置增强.");
    }
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("这是环绕通知的上面部分");

            proceedingJoinPoint.proceed();

        System.out.println("这是环绕通知的下面部分");
    }
    public void after(){
        System.out.println("这是最终通知,他肯定会执行");
    }
    public void Throwing(){
        System.out.println("如果报错了这个通知将会执行");
    }
}

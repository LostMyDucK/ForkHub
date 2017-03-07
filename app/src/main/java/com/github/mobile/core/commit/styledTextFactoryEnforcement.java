package com.github.mobile.core.commit;

import com.github.mobile.ui.StyledText;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareError;
import org.aspectj.lang.annotation.Pointcut;


/**
 * Created by shalini on 3/4/2017.
 */
@Aspect
public class styledTextFactoryEnforcement {
    //@Pointcut newShape(Object o): (StyledText+.new(..));
    //@Pointcut("execution()")

    /**
     * Pointcut for finding method calls to the DAO layer
     *//*
    @Pointcut("call(com.github.mobile.ui.StyledText+.new(..))")
    public void callNewShape() {
        System.out.println("######*********what the hell??");
    }

    @Pointcut("withincode(* StyledTextFactory.make*(..))")
    public void withinFactory() {
    }

    @Pointcut("callNewShape() && withinFactory()")
    public void ille(){}

    @Before("ille()")
    public void printError(JoinPoint joinPoint){
        System.out.println("######*********what the hell??");
        throw new RuntimeException("Must invoke factory class");
    }*/
    //private static final String GUI_MUST_NOT_USE_DAO = "GUI must not access DAO";


}

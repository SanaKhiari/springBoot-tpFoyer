package tn.esprit.tpprojet.configAop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Aspect
@Component
//@Slf4j
public class LoggingAspect {
    // 👉 Logger créé manuellement
    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    //@Before("execution(* tn.esprit.tpprojet.services.ProjetDetailServiceImplementation.*(..))")
      //public void logMethodEntry(JoinPoint joinPoint) {
        //  String name = joinPoint.getSignature().getName();
        //logger.info("In method " + name + " : ");
      //}

    //@Around("execution(* tn.esprit.tpprojet.services.ProjetDetailServiceImplementation.*(..))")
    //public Object profile(ProceedingJoinPoint pjp) throws Throwable {
      //  long start = System.currentTimeMillis();
        //Object obj = pjp.proceed();
        //long elapsedTime = System.currentTimeMillis() - start;
        //logger.info("Method execution time: " + elapsedTime + " milliseconds.");
        //return obj;
    //}

    @After("execution(* tn.esprit.tpprojet.services.EntrepriseServiceImplement.findByDomaine(..))")
    public void logMethodeEntry(){
        logger.info("date  : "+ LocalDateTime.now());
    }




}

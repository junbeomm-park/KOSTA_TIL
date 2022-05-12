package kosta.di;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class LoggingAspect {//공통 관심사항
	//핵심비지니스 메소드 호출 => 메소드 호출 시간을 측정
	//타이머 작동 -> 메소드 호출 -> 타이머 종료 -> 시간을 출력
	
	private Log log = LogFactory.getLog(getClass());
	
	//공통관심 메소드 정의
	//내용 : 핵심관심 메소드 호출시 시간 측정
	//advice : 이전(공통) -> 핵심메소드 -> 이후(공통)
	public Object logging(ProceedingJoinPoint joinPoint)throws Throwable{
		log.info("로그시작");
		StopWatch stopWatch = new StopWatch();
		
		try {
			stopWatch.start();
			
			//핵심관심 메소드 호출 : WriteService insert()호출
			Object obj = joinPoint.proceed();
			
			return obj;
		}catch (Exception e) {
			throw e;
		}finally {
			stopWatch.stop();
			log.info("종료");
			log.info(joinPoint.getSignature().getName() + "메서드 실행시 : " + stopWatch.getTotalTimeMillis());
		}
	}
	
	
}

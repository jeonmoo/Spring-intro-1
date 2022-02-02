package hello.hellospring;

import hello.hellospring.aop.TimeTraceAop;
import hello.hellospring.repository.*;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Autowired를 사용하지 않고 직접 자바코드로 주입하는 방법

@Configuration
public class SpringConfig {

//    private EntityManager em;

//    public SpringConfig(EntityManager em) {
//        this.em = em;
//    }

    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

//    // @ComponentSacn 으로 대체 가능 하나 직접 빈에 등록하면 개발자가 보고 AOP가 쓰였구나 판단하기 좋음
//    @Bean
//    public TimeTraceAop timeTraceAop() {
//        return new TimeTraceAop();
//    }


//    @Bean
//    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository(dataSource);
//        return new JdbcMemberRepository(dataSource);
//        return new JdbcTemplateMemberRepository(dataSource);
//        return new JpaMemberRepository(em);
//    }
//
}

















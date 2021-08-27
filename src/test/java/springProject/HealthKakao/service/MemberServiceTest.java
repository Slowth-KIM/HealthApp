package springProject.HealthKakao.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;;
import org.springframework.transaction.annotation.Transactional;
import springProject.HealthKakao.domain.member.MemberRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class MemberServiceTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    @Transactional
    @Rollback(value = false)
    public void 회원가입() throws Exception{
        //given

        //when

        //then
    }
}

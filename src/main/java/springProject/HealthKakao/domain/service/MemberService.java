package springProject.HealthKakao.domain.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springProject.HealthKakao.domain.member.Member;
import springProject.HealthKakao.domain.member.MemberRepository;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public Long join(Member member){
        System.out.println("MemberService.join");
        memberRepository.save(member);
        return member.getId();
    }

}

package springProject.HealthKakao.domain.login;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import springProject.HealthKakao.domain.member.Member;
import springProject.HealthKakao.domain.member.MemberRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final MemberRepository memberRepository;

    /**
     * @return null 로그인 실패
     */
    public Member login(String loginId, String password){
//        Optional<Member> findMemberOptional = memberRepository.findByLoginId(loginId);
//        Member member = findMemberOptional.get();
//        if (member.getPassword().equals(password)){
//            return  member
//        } else{
//            return null;
//        }

        return memberRepository.findByLoginId(loginId).filter(m -> m.getPassword().equals(password))
                .orElse(null);
    }
}

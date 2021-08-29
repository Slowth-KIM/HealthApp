package springProject.HealthKakao;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import springProject.HealthKakao.domain.weight.Item;
import springProject.HealthKakao.repository.WeightRepository;
import springProject.HealthKakao.repository.MemberRepository;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class TestDataInit {

    private final WeightRepository itemRepository;
    private final MemberRepository memberRepository;


    /**
     * 테스트용 데이터 추가
     **/
    @PostConstruct
    public void init() {
        itemRepository.save(new Item("itemA", 10000, 10));
        itemRepository.save(new Item("itemB", 20000, 20));


        /**
        Member member = Member.builder()
                .loginId("test")
                .password("test!")
                .name("테스터")
                .gender(Gender.FEMALE)
                .build();

        memberRepository.save(member);**/
    }


}
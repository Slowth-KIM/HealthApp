package springProject.HealthKakao;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import springProject.HealthKakao.domain.item.Item;
import springProject.HealthKakao.domain.item.ItemRepository;
import springProject.HealthKakao.domain.member.Gender;
import springProject.HealthKakao.domain.member.Member;
import springProject.HealthKakao.domain.member.MemberRepository;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class TestDataInit {

    private final ItemRepository itemRepository;
    private final MemberRepository memberRepository;


    /**
     * 테스트용 데이터 추가
     **/
    @PostConstruct
    public void init() {
        itemRepository.save(new Item("itemA", 10000, 10));
        itemRepository.save(new Item("itemB", 20000, 20));


        Member member = Member.builder()
                .loginId("test")
                .password("test!")
                .name("테스터")
                .gender(Gender.FEMALE)
                .build();

        memberRepository.save(member);
    }


}
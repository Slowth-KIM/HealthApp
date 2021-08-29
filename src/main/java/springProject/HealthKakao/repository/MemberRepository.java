package springProject.HealthKakao.repository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import springProject.HealthKakao.domain.member.Member;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Slf4j
@Repository
@RequiredArgsConstructor
public class MemberRepository {

    @PersistenceContext
    private final EntityManager em;

    /**
     * 동시성 문제가 고려되어 있지 않음, 실무에서는 ConcurrentHashMap, AtomicLong 사용 고려
     */
    private static ConcurrentHashMap<Long, Member> store = new ConcurrentHashMap<>();
    private static AtomicLong sequence = new AtomicLong();


    @Transactional
    public Member save(Member member){
        //member.setId(sequence.incrementAndGet());
        log.info("save : member = {}", member);


        em.persist(member);
        store.put(member.getId(), member);
        return  member;
    }

    public Member findById(Long id){
        return store.get(id);
    }

    public Optional<Member> findByLoginId(String loginId){
//        List<Member> all = findAll();
//        for (Member m : all) {
//            if(m.getLoginId().equals(loginId)){
//                return Optional.of(m);
//            }
//        }
//        return Optional.empty();


        return findAll().stream()
                .filter(m -> m.getLoginId().equals(loginId))
                .findFirst();
    }

    public List<Member> findAll(){
        return new ArrayList<>(store.values());
    }

}

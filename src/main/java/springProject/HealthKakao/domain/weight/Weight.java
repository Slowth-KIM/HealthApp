package springProject.HealthKakao.domain.weight;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import springProject.HealthKakao.domain.member.Member;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Builder
@AllArgsConstructor
public class Weight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;
    /**
     * 외래키가 string으로 설정이 안 되는 바람에 일시적으로 멤버 테이블에 있는 PK를 몸무게 테이블의 FK로 지정
     */

    private LocalDate recordedDate;

    private Long weight;
}
//INSERT INTO WEIGHT VALUES (1, '2021-08-15', 60, 2 );
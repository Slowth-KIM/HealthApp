package springProject.HealthKakao.domain.pills;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import springProject.HealthKakao.domain.member.Member;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Builder
@AllArgsConstructor
public class Pills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pill_id")
    private Long id;

    @Column(name = "pill_name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_login_id", referencedColumnName = "member_login_id")
    private Member member;

    @NotNull(message = "약을 먹어야 할 시간을 선택해주세요")
    @Enumerated(EnumType.STRING)
    private TakeTimeStatus takeTime;

    @NotNull(message = "약을 복용여부를 선택해주세요")
    @Enumerated(EnumType.STRING)
    private TakeStatus takeStatus;

}
//INSERT INTO WEIGHT VALUES (1, '2021-08-15', 60, 2 );
package springProject.HealthKakao.domain.bloodSugarLevel;

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
public class BloodSugarLevel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_login_id", referencedColumnName = "member_login_id")
    private Member member;

    private LocalDate recordedDate;

    @Column(name = "blood_sugar_level")
    private Long bloodSugarlevel;
}
//INSERT INTO WEIGHT VALUES (1, '2021-08-15', 60, 2 );
package springProject.HealthKakao.domain.member;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Builder
@AllArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    @NotEmpty
    @Column(unique = true, name = "member_login_id")
    private String loginId; //로그인 시 ID

    @NotEmpty
    private String name;
    @NotEmpty
    private String password;

    @NotNull(message = "성별을 선택해주세요")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    /**
    @JsonIgnore
    @OneToMany(mappedBy = "member")
    private List<Weight> weights = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "member")
    private List<BloodSugarLevel> bloodSugarLevels = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "member")
    private List<Pill> pills = new ArrayList<>();
    **/

    /**
    public void setId(Long id) {
        this.id = id;
    }**/
}

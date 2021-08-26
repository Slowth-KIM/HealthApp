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
    private Long id;

    @NotEmpty
    @Column(unique = true)
    private String loginId; //로그인 시 ID

    @NotEmpty
    private String name;
    @NotEmpty
    private String password;

    @NotNull(message = "성별을 입력해주세요")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    public void setId(Long id) {
        this.id = id;
    }
}

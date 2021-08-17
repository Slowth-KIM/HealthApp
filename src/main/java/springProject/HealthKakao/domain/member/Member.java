package springProject.HealthKakao.domain.member;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

@Getter @Setter
public class Member {

    @Id
    private Long id;

    @NotEmpty
    private String loginId; //로그인 시 ID
    @NotEmpty
    private String name;
    @NotEmpty
    private String password;

    @NotEmpty
    private Gender gender;

    @Builder
    public Member(Long id, @NotEmpty String loginId, @NotEmpty String name, @NotEmpty String password, @NotEmpty Gender gender) {
        this.id = id;
        this.loginId = loginId;
        this.name = name;
        this.password = password;
        this.gender = gender;
    }
}
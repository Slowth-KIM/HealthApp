package springProject.HealthKakao.web.login;

import lombok.Data;
import springProject.HealthKakao.domain.member.Gender;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;

@Data
public class LoginForm {

    @NotEmpty
    private  String loginId;

    @NotEmpty
    private  String password;

    @NotEmpty
    private String name;

    @NotEmpty
    @Enumerated(EnumType.STRING)
    private Gender gender;
}

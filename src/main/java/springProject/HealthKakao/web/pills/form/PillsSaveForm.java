package springProject.HealthKakao.web.pills.form;

import lombok.Data;
import springProject.HealthKakao.domain.member.Member;
import springProject.HealthKakao.domain.pills.TakeTimeStatus;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class PillsSaveForm {


    @NotBlank
    private String pillName;

    @NotNull
    @Enumerated(EnumType.STRING)
    private TakeTimeStatus takeTimeStatus;

}
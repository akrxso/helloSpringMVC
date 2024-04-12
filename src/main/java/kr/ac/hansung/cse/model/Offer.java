package kr.ac.hansung.cse.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
@NoArgsConstructor //인자가 없는 생성자도 자동으로 만들어줌
public class Offer {
    private int id;
    //제약조건
    @Size(min=2,max=100, message = "두글자 이상 백글자 이하")
    private String name;

    @Email(message = "email형식에 맞게 입력하세요")
    @NotEmpty(message = "이메일을 꼭 입력해주세요")
    private  String email;

    @Size(min=5, max = 100,message = "다섯글자 이상 백글자 이하")
    private String text;
}

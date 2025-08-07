package kr.co.wikibook.greengram.application.User.model;

import kr.co.wikibook.greengram.application.User.UserService;
import kr.co.wikibook.greengram.config.model.JwtUser;
import kr.co.wikibook.greengram.entity.User;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserSignInDto {
    private UserSignInRes userSignInRes; //응답용
    private JwtUser jwtUser; //JWT 발행 때 사용
}

package kr.co.wikibook.greengram.application.User;

import jakarta.validation.Valid;
import kr.co.wikibook.greengram.application.User.model.UserSignUpReq;
import kr.co.wikibook.greengram.config.model.ResultResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/sign-up")
    public ResultResponse<?> signUp(@Valid @RequestPart UserSignUpReq req,
                                    @RequestPart(required = false)MultipartFile pic){
        log.info("req: {}", req);
        log.info("pic: {}", pic != null ? pic.getOriginalFilename() : pic);
        return new ResultResponse<Integer>("",1);
    }
}

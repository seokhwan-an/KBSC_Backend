package com.hanwul.kbscbackend.domain.account;



import lombok.*;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.validation.constraints.NotBlank;

@Getter
@NoArgsConstructor
@Data
public class SignUpDto {
    @NotBlank
    private String username;
    @NotBlank
    private String password;
    @NotBlank
    private String nickname;

    @Builder
    public SignUpDto(String username, String password, String nickname){
        this.username = username;
        this.password = password;
        this.nickname = nickname;
    }
}

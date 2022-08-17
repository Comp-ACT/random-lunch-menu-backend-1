package com.TeamSk.JMC.Web;

import com.TeamSk.JMC.Service.Login.LoginService;
import com.TeamSk.JMC.Web.Dto.UserDto;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoginController {

    private final LoginService loginService;

    @PostMapping("/login")
    public String login(@RequestBody UserDto userDto)
    {
        if(loginService.login(userDto))
        {
            return "redirect:/";
        }
        return "login";
    }
}
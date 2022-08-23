package com.TeamSk.JMC.Service.Login;


import com.TeamSk.JMC.Domain.Member.Member;
import com.TeamSk.JMC.Web.Dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Optional;
import com.TeamSk.JMC.Domain.Member.MemberRepository;

@RequiredArgsConstructor
@Service
public class LoginService {

    private final MemberRepository memberRepository;

    public boolean login(Member member)
    {


        memberRepository.save(member);


        return true;
    }
}

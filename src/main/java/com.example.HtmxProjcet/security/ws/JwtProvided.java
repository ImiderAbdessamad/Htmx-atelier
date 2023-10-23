package com.example.HtmxProjcet.security.ws;


import com.example.HtmxProjcet.security.bean.JwtRequest;
import com.example.HtmxProjcet.security.bean.JwtResponse;
import com.example.HtmxProjcet.security.service.impl.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @CrossOrigin
    public class JwtProvided {

        @Autowired
        private JwtService jwtService;

        @PostMapping({"/authenticate"})
        public JwtResponse createJwtToken(@RequestBody JwtRequest jwtRequest) throws Exception {
            return jwtService.createJwtToken(jwtRequest);
        }

}
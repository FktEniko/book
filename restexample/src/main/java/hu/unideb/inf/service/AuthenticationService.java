package hu.unideb.inf.service;


import hu.unideb.inf.dao.request.SignUpRequest;
import hu.unideb.inf.dao.request.SigninRequest;
import hu.unideb.inf.dao.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}

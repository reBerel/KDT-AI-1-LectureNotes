package com.example.demo.lectureClass.authentication.github.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GithubOauthAccessTokenResponse {
    @JsonProperty("access_token")
    private String accessToken;
}

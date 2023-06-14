package com.example.demo.lectureClass.authentication.github.service.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class GithubOauthAccountInfoResponse {
    @JsonProperty("id")
    private String id;

    @JsonProperty("login")
    private String name;

    @Setter
    @JsonProperty("email")
    private String email;

    @JsonProperty("avatar_url")
    private String avatarUrl;

    @JsonProperty("html_url")
    private String githubRepository;

    @JsonProperty("public_repos")
    private Long publicRepositoryNumber;
}

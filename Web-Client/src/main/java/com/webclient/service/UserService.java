package com.webclient.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.webclient.model.UserResponse;

@Service
public class UserService {
    private final WebClient webClient;

    public UserService(WebClient webClient) {
        this.webClient = webClient;
    }

    public UserResponse fetchUsers() {
        String url = "https://reqres.in/api/users";
        return webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(UserResponse.class) // Asynchronously fetch and map to UserResponse
                .block(); // Block to get the response synchronously.
    }
}

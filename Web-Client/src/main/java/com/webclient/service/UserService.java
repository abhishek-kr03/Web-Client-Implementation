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

        // Fetch data from API
        UserResponse response = webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(UserResponse.class)
                .block();

        // Print the user data to console
        if (response != null && response.getData() != null) {
            response.getData().forEach(user -> System.out.println(user));
        } else {
            System.out.println("No user data found.");
        }

        return response;
    }
}

/*  Let’s break this down step by step:

	1. webClient.get(): Tells WebClient to make a GET request.
	2. uri(url): Specifies the URL of the API.
	3. retrieve(): Sends the HTTP request and waits for the API’s response.
	4. bodyToMono(UserResponse.class): Converts the JSON response from the API into a Java object of type UserResponse. (Think of Mono as a container for the response that will arrive later.)
	5. block(): Waits for the API response to arrive synchronously (blocks the thread until data is received). This is useful if you want to use the result immediately.
*/
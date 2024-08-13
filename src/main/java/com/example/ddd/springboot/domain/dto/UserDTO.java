package com.example.ddd.springboot.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class UserDTO {
    private String message;
    private List<UserData> data;

    public UserDTO(String message, List<UserData> data) {
        this.message = message;
        this.data = data;
    }

    // Inner class to represent user data
    @Setter
    @Getter
    public static class UserData {
        private String id;
        private String username;
        private String email;

        public UserData(String id, String username, String email) {
            this.id = id;
            this.username = username;
            this.email = email;
        }

    }
}

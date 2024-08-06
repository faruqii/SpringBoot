package com.example.ddd.springboot.domain.dto;

public class UserDTO {
    private String message;
    private String id;
    private String username;
    private String email;

    public UserDTO(String message, String id, String username, String email) {
        this.message = message;
        this.id = id;
        this.username = username;
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

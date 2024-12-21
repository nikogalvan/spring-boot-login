package com.example.demo.model;


public class RegistrationDTO {

    private String username;
    private String password;

    public RegistrationDTO() {
        super();
    }

    public RegistrationDTO(String password, String username) {
        super();
        this.password = password;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "RegistrationDTO{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

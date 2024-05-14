package com.LYFT.authservice.DTO;

public class SignInDto {

    private String name;
    private String email;

    private String image;

    public SignInDto(String name, String emai, String image) {
        this.name = name;
        this.email = emai;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

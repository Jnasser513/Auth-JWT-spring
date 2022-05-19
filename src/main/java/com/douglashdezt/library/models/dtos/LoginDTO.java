package com.douglashdezt.library.models.dtos;

public class LoginDTO {
    private String identifer;
    private String password;

    public LoginDTO(String identifer, String password) {
        super();
        this.identifer = identifer;
        this.password = password;
    }

    public String getIdentifer() {
        return identifer;
    }

    public void setIdentifer(String identifer) {
        this.identifer = identifer;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
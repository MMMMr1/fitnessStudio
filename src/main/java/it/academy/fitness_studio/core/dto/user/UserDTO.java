package it.academy.fitness_studio.core.dto.user;


import it.academy.fitness_studio.core.UserRole;
import it.academy.fitness_studio.core.UserStatus;

public class UserDTO {
    private String mail;
    private String fio;
    private UserRole role;
    private UserStatus status;
    private String password;

    public UserDTO(String mail,
                   String fio,
                   UserRole role,
                   UserStatus status,
                   String password) {
        this.mail = mail;
        this.fio = fio;
        this.role = role;
        this.status = status;
        this.password = password;
    }

    public UserDTO(String mail, String fio, String password) {
        this.mail = mail;
        this.fio = fio;
        this.password = password;
        this.role = UserRole.USER;
        this.status = UserStatus.WAITING_ACTIVATION;
    }

    public UserDTO() {
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
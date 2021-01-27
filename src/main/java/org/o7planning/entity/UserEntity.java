package org.o7planning.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity{

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    public UserEntity(String email, String password) {
        super();
        this.email = email;
        this.password = password;
    }

    public UserEntity() {
        super();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

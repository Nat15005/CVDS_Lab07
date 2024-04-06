package co.edu.escuelaing.cvds.lab7.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Collection;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Table(name = "user")
public class User {

//    public User(String email, String password, List<UserRole> userRoles) {
//        this.email = email;
//        this.password = password;
//        this.userRoles = userRoles;
//    }

    @Id
    @Column(name = "email", nullable=false, unique=true)
    private String email;

    @Column(name = "password", nullable=false)
    private String password;

    @Column(name = "roles", nullable=false)
    private List<UserRole> userRoles;


    public Object getPassword() {
        return password;
    }

    public List<UserRole> getUserRoles() {
        return userRoles;
    }
}
package co.edu.escuelaing.cvds.lab7.model;

import jakarta.persistence.*;
import lombok.*;
import org.apache.catalina.mbeans.DataSourceUserDatabaseMBean;

import java.time.Instant;
import java.time.temporal.Temporal;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Table(name = "session")
public class Session {
    @Id
    @Column(name = "token", nullable=false, unique=true)
    private UUID token;

    @Column(name = "timestamp", nullable = false)
    private Instant timestamp;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

//    public Session(UUID uuid, Instant now, User user) {
//        this.token = uuid;
//        this.timestamp = now;
//        this.user = user;
//    }

    public UUID getToken() {
        return token;
    }

    public Instant getTimestamp() {
        return timestamp;
    }


    public User getUser() {
        return user;
    }
}
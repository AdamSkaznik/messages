package pl.gov.policja.ka.messages.model;

import jdk.jfr.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "messages")
public class Messages {

    @Id
    @GeneratedValue
    private int Id;
    @Timestamp
    private Date dateCreated;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date dateStart;
    private Date timeStart;
    private Date dateEnd;
    private Date timeEnd;
    private String title;
    private String description;
    private boolean active;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userCreated;
    @ManyToOne
    @JoinColumn(name = "type_id")
    private Type type;
    @ManyToOne
    @JoinColumn(name = "reception_id")
    private Reception reception;

}

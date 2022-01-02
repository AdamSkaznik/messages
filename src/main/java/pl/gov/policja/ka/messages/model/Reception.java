package pl.gov.policja.ka.messages.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "messages_reception")
public class Reception {
    @Id
    @GeneratedValue
    private int Id;
    private String description;
    @ManyToOne
    @JoinColumn(name = "organization_id")
    private Organization organization;
}

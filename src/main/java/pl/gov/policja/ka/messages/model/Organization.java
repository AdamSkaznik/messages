package pl.gov.policja.ka.messages.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "messages_organization")
public class Organization {

    @Id
    @GeneratedValue
    private int Id;
    private String  shortName;
    private String fullName;
    // kod jednostki
    private String kod1;
    // kod komórki
    private String kod2;
}

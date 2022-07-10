package au.com.jc.data.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "social")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Social {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name = "fk_person_social", referencedColumnName = "id")
    @JsonIgnore
    private Person person_social;

    private String name;

    private String social_value;


}

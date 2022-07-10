package au.com.jc.data.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "cicd")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cicd {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name="fk_skill_cicd", referencedColumnName = "id")
    @JsonIgnore
    private Skill skill_cicd;

    private String name;
}

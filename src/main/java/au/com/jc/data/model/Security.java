package au.com.jc.data.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "security")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Security {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name="fk_skill_security", referencedColumnName = "id")
    @JsonIgnore
    private Skill skill_security;

    private String name;
}

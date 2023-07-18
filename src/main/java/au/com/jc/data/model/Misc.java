package au.com.jc.data.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "misc")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Misc {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name="fk_person_misc", referencedColumnName = "id")
    @JsonIgnore
    private Person person_misc;

    @OneToMany(mappedBy = "misc_hobby", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Hobby> hobbies;

    @OneToMany(mappedBy = "misc_learn", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Learn> learn;

    @OneToOne(mappedBy = "misc_uh", fetch = FetchType.LAZY)
    private Uh uh;
}

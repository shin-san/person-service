package au.com.jc.data.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "hobby")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Hobby {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name="fk_misc_hobby", referencedColumnName = "id")
    @JsonIgnore
    private Misc misc_hobby;

    private String name;
}

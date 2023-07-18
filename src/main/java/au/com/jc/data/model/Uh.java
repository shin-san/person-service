package au.com.jc.data.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Table(name = "uh")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Uh {

    @Id
    @GeneratedValue
    private long id;

    @OneToOne
    @JoinColumn(name = "fk_misc_uh", referencedColumnName = "id")
    @JsonIgnore
    private Misc misc_uh;

    private String message;
}

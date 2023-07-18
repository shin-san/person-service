package au.com.jc.data.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Table(name = "learn")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Learn {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name="fk_misc_learn", referencedColumnName = "id")
    @JsonIgnore
    private Misc misc_learn;

    private String message;
}

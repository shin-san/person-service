package au.com.jc.data.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Table(name = "messaging_platform")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MessagingPlatform {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name="fk_skill_messaging_platform", referencedColumnName = "id")
    @JsonIgnore
    private Skill skill_messaging_platform;

    private String name;
}

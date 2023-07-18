package au.com.jc.data.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "skill")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Skill {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name="fk_person_skill", referencedColumnName = "id")
    @JsonIgnore
    private Person person_skill;

    @OneToMany(mappedBy = "skill_language",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Language> languages;

    @OneToMany(mappedBy = "skill_framework", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Framework> framework;

    @OneToMany(mappedBy = "skill_cicd", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Cicd> cicd;

    @OneToMany(mappedBy = "skill_container", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Container> container;

    @OneToMany(mappedBy = "skill_monitoring", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Monitoring> monitoring;

    @OneToMany(mappedBy = "skill_messaging_platform", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<MessagingPlatform> messaging_platform;

    @OneToMany(mappedBy = "skill_security", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Security> security;
}

package au.com.jc.data.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "person")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "person_social", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Social> socials = new ArrayList<>();

    @OneToMany(mappedBy = "person_skill", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Skill> skills = new ArrayList<>();

    @OneToMany(mappedBy = "person_misc", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Misc> misc;
}


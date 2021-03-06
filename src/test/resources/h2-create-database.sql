    drop table if exists person;
    drop table if exists social;
    drop table if exists skill;
    drop table if exists language;
    drop table if exists framework;
    drop table if exists cicd;
    drop table if exists container;
    drop table if exists monitoring;
    drop table if exists messaging_platform;
    drop table if exists security;
    drop table if exists misc;
    drop table if exists hobby;
    drop table if exists learn;
    drop table if exists uh;
    create table person (
        id bigint generated by default as identity,
        name TEXT,
        PRIMARY KEY(id)
    );
    create table misc (
        id bigint generated by default as identity,
        person_id INT,
        PRIMARY KEY(id),
        CONSTRAINT fk_person_misc
          FOREIGN KEY(person_id)
        	  REFERENCES person(id)
    );
    create table skill (
        id bigint generated by default as identity,
        person_id INT,
        PRIMARY KEY(id),
        CONSTRAINT fk_person_skill
          FOREIGN KEY(person_id)
            REFERENCES person(id)
    );
    create table social (
        id bigint generated by default as identity,
        name text,
        url text,
        social_value text,
        person_id INT,
        PRIMARY KEY(id),
        CONSTRAINT fk_person_social
          FOREIGN KEY(person_id)
              REFERENCES person(id)
    );
    create table hobby (
        id bigint generated by default as identity,
        name TEXT,
        misc_id INT,
        PRIMARY KEY(id),
        CONSTRAINT fk_misc_hobby
          FOREIGN KEY(misc_id)
              REFERENCES misc(id)
    );
    create table learn (
        id bigint generated by default as identity,
        message TEXT,
        misc_id INT,
        PRIMARY KEY(id),
        CONSTRAINT fk_misc_learn
          FOREIGN KEY(misc_id)
              REFERENCES misc(id)
    );
    create table uh (
        id bigint generated by default as identity,
        message TEXT,
        misc_id INT,
        PRIMARY KEY(id),
        CONSTRAINT fk_misc_uh
          FOREIGN KEY(misc_id)
              REFERENCES misc(id)
    );
    create table cicd (
        id bigint generated by default as identity,
        name TEXT,
        skill_id INT,
        PRIMARY KEY(id),
        CONSTRAINT fk_skill_cicd
          FOREIGN KEY(skill_id)
              REFERENCES skill(id)
    );
    create table container (
        id bigint generated by default as identity,
        name TEXT,
        skill_id INT,
        PRIMARY KEY(id),
        CONSTRAINT fk_skill_container
          FOREIGN KEY(skill_id)
              REFERENCES skill(id)
    );
    create table framework (
        id bigint generated by default as identity,
        name TEXT,
        skill_id INT,
        PRIMARY KEY(id),
        CONSTRAINT fk_skill_framework
          FOREIGN KEY(skill_id)
              REFERENCES skill(id)
    );
    create table language (
        id bigint generated by default as identity,
        name TEXT,
        skill_id INT,
        PRIMARY KEY(id),
        CONSTRAINT fk_skill_language
          FOREIGN KEY(skill_id)
              REFERENCES skill(id)
    );
    create table messaging_platform (
        id bigint generated by default as identity,
        name TEXT,
        skill_id INT,
        PRIMARY KEY(id),
        CONSTRAINT fk_skill_messaging_platform
          FOREIGN KEY(skill_id)
              REFERENCES skill(id)
    );
    create table monitoring (
        id bigint generated by default as identity,
        name TEXT,
        skill_id INT,
        PRIMARY KEY(id),
        CONSTRAINT fk_skill_monitoring
          FOREIGN KEY(skill_id)
              REFERENCES skill(id)
    );
    create table security (
        id bigint generated by default as identity,
        name TEXT,
        skill_id INT,
        PRIMARY KEY(id),
        CONSTRAINT fk_skill_security
          FOREIGN KEY(skill_id)
              REFERENCES skill(id)
    );
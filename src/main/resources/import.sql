

insert into public.person(id,name) values (1,'JC');

insert into public.social(id,fk_person_social,name,social_value) values (1, 1, 'github', 'shin-san');
insert into public.social(id,fk_person_social,name,social_value) values (2, 1, 'linkedin', 'naythanc');
insert into public.social(id,fk_person_social,name,social_value) values (3, 1, 'contact', 'nchan009@gmail.com');

insert into public.skill(id,fk_person_skill) values (1, 1);

insert into public.language(id,fk_skill_language,name) values (1, 1, 'java');
insert into public.language(id,fk_skill_language,name) values (2, 1, 'groovy');
insert into public.language(id,fk_skill_language,name) values (3, 1, 'rust');
insert into public.language(id,fk_skill_language,name) values (4, 1, 'bash');

insert into public.framework(id,fk_skill_framework,name) values (1, 1, 'spring-boot');
insert into public.framework(id,fk_skill_framework,name) values (2, 1, 'apache-camel');
insert into public.framework(id,fk_skill_framework,name) values (3, 1, 'quarkus');

insert into public.cicd(id,fk_skill_cicd,name) values (1, 1, 'jenkins');
insert into public.cicd(id,fk_skill_cicd,name) values (2, 1, 'github-actions');

insert into public.container(id,fk_skill_container,name) values (1, 1, 'docker');
insert into public.container(id,fk_skill_container,name) values (2, 1, 'kubernetes');
insert into public.container(id,fk_skill_container,name) values (3, 1, 'openshift');

insert into public.monitoring(id,fk_skill_monitoring,name) values (1, 1, 'prometheus');
insert into public.monitoring(id,fk_skill_monitoring,name) values (2, 1, 'grafana');
insert into public.monitoring(id,fk_skill_monitoring,name) values (3, 1, 'splunk');

insert into public.messaging_platform(id,fk_skill_messaging_platform,name) values (1, 1, 'activemq');
insert into public.messaging_platform(id,fk_skill_messaging_platform,name) values (2, 1, 'ibm mq');

insert into public.security(id,fk_skill_security,name) values (1, 1, 'oauth');

insert into public.misc(id,fk_person_misc) values (1, 1);

insert into public.hobby(id,fk_misc_hobby,name) values (1, 1, 'k3s');
insert into public.hobby(id,fk_misc_hobby,name) values (2, 1, 'raspi4');
insert into public.hobby(id,fk_misc_hobby,name) values (3, 1, '💤');
insert into public.hobby(id,fk_misc_hobby,name) values (4, 1, '🏃‍♂️');
insert into public.hobby(id,fk_misc_hobby,name) values (5, 1, '📖');

insert into public.learn(id,fk_misc_learn,message) values (1, 1, 'go');
insert into public.learn(id,fk_misc_learn,message) values (2, 1, 'rust');
insert into public.learn(id,fk_misc_learn,message) values (3, 1, 'react');

insert into public.uh(id,fk_misc_uh,message) values (1, 1, 'dunno what else to add');






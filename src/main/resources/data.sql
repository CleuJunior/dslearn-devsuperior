INSERT INTO tb_user (name, email, password) VALUES ('Alex', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('BOB', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Maria', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_STUDENT');
INSERT INTO tb_role (authority) VALUES ('ROLE_INSTRUCTOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');


INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 3);


INSERT INTO tb_course (name, img_Uri, img_Gray_Uri) VALUES ('DevSuperior', 'https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.indiatoday.in%2Feducation-today%2Ffeaturephilia%2Fstory%2Ftips-to-judge-the-quality-of-any-online-course-1399851-2018-11-30&psig=AOvVaw1axg3kCEzeZNlAo1GWY3ed&ust=1631771540948000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCIj88OqkgPMCFQAAAAAdAAAAABAD', 'https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.jtinetwork.com%2Fhp-offers-more-than-20-free-courses-with-certificate%2F&psig=AOvVaw1axg3kCEzeZNlAo1GWY3ed&ust=1631771540948000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCIj88OqkgPMCFQAAAAAdAAAAABAJ');





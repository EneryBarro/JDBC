CREATE SCHEMA IF NOT EXIT test;
USE test;

DROP TABLE IF EXISTS student;
CREATE TABLE student (id BIGINT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(80), surname VARCHAR(80), course_name VARCHAR(100));

INSERT INTO students(name, surname, course_name) VALUES ('Alex', 'Marshal', 'Java');
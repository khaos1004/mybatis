DROP TABLE IF EXISTS todo;

CREATE TABLE todo
(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    content VARCHAR(255) not null,
    isCompleted VARCHAR(255) not null
);

DROP TABLE IF EXISTS user;

CREATE TABLE user
(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    password VARCHAR(255) not null,
);
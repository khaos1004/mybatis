DROP TABLE IF EXISTS todo;

CREATE TABLE todo
(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    content VARCHAR(255) not null,
    isCompleted VARCHAR(255) not null
);
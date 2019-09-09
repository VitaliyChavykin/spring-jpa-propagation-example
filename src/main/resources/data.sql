DROP TABLE IF EXISTS Person;
DROP TABLE IF EXISTS Book;

CREATE TABLE Person (
  id BIGINT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  age INT NOT NULL
);

CREATE TABLE Book (
  id BIGINT AUTO_INCREMENT  PRIMARY KEY,
  title VARCHAR(250) NOT NULL,
  pages INT NOT NULL
);

INSERT INTO Person (name, age) VALUES
    ('John', 23),
    ('David', 45),
    ('Matt', 67);

INSERT INTO Book (title, pages) VALUES
    ('Do Androids Dream of Electric Sheep?', 264),
    ('The Hitchhikers Guide to the Galaxy', 397),
    ('Pride and Prejudice', 543);
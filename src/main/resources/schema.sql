DROP TABLE IF EXISTS tbl_news;

CREATE TABLE tbl_news
(
    id       INT AUTO_INCREMENT PRIMARY KEY,
    image    VARCHAR(255) NOT NULL,
    title    VARCHAR(255) NOT NULL,
    subtitle VARCHAR(255) NOT NULL,
    content  TEXT         NOT NULL
);
DROP TABLE IF EXISTS phone_book;
CREATE TABLE phone_book (
    id character varying(8) PRIMARY KEY,
    name VARCHAR(30) NOT NULL DEFAULT '',
    phone_no VARCHAR(30) NOT NULL DEFAULT ''
);
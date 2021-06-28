CREATE DATABASE spr1;

USE spr1;

CREATE TABLE tbl_board(
	bno INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    content VARCHAR(2000) NOT NULL,
    writer VARCHAR(50) NOT NULL,
	regdate TIMESTAMP DEFAULT now(),
    updatedate TIMESTAMP DEFAULT now()
);

INSERT


DELETE FROM tbl_borad;

SELECT * FROM tbl_borad;

DROP TABLE tbl_borad;

INSERT INTO tbl_board (title, content, writer)
VALUE ('텍스트 제목', '테스트 내용', ' user00');

SELECT * FROM tbl_board;

-- 연습 
CREATE TABLE tbl_test1 (
	id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    age INT NOT NULL
);

INSERT INTO tbl_test1 (name, age) VALUE ('lee2min', 32);
INSERT INTO tbl_test1 (name, age) VALUE ('choogoo', 32);
INSERT INTO tbl_test1 (name, age) VALUE ('reu', 32);

SELECT * FROM tbl_test1;

-- org.zerock.domain.test1vo
-- org.zerock.mapper.test1mapper (interface)
-- org.zerock.mapper.Test1Mapper.xml (xml)
-- test1tests

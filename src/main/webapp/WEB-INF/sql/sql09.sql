USE spr1;



create table persistent_logins (
    username varchar(64) not null,
    series varchar(64) primary key,
    token varchar(64) not null,
    last_used timestamp not null
);

desc persistent_logins;

SELECT * FROM tbl_board
ORDER BY bno DESC;

DELETE FROM tbl_board WHERE bno=102;

SELECT * FROM tbl_member;
SELECT * FROM tbl_reply;

update tbl_board
SET writer = 'member';

update tbl_reply
SET replyer = 'member';

ALTER TABLE tbl_board
ADD FOREIGN KEY (writer) REFERENCES tbl_member(userid);

ALTER TABLE tbl_reply
ADD FOREIGN KEY (replyer) REFERENCES tbl_member(userid);

use test;
SELECT * FROM My11;

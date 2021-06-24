USE spr1;

SELECT * FROM tbl_board ORDER BY bno DESC LIMIT 5;  

SELECT * FROM tbl_board asc bno LIMIT 5; -- acs 하면 상위 5개 -- 

SELECT * FROM tbl_board ORDER BY bno DESC LIMIT 0, 5; -- 0번 부터 상위 5개 , 끝자리 부터 정렬이니까 맨끝이 0번 --

SELECT * FROM tbl_board ORDER BY bno DESC LIMIT 5 * (n-1),5; -- (n page) --
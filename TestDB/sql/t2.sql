drop database if exists testdb7;
create database testdb7;
use testdb7;

create table test_table8(
user_id int,
user_name varchar(255),
password varchar(255)
);

insert into test_table8 values(1,"taro","123");
insert into test_table8 values(2,"jiro","456");
insert into test_table8 values(3,"hanako","789");
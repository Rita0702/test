set names utf8;
set foreign_key_checks=0;
drop database if exists logindb2_kawakami;
create database logindb2_kawakami;
use logindb2_kawakami;

create table user(
id2 int,
user_name2 varchar(255),
password2 varchar(255)
);

insert into user values
(1,"taro","123"),
(2,"jiro","123"),
(3,"hanako","123"),
(4,"saburo","123");
drop database if exists pbs;
create database pbs;
use pbs;

create table student_table
(
	id int auto_increment primary key,
	name varchar(32) not null,
	telnum varchar(64) default 'UNKNOW',
	sex varchar(16),
	remark varchar(64)
);
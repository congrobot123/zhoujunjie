drop database if exists pbsbase;
create database pbsbase;
use pbsbase;

create table student_table
(
	student_id int auto_increment primary key,
	name varchar(16) not null,
	telnum varchar(64) not null,
	gender varchar(16) default 'UNKNOWN',
	remark varchar(64),
	unique(name),
	unique(telnum)
);
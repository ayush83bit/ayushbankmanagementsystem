create database bankmanagementsystem;

show databases;

use bankmanagementsystem;

create table signup(formno varchar (20),name varchar (20),fathers_name varchar (20), dob varchar (20), gender varchar (20),email varchar (20),marital_status varchar (20),address varchar (20),city varchar (20),pin varchar (20),state varchar (20));

show tables ;

select*from signup;

create table signuptwo3(formno varchar(20) ,religion varchar(20),category varchar(20),income varchar(20),education varchar(20),occupation varchar(20),seniorcitizen varchar(20),existing_account  varchar(20),aadhar varchar(20),aadhar1 varchar(20));


show tables ;
select*from signuptwo3;

ALTER TABLE signuptwo
ADD COLUMN aadhar VARCHAR(15);
create table login(formno varchar (20), cardnumber varchar(25) , pin varchar(10));
create table signupthree(formno varchar (20), accountType varchar (40) , cardnumber varchar(25),pin varchar(10),facility varchar(400));
select*from signupthree;
select*from login;
drop table bank;
create table bank(pin varchar(10),date varchar (50),type varchar(20),amount varchar(20));
select*from bank;
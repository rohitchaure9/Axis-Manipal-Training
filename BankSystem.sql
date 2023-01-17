create database BankSystem;

use BankSystem;

create table bank(
	bank_name varchar(255), 
	bank_address varchar(255), 
    bank_code varchar(20)
);

create table customer(
	customer_id int primary key unique, 
	customer_name varchar(255), 
    customer_email varchar(255), 
	customer_password varchar(255), 
    customer_phno bigint, 
    customer_cardno varchar(255)
);

create table account(
	bank_id varchar(20), 
    customer_id int, 
    account_number bigint not null unique,
    account_balance float,
    account_type varchar(20),
    foreign key(bank_id) references bank(bank_code),
    foreign key(customer_id) references customer(customer_id)
);

create table transaction(
	transaction_id int auto_increment,
    account_id bigint,
    transaction_date date,
    transaction_amount float,
    transaction_type varchar(20),
    current_balance float
);

create table atm(
	amount int,
    transactionid int,
    deposit boolean,
    withdraw boolean,
    checkbalance boolean,
    foreign key(transactionid) references transaction(transaction_id)
);
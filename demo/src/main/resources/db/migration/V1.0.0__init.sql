create table address (
	addressID Bigint primary key auto_increment,
	state varchar(100),
	city varchar(100),
	streetapt varchar(100),
	zipcode int
);


create table comments (
    commentID Bigint primary key auto_increment,	
    userID Bigint,
	storeID Bigint,
	rating int,
	commentwords varchar(100),
	likesdislike int
);

create table items (
	itemID Bigint primary key auto_increment,
	shoesID Bigint,
	storeID Bigint,
	orderID Bigint,
	customerID Bigint,
	quantity int,
	note varchar(100)
);

create table all_orders (
	orderID Bigint primary key auto_increment,
	customerID Bigint,
	storeID Bigint,
	customeraddressID Bigint,
	merchantaddressID Bigint,
	orderprice double,
	paymentmethod varchar(100)
);

create table shoes (
	shoesID Bigint primary key auto_increment,
	brand varchar(50),
	brandseries varchar(50),
	color varchar(20),
	size double,
	price double
	
);

create table all_shoes_type (
	shoestypeID Bigint primary key auto_increment,
	shoesnameID Bigint,
	storeID Bigint,
	crowd Bigint,
	shoesname varchar(100),
	style varchar(100),
	brand varchar(100),
	material varchar(100)
);

create table merchants (
	merchantID Bigint primary key auto_increment,
	username varchar(100),
	storeID Bigint,
	personalemail varchar(50),
	phone varchar(20),
	rating double
);

create table stores (
	storeID Bigint primary key auto_increment,
	storename varchar(50),
	storeemail varchar(50),
	phone varchar(20),
	commentID Bigint,
	rating double
);

create table customers (
	customerID Bigint primary key auto_increment,
	username varchar(100),
	paymentmethod varchar(50),
	email varchar(50),
	phone varchar(20),
	rating double
);

create table User (
	userID int,
	userName varchar(20),
	passward varchar(50)

--  address?
);




    

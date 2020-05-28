create table address (
--    auto_increment is with mysql and H2
--    serial is with Postgres
--    id serial primary key,
    id int primary key auto_increment,
    state varchar(10),
    city varchar(10),
    street_apt varchar(30),
    zipcode int(5)
       
);


create table comments (
	commentID int,
	userID int,
	storeID int,
	rating int,
	commentWords varchar(300),
	reply varchar(300)
);

create table items (
	itemID int,
	quantity int,
	note varchar(300)
--  not sure about Shoes& store
);

create table merchants (
--	storeID int[],
	personal_email varchar(30),
	phone int,
	rating int
);

create table orders (
	orderID int,
--	items ??
	customerID int,
	storeID int,
--  customer_adrs & merchant_adrs
	rating int,
	order_price double,
	payment_method varchar(100)
);

create table shoes (
    productID int primary key auto_increment,
    brand varchar(20),
    brandID varchar(50),
	color varchar(20),
	size double,
	price double
--  shoestype?
);

create table shoestype (
--	ShoesNameID long?

	ShoesName varchar(20),
	
	crowd int,  
-- what is this?

	style varchar(20),
	brand varchar(20),
	material varchar(20)
);

create table shoes_special (
--	productID long?
	extraPrice double,
	description varchar(300)
);

create table stores (
	storeID int,
	store_name varchar(20),
	store_email varchar(50),
	phone int,
	ratring double
--  shoes_on_sale?
);

create table User (
	userID int,
	userName varchar(20),
	passward varchar(50)

--  address?
);




    

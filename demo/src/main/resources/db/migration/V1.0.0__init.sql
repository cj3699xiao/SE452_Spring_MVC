create table address (
--    auto_increment is with mysql and H2
    id int primary key auto_increment,
--    serial is with Postgres
--    id serial primary key,
    state varchar(10),
    city varchar(10),
    street_apt varchar(30),
    zipcode int(5)
       
);


    

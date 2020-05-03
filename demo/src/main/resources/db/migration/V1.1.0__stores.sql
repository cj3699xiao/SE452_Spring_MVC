CREATE TABLE address (
             addressID   identity not null primary key,
             state     varchar(10) not null,
             city     varchar(10) not null,
             street_apt     varchar(10) not null,
             zipcode     INT not null
      );
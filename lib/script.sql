CREATE DATABASE IF NOT EXISTS milkbar;

USE milkbar;
CREATE TABLE employee(
                         emp_Id VARCHAR(45) not null primary key ,
                         name VARCHAR(45) NOT NULL ,
                         email varchar(45) not null ,
                         address varchar(100) not null ,
                         salary decimal(10,2) not null
);

CREATE TABLE user(
                     id int primary key auto_increment,
                     empId varchar(45) not null ,
                     password varchar(1000) not null ,
                     userName varchar(45) ,
                     role varchar(45),
                     foreign key (empId) references employee(emp_Id)
);
drop table user;

CREATE TABLE customer(
                         customerId varchar(45) not null primary key ,
                         customerName varchar(45) ,
                         customerAddress varchar(45),
                         contact varchar(45)
);

CREATE TABLE orders(
                       orderId varchar(45) not null primary key ,
                       orderDate datetime not null ,
                       customerId varchar(45) ,
                       customerName varchar(45),
                       total decimal(10,2),
                       foreign key (customerId) references customer(customerId)

);

drop table orders;

create table orderDetails(
                             orderDetailsId varchar(45)  not null primary key ,
                             orderId varchar(45) not null ,
                             itemCode varchar(45) ,
                             itemName varchar(45),
                             qty  int,
                             unitPrice decimal(10,2),
                             orderDate datetime,
                             foreign key (orderId) references orders(orderId)
);

create table items(
                      itemCode varchar(45) not null primary key ,
                      itemName varchar(45),
                      qtyOnHand int,
                      unitPrice decimal(45)
);

create table customerPayment(
                                customerPayId varchar(45) not null primary key ,
                                customerId varchar(45) not null ,
                                orderId varchar(45) not null ,
                                customerName varchar(45),
                                date datetime,
                                time time,
                                payTotal decimal(10,2),
                                foreign key (orderId) references orders(orderId)
);
drop table customerpayment;

create table supplier(
                         supplierId varchar(45) not null primary key ,
                         supplierName varchar(45) ,
                         email varchar(45),
                         company varchar(45),
                         contact varchar(45)
);

create table supplierPayment(
                                supplierPayId varchar(45) not null primary key ,
                                supplierId varchar(45) not null ,
                                supplierName varchar(45),
                                date datetime,
                                time time
);
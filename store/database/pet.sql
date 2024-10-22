DROP TABLE if exists daycare;
DROP TABLE if exists walking;
DROP TABLE if exists overnight_boarding;
DROP TABLE if exists grooming;
DROP TABLE if exists pet;
DROP TABLE if exists pet_parent;
DROP TABLE if exists employee;

create table employee (
employee_id serial primary key,
first_name varchar (20) NOT NULL,
last_name varchar(20) NOT NULL,
phone_number varchar (10) NOT NULL,
position varchar DEFAULT 'Training'
);

create table pet_parent(
pet_parent_id serial primary key,
first_name varchar (20) NOT NULL,
last_name varchar (20) NOT NULL,
address varchar,
phone_number varchar (10) NOT NULL,
email varchar,
reminder_email boolean
);

create table pet(
pet_id serial primary key,
name varchar (20) NOT NULL,
breed varchar NOT NULL,
birthday date DEFAULT CURRENT_DATE,
information varchar,
parent_id int,
CONSTRAINT FK_pet_pet_parent foreign key(parent_id) REFERENCES pet_parent(pet_parent_id)
);

create table grooming(
grooming_id serial primary key,
date date NOT NULL CHECK (date > CURRENT_DATE),
time time NOT NULL CHECK (time between '10:00:00' and '18:00:00') ,
additional_product varchar (100),
pet_id int,
employee_id int,
CONSTRAINT FK_grooming_pet foreign key(pet_id) REFERENCES pet(pet_id),
CONSTRAINT FK_grooming_employee foreign key(employee_id) REFERENCES employee(employee_id)
);

create table overnight_boarding(
overnight_boarding_id serial primary key,
checkin_date date NOT NULL CHECK (checkin_date > CURRENT_DATE),
checkin_time time NOT NULL CHECK (checkin_time between '07:00:00' and '19:00:00'),
checkout_date date NOT NULL,
checkout_time time NOT NULL CHECK (checkout_time between '07:00:00' and '19:00:00'),
additional_information varchar (100),
pet_id int,
CHECK (checkout_date > checkin_date),
CONSTRAINT FK_overnight_boarding_pet foreign key(pet_id) REFERENCES pet(pet_id)
);

create table walking(
walking_id serial primary key,
date date NOT NULL CHECK (date >= CURRENT_DATE),
time time NOT NULL CHECK (time between '07:00:00' and '21:00:00'),
duration int NOT NULL CHECK (duration between 30 and 60),
instruction varchar (100),
pet_id int,
employee_id int,
CONSTRAINT FK_walking_pet foreign key(pet_id) REFERENCES pet(pet_id),
CONSTRAINT FK_walking_employee foreign key(employee_id) REFERENCES employee(employee_id)
);

create table daycare(
daycare_id serial primary key,
dropoff_time time NOT NULL CHECK(dropoff_time between '07:00:00' and '12:00:00'),
pickup_time time NOT NULL CHECK(pickup_time between '09:00:00' and '19:00:00'),
pet_id int,
full_day_visit boolean,
special_instruction varchar(100),
CONSTRAINT FK_daycare_pet foreign key(pet_id) REFERENCES pet(pet_id)
);

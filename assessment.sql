//Q1
create table students(
id serial primary key,
name varchar(20),
email varchar(50),
age integer,
marks integer
)

select * from students;

insert into students (name,email,age,marks) values
('Alice','alice@gmail.com',25,80),
('Bob','bob@gmail.com',17,90),
('Charlie','charlie@gmail.com',22,83.00),
('David','david@gmail.com',21,96),
('Eve','eve@gmail.com',22,70);

//Q2
select * from students where(age>21)

update email as "rahul@gmailcom" from students where id='5'

delete from students where(age<18)

UPDATE students
SET email = 'rahul@gmail.com'
WHERE id = 5;

DELETE FROM students
WHERE age < 18;



insert into buildings (address, name)
values ('Building One St, Uganda', 'building 1'),
       ('Building Two St, Bolivia', 'building 2'),
       ('Building Main St, Uganda', 'building 42');

insert into classrooms (number, building_id)
values (11, 1),
       (306, 2),
       (211, 2),
       (242, 2),
       (111, 1),
       (42, 1);

insert into groups (name)
values ('b03915'),
       ('b03911'),
       ('b03013'),
       ('f12999'),
       ('a99999'),
       ('b03864');

insert into subjects (description, name)
values ('Description1', 'Physics'),
       ('Description2', 'Mathematics'),
       ('Description3', 'Biology'),
       ('Programming on Java', 'Effective Java'),
       ('Programming on C++', 'C++');

insert into teachers (first_name, last_name)
values ('Juergen', 'Hoeller'),
       ('Linus', 'Torvalds'),
       ('Joshua', 'Bloch'),
       ('Corey', 'Taylor'),
       ('Martyn', 'Fowler');

insert into lessons (day_of_week, end_time, start_time, classroom_id, group_id, subject_id, teacher_id)
values (1, '09:00:00', '10:25:00', 2, 1, 1, 1),
       (1, '12:10:00', '13:35:00', 3, 1, 2, 2),
       (1, '13:45:00', '15:10:00', 2, 1, 3, 3),
       (1, '12:10:00', '13:35:00', 4, 2, 4, 4),
       (1, '15:20:00', '16:45:00', 5, 2, 5, 5),
       (1, '12:10:00', '13:35:00', 6, 2, 1, 1),
       (1, '09:00:00', '10:25:00', 1, 2, 2, 2),
       (1, '15:20:00', '16:45:00', 2, 3, 3, 3),
       (1, '13:45:00', '15:10:00', 4, 4, 4, 4);

insert into students (first_name, last_name, average_grade, group_id)
values ('Evgenii', 'Borisov', 8.5, 1),
       ('Vasilii', 'Cavil', 9, 1),
       ('Emma', 'Stone', 9, 1),
       ('James', 'Cameron', 9, 1),
       ('James', 'Gosling', 9, 1),
       ('Rod', 'Johnson', 9, 2),
       ('Erich', 'Gramma', 9, 2),
       ('Richard', 'Helm', 9, 2),
       ('Ralph', 'Johnson', 9, 2),
       ('John', 'M. Vlissides', 9, 3),
       ('Cay', 'Horstman', 9, 3),
       ('Robert', 'Martin', 9, 4),
       ('Anthony', 'Kiedis', 9, 4),
       ('Dennis', 'Ritchie', 9, 4),
       ('Bjarne', 'Stroustrup', 9, 4),
       ('Alex', 'Lexa', 9, 5),
       ('Magnus', 'Carlsen', 9, 5),
       ('Carl', 'Johnson', 9, 5),
       ('Wesley', 'So', 9, 6),
       ('Robert', 'Fisher', 9, 6),
       ('Aston', 'Martin', 9, 6);

insert into students_lessons (student_id, lessons_id)
select students.id, l.id
from students
         join groups g on g.id = students.group_id
         join lessons l on g.id = l.group_id;

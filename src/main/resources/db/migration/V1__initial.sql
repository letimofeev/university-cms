create table if not exists buildings
(
    id      serial primary key,
    address varchar(63),
    name    varchar(63)
);

create table if not exists classrooms
(
    id          serial primary key,
    number      integer,
    building_id integer
        constraint fk_classrooms_buildings
            references buildings
);

create table if not exists groups
(
    id   serial primary key,
    name varchar(63)
);

create table if not exists students
(
    id            serial primary key,
    first_name    varchar(63),
    last_name     varchar(63),
    average_grade integer,
    group_id      integer
        constraint fk_students_groups
            references groups
);

create table if not exists subjects
(
    id          serial primary key,
    description varchar(63),
    name        varchar(63)
);

create table if not exists teachers
(
    id         serial primary key,
    first_name varchar(63),
    last_name  varchar(63)
);

create table if not exists lessons
(
    id           serial primary key,
    day_of_week  integer,
    end_time     time,
    start_time   time,
    classroom_id integer
        constraint fk_lessons_classrooms
            references classrooms,
    group_id     integer
        constraint fk_lessons_groups
            references groups,
    subject_id   integer
        constraint fk_lessons_subjects
            references subjects,
    teacher_id   integer
        constraint fk_lessons_teachers
            references teachers
);

create table if not exists students_lessons
(
    student_id integer not null
        constraint fk_students_lessons_students
            references students,
    lessons_id integer not null
        constraint fk_students_lessons_lessons
            references lessons
);

create table User
(
    id int auto_increment,
    name varchar(20) not null,
    nickname varchar(20) not null,
    email varchar(20) not null,
    image longtext not null,
    createdAt datetime not null,
    updatedAt datetime not null,
    constraint user_id_uindex
        primary key (id)
);
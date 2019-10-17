-- auto-generated definition
create table pet
(
    id               bigint auto_increment
        primary key,
    name             varchar(20)                         null,
    owner            varchar(20)                         null,
    species          varchar(20)                         null,
    sex              char      default '1'               null,
    birth            date                                null,
    death            date                                null,
    create_time      datetime  default CURRENT_TIMESTAMP not null,
    update_time      datetime                            null,
    create_timestamp timestamp default CURRENT_TIMESTAMP not null
);


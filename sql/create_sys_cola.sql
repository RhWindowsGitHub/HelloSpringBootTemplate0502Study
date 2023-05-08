create table sys_cola
(
    id    int auto_increment comment 'id'
        primary key,
    name  varchar(255) null comment 'name',
    age   int          null comment 'age',
    email varchar(255) null comment 'email'
)
    comment 'cola';


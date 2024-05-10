

create table if not exists artist
(
    id        binary(16) unique    not null default (UUID_TO_BIN(UUID(), true)),
    name      varchar(250) unicode not null,
    biography varchar(250) unicode,
    photo     MEDIUMTEXT unicode,
    primary key (id)

);

create table if not exists painting
(
    id          binary(16) unique    not null default (UUID_TO_BIN(UUID(), true)),
    title       varchar(250) unicode not null,
    description varchar(250) unicode,
    content     blob,
    artist_id   binary(16) unique    not null default (UUID_TO_BIN(UUID(), true)),
    primary key (id)
);


alter table painting add foreign key (artist_id) references artist(id);
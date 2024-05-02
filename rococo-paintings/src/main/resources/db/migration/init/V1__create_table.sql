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
    content     MEDIUMTEXT unicode,
    artist_id   binary(16) unique    not null default (UUID_TO_BIN(UUID(), true)),
    museum_id   binary(16) unique    not null default (UUID_TO_BIN(UUID(), true))
);

create table if not exists museum
(
    id             binary(16) unique    not null default (UUID_TO_BIN(UUID(), true)),
    title          varchar(250) unicode not null,
    description    varchar(250) unicode,
    photo          MEDIUMTEXT unicode,
    geolocation_id binary(16) unique    not null default (UUID_TO_BIN(UUID(), true)),
    primary key (id)
);
create table if not exists geo
(
    id             binary(16) unique    not null default (UUID_TO_BIN(UUID(), true)),
    city          varchar(250) unicode not null,
    country_id binary(16) unique    not null default (UUID_TO_BIN(UUID(), true)),
    primary key (id)
);
create table if not exists country
(
    id             binary(16) unique    not null default (UUID_TO_BIN(UUID(), true)),
    city          varchar(250) unicode not null,
    primary key (id)
);


insert into rococo.country(id, name) value (UUID_TO_BIN('ebf46385-7b3b-490d-9693-62efd68fd724'), 'Канада');





create table if not exists artist
(
    id        binary(16) unique    not null default (UUID_TO_BIN(UUID(), true)),
    name      varchar(250) unicode not null,
    biography varchar(250) unicode,
    photo     MEDIUMTEXT unicode,
    primary key (id)

);

create table if not exists country
(
    id   binary(16) unique    not null default (UUID_TO_BIN(UUID(), true)),
    city varchar(250) unicode not null,
    primary key (id)
);

create table if not exists geo
(
    id         binary(16) unique    not null default (UUID_TO_BIN(UUID(), true)),
    city       varchar(250) unicode not null,
    country_id binary(16) unique    not null default (UUID_TO_BIN(UUID(), true)),
    primary key (id),
    FOREIGN KEY (country_id) REFERENCES country (id)

);


create table if not exists museum
(
    id             binary(16) unique    not null default (UUID_TO_BIN(UUID(), true)),
    title          varchar(250) unicode not null,
    description    varchar(250) unicode,
    photo          MEDIUMTEXT unicode,
    geolocation_id binary(16) unique    not null default (UUID_TO_BIN(UUID(), true)),
    primary key (id),
    FOREIGN KEY (geolocation_id) REFERENCES geo (id)

);

create table if not exists painting
(
    id          binary(16) unique    not null default (UUID_TO_BIN(UUID(), true)),
    title       varchar(250) unicode not null,
    description varchar(250) unicode,
    content     MEDIUMTEXT unicode,
    artist_id   binary(16) unique    not null default (UUID_TO_BIN(UUID(), true)),
    museum_id   binary(16) unique    not null default (UUID_TO_BIN(UUID(), true)),
    FOREIGN KEY (artist_id) REFERENCES artist (id),
    FOREIGN KEY (museum_id) REFERENCES museum (id)

);


insert into rococo.country(id, city) value (UUID_TO_BIN('ebf46385-7b3b-490d-9693-62efd68fd724'), 'Канада');
insert into rococo.country(id, city) value (UUID_TO_BIN('b750a3cc-bdeb-4306-a602-a232ac839abd'), 'Россия');
insert into rococo.country(id, city) value (UUID_TO_BIN('59e733d2-bc4c-409c-ae4d-de572e235ab1'), 'Казахстан');





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


create table if not exists museum
(
    id          binary(16) unique    not null default (UUID_TO_BIN(UUID(), true)),
    title       varchar(250) unicode not null,
    description varchar(250) unicode,
    city        varchar(250) unicode,
    photo       MEDIUMTEXT unicode,
    country_id  binary(16),
    primary key (id),

    FOREIGN KEY (country_id) REFERENCES country (id)

);

create table if not exists painting
(
    id          binary(16) unique    not null default (UUID_TO_BIN(UUID(), true)),
    title       varchar(250) unicode not null,
    description varchar(250) unicode,
    content     MEDIUMTEXT unicode,
    artist_id   binary(16)     not null default (UUID_TO_BIN(UUID(), true)),
    museum_id   binary(16)     not null default (UUID_TO_BIN(UUID(), true)),
    FOREIGN KEY (artist_id) REFERENCES artist (id),
    FOREIGN KEY (museum_id) REFERENCES museum (id)
);


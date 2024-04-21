create table if not exists 'artist'
(
    id          binary(16) unique    not null default (UUID_TO_BIN(UUID(), true)),
    name        varchar(250) unicode not null,
    biography   varchar(250) unicode,
    photo       blob
)
create table if not exists 'painting'
(
    id          binary(16) unique    not null default (UUID_TO_BIN(UUID(), true)),
    title       varchar(250) unicode not null,
    description varchar(250) unicode,
    content     blob,
    artist_id   binary(16) unique    not null default (UUID_TO_BIN(UUID(), true))
)
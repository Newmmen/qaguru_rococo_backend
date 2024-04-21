create table if not exists 'user'
(
    id        binary(16) unique   not null default (UUID_TO_BIN(UUID(), true)),
    username  varchar(50) unicode not null,
    firstname varchar(50) unicode ,
    lastname  varchar(50) unicode ,
    password  varchar(250)        not null,
    enabled   boolean             not null,
    avatar    varchar(50) unicode

)
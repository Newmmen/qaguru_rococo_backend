create table if not exists user
(
    id        binary(16) unique   not null default (UUID_TO_BIN(UUID(), true)),
    username  varchar(50) unicode not null,
    firstname varchar(50) unicode ,
    lastname  varchar(50) unicode ,
    password  varchar(250)        not null,
    enabled   boolean             not null,
    avatar    varchar(50) unicode

);

INSERT INTO auth.user (id, avatar, enabled, first_name, last_name, password, username) VALUES
                                                                                           (0x7D33A4BE93CE43919160BE988CCAE5C1, null, true, null, null, '{bcrypt}$2a$10$GuY8RaEaHyClMTeBPp5.5ekQ76S3XlDtmmHLpomtS73PMv1OcUjd.', 'apilogin1');
INSERT INTO auth.user (id, avatar, enabled, first_name, last_name, password, username) VALUES (0x91B50E5F777F46A9B4B8285D4ACEA1E1, '', true, 'иванов', 'Иван', '{bcrypt}$2a$10$B.S0Il3SyjkQeIKa5OzLeuJhze6uey41YntpC9TiSip.PuAZ/0RC2', 'admin');
INSERT INTO auth.user (id, avatar, enabled, first_name, last_name, password, username) VALUES (0xD84FC46D16C64A1CA33B92CE06E8FE12, null, true, null, null, '{bcrypt}$2a$10$mpZkshIK6ghmmFjVXoXjSOyWpXzNuhTW.1UbVNj.OUJaw2FfJ5dry', 'apilogin');

CREATE TABLE IF NOT EXISTS tasks (
    id SERIAL,
--    USER_ID varchar2(50) NOT NULL,
    title varchar(40),
    done_flg numeric(1) default 0,
    time_limit date
);
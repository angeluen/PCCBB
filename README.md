# PCCBB
Princess Connect Clan Battle Bot

Maven Project

create table user_table(
user_code varchar2(50),
user_name varchar2(20),
cp_count number(2),
carry number(2),
carry_named number(3),
carry_time number(3)
);


create table boss_count(
user_code varchar2(50),
round number(3),
named number(2),
next_time number(2),
attack_date varchar2(20)
);

create table boss_reservation(
user_code varchar2(50),
user_name varchar2(20),
round number(3),
named number(2),
damage number(10),
next_time number(1),
reserv_date varchar2(20)
);
create table clan_date(
day number(2),
start_day varchar2(20),
end_day varchar2(20)
)
# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table friends (
  username                      varchar(255) not null,
  friend                        varchar(255) not null,
  status                        varchar(255),
  constraint pk_friends primary key (username,friend)
);

create table posts (
  id                            bigint auto_increment not null,
  username                      varchar(255),
  message_body                  varchar(255),
  likes                         integer,
  constraint pk_posts primary key (id)
);

create table users (
  username                      varchar(255) not null,
  password                      varchar(255),
  birthday                      varchar(255),
  first_name                    varchar(255),
  last_name                     varchar(255),
  gender                        varchar(255),
  login                         integer,
  constraint pk_users primary key (username)
);


# --- !Downs

drop table if exists friends;

drop table if exists posts;

drop table if exists users;


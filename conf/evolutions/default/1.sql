# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table page (
  id                        bigint not null,
  title                     varchar(255),
  url                       varchar(255) not null,
  body                      varchar(255),
  publishing_on             timestamp,
  is_shown                  boolean,
  created_at                timestamp not null,
  updated_at                timestamp not null,
  constraint pk_page primary key (id))
;

create sequence page_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists page;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists page_seq;


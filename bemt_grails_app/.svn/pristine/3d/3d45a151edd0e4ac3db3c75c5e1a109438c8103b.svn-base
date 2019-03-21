drop table password_reset_request cascade constraints;
create table password_reset_request (id number(19,0) not null, version number(19,0) not null, date_created timestamp not null, owner_id number(19,0) not null, token varchar2(255 char) not null, primary key (id));
alter table password_reset_request add constraint FK492958FBD896B602 foreign key (owner_id) references bemtuser;

--clean up code

drop table if exists public.taskspaceusers;
drop table if exists public.taskspace;
drop table if exists public.users;
drop table if exists public.userhistory;
drop table if exists public.points;
drop table if exists public.pointshistory;
drop table if exists public.tasks;
drop table if exists public.taskcomments;
drop table if exists public.taskattachments;
drop table if exists public.usertypes;
drop table if exists public.tasktypes;
drop table if exists public.tasksubtypes;

commit;

CREATE EXTENSION IF NOT EXISTS "uuid-ossp";



create table if not exists public.tasktypes (
	id int not null generated always as identity,
	typename varchar,
	typecode int,
	primary key (id, typecode)
)
tablespace pg_default
;

create table if not exists public.tasksubtypes (
	id int not null generated always as identity,
	typename varchar,
	typecode int,
	primary key (id, typecode)
)
tablespace pg_default
;

create table if not exists public.usertypes (
	id int not null generated always as identity,
	typename varchar,
	typecode int,
	primary key (id, typecode)
)
tablespace pg_default
;

-- transactional tables

create table if not exists public.users (
	sysuserid uuid DEFAULT uuid_generate_v4(),
	username varchar not null,
	passcode varchar,
	pincode int,
	usertype int,
	active bool,
	disabled bool,
	fname varchar,
	lname varchar,
	mname varchar,
	created_at timestamp,
	modified_at timestamp,
	primary key (sysuserid)
)
tablespace pg_default
;

create table if not exists public.userhistory (
	id bigint not null generated always as identity,
	sysuserid uuid not null,
	txntype varchar,
	txntimestamp timestamp,
		created_at timestamp,
	modified_at timestamp,
	primary key (id)
)
tablespace pg_default
;

create table if not exists public.taskspace (

	spaceid bigint not null generated always as identity,
	spacename varchar not null,
	spacedesc text,
	owner uuid,
		created_at timestamp,
	modified_at timestamp,
	primary key (spaceid)
)
tablespace pg_default
;

create table if not exists public.taskspaceusers (
	id bigint not null generated always as identity,
	spaceid bigint not null,
	sysuserid uuid not null,
		created_at timestamp,
	modified_at timestamp,
	primary key (id)
)
tablespace pg_default
;

create table if not exists public.points (
	id bigint not null generated always as identity,
	pointsavailable int null,
	owner uuid not null,
		created_at timestamp,
	modified_at timestamp,
	primary key (id)
)
tablespace pg_default
;


create table if not exists public.pointshistory ( 
	txnid bigint not null generated always as identity,
	sysuserid uuid not null,
	points int,
	txntype int,
	txndate timestamp,
		created_at timestamp,
	modified_at timestamp,
	primary key (txnid)
)
tablespace pg_default
;

create table if not exists public.tasks (
	taskid bigint not null generated always as identity,
	title varchar,
	details text,
	tasktype int,
	tasksubtype int,
	points int,
	status int,
	priority int,
	createdby uuid,
	createdon timestamp,
	assignedto uuid,
	assignedon timestamp,
	proposedstart timestamp,
	proposedend timestamp,
	actualstart timestamp,
	actualend timestamp,
	helpneeded bool,
	penalty int,
		created_at timestamp,
	modified_at timestamp,
	primary key (taskid)
)
tablespace pg_default
;


create table if not exists public.taskcomments (
	id bigint not null generated always as identity,
	taskid bigint,
	comment text,
	commentedby uuid,
	commentedon timestamp,
		created_at timestamp,
	modified_at timestamp,
	primary key (id)
	
) tablespace pg_default ;


create table if not exists public.taskattachments ( id bigint not null generated always as identity,
taskid bigint,
attachmentname varchar,
attachment bytea,
attachedby uuid,
attachedon timestamp,
created_at timestamp,
modified_at timestamp,
primary key (id) ) tablespace pg_default ;

truncate
	table usertypes;
insert into usertypes (typename, typecode) values 
('Parent',1),('Child',2),('Guardian',3);
--select * from usertypes;

commit;

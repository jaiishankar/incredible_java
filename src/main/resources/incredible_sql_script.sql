--clean up code

drop table if exists public.taskspaceusers;
drop table if exists public.taskspace;
drop table if exists public.users;
drop table if exists public.points;
drop table if exists public.pointshistory;
drop table if exists public.tasks;
drop table if exists public.taskcomments;
drop table if exists public.taskattachments;
drop table if exists public.usertypes;

commit;

CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

create table if not exists public.usertypes (
	id int not null generated always as identity,
	typename varchar,
	typecode int
)
tablespace pg_default
;

create table if not exists public.users (
	sysuserid uuid DEFAULT uuid_generate_v4(),
	username varchar not null,
	passcode varchar,
	pincode int,
	usertype int,
	active bool,
	disabled bool,
	primary key (sysuserid)
)
tablespace pg_default
;


create table if not exists public.taskspace (

	spaceid bigint not null generated always as identity,
	spacename varchar not null,
	spacedesc text,
	owner uuid,
	primary key (spaceid)
)
tablespace pg_default
;

create table if not exists public.taskspaceusers (
	id bigint not null generated always as identity,
	spaceid bigint not null,
	sysuserid uuid not null,
	primary key (id)
)
tablespace pg_default
;

create table if not exists public.points (
	id bigint not null generated always as identity,
	pointsavailable int null,
	owner uuid not null,
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
	primary key (id)
	
) tablespace pg_default ;


create table if not exists public.taskattachments (
	id bigint not null generated always as identity,
	taskid bigint,
	attachmentname varchar,
	attachment bytea,
	attachedby uuid,
	attachedon timestamp,
	
	primary key (id)
)
tablespace pg_default
;

truncate
	table usertypes;
insert into usertypes (typename, typecode) values 
('Parent',1),('Child',2),('Guardian',3);
--select * from usertypes;

commit;

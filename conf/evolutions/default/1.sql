# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table farmaco (
  id_farmaco                bigint not null,
  nome                      varchar(255),
  constraint pk_farmaco primary key (id_farmaco))
;

create table interacao_farmaco (
  farmaco1_id_farmaco       bigint,
  farmaco2_id_farmaco       bigint,
  grau                      varchar(255),
  descricao                 varchar(255))
;

create table interacao_quadro_clinico (
  farmaco_id_farmaco        bigint,
  quadro_clinico_id_quadro_clinico bigint,
  grau                      varchar(255),
  descricao                 varchar(255))
;

create table medicamento (
  id_medicamento            bigint not null,
  nome                      varchar(255),
  constraint pk_medicamento primary key (id_medicamento))
;

create table quadro_clinico (
  id_quadro_clinico         bigint not null,
  nome                      varchar(255),
  constraint pk_quadro_clinico primary key (id_quadro_clinico))
;


create table medicamento_farmaco (
  medicamento_id_medicamento     bigint not null,
  farmaco_id_farmaco             bigint not null,
  constraint pk_medicamento_farmaco primary key (medicamento_id_medicamento, farmaco_id_farmaco))
;
create sequence farmaco_seq;

create sequence medicamento_seq;

create sequence quadro_clinico_seq;

alter table interacao_farmaco add constraint fk_interacao_farmaco_farmaco1_1 foreign key (farmaco1_id_farmaco) references farmaco (id_farmaco) on delete restrict on update restrict;
create index ix_interacao_farmaco_farmaco1_1 on interacao_farmaco (farmaco1_id_farmaco);
alter table interacao_farmaco add constraint fk_interacao_farmaco_farmaco2_2 foreign key (farmaco2_id_farmaco) references farmaco (id_farmaco) on delete restrict on update restrict;
create index ix_interacao_farmaco_farmaco2_2 on interacao_farmaco (farmaco2_id_farmaco);
alter table interacao_quadro_clinico add constraint fk_interacao_quadro_clinico_fa_3 foreign key (farmaco_id_farmaco) references farmaco (id_farmaco) on delete restrict on update restrict;
create index ix_interacao_quadro_clinico_fa_3 on interacao_quadro_clinico (farmaco_id_farmaco);
alter table interacao_quadro_clinico add constraint fk_interacao_quadro_clinico_qu_4 foreign key (quadro_clinico_id_quadro_clinico) references quadro_clinico (id_quadro_clinico) on delete restrict on update restrict;
create index ix_interacao_quadro_clinico_qu_4 on interacao_quadro_clinico (quadro_clinico_id_quadro_clinico);



alter table medicamento_farmaco add constraint fk_medicamento_farmaco_medica_01 foreign key (medicamento_id_medicamento) references medicamento (id_medicamento) on delete restrict on update restrict;

alter table medicamento_farmaco add constraint fk_medicamento_farmaco_farmac_02 foreign key (farmaco_id_farmaco) references farmaco (id_farmaco) on delete restrict on update restrict;

# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists farmaco;

drop table if exists interacao_farmaco;

drop table if exists interacao_quadro_clinico;

drop table if exists medicamento;

drop table if exists medicamento_farmaco;

drop table if exists quadro_clinico;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists farmaco_seq;

drop sequence if exists medicamento_seq;

drop sequence if exists quadro_clinico_seq;


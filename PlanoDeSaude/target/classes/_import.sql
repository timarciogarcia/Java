insert into Plano (nome,ativo,dataCadastro, dataAtualizacao) values ('Plano Bronze','1',utc_timestamp,utc_timestamp);
insert into Plano (nome,ativo,dataCadastro, dataAtualizacao) values ('Plano Prata','1',utc_timestamp,utc_timestamp);
insert into Plano (nome,ativo,dataCadastro, dataAtualizacao) values ('Plano Ouro','1',utc_timestamp,utc_timestamp);
insert into Plano (nome,ativo,dataCadastro, dataAtualizacao) values ('Plano Diamante','1',utc_timestamp,utc_timestamp);

insert into Plano_Contrato (ativo,nome,texto,data,plano_id) values ('1','Contrato I','LOREN',utc_timestamp,1);
insert into Plano_Contrato (ativo,nome,texto,data,plano_id) values ('1','Contrato II','LOREN',utc_timestamp,2);
insert into Plano_Contrato (ativo,nome,texto,data,plano_id) values ('1','Contrato III','LOREN',utc_timestamp,3);
insert into Plano_Contrato (ativo,nome,texto,data,plano_id) values ('1','Contrato I','LOREN',utc_timestamp,4);

insert into plano_tipo_reajuste (nome, plano_id) values ('IGPM',1);
insert into plano_tipo_reajuste (nome, plano_id) values ('Inflacao',2);
insert into plano_tipo_reajuste (nome, plano_id) values ('IQQ',3);
insert into plano_tipo_reajuste (nome, plano_id) values ('INPC',4);

insert into plano_tipo_reajuste_detalhe (data , porcentagem, planotiporeajuste_id) values (utc_timestamp,9.56,1);
insert into plano_tipo_reajuste_detalhe (data , porcentagem, planotiporeajuste_id) values (utc_timestamp,3.77,2);
insert into plano_tipo_reajuste_detalhe (data , porcentagem, planotiporeajuste_id) values (utc_timestamp,5.88,3);
insert into plano_tipo_reajuste_detalhe (data , porcentagem, planotiporeajuste_id) values (utc_timestamp,9.44,4);

insert into plano_valor_vigente (datainicio, datafim, valor, plano_id) values (utc_timestamp,utc_timestamp,150.32,1);
insert into plano_valor_vigente (datainicio, datafim, valor, plano_id) values (utc_timestamp,utc_timestamp,160.33,1);
insert into plano_valor_vigente (datainicio, datafim, valor, plano_id) values (utc_timestamp,utc_timestamp,150.34,2);
insert into plano_valor_vigente (datainicio, datafim, valor, plano_id) values (utc_timestamp,utc_timestamp,164.35,2);
insert into plano_valor_vigente (datainicio, datafim, valor, plano_id) values (utc_timestamp,utc_timestamp,150.36,3);
insert into plano_valor_vigente (datainicio, datafim, valor, plano_id) values (utc_timestamp,utc_timestamp,167.37,3);
insert into plano_valor_vigente (datainicio, datafim, valor, plano_id) values (utc_timestamp,utc_timestamp,150.38,4);
insert into plano_valor_vigente (datainicio, datafim, valor, plano_id) values (utc_timestamp,utc_timestamp,170.39,4);
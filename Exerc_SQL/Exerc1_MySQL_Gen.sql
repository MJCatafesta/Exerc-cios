create database db_RH;
use db_RH;
create table tb_colaboradores(
id bigint auto_increment,
nome varchar(255) not null,
idade int not null,
cargo varchar(255) not null,
salario decimal (8,2),
dataEntrada date,
primary key (id)
);
insert into tb_colaboradores (nome, idade, cargo, salario, dataEntrada) 
values ("João", 23, "junior", 2400.00, "2023-06-17");

insert into tb_colaboradores (nome, idade, cargo, salario, dataEntrada) 
values ("José", 54, "senior", 5250.00, "2018-02-03");

insert into tb_colaboradores (nome, idade, cargo, salario, dataEntrada) 
values ("Valentina", 20, "Estagiária", 1480.00, "2023-07-28");

insert into tb_colaboradores (nome, idade, cargo, salario, dataEntrada) 
values ("Maria", 16, "jovem aprendiz", 1000.00, "2023-02-15");

insert into tb_colaboradores (nome, idade, cargo, salario, dataEntrada) 
values ("Aline", 38, "pleno", 10000.00, "2010-09-20");

select * from tb_colaboradores where salario < 2000.00;

update tb_colaboradores set salario = "3000.00" where id = 11;

select * from tb_colaboradores where nome like "João%";




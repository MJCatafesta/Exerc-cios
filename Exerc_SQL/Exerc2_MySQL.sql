create database db_generation_game_online;
use db_generation_game_online;
create table tb_classe (
id bigint auto_increment,
nome varchar (255) not null,
caracteristicas varchar (255) not null,
primary key (id)
);
create table tb_personagem(
id bigint auto_increment,
nome varchar (255) not null,
sexo varchar (255) not null,    
classe varchar (255) not null,
 primary key (id)
);

alter table tb_personagem add classe_id bigint;
alter table tb_personagem add constraint fk_personagem_classe
foreign key (classe_id) references tb_classe(id);

alter table tb_personagem add poder_Ataque int not null;   
alter table tb_personagem add poder_Defesa int not null;

insert into tb_classe (nome, caracteristicas) values ("Mago", "*Baixa resistência
*Altíssimo dano
*Combate a distância com magias de variados elementos");

insert into tb_classe (nome, caracteristicas) values ("Guerreiro", "*Alta resistência
*Combate corporal com espadas, lanças, machados, maças e escudos
*Vestimentas e armaduras pesadas");

insert into tb_classe (nome, caracteristicas) values ("Bardo", "*Baixa resistência
*Médio dano
*Combate a distância com arco e flecha 
*Habilidades de suporte utilitário como buffs e debuffs em área");

insert into tb_classe (nome, caracteristicas) values ("Monge", "*Média resistência
*Média de dano regular
*Possui ferramentas para causar dano avassalador em determinadas situações
*Vestimentas e armaduras leves");

insert into tb_classe (nome, caracteristicas) values ("Necromante", "*Baixa resistência
*Dano por tempo
*Vestimentas e armaduras leves
*Costumam ter ferramentas de auto-cura");


insert into tb_personagem (nome, sexo, classe, idade, classe_id) values ("LIN", "Masculino", "Necromante", 70, 5);
update tb_personagem set poder_Ataque = 1500 where id = 1;
update tb_personagem set poder_Defesa = 2000 where id = 1;

insert into tb_personagem (nome, sexo, classe, idade, classe_id) values ("Gearsh", "Indefinido", "Bardo", 17, 3);
update tb_personagem set poder_Ataque = 1700 where id = 2;
update tb_personagem set poder_Defesa = 1800 where id = 2;

insert into tb_personagem (nome, sexo, classe, idade, classe_id) values ("Ester", "Feminino", "Guerreiro", 31, 2);
update tb_personagem set poder_Ataque = 2100 where id = 3;
update tb_personagem set poder_Defesa = 1280 where id = 3;

insert into tb_personagem (nome, sexo, classe, idade, classe_id) values ("T´dartn", "Feminino", "Monge", 14, 4);
update tb_personagem set poder_Ataque = 2600 where id = 4;
update tb_personagem set poder_Defesa = 2013 where id = 4;

insert into tb_personagem (nome, sexo, classe, idade, classe_id) values ("Abdar", "Masculino", "Mago", 14, 1);
update tb_personagem set poder_Ataque = 1300 where id = 5;
update tb_personagem set poder_Defesa = 2331 where id = 5;

insert into tb_personagem (nome, sexo, classe, idade, classe_id) values ("sherik", "Indefinido", "Mago", 89, 1);
update tb_personagem set poder_Ataque = 1900 where id = 6;
update tb_personagem set poder_Defesa = 1900 where id = 6;
update tb_personagem set nome = "Cherik" where id = 6;

insert into tb_personagem (nome, sexo, classe, idade, classe_id) values ("Fred", "Masculino", "Bardo", 34, 3);
update tb_personagem set poder_Ataque = 1692 where id = 7;
update tb_personagem set poder_Defesa = 1500 where id = 7;

insert into tb_personagem (nome, sexo, classe, idade, classe_id) values ("Lua", "Feminino", "Necromante", 45, 5);
update tb_personagem set poder_Ataque = 2200 where id = 8;
update tb_personagem set poder_Defesa = 1760 where id = 8;

select * from tb_personagem where poder_Ataque > 2000;

select * from tb_personagem where poder_Defesa < 2000 and poder_Defesa > 1000;

select * from tb_personagem where nome like "%c%";

alter table tb_classe change nome nome_Classe varchar(255);

SELECT tb_personagem.nome, tb_personagem.idade, tb_classe.nome_Classe 
FROM tb_personagem inner join tb_classe 
on tb_classe.id = tb_personagem.classe_id;

SELECT * FROM tb_personagem inner join tb_classe 
where tb_classe.id like 1 and tb_personagem.classe_id like 1;


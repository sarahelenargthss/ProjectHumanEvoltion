create database phe charset latin1 collate latin1_general_cs;

use phe;

create table usuario(
	nom_usuario varchar(60) primary key,
    caminho_historia varchar(60),
    senha_usuario varchar(60) not null
);
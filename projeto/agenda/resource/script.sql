create table contato (
	id BIGINT NOT NULL AUTO_INCREMENT,
	email VARCHAR(255),
	telefone BIGINT,
	pessoa BIGINT,
	primary key (id)
);
	
create table pessoa (
	id BIGINT NOT NULL AUTO_INCREMENT,
	nome VARCHAR(255),
	sexo INT,
	dataNascimento DATE,
	primary key (id)
);

create table telefone (
	id BIGINT NOT NULL AUTO_INCREMENT,
	ddd INT,
	numero INT,
	tipoTelefone INT,
	primary key (id)
);
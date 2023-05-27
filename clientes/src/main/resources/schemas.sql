
DROP TABLE IF EXISTS CLIENTE;
DROP TABLE IF EXISTS SERVICO;

CREATE TABLE IF NOT EXISTS login(
        UserId varchar (50),
		userName varchar (50),
		password varchar (50));

INSERT INTO login (UserId, UserName, Password) VALUES ('Administrador','admin', 'admin');

CREATE TABLE IF NOT EXISTS cliente (
	cod_cli varchar (50),
	nome_cli varchar (50),
	cpf_cli varchar (14),
	celular1_cli varchar (15),
	celular2_cli varchar (15),
	endereco_cli varchar (50),
	email_cli varchar (50),
	data_nascimento_cli date);


CREATE TABLE IF NOT EXISTS servico (
	os_serv varchar (50),
	id_cliente_serv varchar (50),
	tipo_serv varchar (50),
	retirada_serv varchar (50),
	entrega_serv varchar (50),
	data_serv varchar (50),
	hora_serv varchar (50));
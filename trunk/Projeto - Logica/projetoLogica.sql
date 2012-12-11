create table funcionario (
	nome VARCHAR(100),
	rg VARCHAR(100),
	cpf VARCHAR(100),
	dataNascimento VARCHAR(100),
	cargo VARCHAR(100),
	salario double,
	CONSTRAINT PRIMARY KEY (rg)
);
 
create table mercadoria (
	id integer unsigned NOT NULL AUTO_INCREMENT,
	nome VARCHAR(100),
	preco double,
	cor VARCHAR(100),
	tamanho VARCHAR(10),
	produto VARCHAR(100),
	CONSTRAINT PRIMARY KEY (id)
);
 
create table vendas (
 	id integer unsigned NOT NULL AUTO_INCREMENT,
	subtotal double,
	vendedorRg VARCHAR(100),
	dataVenda VARCHAR(10),
	qtdVendas integer unsigned,
	CONSTRAINT PRIMARY KEY (id)
);
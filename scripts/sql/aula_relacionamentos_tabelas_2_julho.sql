CREATE TABLE tbmarca (
	id SERIAL NOT NULL,
	nome VARCHAR(30) NOT NULL,
	CONSTRAINT pk_tbmarca PRIMARY KEY (id)
);
-- listar todas as colunas da tabela de marcas
SELECT * FROM tbmarca;
-- inserir marcas na tabela de marcas
INSERT INTO tbmarca (nome) VALUES ('FIAT');
INSERT INTO tbmarca (nome) VALUES ('FORD');
INSERT INTO tbmarca (nome) VALUES ('CHEVROLET');
INSERT INTO tbmarca (nome) VALUES ('BMW');
INSERT INTO tbmarca (nome) VALUES ('BYD');
INSERT INTO tbmarca (nome) VALUES ('NISSAN');
INSERT INTO tbmarca (nome) VALUES ('JEEP');
-- --------------------------------------------
CREATE TABLE tbstatus (
	id SERIAL NOT NULL,
	nome VARCHAR(30) NOT NULL,
	CONSTRAINT pk_tbstatus PRIMARY KEY (id)
);
-- inserir itens na tabela status
INSERT INTO tbstatus (nome) VALUES ('VENDIDO');
INSERT INTO tbstatus (nome) VALUES ('DISPONIVEL');
-- listar todas as colunas da tabela status
SELECT * FROM tbstatus;

-- criar tabela de carros
CREATE TABLE tbcarro (
	id SERIAL NOT NULL,
	nome VARCHAR(60) NOT NULL,
	ano INT NOT NULL,
	cor VARCHAR(30) NOT NULL,
	id_marca INT NOT NULL,
	id_status INT NOT NULL,
	CONSTRAINT pk_tbcarro PRIMARY KEY (id),
	CONSTRAINT fk_tbmarca FOREIGN KEY (id_marca) REFERENCES tbmarca (id),
	CONSTRAINT fk_tbstatus FOREIGN KEY (id_status) REFERENCES tbstatus (id)
);

SELECT * FROM tbcarro;

-- inserir carros
 
INSERT INTO tbcarro (nome, ano, cor, id_marca, id_status) VALUES ('PALIO',2020,'VERMELHO', 1, 2);
INSERT INTO tbcarro (nome, ano, cor, id_marca, id_status) VALUES ('TORO',2017,'MARROM', 1, 2);
INSERT INTO tbcarro (nome, ano, cor, id_marca, id_status) VALUES ('FUSION',2018,'BRANCO', 2, 2);
INSERT INTO tbcarro (nome, ano, cor, id_marca, id_status) VALUES ('ONIX',2015,'PRATA', 3, 2);
INSERT INTO tbcarro (nome, ano, cor, id_marca, id_status) VALUES ('KICKS',2025,'AZUL', 6, 2);
INSERT INTO tbcarro (nome, ano, cor, id_marca, id_status) VALUES ('DOLPHIN MINI',2025,'ROSA', 5, 2);

-- retorna o nome e o ano dos carros vendidos ordenados por ano em ordem decrescente
SELECT * FROM tbcarro WHERE id_status = 1 ORDER BY ano DESC;

-- alterar o fusion e o kicks para vendido

UPDATE tbcarro SET id_status = 1 WHERE id = 5;
UPDATE tbcarro SET id_status = 1, cor = 'AMARELO' WHERE id = 1;

-- exibir no relatorio de carros, o nome da marca

SELECT c.nome, c.ano, c.cor, m.nome 
AS marca
FROM tbcarro c
INNER JOIN tbmarca m ON m.id = c.id_marca
WHERE c.id_status =1;

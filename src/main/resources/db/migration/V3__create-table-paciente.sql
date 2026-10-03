CREATE TABLE paciente(
                        id bigserial not null,
                         nome varchar(100) not null,
                         email varchar(100) not null unique,
                         cpf varchar(20) default 'cliente não quis informar o CPF',
                         idade integer not null,
                         telefone varchar(11),
                         logradouro varchar(100) not null,
                         bairro varchar(100) not null,
                         cep varchar(9) not null,
                         complemento varchar(100),
                         numero varchar(20),
                         uf char(2) not null,
                         cidade varchar(100) not null,
                         ativo boolean,

                         primary key(id)
);
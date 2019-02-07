CREATE SCHEMA IF NOT EXISTS modelo;

CREATE SEQUENCE modelo.cerveja_id_seq;

CREATE TABLE modelo.cerveja (
                id INTEGER NOT NULL DEFAULT nextval('modelo.cerveja_id_seq'),
                nome VARCHAR(80) NOT NULL,
                id_tipo INTEGER NOT NULL,
                CONSTRAINT pk_cerveja PRIMARY KEY (id)
);

ALTER SEQUENCE modelo.cerveja_id_seq OWNED BY modelo.cerveja.id;
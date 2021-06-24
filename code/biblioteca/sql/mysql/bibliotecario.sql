CREATE DATABASE biblioteca;

USE biblioteca;

CREATE TABLE bibliotecario
(
    cedula character varying(10) NOT NULL,
    nombres character varying(50) NOT NULL,
    apellidos character varying(50) NOT NULL,
    usuario character varying(10) NOT NULL,
    clave character varying(10) NOT NULL,
    CONSTRAINT bibliotecario_pkey PRIMARY KEY (cedula)
);

INSERT INTO bibliotecario(
    cedula, nombres, apellidos, usuario, clave)
VALUES ('0938475629', 'Guillermo', 'Pizarro', 'gpizarro', '123');
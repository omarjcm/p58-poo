CREATE DATABASE biblioteca
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Spanish_Ecuador.1252'
    LC_CTYPE = 'Spanish_Ecuador.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;

-- Table: public.bibliotecario

-- DROP TABLE public.bibliotecario;

CREATE TABLE IF NOT EXISTS public.bibliotecario
(
    cedula character varying(10) COLLATE pg_catalog."default" NOT NULL,
    nombres character varying(50) COLLATE pg_catalog."default" NOT NULL,
    apellidos character varying(50) COLLATE pg_catalog."default" NOT NULL,
    usuario character varying(10) COLLATE pg_catalog."default" NOT NULL,
    clave character varying(10) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT bibliotecario_pkey PRIMARY KEY (cedula)
    )

    TABLESPACE pg_default;

ALTER TABLE public.bibliotecario
    OWNER to postgres;

INSERT INTO bibliotecario(cedula, nombres, apellidos, usuario, clave)
VALUES ('0938475629', 'Guillermo', 'Pizarro', 'gpizarro', '123');
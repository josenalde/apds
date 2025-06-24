DROP TABLE IF EXISTS public.tbproducts;

CREATE TABLE IF NOT EXISTS public.tbproducts
(
    name text COLLATE pg_catalog."default",
    quantity integer,
    value real,
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 )
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.tbproducts
    OWNER to postgres;

insert into tbproducts (name, quantity, value) values ('notebook HP', 10, 2500);
insert into tbproducts (name, quantity, value) values ('microphone for youtubers', 5, 500);
insert into tbproducts (name, quantity, value) values ('pendrive', 100, 100.35);
insert into tbproducts (name, quantity, value) values ('mousepad', 1, 25.50);
insert into tbproducts (name, quantity, value) values ('keyboard dell', 23, 180.99);

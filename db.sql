SET client_encoding = 'UTF-8';

CREATE TABLE "conductor"
(
  "id" SERIAL NOT NULL,
  "nombre" VARCHAR(255) NOT NULL,
  "licencia" VARCHAR(255) NOT NULL,
  "id_tipo_conductor" INTEGER NOT NULL,
  "id_vehiculo" INTEGER NOT NULL
);

ALTER TABLE "conductor" ADD CONSTRAINT "conductor_key" PRIMARY KEY ("id");

CREATE TABLE "contrato"
(
  "id" SERIAL NOT NULL,
  "id_vehiculo" INTEGER NOT NULL,
  "id_conductor" INTEGER NOT NULL
);

ALTER TABLE "contrato" ADD CONSTRAINT "contrato_key" PRIMARY KEY ("id");

CREATE TABLE "ruta"
(
  "id" SERIAL NOT NULL,
  "id_vehiculo" INTEGER NOT NULL,
  "estacion" VARCHAR(255) NOT NULL
);

ALTER TABLE "ruta" ADD CONSTRAINT "ruta_key" PRIMARY KEY ("id");

CREATE TABLE "tipo_conductor"
(
  "id" SERIAL NOT NULL,
  "nombre" VARCHAR(255) NOT NULL
);

ALTER TABLE "tipo_conductor" ADD CONSTRAINT "t_conductor_key" PRIMARY KEY ("id");

INSERT INTO "tipo_conductor" ("id", "nombre") VALUES (1, 'Taxista'), (2, 'ChoferBus');

CREATE TABLE "tipo_vehiculo"
(
  "id" SERIAL NOT NULL,
  "nombre" VARCHAR(255) NOT NULL
);

ALTER TABLE "tipo_vehiculo" ADD CONSTRAINT "t_vehiculo_key" PRIMARY KEY ("id");

INSERT INTO "tipo_vehiculo" ("id", "nombre") VALUES (1, 'Taxi'), (2, 'Bus');

CREATE TABLE "vehiculo"
(
  "id" SERIAL NOT NULL,
  "matricula" VARCHAR(255) NOT NULL,
  "marca" VARCHAR(255) NOT NULL,
  "modelo" VARCHAR(255) NOT NULL,
  "anio" INTEGER NOT NULL,
  "id_tipo_vehiculo" INTEGER NOT NULL
);


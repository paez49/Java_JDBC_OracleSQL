/*
Integrantes:
- Maicol Vergara
- Juan Paez
- Daniel Sanchez
- Nicolle Camargo
- Laura Gonzalez
- Carlos D'silvestri
- Santiago Guerrero
*/ /*   Drops    */
DROP VIEW conductor_vehiculo;

DROP TABLE taxi;

DROP TABLE bicitaxi;

DROP TABLE bus;

DROP TABLE vehiculos;

DROP TABLE conductor;

DROP INDEX tipovehiculo_index;

/* Create tables */
CREATE TABLE conductor
  (
     idconductor    NUMBER(10),
     cedula         VARCHAR2(10) UNIQUE,
     nombre         VARCHAR2(255),
     codigolicencia NUMBER(10) UNIQUE,
     tipolicencia   VARCHAR2(255),
     puntaje        NUMBER(10),
     PRIMARY KEY (idconductor)
  );

CREATE TABLE vehiculos
  (
     idvehiculos          NUMBER(10),
     placa                VARCHAR2(255),
     tipo                 VARCHAR2(255),
     codigosoat           NUMBER(10) UNIQUE,
     conductoridconductor NUMBER(10) NOT NULL,
     PRIMARY KEY (idvehiculos)
  );

CREATE TABLE taxi
  (
     modelo               NUMBER(10),
     tipocarro            VARCHAR2(255),
     vehiculosidvehiculos NUMBER(10) NOT NULL,
     PRIMARY KEY (vehiculosidvehiculos)
  );

CREATE TABLE bicitaxi
  (
     rincicla             NUMBER(10),
     vehiculosidvehiculos NUMBER(10) NOT NULL,
     PRIMARY KEY (vehiculosidvehiculos)
  );

CREATE TABLE bus
  (
     tipobus              VARCHAR2(255),
     vehiculosidvehiculos NUMBER(10) NOT NULL,
     PRIMARY KEY (vehiculosidvehiculos)
  );

ALTER TABLE bus
  ADD CONSTRAINT fkbus82317 FOREIGN KEY (vehiculosidvehiculos) REFERENCES
  vehiculos (idvehiculos);

ALTER TABLE taxi
  ADD CONSTRAINT fktaxi614637 FOREIGN KEY (vehiculosidvehiculos) REFERENCES
  vehiculos (idvehiculos);

ALTER TABLE bicitaxi
  ADD CONSTRAINT fkbicitaxi773689 FOREIGN KEY (vehiculosidvehiculos) REFERENCES
  vehiculos (idvehiculos);

ALTER TABLE vehiculos
  ADD CONSTRAINT fkvehiculos976815 FOREIGN KEY (conductoridconductor) REFERENCES
  conductor (idconductor);

/* Inserts */
INSERT INTO conductor
VALUES      ('-1',
             0,
             'SIN CONDUCTOR',
             '-1',
             '-1',
             '-1');
INSERT INTO conductor
VALUES      ('01',
             123456,
             'Santiago',
             '20',
             'B3',
             '5');

INSERT INTO conductor
VALUES      ('02',
             234567,
             'Juan',
             '21',
             'C1',
             '2');

INSERT INTO conductor
VALUES      ('03',
             345678,
             'Carlos',
             '22',
             'C2',
             '3');

INSERT INTO conductor
VALUES      ('04',
             456789,
             'Nicolle',
             '23',
             'B3',
             '1');

INSERT INTO conductor
VALUES      ('05',
             567892,
             'Maicol',
             '24',
             'C2',
             '4');

INSERT INTO vehiculos
VALUES      ('546',
             'IYN-221',
             'motorizado',
             '709',
             '02');

INSERT INTO vehiculos
VALUES      ('634',
             'GLO-563',
             'motorizado',
             '324',
             '05');

INSERT INTO vehiculos
VALUES      ('234',
             'WTY-564',
             'no motorizado',
             '987',
             '03');

INSERT INTO vehiculos
VALUES      ('453',
             'TRE-227',
             'no motorizado',
             '876',
             '01');

INSERT INTO vehiculos
VALUES      ('112',
             'JVW-245',
             'motorizado',
             '543',
             04);

INSERT INTO vehiculos
VALUES      ('556',
             'NYN-121',
             'motorizado',
             '735',
             '01');

INSERT INTO vehiculos
VALUES      ('674',
             'OLO-363',
             'motorizado',
             '301',
             '03');

INSERT INTO vehiculos
VALUES      ('274',
             'YTY-464',
             'no motorizado',
             '990',
             '04');

INSERT INTO vehiculos
VALUES      ('493',
             'ERE-727',
             'no motorizado',
             '234',
             '05');

INSERT INTO vehiculos
VALUES      ('222',
             'WVW-545',
             'motorizado',
             '212',
             '03');

INSERT INTO vehiculos
VALUES      ('236',
             'DFG-098',
             'motorizado',
             '111',
             '02');

INSERT INTO vehiculos
VALUES      ('237',
             'RTT-397',
             'motorizado',
             '202',
             '03');

INSERT INTO vehiculos
VALUES      ('238',
             'UUU-468',
             'no motorizado',
             '313',
             '01');

INSERT INTO vehiculos
VALUES      ('438',
             'UBU-734',
             'motorizado',
             '555',
             '02');

INSERT INTO vehiculos
VALUES      ('439',
             'IJU-123',
             'motorizado',
             '909',
             '04');

INSERT INTO taxi
VALUES      ('2002',
             'sedan',
             '546');

INSERT INTO taxi
VALUES      ('2018',
             'deportivo',
             '634');

INSERT INTO taxi
VALUES      ('1996',
             'sedan',
             '112');

INSERT INTO taxi
VALUES      ('2000',
             'suv',
             '556');

INSERT INTO taxi
VALUES      ('1996',
             'suv',
             '674');

INSERT INTO bicitaxi
VALUES      ('22',
             '234');

INSERT INTO bicitaxi
VALUES      ('18',
             '453');

INSERT INTO bicitaxi
VALUES      ('17',
             '274');

INSERT INTO bicitaxi
VALUES      ('16',
             '493');

INSERT INTO bicitaxi
VALUES      ('15',
             '238');

INSERT INTO bus
VALUES      ('zonal',
             '222');

INSERT INTO bus
VALUES      ('alimentacion',
             '236');

INSERT INTO bus
VALUES      ('transmilenio',
             '237');

INSERT INTO bus
VALUES      ('transmilenio',
             '438');

INSERT INTO bus
VALUES      ('zonal',
             '439');

/* Indices */
CREATE INDEX tipovehiculo_index
  ON vehiculos(tipo);

CREATE VIEW conductor_vehiculo
AS
  SELECT c.idconductor,
         c.nombre,
         v.idvehiculos,
         v.placa,
         v.tipo,
         v.codigosoat
  FROM   conductor c
         JOIN vehiculos v
           ON c.idconductor = v.conductoridconductor;
           
/*ZONA DE PRUEBAS*/
select * from conductor;
select * from vehiculos;

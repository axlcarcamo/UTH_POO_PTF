
use master 
if exists (select * from sys.databases where name = 'DB_Votacion')
drop database DB_Votacion

create database DB_Votacion
on primary (
name = 'DB_Votacion',
filename ='C:\votacion\DB_Votacion.mdf',
size=15 MB,
Maxsize= 200 MB,
filegrowth=20%)
log on (
name = 'DB_Votacion_log',
filename ='C:\votacion\DB_Votacion.ldf',
size=10 MB,
Maxsize= 70 MB,
filegrowth=5 MB)
go

use DB_Votacion
go
create Table TBL_votante(
vot_identidad int,
vot_nombre varchar(20),
vot_telefono varchar(20),
vot_lugarVoto varchar(100),
primary key(vot_identidad)
)
go

create Table TBL_candidato(
can_codigo int identity(1,1),
can_nombre varchar(50),
can_identidad int,
can_edad int,
can_partidopo varchar(70),
can_candidatura varchar(25),
primary key(can_codigo)
)
go

create table TBL_voto(
voto_codigo int,
voto_identidad int,
codigo_presidente int,
codigo_alcalde int,
codigo_diputado int
)






CREATE database Videojuegos;

use Videojuegos;

drop table if exists Videojuego;
drop table if exists Distribuidor;

create table Videojuegos (
    id int primary key auto_increment,
    nombre varchar(200) not null,
    descripcion varchar(3000),
    imagen_url varchar(500)
);

insert into Videojuegos
(nombre, descripcion, imagen_url) values
('Bioshok Infinite', 'Some quick example text to build on the card title and make up the bulk of the cards content.', 'https://upload.wikimedia.org/wikipedia/en/a/a3/Official_cover_art_for_Bioshock_Infinite.jpg'),
('Insurgency: Sandstorm', 'Some quick example text to build on the card title and make up the bulk of the cards content.', 'https://store-images.s-microsoft.com/image/apps.14118.66496411985646769.c617342d-28e4-4aaf-9b96-89dda9e9d20e.aecf493d-2741-458e-a881-4bc9d8e1dda9'),
('The Witness', 'Some quick example text to build on the card title and make up the bulk of the cards content.', 'https://cdn.akamai.steamstatic.com/steam/apps/210970/capsule_616x353.jpg?t=1598383120'),
('Braid', 'Some quick example text to build on the card title and make up the bulk of the cards content.', 'https://upload.wikimedia.org/wikipedia/en/6/6a/Braidlogo.jpg');


insert into Videojuegos
(nombre, descripcion, imagen_url, distribuidor_id) values
('Borderlands', 'Some quick example text to build on the card title and make up the bulk of the cards content.', 'https://image.api.playstation.com/vulcan/ap/rnd/202010/2323/p50N4PBK9rNanGYKFecTvac5.png',1);


select * from Videojuegos;

create table Distribuidor (
	id int primary key auto_increment,
    nombre varchar(200) not null,
    sitio_web varchar(500)
);

insert into Distribuidor
(nombre, sitio_web) values
('2k','https://2k.com'),
('Focus','https://www.focus-home.com'),
('Thekla',null),
('Number One',null),
('505 Games','https://505games.com');

select * from Distribuidor;

ALTER table Videojuegos 
add column distribuidor_id int, 
add foreign key (distribuidor_id) references Distribuidor(id);

alter table Videojuegos 
modify distribuidor_id int not null;
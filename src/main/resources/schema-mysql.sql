drop table if exists videojuego;

create table videojuego (
    id int primary key auto_increment,
    nombre varchar(200) not null,
    descripcion varchar(3000),
    imagen_url varchar(500)
);

insert into videojuego
(nombre, descripcion, imagen_url) values
('Bioshok Infinite', 'Some quick example text to build on the card title and make up the bulk of the cards content.', 'https://upload.wikimedia.org/wikipedia/en/a/a3/Official_cover_art_for_Bioshock_Infinite.jpg'),
('Insurgency: Sandstorm', 'Some quick example text to build on the card title and make up the bulk of the cards content.', 'https://store-images.s-microsoft.com/image/apps.14118.66496411985646769.c617342d-28e4-4aaf-9b96-89dda9e9d20e.aecf493d-2741-458e-a881-4bc9d8e1dda9'),
('The Witness', 'Some quick example text to build on the card title and make up the bulk of the cards content.', 'https://cdn.akamai.steamstatic.com/steam/apps/210970/capsule_616x353.jpg?t=1598383120');
('Braid', 'Some quick example text to build on the card title and make up the bulk of the cards content.', 'https://upload.wikimedia.org/wikipedia/en/6/6a/Braidlogo.jpg'),


select * from videojuego;
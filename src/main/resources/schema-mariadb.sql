drop table if exists videogame;

create table videogame(
    id int primary key auto_increment,
    name varchar(200) not null,
    description varchar(3000),
    img_url varchar(500)
);

insert into videogame(name, description, img_url) values 
("Minecraft", 
"Minecraft is a sandbox video game created by Swedish developer Markus Persson, released by Mojang in 2011 and purchased by Microsoft in 2014. It is the single best-selling video game of all time, selling over 180 million copies across all platforms by late 2019, with over 112 million monthly active players.", 
"https://store-images.s-microsoft.com/image/apps.17382.13510798887677013.afcc99fc-bdcc-4b9c-8261-4b2cd93b8845.49beb011-7271-4f15-a78b-422c511871e4?mode=scale&q=90&h=300&w=200"),
("Fortnite", "Fortnite is an online video game developed by Epic Games and released in 2017. It is available in three distinct game mode versions that otherwise share the same general gameplay and game engine: ...", 
"https://upload.wikimedia.org/wikipedia/sco/d/dd/Fortnite_cover_art%28PC%29.jpg"),
("Control", 
"Control is an action-adventure video game developed by Remedy Entertainment and published by 505 Games. The game revolves around the Federal Bureau of Control, a secret U.S. government agency tasked with containing and studying phenomena which violate the laws of reality.", 
"https://s2.gaming-cdn.com/images/products/2692/271x377/control-cover.jpg"),
("World of Warcraft",
"World of Warcraft is a massively multiplayer online role-playing game released in 2004 by Blizzard Entertainment. It is the fourth released game set in the Warcraft fantasy universe.",
"https://blznav.akamaized.net/img/games/cards/card-world-of-warcraft-54576e6364584e35.jpg"),
("Grand Theft Auto V",
"Grand Theft Auto V is a 2013 action-adventure game developed by Rockstar North and published by Rockstar Games. It is the first main entry in the Grand Theft Auto series since 2008's Grand Theft Auto IV.",
"https://i.pinimg.com/originals/0a/8e/2d/0a8e2dcab13fd5623ff9503a542b0154.jpg"),
("The Legend of Zelda: Breath of the Wild",
"The Legend of Zelda: Breath of the Wild is an action-adventure game developed and published by Nintendo, released for the Nintendo Switch and Wii U consoles on March 3, 2017.",
"https://www.elsetge.cat/myimg/f/1-10445_tablet-legend-of-zelda-breath-of-the-wild.jpg");
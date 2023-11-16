use final_ssafit;

create table calendar(
    id int primary key,
    groupId int,
    title varchar(50),
    writer varchar(50),
    content varchar(1000),
    start1 date,
    end1 date,
    allDay int(1),
    textColor varchar(50),
    backgroundColor varchar(50),
    borderColor varchar(50)
);



Alter table user add User_Cha INT;



create table restaurant(
    Res_Id int primary key,
	Res_Name varchar(100),
    Res_Region varchar(100),
    Res_Contury varchar(100),
    Res_Lati float,
    Res_Longi float,
    Res_Address varchar(100),
    Res_Tel varchar(100),
    Res_WDay varchar(100),
    Res_WEnd varchar(100),
    Res_Park varchar(100),
    Res_Kid varchar(100),
    Res_Wheel varchar(100),
    Res_Pet varchar(100),
	Res_Vegi varchar(100),
    Res_Halal varchar(100),
    Res_GFree varchar(100)
);



create table review(
	User_Id varchar(100),
    Res_Id int,
    Review_Content varchar(8000),
    Review_Thumbnail varchar(8000),
	
    FOREIGN KEY (User_Id) REFERENCES user(User_Id) ,
    FOREIGN KEY (Res_Id) REFERENCES restaurant(Res_Id) 
);

Alter table review MODIFY Review_Content varchar(3000);
Alter table review MODIFY Review_Thumbnail varchar(13000);





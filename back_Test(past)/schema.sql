-- use final_ssafit;

-- create table user(
-- 	User_Id varchar(100) primary key,
--     User_Password varchar(100),
--     User_NickName varchar(100),
--     User_Cha int
-- );

-- create table restaurant(
--     Res_Id int primary key,
-- 	Res_Name varchar(100),
--     Res_Region varchar(100),
--     Res_Contury varchar(100),
--     Res_Lati float,
--     Res_Longi float,
--     Res_Address varchar(100),
--     Res_Tel varchar(100),
--     Res_WDay varchar(100),
--     Res_WEnd varchar(100),
--     Res_Park tinyint,
--     Res_Kid tinyint,
--     Res_Wheel tinyint,
--     Res_Pet tinyint,
-- 	Res_Vegi tinyint,
--     Res_Halal tinyint,
--     Res_GFree tinyint
-- );

-- create table review(
-- 	User_Id varchar(100),
--     Res_Id int,
--     Review_Content varchar(3000),
--     Review_Thumbnail varchar(13000),
	
--     FOREIGN KEY (User_Id) REFERENCES user(User_Id) ,
--     FOREIGN KEY (Res_Id) REFERENCES restaurant(Res_Id) 
-- );
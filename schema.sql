use final_ssafit;


create table User (
User_Id VARCHAR(100),
User_Password VARCHAR(100),
User_Name VARCHAR(100),
User_NickName VARCHAR(100),
User_Authority int(1),
PRIMARY KEY(User_Id)
);




create table board (
Board_Type INT, 
Board_Id INT AUTO_INCREMENT, 
Board_Title VARCHAR(100),
User_Id VARCHAR(100),
Board_Contents VARCHAR(16000),
Board_Date DATE,
Board_ViewCnt INT,
Board_Like INT,
PRIMARY KEY(Board_Id),
FOREIGN KEY (User_Id) REFERENCES user(User_Id) ON UPDATE CASCADE
);

create table chatting (
User_Id VARCHAR(100),
Board_Id INT,
Chatting_Log VARCHAR(16000),
Chatting_Time TIMESTAMP,
FOREIGN KEY (Board_Id) REFERENCES board(Board_Id) ON UPDATE CASCADE,
FOREIGN KEY (User_Id) REFERENCES user(User_Id) ON UPDATE NO ACTION
);






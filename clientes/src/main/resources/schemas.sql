DROP TABLE IF EXISTS LOGIN;

CREATE TABLE login(
        UserId int primary key auto_increment,
		userName varchar (5),
		password varchar (5)
);

INSERT INTO login (UserName, Password) VALUES ('admin', 'admin');
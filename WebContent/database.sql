
/* Drop Tables */
create database Cars charset=utf8;
DROP TABLE BUY;
DROP TABLE CAR;
DROP TABLE PUSH;
DROP TABLE SELL;
DROP TABLE SERVLET;




/* Create Tables */

CREATE TABLE BUY
(
	NAME VARCHAR(20),
	BUYID VARCHAR(20) NOT NULL,
	CARID VARCHAR(10),
	BUYPRICE INT,
	PRIMARY KEY (BUYID)
);


CREATE TABLE CAR
(
	CARID VARCHAR(10) NOT NULL,
	COLOR VARCHAR(10),
	CARTYPE VARCHAR(10),
	JILI INT,
	PRIMARY KEY (CARID)
);


CREATE TABLE PUSH
(
	HAIBAO VARCHAR(40),
	GUANGGAO VARCHAR(40),
	DAILI VARBINARY(40)
);


CREATE TABLE SELL
(
	NAME VARCHAR(20),
	SELLID VARCHAR(20) NOT NULL,
	CARID VARCHAR(10),
	SELPRICE INT,
	PRIMARY KEY (SELLID)
);


CREATE TABLE SERVLET
(
	SHOUHOU VARCHAR(20),
	BAOXIAN VARCHAR(20),
	WEIXIU VARBINARY(20),
	TUIHUAN VARCHAR(20)
);




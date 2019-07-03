/* CREATE TABLE jpaEmployeeNew (
employeeId int not null primary key,
firstName varchar2(50) not null,
lastName varchar2(50) not null,
phone varchar2(12) not null
);

INSERT INTO JPAEMPLOYEENEW(EMPLOYEEID,FIRSTNAME,LASTNAME,PHONE) 
VALUES (1,JOHN,Patterson,2012229466);
INSERT INTO JPAEMPLOYEENEW(EMPLOYEEID,FIRSTNAME,LASTNAME,PHONE) 
VALUES (2,JOHN,Patterson,2012229466);
INSERT INTO JPAEMPLOYEENEW(EMPLOYEEID,FIRSTNAME,LASTNAME,PHONE) 
VALUES (3,JOHN,Patterson,2012229466);
INSERT INTO JPAEMPLOYEENEW(EMPLOYEEID,FIRSTNAME,LASTNAME,PHONE) 
VALUES (4,JOHN,Patterson,2012229466);
INSERT INTO JPAEMPLOYEENEW(EMPLOYEEID,FIRSTNAME,LASTNAME,PHONE) 
VALUES (5,JOHN,Patterson,2012229466);

insert into jpaemployeenew VALUES (1,'Fname1','Lastname1','2120000001');
insert into jpaemployeenew VALUES (2,'Fname2','Lastname2','2120000002');
insert into jpaemployeenew VALUES (3,'Fname3','Lastname3','2120000003');
insert into jpaemployeenew VALUES (4,'Fname4','Lastname4','2120000004');
insert into jpaemployeenew VALUES (5,'Fname5','Lastname5','2120000005');
insert into jpaemployeenew VALUES (6,'Fname6','Lastname6','2120000006');
insert into jpaemployeenew VALUES (7,'Fname7','Lastname7','2120000007');
insert into jpaemployeenew VALUES (8,'Fname8','Lastname8','2120000008');
insert into jpaemployeenew VALUES (9,'Fname9','Lastname9','2120000009');
insert into jpaemployeenew VALUES (10,'Fname10','Lastname10','2120000010');
insert into jpaemployeenew VALUES (11,'Fname11','Lastname11','2120000011');
insert into jpaemployeenew VALUES (12,'Fname12','Lastname12','2120000012');
insert into jpaemployeenew VALUES (13,'Fname13','Lastname13','2120000013');
insert into jpaemployeenew VALUES (14,'Fname14','Lastname14','2120000014');
insert into jpaemployeenew VALUES (15,'Fname15','Lastname15','2120000015');
insert into jpaemployeenew VALUES (16,'Fname16','Lastname16','2120000016');
insert into jpaemployeenew VALUES (17,'Fname17','Lastname17','2120000017');
insert into jpaemployeenew VALUES (18,'Fname18','Lastname18','2120000018');
insert into jpaemployeenew VALUES (19,'Fname19','Lastname19','2120000019');
insert into jpaemployeenew VALUES (20,'Fname20','Lastname20','2120000020');
insert into jpaemployeenew VALUES (21,'Fname21','Lastname21','2120000021');
insert into jpaemployeenew VALUES (22,'Fname22','Lastname22','2120000022');
insert into jpaemployeenew VALUES (23,'Fname23','Lastname23','2120000023');
insert into jpaemployeenew VALUES (24,'Fname24','Lastname24','2120000024');
insert into jpaemployeenew VALUES (25,'Fname25','Lastname25','2120000025');
insert into jpaemployeenew VALUES (26,'Fname26','Lastname26','2120000026');
insert into jpaemployeenew VALUES (27,'Fname27','Lastname27','2120000027');
insert into jpaemployeenew VALUES (28,'Fname28','Lastname28','2120000028');
insert into jpaemployeenew VALUES (29,'Fname29','Lastname29','2120000029');
insert into jpaemployeenew VALUES (30,'Fname30','Lastname30','2120000030');
insert into jpaemployeenew VALUES (31,'Fname31','Lastname31','2120000031');
insert into jpaemployeenew VALUES (32,'Fname32','Lastname32','2120000032');
insert into jpaemployeenew VALUES (33,'Fname33','Lastname33','2120000033');
insert into jpaemployeenew VALUES (34,'Fname34','Lastname34','2120000034');
insert into jpaemployeenew VALUES (35,'Fname35','Lastname35','2120000035');
insert into jpaemployeenew VALUES (36,'Fname36','Lastname36','2120000036');
insert into jpaemployeenew VALUES (37,'Fname37','Lastname37','2120000037');
insert into jpaemployeenew VALUES (38,'Fname38','Lastname38','2120000038');
insert into jpaemployeenew VALUES (39,'Fname39','Lastname39','2120000039');
insert into jpaemployeenew VALUES (40,'Fname40','Lastname40','2120000040');
insert into jpaemployeenew VALUES (41,'Fname41','Lastname41','2120000041');
insert into jpaemployeenew VALUES (42,'Fname42','Lastname42','2120000042');
insert into jpaemployeenew VALUES (43,'Fname43','Lastname43','2120000043');
insert into jpaemployeenew VALUES (44,'Fname44','Lastname44','2120000044');
insert into jpaemployeenew VALUES (45,'Fname45','Lastname45','2120000045');
insert into jpaemployeenew VALUES (46,'Fname46','Lastname46','2120000046');
insert into jpaemployeenew VALUES (47,'Fname47','Lastname47','2120000047');
insert into jpaemployeenew VALUES (48,'Fname48','Lastname48','2120000048');
insert into jpaemployeenew VALUES (49,'Fname49','Lastname49','2120000049');
insert into jpaemployeenew VALUES (50,'Fname50','Lastname50','2120000050');
insert into jpaemployeenew VALUES (51,'Fname51','Lastname51','2120000051');
insert into jpaemployeenew VALUES (52,'Fname52','Lastname52','2120000052');
insert into jpaemployeenew VALUES (53,'Fname53','Lastname53','2120000053');
insert into jpaemployeenew VALUES (54,'Fname54','Lastname54','2120000054');
insert into jpaemployeenew VALUES (55,'Fname55','Lastname55','2120000055');
insert into jpaemployeenew VALUES (56,'Fname56','Lastname56','2120000056');
insert into jpaemployeenew VALUES (57,'Fname57','Lastname57','2120000057');
insert into jpaemployeenew VALUES (58,'Fname58','Lastname58','2120000058');
insert into jpaemployeenew VALUES (59,'Fname59','Lastname59','2120000059');
insert into jpaemployeenew VALUES (60,'Fname60','Lastname60','2120000060');
insert into jpaemployeenew VALUES (61,'Fname61','Lastname61','2120000061');
insert into jpaemployeenew VALUES (62,'Fname62','Lastname62','2120000062');
insert into jpaemployeenew VALUES (63,'Fname63','Lastname63','2120000063');
insert into jpaemployeenew VALUES (64,'Fname64','Lastname64','2120000064');
insert into jpaemployeenew VALUES (65,'Fname65','Lastname65','2120000065');
insert into jpaemployeenew VALUES (66,'Fname66','Lastname66','2120000066');
insert into jpaemployeenew VALUES (67,'Fname67','Lastname67','2120000067');
insert into jpaemployeenew VALUES (68,'Fname68','Lastname68','2120000068');
insert into jpaemployeenew VALUES (69,'Fname69','Lastname69','2120000069');
insert into jpaemployeenew VALUES (70,'Fname70','Lastname70','2120000070');
insert into jpaemployeenew VALUES (71,'Fname71','Lastname71','2120000071');
insert into jpaemployeenew VALUES (72,'Fname72','Lastname72','2120000072');
insert into jpaemployeenew VALUES (73,'Fname73','Lastname73','2120000073');
insert into jpaemployeenew VALUES (74,'Fname74','Lastname74','2120000074');
insert into jpaemployeenew VALUES (75,'Fname75','Lastname75','2120000075');
insert into jpaemployeenew VALUES (76,'Fname76','Lastname76','2120000076');
insert into jpaemployeenew VALUES (77,'Fname77','Lastname77','2120000077');
insert into jpaemployeenew VALUES (78,'Fname78','Lastname78','2120000078');
insert into jpaemployeenew VALUES (79,'Fname79','Lastname79','2120000079');
insert into jpaemployeenew VALUES (80,'Fname80','Lastname80','2120000080');
insert into jpaemployeenew VALUES (81,'Fname81','Lastname81','2120000081');
insert into jpaemployeenew VALUES (82,'Fname82','Lastname82','2120000082');
insert into jpaemployeenew VALUES (83,'Fname83','Lastname83','2120000083');
insert into jpaemployeenew VALUES (84,'Fname84','Lastname84','2120000084');
insert into jpaemployeenew VALUES (85,'Fname85','Lastname85','2120000085');
insert into jpaemployeenew VALUES (86,'Fname86','Lastname86','2120000086');
insert into jpaemployeenew VALUES (87,'Fname87','Lastname87','2120000087');
insert into jpaemployeenew VALUES (88,'Fname88','Lastname88','2120000088');
insert into jpaemployeenew VALUES (89,'Fname89','Lastname89','2120000089');
insert into jpaemployeenew VALUES (90,'Fname90','Lastname90','2120000090');
insert into jpaemployeenew VALUES (91,'Fname91','Lastname91','2120000091');
insert into jpaemployeenew VALUES (92,'Fname92','Lastname92','2120000092');
insert into jpaemployeenew VALUES (93,'Fname93','Lastname93','2120000093');
insert into jpaemployeenew VALUES (94,'Fname94','Lastname94','2120000094');
insert into jpaemployeenew VALUES (95,'Fname95','Lastname95','2120000095');
insert into jpaemployeenew VALUES (96,'Fname96','Lastname96','2120000096');
insert into jpaemployeenew VALUES (97,'Fname97','Lastname97','2120000097');
insert into jpaemployeenew VALUES (98,'Fname98','Lastname98','2120000098');
insert into jpaemployeenew VALUES (99,'Fname99','Lastname99','2120000099');
insert into jpaemployeenew VALUES (100,'Fname100','Lastname100','2120000100');
*/

delete from jpaemployeenew;

DELETE FROM JPAEMPLOYEENEW WHERE EMPLOYEEID = 101;

UPDATE JPAEMPLOYEENEW SET EMPLOYEEID = 101 WHERE EMPLOYEEID = 100;

SELECT * FROM JPAEMPLOYEENEW WHERE FIRSTNAME = 'Denny';

delete from JPAEMPLOYEENEW where EMPLOYEEID >= 95 AND EMPLOYEEID <=100;




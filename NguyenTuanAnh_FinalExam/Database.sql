DROP DATABASE IF EXISTS FINAL_EXAM;

CREATE DATABASE FINAL_EXAM;

USE FINAL_EXAM;

CREATE TABLE `User`
(
userId INT AUTO_INCREMENT PRIMARY KEY,
fullName VARCHAR(50) NOT NULL,
email VARCHAR(50) UNIQUE KEY NOT NULL,
`passWord` VARCHAR(20) NOT NULL CHECK(length(`passWord`) >=6),
`role` ENUM ('Employee', 'Manager') NOT NULL,
projectId SMALLINT,
expInYear SMALLINT,
proSkill VARCHAR(20)
);
INSERT INTO `final_exam`.`user`
(`fullName`, `email`, `passWord`, `role`, `projectId`, `expInYear`, `proSkill`)
VALUES
(N'Nguyễn Tuấn Anh', 'tuananh01@gmail.com', '123456', 'Manager', 1, 8, 'Java'),
(N'Đặng Ngọc Chiến', 'ngocchien01@gmail.com', '123456', 'Employee', 1, 2, 'Python'),
(N'Đỗ Nhật Quân', 'nhatquan01@gmail.com', '123456', 'Employee', 2, 4, 'Unity'),
(N'Cao Quyền Linh', 'quyenlinh01@gmail.com', '123456', 'Employee', 2, 3, 'C#'),
(N'Đặng Gia Sơn', 'giason01@gmail.com', '123456', 'Employee', 4, 4, 'PHP');
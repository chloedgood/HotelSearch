// for reference to use in MySQL DB

CREATE DATABASE hotel_db;
USE hotel;
DROP TABLE IF EXISTS `Hotel`;
CREATE TABLE `Hotel` (
`id` bigint NOT NULL AUTO_INCREMENT,
`hotel_name` varchar(255) DEFAULT NULL,
`city` varchar(255) DEFAULT NULL,
`price_per_night` bigint DEFAULT NULL,
 PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `Hotel` (hotel_name, city, price_per_night) VALUES 
('Holiday Inn', 'Columbus', 100),
('Marriott', 'Columbus', 170),
('Best Western', 'Columbus', 150),
('Motel 8', 'New York', 280),
('Holiday Inn', 'New York', 300),
('Crowne Plaza', 'New York', 230),
('Embassy Suites', 'Seattle', 210),
('La Quinta', 'Seattle', 150),
('Comfort Inn', 'Seattle', 120);
('Hyatt Place', 'Boston', 230),
('Renaissance Hotel', 'Boston', 210),
('Red Roof Inn', 'Boston', 150),


SELECT * FROM Hotel;
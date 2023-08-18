DROP DATABASE IF EXISTS partdb;
DROP USER IF EXISTS `partadmin`@`%`;
DROP USER IF EXISTS `partuser`@`%`;
CREATE DATABASE IF NOT EXISTS partdb CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
CREATE USER IF NOT EXISTS `partadmin`@`%` IDENTIFIED WITH mysql_native_password BY 'password';
GRANT SELECT, INSERT, UPDATE, DELETE, CREATE, DROP, REFERENCES, INDEX, ALTER, EXECUTE, CREATE VIEW, SHOW VIEW,
CREATE ROUTINE, ALTER ROUTINE, EVENT, TRIGGER ON `partdb`.* TO `partadmin`@`%`;
CREATE USER IF NOT EXISTS `partuser`@`%` IDENTIFIED WITH mysql_native_password BY 'password';
GRANT SELECT, INSERT, UPDATE, DELETE, SHOW VIEW ON `partdb`.* TO `partuser`@`%`;
FLUSH PRIVILEGES;
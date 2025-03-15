CREATE TABLE IF NOT EXISTS `books` (
  `id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `name` VARCHAR(126),
  `author_id` INT,
  FOREIGN KEY (author_id) REFERENCES `authors`(id)
  )
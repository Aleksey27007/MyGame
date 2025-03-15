CREATE TABLE IF NOT EXISTS `authors_books` (
  `id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `author_id` INT,
  `book_id` INT,
  FOREIGN KEY (author_id) REFERENCES `authors`(id),
  FOREIGN KEY (book_id) REFERENCES `books`(id)
  )
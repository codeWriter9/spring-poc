DROP TABLE IF EXISTS user_table

CREATE TABLE user_table {
	id INT AUTO_INCREMENT PRIMARY KEY,
	username VARCHAR(250) UNIQUE,
	firstname VARCHAR(250),
	lastname VARCHAR(250)
}

INSERT INTO user_table (username, firstname, lastname) VALUES
('foobar', 'firstname', 'lastname'),
('zoobar', 'anothername', 'justname'),
('zeebar', 'myname', 'tillname');
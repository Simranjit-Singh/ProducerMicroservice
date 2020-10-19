DROP TABLE IF EXISTS USER;

CREATE TABLE USER (
                      id INT AUTO_INCREMENT  PRIMARY KEY,
                      first_name VARCHAR(250) NOT NULL,
                      last_name VARCHAR(250) NOT NULL,
                      email VARCHAR(250) DEFAULT NULL,
                      address VARCHAR(250) DEFAULT NULL,
                      password VARCHAR(250) DEFAULT NULL
);

INSERT INTO
    USER (first_name, last_name, email, address, password)
VALUES
('Lokesh', 'Gupta', 'howtodoinjava@gmail.com', 'bhlcsyfwiuystwihibth', 'oc8574no86ny4ctnu');

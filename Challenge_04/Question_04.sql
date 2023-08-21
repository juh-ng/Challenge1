
CREATE TABLE Address (
    address_id SERIAL PRIMARY KEY,
    CEP VARCHAR(10) NOT NULL,
    zip_code VARCHAR(10),
    address VARCHAR(255) NOT NULL,
    complement VARCHAR(255),
    neighborhood VARCHAR(255),
    city VARCHAR(255) NOT NULL,
    state VARCHAR(255) NOT NULL,
    country VARCHAR(255) NOT NULL
);


CREATE TABLE Person (
    person_id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    age INT,
    phone VARCHAR(20),
    height DECIMAL(5, 2),
    email VARCHAR(255),
    CPF VARCHAR(14) UNIQUE,
    birthday DATE,
    id_address INT REFERENCES Address(address_id)
);



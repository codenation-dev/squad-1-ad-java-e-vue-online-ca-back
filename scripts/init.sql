-- Codenation: Aceleração Dev Java e Vue.js
-- Squad 1

CREATE DATABASE central_erros_db;
CREATE USER cerr WITH PASSWORD 'cerr';
GRANT ALL PRIVILEGES ON DATABASE central_erros_db TO cerr;

\connect central_erros_db;

CREATE TABLE IF NOT EXISTS users (
    id SERIAL NOT NULL, 
    fullname VARCHAR(100) NOT NULL, 
    email VARCHAR(100) NOT NULL UNIQUE, 
    password VARCHAR(64) NOT NULL, 
    created_at TIMESTAMP DEFAULT NOW(),
    updated_at TIMESTAMP DEFAULT NOW(),
    
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS levels (
    id SERIAL NOT NULL,
    tag VARCHAR(20) NOT NULL,

    PRIMARY KEY (id)
);

INSERT INTO levels (tag)
    VALUES ('Error'), ('Debug'), ('Warning');
	
CREATE TABLE IF NOT EXISTS logs (
    id SERIAL NOT NULL,
	level_id INT NOT NULL,
	description TEXT NOT NULL,
	origin VARCHAR(50) NOT NULL, -- size is enough to fit a ipv6 address
	total_events INT NOT NULL,
	details TEXT NOT NULL,
	created_at TIMESTAMP DEFAULT NOW(),
	updated_at TIMESTAMP DEFAULT NOW(),
	
    PRIMARY KEY (id),
    FOREIGN KEY (level_id) REFERENCES levels(id)	
);
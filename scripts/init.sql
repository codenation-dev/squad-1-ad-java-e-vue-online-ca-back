-- Codenation: Aceleração Dev Java e Vue.js
-- Squad 1

CREATE DATABASE central_erros_db;
CREATE USER cerr WITH PASSWORD 'cerr';
GRANT ALL PRIVILEGES ON DATABASE central_erros_db TO cerr;

\connect central_erros_db;

CREATE TABLE IF NOT EXISTS users (
    user_id SERIAL NOT NULL, 
    fullname VARCHAR(48) NOT NULL, 
    email VARCHAR(40) NOT NULL UNIQUE, 
    passwd VARCHAR(64) NOT NULL, 
    created_at TIMESTAMP   DEFAULT NOW(),
    PRIMARY KEY (user_id)
);

CREATE TABLE IF NOT EXISTS levels (
    level_id SERIAL NOT NULL,
    tag VARCHAR(20) NOT NULL,
    PRIMARY KEY (level_id)
);

INSERT INTO levels (tag)
    VALUES ('Error'), ('Debug'), ('Warning');
	
CREATE TABLE IF NOT EXISTS logs (
    log_id SERIAL NOT NULL,
	level_id INT NOT NULL,
	description VARCHAR(512) NOT NULL,
	origin VARCHAR(39) NOT NULL, -- size is enough to fit a ipv6 address
	nr_events INT NOT NULL,
	details TEXT NOT NULL,
	created_at TIMESTAMP DEFAULT NOW(),
    PRIMARY KEY (log_id),
    FOREIGN KEY (level_id) REFERENCES levels(level_id)	
);
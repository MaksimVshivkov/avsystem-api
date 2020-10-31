DROP TABLE IF EXISTS stopplaces;
CREATE TABLE stopplaces (
id   BIGINT      NOT NULL AUTO_INCREMENT,
name VARCHAR(128) NOT NULL,
region_code   INTEGER      NOT NULL AUTO_INCREMENT,
PRIMARY KEY (id)
);

DROP TABLE IF EXISTS routes;
CREATE TABLE routes (
id   BIGINT      NOT NULL AUTO_INCREMENT,
name VARCHAR(128) NOT NULL,
time_out TIME NOT NULL,
sp_from_id bigint references stopplaces(id),
sp_to_id bigint references stopplaces(id),
PRIMARY KEY (id)
);

DROP TABLE IF EXISTS awtlist;
CREATE TABLE awtlist (
id   INTEGER      NOT NULL AUTO_INCREMENT,
name VARCHAR(128) NOT NULL,
address VARCHAR(256) NOT NULL,
phones VARCHAR(64) NOT NULL,
PRIMARY KEY (id)
);

DROP TABLE IF EXISTS races;
CREATE TABLE races (
id   BIGINT      NOT NULL AUTO_INCREMENT,
date_race DATE NOT NULL,
status_id int NOT NULL,
awt_id bigint references awtlist(id),
route_id bigint references routes(id),
PRIMARY KEY (id)
);

DROP TABLE IF EXISTS orders;
CREATE TABLE orders (
id   BIGINT      NOT NULL AUTO_INCREMENT,
user_id BIGINT NOT NULL,
price DOUBLE,
sp_from_id bigint references stopplaces(id),
sp_to_id bigint references stopplaces(id),
race_id bigint references races(id),
status_id int NOT NULL,
PRIMARY KEY (id)
);

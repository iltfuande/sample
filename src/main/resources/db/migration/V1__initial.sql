CREATE TABLE IF NOT EXISTS "user"
(
    id       SERIAL PRIMARY KEY,
    username VARCHAR(255),
    email    VARCHAR(255)
);
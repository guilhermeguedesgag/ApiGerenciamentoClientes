CREATE TABLE customers (
    uuid UUID NOT NULL,
    name VARCHAR(100) NOT NULL,
    agent VARCHAR(100) NOT NULL,
    state VARCHAR(100) NOT NULL,
    CONSTRAINT customers_pkey PRIMARY KEY (uuid)
);
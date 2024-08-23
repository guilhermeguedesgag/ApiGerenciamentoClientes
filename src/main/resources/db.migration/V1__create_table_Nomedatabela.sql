CREATE TABLE IF NOT EXISTS clientes (
    id SERIAL PRIMARY KEY,           -- Campo ID auto-incrementável
    nome VARCHAR(255) NOT NULL,      -- Campo de texto
    representante VARCHAR(255) NOT NULL, -- Campo de texto
    estado VARCHAR(255) NOT NULL -- Campo de texto
);
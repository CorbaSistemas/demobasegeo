CREATE TABLE  IF NOT EXISTS  "paises" (
    "id_pais" INT NOT NULL PRIMARY KEY,
    "nome_pais" VARCHAR(50) NOT NULL,
    "id_continente" INT NOT NULL,
    FOREIGN KEY ("id_continente") REFERENCES continentes ("id_continente")
);

INSERT INTO "paises"("id_pais", "nome_pais", "id_continente")
VALUES (1, 'Brasil', 1);
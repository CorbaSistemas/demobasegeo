CREATE TABLE  IF NOT EXISTS  "regioes" (
    "id_regiao" INT NOT NULL PRIMARY KEY,
    "cod_regiao" VARCHAR(2) NOT NULL,
    "nome_regiao" VARCHAR(20) NOT NULL,
    "id_pais" INT NOT NULL,
  --  CONSTRAINT "PK_regioes" PRIMARY KEY ("id_regiao"),
    FOREIGN KEY ("id_pais") REFERENCES paises ("id_pais")
);


INSERT INTO "regioes" ("id_regiao", "cod_regiao", "nome_regiao", "id_pais")
VALUES (1, 'CO', 'Centro-Oeste', 1);

INSERT INTO "regioes" ("id_regiao", "cod_regiao", "nome_regiao", "id_pais")
VALUES (2, 'NE', 'Nordeste', 1);

INSERT INTO "regioes" ("id_regiao", "cod_regiao", "nome_regiao", "id_pais")
VALUES (3, 'N', 'Norte', 1);

INSERT INTO "regioes" ("id_regiao", "cod_regiao", "nome_regiao", "id_pais")
VALUES (4, 'SE', 'Sudeste', 1);

INSERT INTO "regioes" ("id_regiao", "cod_regiao", "nome_regiao", "id_pais")
VALUES (5, 'S', 'Sul', 1);
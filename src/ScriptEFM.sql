CREATE DATABASE DatabaseEfmJsp;
USE DatabaseEfmJsp;

CREATE TABLE Etablissement (
  code_etab INT PRIMARY KEY,
  Nom_Etab VARCHAR(100),
  Adresse_etab VARCHAR(100),
  Tel_etab VARCHAR(20)
);

INSERT INTO Etablissement (code_etab, Nom_Etab, Adresse_etab, Tel_etab)
VALUES ('1', 'Etablissement1', 'Andaloss', '0645454321'),
       ('2', 'Etablissement2', 'Bab', '0645454323');

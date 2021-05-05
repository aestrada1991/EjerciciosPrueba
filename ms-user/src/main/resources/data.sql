DROP TABLE IF EXISTS USUARIOS;

CREATE TABLE USUARIOS (
  Codigo_Usuario INT AUTO_INCREMENT  PRIMARY KEY,
  Nombre_Completo VARCHAR(250) NOT NULL,
  Telefono_Contacto VARCHAR(20) NOT NULL,
  Correo_Electronico VARCHAR(250) DEFAULT NULL,
  Fecha_Ultima_Autenticacion DATE NOT NULL,
  Hora_Ultima_Autenticacion VARCHAR (10) NOT NULL,
  Numero_Intentos INT NOT NULL

);
TRUNCATE TABLE USUARIOS;
INSERT INTO USUARIOS
(Codigo_Usuario, Nombre_Completo, Telefono_Contacto, Correo_Electronico, Fecha_Ultima_Autenticacion, Hora_Ultima_Autenticacion,Numero_Intentos)
VALUES
(1014218649,'Andres Estrada', '3205061759', 'Andres.estrada.gil@gmail.com', '2021-05-05','13:00:59',1),
(1018409089,'Eduardo Arevalo', '3185162754', 'Dito.Arevalo@gmail.com', '2021-03-17','13:00:59',2),
(1013610025,'Jessica Zuluaga', '3059466678', 'Jn.Zuluaga@gmail.com', '2020-09-17','13:00:59',5);
-- =============================================
-- 1) Autor
--    → Uno a Muchos con Libro (vía tabla intermedia)
-- =============================================
CREATE TABLE autores (
    autor_id         INT PRIMARY KEY AUTO_INCREMENT,
    nombre           VARCHAR(255)    NOT NULL,
    apellido         VARCHAR(255)    NOT NULL,
    nacionalidad     VARCHAR(100),
    fecha_nacimiento DATE
);

-- =============================================
-- 2) Editorial
--    → Uno a Muchos con Libro
-- =============================================
CREATE TABLE editoriales (
    editorial_id INT PRIMARY KEY AUTO_INCREMENT,
    nombre        VARCHAR(255) NOT NULL,
    pais          VARCHAR(100)
);

CREATE TABLE generos (
    genero_id INT PRIMARY KEY AUTO_INCREMENT,
    nombre        VARCHAR(255) NOT NULL,
    descripcion          VARCHAR(100)
);

-- =============================================
-- 3) Libro
--    → Muchos a Uno con Editorial
--    (Ya no lleva autor_id directo)
-- =============================================
CREATE TABLE libros (
    libro_id          INT PRIMARY KEY AUTO_INCREMENT,
    titulo            VARCHAR(255)    NOT NULL,
    digital           BIT(1)          NOT NULL DEFAULT 0,
    edicion           CHAR(1),
    fecha_publicacion DATE,
    fecha_registro    DATE            NOT NULL ,
    numero_paginas    SMALLINT        NOT NULL,
    precio            DOUBLE          NOT NULL,
    stock             INT             NOT NULL,
    editorial_id      INT             NOT NULL,
    FOREIGN KEY (editorial_id)
      REFERENCES Editorial(editorial_id)
      ON UPDATE CASCADE
      ON DELETE RESTRICT
);

-- =============================================
-- 4) LibroAutor (relación Muchos-a-Muchos)
--    → Libro ↔ Autor
-- =============================================
CREATE TABLE autor_libro (
    libro_id INT NOT NULL,
    autor_id INT NOT NULL,
    PRIMARY KEY (libro_id, autor_id),
    FOREIGN KEY (libro_id)
      REFERENCES Libro(libro_id)
      ON UPDATE CASCADE
      ON DELETE CASCADE,
    FOREIGN KEY (autor_id)
      REFERENCES Autor(autor_id)
      ON UPDATE CASCADE
      ON DELETE RESTRICT
);

CREATE TABLE libro_genero (
    libro_id INT NOT NULL,
    genero_id INT NOT NULL,
    PRIMARY KEY (libro_id, genero_id),
    FOREIGN KEY (libro_id)
      REFERENCES Libro(libro_id)
      ON UPDATE CASCADE
      ON DELETE CASCADE,
    FOREIGN KEY (genero_id)
      REFERENCES Genero(genero_id)
      ON UPDATE CASCADE
      ON DELETE RESTRICT
);

-- =============================================
-- 5) Cliente
--    → Uno a Muchos con Venta
-- =============================================
CREATE TABLE clientes (
    cliente_id INT PRIMARY KEY AUTO_INCREMENT,
    dni INT NOT NULL UNIQUE,
    nombre      VARCHAR(255) NOT NULL,
    apellido    VARCHAR(255) NOT NULL,
    correo      VARCHAR(255) NOT NULL UNIQUE,
    fecha_nacimiento DATE NOT NULL,
    telefono    VARCHAR(15),
    direccion   VARCHAR(255)
);

-- =============================================
-- 6) CuentaCliente
--    → Uno a Uno con Cliente
-- =============================================
CREATE TABLE cuenta_clientes (
    cuenta_id  INT PRIMARY KEY AUTO_INCREMENT,
    cliente_id INT NOT NULL UNIQUE,
    usuario    VARCHAR(100) NOT NULL UNIQUE,
    clave      VARCHAR(255) NOT NULL,
    fecha_registro DATE, -- automatico zona horaria del sistema
    FOREIGN KEY (cliente_id)
      REFERENCES Cliente(cliente_id)
      ON UPDATE CASCADE
      ON DELETE CASCADE
);

-- =============================================
-- 7) Venta
--    → uno a Muchos implícita entre Cliente y Libro
-- =============================================
CREATE TABLE ventas (
    venta_id    INT PRIMARY KEY AUTO_INCREMENT,
    cliente_id  INT NOT NULL,
    fecha_venta DATE NOT NULL,
    total       DOUBLE NOT NULL,
    FOREIGN KEY (cliente_id)
      REFERENCES Cliente(cliente_id)
      ON UPDATE CASCADE
      ON DELETE RESTRICT
);

-- Detalles por cada libro en una venta
CREATE TABLE detalle_ventas (
    detalle_id  INT PRIMARY KEY AUTO_INCREMENT,
    venta_id    INT NOT NULL,
    libro_id    INT NOT NULL,
    cantidad    INT NOT NULL,
    precio_unitario DOUBLE NOT NULL,
    subtotal    DOUBLE NOT NULL, -- cantidad * precio_unitario
    FOREIGN KEY (venta_id)
      REFERENCES Venta(venta_id)
      ON UPDATE CASCADE
      ON DELETE CASCADE,
    FOREIGN KEY (libro_id)
      REFERENCES Libro(libro_id)
      ON UPDATE CASCADE
      ON DELETE RESTRICT
);

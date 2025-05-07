INSERT INTO JEFES (jefe_id, celular, nacionalidad, nombre)
VALUES
(1, '987654321', 'Peruano', 'Juan Pérez'),
(2, '988765432', 'Argentino', 'Carlos Gómez'),
(3, '963852741', 'Peruano', 'Ana Sánchez'),
(4, '912345678', 'Italiano', 'Luis Fernández'),
(5, '915478230', 'España', 'María Rodríguez');


INSERT INTO CATEGORIAS (categoria_id, descripcion, jefe_id)
VALUES
(1, 'Productos Alimenticios', 1),
(2, 'Bebidas', 2),
(3, 'Ropa y Calzado', 3),
(4, 'Electrodomésticos', 4),
(5, 'Tecnología', 5);


INSERT INTO PROVEEDORES (proveedor_id, nombre, ruc, telefono, website)
VALUES
(1, 'Nestle Perú', 20123456789, 123456789, 'www.nestle.pe'),
(2, 'Backus', 20234567890, 987654321, 'www.backus.pe'),
(3, 'Ropa Andina', 20345678901, 987654320, 'www.ropaandina.pe'),
(4, 'ElectroPeru', 20456789012, 912345678, 'www.electroperu.pe'),
(5, 'TechPeru', 20567890123, 915678234, 'www.techperu.pe');


INSERT INTO PRODUCTOS (categoria_id, ffabricacion, fvencimiento, marca, nombre, precio, producto_id, stock)
VALUES
(1, '2024-01-15', '2024-12-15', 'Nestle Perú', 'Cereal de Quinua', 15.50, 1, 500),
(1, '2024-03-01', '2025-03-01', 'Nestle Perú', 'Harina de Maíz', 12.30, 2, 300),
(2, '2024-02-20', '2025-02-20', 'Backus', 'Pilsen', 25.00, 3, 200),
(2, '2024-01-10', '2024-12-10', 'Backus', 'Guarana', 5.50, 4, 150),
(3, '2024-03-05', '2024-11-05', 'Ropa Andina', 'Poncho Andino', 45.00, 5, 100),
(3, '2024-04-01', '2025-04-01', 'Ropa Andina', 'Chullo de Alpaca', 40.00, 6, 80),
(4, '2024-05-01', '2024-11-01', 'ElectroPeru', 'Licuadora MAX', 150.00, 7, 120),
(4, '2024-02-25', '2024-09-25', 'ElectroPeru', 'Microondas ECO', 180.00, 8, 90),
(5, '2024-06-01', '2025-06-01', 'TechPeru', 'Laptop Samsung', 1200.00, 9, 70),
(5, '2024-05-15', '2025-05-15', 'TechPeru', 'Xioami Redmi13', 350.00, 10, 150);


INSERT INTO PRODUCTOS_PROVEEDORES (producto_id, proveedor_id)
VALUES
(1, 1),
(2, 1),
(3, 2),
(4, 2),
(5, 3),
(6, 3),
(7, 4),
(8, 4),
(9, 5),
(10, 5);

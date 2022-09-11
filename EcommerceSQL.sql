use ecommerce;
CREATE TABLE IF NOT EXISTS `ecommerce`.`cliente` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `cpf` VARCHAR(15) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `nome` VARCHAR(100) NOT NULL,
  `registro_geral` VARCHAR(13) NOT NULL,
  `senha` VARCHAR(20) NULL DEFAULT NULL,
  PRIMARY KEY (`id`));
  
  CREATE TABLE IF NOT EXISTS `ecommerce`.`pedido` (
  `numero` INT NOT NULL AUTO_INCREMENT,
  `data_pedido` DATE NULL DEFAULT NULL,
  `desconto` DOUBLE NULL DEFAULT NULL,
  `status` VARCHAR(255) NULL DEFAULT NULL,
  `valor_bruto` DOUBLE NULL DEFAULT NULL,
  `valor_final` DOUBLE NULL DEFAULT NULL,
  `cliente_id` INT NULL DEFAULT NULL,
  PRIMARY KEY (`numero`),
  FOREIGN KEY (`cliente_id`)
    REFERENCES `ecommerce`.`cliente` (`id`));
    
   CREATE TABLE IF NOT EXISTS `ecommerce`.`departamento` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(255) NOT NULL,
  `nome` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`codigo`));
  
  CREATE TABLE IF NOT EXISTS `ecommerce`.`produto` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `descricao` TEXT NULL DEFAULT NULL,
  `estoque` INT NULL DEFAULT NULL,
  `link_foto` VARCHAR(255) NULL DEFAULT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `preco` DOUBLE NULL DEFAULT NULL,
  `departamento_codigo` INT NULL DEFAULT NULL,
  PRIMARY KEY (`codigo`),
    FOREIGN KEY (`departamento_codigo`)
    REFERENCES `ecommerce`.`departamento` (`codigo`));
  
  CREATE TABLE IF NOT EXISTS `ecommerce`.`item_pedido` (
  `seq` INT NOT NULL AUTO_INCREMENT,
  `quantidade` INT NULL DEFAULT NULL,
  `valor_total` DOUBLE NULL DEFAULT NULL,
  `valor_unitario` DOUBLE NULL DEFAULT NULL,
  `pedido_numero` INT NULL DEFAULT NULL,
  `produto_codigo` INT NULL DEFAULT NULL,
  PRIMARY KEY (`seq`),
    FOREIGN KEY (`pedido_numero`)
    REFERENCES `ecommerce`.`pedido` (`numero`),
    FOREIGN KEY (`produto_codigo`)
    REFERENCES `ecommerce`.`produto` (`codigo`));
 
   

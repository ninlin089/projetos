-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 17-Abr-2018 às 11:08
-- Versão do servidor: 5.7.17
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cad_pf`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `pf`
--

CREATE TABLE `pf` (
  `id` int(11) NOT NULL,
  `nome` varchar(150) NOT NULL,
  `endereco` varchar(100) NOT NULL,
  `cidade` varchar(100) NOT NULL,
  `bairro` varchar(100) NOT NULL,
  `telefone` varchar(13) NOT NULL,
  `rg` varchar(12) NOT NULL,
  `sexo` set('F','M') NOT NULL,
  `cep` varchar(13) NOT NULL,
  `celular` varchar(14) NOT NULL,
  `estado` set('AC','AL','AP','AM','BA','CE','DF','ES','GO','MA','MT','MS','MG','PA','PB','PR','PE','PI','RJ','RN','RS','RO','RR','SC','SP','SE','TO') NOT NULL,
  `cpf` varchar(14) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `pf`
--

INSERT INTO `pf` (`id`, `nome`, `endereco`, `cidade`, `bairro`, `telefone`, `rg`, `sexo`, `cep`, `celular`, `estado`, `cpf`) VALUES
(1, 'Matheus', 'Rua tapera', 'sao paulo', 'sao miguel', '(12)1121-2121', '12.121.212-1', 'M', '32543546', '(35)55555-5454', 'AP', '466.556.565-6');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pf`
--
ALTER TABLE `pf`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pf`
--
ALTER TABLE `pf`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

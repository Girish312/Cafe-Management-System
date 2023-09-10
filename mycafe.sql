-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 17, 2024 at 06:07 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 7.4.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mycafe`
--

-- --------------------------------------------------------

--
-- Table structure for table `myorder`
--

CREATE TABLE `myorder` (
  `OID` int(11) NOT NULL,
  `name` text NOT NULL,
  `contact` varchar(10) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `od` text DEFAULT NULL,
  `tbno` text DEFAULT NULL,
  `smoothies` int(11) DEFAULT NULL,
  `coffee` int(11) DEFAULT NULL,
  `icoffee` int(11) DEFAULT NULL,
  `waffles` int(11) DEFAULT NULL,
  `oatmeal` int(11) DEFAULT NULL,
  `pancakes` int(11) DEFAULT NULL,
  `payment` varchar(11) NOT NULL DEFAULT 'unpaid'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `myorder`
--

INSERT INTO `myorder` (`OID`, `name`, `contact`, `address`, `od`, `tbno`, `smoothies`, `coffee`, `icoffee`, `waffles`, `oatmeal`, `pancakes`, `payment`) VALUES
(2, 'John Doe', NULL, NULL, 'Order', '3', 3, 2, 0, 0, 0, 0, 'paid'),
(3, 'Kevin Morgan', NULL, NULL, 'Order', '3', 1, 0, 0, 0, 0, 2, 'paid'),
(5, '', NULL, NULL, 'Order', '', 5, 0, 0, 0, 1, 0, 'unpaid'),
(6, 'yash d', NULL, NULL, 'Order', '2', 2, 3, 0, 0, 6, 0, 'unpaid'),
(7, 'jogo', NULL, NULL, 'Order', '1', 0, 2, 0, 0, 0, 0, 'unpaid'),
(8, 'danny', NULL, NULL, 'Order', '6', 0, 0, 2, 0, 0, 0, 'unpaid'),
(9, 'Yash shinde', '3112144474', '804', 'order', '10', 0, 0, 0, 0, 1, 0, 'unpaid'),
(17, 'Yash shinde', '3112144474', '804', 'order', '9', 0, 0, 0, 1, 0, 0, 'unpaid'),
(18, 'Yash shinde', '3112144474', 'GOA', 'order', '9', 0, 0, 0, 2, 0, 0, 'unpaid'),
(19, 'Yash shinde', '3112144474', 'aaa', 'order', '9', 0, 0, 0, 0, 2, 0, 'unpaid');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `myorder`
--
ALTER TABLE `myorder`
  ADD PRIMARY KEY (`OID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `myorder`
--
ALTER TABLE `myorder`
  MODIFY `OID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

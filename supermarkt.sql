-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Gegenereerd op: 30 sep 2015 om 13:09
-- Serverversie: 5.6.26
-- PHP-versie: 5.6.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `supermarkt`
--

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `article`
--

CREATE TABLE IF NOT EXISTS `article` (
  `Id` int(11) NOT NULL,
  `Name` varchar(25) NOT NULL,
  `Type` varchar(11) NOT NULL,
  `Price` double NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;

--
-- Gegevens worden geëxporteerd voor tabel `article`
--

INSERT INTO `article` (`Id`, `Name`, `Type`, `Price`) VALUES
(1, 'NukaCola', 'frisdrank', 1.5),
(2, 'Gele Stier', 'frisdrank', 2),
(3, 'Pure Tap Wa', 'frisdrank', 2),
(4, 'ham', 'vlees', 1.26),
(5, 'not horsemeat', 'vlees', 0.5),
(6, 'levende kip(DIY editie)', 'vlees', 1),
(7, 'melk 1 liter', 'melkproduct', 0.32),
(8, 'kaas', 'melkproduct', 0.4),
(9, 'yoghurt', 'melkproduct', 0.5),
(10, 'Aartshertog kees', 'drank', 15),
(11, 'siberische wijn', 'drank', 4),
(12, 'slootwater in blik', 'drank', 0.3),
(13, 'aardappelen', 'groente', 4),
(14, 'brocolli', 'groente', 0.5),
(15, 'witlof', 'groente', 0.3),
(16, 'snijbiet', 'groente', 0.4),
(17, 'puntkool', 'groente', 0.5);

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `articleintransit`
--

CREATE TABLE IF NOT EXISTS `articleintransit` (
  `Article` int(11) NOT NULL,
  `Quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `articleondisplay`
--

CREATE TABLE IF NOT EXISTS `articleondisplay` (
  `Article` int(11) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Isle` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `storage`
--

CREATE TABLE IF NOT EXISTS `storage` (
  `Article` int(11) NOT NULL,
  `Quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexen voor geëxporteerde tabellen
--

--
-- Indexen voor tabel `article`
--
ALTER TABLE `article`
  ADD PRIMARY KEY (`Id`),
  ADD UNIQUE KEY `Id` (`Id`),
  ADD KEY `Id_2` (`Id`);

--
-- Indexen voor tabel `articleintransit`
--
ALTER TABLE `articleintransit`
  ADD UNIQUE KEY `Article` (`Article`);

--
-- Indexen voor tabel `articleondisplay`
--
ALTER TABLE `articleondisplay`
  ADD UNIQUE KEY `Article` (`Article`);

--
-- Indexen voor tabel `storage`
--
ALTER TABLE `storage`
  ADD UNIQUE KEY `Article` (`Article`);

--
-- AUTO_INCREMENT voor geëxporteerde tabellen
--

--
-- AUTO_INCREMENT voor een tabel `article`
--
ALTER TABLE `article`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=18;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

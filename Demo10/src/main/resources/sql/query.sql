-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               11.5.2-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             12.7.0.6850
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- Dumping data for table quanlydonhang.cuahang: ~2 rows (approximately)
INSERT INTO `cuahang` (`ma_cua_hang`, `ten`) VALUES
	(1, 'Cửa Hàng A'),
	(2, 'Cửa Hàng B');

-- Dumping data for table quanlydonhang.donhang: ~4 rows (approximately)
INSERT INTO `donhang` (`id`, `email`, `ma_don_hang`, `ngay_dat_hang`, `ten_khach_hang`, `tensp`, `trang_thai`, `ma_cua_hang`) VALUES
	(2, 'b.tran@example.com', '20231220010102', '2023-12-20', 'Trần Thị B', 'Sản phẩm 2', 1, 1),
	(3, 'c.pham@example.com', '20231220010103', '2023-12-21', 'Phạm Văn C', 'Sản phẩm 3', 0, 2),
	(4, 'd.le@example.com', '20231220010104', '2023-12-21', 'Lê Thị D', 'Sản phẩm 4', 1, 2),
	(5, 'trananhtuan@gmail.com', '20241221010252', '2025-05-05', 'nguyen van a', 'TV', 1, 1);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;

-------------------------
-- 幣別對應表 (CurrencyInfo)
-------------------------
CREATE TABLE demo.CurrencyInfo (
	ID INT auto_increment NOT NULL COMMENT '流水號',
	CODE varchar(10) NOT NULL COMMENT '幣別代碼',
	NAME varchar(100) NOT NULL COMMENT '中文名稱',
	CONSTRAINT CurrencyInfo_pk PRIMARY KEY (ID)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8
COLLATE=utf8_general_ci
COMMENT='幣別對應信息';


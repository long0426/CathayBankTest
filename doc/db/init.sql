-------------------------
-- 幣別對應表 (CurrencyInfo)
-------------------------
CREATE TABLE demo.CurrencyInfo (
	code varchar(10) NOT NULL COMMENT '幣別代碼',
	name varchar(100) NOT NULL COMMENT '中文名稱',
	creator varchar(100) NOT NULL COMMENT '創建人',
	createTime DATETIME NOT NULL COMMENT '創建時間',
	updator varchar(100) NULL COMMENT ' 修改者',
	updateTime DATETIME NULL COMMENT '修改時間',
	enable BOOL NOT NULL COMMENT '是否啟用',
	CONSTRAINT CurrencyInfo_pk PRIMARY KEY (code)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8
COLLATE=utf8_general_ci
COMMENT='幣別對應表';

/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.5.60 : Database - dezhaowen
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`dezhaowen` /*!40100 DEFAULT CHARACTER SET gbk */;

USE `dezhaowen`;

/*Table structure for table `account` */

DROP TABLE IF EXISTS `account`;

CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `bid` varchar(20) NOT NULL COMMENT '单号',
  `astate` int(11) DEFAULT NULL COMMENT '结算状态',
  `before_money` float DEFAULT NULL COMMENT '优惠前金额',
  `total` float DEFAULT NULL COMMENT '合计金额',
  `materials_expenses` float DEFAULT NULL COMMENT '材料费',
  `crash` float DEFAULT NULL COMMENT '工时费',
  `addition` float DEFAULT NULL COMMENT '附加费',
  `atime` datetime DEFAULT NULL COMMENT '结算时间',
  `aname` varchar(20) DEFAULT NULL COMMENT '结算人',
  `cash` float DEFAULT NULL COMMENT '现金',
  `bank` float DEFAULT NULL COMMENT '银行卡',
  `bill` float DEFAULT NULL COMMENT '票据',
  `buying` float DEFAULT NULL COMMENT '挂账金额',
  `at_card` float DEFAULT NULL COMMENT '冲储值卡',
  `at_deposit` float DEFAULT NULL COMMENT '冲订金',
  `Collect_taxes` float DEFAULT NULL COMMENT '收税金',
  `voucher` float DEFAULT NULL COMMENT '抵用券',
  `wipe_mantissa` float DEFAULT NULL COMMENT '抹尾数',
  `Internal` float DEFAULT NULL COMMENT '内部账',
  `Points_deduction` float DEFAULT NULL COMMENT '积分抵扣',
  `profit_loss` float DEFAULT NULL COMMENT '到账盈亏',
  `itid` int(11) DEFAULT NULL COMMENT '发票种类编号',
  `invid` varchar(20) DEFAULT NULL COMMENT '发票号',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='结算表';

/*Data for the table `account` */

/*Table structure for table `bills` */

DROP TABLE IF EXISTS `bills`;

CREATE TABLE `bills` (
  `bid` varchar(20) NOT NULL COMMENT '单据编号',
  `bstate` int(11) NOT NULL COMMENT '单据状态',
  `cdlicense` varchar(10) NOT NULL COMMENT '车辆资料编号(车牌号)',
  `pno` varchar(10) NOT NULL COMMENT '人员编号(服务顾问)',
  `btid` int(11) NOT NULL COMMENT '业务类型编号',
  `id` int(11) NOT NULL COMMENT '编号',
  `pmid` int(11) NOT NULL COMMENT '付款方式编号',
  `inid` int(11) NOT NULL COMMENT '交强保险(保险编号)',
  `qualified` int(11) DEFAULT NULL COMMENT '是否合格',
  `reworknum` int(11) DEFAULT NULL COMMENT '返工次数',
  `respeople` varchar(10) DEFAULT NULL COMMENT '责任人',
  `Delaysreason` varchar(100) DEFAULT NULL COMMENT '误工原因',
  `Reworkreason` varchar(100) DEFAULT NULL COMMENT '返工原因',
  `Expectedtime` datetime DEFAULT NULL COMMENT '预计完工',
  `Completiontime` datetime DEFAULT NULL COMMENT '完工时间',
  `Penaltyamount` float DEFAULT NULL COMMENT '处罚金额',
  `qmember` varchar(10) DEFAULT NULL COMMENT '质检员',
  `Pickcar` varchar(10) DEFAULT NULL COMMENT '接车人（连people）',
  `Ordertime` datetime DEFAULT NULL COMMENT '开单时间',
  `Clearingtime` datetime DEFAULT NULL COMMENT '结算时间',
  `forecastmoney` float DEFAULT NULL COMMENT '预估金额',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`bid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='单据表';

/*Data for the table `bills` */

/*Table structure for table `business_types` */

DROP TABLE IF EXISTS `business_types`;

CREATE TABLE `business_types` (
  `btid` int(11) NOT NULL AUTO_INCREMENT COMMENT '业务类型编号',
  `btname` varchar(10) NOT NULL COMMENT '业务类型名称',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`btid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='业务类型表';

/*Data for the table `business_types` */

/*Table structure for table `car` */

DROP TABLE IF EXISTS `car`;

CREATE TABLE `car` (
  `cno` varchar(10) NOT NULL COMMENT '车牌号码',
  `cbno` int(11) NOT NULL COMMENT '车品牌编号(外联车品牌表)',
  `moid` int(11) NOT NULL COMMENT '车型编号(外联车型表)',
  `cmileage` float DEFAULT NULL COMMENT '当前里程',
  `tid` int(11) NOT NULL COMMENT '班组编号(外联班组表)',
  `state` int(11) DEFAULT NULL COMMENT '外勤车辆状态',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`cno`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='外勤车辆表';

/*Data for the table `car` */

insert  into `car`(`cno`,`cbno`,`moid`,`cmileage`,`tid`,`state`,`remark2`,`remark3`,`remark4`,`remark5`) values ('和9999',1,2,888,6,1,NULL,NULL,NULL,NULL),('湖55555',2,3,6666,7,0,NULL,NULL,NULL,NULL),('偶565656',1,1,200,7,0,NULL,NULL,NULL,NULL);

/*Table structure for table `carbelong` */

DROP TABLE IF EXISTS `carbelong`;

CREATE TABLE `carbelong` (
  `clid` int(11) NOT NULL AUTO_INCREMENT COMMENT '车辆归属编号',
  `clname` varchar(20) NOT NULL COMMENT '车辆归属名称',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`clid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=gbk COMMENT='车辆归属表';

/*Data for the table `carbelong` */

insert  into `carbelong`(`clid`,`clname`,`remark1`,`remark2`,`remark3`,`remark4`,`remark5`) values (1,'公司车',NULL,NULL,NULL,NULL,NULL),(2,'个人车',NULL,NULL,NULL,NULL,NULL),(3,'租赁车',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `carbrand` */

DROP TABLE IF EXISTS `carbrand`;

CREATE TABLE `carbrand` (
  `cbno` int(11) NOT NULL AUTO_INCREMENT COMMENT '品牌编号',
  `cbname` varchar(20) NOT NULL COMMENT '品牌名称',
  `cbfirst` varchar(1) NOT NULL COMMENT '首字母',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`cbno`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=gbk COMMENT='车品牌表';

/*Data for the table `carbrand` */

insert  into `carbrand`(`cbno`,`cbname`,`cbfirst`,`remark1`,`remark2`,`remark3`,`remark4`,`remark5`) values (1,'大众','D',NULL,NULL,NULL,NULL,NULL),(2,'丰田','F',NULL,NULL,NULL,NULL,NULL),(3,'田','t',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `cardata` */

DROP TABLE IF EXISTS `cardata`;

CREATE TABLE `cardata` (
  `cdlicense` varchar(10) NOT NULL COMMENT '车牌号',
  `cdno` int(11) NOT NULL COMMENT '车品牌编号',
  `moid` int(11) NOT NULL COMMENT '车型编号',
  `cddriver` varchar(20) NOT NULL COMMENT '驾驶员',
  `cddriverphone` varchar(11) DEFAULT NULL COMMENT '驾驶员电话',
  `cddriverbirth` datetime DEFAULT NULL COMMENT '出生日期',
  `clid` int(11) DEFAULT NULL COMMENT '归属编号',
  `cdlicenseend` datetime DEFAULT NULL COMMENT '驾驶证到期时间',
  `cdframe` varchar(20) DEFAULT NULL COMMENT '车架号',
  `mid` int(11) DEFAULT NULL COMMENT '维修项目编号(发动机编号)',
  `cdyearprice` varchar(4) DEFAULT NULL COMMENT '车辆年款',
  `cdmileage` float DEFAULT NULL COMMENT '里程',
  `cdload` float DEFAULT NULL COMMENT '载重',
  `cdbuydate` datetime DEFAULT NULL COMMENT '购买日期',
  `cdgolicense` datetime DEFAULT NULL COMMENT '上牌日期',
  `cdcarcheckdate` datetime DEFAULT NULL COMMENT '车间到期日期',
  `fid` int(11) DEFAULT NULL COMMENT '燃油类别编号',
  `inid` int(11) DEFAULT NULL COMMENT '交强保险(保险编号)',
  `indate` datetime DEFAULT NULL COMMENT '交强险到期',
  `inid_business` int(11) DEFAULT NULL COMMENT '商业保险(保险编号)',
  `inid_bdate` datetime DEFAULT NULL COMMENT '商业保险到期',
  `cdisinsure` int(11) DEFAULT NULL COMMENT '是否投保车',
  `cdnextmileage` float DEFAULT NULL COMMENT '下次保养里程',
  `cdnextkeepdate` datetime DEFAULT NULL COMMENT '下次保养日期',
  `cno` varchar(10) NOT NULL COMMENT '客户编号',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`cdlicense`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='车辆信息表';

/*Data for the table `cardata` */

insert  into `cardata`(`cdlicense`,`cdno`,`moid`,`cddriver`,`cddriverphone`,`cddriverbirth`,`clid`,`cdlicenseend`,`cdframe`,`mid`,`cdyearprice`,`cdmileage`,`cdload`,`cdbuydate`,`cdgolicense`,`cdcarcheckdate`,`fid`,`inid`,`indate`,`inid_business`,`inid_bdate`,`cdisinsure`,`cdnextmileage`,`cdnextkeepdate`,`cno`,`remark1`,`remark2`,`remark3`,`remark4`,`remark5`) values ('湘A66666',1,1,'小彭','13117331801','2000-10-12 14:55:05',1,'2020-02-20 14:55:46','54345345',2,'200',250,250,'2019-03-21 15:02:50','2019-03-29 15:03:07','2020-02-21 15:03:27',2,1,'2021-06-09 15:06:43',2,'2021-07-16 15:07:27',0,500,'2021-03-21 15:07:50','cus2020001',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `commodity_brand` */

DROP TABLE IF EXISTS `commodity_brand`;

CREATE TABLE `commodity_brand` (
  `cbid` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品品牌编号',
  `cbname` varchar(20) NOT NULL COMMENT '商品品牌名称',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`cbid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=gbk COMMENT='商品品牌表';

/*Data for the table `commodity_brand` */

insert  into `commodity_brand`(`cbid`,`cbname`,`remark1`,`remark2`,`remark3`,`remark4`,`remark5`) values (1,'米其林',NULL,NULL,NULL,NULL,NULL),(2,'别克',NULL,NULL,NULL,NULL,NULL),(3,'宝马',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `commodity_info` */

DROP TABLE IF EXISTS `commodity_info`;

CREATE TABLE `commodity_info` (
  `cno` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品编号',
  `cname` varchar(20) NOT NULL COMMENT '商品名称',
  `cbid` int(11) NOT NULL COMMENT '商品品牌编号',
  `cuid` int(11) NOT NULL COMMENT '商品单位编号',
  `vehicletype` varchar(20) DEFAULT NULL COMMENT '适用车型',
  `gid` int(11) DEFAULT NULL COMMENT '商品类型编号',
  `toino` int(11) DEFAULT NULL COMMENT '收入类型编号',
  `coid` int(11) DEFAULT NULL COMMENT '原厂副厂编号',
  `gcid` int(11) DEFAULT NULL COMMENT '商品等级编号',
  `pid` int(11) DEFAULT NULL COMMENT '产地表',
  `mfid` int(11) DEFAULT NULL COMMENT '产商表',
  `origin` varchar(20) DEFAULT NULL COMMENT '原产编码',
  `barcode` varchar(20) DEFAULT NULL COMMENT '条形编码',
  `pack` varchar(20) DEFAULT NULL COMMENT '包装规格',
  `volume` float DEFAULT NULL COMMENT '体积',
  `grossweight` float DEFAULT NULL COMMENT '毛重',
  `netweight` float DEFAULT NULL COMMENT '净重',
  `stockprice` float DEFAULT NULL COMMENT '进货价',
  `markup` float DEFAULT NULL COMMENT '加价率',
  `exchangecode` varchar(50) DEFAULT NULL COMMENT '互换码',
  `ptid` int(11) NOT NULL COMMENT '价类编号',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`cno`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='商品资料表';

/*Data for the table `commodity_info` */

/*Table structure for table `commodity_unit` */

DROP TABLE IF EXISTS `commodity_unit`;

CREATE TABLE `commodity_unit` (
  `cuid` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品单位编号',
  `cuname` varchar(20) NOT NULL COMMENT '商品单位名称',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`cuid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=gbk COMMENT='商品单位表';

/*Data for the table `commodity_unit` */

insert  into `commodity_unit`(`cuid`,`cuname`,`remark1`,`remark2`,`remark3`,`remark4`,`remark5`) values (1,'套',NULL,NULL,NULL,NULL,NULL),(2,'个',NULL,NULL,NULL,NULL,NULL),(3,'件',NULL,NULL,NULL,NULL,NULL),(4,'把',NULL,NULL,NULL,NULL,NULL),(5,'捆',NULL,NULL,NULL,NULL,NULL),(6,'双',NULL,NULL,NULL,NULL,NULL),(7,'张',NULL,NULL,NULL,NULL,NULL),(8,'台',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `country_origin` */

DROP TABLE IF EXISTS `country_origin`;

CREATE TABLE `country_origin` (
  `coid` int(11) NOT NULL AUTO_INCREMENT COMMENT '原厂副厂编号',
  `coname` varchar(20) NOT NULL COMMENT '原厂副厂名称',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`coid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=gbk COMMENT='原厂副厂表';

/*Data for the table `country_origin` */

insert  into `country_origin`(`coid`,`coname`,`remark1`,`remark2`,`remark3`,`remark4`,`remark5`) values (1,'贝思达',NULL,NULL,NULL,NULL,NULL),(2,'马亚蒂',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `cno` varchar(10) NOT NULL COMMENT '客户编号',
  `ctno` varchar(10) NOT NULL COMMENT '客户类型编号',
  `cname` varchar(20) NOT NULL COMMENT '客户名称',
  `cpeople` varchar(20) DEFAULT NULL COMMENT '联系人',
  `cphone` varchar(11) DEFAULT NULL COMMENT '电话',
  `caddress` varchar(100) DEFAULT NULL COMMENT '客户地址',
  `cbirthday` datetime DEFAULT NULL COMMENT '出生日期',
  `cperiod` int(11) DEFAULT NULL COMMENT '账期',
  `climit` float DEFAULT NULL COMMENT '挂账额度',
  `pno` varchar(10) DEFAULT NULL COMMENT '专属顾问编号',
  `province` varchar(10) DEFAULT NULL COMMENT '省',
  `city` varchar(10) DEFAULT NULL COMMENT '市',
  `district` varchar(10) DEFAULT NULL COMMENT '区',
  `cremark` varchar(50) DEFAULT NULL COMMENT '备注',
  `ctaxes` varchar(20) DEFAULT NULL COMMENT '纳税人识别号',
  `cregistphone` varchar(11) DEFAULT NULL COMMENT '注册电话',
  `cbank` varchar(20) DEFAULT NULL COMMENT '开户银行',
  `cbanknumber` varchar(20) DEFAULT NULL COMMENT '银行账号',
  `cregistaddress` varchar(100) DEFAULT NULL COMMENT '注册地址',
  `other1` varchar(20) DEFAULT NULL COMMENT '其他1',
  `other2` varchar(20) DEFAULT NULL COMMENT '其他2',
  `other3` varchar(20) DEFAULT NULL COMMENT '其他3',
  `other4` varchar(20) DEFAULT NULL COMMENT '其他4',
  `jifen` varchar(10) DEFAULT '20' COMMENT '积分',
  `creatdate` varchar(30) DEFAULT NULL COMMENT '创建时间',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`cno`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='客户表';

/*Data for the table `customer` */

insert  into `customer`(`cno`,`ctno`,`cname`,`cpeople`,`cphone`,`caddress`,`cbirthday`,`cperiod`,`climit`,`pno`,`province`,`city`,`district`,`cremark`,`ctaxes`,`cregistphone`,`cbank`,`cbanknumber`,`cregistaddress`,`other1`,`other2`,`other3`,`other4`,`jifen`,`creatdate`,`remark3`,`remark4`,`remark5`) values ('cus2020001','OCT001','一只大鹅','ocean','13117331801','火星','2000-10-12 15:19:59',15,2000,'dzw001','湖南省','株洲市','石峰区','无','65765876','13236798801','中国银行','4313212056','就在这里',NULL,NULL,NULL,NULL,'20',NULL,NULL,NULL,NULL),('cus2020002','OCT002','易燃物品','_4444x_','5325426','封闭货车','2000-11-28 18:12:15',20,3000,'dzw001','湖南省','怀化市','前夕区','无','65354356','13112345677','中国银行','6676756347','在那里哦',NULL,NULL,NULL,NULL,'20',NULL,NULL,NULL,NULL);

/*Table structure for table `customer_type` */

DROP TABLE IF EXISTS `customer_type`;

CREATE TABLE `customer_type` (
  `ctno` varchar(10) NOT NULL COMMENT '客户类型编号',
  `ctname` varchar(20) DEFAULT NULL COMMENT '客户类型名称',
  `ptid` int(11) NOT NULL COMMENT '价格类型编号',
  `cteffective` int(11) NOT NULL COMMENT '有效年限',
  `ctisvip` int(11) NOT NULL COMMENT '是否会员',
  `ctprice` float NOT NULL COMMENT '会费',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`ctno`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='客户分类表';

/*Data for the table `customer_type` */

insert  into `customer_type`(`ctno`,`ctname`,`ptid`,`cteffective`,`ctisvip`,`ctprice`,`remark1`,`remark2`,`remark3`,`remark4`,`remark5`) values ('OCT001','一般客户',1,1,0,0,NULL,NULL,NULL,NULL,NULL),('OCT002','会员客户',2,1,1,1,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `d_maintenance` */

DROP TABLE IF EXISTS `d_maintenance`;

CREATE TABLE `d_maintenance` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '单据维修项目编号',
  `bid` varchar(20) NOT NULL COMMENT '单据编号',
  `cno` int(11) NOT NULL COMMENT '商品编号',
  `num` int(11) DEFAULT NULL COMMENT '数量',
  `pcid` int(11) DEFAULT NULL COMMENT '竣工价类编号',
  `Bpreferential` float DEFAULT NULL COMMENT '优惠前单价',
  `apreferential` float DEFAULT NULL COMMENT '优惠后单价',
  `bpreferentialM` float DEFAULT NULL COMMENT '优惠后金额(总)',
  `Faultdescription` varchar(100) DEFAULT NULL COMMENT '故障描述',
  `problem` varchar(100) DEFAULT NULL COMMENT '故障原因',
  `tid` int(11) DEFAULT NULL COMMENT '班组编号',
  `pno` varchar(10) DEFAULT NULL COMMENT '人员编号（作业人员',
  `servicepeo` varchar(10) DEFAULT NULL COMMENT '人员编号(服务顾问',
  `Free` varchar(100) DEFAULT NULL COMMENT '免单原因',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='单据维修项目单';

/*Data for the table `d_maintenance` */

/*Table structure for table `fuel` */

DROP TABLE IF EXISTS `fuel`;

CREATE TABLE `fuel` (
  `fid` int(11) NOT NULL AUTO_INCREMENT COMMENT '燃油类别编号',
  `fname` varchar(20) NOT NULL COMMENT '燃油类别名称',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=gbk COMMENT='燃油类别表';

/*Data for the table `fuel` */

insert  into `fuel`(`fid`,`fname`,`remark1`,`remark2`,`remark3`,`remark4`,`remark5`) values (1,'火鸡油',NULL,NULL,NULL,NULL,NULL),(2,'柴油',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `goods_category` */

DROP TABLE IF EXISTS `goods_category`;

CREATE TABLE `goods_category` (
  `gid` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品类型编号',
  `gname` varchar(20) NOT NULL COMMENT '商品类型名称',
  `parentid` int(11) NOT NULL COMMENT '父级编号',
  `catalog` int(11) NOT NULL COMMENT '是否目录',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`gid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=gbk COMMENT='商品类型表';

/*Data for the table `goods_category` */

insert  into `goods_category`(`gid`,`gname`,`parentid`,`catalog`,`remark1`,`remark2`,`remark3`,`remark4`,`remark5`) values (1,'发动机',0,0,NULL,NULL,NULL,NULL,NULL),(2,'传动系统',0,0,NULL,NULL,NULL,NULL,NULL),(3,'制动系统',0,0,NULL,NULL,NULL,NULL,NULL),(4,'行驶系统',0,0,NULL,NULL,NULL,NULL,NULL),(5,'车身',0,0,NULL,NULL,NULL,NULL,NULL),(6,'电气',0,0,NULL,NULL,NULL,NULL,NULL),(7,'通用件与标准件',0,0,NULL,NULL,NULL,NULL,NULL),(8,'轮胎',0,0,NULL,NULL,NULL,NULL,NULL),(9,'汽车用品',0,0,NULL,NULL,NULL,NULL,NULL),(10,'油漆',0,0,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `grade_commodity` */

DROP TABLE IF EXISTS `grade_commodity`;

CREATE TABLE `grade_commodity` (
  `gcid` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品等级编号',
  `gcname` varchar(20) NOT NULL COMMENT '商品等级名称',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`gcid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=gbk COMMENT='商品等级表';

/*Data for the table `grade_commodity` */

insert  into `grade_commodity`(`gcid`,`gcname`,`remark1`,`remark2`,`remark3`,`remark4`,`remark5`) values (1,'优秀',NULL,NULL,NULL,NULL,NULL),(2,'良好',NULL,NULL,NULL,NULL,NULL),(3,'一般',NULL,NULL,NULL,NULL,NULL),(4,'差',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `income_type` */

DROP TABLE IF EXISTS `income_type`;

CREATE TABLE `income_type` (
  `toino` int(11) NOT NULL AUTO_INCREMENT COMMENT '收入类型编号',
  `toname` varchar(20) NOT NULL COMMENT '收入类型名称',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`toino`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=gbk COMMENT='收入种类表';

/*Data for the table `income_type` */

insert  into `income_type`(`toino`,`toname`,`remark1`,`remark2`,`remark3`,`remark4`,`remark5`) values (1,'机修',NULL,NULL,NULL,NULL,NULL),(2,'钣喷',NULL,NULL,NULL,NULL,NULL),(3,'发动机',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `insurance` */

DROP TABLE IF EXISTS `insurance`;

CREATE TABLE `insurance` (
  `inid` int(11) NOT NULL AUTO_INCREMENT COMMENT '保险公司编号',
  `inname` varchar(20) NOT NULL COMMENT '保险公司名称',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`inid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=gbk COMMENT='保险公司表';

/*Data for the table `insurance` */

insert  into `insurance`(`inid`,`inname`,`remark1`,`remark2`,`remark3`,`remark4`,`remark5`) values (1,'李健豪保险公司',NULL,NULL,NULL,NULL,NULL),(2,'胖子保险公司',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `invoice` */

DROP TABLE IF EXISTS `invoice`;

CREATE TABLE `invoice` (
  `invid` varchar(20) NOT NULL COMMENT '发票号',
  `invdate` datetime DEFAULT NULL COMMENT '开票日期',
  `invmoney` float DEFAULT NULL COMMENT '发票金额',
  PRIMARY KEY (`invid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='发票表';

/*Data for the table `invoice` */

insert  into `invoice`(`invid`,`invdate`,`invmoney`) values ('dzwfp001','2020-02-12 21:44:53',200),('dzwfp002','2020-02-13 21:45:17',500);

/*Table structure for table `invoice_type` */

DROP TABLE IF EXISTS `invoice_type`;

CREATE TABLE `invoice_type` (
  `itid` int(11) NOT NULL AUTO_INCREMENT COMMENT '发票种类编号',
  `itname` varchar(20) NOT NULL COMMENT '发票种类名称',
  PRIMARY KEY (`itid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=gbk COMMENT='发票种类表';

/*Data for the table `invoice_type` */

insert  into `invoice_type`(`itid`,`itname`) values (1,'普通发票');

/*Table structure for table `job` */

DROP TABLE IF EXISTS `job`;

CREATE TABLE `job` (
  `jid` int(11) NOT NULL AUTO_INCREMENT COMMENT '岗位编号',
  `jname` varchar(10) DEFAULT NULL COMMENT '岗位名称',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  `remark6` varchar(10) DEFAULT NULL COMMENT '备注6',
  PRIMARY KEY (`jid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=gbk COMMENT='岗位表';

/*Data for the table `job` */

insert  into `job`(`jid`,`jname`,`remark1`,`remark2`,`remark3`,`remark4`,`remark5`,`remark6`) values (1,'服务经理',NULL,NULL,NULL,NULL,NULL,NULL),(2,'服务总监',NULL,NULL,NULL,NULL,NULL,NULL),(3,'服务顾问',NULL,NULL,NULL,NULL,NULL,NULL),(4,'车间主任',NULL,NULL,NULL,NULL,NULL,NULL),(5,'索赔员',NULL,NULL,NULL,NULL,NULL,NULL),(6,'保险经理',NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `level` */

DROP TABLE IF EXISTS `level`;

CREATE TABLE `level` (
  `lid` int(11) NOT NULL AUTO_INCREMENT COMMENT '技工星级编号',
  `lname` varchar(10) NOT NULL COMMENT '技工星级名称',
  `lprofit` int(11) NOT NULL COMMENT '提成权重',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`lid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=gbk COMMENT='技工星级表';

/*Data for the table `level` */

insert  into `level`(`lid`,`lname`,`lprofit`,`remark1`,`remark2`,`remark3`,`remark4`,`remark5`) values (1,'一星',1,NULL,NULL,NULL,NULL,NULL),(2,'二星',2,NULL,NULL,NULL,NULL,NULL),(3,'三星',3,NULL,NULL,NULL,NULL,NULL),(4,'四星',4,NULL,NULL,NULL,NULL,NULL),(5,'五星',5,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `level_producers` */

DROP TABLE IF EXISTS `level_producers`;

CREATE TABLE `level_producers` (
  `lpid` int(11) NOT NULL AUTO_INCREMENT COMMENT '产商等级编号',
  `lpname` varchar(20) NOT NULL COMMENT '产商等级名称',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`lpid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=gbk COMMENT='产商等级表';

/*Data for the table `level_producers` */

insert  into `level_producers`(`lpid`,`lpname`,`remark1`,`remark2`,`remark3`,`remark4`,`remark5`) values (1,'优秀',NULL,NULL,NULL,NULL,NULL),(2,'良好',NULL,NULL,NULL,NULL,NULL),(3,'一般',NULL,NULL,NULL,NULL,NULL),(4,'差',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `linkman` */

DROP TABLE IF EXISTS `linkman`;

CREATE TABLE `linkman` (
  `linkno` int(11) NOT NULL AUTO_INCREMENT COMMENT '联系人编号',
  `mfid` int(11) NOT NULL COMMENT '产商编号',
  `linkname` varchar(20) NOT NULL COMMENT '联系人编号',
  `phone` varchar(11) DEFAULT NULL COMMENT '电话',
  `linkphone` varchar(11) DEFAULT NULL COMMENT '手机',
  `linkemail` varchar(20) DEFAULT NULL COMMENT '邮箱',
  `position` varchar(20) DEFAULT NULL COMMENT '职位',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`linkno`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=gbk COMMENT='产商联系人表';

/*Data for the table `linkman` */

insert  into `linkman`(`linkno`,`mfid`,`linkname`,`phone`,`linkphone`,`linkemail`,`position`,`remark1`,`remark2`,`remark3`,`remark4`,`remark5`) values (1,1,'张三','111','111','111','职员',NULL,NULL,NULL,NULL,NULL),(2,1,'李叔同','222','333','44','汇集',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `maintain_bill` */

DROP TABLE IF EXISTS `maintain_bill`;

CREATE TABLE `maintain_bill` (
  `bid` varchar(20) NOT NULL COMMENT '单据编号',
  `mbname` varchar(20) DEFAULT NULL COMMENT '维修单',
  `factorymeil` float DEFAULT NULL COMMENT '进厂里程',
  `factoryoil` float DEFAULT NULL COMMENT '进厂油量',
  `mileage` float DEFAULT NULL COMMENT '上次里程',
  `intotime` datetime DEFAULT NULL COMMENT '进厂时间',
  `lastinto` datetime DEFAULT NULL COMMENT '上次进厂',
  `Receptionnote` varchar(100) DEFAULT NULL COMMENT '接待备注',
  `statement` varchar(100) DEFAULT NULL COMMENT '报修陈述',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备用字段5'
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='维修单';

/*Data for the table `maintain_bill` */

/*Table structure for table `maintenance` */

DROP TABLE IF EXISTS `maintenance`;

CREATE TABLE `maintenance` (
  `mid` int(11) NOT NULL AUTO_INCREMENT COMMENT '维修项目编号',
  `mname` varchar(10) NOT NULL COMMENT '维修项目名称',
  `parentid` int(11) NOT NULL COMMENT '父级编号',
  `catalog` int(11) NOT NULL COMMENT '是否目录',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=gbk COMMENT='维修项目表';

/*Data for the table `maintenance` */

insert  into `maintenance`(`mid`,`mname`,`parentid`,`catalog`,`remark1`,`remark2`,`remark3`,`remark4`,`remark5`) values (1,'车型',0,0,NULL,NULL,NULL,NULL,NULL),(2,'发动机',0,0,NULL,NULL,NULL,NULL,NULL),(3,'钣喷',0,0,NULL,NULL,NULL,NULL,NULL),(4,'保养',0,0,NULL,NULL,NULL,NULL,NULL),(5,'小修',0,0,NULL,NULL,NULL,NULL,NULL),(6,'大众',1,0,NULL,NULL,NULL,NULL,NULL),(7,'中国重汽',1,0,NULL,NULL,NULL,NULL,NULL),(8,'狗佳动力',2,0,NULL,NULL,NULL,NULL,NULL),(9,'青鸟动机',2,0,NULL,NULL,NULL,NULL,NULL),(10,'轻度',3,0,NULL,NULL,NULL,NULL,NULL),(11,'中度',3,0,NULL,NULL,NULL,NULL,NULL),(12,'重度',3,0,NULL,NULL,NULL,NULL,NULL),(13,'发烧保养',4,0,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `manufacturer` */

DROP TABLE IF EXISTS `manufacturer`;

CREATE TABLE `manufacturer` (
  `mfid` int(11) NOT NULL AUTO_INCREMENT COMMENT '产商编号',
  `mfname` varchar(20) NOT NULL COMMENT '产商名称',
  `mfaddress` varchar(50) DEFAULT NULL COMMENT '产商地址',
  `mfsituation` varchar(50) DEFAULT NULL COMMENT '经营情况',
  `mfwebsite` varchar(50) DEFAULT NULL COMMENT '网址',
  `mfopeningbank` varchar(50) DEFAULT NULL COMMENT '开户行',
  `mfbankaccount` varchar(20) DEFAULT NULL COMMENT '银行卡号',
  `pmid` int(11) DEFAULT NULL COMMENT '付款方式编号',
  `lpid` int(11) DEFAULT NULL COMMENT '产商等级',
  `mfmanagementbrand` varchar(20) DEFAULT NULL COMMENT '经营品牌',
  `pid` int(11) DEFAULT NULL COMMENT '产地编号',
  `mfcontacts` varchar(20) DEFAULT NULL COMMENT '联系人名称',
  `mfphone` varchar(11) DEFAULT NULL COMMENT '联系电话',
  `mfemail` varchar(20) DEFAULT NULL COMMENT '邮箱',
  `mftellphone` varchar(11) DEFAULT NULL COMMENT '手机',
  `mfaccount` varchar(20) DEFAULT NULL COMMENT '账期',
  `mfremark` varchar(50) DEFAULT NULL COMMENT '备注',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`mfid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=gbk COMMENT='产商表';

/*Data for the table `manufacturer` */

insert  into `manufacturer`(`mfid`,`mfname`,`mfaddress`,`mfsituation`,`mfwebsite`,`mfopeningbank`,`mfbankaccount`,`pmid`,`lpid`,`mfmanagementbrand`,`pid`,`mfcontacts`,`mfphone`,`mfemail`,`mftellphone`,`mfaccount`,`mfremark`,`remark1`,`remark2`,`remark3`,`remark4`,`remark5`) values (1,'株洲大风车','株洲天元区','较好','www','农业','1111',1,1,'风车',1,'钟大哥','111','1111','1111','1111','1111',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `mechanic` */

DROP TABLE IF EXISTS `mechanic`;

CREATE TABLE `mechanic` (
  `pno` varchar(10) NOT NULL COMMENT '人员编号(外联人员表)',
  `tid` int(11) NOT NULL COMMENT '班组编号',
  `jid` int(11) NOT NULL COMMENT '岗位编号(外联岗位表)',
  `rid` int(11) NOT NULL COMMENT '角色编号(外联角色表)',
  `mcisgroup` int(11) NOT NULL COMMENT '是否组长(0是,1否)',
  `lid` int(11) NOT NULL COMMENT '技工星级编号(外联技工星级表)',
  `mcworktype` varchar(20) DEFAULT NULL COMMENT '维修工种',
  `mcbrand` varchar(20) DEFAULT NULL COMMENT '维修品牌',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5'
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='班组表';

/*Data for the table `mechanic` */

insert  into `mechanic`(`pno`,`tid`,`jid`,`rid`,`mcisgroup`,`lid`,`mcworktype`,`mcbrand`,`remark1`,`remark2`,`remark3`,`remark4`,`remark5`) values ('dzw002',5,4,13,0,3,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('dzw002',5,4,13,0,3,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `mechanism` */

DROP TABLE IF EXISTS `mechanism`;

CREATE TABLE `mechanism` (
  `mid` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `mname` varchar(10) NOT NULL COMMENT '组织机构名称',
  `catalog` int(11) NOT NULL COMMENT '是否目录,0是、1否',
  `parentid` int(11) NOT NULL COMMENT '父级编号',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=gbk COMMENT='组织机构表';

/*Data for the table `mechanism` */

insert  into `mechanism`(`mid`,`mname`,`catalog`,`parentid`,`remark1`,`remark2`,`remark3`,`remark4`,`remark5`) values (1,'北京德召文卡车系统',0,0,NULL,NULL,NULL,NULL,NULL),(2,'成高',0,1,NULL,NULL,NULL,NULL,NULL),(3,'财务部',0,2,NULL,NULL,NULL,NULL,NULL),(4,'客服部',0,2,NULL,NULL,NULL,NULL,NULL),(5,'技术部',0,2,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `motorcycle` */

DROP TABLE IF EXISTS `motorcycle`;

CREATE TABLE `motorcycle` (
  `moid` int(11) NOT NULL AUTO_INCREMENT COMMENT '车型编号',
  `cbno` int(11) NOT NULL COMMENT '品牌编号(外联车辆品牌表)',
  `moiname` varchar(20) NOT NULL COMMENT '车型名称',
  `moprice` float DEFAULT NULL COMMENT '参考价格',
  `moyearprice` varchar(4) DEFAULT NULL COMMENT '年款',
  `modischarge` float DEFAULT NULL COMMENT '排期量',
  `modomestic` varchar(10) DEFAULT NULL COMMENT '进口国产',
  `mofuel` varchar(5) DEFAULT NULL COMMENT '燃油标号',
  `load` int(11) DEFAULT NULL COMMENT '载重',
  `mid` int(11) DEFAULT NULL COMMENT '发动机品牌(外联维修项目表编号)',
  `img` varchar(100) DEFAULT NULL COMMENT '车辆图片',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`moid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=gbk COMMENT='车型表';

/*Data for the table `motorcycle` */

insert  into `motorcycle`(`moid`,`cbno`,`moiname`,`moprice`,`moyearprice`,`modischarge`,`modomestic`,`mofuel`,`load`,`mid`,`img`,`remark1`,`remark2`,`remark3`,`remark4`,`remark5`) values (1,1,'上汽大众',200000,'2019',400,'国产','1',1000,8,NULL,NULL,NULL,NULL,NULL,NULL),(2,1,'一汽大众',100000,'2019',400,'国产','1',1000,9,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `payment_method` */

DROP TABLE IF EXISTS `payment_method`;

CREATE TABLE `payment_method` (
  `pmid` int(11) NOT NULL AUTO_INCREMENT COMMENT '付款方式编号',
  `pmname` varchar(20) NOT NULL COMMENT '付款方式名称',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`pmid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=gbk COMMENT='付款方式表';

/*Data for the table `payment_method` */

insert  into `payment_method`(`pmid`,`pmname`,`remark1`,`remark2`,`remark3`,`remark4`,`remark5`) values (1,'支付宝',NULL,NULL,NULL,NULL,NULL),(2,'微信',NULL,NULL,NULL,NULL,NULL),(3,'刷卡',NULL,NULL,NULL,NULL,NULL),(4,'现金',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `people` */

DROP TABLE IF EXISTS `people`;

CREATE TABLE `people` (
  `pno` varchar(10) NOT NULL COMMENT '人员编号',
  `pname` varchar(10) NOT NULL COMMENT '人员姓名',
  `psex` char(2) NOT NULL COMMENT '人员性别',
  `pidcard` varchar(18) NOT NULL COMMENT '身份证',
  `paddress` varchar(50) NOT NULL COMMENT '居住地址',
  `pphone` varchar(11) NOT NULL COMMENT '联系电话',
  `ptellphone` varchar(11) NOT NULL COMMENT '手机',
  `pemail` varchar(20) NOT NULL COMMENT '邮箱',
  `spassword` varchar(10) DEFAULT '88888888' COMMENT '密码',
  `salt` varchar(50) DEFAULT '951753' COMMENT '盐',
  `pbank` varchar(20) DEFAULT NULL COMMENT '开户银行',
  `pbanknumber` varchar(20) DEFAULT NULL COMMENT '银行卡号',
  `presidenceaddress` varchar(50) DEFAULT NULL COMMENT '户口地址',
  `ptid` int(11) NOT NULL COMMENT '人员类型编号(外联人员类型表)',
  `img` varchar(100) DEFAULT NULL COMMENT '照片地址',
  `rid` int(11) DEFAULT NULL COMMENT '角色编号(默认1为普通员工)',
  `dimission` int(11) DEFAULT NULL COMMENT '是否离职',
  `dcause` varchar(100) DEFAULT NULL COMMENT '离职原因',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  PRIMARY KEY (`pno`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='人员表';

/*Data for the table `people` */

insert  into `people`(`pno`,`pname`,`psex`,`pidcard`,`paddress`,`pphone`,`ptellphone`,`pemail`,`spassword`,`salt`,`pbank`,`pbanknumber`,`presidenceaddress`,`ptid`,`img`,`rid`,`dimission`,`dcause`,`remark5`,`remark4`) values ('dzw001','彭玉媚','女','412345677777777777','株洲','10086','10086','10086@qq.com','88888888','951753','株洲支行','1234567891234567','湖南株洲',1,'1.jpg',NULL,NULL,NULL,NULL,NULL),('dzw002','钟鹏根','男','411111111111111111','株洲','13974123147','13974123147','871776974@qq.com','88888888','951753','株洲泰山路支行','1234567891234567','湖南株洲',2,'2.jpg',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `people_roles` */

DROP TABLE IF EXISTS `people_roles`;

CREATE TABLE `people_roles` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `pno` varchar(10) NOT NULL COMMENT '人员表编号(外联人员表)',
  `rid` int(11) NOT NULL COMMENT '角色编号(外联角色表)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=gbk COMMENT='用户角色中间表';

/*Data for the table `people_roles` */

insert  into `people_roles`(`id`,`pno`,`rid`) values (1,'dzw001',1),(2,'dzw002',2);

/*Table structure for table `peopletype` */

DROP TABLE IF EXISTS `peopletype`;

CREATE TABLE `peopletype` (
  `ptid` int(11) NOT NULL AUTO_INCREMENT COMMENT '人员类型编号',
  `ptname` varchar(10) NOT NULL COMMENT '人员类型名称',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  `remark6` varchar(10) DEFAULT NULL COMMENT '备注6',
  PRIMARY KEY (`ptid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=gbk COMMENT='人员类型表';

/*Data for the table `peopletype` */

insert  into `peopletype`(`ptid`,`ptname`,`remark1`,`remark2`,`remark3`,`remark4`,`remark5`,`remark6`) values (1,'员工',NULL,NULL,NULL,NULL,NULL,NULL),(2,'技工',NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `permission` */

DROP TABLE IF EXISTS `permission`;

CREATE TABLE `permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '权限编号',
  `name` varchar(10) NOT NULL COMMENT '权限名称',
  `cename` varchar(50) NOT NULL COMMENT '英文名称',
  `catalog` int(11) NOT NULL COMMENT '目录0、1功能',
  `parentid` int(11) NOT NULL COMMENT '父级编号，关联自身',
  `path` varchar(50) DEFAULT NULL COMMENT '权限路径 用于拦截权限',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=gbk COMMENT='权限表';

/*Data for the table `permission` */

insert  into `permission`(`id`,`name`,`cename`,`catalog`,`parentid`,`path`,`remark1`,`remark2`,`remark3`,`remark4`,`remark5`) values (1,'维修','Maintain',0,0,NULL,NULL,NULL,NULL,NULL,NULL),(2,'前台','Front',0,0,NULL,NULL,NULL,NULL,NULL,NULL),(3,'客服','Service',0,0,NULL,NULL,NULL,NULL,NULL,NULL),(4,'数据','Data',0,0,NULL,NULL,NULL,NULL,NULL,NULL),(5,'人事','Personnel',0,0,NULL,NULL,NULL,NULL,NULL,NULL),(6,'系统','System',0,0,NULL,NULL,NULL,NULL,NULL,NULL),(7,'维修救援','Maintenance',0,1,NULL,NULL,NULL,NULL,NULL,NULL),(8,'维修接车','Pick',0,7,'maintenance_one.html',NULL,NULL,NULL,NULL,NULL),(9,'竣工检验','completion',0,7,'completion.html',NULL,NULL,NULL,NULL,NULL),(10,'结算中心','Settlement',0,12,'settlement.html',NULL,NULL,NULL,NULL,NULL),(11,'会员充值卡管理','Member',0,12,'VipCenter.html',NULL,NULL,NULL,NULL,NULL),(12,'前台结算','front',0,2,NULL,NULL,NULL,NULL,NULL,NULL),(13,'客户档案','client',0,3,'customer_information.html',NULL,NULL,NULL,NULL,NULL),(14,'客户资料','material',0,13,'customer_information.html',NULL,NULL,NULL,NULL,NULL),(15,'车辆资料','vehicle',0,13,'cardata.html',NULL,NULL,NULL,NULL,NULL),(16,'主数据','main_data',0,4,NULL,NULL,NULL,NULL,NULL,NULL),(17,'发动机品牌','engine ',0,16,'enginebrand.html',NULL,NULL,NULL,NULL,NULL),(18,'车型档案','Model_file',0,16,'vehiclefile.html',NULL,NULL,NULL,NULL,NULL),(19,'维修项目','maintenance_items',0,16,'repair.html',NULL,NULL,NULL,NULL,NULL),(20,'商品资料','Commodity_unit',0,16,'data.html',NULL,NULL,NULL,NULL,NULL),(21,'供货单位','supplier',0,16,'supplyunit.html',NULL,NULL,NULL,NULL,NULL),(22,'员工资料','Employee_data',0,5,NULL,NULL,NULL,NULL,NULL,NULL),(23,'技工管理','mechanic_management',0,5,NULL,NULL,NULL,NULL,NULL,NULL),(24,'组织机构','institutional_framework',0,22,'organization_structure.html',NULL,NULL,NULL,NULL,NULL),(25,'岗位定义','Job_definition',0,22,'post.html',NULL,NULL,NULL,NULL,NULL),(26,'离职登记','Exit_registration',0,22,'quit.html',NULL,NULL,NULL,NULL,NULL),(27,'通讯名录','List_communication',0,22,'communication.html',NULL,NULL,NULL,NULL,NULL),(28,'技工星级','mechanic_star',0,23,'technician_level.html',NULL,NULL,NULL,NULL,NULL),(29,'班组技工','Shift_mechanic',0,23,'technician.html',NULL,NULL,NULL,NULL,NULL),(30,'外勤车辆','Field_vehicle',0,23,'gooutcar.html',NULL,NULL,NULL,NULL,NULL),(31,'权限控制','right_control',0,6,NULL,NULL,NULL,NULL,NULL,NULL),(32,'员工角色控制','Employee_control',0,31,'permissions.html',NULL,NULL,NULL,NULL,NULL),(33,'角色权限控制','Role_control',0,31,'role.html',NULL,NULL,NULL,NULL,NULL),(35,'角色查询','findRole',1,32,'/role/findRole',NULL,NULL,NULL,NULL,NULL),(36,'角色新增','addRole',1,32,'/role/addRole',NULL,NULL,NULL,NULL,NULL),(37,'角色修改','updateRole',1,32,'/role/updateRole',NULL,NULL,NULL,NULL,NULL),(38,'角色删除','deleteRole',1,32,'/role/deleteRole',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `place_origin` */

DROP TABLE IF EXISTS `place_origin`;

CREATE TABLE `place_origin` (
  `pid` int(11) NOT NULL AUTO_INCREMENT COMMENT '产地表',
  `pname` varchar(20) NOT NULL COMMENT '产地名称',
  `parentid` int(11) NOT NULL COMMENT '父级编号',
  `catalog` int(11) NOT NULL COMMENT '是否目录',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=gbk COMMENT='产地表';

/*Data for the table `place_origin` */

insert  into `place_origin`(`pid`,`pname`,`parentid`,`catalog`,`remark1`,`remark2`,`remark3`,`remark4`,`remark5`) values (1,'北京',0,0,NULL,NULL,NULL,NULL,NULL),(2,'上海',0,0,NULL,NULL,NULL,NULL,NULL),(3,'广州',0,0,NULL,NULL,NULL,NULL,NULL),(4,'西城区',1,0,NULL,NULL,NULL,NULL,NULL),(5,'朝阳区',1,0,NULL,NULL,NULL,NULL,NULL),(6,'虹口区',2,0,NULL,NULL,NULL,NULL,NULL),(7,'金山区',2,0,NULL,NULL,NULL,NULL,NULL),(8,'深圳',3,0,NULL,NULL,NULL,NULL,NULL),(9,'黄埔',3,0,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `price_class` */

DROP TABLE IF EXISTS `price_class`;

CREATE TABLE `price_class` (
  `pcid` int(11) NOT NULL AUTO_INCREMENT COMMENT '竣工价类编号',
  `pcname` varchar(10) NOT NULL COMMENT '竣工价类名称',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`pcid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='竣工价类表';

/*Data for the table `price_class` */

/*Table structure for table `price_type` */

DROP TABLE IF EXISTS `price_type`;

CREATE TABLE `price_type` (
  `ptid` int(11) NOT NULL AUTO_INCREMENT COMMENT '价格类型编号',
  `ptname` varchar(20) NOT NULL COMMENT '价格类型名称',
  `ptprice` float NOT NULL COMMENT '价格折扣率',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`ptid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=gbk COMMENT='价格类型表';

/*Data for the table `price_type` */

insert  into `price_type`(`ptid`,`ptname`,`ptprice`,`remark1`,`remark2`,`remark3`,`remark4`,`remark5`) values (1,'会员价',0.88,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `rescue_bill` */

DROP TABLE IF EXISTS `rescue_bill`;

CREATE TABLE `rescue_bill` (
  `bid` varchar(20) NOT NULL COMMENT '单据编号',
  `rbname` varchar(20) DEFAULT NULL COMMENT '救援单',
  `currentmileage` float DEFAULT NULL COMMENT '当前里程',
  `Dispatchingtime` datetime DEFAULT NULL COMMENT '派工时间',
  `tid` int(11) DEFAULT NULL COMMENT '派工班组编号',
  `gotime` datetime DEFAULT NULL COMMENT '出发时间',
  `goaddress` varchar(50) DEFAULT NULL COMMENT '出发地址',
  `cno` varchar(10) DEFAULT NULL COMMENT '车牌号码(外勤车辆)',
  `driving` float DEFAULT NULL COMMENT '行驶里程',
  `constructiontime` datetime DEFAULT NULL COMMENT '施工时间',
  `Rescueaddress` varchar(50) DEFAULT NULL COMMENT '救援地址',
  `Maintenancenote` varchar(100) DEFAULT NULL COMMENT '维修备注',
  `rescuestatement` varchar(100) DEFAULT NULL COMMENT '救援陈述',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备用字段5'
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='救援单';

/*Data for the table `rescue_bill` */

/*Table structure for table `resign` */

DROP TABLE IF EXISTS `resign`;

CREATE TABLE `resign` (
  `rid` int(11) NOT NULL AUTO_INCREMENT COMMENT '离职编号',
  `sno` varchar(10) NOT NULL COMMENT '人员编号',
  `rdate` datetime NOT NULL COMMENT '离职时间',
  `rreason` varchar(100) NOT NULL COMMENT '离职原因',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=gbk COMMENT='离职表';

/*Data for the table `resign` */

insert  into `resign`(`rid`,`sno`,`rdate`,`rreason`,`remark1`,`remark2`,`remark3`,`remark4`,`remark5`) values (1,'dzw002','2020-01-02 08:20:58','太肥了,回家减肥',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `rework_reason` */

DROP TABLE IF EXISTS `rework_reason`;

CREATE TABLE `rework_reason` (
  `rid` int(11) NOT NULL AUTO_INCREMENT COMMENT '返工原因编号',
  `rname` varchar(20) NOT NULL COMMENT '返工原因',
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='返工原因表';

/*Data for the table `rework_reason` */

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `rid` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色编号',
  `rname` varchar(10) NOT NULL COMMENT '角色名称',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  `remark6` varchar(10) DEFAULT NULL COMMENT '备注6',
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=gbk COMMENT='角色表';

/*Data for the table `role` */

insert  into `role`(`rid`,`rname`,`remark1`,`remark2`,`remark3`,`remark4`,`remark5`,`remark6`) values (1,'总经理',NULL,NULL,NULL,NULL,NULL,NULL),(2,'普通员工',NULL,NULL,NULL,NULL,NULL,NULL),(3,'保安队长',NULL,NULL,NULL,NULL,NULL,NULL),(4,'队长1',NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `roles_perms` */

DROP TABLE IF EXISTS `roles_perms`;

CREATE TABLE `roles_perms` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `rid` int(11) DEFAULT NULL COMMENT '关联角色编号',
  `pid` int(11) DEFAULT NULL COMMENT '关联权限编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=78 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

/*Data for the table `roles_perms` */

insert  into `roles_perms`(`id`,`rid`,`pid`) values (1,1,1),(2,1,2),(3,1,3),(4,1,4),(5,1,5),(6,1,6),(7,1,7),(8,1,8),(9,1,9),(11,1,11),(12,1,12),(13,1,13),(14,1,14),(15,1,15),(16,1,16),(17,1,17),(18,1,18),(19,1,19),(20,1,20),(21,1,21),(22,1,22),(23,1,23),(24,1,24),(25,1,25),(26,1,26),(27,1,27),(28,1,28),(29,1,29),(30,1,30),(31,1,31),(32,1,32),(33,1,33),(34,1,10),(35,2,1),(36,2,2),(37,2,3),(38,2,4),(39,2,5),(40,2,6),(41,2,7),(42,2,8),(43,2,9),(44,2,10),(45,2,11),(46,2,12),(47,2,13),(48,2,14),(49,2,15),(50,2,16),(51,2,17),(52,2,18),(53,2,19),(54,2,20),(55,2,21),(56,2,22),(57,2,23),(58,2,24),(59,2,25),(60,2,26),(61,2,27),(62,2,28),(63,2,29),(64,2,30),(65,2,31),(66,1,35),(67,1,36),(68,1,37),(69,1,38),(74,3,1),(75,3,7),(76,3,8),(77,3,9);

/*Table structure for table `sendcar` */

DROP TABLE IF EXISTS `sendcar`;

CREATE TABLE `sendcar` (
  `sid` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `cno` varchar(10) NOT NULL COMMENT '车牌',
  `pno` varchar(10) NOT NULL COMMENT '借车人',
  `date` datetime NOT NULL COMMENT '借车时间',
  `sdate` datetime DEFAULT NULL COMMENT '归还时间',
  `isSend` int(2) NOT NULL COMMENT '是否已还车',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='借还车表';

/*Data for the table `sendcar` */

/*Table structure for table `service_item` */

DROP TABLE IF EXISTS `service_item`;

CREATE TABLE `service_item` (
  `sidno` int(11) NOT NULL AUTO_INCREMENT COMMENT '服务项目编号',
  `sidname` varchar(20) NOT NULL COMMENT '服务项目名称',
  `toino` int(11) NOT NULL COMMENT '收入类型编号',
  `cbno` int(11) DEFAULT NULL COMMENT '车品牌编号',
  `mid` int(11) NOT NULL COMMENT '维修项目编号',
  `standardprice` float DEFAULT NULL COMMENT '标准价',
  `memberprice` float DEFAULT NULL COMMENT '会员价',
  `vipprice` float DEFAULT NULL COMMENT 'vip价',
  `agreementprice` float DEFAULT NULL COMMENT '协议价',
  `Insuranceprice` float DEFAULT NULL COMMENT '保险价',
  `claimprice` float DEFAULT NULL COMMENT '索赔价',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`sidno`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=gbk COMMENT='服务项目表';

/*Data for the table `service_item` */

insert  into `service_item`(`sidno`,`sidname`,`toino`,`cbno`,`mid`,`standardprice`,`memberprice`,`vipprice`,`agreementprice`,`Insuranceprice`,`claimprice`,`remark1`,`remark2`,`remark3`,`remark4`,`remark5`) values (1,'保养',1,1,7,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(3,'大哥大',1,1,6,100,80,80,90,90,90,'株洲',NULL,NULL,NULL,NULL);

/*Table structure for table `staff` */

DROP TABLE IF EXISTS `staff`;

CREATE TABLE `staff` (
  `sid` int(11) NOT NULL AUTO_INCREMENT COMMENT '员工编号',
  `pno` varchar(10) NOT NULL COMMENT '人员编号(外联人员表)',
  `jid` int(11) NOT NULL COMMENT '岗位编号(外联岗位表)',
  `rid` int(11) NOT NULL COMMENT '角色编号(外联角色表)',
  `shealth` varchar(10) DEFAULT NULL COMMENT '身体状况',
  `sheight` float DEFAULT NULL COMMENT '身高',
  `splace` varchar(50) DEFAULT NULL COMMENT '籍贯',
  `snation` varchar(10) DEFAULT NULL COMMENT '民族',
  `smarry` varchar(2) DEFAULT NULL COMMENT '婚姻状况(未婚,已婚)',
  `seducation` varchar(2) DEFAULT NULL COMMENT '学历(本科,大专,博士,硕士)',
  `sschool` varchar(10) DEFAULT NULL COMMENT '毕业学校',
  `smajor` varchar(10) DEFAULT NULL COMMENT '专业(计算机软件,网络工程)',
  `smajorlevel` varchar(5) DEFAULT NULL COMMENT '专业资格(初级工程师,高级工程师,中级工程师)',
  `sfiel` varchar(10) DEFAULT NULL COMMENT '属性(计考勤计薪，计考勤不计薪，不计考勤计薪，不计考勤不计薪)',
  `speople` varchar(10) DEFAULT NULL COMMENT '紧急联系人',
  `speoplephone` varchar(11) DEFAULT NULL COMMENT '联系人电话',
  `sindate` datetime DEFAULT NULL COMMENT '入职日期',
  `sinterniship` datetime DEFAULT NULL COMMENT '试用到期',
  `sbirthday` datetime DEFAULT NULL COMMENT '出生日期',
  `sstarttime` datetime DEFAULT NULL COMMENT '合同开始时间',
  `sendtime` datetime DEFAULT NULL COMMENT '合同结束时间',
  `srecommed` varchar(10) DEFAULT NULL COMMENT '推荐人',
  `snonumber` varchar(20) DEFAULT NULL COMMENT '卡自编号',
  `sinnumber` varchar(20) DEFAULT NULL COMMENT '卡内部编号',
  `salldiscount` float DEFAULT NULL COMMENT '整单折扣权',
  `sworkdiscount` float DEFAULT NULL COMMENT '工时折扣权',
  `sshopdiscount` float DEFAULT NULL COMMENT '商品折扣权',
  `sdiscount` float DEFAULT NULL COMMENT '减免权',
  `job_resume` varchar(50) DEFAULT NULL COMMENT '工作简历',
  `education_experience` varchar(50) DEFAULT NULL COMMENT '教育经历',
  `family_member` varchar(50) DEFAULT NULL COMMENT '家庭成员',
  `Disciplinary_records` varchar(50) DEFAULT NULL COMMENT '奖惩记录',
  `Employment_advice` varchar(50) DEFAULT NULL COMMENT '聘用意见',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `mid` int(11) NOT NULL COMMENT '部门编号',
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=gbk COMMENT='员工表';

/*Data for the table `staff` */

insert  into `staff`(`sid`,`pno`,`jid`,`rid`,`shealth`,`sheight`,`splace`,`snation`,`smarry`,`seducation`,`sschool`,`smajor`,`smajorlevel`,`sfiel`,`speople`,`speoplephone`,`sindate`,`sinterniship`,`sbirthday`,`sstarttime`,`sendtime`,`srecommed`,`snonumber`,`sinnumber`,`salldiscount`,`sworkdiscount`,`sshopdiscount`,`sdiscount`,`job_resume`,`education_experience`,`family_member`,`Disciplinary_records`,`Employment_advice`,`remark1`,`remark2`,`remark3`,`mid`) values (1,'dzw001',2,2,'正常',1.65,'湖南株洲','汉族','未婚','本科','湖南工业大学','计算机软件','中级工程师','计考勤计薪','钟鹏根','13974123147','2020-01-01 22:10:37','2020-02-01 22:11:23','2016-10-01 22:11:29','2020-01-01 22:12:00','2022-01-01 22:12:06','钟鹏根','001','001',0,0,0,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,3);

/*Table structure for table `team` */

DROP TABLE IF EXISTS `team`;

CREATE TABLE `team` (
  `tid` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `tname` varchar(10) NOT NULL COMMENT '班组名称',
  `catalog` int(11) NOT NULL COMMENT '是否目录,0是、1否',
  `parentid` int(11) NOT NULL COMMENT '父级编号',
  `tpower` int(11) NOT NULL COMMENT '班组权重',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=gbk COMMENT='班组表';

/*Data for the table `team` */

insert  into `team`(`tid`,`tname`,`catalog`,`parentid`,`tpower`,`remark1`,`remark2`,`remark3`,`remark4`,`remark5`) values (1,'自建',0,0,1,NULL,NULL,NULL,NULL,NULL),(2,'联队',0,0,1,NULL,NULL,NULL,NULL,NULL),(3,'加盟',0,0,1,NULL,NULL,NULL,NULL,NULL),(4,'合伙人',0,0,1,NULL,NULL,NULL,NULL,NULL),(5,'潘队',0,1,1,NULL,NULL,NULL,NULL,NULL),(6,'钟队',0,1,1,NULL,NULL,NULL,NULL,NULL),(7,'李队',0,2,2,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `vip` */

DROP TABLE IF EXISTS `vip`;

CREATE TABLE `vip` (
  `vno` varchar(20) NOT NULL COMMENT '会员卡号',
  `vjoindate` datetime DEFAULT NULL COMMENT '入会日期',
  `venddate` datetime DEFAULT NULL COMMENT '到期时间',
  `cno` varchar(10) DEFAULT NULL COMMENT '客户编号',
  `vlid` int(11) DEFAULT NULL COMMENT '会员等级编号',
  `currentjifen` int(11) DEFAULT NULL COMMENT '当前积分',
  `sumMoney` float DEFAULT NULL COMMENT '累积消费金额',
  `remark1` float DEFAULT NULL COMMENT '余额',
  `remark2` varchar(11) DEFAULT NULL COMMENT '手机号',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`vno`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='会员表';

/*Data for the table `vip` */

insert  into `vip`(`vno`,`vjoindate`,`venddate`,`cno`,`vlid`,`currentjifen`,`sumMoney`,`remark1`,`remark2`,`remark3`,`remark4`,`remark5`) values ('dzwvip001','2020-01-10 00:57:00','2020-01-10 00:57:00','cus2020001',1,0,0,1000,'13975584610',NULL,NULL,NULL),('dzwvip002','2020-02-12 02:52:34','2020-02-12 02:52:38','cus2020002',2,0,0,500,'111',NULL,NULL,NULL),('dzwvip004','2020-01-03 00:02:00','2020-01-13 00:02:00','cus2020001',1,0,0,500,'2222',NULL,NULL,NULL);

/*Table structure for table `viplevel` */

DROP TABLE IF EXISTS `viplevel`;

CREATE TABLE `viplevel` (
  `vlid` int(11) NOT NULL AUTO_INCREMENT COMMENT '会员等级编号',
  `vlname` varchar(20) NOT NULL COMMENT '会员等级名称',
  `startpoint` int(11) DEFAULT NULL COMMENT '开始积分',
  `discount` float DEFAULT NULL COMMENT '打折率',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`vlid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=gbk COMMENT='会员等级表';

/*Data for the table `viplevel` */

insert  into `viplevel`(`vlid`,`vlname`,`startpoint`,`discount`,`remark1`,`remark2`,`remark3`,`remark4`,`remark5`) values (1,'超级会员',200,0.88,NULL,NULL,NULL,NULL,NULL),(2,'会员',50,0.95,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `work` */

DROP TABLE IF EXISTS `work`;

CREATE TABLE `work` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `tid` int(11) DEFAULT NULL COMMENT '(外联班组表tid)',
  `winmorning` int(11) DEFAULT NULL COMMENT '站内白天',
  `winnight` int(11) DEFAULT NULL COMMENT '站内晚上',
  `woutmoning` int(11) DEFAULT NULL COMMENT '站外白天',
  `woutnight` int(11) DEFAULT NULL COMMENT '站外晚上',
  `wdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '当天时间',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='出工表';

/*Data for the table `work` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

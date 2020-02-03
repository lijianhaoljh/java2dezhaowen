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
  `bid` varchar(20) NOT NULL COMMENT '单号',
  `bstate` int(11) NOT NULL COMMENT '单据状态',
  `tid` int(11) NOT NULL COMMENT '班组编号',
  `cdlicense` varchar(10) DEFAULT NULL COMMENT '车辆资料编号(车牌号)',
  `pno` varchar(10) DEFAULT NULL COMMENT '人员编号(服务顾问)',
  `mid` int(11) DEFAULT NULL COMMENT '维修项目编号',
  `person` varchar(10) DEFAULT NULL COMMENT '责任人',
  `delays_reason` varchar(100) DEFAULT NULL COMMENT '误工原因',
  `quality` varchar(20) DEFAULT NULL COMMENT '质检员',
  `qualified` int(11) DEFAULT NULL COMMENT '是否合格',
  `n_rework` int(11) DEFAULT NULL COMMENT '返工次数',
  `p_amount` float DEFAULT NULL COMMENT '处罚金额',
  `rid` int(11) NOT NULL COMMENT '返工原因编号',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`bid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='单据表';

/*Data for the table `bills` */

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
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='车辆归属表';

/*Data for the table `carbelong` */

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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=gbk COMMENT='车品牌表';

/*Data for the table `carbrand` */

insert  into `carbrand`(`cbno`,`cbname`,`cbfirst`,`remark1`,`remark2`,`remark3`,`remark4`,`remark5`) values (1,'大众','D',NULL,NULL,NULL,NULL,NULL),(2,'丰田','F',NULL,NULL,NULL,NULL,NULL);

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
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='商品品牌表';

/*Data for the table `commodity_brand` */

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
  `package` varchar(20) DEFAULT NULL COMMENT '包装规格',
  `volume` float DEFAULT NULL COMMENT '体积',
  `grossweight` float DEFAULT NULL COMMENT '毛重',
  `netweight` float DEFAULT NULL COMMENT '净重',
  `stockprice` float DEFAULT NULL COMMENT '进货价',
  `markup` float DEFAULT NULL COMMENT '加价率',
  `exchangecode` varchar(50) DEFAULT NULL COMMENT '互换码',
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
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='商品单位表';

/*Data for the table `commodity_unit` */

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
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='原厂副厂表';

/*Data for the table `country_origin` */

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
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`cno`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='客户表';

/*Data for the table `customer` */

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
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='燃油类别表';

/*Data for the table `fuel` */

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
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='商品类型表';

/*Data for the table `goods_category` */

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
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='商品等级表';

/*Data for the table `grade_commodity` */

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
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='收入种类表';

/*Data for the table `income_type` */

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
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='保险公司表';

/*Data for the table `insurance` */

/*Table structure for table `invoice` */

DROP TABLE IF EXISTS `invoice`;

CREATE TABLE `invoice` (
  `invid` varchar(20) NOT NULL COMMENT '发票号',
  `invdate` datetime DEFAULT NULL COMMENT '开票日期',
  `invmoney` float DEFAULT NULL COMMENT '发票金额',
  PRIMARY KEY (`invid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='发票表';

/*Data for the table `invoice` */

/*Table structure for table `invoice_type` */

DROP TABLE IF EXISTS `invoice_type`;

CREATE TABLE `invoice_type` (
  `itid` int(11) NOT NULL AUTO_INCREMENT COMMENT '发票种类编号',
  `itname` varchar(20) NOT NULL COMMENT '发票种类名称',
  PRIMARY KEY (`itid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='发票种类表';

/*Data for the table `invoice_type` */

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
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='产商等级表';

/*Data for the table `level_producers` */

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
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='产商联系人表';

/*Data for the table `linkman` */

/*Table structure for table `maintain_bill` */

DROP TABLE IF EXISTS `maintain_bill`;

CREATE TABLE `maintain_bill` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `bid` varchar(20) NOT NULL COMMENT '单号',
  `mbname` varchar(20) DEFAULT '维修' COMMENT '维修单',
  `mile_factory` float DEFAULT NULL COMMENT '进厂里程',
  `oil_factory` float DEFAULT NULL COMMENT '进厂油量',
  `mile` float DEFAULT NULL COMMENT '上次里程',
  `efactory_time` datetime DEFAULT NULL COMMENT '进厂时间',
  `ecompletion_date` datetime DEFAULT NULL COMMENT '预计完工时间',
  `clearing_form` varchar(20) DEFAULT NULL COMMENT '结算方式',
  `inid` int(11) DEFAULT NULL COMMENT '保险公司编号',
  `time_completion` datetime DEFAULT NULL COMMENT '完工时间',
  `factory` datetime DEFAULT NULL COMMENT '上次进厂',
  `report` varchar(100) DEFAULT NULL COMMENT '报修陈述',
  `ecompletion_money` float DEFAULT NULL COMMENT '预估金额',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='维修单据表';

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
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='维修项目表';

/*Data for the table `maintenance` */

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
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='产商表';

/*Data for the table `manufacturer` */

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

insert  into `mechanic`(`pno`,`tid`,`jid`,`rid`,`mcisgroup`,`lid`,`mcworktype`,`mcbrand`,`remark1`,`remark2`,`remark3`,`remark4`,`remark5`) values ('dzw002',5,4,13,0,3,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

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
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='车型表';

/*Data for the table `motorcycle` */

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
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='付款方式表';

/*Data for the table `payment_method` */

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
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`pno`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='人员表';

/*Data for the table `people` */

insert  into `people`(`pno`,`pname`,`psex`,`pidcard`,`paddress`,`pphone`,`ptellphone`,`pemail`,`spassword`,`salt`,`pbank`,`pbanknumber`,`presidenceaddress`,`ptid`,`img`,`rid`,`dimission`,`dcause`,`remark4`,`remark5`) values ('dzw001','彭玉媚','女','412345677777777777','株洲','10086','10086','10086@qq.com','88888888','951753','株洲支行','1234567891234567','湖南株洲',1,'1.jpg',NULL,NULL,NULL,NULL,NULL),('dzw002','钟鹏根','男','411111111111111111','株洲','13974123147','13974123147','871776974@qq.com','88888888','951753','株洲泰山路支行','1234567891234567','湖南株洲',2,'2.jpg',NULL,NULL,NULL,NULL,NULL);

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
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=gbk COMMENT='权限表';

/*Data for the table `permission` */

insert  into `permission`(`id`,`name`,`cename`,`catalog`,`parentid`,`path`,`remark1`,`remark2`,`remark3`,`remark4`,`remark5`) values (1,'维修','Maintain',0,0,NULL,NULL,NULL,NULL,NULL,NULL),(2,'前台','Front',0,0,NULL,NULL,NULL,NULL,NULL,NULL),(3,'客服','Service',0,0,NULL,NULL,NULL,NULL,NULL,NULL),(4,'数据','Data',0,0,NULL,NULL,NULL,NULL,NULL,NULL),(5,'人事','Personnel',0,0,NULL,NULL,NULL,NULL,NULL,NULL),(6,'系统','System',0,0,NULL,NULL,NULL,NULL,NULL,NULL),(7,'维修救援','Maintenance',0,1,NULL,NULL,NULL,NULL,NULL,NULL),(8,'维修接车','Pick',1,7,NULL,NULL,NULL,NULL,NULL,NULL),(9,'竣工检验','completion',1,7,NULL,NULL,NULL,NULL,NULL,NULL),(10,'结算中心','Settlement',1,12,NULL,NULL,NULL,NULL,NULL,NULL),(11,'会员充值卡管理','Member',1,12,NULL,NULL,NULL,NULL,NULL,NULL),(12,'前台结算','front',0,2,NULL,NULL,NULL,NULL,NULL,NULL),(13,'客户档案','client',0,3,NULL,NULL,NULL,NULL,NULL,NULL),(14,'客户资料','material',1,13,NULL,NULL,NULL,NULL,NULL,NULL),(15,'车辆资料','vehicle',1,13,NULL,NULL,NULL,NULL,NULL,NULL),(16,'主数据','main_data',0,4,NULL,NULL,NULL,NULL,NULL,NULL),(17,'发动机品牌','engine ',1,16,NULL,NULL,NULL,NULL,NULL,NULL),(18,'车型档案','Model_file',1,16,NULL,NULL,NULL,NULL,NULL,NULL),(19,'维修项目','maintenance_items',1,16,NULL,NULL,NULL,NULL,NULL,NULL),(20,'商品资料','Commodity_unit',1,16,NULL,NULL,NULL,NULL,NULL,NULL),(21,'供货单位','supplier',1,16,NULL,NULL,NULL,NULL,NULL,NULL),(22,'员工资料','Employee_data',0,5,NULL,NULL,NULL,NULL,NULL,NULL),(23,'技工管理','mechanic_management',0,5,NULL,NULL,NULL,NULL,NULL,NULL),(24,'组织机构','institutional_framework',1,22,NULL,NULL,NULL,NULL,NULL,NULL),(25,'岗位定义','Job_definition',1,22,NULL,NULL,NULL,NULL,NULL,NULL),(26,'离职登记','Exit_registration',1,22,NULL,NULL,NULL,NULL,NULL,NULL),(27,'通讯名录','List_communication',1,22,NULL,NULL,NULL,NULL,NULL,NULL),(28,'技工星级','mechanic_star',1,23,NULL,NULL,NULL,NULL,NULL,NULL),(29,'班组技工','Shift_mechanic',1,23,NULL,NULL,NULL,NULL,NULL,NULL),(30,'外勤车辆','Field_vehicle',1,23,NULL,NULL,NULL,NULL,NULL,NULL),(31,'权限控制','right_control',0,6,NULL,NULL,NULL,NULL,NULL,NULL),(32,'员工权限控制','Employee_control',1,31,NULL,NULL,NULL,NULL,NULL,NULL),(33,'角色权限控制','Role_control',1,31,NULL,NULL,NULL,NULL,NULL,NULL);

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
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='产地表';

/*Data for the table `place_origin` */

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
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='价格类型表';

/*Data for the table `price_type` */

/*Table structure for table `rescue_bill` */

DROP TABLE IF EXISTS `rescue_bill`;

CREATE TABLE `rescue_bill` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `bid` varchar(20) NOT NULL COMMENT '单号',
  `rbname` varchar(20) DEFAULT '救援' COMMENT '救援单',
  `current_mileage` float DEFAULT NULL COMMENT '当前里程',
  `Dispatching_time` datetime DEFAULT NULL COMMENT '派工时间',
  `ecompletion_date` datetime DEFAULT NULL COMMENT '预计完工时间',
  `clearing_form` varchar(20) DEFAULT NULL COMMENT '结算方式',
  `inid` int(11) DEFAULT NULL COMMENT '保险公司编号',
  `go_off` datetime DEFAULT NULL COMMENT '出发时间',
  `go_address` varchar(100) DEFAULT NULL COMMENT '出发地址',
  `cno` varchar(10) DEFAULT NULL COMMENT '驾驶车辆(外勤车辆车牌)',
  `road_haul` float DEFAULT NULL COMMENT '行驶里程',
  `construction_time` datetime DEFAULT NULL COMMENT '施工时间',
  `raddress` varchar(100) DEFAULT NULL COMMENT '救援地址',
  `time_completion` datetime DEFAULT NULL COMMENT '完工时间',
  `ecompletion_money` float DEFAULT NULL COMMENT '预估金额',
  `maintain_remark` varchar(50) DEFAULT NULL COMMENT '维修备注',
  `rescue` varchar(100) DEFAULT NULL COMMENT '救援陈述',
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='救援单据表';

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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=gbk COMMENT='角色表';

/*Data for the table `role` */

insert  into `role`(`rid`,`rname`,`remark1`,`remark2`,`remark3`,`remark4`,`remark5`,`remark6`) values (1,'总经理',NULL,NULL,NULL,NULL,NULL,NULL),(2,'普通员工',NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `roles_perms` */

DROP TABLE IF EXISTS `roles_perms`;

CREATE TABLE `roles_perms` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `pid` int(11) NOT NULL COMMENT '权限编号(外联权限表)',
  `rid` int(11) NOT NULL COMMENT '角色编号(外联角色表)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=gbk COMMENT='角色权限中间表';

/*Data for the table `roles_perms` */

insert  into `roles_perms`(`id`,`pid`,`rid`) values (1,1,1),(2,2,1),(3,3,1),(4,4,1),(5,5,1),(6,6,1),(7,7,1),(8,8,1),(9,9,1),(10,10,1),(11,11,1),(12,12,1),(13,13,1),(14,14,1),(15,15,1),(16,16,1),(17,17,1),(18,18,1),(19,19,1),(20,20,1),(21,21,1),(22,22,1),(23,23,1),(24,24,1),(25,25,1),(26,26,1),(27,27,1),(28,28,1),(29,29,1),(30,30,1),(31,31,1),(32,32,1),(33,33,1),(34,1,2),(35,2,2),(36,3,2),(37,4,2),(38,5,2),(39,6,2),(40,7,2);

/*Table structure for table `service_item` */

DROP TABLE IF EXISTS `service_item`;

CREATE TABLE `service_item` (
  `sidno` int(11) NOT NULL AUTO_INCREMENT COMMENT '服务项目编号',
  `sidname` varchar(20) NOT NULL COMMENT '服务项目名称',
  `toino` int(11) NOT NULL COMMENT '收入类型编号',
  `cbno` int(11) NOT NULL COMMENT '车品牌编号',
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
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='服务项目表';

/*Data for the table `service_item` */

/*Table structure for table `staff` */

DROP TABLE IF EXISTS `staff`;

CREATE TABLE `staff` (
  `sid` int(11) NOT NULL AUTO_INCREMENT COMMENT '员工编号',
  `pno` varchar(10) NOT NULL COMMENT '人员编号(外联人员表)',
  `mid` int(11) NOT NULL COMMENT '组织机构表编号(外联组织机构表)',
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
  `sfiel` varchar(5) DEFAULT NULL COMMENT '属性(计考勤计薪，计考勤不计薪，不计考勤计薪，不计考勤不计薪)',
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
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=gbk COMMENT='员工表';

/*Data for the table `staff` */

insert  into `staff`(`sid`,`pno`,`mid`,`jid`,`rid`,`shealth`,`sheight`,`splace`,`snation`,`smarry`,`seducation`,`sschool`,`smajor`,`smajorlevel`,`sfiel`,`speople`,`speoplephone`,`sindate`,`sinterniship`,`sbirthday`,`sstarttime`,`sendtime`,`srecommed`,`snonumber`,`sinnumber`,`salldiscount`,`sworkdiscount`,`sshopdiscount`,`sdiscount`,`job_resume`,`education_experience`,`family_member`,`Disciplinary_records`,`Employment_advice`,`remark1`,`remark2`,`remark3`) values (1,'dzw001',3,2,2,'正常',1.65,'湖南株洲','汉族','未婚','本科','湖南工业大学','计算机软件','中级工程师','计考勤计薪','钟鹏根','13974123147','2020-01-01 22:10:37','2020-02-01 22:11:23','2016-10-01 22:11:29','2020-01-01 22:12:00','2022-01-01 22:12:06','钟鹏根','001','001',0,0,0,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

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
  `remark1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(10) DEFAULT NULL COMMENT '备注2',
  `remark3` varchar(10) DEFAULT NULL COMMENT '备注3',
  `remark4` varchar(10) DEFAULT NULL COMMENT '备注4',
  `remark5` varchar(10) DEFAULT NULL COMMENT '备注5',
  PRIMARY KEY (`vno`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='会员表';

/*Data for the table `vip` */

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
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='会员等级表';

/*Data for the table `viplevel` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

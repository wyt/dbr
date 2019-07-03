/*
 Navicat Premium Data Transfer

 Source Server         : bridge.sqlite
 Source Server Type    : SQLite
 Source Server Version : 3017000
 Source Schema         : main

 Target Server Type    : SQLite
 Target Server Version : 3017000
 File Encoding         : 65001

 Date: 03/07/2019 19:33:57
*/

PRAGMA foreign_keys = false;

-- ----------------------------
-- Table structure for T_APP_LOG
-- ----------------------------
DROP TABLE IF EXISTS "T_APP_LOG";
CREATE TABLE "T_APP_LOG" (
  "ID" varchar(255) NOT NULL,
  "BIZ_ID" varchar(255) NOT NULL,
  "DATA" varchar(255),
  "DATE_ADDED" datetime,
  "DATE_UPDATED" datetime,
  "MOUDLE" varchar(255),
  "STATUS" varchar(255),
  PRIMARY KEY ("ID"),
  UNIQUE ("ID" ASC),
  UNIQUE ("BIZ_ID" ASC)
);

-- ----------------------------
-- Table structure for T_AUTO_RUN
-- ----------------------------
DROP TABLE IF EXISTS "T_AUTO_RUN";
CREATE TABLE "T_AUTO_RUN" (
  "ID" varchar(255) NOT NULL,
  "DATE_ADDED" datetime,
  "DATE_UPDATED" datetime,
  "INFO" varchar(4000),
  "R_CODE" varchar(255),
  "TIMEOUT" bigint,
  "SHEET_ID" varchar(255),
  PRIMARY KEY ("ID"),
  UNIQUE ("ID" ASC)
);

-- ----------------------------
-- Table structure for T_SHEET
-- ----------------------------
DROP TABLE IF EXISTS "T_SHEET";
CREATE TABLE "T_SHEET" (
  "ID" varchar(255) NOT NULL,
  "DATA_ID" varchar(255),
  "DATE_ADDED" datetime,
  "DATE_UPDATED" datetime,
  "D_CONV_BILL_ID" varchar(255),
  "FEEDBACK" varchar(255),
  "SERVICE_ID" varchar(255),
  "SHEET" varchar(8000),
  "META_DATA_ID" varchar(255),
  PRIMARY KEY ("ID"),
  UNIQUE ("ID" ASC)
);

-- ----------------------------
-- Table structure for T_SHEET_METADATA
-- ----------------------------
DROP TABLE IF EXISTS "T_SHEET_METADATA";
CREATE TABLE "T_SHEET_METADATA" (
  "ID" varchar(255) NOT NULL,
  "DATE_ADDED" datetime,
  "DATE_UPDATED" datetime,
  "META_DATA" varchar(4000),
  PRIMARY KEY ("ID"),
  UNIQUE ("ID" ASC)
);

-- ----------------------------
-- Indexes structure for table T_APP_LOG
-- ----------------------------
CREATE INDEX "IDXyxp1bsgyqsvhvn4gjsymvclm"
ON "T_APP_LOG" (
  "BIZ_ID" ASC
);

PRAGMA foreign_keys = true;

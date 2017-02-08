package com.sam.stock.model;

public class Stock {
		/**
		 * 交易所类型
		 */
		private String type;
		/**
		 * 股票代码
		 */
		private String stock_code;
		/**
		 * 股票名称
		 */
		private String stock_name;
		/**
		 * 当前价格
		 */
		private Double cur_price;	
		/**
		 * 今日开盘价
		 */
		private Double today_open_price;	
		/**
		 * 昨日收盘价
		 */
		private Double yesterday_close_price;
		/**
		 * 今日最高价
		 */
		private Double today_top_price;	
		/**
		 * 今日最低价
		 */
		private Double today_bottom_price;
		/**
		 * 成交的股票数(手) 成交量除以100
		 */
		private long turnover;
		/**
		 * 成交金额(万)
		 */
		private Double turnover_price;
		/**
		 * 竞买价
		 */
		private Double bid_price;
		/**
		 * 竞卖价
		 */
		private Double competitive_price;
		
		/**
		 * 买一数量
		 */
		private Long buy1_count;
		/**
		 * 买一价格
		 */
		private Double buy1_price;
		/**
		 * 买二数量
		 */
		private Long buy2_count;
		/**
		 * 买二价格
		 */
		private Double buy2_price;
		/**
		 * 买三数量
		 */
		private Long buy3_count;
		/**
		 * 买三价格
		 */
		private Double buy3_price;
		/**
		 * 买四数量
		 */
		private Long buy4_count;
		/**
		 * 买四价格
		 */
		private Double buy4_price;
		/**
		 * 买五数量
		 */
		private Long buy5_count;
		/**
		 * 买五价格
		 */
		private Double buy5_price;
		
		
		/**
		 * 卖一数量
		 */
		private Long sell1_count;
		/**
		 * 卖一价格
		 */
		private Double sell1_price;
		/**
		 * 卖二数量
		 */
		private Long sell2_count;
		/**
		 * 卖二价格
		 */
		private Double sell2_price;
		/**
		 * 卖三数量
		 */
		private Long sell3_count;
		/**
		 * 卖三价格
		 */
		private Double sell3_price;
		/**
		 * 卖四数量
		 */
		private Long sell4_count;
		/**
		 * 卖四价格
		 */
		private Double sell4_price;
		/**
		 * 卖五数量
		 */
		private Long sell5_count;
		/**
		 * 卖五价格
		 */
		private Double sell5_price;
		
		/**
		 * 日期
		 */
		private String date;
		

		/**
		 * 时间
		 */
		private String time;
		
		/**
		 * 今日涨幅百分比
		 */
		private Double up_rate;	
		/**
		 * 今日涨幅数量
		 */
		private Double up_count;
		/**
		 * 振幅
		 */
		private Double zhenfu;
		

		/**
		 * 外盘
		 */
		private long waipan;
		/**
		 * 内盘
		 */
		private long neipan;
		/**
		 * 换手率
		 */
		private double change_rate;
		/**
		 * 市盈率
		 */
		private double shiying_rate;
		
		/**
		 * 流通市值
		 * @param code
		 * @param datas
		 * @param type
		 */
		private double liutong_price;
		/**
		 * 总市值
		 * @param code
		 * @param datas
		 * @param type
		 */
		private double total_price;
		/**
		 * 市净率
		 * @param code
		 * @param datas
		 * @param type
		 */
		private double shijing_rate;
		/**
		 * 涨停价
		 * @param code
		 * @param datas
		 * @param type
		 */
		private double limitUp_price;
		/**
		 * 跌停价
		 * @param code
		 * @param datas
		 * @param type
		 */
		private double limitDown_price;
		
		public Double getZhenfu() {
			return (this.today_top_price-this.today_open_price)/this.today_open_price*100;
		}
		public String getStock_code() {
			return stock_code;
		}
		public void setStock_code(String stock_code) {
			this.stock_code = stock_code;
		}
		public String getStock_name() {
			return stock_name;
		}
		public void setStock_name(String stock_name) {
			this.stock_name = stock_name;
		}
		public Double getCur_price() {
			return cur_price;
		}
		public void setCur_price(Double cur_price) {
			this.cur_price = cur_price;
		}
		public Double getToday_open_price() {
			return today_open_price;
		}
		public void setToday_open_price(Double today_open_price) {
			this.today_open_price = today_open_price;
		}
		public Double getYesterday_close_price() {
			return yesterday_close_price;
		}
		public void setYesterday_close_price(Double yesterday_close_price) {
			this.yesterday_close_price = yesterday_close_price;
		}
		public Double getToday_top_price() {
			return today_top_price;
		}
		public void setToday_top_price(Double today_top_price) {
			this.today_top_price = today_top_price;
		}
		public Double getToday_bottom_price() {
			return today_bottom_price;
		}
		public void setToday_bottom_price(Double today_bottom_price) {
			this.today_bottom_price = today_bottom_price;
		}
		public long getTurnover() {
			return turnover;
		}
		public void setTurnover(long turnover) {
			this.turnover = turnover;
		}
		public Double getTurnover_price() {
			return turnover_price;
		}
		public void setTurnover_price(Double turnover_price) {
			this.turnover_price = turnover_price;
		}
		public Double getBid_price() {
			return bid_price;
		}
		public void setBid_price(Double bid_price) {
			this.bid_price = bid_price;
		}
		public Double getCompetitive_price() {
			return competitive_price;
		}
		public void setCompetitive_price(Double competitive_price) {
			this.competitive_price = competitive_price;
		}
		public Long getBuy1_count() {
			return buy1_count;
		}
		public void setBuy1_count(Long buy1_count) {
			this.buy1_count = buy1_count;
		}
		public Double getBuy1_price() {
			return buy1_price;
		}
		public void setBuy1_price(Double buy1_price) {
			this.buy1_price = buy1_price;
		}
		public Long getBuy2_count() {
			return buy2_count;
		}
		public void setBuy2_count(Long buy2_count) {
			this.buy2_count = buy2_count;
		}
		public Double getBuy2_price() {
			return buy2_price;
		}
		public void setBuy2_price(Double buy2_price) {
			this.buy2_price = buy2_price;
		}
		public Long getBuy3_count() {
			return buy3_count;
		}
		public void setBuy3_count(Long buy3_count) {
			this.buy3_count = buy3_count;
		}
		public Double getBuy3_price() {
			return buy3_price;
		}
		public void setBuy3_price(Double buy3_price) {
			this.buy3_price = buy3_price;
		}
		public Long getBuy4_count() {
			return buy4_count;
		}
		public void setBuy4_count(Long buy4_count) {
			this.buy4_count = buy4_count;
		}
		public Double getBuy4_price() {
			return buy4_price;
		}
		public void setBuy4_price(Double buy4_price) {
			this.buy4_price = buy4_price;
		}
		public Long getBuy5_count() {
			return buy5_count;
		}
		public void setBuy5_count(Long buy5_count) {
			this.buy5_count = buy5_count;
		}
		public Double getBuy5_price() {
			return buy5_price;
		}
		public void setBuy5_price(Double buy5_price) {
			this.buy5_price = buy5_price;
		}
		public Long getSell1_count() {
			return sell1_count;
		}
		public void setSell1_count(Long sell1_count) {
			this.sell1_count = sell1_count;
		}
		public Double getSell1_price() {
			return sell1_price;
		}
		public void setSell1_price(Double sell1_price) {
			this.sell1_price = sell1_price;
		}
		public Long getSell2_count() {
			return sell2_count;
		}
		public void setSell2_count(Long sell2_count) {
			this.sell2_count = sell2_count;
		}
		public Double getSell2_price() {
			return sell2_price;
		}
		public void setSell2_price(Double sell2_price) {
			this.sell2_price = sell2_price;
		}
		public Long getSell3_count() {
			return sell3_count;
		}
		public void setSell3_count(Long sell3_count) {
			this.sell3_count = sell3_count;
		}
		public Double getSell3_price() {
			return sell3_price;
		}
		public void setSell3_price(Double sell3_price) {
			this.sell3_price = sell3_price;
		}
		public Long getSell4_count() {
			return sell4_count;
		}
		public void setSell4_count(Long sell4_count) {
			this.sell4_count = sell4_count;
		}
		public Double getSell4_price() {
			return sell4_price;
		}
		public void setSell4_price(Double sell4_price) {
			this.sell4_price = sell4_price;
		}
		public Long getSell5_count() {
			return sell5_count;
		}
		public void setSell5_count(Long sell5_count) {
			this.sell5_count = sell5_count;
		}
		public Double getSell5_price() {
			return sell5_price;
		}
		public void setSell5_price(Double sell5_price) {
			this.sell5_price = sell5_price;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getTime() {
			return time;
		}
		public void setTime(String time) {
			this.time = time;
		}
		public Double getUp_rate() {
			return up_rate;
		}
		public void setUp_rate(Double up_rate) {
			this.up_rate = up_rate;
		}


		public Double getUp_count() {
			return cur_price-yesterday_close_price;
		}
		

		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		
		public Stock(String code, String[] datas, String type, String siteName){
			if(siteName.equals("sina")){
				initSinaData(code, datas, type);
				up_rate = (cur_price-yesterday_close_price)/yesterday_close_price*100;
			} else if(siteName.equals("tencent")){
				initTencentData(code, datas, type);
			}
			
			
		}
		
		
		public void initSinaData(String code, String[] datas, String type){
			stock_code = code;
			stock_name = datas[0];
			today_open_price = Double.parseDouble(datas[1]);
			yesterday_close_price = Double.parseDouble(datas[2]);
			cur_price = Double.parseDouble(datas[3]);
			today_top_price = Double.parseDouble(datas[4]);
			today_bottom_price = Double.parseDouble(datas[5]);
			
			bid_price = Double.parseDouble(datas[6]);
			competitive_price = Double.parseDouble(datas[7]);
			
			turnover = Long.parseLong(datas[8])/100;
			turnover_price = Double.parseDouble(datas[9])/10000;
			
			buy1_count = Long.parseLong(datas[10])/100;
			buy1_price = Double.parseDouble(datas[11]);
			buy2_count = Long.parseLong(datas[12])/100;
			buy2_price = Double.parseDouble(datas[13]);
			buy3_count = Long.parseLong(datas[14])/100;
			buy3_price = Double.parseDouble(datas[15]);
			buy4_count = Long.parseLong(datas[16])/100;
			buy4_price = Double.parseDouble(datas[17]);
			buy5_count = Long.parseLong(datas[18])/100;
			buy5_price = Double.parseDouble(datas[19]);
			
			sell1_count = Long.parseLong(datas[20])/100;
			sell1_price = Double.parseDouble(datas[21]);
			sell2_count = Long.parseLong(datas[22])/100;
			sell2_price = Double.parseDouble(datas[23]);
			sell3_count = Long.parseLong(datas[24])/100;
			sell3_price = Double.parseDouble(datas[25]);
			sell4_count = Long.parseLong(datas[26])/100;
			sell4_price = Double.parseDouble(datas[27]);
			sell5_count = Long.parseLong(datas[28])/100;
			sell5_price = Double.parseDouble(datas[29]);
			
			date = datas[30];
			time = datas[31];
			
			this.type = type;
		}
		
		
		
		public long getWaipan() {
			return waipan;
		}
		public void setWaipan(long waipan) {
			this.waipan = waipan;
		}
		public long getNeipan() {
			return neipan;
		}
		public void setNeipan(long neipan) {
			this.neipan = neipan;
		}
		public double getChange_rate() {
			return change_rate;
		}
		public void setChange_rate(double change_rate) {
			this.change_rate = change_rate;
		}
		public double getShiying_rate() {
			return shiying_rate;
		}
		public void setShiying_rate(double shiying_rate) {
			this.shiying_rate = shiying_rate;
		}
		public double getLiutong_price() {
			return liutong_price;
		}
		public void setLiutong_price(double liutong_price) {
			this.liutong_price = liutong_price;
		}
		public double getTotal_price() {
			return total_price;
		}
		public void setTotal_price(double total_price) {
			this.total_price = total_price;
		}
		public double getShijing_rate() {
			return shijing_rate;
		}
		public void setShijing_rate(double shijing_rate) {
			this.shijing_rate = shijing_rate;
		}
		public double getLimitUp_price() {
			return limitUp_price;
		}
		public void setLimitUp_price(double limitUp_price) {
			this.limitUp_price = limitUp_price;
		}
		public double getLimitDown_price() {
			return limitDown_price;
		}
		public void setLimitDown_price(double limitDown_price) {
			this.limitDown_price = limitDown_price;
		}
		public String getDatetime() {
			return datetime;
		}
		public void setDatetime(String datetime) {
			this.datetime = datetime;
		}


		/**
		 * 时间
		 */
		private String datetime;
		
		public void initTencentData(String code, String[] datas, String type){
			stock_name = datas[1];
			stock_code = datas[2];
			cur_price = Double.parseDouble(datas[3]);
			yesterday_close_price = Double.parseDouble(datas[4]);
			today_open_price = Double.parseDouble(datas[5]);
			turnover = Long.parseLong(datas[6]);
			
			waipan = Long.parseLong(datas[7]);
			neipan = Long.parseLong(datas[8]);
			

			buy1_price = Double.parseDouble(datas[9]);
			buy1_count = Long.parseLong(datas[10]);
			buy2_price = Double.parseDouble(datas[11]);
			buy2_count = Long.parseLong(datas[12]);
			buy3_price = Double.parseDouble(datas[13]);
			buy3_count = Long.parseLong(datas[14]);
			buy4_price = Double.parseDouble(datas[15]);
			buy4_count = Long.parseLong(datas[16]);
			buy5_price = Double.parseDouble(datas[17]);
			buy5_count = Long.parseLong(datas[18]);
			

			sell1_price = Double.parseDouble(datas[19]);
			sell1_count = Long.parseLong(datas[20]);
			sell2_price = Double.parseDouble(datas[21]);
			sell2_count = Long.parseLong(datas[22]);
			sell3_price = Double.parseDouble(datas[23]);
			sell3_count = Long.parseLong(datas[24]);
			sell4_price = Double.parseDouble(datas[25]);
			sell4_count = Long.parseLong(datas[26]);
			sell5_price = Double.parseDouble(datas[27]);
			sell5_count = Long.parseLong(datas[28]);
			
			//最近逐笔成交
			String each_price = datas[29];
			//时间
			datetime = datas[30];
//			date = datas[30];
//			time = datas[31];
			
			
			up_rate = Double.parseDouble(datas[31]);
//			up_count = Double.parseDouble(datas[32]);
			
			today_top_price = Double.parseDouble(datas[33]);
			today_bottom_price = Double.parseDouble(datas[34]);
			
			//价格/成交量（手）/成交额
			String _temp = datas[35];
			
			turnover_price = Double.parseDouble(datas[37]);
			
			//换手率
			change_rate = Double.parseDouble(datas[38]);
			//市盈率
			shiying_rate = Double.parseDouble(datas[39]);
			
//			zhenfu = Double.parseDouble(datas[43]);
			
			liutong_price = Double.parseDouble(datas[44]);
			total_price = Double.parseDouble(datas[45]);
			shijing_rate = Double.parseDouble(datas[46]);
			limitUp_price = Double.parseDouble(datas[47]);
			limitDown_price = Double.parseDouble(datas[48]);
			
			
			
			
			
			
			
			
			
			
			this.type = type;
		}

	}

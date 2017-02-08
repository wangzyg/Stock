package com.sam.stock.poller;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;

import com.sam.stock.model.Stock;
import com.sam.stock.utils.Utils;

public class ProbeForSina {

	public void start(){
		
//		String url = "http://hq.sinajs.cn/list=sh600151,sz000830,s_sh000001,s_sz399001,s_sz399106";  
		String url = "http://hq.sinajs.cn/list=sz000830";  
		  try {  
		      URL u = new URL(url);  
		      byte[] b = new byte[256];  
		      InputStream in = null;  
		      ByteArrayOutputStream bo = new ByteArrayOutputStream();  
		      while (true) {  
		          try {  
		              in = u.openStream();  
		              int i;  
		              while ((i = in.read(b)) != -1) {  
		                  bo.write(b, 0, i);  
		              }  
		              String result = bo.toString();  
		              
		              String[] stocks = result.split(";");  
		              for (String stock : stocks) {  
		            	  if(stock == null){
		            		  System.out.println("返回数据为空！！！");
		            		  continue;
		            	  }
		            	  if(stock.indexOf("\"")<0){
		            		  //System.out.println("没有包含双引号！！！");
		            		  continue;
		            	  }
		            	  System.out.println(stock);
		            	  String code = stock.substring(0, stock.indexOf("\""));
		            	  code = code.replaceAll("var hq_str_", "").replaceAll("=", "");
		            	  String gp_code = code.substring(code.length()-6, code.length());
		            	  code = code.replaceAll(gp_code, "");
		            	  stock = stock.substring(stock.indexOf("\"")+1, stock.length()-1);
		            	  String type = "";
		            	  
		            	  if(code.indexOf("s_")>=0){
		            		  type = code.replaceAll("s_", "");
		            		  continue;
		            	  } else {
		            		  type = code;
		            	  }
		            	  
		            	  //System.out.println(stock);
		                  String[] datas = stock.split(","); 
		                  //System.out.println("datas.length="+datas.length);
		                  //本地变量
		                  Stock st = new Stock(gp_code, datas, type);
//		                  String stock_name = datas[0];
//		                  Double today_open_price = Double.parseDouble(datas[1]);
//		                  Double yesterday_close_price = Double.parseDouble(datas[2]);
//		                  Double cur_price = Double.parseDouble(datas[3]);
//		                  Double up_rate = (cur_price-yesterday_close_price)/yesterday_close_price*100;
		                  //根据对照自己对应数据  
		                  System.out.println("股票:"+st.getStock_name()+"("+st.getStock_code()+")");
		                  System.out.println("当前价格:"+Utils.doubleToStr(st.getCur_price())+ " 涨幅:"+Utils.doubleToStr(st.getUp_rate())+"% "+Utils.doubleToStr(st.getUp_count()));
		                  System.out.println("今日开盘价:"+Utils.doubleToStr(st.getToday_open_price()));
		                  System.out.println("昨日收盘价:"+Utils.doubleToStr(st.getYesterday_close_price()));
		                  
		                  System.out.println("今日最高价:"+st.getToday_top_price());
		                  System.out.println("今日最低价:"+st.getToday_bottom_price());
		                  System.out.println("竞买价，即“买一”报价:"+st.getBid_price());
		                  System.out.println("竞卖价，即“卖一”报价:"+st.getCompetitive_price());
		                  System.out.println("成交的股票数:"+st.getTurnover()+"手");
		                  System.out.println("成交金额(万):"+Utils.doubleToStr(st.getTurnover_price()));
		                  System.out.println("买一:"+st.getBuy1_count()+"手 价格:"+st.getBuy1_price());
		                  System.out.println("买二:"+st.getBuy2_count()+"手 价格:"+st.getBuy1_price());
		                  System.out.println("买三:"+st.getBuy3_count()+"手 价格:"+st.getBuy1_price());
		                  System.out.println("买四:"+st.getBuy4_count()+"手 价格:"+st.getBuy1_price());
		                  System.out.println("买五:"+st.getBuy5_count()+"手 价格:"+Double.parseDouble(datas[19]));
//		                  
//
//		                  System.out.println("卖一:"+Integer.parseInt(datas[20])/100+"手 价格:"+Double.parseDouble(datas[21]));
//		                  System.out.println("卖二:"+Integer.parseInt(datas[22])/100+"手 价格:"+Double.parseDouble(datas[23]));
//		                  System.out.println("卖三:"+Integer.parseInt(datas[24])/100+"手 价格:"+Double.parseDouble(datas[25]));
//		                  System.out.println("卖四:"+Integer.parseInt(datas[26])/100+"手 价格:"+Double.parseDouble(datas[27]));
//		                  System.out.println("卖五:"+Integer.parseInt(datas[28])/100+"手 价格:"+Double.parseDouble(datas[29]));

		                  System.out.println("振幅:"+Utils.doubleToStr(st.getZhenfu())+"%");
		                  
		                  System.out.println("日期:"+datas[30]+" "+datas[31]);
		                  System.out.println("未知:"+datas[32]);
		                  System.out.println("------------------------------------");
		              }  
		              bo.reset();  
		          } catch (Exception e) {  
		              System.out.println(e.getMessage());  
		          } finally {  
		              if (in != null) {  
		                  in.close();  
		              }  
		          }  
		          Thread.sleep(2000);
		      }  
		  } catch (Exception ex) {  
		      System.out.println(ex.getMessage());  
		  }  
	}
	
	public static void main(String [] args){
		new ProbeForSina().start();
	}
}

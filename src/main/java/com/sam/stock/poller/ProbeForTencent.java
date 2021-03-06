package com.sam.stock.poller;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import com.sam.stock.model.Stock;
import com.sam.stock.utils.Utils;

public class ProbeForTencent {
	public void start(){

//		String url = "http://hq.sinajs.cn/list=sh600151,sz000830,s_sh000001,s_sz399001,s_sz399106";  
		String url = "http://qt.gtimg.cn/q=sz000858,sz000830";  
		  try {  
		      URL u = new URL(url);  
		      byte[] b = new byte[256];  
		      InputStream in = null;  
		      ByteArrayOutputStream bo = new ByteArrayOutputStream();  
		      while (true) {  
		          try {  
		        	  URLConnection conn = u.openConnection();//或HttpURLConnection connect = (HttpURLConnection) connection.openConnection();  
				      BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"GBK"));  
		              String result = null;  
		              while((result = br.readLine()) != null){
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
			            	  code = code.replaceAll("v_", "").replaceAll("=", "");
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
//			            	  System.out.println(type);
//			            	  System.out.println(gp_code);
			            	  
			            	  String[] datas = stock.split("~"); 
			            	  //本地变量
			                  Stock st = new Stock(gp_code, datas, type, "tencent");
			                  
			                  System.out.println("股票:"+st.getStock_name()+"("+st.getStock_code()+")");
			                  System.out.println("当前价格:"+Utils.doubleToStr(st.getCur_price())+ " 涨幅:"+Utils.doubleToStr(st.getUp_rate())+"% "+Utils.doubleToStr(st.getUp_count()));
			                  System.out.println("今日开盘价:"+Utils.doubleToStr(st.getToday_open_price()));
			                  System.out.println("昨日收盘价:"+Utils.doubleToStr(st.getYesterday_close_price()));
			                  
			                  System.out.println("今日最高价:"+st.getToday_top_price());
			                  System.out.println("今日最低价:"+st.getToday_bottom_price());
			                  System.out.println("竞买价，即“买一”报价:"+st.getBuy1_price());
			                  System.out.println("竞卖价，即“卖一”报价:"+st.getSell1_price());
			                  System.out.println("成交的股票数:"+st.getTurnover()+"手");
			                  System.out.println("成交金额(万):"+Utils.doubleToStr(st.getTurnover_price()));
			                  System.out.println("买一:"+st.getBuy1_count()+"手 价格:"+st.getBuy1_price());
			                  System.out.println("买二:"+st.getBuy2_count()+"手 价格:"+st.getBuy1_price());
			                  System.out.println("买三:"+st.getBuy3_count()+"手 价格:"+st.getBuy1_price());
			                  System.out.println("买四:"+st.getBuy4_count()+"手 价格:"+st.getBuy1_price());
			                  System.out.println("买五:"+st.getBuy5_count()+"手 价格:"+Double.parseDouble(datas[19]));
//			                  
	//
//			                  System.out.println("卖一:"+Integer.parseInt(datas[20])/100+"手 价格:"+Double.parseDouble(datas[21]));
//			                  System.out.println("卖二:"+Integer.parseInt(datas[22])/100+"手 价格:"+Double.parseDouble(datas[23]));
//			                  System.out.println("卖三:"+Integer.parseInt(datas[24])/100+"手 价格:"+Double.parseDouble(datas[25]));
//			                  System.out.println("卖四:"+Integer.parseInt(datas[26])/100+"手 价格:"+Double.parseDouble(datas[27]));
//			                  System.out.println("卖五:"+Integer.parseInt(datas[28])/100+"手 价格:"+Double.parseDouble(datas[29]));

			                  System.out.println("振幅:"+Utils.doubleToStr(st.getZhenfu())+"%");
			                  
			                  System.out.println("日期:"+st.getDatetime());
			                  System.out.println("------------------------------------");
			              }
		              }
		              br.close();
		              bo.close();  
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
		new ProbeForTencent().start();
	}
}

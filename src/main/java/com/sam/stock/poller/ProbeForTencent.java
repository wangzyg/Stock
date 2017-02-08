package com.sam.stock.poller;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;

public class ProbeForTencent {
	public void start(){

//		String url = "http://hq.sinajs.cn/list=sh600151,sz000830,s_sh000001,s_sz399001,s_sz399106";  
		String url = "http://qt.gtimg.cn/q=sz000858";  
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
		new ProbeForTencent().start();
	}
}

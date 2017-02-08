package com.sam.stock.utils;

import java.text.DecimalFormat;

public class Utils {
	
	/**
	 * 格式化Double，保留小数点后两位
	 * @param d
	 * @return
	 */
	public static String doubleToStr(Double d){
		return new DecimalFormat("######0.00").format(d); 
	}
}

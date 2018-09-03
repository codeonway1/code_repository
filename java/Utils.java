package jp.co.nttdata.batch.logic;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Utils {
	/**
     * 日期字符串格式判定
     * @param strDate  日期字符串
     * @param dateFormat　日期格式字符串
     * @return 是日期格式的场合：true 不是日期格式的场合：false
     */
    public static boolean isDate(String strDate,String dateFormat) {
    	SimpleDateFormat simpleDateFormat=new SimpleDateFormat(dateFormat);
    	simpleDateFormat.setLenient(false);
    	try {
            simpleDateFormat.parse(strDate);
        } catch(ParseException px) {
            return false;
        }
    	return true;
    }
}


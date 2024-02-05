package Agenda.utils;

import java.util.*;

public class AgendaUtils {
	public static Date getDateFromString(String dataStr){
		Calendar data = Calendar.getInstance();
		data.set(Calendar.YEAR, Integer.parseInt(dataStr.substring(6, 10)));
		data.set(Calendar.MONTH, Integer.parseInt(dataStr.substring(3, 5)));
		data.set(Calendar.DAY_OF_MONTH, Integer.parseInt(dataStr.substring(0, 2)));

		return data.getTime();
	}
}

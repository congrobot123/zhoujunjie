import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;
import java.text.ParseException;
import static java.text.DateFormat.*;

public class TestDateFormat 
{
	public static void main(String[] args)
		throws ParseException
	{
		//日期对象格式化成一个字符串
		Date date = new Date();
		Locale[] locales = {Locale.CHINA, Locale.US};
		DateFormat[] df = new DateFormat[8];

		for(int i=0; i < locales.length; ++i)
		{
			df[i*4] = DateFormat.getDateInstance(SHORT, locales[i]);
			df[i*4 + 1] = DateFormat.getDateInstance(MEDIUM, locales[i]);
			df[i*4 + 2] = DateFormat.getDateInstance(LONG, locales[i]);
			df[i*4 + 3] = DateFormat.getDateInstance(FULL, locales[i]);
		}

		for(int i=0; i < locales.length; ++i)
		{
			System.out.println(df[i*4].format(date));
			System.out.println(df[i*4 + 1].format(date));
			System.out.println(df[i*4 + 2].format(date));
			System.out.println(df[i*4 + 3].format(date));
		}

		//解析字符串到日期对象
		String str1 = "2014-12-12";
		String str2 = "2014年12月10日";
		//String str3 = "20141210";

		Date d1 = DateFormat.getDateInstance().parse(str1);
		Date d2 = DateFormat.getDateInstance(LONG).parse(str2);
		//Date d3 = DateFormat.getDateInstance(LONG).parse(str3);

		System.out.println(d1);
		System.out.println(d2);
		//System.out.println(d3);
	}
}

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class TestSimpleDateFomat
{
	public static void main(String[] args)
		throws ParseException
	{
		String str1 = "20141210";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

		Date d1 = sdf.parse(str1);

		System.out.println(d1);
	}
}

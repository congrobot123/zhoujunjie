import java.util.Locale;
import java.util.ResourceBundle;
import java.text.MessageFormat;

class TestInternation 
{
	public static void main(String[] args) 
	{
		if(args.length == 2)
		{
			String name = args[0];
			String language = args[1];
			Locale myLocale = null;

			if(args[1].equals("CN"))
			{
				myLocale = new Locale("zh", "CN");
			}
			else if(args[1].equals("US"))
			{
				myLocale = new Locale("en", "US");
			}
			else
			{
				System.out.println("enter error");
			}

			ResourceBundle bundle = ResourceBundle.getBundle("mess", myLocale);

			String msg = bundle.getString("msg");

			System.out.println(MessageFormat.format(msg, name));
		}
		else
		{
			System.out.println("enter error");
		}
	}
}

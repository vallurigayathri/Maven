
public class Choclate implements Bottle {
	int we;
	Choclate(int we){
		this.we=we;
	}
	public int weight(int tw)
	{
		tw+=we;
		return  tw;
	}
	
	public int no_candy(int l,int h,int s)
	{
		if(we>=l && we<=h)
		{
			s++;
		}
	return s;	
	}

}

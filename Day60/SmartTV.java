package Day60;

public class SmartTV extends TV{
int channelCount=200;

public void play() {
	System.out.println("SmartTV playing");
}

@Override
	public int getChannelCount() {
		
		return channelCount;
	}

public static void main(String[] args) {
//	TV tv1= new SmartTV();
//	System.out.println(tv1.channelCount);
//	tv1.play();
//	System.out.println(tv1.getChannelCount());
	int a=5;
	int b=a;
	a=10;
	System.out.println(b);
	
	String c="Harmony";
	String d=c;
	c="School";
	System.out.println(d);
	
			

}
}

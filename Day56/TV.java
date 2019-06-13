package Day56;

public class TV {
		  int channel=1;
		  int volumeLevel=1;
		  boolean on=false;
		  String brand="undefined";
		  
		  public TV(){
		    System.out.println("Creating TV object using no Args- constructor");
		  }
		  
		  public TV(String brand){
		    System.out.println("Creating TV object using 1 arg - constructor");
		  }

		public int getChannel() {
			return channel;
		}

		public void setChannel(int channel) {
			this.channel = channel;
		}

		public int getVolumeLevel() {
			return volumeLevel;
		}

		public void setVolumeLevel(int volumeLevel) {
			this.volumeLevel = volumeLevel;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}
		public void volumeUp() {
			if( volumeLevel>0) {
			volumeLevel=volumeLevel+1;}
			else
			{
				System.out.println("ERROR: TV is either OFF or invalid Volume level");
			}
			
				
		}
		public void volumeDown() {
			if(volumeLevel>0 && volumeLevel<7)
			volumeLevel=volumeLevel-1;
			else
			{
				System.out.println("ERROR: TV is either OFF or invalid Volume level");
			}
			
		}
		public void channelUp() {
			if( && channel>0)
			channel=channel+1;
			else
			{
				System.out.println("ERROR: TV is either OFF or invalid Channel");
			}
		}
		public void channelDown() {
			if(channel>0 && channel<120)
			channel=channel-1;
			else
			{
				System.out.println("ERROR: TV is either OFF or invalid Channel");
			}
		}
		
		public void turnOn() {
			if(on==false) {
				on=true;
			}
			else if(on==true)
			{
				System.out.println("TV is already ON");
			}
			
			public void turnOff() {
				if(on==true) {
					on=false;
				}
				else if(on==false)
				{
					System.out.println("TV is already OFF");
				}	
				
				
		}
		
		
		
		
}


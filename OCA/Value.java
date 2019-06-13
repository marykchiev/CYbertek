package OCA;

public class Value {
	private int val;
	  private boolean modified;
	  public Value(int a){
	    this.val=a;
	  }
	  
	  public Value(){
	    
	  }

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
		this.modified=true;
	}
	
	public boolean wasModified() {
		return modified;
	}
	
	  
	
}

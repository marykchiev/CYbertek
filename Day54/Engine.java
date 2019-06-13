package Day54;

public class Engine {
String engineType;
int cylinderCount;

public Engine(String engineType, int sylinderCount) {
	this.engineType=engineType;
	this.cylinderCount=cylinderCount;
}

void start() {
	System.out.println("Engine "+engineType+" with cylinder count "+cylinderCount+" is starting");
}


public String toString() {
	return "Engine [engineType=" + engineType + ", cylinderCount=" + cylinderCount + "]";
}

}

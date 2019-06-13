package Day54;

public class Stadium {
int capacity;
String name;

public Stadium(int capacity, String name) {
	this.capacity=capacity;
	this.name=name;
}

public int getCapacity() {
	return capacity;
}

public void setCapacity(int capacity) {
	this.capacity = capacity;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Stadium [capacity=" + capacity + ", name=" + name + "]";
}




}


package Observer;

import java.util.*;

public class WeatherData extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;
	private LinkedList<Observer> observers;
	
	public void measurementsChanged() {
		this.setChanged();
		this.notifyObservers();
	}
	
	
	public void setMeasurements(float temp, float humid, float press) {
		this.temperature = temp;
		this.humidity = humid;
		this.pressure = press;
		this.measurementsChanged();
	}
	
	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
		
	
}

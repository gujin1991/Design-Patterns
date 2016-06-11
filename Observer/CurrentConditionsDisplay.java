package Observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements DisplayElements, Observer {
	private float temperature;
	private float humidity;
	Observable observable;
	
	
	public CurrentConditionsDisplay(Observable o) {
		this.observable = o;
		this.observable.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			this.display();
		}
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current conditions: " + this.temperature 
				+ "F degrees and " + humidity + "% humidity");
	}

}

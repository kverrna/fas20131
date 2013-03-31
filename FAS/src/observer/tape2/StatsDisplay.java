package observer.tape2;

public class StatsDisplay implements Observer, DisplayElement{
	
	private float mintemp =0;
	private float avgtemp =0;
	private float maxtemp =0;
	private WeatherData weatherData; 

	/**
	 */
	public StatsDisplay(WeatherData weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);

	}

	
	@Override	
	public void update(float temp, float humidity, float pressure){
		if (temp>this.maxtemp){
			this.maxtemp = temp;
		}
		if (temp<this.mintemp){
			this.mintemp = temp;
		}
		if (this.avgtemp>0){
			this.avgtemp = (this.avgtemp + temp)/2;
		}
		
		display();
	}

	@Override
	public void display() {
		System.out.println("Max : "+ maxtemp + " Min : "+ mintemp + " Average : "+ avgtemp);
		
	}

		
}

package observer.pratica;

public class WeatherStation {
	public static void main (String[] args){
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		StatsDisplay statsDisplay = new StatsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
		
		weatherData.setMeasurements(30, 70, 30.4f);
		weatherData.setMeasurements(27, 70, 29.2f);
		weatherData.setMeasurements(20, 40, 21.7f);
		
		//weatherData.setMeasurements(80, 65, 30.4f);
		//weatherData.setMeasurements(82, 70, 29.2f);
		//weatherData.setMeasurements(100, 20, 29.2f);
		
		
	} 
}

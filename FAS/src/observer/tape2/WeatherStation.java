package observer.tape2;

public class WeatherStation {
	public static void main (String[] args){
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		StatsDisplay statsDisplay = new StatsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(30, 40, 30.4f);
		weatherData.setMeasurements(27, 70, 29.2f);
		weatherData.setMeasurements(20, 80, 21.7f);
		
		
	} 

}

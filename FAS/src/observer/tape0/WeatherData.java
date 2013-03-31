package observer.tape0;

public class WeatherData {

	/**
	 * @uml.property  name="temperature"
	 */
	private int temperature;

	/**
	 * Getter of the property <tt>temperature</tt>
	 * @return  Returns the temperature.
	 * @uml.property  name="temperature"
	 */
	public int getTemperature() {
		return temperature;
	}

	/**
	 * Setter of the property <tt>temperature</tt>
	 * @param temperature  The temperature to set.
	 * @uml.property  name="temperature"
	 */
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	/**
	 * @uml.property  name="humidity"
	 */
	private int humidity;

	/**
	 * Getter of the property <tt>humidity</tt>
	 * @return  Returns the humidity.
	 * @uml.property  name="humidity"
	 */
	public int getHumidity() {
		return humidity;
	}

	/**
	 * Setter of the property <tt>humidity</tt>
	 * @param humidity  The humidity to set.
	 * @uml.property  name="humidity"
	 */
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	/**
	 * @uml.property  name="pressure"
	 */
	private int pressure;

	/**
	 * Getter of the property <tt>pressure</tt>
	 * @return  Returns the pressure.
	 * @uml.property  name="pressure"
	 */
	public int getPressure() {
		return pressure;
	}

	/**
	 * Setter of the property <tt>pressure</tt>
	 * @param pressure  The pressure to set.
	 * @uml.property  name="pressure"
	 */
	public void setPressure(int pressure) {
		this.pressure = pressure;
	}

		
		/**
		 */
		public void measurementsChanged(){
		}

}

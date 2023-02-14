package org.example.weather_forecast;

public class Weather {
    public String date;
    public String weatherDay;
    public String kindOfWth;
    public String temperature;
    public String pressure;
    public String kindOfWind;
    public String wind;
    public String humidity;

    public Weather(String date, String weatherDay, String kindOfWth, String temperature, String pressure, String kindOfWind, String wind, String humidity) {
        this.date = date;
        this.weatherDay = weatherDay;
        this.kindOfWth = kindOfWth;
        this.temperature = temperature;
        this.pressure = pressure;
        this.kindOfWind = kindOfWind;
        this.wind = wind;
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "date='" + date + '\'' +
                ", weatherDay='" + weatherDay + '\'' +
                ", kindOfWth='" + kindOfWth + '\'' +
                ", temperature='" + temperature + '\'' +
                ", pressure='" + pressure + '\'' +
                ", kindOfWind='" + kindOfWind + '\'' +
                ", wind='" + wind + '\'' +
                ", humidity='" + humidity + '\'' +
                '}' + "\n";
    }
}
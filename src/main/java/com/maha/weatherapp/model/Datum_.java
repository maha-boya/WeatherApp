
package com.maha.weatherapp.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "time",
    "summary",
    "icon",
    "precipIntensity",
    "precipProbability",
    "temperature",
    "apparentTemperature",
    "dewPoint",
    "humidity",
    "pressure",
    "windSpeed",
    "windGust",
    "windBearing",
    "cloudCover",
    "uvIndex",
    "visibility",
    "ozone",
    "precipType"
})
public class Datum_ {

    @JsonProperty("time")
    private Integer time;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("icon")
    private String icon;
    @JsonProperty("precipIntensity")
    private Float precipIntensity;
    @JsonProperty("precipProbability")
    private Float precipProbability;
    @JsonProperty("temperature")
    private Float temperature;
    @JsonProperty("apparentTemperature")
    private Float apparentTemperature;
    @JsonProperty("dewPoint")
    private Float dewPoint;
    @JsonProperty("humidity")
    private Float humidity;
    @JsonProperty("pressure")
    private Float pressure;
    @JsonProperty("windSpeed")
    private Float windSpeed;
    @JsonProperty("windGust")
    private Float windGust;
    @JsonProperty("windBearing")
    private Integer windBearing;
    @JsonProperty("cloudCover")
    private Float cloudCover;
    @JsonProperty("uvIndex")
    private Integer uvIndex;
    @JsonProperty("visibility")
    private Integer visibility;
    @JsonProperty("ozone")
    private Float ozone;
    @JsonProperty("precipType")
    private String precipType;

    @JsonProperty("time")
    public Integer getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(Integer time) {
        this.time = time;
    }

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    @JsonProperty("icon")
    public String getIcon() {
        return icon;
    }

    @JsonProperty("icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    @JsonProperty("precipIntensity")
    public Float getPrecipIntensity() {
        return precipIntensity;
    }

    @JsonProperty("precipIntensity")
    public void setPrecipIntensity(Float precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    @JsonProperty("precipProbability")
    public Float getPrecipProbability() {
        return precipProbability;
    }

    @JsonProperty("precipProbability")
    public void setPrecipProbability(Float precipProbability) {
        this.precipProbability = precipProbability;
    }

    @JsonProperty("temperature")
    public Float getTemperature() {
        return temperature;
    }

    @JsonProperty("temperature")
    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    @JsonProperty("apparentTemperature")
    public Float getApparentTemperature() {
        return apparentTemperature;
    }

    @JsonProperty("apparentTemperature")
    public void setApparentTemperature(Float apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
    }

    @JsonProperty("dewPoint")
    public Float getDewPoint() {
        return dewPoint;
    }

    @JsonProperty("dewPoint")
    public void setDewPoint(Float dewPoint) {
        this.dewPoint = dewPoint;
    }

    @JsonProperty("humidity")
    public Float getHumidity() {
        return humidity;
    }

    @JsonProperty("humidity")
    public void setHumidity(Float humidity) {
        this.humidity = humidity;
    }

    @JsonProperty("pressure")
    public Float getPressure() {
        return pressure;
    }

    @JsonProperty("pressure")
    public void setPressure(Float pressure) {
        this.pressure = pressure;
    }

    @JsonProperty("windSpeed")
    public Float getWindSpeed() {
        return windSpeed;
    }

    @JsonProperty("windSpeed")
    public void setWindSpeed(Float windSpeed) {
        this.windSpeed = windSpeed;
    }

    @JsonProperty("windGust")
    public Float getWindGust() {
        return windGust;
    }

    @JsonProperty("windGust")
    public void setWindGust(Float windGust) {
        this.windGust = windGust;
    }

    @JsonProperty("windBearing")
    public Integer getWindBearing() {
        return windBearing;
    }

    @JsonProperty("windBearing")
    public void setWindBearing(Integer windBearing) {
        this.windBearing = windBearing;
    }

    @JsonProperty("cloudCover")
    public Float getCloudCover() {
        return cloudCover;
    }

    @JsonProperty("cloudCover")
    public void setCloudCover(Float cloudCover) {
        this.cloudCover = cloudCover;
    }

    @JsonProperty("uvIndex")
    public Integer getUvIndex() {
        return uvIndex;
    }

    @JsonProperty("uvIndex")
    public void setUvIndex(Integer uvIndex) {
        this.uvIndex = uvIndex;
    }

    @JsonProperty("visibility")
    public Integer getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    @JsonProperty("ozone")
    public Float getOzone() {
        return ozone;
    }

    @JsonProperty("ozone")
    public void setOzone(Float ozone) {
        this.ozone = ozone;
    }

    @JsonProperty("precipType")
    public String getPrecipType() {
        return precipType;
    }

    @JsonProperty("precipType")
    public void setPrecipType(String precipType) {
        this.precipType = precipType;
    }

}

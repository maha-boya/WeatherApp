
package com.maha.weatherapp.model;

import java.time.LocalDate;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "latitude",
    "longitude",
    "timezone",
    "currently",
    "minutely",
    "hourly",
    "daily",
    "flags",
    "offset"
})
@Document(collection= "weather-data")
public class DarkSkyApiResponce {

    @JsonProperty("latitude")
    private Float latitude;
    @JsonProperty("longitude")
    private Float longitude;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("currently")
    private Currently currently;
    @JsonProperty("minutely")
    private Minutely minutely;
    @JsonProperty("hourly")
    private Hourly hourly;
    @JsonProperty("daily")
    private Daily daily;
    @JsonProperty("flags")
    private Flags flags;
    @JsonProperty("offset")
    private Integer offset;

    private String city;
    private LocalDate date;
    
    public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@JsonProperty("latitude")
    public Float getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("longitude")
    public Float getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @JsonProperty("currently")
    public Currently getCurrently() {
        return currently;
    }

    @JsonProperty("currently")
    public void setCurrently(Currently currently) {
        this.currently = currently;
    }

    @JsonProperty("minutely")
    public Minutely getMinutely() {
        return minutely;
    }

    @JsonProperty("minutely")
    public void setMinutely(Minutely minutely) {
        this.minutely = minutely;
    }

    @JsonProperty("hourly")
    public Hourly getHourly() {
        return hourly;
    }

    @JsonProperty("hourly")
    public void setHourly(Hourly hourly) {
        this.hourly = hourly;
    }

    @JsonProperty("daily")
    public Daily getDaily() {
        return daily;
    }

    @JsonProperty("daily")
    public void setDaily(Daily daily) {
        this.daily = daily;
    }

    @JsonProperty("flags")
    public Flags getFlags() {
        return flags;
    }

    @JsonProperty("flags")
    public void setFlags(Flags flags) {
        this.flags = flags;
    }

    @JsonProperty("offset")
    public Integer getOffset() {
        return offset;
    }

    @JsonProperty("offset")
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

}

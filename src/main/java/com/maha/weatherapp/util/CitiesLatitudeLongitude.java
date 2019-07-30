package com.maha.weatherapp.util;

import java.util.HashMap;



public class CitiesLatitudeLongitude {

	public String getlatitudeLongitude() {
		HashMap<String, LatitudeLongitude> map = new HashMap<String, LatitudeLongitude> ();
		
		map.put("Campbell,CA",new LatitudeLongitude("", ""));
		map.put("String",new LatitudeLongitude("", ""));
		map.put("String",new LatitudeLongitude("", ""));
		map.put("String",new LatitudeLongitude("", ""));
		map.put("String",new LatitudeLongitude("", ""));
		
		return null;
	}
	class LatitudeLongitude {

		public LatitudeLongitude(String latitude, String longitude) {
			super();
			this.latitude = latitude;
			this.longitude = longitude;
		}

		private String latitude;
		private String longitude;

		public String getLatitude() {
			return latitude;
		}

		public void setLatitude(String latitude) {
			this.latitude = latitude;
		}

		public String getLongitude() {
			return longitude;
		}

		public void setLongitude(String longitude) {
			this.longitude = longitude;
		}

	}
}

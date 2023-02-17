package co.grandcircus.hotelsearch;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Hotel")
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String city;
	private String hotelName;
	private int pricePerNight;

	public Hotel() {
		super();
	}

	public Hotel(Long id, String city, String hotelName, Integer pricePerNight) {
		super();
		this.id = id;
		this.city = city;
		this.hotelName = hotelName;
		this.pricePerNight = pricePerNight;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHotelName() {
		return this.hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public Integer getPricePerNight() {
		return this.pricePerNight;
	}

	public void setPricePerNight(Integer pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	@Override
	public String toString() {
		return "Hotel [id=" + this.id + ", city=" + this.city + ", hotelName=" + this.hotelName + ", pricePerNight="
				+ this.pricePerNight + "]";
	}

}

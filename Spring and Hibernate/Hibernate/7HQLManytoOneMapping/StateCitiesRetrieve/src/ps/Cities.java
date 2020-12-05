package ps;

public class Cities {

	private int cityId;
	private String cityName;
	private State parentObject;
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public State getParentObject() {
		return parentObject;
	}
	public void setParentObject(State parentObject) {
		this.parentObject = parentObject;
	}
	
}

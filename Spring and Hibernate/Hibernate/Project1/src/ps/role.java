package ps;

import java.util.Set;

public class role {

	private int idrole;
	private int rcreate;
	private int rread;
	private int rupdate;
	private int rdelete;
	private int rexecute;
	private String name;
	private String name_short;
	
	private Set comp;
	
	private Set user;
	
	private Set region;
	
	private Set circle;
	
	private Set division;
	
	private Set subdivision;
	
	private Set distcenter_zone;

	public Set getUser() {
		return user;
	}

	public void setUser(Set user) {
		this.user = user;
	}

	public Set getDistcenter_zone() {
		return distcenter_zone;
	}

	public void setDistcenter_zone(Set distcenter_zone) {
		this.distcenter_zone = distcenter_zone;
	}

	public Set getSubdivision() {
		return subdivision;
	}

	public void setSubdivision(Set subdivision) {
		this.subdivision = subdivision;
	}

	public Set getDivision() {
		return division;
	}

	public void setDivision(Set division) {
		this.division = division;
	}

	public Set getCircle() {
		return circle;
	}

	public void setCircle(Set circle) {
		this.circle = circle;
	}

	public Set getRegion() {
		return region;
	}

	public void setRegion(Set region) {
		this.region = region;
	}

	public int getIdrole() {
		return idrole;
	}

	public void setIdrole(int idrole) {
		this.idrole = idrole;
	}

	public int getRcreate() {
		return rcreate;
	}

	public void setRcreate(int rcreate) {
		this.rcreate = rcreate;
	}

	public int getRread() {
		return rread;
	}

	public void setRread(int rread) {
		this.rread = rread;
	}

	public int getRupdate() {
		return rupdate;
	}

	public void setRupdate(int rupdate) {
		this.rupdate = rupdate;
	}

	public int getRdelete() {
		return rdelete;
	}

	public void setRdelete(int rdelete) {
		this.rdelete = rdelete;
	}

	public int getRexecute() {
		return rexecute;
	}

	public void setRexecute(int rexecute) {
		this.rexecute = rexecute;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName_short() {
		return name_short;
	}

	public void setName_short(String name_short) {
		this.name_short = name_short;
	}

	public Set getComp() {
		return comp;
	}

	public void setComp(Set comp) {
		this.comp = comp;
	}
	
		
}

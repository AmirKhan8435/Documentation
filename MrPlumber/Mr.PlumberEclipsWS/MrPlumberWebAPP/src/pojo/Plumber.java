package pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Plumber {
	
	public int plumberId;

	
	public String plumberAadharNo;

	
	public String plumberAddress;

	
	public String plumberEmail;

	
	public String plumberFirstname;

	
	public Date plumberJoindate;

	public String plumberLastname;

	public String plumberPassword;

	public String plumberPhone;

	public byte[] plumberPhoto;

	public int plumberPincode;

	public String plumberUsername;

	public Plumber() {
		
	
	}

	public Plumber(int plumberId, String plumberAadharNo, String plumberAddress, String plumberEmail,
			String plumberFirstname, Date plumberJoindate, String plumberLastname, String plumberPassword,
			String plumberPhone, byte[] plumberPhoto, int plumberPincode, String plumberUsername) {
		super();
		this.plumberId = plumberId;
		this.plumberAadharNo = plumberAadharNo;
		this.plumberAddress = plumberAddress;
		this.plumberEmail = plumberEmail;
		this.plumberFirstname = plumberFirstname;
		this.plumberJoindate = plumberJoindate;
		this.plumberLastname = plumberLastname;
		this.plumberPassword = plumberPassword;
		this.plumberPhone = plumberPhone;
		this.plumberPhoto = plumberPhoto;
		this.plumberPincode = plumberPincode;
		this.plumberUsername = plumberUsername;
	}

	public int getPlumberId() {
		return plumberId;
	}

	public void setPlumberId(int plumberId) {
		this.plumberId = plumberId;
	}

	public String getPlumberAadharNo() {
		return plumberAadharNo;
	}

	public void setPlumberAadharNo(String plumberAadharNo) {
		this.plumberAadharNo = plumberAadharNo;
	}

	public String getPlumberAddress() {
		return plumberAddress;
	}

	public void setPlumberAddress(String plumberAddress) {
		this.plumberAddress = plumberAddress;
	}

	public String getPlumberEmail() {
		return plumberEmail;
	}

	public void setPlumberEmail(String plumberEmail) {
		this.plumberEmail = plumberEmail;
	}

	public String getPlumberFirstname() {
		return plumberFirstname;
	}

	public void setPlumberFirstname(String plumberFirstname) {
		this.plumberFirstname = plumberFirstname;
	}

	public Date getPlumberJoindate() {
		return plumberJoindate;
	}

	public void setPlumberJoindate(Date plumberJoindate) {
		this.plumberJoindate = plumberJoindate;
	}

	public String getPlumberLastname() {
		return plumberLastname;
	}

	public void setPlumberLastname(String plumberLastname) {
		this.plumberLastname = plumberLastname;
	}

	public String getPlumberPassword() {
		return plumberPassword;
	}

	public void setPlumberPassword(String plumberPassword) {
		this.plumberPassword = plumberPassword;
	}

	public String getPlumberPhone() {
		return plumberPhone;
	}

	public void setPlumberPhone(String plumberPhone) {
		this.plumberPhone = plumberPhone;
	}

	public byte[] getPlumberPhoto() {
		return plumberPhoto;
	}

	public void setPlumberPhoto(byte[] plumberPhoto) {
		this.plumberPhoto = plumberPhoto;
	}

	public int getPlumberPincode() {
		return plumberPincode;
	}

	public void setPlumberPincode(int plumberPincode) {
		this.plumberPincode = plumberPincode;
	}

	public String getPlumberUsername() {
		return plumberUsername;
	}

	public void setPlumberUsername(String plumberUsername) {
		this.plumberUsername = plumberUsername;
	}

}

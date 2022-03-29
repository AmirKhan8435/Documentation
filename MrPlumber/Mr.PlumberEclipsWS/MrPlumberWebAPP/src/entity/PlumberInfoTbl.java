package entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the plumber_info_tbl database table.
 * 
 */
@Entity
@Table(name="plumber_info_tbl")
@NamedQuery(name="PlumberInfoTbl.findAll", query="SELECT p FROM PlumberInfoTbl p")
public class PlumberInfoTbl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="plumber_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int plumberId;

	@Lob
	@Column(name="plumber_aadhar_no")
	private String plumberAadharNo;

	@Column(name="plumber_address")
	private String plumberAddress;

	@Column(name="plumber_email")
	private String plumberEmail;

	@Column(name="plumber_firstname")
	private String plumberFirstname;

	@Temporal(TemporalType.DATE)
	@Column(name="plumber_joindate")
	private Date plumberJoindate;

	@Column(name="plumber_lastname")
	private String plumberLastname;

	@Column(name="plumber_password")
	private String plumberPassword;

	@Lob
	@Column(name="plumber_phone")
	private String plumberPhone;

	@Lob
	@Column(name="plumber_photo")
	private byte[] plumberPhoto;

	@Column(name="plumber_pincode")
	private int plumberPincode;

	@Column(name="plumber_username")
	private String plumberUsername;

	//bi-directional many-to-one association to PlumberServiceMapTbl
	@OneToMany(mappedBy="plumberInfoTbl")
	private List<PlumberServiceMapTbl> plumberServiceMapTbls;

	public PlumberInfoTbl() {
	}

	public int getPlumberId() {
		return this.plumberId;
	}

	public void setPlumberId(int plumberId) {
		this.plumberId = plumberId;
	}

	public String getPlumberAadharNo() {
		return this.plumberAadharNo;
	}

	public void setPlumberAadharNo(String plumberAadharNo) {
		this.plumberAadharNo = plumberAadharNo;
	}

	public String getPlumberAddress() {
		return this.plumberAddress;
	}

	public void setPlumberAddress(String plumberAddress) {
		this.plumberAddress = plumberAddress;
	}

	public String getPlumberEmail() {
		return this.plumberEmail;
	}

	public void setPlumberEmail(String plumberEmail) {
		this.plumberEmail = plumberEmail;
	}

	public String getPlumberFirstname() {
		return this.plumberFirstname;
	}

	public void setPlumberFirstname(String plumberFirstname) {
		this.plumberFirstname = plumberFirstname;
	}

	public Date getPlumberJoindate() {
		return this.plumberJoindate;
	}

	public void setPlumberJoindate(Date plumberJoindate) {
		this.plumberJoindate = plumberJoindate;
	}

	public String getPlumberLastname() {
		return this.plumberLastname;
	}

	public void setPlumberLastname(String plumberLastname) {
		this.plumberLastname = plumberLastname;
	}

	public String getPlumberPassword() {
		return this.plumberPassword;
	}

	public void setPlumberPassword(String plumberPassword) {
		this.plumberPassword = plumberPassword;
	}

	public String getPlumberPhone() {
		return this.plumberPhone;
	}

	public void setPlumberPhone(String plumberPhone) {
		this.plumberPhone = plumberPhone;
	}

	public byte[] getPlumberPhoto() {
		return this.plumberPhoto;
	}

	public void setPlumberPhoto(byte[] plumberPhoto) {
		this.plumberPhoto = plumberPhoto;
	}

	public int getPlumberPincode() {
		return this.plumberPincode;
	}

	public void setPlumberPincode(int plumberPincode) {
		this.plumberPincode = plumberPincode;
	}

	public String getPlumberUsername() {
		return this.plumberUsername;
	}

	public void setPlumberUsername(String plumberUsername) {
		this.plumberUsername = plumberUsername;
	}

	public List<PlumberServiceMapTbl> getPlumberServiceMapTbls() {
		return this.plumberServiceMapTbls;
	}

	public void setPlumberServiceMapTbls(List<PlumberServiceMapTbl> plumberServiceMapTbls) {
		this.plumberServiceMapTbls = plumberServiceMapTbls;
	}

	public PlumberServiceMapTbl addPlumberServiceMapTbl(PlumberServiceMapTbl plumberServiceMapTbl) {
		getPlumberServiceMapTbls().add(plumberServiceMapTbl);
		plumberServiceMapTbl.setPlumberInfoTbl(this);

		return plumberServiceMapTbl;
	}

	public PlumberServiceMapTbl removePlumberServiceMapTbl(PlumberServiceMapTbl plumberServiceMapTbl) {
		getPlumberServiceMapTbls().remove(plumberServiceMapTbl);
		plumberServiceMapTbl.setPlumberInfoTbl(null);

		return plumberServiceMapTbl;
	}

}
package entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the customer_info_tbl database table.
 * 
 */
@Entity
@Table(name="customer_info_tbl")
@NamedQuery(name="CustomerInfoTbl.findAll", query="SELECT c FROM CustomerInfoTbl c")
public class CustomerInfoTbl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="customer_id")
	private int customerId;

	@Column(name="customer_address")
	private String customerAddress;

	@Column(name="customer_email")
	private String customerEmail;

	@Column(name="customer_firstname")
	private String customerFirstname;

	@Column(name="customer_lastname")
	private String customerLastname;

	@Column(name="customer_password")
	private String customerPassword;

	@Column(name="customer_phone")
	private int customerPhone;

	@Column(name="customer_pincode")
	private int customerPincode;

	@Column(name="customer_username")
	private String customerUsername;

	//bi-directional many-to-one association to BookingTbl
	@OneToMany(mappedBy="customerInfoTbl")
	private List<BookingTbl> bookingTbls;

	public CustomerInfoTbl() {
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerAddress() {
		return this.customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerEmail() {
		return this.customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerFirstname() {
		return this.customerFirstname;
	}

	public void setCustomerFirstname(String customerFirstname) {
		this.customerFirstname = customerFirstname;
	}

	public String getCustomerLastname() {
		return this.customerLastname;
	}

	public void setCustomerLastname(String customerLastname) {
		this.customerLastname = customerLastname;
	}

	public String getCustomerPassword() {
		return this.customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public int getCustomerPhone() {
		return this.customerPhone;
	}

	public void setCustomerPhone(int customerPhone) {
		this.customerPhone = customerPhone;
	}

	public int getCustomerPincode() {
		return this.customerPincode;
	}

	public void setCustomerPincode(int customerPincode) {
		this.customerPincode = customerPincode;
	}

	public String getCustomerUsername() {
		return this.customerUsername;
	}

	public void setCustomerUsername(String customerUsername) {
		this.customerUsername = customerUsername;
	}

	public List<BookingTbl> getBookingTbls() {
		return this.bookingTbls;
	}

	public void setBookingTbls(List<BookingTbl> bookingTbls) {
		this.bookingTbls = bookingTbls;
	}

	public BookingTbl addBookingTbl(BookingTbl bookingTbl) {
		getBookingTbls().add(bookingTbl);
		bookingTbl.setCustomerInfoTbl(this);

		return bookingTbl;
	}

	public BookingTbl removeBookingTbl(BookingTbl bookingTbl) {
		getBookingTbls().remove(bookingTbl);
		bookingTbl.setCustomerInfoTbl(null);

		return bookingTbl;
	}

}
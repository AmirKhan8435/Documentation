package project.entities;

import java.io.Serializable;
import java.sql.Time;

import javax.persistence.*;


import java.util.Date;
import java.util.List;


/**
 * The persistent class for the booking_tbl database table.
 * 
 */
@Entity
@Table(name="booking_tbl")
@NamedQuery(name="BookingTbl.findAll", query="SELECT b FROM BookingTbl b")
public class BookingTbl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="booking_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bookingId;

	@Temporal(TemporalType.DATE)
	@Column(name="booking_date")
	private Date bookingDate;

	@Column(name="booking_status")
	private String bookingStatus;

	@Column(name="booking_total_amount")
	private int bookingTotalAmount;

	@Column(name="work_address")
	private String workAddress;

	@Temporal(TemporalType.DATE)
	@Column(name="work_date")
	private Date workDate;

	@Column(name="work_pincode")
	private int workPincode;

	@Column(name="work_time")
	private Time workTime;

	//bi-directional many-to-one association to BookingServiceMapTbl
	@OneToMany(mappedBy="bookingTbl")
	private List<BookingServiceMapTbl> bookingServiceMapTbls;

	//bi-directional many-to-one association to CustomerInfoTbl
	@ManyToOne
	@JoinColumn(name="customer_id")
	private CustomerInfoTbl customerInfoTbl;

	public BookingTbl() {
	}

	public int getBookingId() {
		return this.bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public Date getBookingDate() {
		return this.bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getBookingStatus() {
		return this.bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public int getBookingTotalAmount() {
		return this.bookingTotalAmount;
	}

	public void setBookingTotalAmount(int bookingTotalAmount) {
		this.bookingTotalAmount = bookingTotalAmount;
	}

	public String getWorkAddress() {
		return this.workAddress;
	}

	public void setWorkAddress(String workAddress) {
		this.workAddress = workAddress;
	}

	public Date getWorkDate() {
		return this.workDate;
	}

	public void setWorkDate(Date workDate) {
		this.workDate = workDate;
	}

	public int getWorkPincode() {
		return this.workPincode;
	}

	public void setWorkPincode(int workPincode) {
		this.workPincode = workPincode;
	}

	public Time getWorkTime() {
		return this.workTime;
	}

	public void setWorkTime(Time workTime) {
		this.workTime = workTime;
	}

	public List<BookingServiceMapTbl> getBookingServiceMapTbls() {
		return this.bookingServiceMapTbls;
	}

	public void setBookingServiceMapTbls(List<BookingServiceMapTbl> bookingServiceMapTbls) {
		this.bookingServiceMapTbls = bookingServiceMapTbls;
	}

	public BookingServiceMapTbl addBookingServiceMapTbl(BookingServiceMapTbl bookingServiceMapTbl) {
		getBookingServiceMapTbls().add(bookingServiceMapTbl);
		bookingServiceMapTbl.setBookingTbl(this);

		return bookingServiceMapTbl;
	}

	public BookingServiceMapTbl removeBookingServiceMapTbl(BookingServiceMapTbl bookingServiceMapTbl) {
		getBookingServiceMapTbls().remove(bookingServiceMapTbl);
		bookingServiceMapTbl.setBookingTbl(null);

		return bookingServiceMapTbl;
	}

	public CustomerInfoTbl getCustomerInfoTbl() {
		return this.customerInfoTbl;
	}

	public void setCustomerInfoTbl(CustomerInfoTbl customerInfoTbl) {
		this.customerInfoTbl = customerInfoTbl;
	}
	
	public BookingTbl(int id)
	{
		this.bookingId = id;
	}

}
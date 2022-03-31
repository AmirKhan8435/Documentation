package project.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="booking_service_map_tbl")
@NamedQuery(name="BookingServiceMapTbl.findAll", query="SELECT b FROM BookingServiceMapTbl b")
public class BookingServiceMapTbl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="booking_service_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bookingServiceId;

	//bi-directional many-to-one association to BookingTbl
	@ManyToOne
	@JoinColumn(name="booking_id")
	private BookingTbl bookingTbl;

	//bi-directional many-to-one association to PlumberServiceMapTbl
	@ManyToOne
	@JoinColumn(name="plumber_service_map_id")
	private PlumberServiceMapTbl plumberServiceMapTbl;

	//bi-directional many-to-one association to FeedbackTbl
	@OneToMany(mappedBy="bookingServiceMapTbl")
	private List<FeedbackTbl> feedbackTbls;

	public BookingServiceMapTbl() {
	}

	public int getBookingServiceId() {
		return this.bookingServiceId;
	}

	public void setBookingServiceId(int bookingServiceId) {
		this.bookingServiceId = bookingServiceId;
	}

	public BookingTbl getBookingTbl() {
		return this.bookingTbl;
	}

	public void setBookingTbl(BookingTbl bookingTbl) {
		this.bookingTbl = bookingTbl;
	}

	public PlumberServiceMapTbl getPlumberServiceMapTbl() {
		return this.plumberServiceMapTbl;
	}

	public void setPlumberServiceMapTbl(PlumberServiceMapTbl plumberServiceMapTbl) {
		this.plumberServiceMapTbl = plumberServiceMapTbl;
	}

	public List<FeedbackTbl> getFeedbackTbls() {
		return this.feedbackTbls;
	}

	public void setFeedbackTbls(List<FeedbackTbl> feedbackTbls) {
		this.feedbackTbls = feedbackTbls;
	}

	public FeedbackTbl addFeedbackTbl(FeedbackTbl feedbackTbl) {
		getFeedbackTbls().add(feedbackTbl);
		feedbackTbl.setBookingServiceMapTbl(this);

		return feedbackTbl;
	}

	public FeedbackTbl removeFeedbackTbl(FeedbackTbl feedbackTbl) {
		getFeedbackTbls().remove(feedbackTbl);
		feedbackTbl.setBookingServiceMapTbl(null);

		return feedbackTbl;
	}

	public BookingServiceMapTbl(int id)
	{
		this.bookingServiceId = id;
	}
	
}
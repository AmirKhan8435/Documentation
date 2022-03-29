package project.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the service_info_tbl database table.
 * 
 */
@Entity
@Table(name="service_info_tbl")
@NamedQuery(name="ServiceInfoTbl.findAll", query="SELECT s FROM ServiceInfoTbl s")
public class ServiceInfoTbl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="service_id")
<<<<<<< HEAD
	@GeneratedValue(strategy =GenerationType.IDENTITY )
=======
>>>>>>> 9d61d01ce58d46e9d745c92c5b0981315d826b8f
	private int serviceId;

	@Column(name="service_amount")
	private double serviceAmount;

	@Column(name="service_description")
	private String serviceDescription;

	@Lob
	@Column(name="service_image")
	private byte[] serviceImage;

	@Column(name="service_name")
	private String serviceName;

	//bi-directional many-to-one association to PlumberServiceMapTbl
	@OneToMany(mappedBy="serviceInfoTbl")
	private List<PlumberServiceMapTbl> plumberServiceMapTbls;

	public ServiceInfoTbl() {
	}

	public int getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public double getServiceAmount() {
		return this.serviceAmount;
	}

	public void setServiceAmount(double serviceAmount) {
		this.serviceAmount = serviceAmount;
	}

	public String getServiceDescription() {
		return this.serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

	public byte[] getServiceImage() {
		return this.serviceImage;
	}

	public void setServiceImage(byte[] serviceImage) {
		this.serviceImage = serviceImage;
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public List<PlumberServiceMapTbl> getPlumberServiceMapTbls() {
		return this.plumberServiceMapTbls;
	}

	public void setPlumberServiceMapTbls(List<PlumberServiceMapTbl> plumberServiceMapTbls) {
		this.plumberServiceMapTbls = plumberServiceMapTbls;
	}

	public PlumberServiceMapTbl addPlumberServiceMapTbl(PlumberServiceMapTbl plumberServiceMapTbl) {
		getPlumberServiceMapTbls().add(plumberServiceMapTbl);
		plumberServiceMapTbl.setServiceInfoTbl(this);

		return plumberServiceMapTbl;
	}

	public PlumberServiceMapTbl removePlumberServiceMapTbl(PlumberServiceMapTbl plumberServiceMapTbl) {
		getPlumberServiceMapTbls().remove(plumberServiceMapTbl);
		plumberServiceMapTbl.setServiceInfoTbl(null);

		return plumberServiceMapTbl;
	}

}
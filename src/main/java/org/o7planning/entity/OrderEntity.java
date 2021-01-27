package org.o7planning.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class OrderEntity extends BaseEntity {

	@ManyToOne
	@JoinColumn(name = "id_student")
	private StudentEntity student;

	@Column(name = "totalPrice")
	private Long total_price;

	@Column(name = "status")
	private String status;
	
	@OneToMany(mappedBy = "orders")
	private List<OrderDetailEntity> order_details = new ArrayList<>();

	public OrderEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public StudentEntity getStudent() {
		return student;
	}



	public void setStudent(StudentEntity student) {
		this.student = student;
	}



	public Long getTotalPrice() {
		return total_price;
	}

	public void setTotalPrice(Long totalPrice) {
		this.total_price = totalPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}

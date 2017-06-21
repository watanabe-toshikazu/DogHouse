package jp.co.comnic.javalesson.dog_house.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the BOOK_ORDER database table.
 * 
 */
@Entity
@Table(name="BOOK_ORDER")
@NamedQuery(name="BookOrder.findAll", query="SELECT b FROM BookOrder b")
public class BookOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="order_number")
	private int orderNumber;

	@Temporal(TemporalType.DATE)
	@Column(name="order_date")
	private Date orderDate;

	//bi-directional many-to-one association to Account
	@ManyToOne
	@JoinColumn(name="email", updatable=false, insertable=false)
	private Account account;

	//bi-directional many-to-one association to Card
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="card_sequence", referencedColumnName="sequence"),
		@JoinColumn(name="email", referencedColumnName="email")
		})
	private Card card;

	//bi-directional many-to-one association to OrderDetail
	@OneToMany(mappedBy="bookOrder")
	private List<OrderDetail> orderDetails;

	public BookOrder() {
	}

	public int getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Card getCard() {
		return this.card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public List<OrderDetail> getOrderDetails() {
		return this.orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public OrderDetail addOrderDetail(OrderDetail orderDetail) {
		getOrderDetails().add(orderDetail);
		orderDetail.setBookOrder(this);

		return orderDetail;
	}

	public OrderDetail removeOrderDetail(OrderDetail orderDetail) {
		getOrderDetails().remove(orderDetail);
		orderDetail.setBookOrder(null);

		return orderDetail;
	}

}
package dog_house;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the REVIEW database table.
 * 
 */
@Entity
@NamedQuery(name="Review.findAll", query="SELECT r FROM Review r")
public class Review implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String isbn;

	@Column(name="best_uses")
	private String bestUses;

	@Column(name="bottom_line")
	private byte bottomLine;

	private String comments;

	private String cons;

	@Column(name="describe_yourself")
	private String describeYourself;

	private byte[] email;

	private String headline;

	@Lob
	private byte[] image;

	private String nickname;

	private String pros;

	private int rating;

	@Column(name="service_delivery_comments")
	private String serviceDeliveryComments;

	@Lob
	private byte[] video;

	@Column(name="your_location")
	private String yourLocation;

	//bi-directional one-to-one association to Book
	@OneToOne
	@JoinColumn(name="isbn")
	private Book book;

	public Review() {
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getBestUses() {
		return this.bestUses;
	}

	public void setBestUses(String bestUses) {
		this.bestUses = bestUses;
	}

	public byte getBottomLine() {
		return this.bottomLine;
	}

	public void setBottomLine(byte bottomLine) {
		this.bottomLine = bottomLine;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getCons() {
		return this.cons;
	}

	public void setCons(String cons) {
		this.cons = cons;
	}

	public String getDescribeYourself() {
		return this.describeYourself;
	}

	public void setDescribeYourself(String describeYourself) {
		this.describeYourself = describeYourself;
	}

	public byte[] getEmail() {
		return this.email;
	}

	public void setEmail(byte[] email) {
		this.email = email;
	}

	public String getHeadline() {
		return this.headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public byte[] getImage() {
		return this.image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPros() {
		return this.pros;
	}

	public void setPros(String pros) {
		this.pros = pros;
	}

	public int getRating() {
		return this.rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getServiceDeliveryComments() {
		return this.serviceDeliveryComments;
	}

	public void setServiceDeliveryComments(String serviceDeliveryComments) {
		this.serviceDeliveryComments = serviceDeliveryComments;
	}

	public byte[] getVideo() {
		return this.video;
	}

	public void setVideo(byte[] video) {
		this.video = video;
	}

	public String getYourLocation() {
		return this.yourLocation;
	}

	public void setYourLocation(String yourLocation) {
		this.yourLocation = yourLocation;
	}

	public Book getBook() {
		return this.book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

}
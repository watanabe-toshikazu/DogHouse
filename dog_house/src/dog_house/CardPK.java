package dog_house;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CARD database table.
 * 
 */
@Embeddable
public class CardPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private String email;

	private int sequence;

	public CardPK() {
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSequence() {
		return this.sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CardPK)) {
			return false;
		}
		CardPK castOther = (CardPK)other;
		return 
			this.email.equals(castOther.email)
			&& (this.sequence == castOther.sequence);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.email.hashCode();
		hash = hash * prime + this.sequence;
		
		return hash;
	}
}